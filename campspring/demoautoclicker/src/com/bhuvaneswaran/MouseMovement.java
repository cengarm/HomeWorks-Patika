package com.bhuvaneswaran;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class robomouse1 extends Frame implements ActionListener {
    // Frame
    static JFrame f;

    // textField
    static TextField x, y, x1, y1, x2, y2, x3, y3;

    // default constructor
    robomouse1()
    {
    }

    // main function
    public static void main(String args[])
    {
        // object of class
        robomouse1 rm = new robomouse1();

        // create a frame
        f = new JFrame("Okey Botu");

        // set the frame to close on exit
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create textfield
        x = new TextField(7);
        y = new TextField(7);

        x1 = new TextField(7);
        y1 = new TextField(7);

        x2 = new TextField(7);
        y2 = new TextField(7);

        x3 = new TextField(7);
        y3 = new TextField(7);

        // create a button
        Button b = new Button("OK");

        // add actionListener
        b.addActionListener(rm);


        // create a panel
        Panel p = new Panel();

        // create labels
        Label l, l1,l2,l3;

        l = new Label("         from");
        l1 = new Label("to");
        l2 = new Label("                                       burdan");
        l3 = new Label("şuraya");

        // add items to panel
        p.add(l);
        p.add(x);
        p.add(y);
        p.add(l1);
        p.add(x1);
        p.add(y1);
        p.add(b);
        p.add(l2);
        p.add(x2);
        p.add(y2);
        p.add(l3);
        p.add(x3);
        p.add(y3);
        p.add(b);


        f.add(p);

        // setsize of frame
        f.setSize(600, 300);

        f.show();
    }

    // if button is pressed
    public void actionPerformed(ActionEvent e)
    {
        try {
            Robot r = new Robot();
            int xi, yi, xi1, yi1, xi2, yi2, xi3, yi3;

            // get x and y points
            xi = Integer.parseInt(x.getText());
            yi = Integer.parseInt(y.getText());
            xi1 = Integer.parseInt(x1.getText());
            yi1 = Integer.parseInt(y1.getText());
            xi2 = Integer.parseInt(x2.getText());
            yi2 = Integer.parseInt(y2.getText());
            xi3 = Integer.parseInt(x3.getText());
            yi3 = Integer.parseInt(y3.getText());


            // move the mouse to that point
            r.mouseMove(xi, yi);

            // press the mouse
            //r.mousePress(InputEvent.BUTTON1_MASK);

            int i = xi, j = yi;

            // slowly drag the mouse to defined location
            while (i < xi1 || j < yi1) {
                // move the mouse to the other point
                r.mouseMove(i, j);

                if (i < xi1)
                    i++;
                if (j < yi1)
                    j++;

                // wait
                Thread.sleep(3);
            }

            // wait
            Thread.sleep(40);

            // press the mouse
            //r.mouseRelease(InputEvent.BUTTON1_MASK);


            r.mouseMove(xi1, yi1);
            // slowly drag the mouse to defined location
            while (i < xi2 || j < yi2) {
                // move the mouse to the other point
                r.mouseMove(i, j);

                if (i < xi2)
                    i++;
                if (j < yi2)
                    j++;

                // wait
                Thread.sleep(3);
            }

            // wait
            Thread.sleep(40);

            // press the mouse
           // r.mouseRelease(InputEvent.BUTTON1_MASK);
        }

        catch (Exception evt) {
            System.err.println(evt.getMessage());
        }
    }
}
