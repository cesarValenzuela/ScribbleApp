package scribble1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.Toolkit.getDefaultToolkit;

/**
 * Author: Cesar Valenzuela
 * Date: 6/8/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class Scribble extends JFrame {

    protected ScribbleCanvas canvas;

    public Scribble() {
        setTitle("Scribble Pad");
        canvas = new ScribbleCanvas();
        canvas.setBackground(Color.white);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(canvas, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        int width = 600;
        int height = 400;
        JFrame frame = new Scribble();
        frame.setSize(width,height);
        Dimension screenSize = getDefaultToolkit().getScreenSize();
        // place the application frame at the center of the screen
        frame.setLocation(screenSize.width/2 - width/2, screenSize.height/2 - height/2);
        frame.setVisible(true);
        System.out.println("git check message");
    }
}
