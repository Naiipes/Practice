import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JPanel implements KeyListener, Runnable {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 100;

    private final ArrayList<Point> snake;
    private Point food;
    private char direction = 'R'; // Initial direction: Right
    private boolean running = false;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        snake = new ArrayList<>();
        snake.add(new Point(0, 0)); // Initial snake position
        spawnFood();
        running = true;
    }

    private void spawnFood() {
        Random random = new Random();
        int x = random.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE;
        int y = random.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE;
        food = new Point(x, y);

        // Ensure food doesn't spawn on the snake
        for (Point body : snake) {
            if (food.equals(body)) {
                spawnFood();
                return;
            }
        }
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head);

        switch (direction) {
            case 'U' -> newHead.y -= UNIT_SIZE;
            case 'D' -> newHead.y += UNIT_SIZE;
            case 'L' -> newHead.x -= UNIT_SIZE;
            case 'R' -> newHead.x += UNIT_SIZE;
        }

        // Check for collisions
        if (newHead.x < 0 || newHead.x >= WIDTH || newHead.y < 0 || newHead.y >= HEIGHT) {
            running = false;
            return;
        }

        for (Point body : snake) {
            if (newHead.equals(body)) {
                running = false;
                return;
            }
        }

        snake.add(0, newHead);

        // Check if snake eats food
        if (newHead.equals(food)) {
            spawnFood();
        } else {
            snake.remove(snake.size() - 1); // Remove tail
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (running) {
            // Draw food
            g.setColor(Color.RED);
            g.fillRect(food.x, food.y, UNIT_SIZE, UNIT_SIZE);

            // Draw snake
            for (Point body : snake) {
                g.setColor(Color.GREEN);
                g.fillRect(body.x, body.y, UNIT_SIZE, UNIT_SIZE);
            }
        } else {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> {
                if (direction != 'D') direction = 'U';
            }
            case KeyEvent.VK_DOWN -> {
                if (direction != 'U') direction = 'D';
            }
            case KeyEvent.VK_LEFT -> {
                if (direction != 'R') direction = 'L';
            }
            case KeyEvent.VK_RIGHT -> {
                if (direction != 'L') direction = 'R';
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void run() {
        while (running) {
            move();
            repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new Thread(game).start();
    }
}