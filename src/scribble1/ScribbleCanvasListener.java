package scribble1;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Author: Cesar Valenzuela
 * Date: 6/8/2018
 * Course:
 * Assignment:
 * Instructor:
 * T.A:
 */
public class ScribbleCanvasListener implements MouseListener, MouseMotionListener {

    protected ScribbleCanvas canvas;

    public ScribbleCanvasListener(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        canvas.mouseButtonDown = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        if (canvas.mouseButtonDown) {
            canvas.getGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
            canvas.x = p.x;
            canvas.y = p.y;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
