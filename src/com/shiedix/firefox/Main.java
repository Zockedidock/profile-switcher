package com.shiedix.firefox;

import com.shiedix.SwingChaining.Button;
import com.shiedix.SwingChaining.Frame;
import com.shiedix.SwingChaining.Label;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Main extends Frame
{
    public final int HEIGHT   = 400;
    public final int WIDTH    = 420;
    public final int ENTXPOS  = 25;
    public final int HOMEXPOS = 225;
    public final int TEXTYPOS = 175;

    public final Color BUTTONCOLOR      = new Color(1, 1, 1, 0);
    public final Color BUTTONHOVERCOLOR = new Color(0, 0,0, 80);
    public final Color TEXTCOLOR        = new Color(255, 255, 255);
    public final Color BACKGROUNDCOLOR  = new Color(0, 0, 0, 90);

    public Button bEntertainment;
    public Button bHomework;

    Container cp;
    Runtime process;

    Main()
    {
        super();
        this.process = Runtime.getRuntime();
        try
        {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            ex.printStackTrace();
        }
        // Window will appear in the Center
        var d = Toolkit.getDefaultToolkit().getScreenSize();
        var x = (d.width - getSize().width) / 13;
        var y = 43;
        this.set_default_close_operation(WindowConstants.DISPOSE_ON_CLOSE)
            .set_size(WIDTH, HEIGHT)
            .set_location(x, y)
        //
            .set_resizable(false)
            .set_undecorated(true)
            .set_background(BACKGROUNDCOLOR);
        cp = getContentPane();
        cp.setLayout(null);
        //

        row1();
        row2(TEXTYPOS + 20);
        try
        {
            Image img = ImageIO.read(getClass().getClassLoader().getResource("firefox-logo.png"));
            this.setIconImage(img);
        }
        catch (Exception e) {System.out.println("ERROR:" + e);}
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Main();
    }

    public void row1()
    {
        Label test = new Label();
        test.set_bounds(5, 0, 167, 20)
            .set_text("Firefox:")
            .set_foreground(TEXTCOLOR)
            .set_cursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        cp.add(test);
        // Entertainment-Button
        BufferedImage entertainmentIcon;
        try
        {
            entertainmentIcon = ImageIO.read(getClass().getClassLoader().getResource("Entertainment.png"));
            bEntertainment = new Button(new ImageIcon(entertainmentIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bEntertainment.set_bounds(ENTXPOS, 25, 150, 150)
                          .set_border(BorderFactory.createEmptyBorder())
                          .set_background(BUTTONCOLOR)
                          .add_action_listener(this::bEntertainment_ActionPerformed)
                          .add_mouse_listener(new ButtonMouseAdapter(bEntertainment));
            cp.add(bEntertainment);
        }
        catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        Label lEntertainment = new Label("", SwingConstants.CENTER);
        lEntertainment.set_bounds(ENTXPOS, TEXTYPOS, 150, 25)
                      .set_text("Entertainment")
                      .set_foreground(TEXTCOLOR);
        cp.add(lEntertainment);
        /*
            Homework-Button
        */

        BufferedImage homeworkIcon;
        try
        {
            homeworkIcon = ImageIO.read(getClass().getClassLoader().getResource("Homework.png"));
            bHomework = new Button(new ImageIcon(homeworkIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bHomework.set_bounds(HOMEXPOS, 25, 150, 150)
                     .set_border(BorderFactory.createEmptyBorder())
                     .set_background(BUTTONCOLOR)
                     .add_action_listener(this::bHomework_ActionPerformed)
                     .add_mouse_listener(new ButtonMouseAdapter(bHomework));
            cp.add(bHomework);
        }
        catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        Label lHomework = new Label("", SwingConstants.CENTER);
        lHomework.set_bounds(HOMEXPOS, TEXTYPOS, 150, 25)
                 .set_text("Homework")
                 .set_foreground(TEXTCOLOR);
        cp.add(lHomework);
    }

    public void row2(int p)
    {
        Label test = new Label();
        test.set_bounds(5, 0 + p, 167, 20)
            .set_text("Brave:")
            .set_foreground(TEXTCOLOR)
            .set_cursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        cp.add(test);
        // Entertainment-Button
        BufferedImage entertainmentIcon;
        try
        {
            entertainmentIcon = ImageIO.read(getClass().getClassLoader().getResource("Entertainment.png"));
            bEntertainment = new Button(new ImageIcon(entertainmentIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bEntertainment.set_bounds(ENTXPOS, 25 + p, 150, 150)
                          .set_border(BorderFactory.createEmptyBorder())
                          .set_background(BUTTONCOLOR)
                          .add_action_listener(this::bBraveEntertainment_ActionPerformed)
                          .add_mouse_listener(new ButtonMouseAdapter(bEntertainment));
            cp.add(bEntertainment);
        }
        catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        Label lEntertainment = new Label("", SwingConstants.CENTER);
        lEntertainment.set_bounds(ENTXPOS, TEXTYPOS + p, 150, 25)
                      .set_text("Entertainment")
                      .set_foreground(TEXTCOLOR);
        cp.add(lEntertainment);
        /*
            Homework-Button
        */

        BufferedImage homeworkIcon;
        try
        {
            homeworkIcon = ImageIO.read(getClass().getClassLoader().getResource("Homework.png"));
            bHomework = new Button(new ImageIcon(homeworkIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bHomework.set_bounds(HOMEXPOS, 25 + p, 150, 150)
                     .set_border(BorderFactory.createEmptyBorder())
                     .set_background(BUTTONCOLOR)
                     .add_action_listener(this::bBraveHomework_ActionPerformed)
                     .add_mouse_listener(new ButtonMouseAdapter(bHomework));
            cp.add(bHomework);
        }
        catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        Label lHomework = new Label("", SwingConstants.CENTER);
        lHomework.set_bounds(HOMEXPOS, TEXTYPOS + p, 150, 25)
                 .set_text("Research")
                 .set_foreground(TEXTCOLOR);
        cp.add(lHomework);
    }

    public void bHomework_ActionPerformed(ActionEvent evt)
    {
        try
        {
            process.exec("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\" -p Homework");
        }
        catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
    public void bEntertainment_ActionPerformed(ActionEvent evt)
    {
        try
        {
            process.exec("\"C:\\Program Files\\Mozilla Firefox\\firefox.exe\" -p Entertainment");
        }
        catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
    /*
    public void bBraveHomework_ActionPerformed(ActionEvent evt)
    {
        try
        {
            process.exec("\"C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe\" --profile-directory=\"Profile 1\"");
        }
        catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
    public void bBraveEntertainment_ActionPerformed(ActionEvent evt)
    {
        try
        {
            process.exec("\"C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe\" --profile-directory=\"Default\"");
        }
        catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
    */
    public class ButtonMouseAdapter extends MouseAdapter
    {
        Button button;
        ButtonMouseAdapter(Button button)
        {
            this.button = button;
        }
        @Override
        public void mouseEntered(MouseEvent e)
        {
            button.setBackground(BUTTONHOVERCOLOR);
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            button.setBackground(new Color(0, 0, 0, 0));
        }
    }
}