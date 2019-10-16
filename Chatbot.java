import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.*;
import java.text.*;
/**
 * Chatbot
 *
 * @Adam 16/09/2019
 * @v1
 */

public class Chatbot{
      
      private String colour;
      private String age;
      private String name;
    
 

     
      public static void main(String args[]){
        /*
          
       JFrame frame = new JFrame("Welcome to Chatbot");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,600);
      
       frame.setVisible(true);
        JTextArea ta = new JTextArea();
       JButton send = new JButton("Send");
        JTextField tf = new JTextField (100);
       
       
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
        JPanel panel = new JPanel(); // the panel is not visible in output
        GridLayout experimentLayout = new GridLayout(0,2);
        JButton reset = new JButton("Reset");
         panel.setLayout(experimentLayout);
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
           */
          
        Scanner input = new Scanner(System.in);
         Scanner myObj = new Scanner(System.in);        
         System.out.println("Hey, Whats your name?");  
          String Name = myObj.nextLine();
         System.out.println("Well hello  " + Name + " How old are you? ");
        
        
        
        
         int nordsAge = 50;

        String nordsName = "";

        boolean nordsMale = true;

        int maxPintsCanDrink = 60;



        Northerner adam = new Northerner(nordsAge, nordsName, nordsMale, 0);


           
        // add alcoholism

        adam.setMaxPints(maxPintsCanDrink);

      

    


        
        
        
        
         
             int myAge = 50;

        String myName = "jeff";

        boolean amMale = true ;
       
           Person aPerson = new Person(myAge, myName, amMale);
         
           
         String Age = myObj.nextLine();
           
        int parsedAge = Integer.parseInt(Age);
        if (parsedAge < 18){
            System.out.println("wow your young");
        }else{
            System.out.println("wow your ancient");
        }

         
         
         
        System.out.println("so " + Name + " what colour is your hair");
        String colour =  myObj.nextLine();
        if(colour.equals("blonde")){
            System.out.printf("oh look an aryan");
        }else
        {
            System.out.printf("oh boring hair, hair is ugly", colour);
        }
          
         System.out.println(" so what's your favourite flavour of ice cream?") ;
         String flavour = myObj.nextLine();
         {
         
             if(flavour.equals("vanilla")) {
                 System.out.println("ahhh a man after my own heart " + Name + " so i  see you are "+Age+ " what's that like?");
                 String Decision = myObj.nextLine();
             System.out.println("u gay");
                }
             
             else {
             System.out.println("meh normie, so whats it like being " + Age );
             String Decision = myObj.nextLine();
             System.out.println("u gay");
            
       
        }
        
        
         System.out.println("how wouldst though rate destiny as a franchise out of 10");
    Scanner in = new Scanner (System.in);
     
    
     int msg = in.nextInt();
    
      boolean loop = true;
    
     {    switch (msg) {   

         
         
         
         
         case 1:        System.out.println("prolly never reached lvl 20");       
        break;      
        case 2:        System.out.println("prolly never killed oryx");      
        break;      
        case 3:        System.out.println("crota prolly clapped ur da");       
        break;      
        case 4:        System.out.println("lmao u prolly didnt reach max lvl");       
       break;      
       case 5:        System.out.println("ur light lvl low af");        
        break;      
        case 6:        System.out.println("prolly only played d1");      
        break;      
        case 7:        System.out.println("i bet u never played rise of iron");       
        break;           
        
        case 8: System.out.println("u ever playerd wrath?");
        break;
        
        case 9: System.out.println("who tf r u dato?");
        break;
        case 10: System.out.println("is this the legend himself?");
        break;
      default:   System.out.println("that wasnt one of the choices dingbat"); 
    
      } 
  }
}

        /*
        int[] anArray;
        
         anArray = new int[10];
         
         
         
         
       
 
               
        int array_numbers[];
        
        anArray[1] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;
        anArray[5] = 6;
        anArray[6] = 7;
        anArray[7] = 8;
        anArray[8] = 9;
        anArray[9] = 10;
        
        int[] arr = new int[10];
        int pos = 0;
        Scanner in = new Scanner(System.in);
        while (pos < 10) {
      
        int a = in.nextInt();
        if (1 > 0 && 1 <= 10) arr[pos++] = 1;
        
        

    

       
         anArray[0] = 1;
        
         if
         (2 > 1 && 1 <= 10) arr[pos++] = 2;
         System.out.println("you boring fooka");
        anArray[1] = 2;
        System.out.println("meh u prolly like cod");
        
     
        */
        //Person genericPerson = new Person();
        //System.out.println(genericPerson.getName());
        
    }}
     
    
    
    

        
    


    

        
        
    
   
    
               
       
                
     
    

         