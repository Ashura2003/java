import javax.swing.*;
public class reference {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");

        JLabel student_details = new JLabel("STUDENT DETAILS");
        student_details.setBounds(200,10,200,45);
        frame.add(student_details);
        JLabel Student_FN_label = new JLabel("First Name:");
        JTextField Student_FN_text = new JTextField();
        
        JLabel Student_MN_label = new JLabel("Middle Name:");
        JTextField Student_MN_text = new JTextField();
        JLabel Student_LN_label = new JLabel("Last Name:");
        JTextField Student_LN_text = new JTextField();
        
        JLabel dob_label = new JLabel("Date of birth:"); 
        JTextField dob_text = new JTextField();
        
        JLabel Email_label = new JLabel("Email:");
        JTextField Email_text = new JTextField();
        
        JLabel C_num_label = new JLabel("CitizenShip Number:");
        JLabel C_num_date_label = new JLabel("CitizenShip issued date:");
        JTextField C_num_text = new JTextField();
        JTextField C_num_date_text = new JTextField();
        Student_FN_label.setBounds(10,50,80,45);
        Student_MN_label.setBounds(160,50,80,45);
        Student_LN_label.setBounds(320,50,80,45);
        Student_FN_text.setBounds(80,50,80,35);
        Student_MN_text.setBounds(240,50,80,35);
        Student_LN_text.setBounds(390,50,80,35);
        dob_label.setBounds(10,110,80,45);
        dob_text.setBounds(90,110,80,35);

        Email_label.setBounds(170,110,80,45);
        Email_text.setBounds(210,110,80,35);

        C_num_label.setBounds(10,170,122,45);
        C_num_text.setBounds(132, 170, 120, 35);
        C_num_date_label.setBounds(250,170,150,45);
        C_num_date_text.setBounds(400, 170, 150, 35);

        frame.add(Student_FN_text);
        frame.add(Student_FN_label);
        frame.add(Student_MN_label);
        frame.add(Student_MN_text);
        frame.add(Student_LN_label);
        frame.add(Student_LN_text);
        frame.add(dob_label);
        frame.add(dob_text);
        frame.add(Email_label);
        frame.add(Email_text);

        frame.add(C_num_label);
        frame.add(C_num_date_label);
        frame.add(C_num_text);
        frame.add(C_num_date_text);

        JLabel C_issue_date_label = new JLabel("CitizenShip issuing office:");
        JTextField C_issue_date_text = new JTextField();
        C_issue_date_label.setBounds(10, 230, 160, 45);
        C_issue_date_text.setBounds(165, 230, 150, 35);

        frame.add(C_issue_date_label);
        frame.add(C_issue_date_text);

        // Student Academic Detail
        JLabel intermediate = new JLabel("Intermediate");
        intermediate.setBounds(200, 280, 150, 45);
        frame.add(intermediate);


        JLabel college_name_label = new JLabel("college name:");
        JLabel uni_inter_name_label = new JLabel("university name:");
        JLabel uni_name_label = new JLabel("university name:");
        JLabel CGPA_inter_Label = new JLabel("CGPA:");
        JLabel CGPA_Label = new JLabel("CGPA:");
        JLabel school_name_label = new JLabel("school name:");
        JTextField college_name_text = new JTextField();
        JTextField uni_inter_name_text = new JTextField();
        JTextField uni_name_text = new JTextField();
        JTextField CGPA_inter_text = new JTextField();
        JTextField CGPA_text = new JTextField();
        JTextField school_name_text = new JTextField();

        college_name_label.setBounds(10,320,90,45);
        college_name_text.setBounds(100,320,80,35);

        uni_inter_name_label.setBounds(180,320,100,45);
        uni_inter_name_text.setBounds(280,320,100,35);

        CGPA_inter_Label.setBounds(380,320,60,45);
        CGPA_inter_text.setBounds(430,320,60,35);
        
        JLabel School_level = new JLabel("School");
        School_level.setBounds(200,370,90,45);
        frame.add(School_level);
        school_name_label.setBounds(10,420,90,45);
        school_name_text.setBounds(100,420,80,35);

        uni_name_label.setBounds(180,420,100,45);
        uni_name_text.setBounds(280,420,100,35);

        CGPA_Label.setBounds(380,420,60,45);
        CGPA_text.setBounds(430,420,60,35);

        frame.add(college_name_label);
        frame.add(college_name_text);
        frame.add(uni_inter_name_label);
        frame.add(uni_inter_name_text);
        frame.add(school_name_label);
        frame.add(school_name_text);
        frame.add(CGPA_Label);
        frame.add(CGPA_text);
        frame.add(CGPA_inter_Label);
        frame.add(CGPA_inter_text);
        frame.add(uni_name_label);
        frame.add(uni_name_text);
    




        // Parent detail
        JLabel Father_label = new JLabel("Father Details");
        Father_label.setBounds(800,10,80,45);

        JLabel Father_FN_label = new JLabel("First Name:");
        JTextField Father_FN_text = new JTextField();
        
        JLabel Father_MN_label = new JLabel("Middle Name:");
        JTextField Father_MN_text = new JTextField();
        JLabel Father_LN_label = new JLabel("Last Name:");
        JTextField Father_LN_text = new JTextField();

        Father_FN_label.setBounds(610,50,80,45);
        Father_MN_label.setBounds(760,50,90,45);
        Father_LN_label.setBounds(930,50,90,45);
        Father_FN_text.setBounds(680,50,80,35);
        Father_MN_text.setBounds(850,50,80,35);
        Father_LN_text.setBounds(1010,50,80,35);
        frame.add(Father_FN_text);
        frame.add(Father_FN_label);
        frame.add(Father_MN_label);
        frame.add(Father_MN_text);
        frame.add(Father_LN_label);
        frame.add(Father_LN_text);

        JLabel father_phone = new JLabel("Phone number:");
        JTextField father_phone_text = new JTextField();
 
        father_phone.setBounds(610,110,100,45);
        father_phone_text.setBounds(710,110,100,35);

        JLabel father_email_label = new JLabel("Email:");
        JTextField father_email_text = new JTextField();
        
        JLabel father_citzen = new JLabel("Citizenship number:");
        JTextField father_citzen_text = new JTextField();
        father_email_label.setBounds(820,110,80,45);
        father_email_text.setBounds(870,110,80,35);


        father_citzen.setBounds(610,170,120,45);
        father_citzen_text.setBounds(750,170,130,35);
        
        
        frame.add(father_phone);
        frame.add(father_phone_text);
        
        frame.add(father_email_label);
        frame.add(father_email_text);
        
        frame.add(father_citzen);
        frame.add(father_citzen_text);
        
        JLabel Mother_label = new JLabel("Mother Details");
        Mother_label.setBounds(800,210,100,45);
        frame.add(Mother_label);
        JLabel Mother_FN_label = new JLabel("First Name:");
        JTextField Mother_FN_text = new JTextField();
        
        JLabel Mother_MN_label = new JLabel("Middle Name:");
        JTextField Mother_MN_text = new JTextField();
        JLabel Mother_LN_label = new JLabel("Last Name:");
        JTextField Mother_LN_text = new JTextField();
        
        Mother_FN_label.setBounds(610,250,80,45);
        Mother_MN_label.setBounds(760,250,90,45);
        Mother_LN_label.setBounds(930,250,90,45);
        Mother_FN_text.setBounds(680,250,80,35);
        Mother_MN_text.setBounds(850,250,80,35);
        Mother_LN_text.setBounds(1010,250,80,35);
        frame.add(Mother_FN_text);
        frame.add(Mother_FN_label);
        frame.add(Mother_MN_label);
        frame.add(Mother_MN_text);
        frame.add(Mother_LN_label);
        frame.add(Mother_LN_text);
        JLabel mother_phone = new JLabel("Phone number");
        JTextField mother_phone_text = new JTextField();
        
        mother_phone.setBounds(610,310,100,45);
        mother_phone_text.setBounds(710,310,100,35);
        frame.add(mother_phone);
        frame.add(mother_phone_text);
        
        JLabel mother_email_label = new JLabel("Email:");
        JTextField mother_email_text = new JTextField();
        
        JLabel mother_citzen = new JLabel("Citizenship number:");
        JTextField mother_citzen_text = new JTextField();
        mother_email_label.setBounds(820,310,80,45);
        mother_email_text.setBounds(870,310,80,35);


        mother_citzen.setBounds(610,370,120,45);
        mother_citzen_text.setBounds(750,370,130,35);  
        
        frame.add(mother_email_label);
        frame.add(mother_email_text);
        
        frame.add(mother_citzen);
        frame.add(mother_citzen_text);


        frame.add(Father_label);
        // frame.add(Mother_label);

        JButton bt1 = new JButton("Submit");
        bt1.setBounds(500, 480, 100, 45);
        frame.add(bt1);
        frame.setSize(1280,900);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
} 
    

