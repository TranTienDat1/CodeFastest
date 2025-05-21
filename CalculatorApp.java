package codefaster;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {

    public static void main(String[] args) {
        // Tạo cửa sổ chính
        JFrame mainFrame = new JFrame("Calculator App");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 200);

        // Tạo layout
        mainFrame.setLayout(new GridLayout(4, 1, 10, 10));

        // Tạo các nút chức năng
        JButton addButton = new JButton("Addition");
        JButton subtractButton = new JButton("Subtraction");
        JButton multiplyButton = new JButton("Multiplication");
        JButton divideButton = new JButton("Division");

        // Thêm sự kiện cho các nút chức năng
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAdditionGUI();
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createSubtractionGUI();
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMultiplicationGUI();
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDivisionGUI();
            }
        });

        // Thêm các nút vào cửa sổ chính
        mainFrame.add(addButton);
        mainFrame.add(subtractButton);
        mainFrame.add(multiplyButton);
        mainFrame.add(divideButton);

        // Hiển thị cửa sổ chính
        mainFrame.setVisible(true);
    }

    private static void createAdditionGUI() {
        
    }

    private static void createSubtractionGUI() {
        
    }

    private static void createMultiplicationGUI() {
        
    }

    private static void createDivisionGUI() {
       
    }
}