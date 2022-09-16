package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    private JFrame window;
    private JTextArea messageText;
    private List<JPanel> bgPanel;
    private List<JLabel> bgLabel;

    public GUI() {
        bgPanel = new ArrayList<>();
        bgLabel = new ArrayList<>();

        createMainField();
        generateScreen();

        window.setVisible(true);
    }

    public void createMainField() {
        window = new JFrame();
        // window size should be:
        // width = width of background image,
        // height = height of image + chat bar + UI
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
//        window.setLayout(null);

        messageText = new JTextArea("----THIS IS SOME SAMPLE TEXT----");
        messageText.setBounds(50, 400, 700, 150);
        messageText.setBackground(Color.BLUE);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);
        // TODO Henry add the following code to test background picture.
        window.setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("/GUI/pages/intro.jpg"));
        window.add(background);
        background.setLayout(new FlowLayout());
//        l1=new JLabel("Here is a button");
//        b1=new JButton("I am a button");
//        background.add(l1);
//        background.add(b1);
        // TODO Henry background code ends here.
    }

    /**
     * TODO: create/load all the backgrounds and labels into their containers, set required fields,
     *  add to the window for display
     */
    public void createBackground(int bgNum, String bgFileName) {

        bgPanel.add(new JPanel());
        bgPanel.get(0).setBounds(50, 50, 700, 350);
        bgPanel.get(0).setBackground(Color.BLUE);
        bgPanel.get(0).setLayout(null);
        window.add(bgPanel.get(0));

        bgLabel.add(new JLabel());
        bgLabel.get(0).setBounds(0, 0, 100, 350);

        // TODO: Load Image Icon with class resource loader

        //------------

    }

    /**
     * TODO: create objects that can be added to the background as interactive items.
     */
    public void createObject(int objx, int objy, int objWidth, int objHeight, String objFileName,
                             String choice1Name, String choice2Name, String choice3Name) {

        // CREATE POPUP MENU
        JPopupMenu popupMenu = new JPopupMenu();

        // CREATE POPUP MENU ITEMS
        JMenuItem menuItem[] = new JMenuItem[4];
        menuItem[1] = new JMenuItem();

        menuItem[1] = new JMenuItem(choice1Name);
        popupMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);
        popupMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice3Name);
        popupMenu.add(menuItem[3]);

        // CREATE 1 OBJECT - Start
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(400, 150, 200, 200);

        /** TODO: Load Image Icon with class resource loader
         * ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(FileName));
         * objectLabel.setIcon(objectIcon);
         * to ensure to object will show we have to layer the containers properly.
         * Object gets placed into background panel, then the background*/

        // CREATE MOUSE LISTENER AND ATTACH MENU
        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                    popupMenu.show(objectLabel, e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel.get(0).add(objectLabel);
        bgPanel.get(0).add(bgLabel.get(0));
        //---------------------
        // - End
    }

    public void generateScreen(){
        /** SCREEN1
         * createBackground(1, FileName for background);
         * create objects can be done as many times as we need objects
         * to be located on the screen
         * createObject(1, 400, 140, 200, 200, FileName to object, "throw", "pick", ect)*/


    }
}
