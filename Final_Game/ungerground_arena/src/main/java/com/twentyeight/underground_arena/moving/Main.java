package underground_arena.moving;

import com.twentyeight.underground_arena.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JPanel implements ActionListener {

    JFrame frame;
    public Main(JFrame frame){
        timer.start ();
        this.frame = frame;
        frame.addKeyListener (new KeyAdapter () {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                player.keyPressed (keyEvent);
            }
            @Override
            public void keyReleased(KeyEvent keyEvent){
                player.keyReleased (keyEvent);
            }
        });
    }

    Timer timer = new Timer (10, this);
    public void paint(Graphics graphics){
        Image image = new ImageIcon ("StoneWall.png").getImage ();
        graphics.drawImage (image, player.getMapX (), player.getMapY (), frame.getWidth (), frame.getHeight (), null);
    }

    Player player = new Player ();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
        player.move ();
    }
}