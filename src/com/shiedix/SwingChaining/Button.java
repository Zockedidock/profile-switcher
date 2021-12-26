package com.shiedix.SwingChaining;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Button extends JButton
{
    public Button()
    {
        this(null, null);
    }
    public Button(Icon icon)
    {
        this(null, icon);
    }
    public Button(String text, Icon icon)
    {
        setModel(new DefaultButtonModel());
        init(text, icon);
    }
    public Button(String text)
    {
        this.setText(text);
    }
    public Button(Action a)
    {
        this();
        setAction(a);
    }

    public Button add_action_listener(ActionListener l)
    {
        this.addActionListener(l);
        return this;
    }
    public Button set_bounds(int x, int y, int width, int height)
    {
        this.setBounds(x, y, width, height);
        return this;
    }
    public Button set_background(Color bg)
    {
        this.setBackground(bg);
        return this;
    }
    public Button set_text(String text)
    {
        this.setText(text);
        return this;
    }
    public Button update_UI() {
        this.updateUI();
        return this;
    }
    public Button set_border(Border border) {
        this.setBorder(border);
        return this;
    }
    public synchronized Button add_mouse_listener(MouseListener l) {
        this.addMouseListener(l);
        return this;
    }
}
