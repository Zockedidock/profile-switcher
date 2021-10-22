package com.shiedix.firefox;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JFrame
{
    public int height = 200;
    public int width = 420;
    public int entertainmentXpos = 25;
    public int homeworkXpos = 225;
    public int textYpos = 175;

    public Color buttonColor = new Color(238, 238, 238);

    Container cp;
    Runtime process = Runtime.getRuntime();

    Main()
    {
        super();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(width, height);
        // Window will appear in the Center
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) /2;
        int y = (d.height - getSize().height) /2;
        this.setLocation(x, y);
        //
        this.setResizable(false);
        cp = getContentPane();
        cp.setLayout(null);
        // Disable Title-bar
        this.setUndecorated(true);
        this.setBackground(Color.WHITE);
        mainUI();
        try {
            Image img = ImageIO.read(getClass().getClassLoader().getResource("firefox-logo.png"));
            this.setIconImage(img);
        } catch (Exception e) {System.out.println("ERROR:" + e);}
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Main();
    }

    public void mainUI()
    {
        JLabel test = new JLabel();
        test.setBounds(5, 0, 167, 20);
        test.setText("Welcome!");
        test.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        this.cp.add(test);
        // Entertainment-Button
        JButton bEntertainment;
        BufferedImage entertainmentIcon;
        try {
            entertainmentIcon = ImageIO.read(getClass().getClassLoader().getResource("Entertainment.png"));
            bEntertainment = new JButton(new ImageIcon(entertainmentIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bEntertainment.setBounds(entertainmentXpos, 25, 150, 150);
            bEntertainment.setBorder(BorderFactory.createEmptyBorder());
            bEntertainment.setBackground(buttonColor);
            bEntertainment.addActionListener(this::bEntertainment_ActionPerformed);
            this.cp.add(bEntertainment);
        } catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        JLabel lEntertainment = new JLabel("", SwingConstants.CENTER);
        lEntertainment.setBounds(entertainmentXpos, textYpos, 150, 25);
        lEntertainment.setText("Entertainment");
        cp.add(lEntertainment);
        /*
            Homework-Button
        */
        JButton bHomework;
        BufferedImage homeworkIcon;
        try {
            homeworkIcon = ImageIO.read(getClass().getClassLoader().getResource("Homework.png"));
            bHomework = new JButton(new ImageIcon(homeworkIcon.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH )));
            bHomework.setBounds(homeworkXpos, 25, 150, 150);
            bHomework.setBorder(BorderFactory.createEmptyBorder());
            bHomework.setBackground(buttonColor);
            bHomework.addActionListener(this::bHomework_ActionPerformed);
            this.cp.add(bHomework);
        } catch (Exception e) {System.out.println("ERROR:" + e);}
        // Entertainment text
        JLabel lHomework = new JLabel("", SwingConstants.CENTER);
        lHomework.setBounds(homeworkXpos, textYpos, 150, 25);
        lHomework.setText("Homework");
        cp.add(lHomework);
    }

    public void bHomework_ActionPerformed(ActionEvent evt)
    {
        try {
            process.exec("firefox -p Homework");
        } catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
    public void bEntertainment_ActionPerformed(ActionEvent evt)
    {
        try {
            process.exec("firefox -p Entertainment");
        } catch (IOException e) { System.out.println("ERROR " + e); }
        this.dispose();
        System.exit(0);
    }
}