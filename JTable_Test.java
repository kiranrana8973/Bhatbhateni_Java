import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.*;

public class JTable_Test extends JFrame {

    JTable table;
    JScrollPane jp;
    String[] columns = { "Name", "Roll Number", "Department" };
    String[][] data = {
            { "Kiran Rana", "4031", "BSc." },
            { "John Doe", "6014", "IT" },
            { "Kiran Rana", "4031", "BSc." },
            { "John Doe", "6014", "IT" },
            { "Kiran Rana", "4031", "BSc." },
            { "John Doe", "6014", "IT" },
            { "Kiran Rana", "4031", "BSc." },
            { "John Doe", "6014", "IT" },
            { "Kiran Rana", "4031", "BSc." },
            { "John Doe", "6014", "IT" },
    };

    public JTable_Test() {
        setTitle("JTable Demo");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        table = new JTable(data, columns);
        jp = new JScrollPane(table);

        add(jp);
        // add(table, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTable_Test();
    }

}


