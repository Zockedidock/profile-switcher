package com.shiedix.SwingChaining;

import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Cursor;
import java.awt.Color;

public class Label extends JLabel
{
    public Label(String text)
    {
        this.setText(text);
    }
    public Label()
    {
    }
    public Label(String text, int horizontalAlignment)
    {
        this(text, null, horizontalAlignment);
    }
    public Label(String text, Icon icon, int horizontalAlignment)
    {
        setText(text);
        setIcon(icon);
        setHorizontalAlignment(horizontalAlignment);
        updateUI();
        setAlignmentX(LEFT_ALIGNMENT);
    }
    public Label set_bounds(int x, int y, int width, int height)
    {
        this.setBounds(x, y, width, height);
        return this;
    }
    public Label set_background(Color bg)
    {
        this.setBackground(bg);
        return this;
    }
    public Label set_text(String text) {
        this.setText(text);
        return this;
    }
    public Label set_foreground(Color c) {
        this.setForeground(c);
        return this;
    }
    public Label set_cursor(Cursor cursor)
    {
        this.setCursor(cursor);
        return this;
    }
}
