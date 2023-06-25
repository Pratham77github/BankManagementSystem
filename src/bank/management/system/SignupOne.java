
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.SQLException;

public class SignupOne extends JFrame  implements ActionListener{
    
    long random;
    JTextField nameTextField , fnameTextField , emailTextField , addressTextField , cityTextField , stateTextField , pincodeTextField,acoountnoTextField,accpinTextField,balanceTextField;
    JButton submit;
   JRadioButton male , female , other , married , unmarried;
   JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway" , Font.BOLD , 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personaldetails = new JLabel(" Personal Details");
        personaldetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        personaldetails.setBounds(320,80,300,40);
        add(personaldetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway" , Font.BOLD , 20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name  :");
        fname.setFont(new Font("Raleway" , Font.BOLD , 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway" , Font.BOLD , 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway" , Font.BOLD , 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        
          female = new JRadioButton("Female");
        female.setBounds(400,290,100,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
         gendergroup.add(female);
        
        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway" , Font.BOLD , 20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel mstatus = new JLabel("Marital Status :");
        mstatus.setFont(new Font("Raleway" , Font.BOLD , 20));
        mstatus.setBounds(100,390,200,30);
        add(mstatus);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
          unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(400,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
         other = new JRadioButton("Others");
        other.setBounds(500,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup mstatusgroup = new ButtonGroup();
         mstatusgroup.add(married);
         mstatusgroup.add(unmarried);
         mstatusgroup.add(other);
         
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway" , Font.BOLD , 20));
        address.setBounds(100,440,200,30);
        add(address);
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway" , Font.BOLD , 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway" , Font.BOLD , 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("PIN Code :");
        pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        //
        // acc no.
        
        JLabel accountno = new JLabel("Account No :");
        accountno.setFont(new Font("Raleway" , Font.BOLD , 20));
        accountno.setBounds(100,640,200,30);
        add(accountno);
        
        acoountnoTextField = new JTextField();
        acoountnoTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        acoountnoTextField.setBounds(300,640,400,30);
        add(acoountnoTextField);
        
        //acc pin
        
        JLabel accpin= new JLabel("Account PIN :");
        accpin.setFont(new Font("Raleway" , Font.BOLD , 20));
        accpin.setBounds(100,690,200,30);
        add(accpin);
        
        accpinTextField = new JTextField();
        accpinTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        accpinTextField.setBounds(300,690,400,30);
        add(accpinTextField);
        
        
        
        setSize(850,810);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
        
         submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(620,730,80,30);
        submit.addActionListener(this);
        add(submit);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno =  "" + random;
        String name = nameTextField.getText();
         String fname = fnameTextField.getText();
         String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = "null";
         if(male.isSelected()){
             gender = "Male";
         }
         else if(female.isSelected()){
             gender = "Female";
         }
         String email = emailTextField.getText();
         String marital = "null";
         if(married.isSelected()){
             marital = "Married";
         }
         else if(unmarried.isSelected()){
             marital = "Unmarried";
         }
         else if(other.isSelected()){
             marital = "Others";
         }
         String address = addressTextField.getText();
         String city = cityTextField.getText();
         String state = stateTextField.getText();
         String pin = pincodeTextField.getText();
         //
         String accno = acoountnoTextField.getText();
         String accpin = accpinTextField.getText();
         //
         
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else if(accno.equals("")){
                JOptionPane.showMessageDialog(null, "Account No. is required");
            }
            else if(accpin.equals("")){
                JOptionPane.showMessageDialog(null, "Account PIN is required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values (' "+formno+" ' , ' "+name+"  ' , ' "+fname+"  ' , ' " +dob+"  ' , ' "+gender+" ' , ' "+email+"  ' , ' "+marital+"  ' , ' "+address+"  ' , ' "+city+" ' , ' "+state+" ' , ' "+pin+" ' ,' "+accno+" ',' "+accpin+" ')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created");
                setVisible(false);
                new Login().setVisible(true);
            
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        SignupOne signupOne = new SignupOne();
    }
}
