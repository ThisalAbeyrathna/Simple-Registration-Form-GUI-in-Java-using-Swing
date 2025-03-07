import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegForm extends JFrame{
    private String[] formData = new String[7];
    private final String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String month[] = {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};
    private final String year[] = {"1999","1999","2000","2001","2002"};
    private String pass11;

    public RegForm(){

        setTitle("Sign UP");
        setBounds(300,90,400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        JLabel title = new JLabel("Sign Up");
        title.setFont(new Font("Arial",Font.BOLD,18));
        title.setForeground(Color.BLUE);
        title.setSize(300,50);
        title.setLocation(150,10);
        c.add(title);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.BOLD,15));
        name.setSize(100,50);
        name.setLocation(20,50);
        c.add(name);
        JTextField tName = new JTextField();
        tName.setFont(new Font("Arial",Font.PLAIN,15));
        tName.setSize(200,30);
        tName.setLocation(140,60);
        c.add(tName);

        JLabel email = new JLabel("Email");
        email.setFont(new Font("Arial",Font.BOLD,15));
        email.setSize(100,50);
        email.setLocation(20,100);
        c.add(email);
        JTextField tEmail = new JTextField();
        tEmail.setFont(new Font("Arial",Font.PLAIN,15));
        tEmail.setSize(200,30);
        tEmail.setLocation(140,110);
        c.add(tEmail);

        //Radio Button
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial",Font.BOLD,15));
        gender.setSize(100,50);
        gender.setLocation(20,140);
        c.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.BOLD,15));
        male.setSize(100,50);
        male.setLocation(140,140);
        male.setBackground(Color.WHITE);
        c.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.BOLD,15));
        female.setSize(100,50);
        female.setLocation(250,140);
        female.setBackground(Color.WHITE);
        c.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel birth = new JLabel("Birthday");
        birth.setFont(new Font("Arial",Font.BOLD,15));
        birth.setSize(100,50);
        birth.setLocation(20,180);
        c.add(birth);

        JComboBox day = new JComboBox(date);
        day.setFont(new Font("Arial",Font.PLAIN,15));
        day.setSize(40,20);
        day.setLocation(140,195);
        c.add(day);

        JComboBox mon = new JComboBox(month);
        mon.setFont(new Font("Arial",Font.PLAIN,15));
        mon.setSize(100,20);
        mon.setLocation(180,195);
        c.add(mon);

        JComboBox yr = new JComboBox(year);
        yr.setFont(new Font("Arial",Font.PLAIN,15));
        yr.setSize(60,20);
        yr.setLocation(280,195);
        c.add(yr);

        JLabel pass = new JLabel("Password");
        pass.setFont(new Font("Arial",Font.BOLD,15));
        pass.setSize(100,50);
        pass.setLocation(20,230);
        c.add(pass);

        JPasswordField tPass = new JPasswordField();
        tPass.setFont(new Font("Arial",Font.PLAIN,15));
        tPass.setSize(200,30);
        tPass.setLocation(140,240);
        c.add(tPass);

        JCheckBox check = new JCheckBox("I am not a robot.");
        check.setFont(new Font("Arial",Font.PLAIN,15));
        check.setSize(150,50);
        check.setLocation(20,270);
        check.setBackground(Color.WHITE);
        c.add(check);

        JButton signUp = new JButton("Sign Up");
        signUp.setFont(new Font("Arial",Font.BOLD,15));
        signUp.setSize(360,25);
        signUp.setLocation(10,320);
        signUp.setBackground(Color.BLUE);
        signUp.setForeground(Color.WHITE);
        c.add(signUp);

        JLabel title2 = new JLabel("Sign In");
        title2.setFont(new Font("Arial",Font.BOLD,18));
        title2.setForeground(Color.BLUE);
        title2.setSize(300,50);
        title2.setLocation(150,350);
        c.add(title2);

        JLabel email1 = new JLabel("Email");
        email1.setFont(new Font("Arial",Font.BOLD,15));
        email1.setSize(100,50);
        email1.setLocation(20,390);
        c.add(email1);
        JTextField tEmail1 = new JTextField();
        tEmail1.setFont(new Font("Arial",Font.BOLD,15));
        tEmail1.setSize(200,30);
        tEmail1.setLocation(140,400);
        c.add(tEmail1);

        JLabel pass1 = new JLabel("Password");
        pass1.setFont(new Font("Arial",Font.BOLD,15));
        pass1.setSize(100,50);
        pass1.setLocation(20,440);
        c.add(pass1);
        JPasswordField tPass1 = new JPasswordField();
        tPass1.setFont(new Font("Arial",Font.PLAIN,15));
        tPass1.setSize(200,30);
        tPass1.setLocation(140,450);
        c.add(tPass1);

        JButton signIn = new JButton("Sign In");
        signIn.setFont(new Font("Arial",Font.BOLD,15));
        signIn.setSize(360,25);
        signIn.setLocation(10,500);
        signIn.setBackground(Color.BLUE);
        signIn.setForeground(Color.WHITE);
        c.add(signIn);


        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tEmail1.getText();
                String password = new String(tPass1.getPassword());

                if (formData[1].equals(email) && formData[6].equals(password)) {
                    JOptionPane.showMessageDialog(null, "Sign In successful!");
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid email or password.");
                }


            }
        });
        //signUp.addActionListener(this);
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formData[0] = tName.getText();
                formData[1] = tEmail.getText();
                formData[2] = male.isSelected() ? "Male" : "Female";
                formData[3] = (String) day.getSelectedItem();
                formData[4] = (String) mon.getSelectedItem();
                formData[5] = (String) yr.getSelectedItem();
                formData[6] = new String(tPass.getPassword());
                JOptionPane.showMessageDialog(signUp,"Registration Successful!");



            }
        });



    }


}
