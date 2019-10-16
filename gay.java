import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import java.util.Date;
import java.text.*;
/**
 * Chatbot
 *
 * @Adam 16/09/2019
 * @v1
 */

public class gay{
    private String chatbox_buffer;





    public static void main(String args[]){


        JFrame frame = new JFrame("Welcome to Chatbot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        frame.setVisible(true);
        JTextArea ta = new JTextArea();
        JButton send = new JButton("Send");
        JTextField tf = new JTextField(100);


        JLabel label = new JLabel("Enter Text");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        GridLayout experimentLayout = new GridLayout(0,2);

        JPanel panel = new JPanel(); // the panel is not visible in output
        panel.setLayout(experimentLayout);
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        frame.setBackground(new Color (255, 200, 0));
        frame.setVisible(true);

        Scanner input = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hey, Whats your name?");
        String Name = myObj.nextLine();
        System.out.println("Well hello " + Name + " How old are you?");



        String Age = myObj.nextLine();
        int parsedAge = Integer.parseInt(Age);
        if (parsedAge < 18){
            System.out.println("wow your " + Age + " years young!");
        }else{
            System.out.println("wow your " + Age + " years ancient!");
        }




        System.out.println("wow your " + Age + " years young!");
        System.out.println("so " + Name + " what colour is your hair");
        String colour =  myObj.nextLine();
        if(colour.equals("blond")){
            System.out.printf("oh look an aryan\n");
        }else
        {
            System.out.printf("oh %s hair is ugly\n", colour);
        }





    }
}