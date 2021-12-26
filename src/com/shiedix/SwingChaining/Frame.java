package com.shiedix.SwingChaining;

import javax.swing.JFrame;
import java.awt.Color;

public class Frame extends JFrame
{
    public Frame set_default_close_operation(int operation)
    {
        this.setDefaultCloseOperation(operation);
        return this;
    }
    public Frame set_size(int width, int height)
    {
        this.setSize(width, height);
        return this;
    }
    public Frame set_location(int x, int y)
    {
        this.setLocation(x, y);
        return this;
    }
    public Frame set_resizable(boolean resizable)
    {
        this.setResizable(resizable);
        return this;
    }
    public Frame set_visible(boolean b)
    {
        this.setVisible(b);
        return this;
    }
    public Frame set_undecorated(boolean undecorated)
    {
        this.setUndecorated(undecorated);
        return this;
    }
    public Frame set_background(Color bgColor)
    {
        this.setBackground(bgColor);
        return this;
    }
}
