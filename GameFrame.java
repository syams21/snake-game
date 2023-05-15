import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // GameFrame() {
    //     GamePanel gamePanel = new GamePanel();
    //     gamePanel.setFocusable(true);
    //     gamePanel.requestFocus(); // Meminta fokus keyboard pada panel permainan

    //     this.add(gamePanel);
    //     this.setTitle("Snake Game");
    //     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     this.setResizable(false);
    //     this.pack();
    //     this.setVisible(true);
    //     this.setLocationRelativeTo(null);
    // }

    // public static void main(String[] args) {
    //     new GameFrame();
    // }
}
