import javax.swing.*;
import java.awt.*;

public class AddCustomerUI {

    public JFrame view;

    public JButton btnAdd = new JButton("Add");
    public JButton btnCancel = new JButton("Cancel");
    public JTextField customerName = new JTextField(20);
    public JTextField customerID = new JTextField(20);
    public JTextField customerAddress = new JTextField(20);
    public JTextField phoneNumber = new JTextField(20);


    public AddCustomerUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        view.setTitle("Add Customer");
        view.setSize(600, 400);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));


        JPanel line1 = new JPanel(new FlowLayout());
        line1.add(new JLabel("customerID "));
        line1.add(customerID);
        view.getContentPane().add(line1);

        JPanel line2 = new JPanel(new FlowLayout());
        line2.add(new JLabel("Name "));
        line2.add(customerName);
        view.getContentPane().add(line2);

        JPanel line3 = new JPanel(new FlowLayout());
        line3.add(new JLabel("Address "));
        line3.add(customerAddress);
        view.getContentPane().add(line3);

        JPanel line4 = new JPanel(new FlowLayout());
        line4.add(new JLabel("Phone Number "));
        line4.add(phoneNumber);
        view.getContentPane().add(line4);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnAdd);
        panelButtons.add(btnCancel);
        view.getContentPane().add(panelButtons);
    }

    public void run() {
        view.setVisible(true);
    }
}
