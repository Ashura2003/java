import java.awt.Scrollbar;

import javax.swing.*;

public class swp {
    public static void main(String[] args) {

        //Creating a Frame
        JFrame mainWindow=new JFrame("Login Page");

        //Creating Labels

        JLabel Signin=new JLabel("Sign In");
        JLabel UsernameLabel=new JLabel("Username :");
        JLabel passwordLabel=new JLabel("Password :");

        //Creating Entry Boxes

        JTextField UsernameTextField=new JTextField();
        JTextField passwordTextField=new JTextField();

        //Creating Button

        JButton LoginBtn=new JButton("Login");

        //Creating ScrollBar

        JScrollBar ScrollBar=new JScrollBar(Scrollbar.VERTICAL,1,2,1,50);

        //Creating a menu

        JMenuBar menu=new JMenuBar();
        JMenu FileMenu=new JMenu("File");
        JMenuItem openFile=new JMenuItem("Open File");
        JMenuItem saveFile=new JMenuItem("Save File");
        JMenuItem exit=new JMenuItem("Exit");

        //Adding Menu Items to the main Menu
        FileMenu.add(openFile);
        FileMenu.add(saveFile);
        FileMenu.add(exit);

        //Setting Bounds

        Signin.setBounds(650,120,150,20);
        UsernameLabel.setBounds(600,180,150,20);
        passwordLabel.setBounds(600,240,150,20);
        UsernameTextField.setBounds(600,210,150,20);
        passwordTextField.setBounds(600,270,150,20);
        LoginBtn.setBounds(625,320,90,20);
        ScrollBar.setBounds(1525,1,10,800);
        FileMenu.setBounds(1,1,500,50);

        //Adding to the Frame

        mainWindow.add(Signin);
        mainWindow.add(UsernameLabel);
        mainWindow.add(UsernameTextField);
        mainWindow.add(passwordLabel);
        mainWindow.add(passwordTextField);
        mainWindow.add(LoginBtn);
        mainWindow.add(ScrollBar);
        mainWindow.add(FileMenu);

        //Editing Frame

        mainWindow.setSize(1920,1080);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);

    }
    
}
