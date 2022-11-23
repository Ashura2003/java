import javax.swing.*;

public class registration {
    public static void main(String[] args) {

        //Creating Frame/Window
        JFrame Form=new JFrame("Registration Form");

        //Creating Labels

        JLabel studentDetails=new JLabel("Student Details");
        studentDetails.setBounds(100,50,200,20);

        JLabel name=new JLabel("Name :");
        name.setBounds(40,90,150,20);

        JLabel DOB=new JLabel("Date of birth :");
        DOB.setBounds(250,90,150,20);

        JLabel phone=new JLabel("Phone Number :");
        phone.setBounds(40,120,150,20);

        JLabel city=new JLabel("City :");
        city.setBounds(40,150,150,20);

        JLabel email=new JLabel("Email :");
        email.setBounds(40,180,150,20);

        //Creating Entry Boxes
        JTextField nameEntry=new JTextField();   
        nameEntry.setBounds(80,90,150,20);

        JTextField phoneEntry=new JTextField();
        phoneEntry.setBounds(135,120,150,20);

        JTextField dobEntry=new JTextField();
        dobEntry.setBounds(350,90,150,20);

        JTextField cityEntry=new JTextField();
        cityEntry.setBounds(80,150,150,20);

        JTextField emailEntry=new JTextField();
        emailEntry.setBounds(100,180,150,20);

        //Creating a Button
        JButton btn=new JButton("Register");
        btn.setBounds(100,210,90,20);

        //Adding to the Window/Frame
        Form.add(studentDetails);
        Form.add(name);
        Form.add(DOB);
        Form.add(phone);
        Form.add(city);
        Form.add(email);
        Form.add(nameEntry);
        Form.add(phoneEntry);
        Form.add(phoneEntry);
        Form.add(dobEntry);
        Form.add(cityEntry);
        Form.add(emailEntry);
        Form.add(btn);


        //Editing Window/Frame
        Form.setSize(1920,1080);
        Form.setLayout(null);
        Form.setVisible(true);
    }
}
