package scribble1;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventListener;

/**
 * Author: Cesar Valenzuela
 * Date: 6/8/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class ScribbleCanvas extends JPanel {

    protected EventListener listener;
    protected boolean mouseButtonDown = false;
    protected int x, y;

    public ScribbleCanvas() {
        listener = new ScribbleCanvasListener(this);
        addMouseListener((MouseListener) listener);
        addMouseMotionListener((MouseMotionListener) listener);
    }
}
