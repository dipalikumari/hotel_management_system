
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception  extends JFrame implements ActionListener{
    
    JButton newcustmor, rooms,department,allemployee, managerinfo, custmors,searchroom, update, updateroom,pickup, checkout, logout;
    
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // new custmor 
        newcustmor= new JButton("New Custmoer Form");
        newcustmor.setBounds(10, 30, 200, 30);
        newcustmor.setBackground(Color.BLACK);
        newcustmor.setForeground(Color.WHITE);
        newcustmor.addActionListener(this);
        add(newcustmor);
        
        // rooms
        rooms= new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
        
        // department
        department= new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);
        
        // All Employee
        allemployee= new JButton("All Employee");
        allemployee.setBounds(10, 150, 200, 30);
        allemployee.setBackground(Color.BLACK);
        allemployee.setForeground(Color.WHITE);
        allemployee.addActionListener(this);
        add(allemployee);
        
        // Custmor Information
        custmors= new JButton("Custmor Info");
        custmors.setBounds(10, 190, 200, 30);
        custmors.setBackground(Color.BLACK);
        custmors.setForeground(Color.WHITE);
        custmors.addActionListener(this);
        add(custmors);
        
        // Manager Information
        managerinfo= new JButton("Manager Info");
        managerinfo.setBounds(10, 230, 200, 30);
        managerinfo.setBackground(Color.BLACK);
        managerinfo.setForeground(Color.WHITE);
        managerinfo.addActionListener(this);
        add(managerinfo);
        
        // checkout
        checkout= new JButton("Checkout");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);
        
        // update status
        update= new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        // update room status
        updateroom= new JButton("Update Room Status");
        updateroom.setBounds(10, 350, 200, 30);
        updateroom.setBackground(Color.BLACK);
        updateroom.setForeground(Color.WHITE);
        updateroom.addActionListener(this);
        add(updateroom);
        
        // Pickup Service
        pickup= new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);
        
        // Search Room
        searchroom= new JButton("Search Room");
        searchroom.setBounds(10, 430, 200, 30);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);
        
        // Logout
        logout= new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);
        
        
        // images
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);
        
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==newcustmor){
            setVisible(false);
            new AddCustmor();
        }else if(ae.getSource()==rooms){
            setVisible(false);
            new Room();
        }else if(ae.getSource()==department){
            setVisible(false);
            new Department();
        }else if(ae.getSource()==allemployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource()==managerinfo){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource()==custmors){
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource()==searchroom){
            setVisible(false);
            new SearchRoom();
        }else if(ae.getSource()==update){
            setVisible(false);
            new UpdateCheck();
        }else if(ae.getSource()==updateroom){
            setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource()==pickup){
            setVisible(false);
            new Pickup();
        }else if(ae.getSource()==checkout){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource()==logout){
            setVisible(false);
            System.exit(0);
            
        }
    }
    
    
    public static void main(String[] args){
        new Reception();
    }
}
