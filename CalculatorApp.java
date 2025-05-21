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
        mainFrame.setSize(400, 300);

        // Tạo layout
        mainFrame.setLayout(new GridLayout(6, 1, 10, 10));

        // Tạo các nút chức năng
        JButton addButton = new JButton("Addition");
        JButton subtractButton = new JButton("Subtraction");
        JButton multiplyButton = new JButton("Multiplication");
        JButton divideButton = new JButton("Division");
        JButton rectangleAreaButton = new JButton("Rectangle Area");
        JButton circleAreaButton = new JButton("Circle Area");

        // Thêm sự kiện cho các nút chức năng
        addButton.addActionListener(e -> createAdditionGUI());
        subtractButton.addActionListener(e -> createSubtractionGUI());
        multiplyButton.addActionListener(e -> createMultiplicationGUI());
        divideButton.addActionListener(e -> createDivisionGUI());
        rectangleAreaButton.addActionListener(e -> createRectangleAreaGUI());
        circleAreaButton.addActionListener(e -> createCircleAreaGUI());

        // Thêm các nút vào cửa sổ chính
        mainFrame.add(addButton);
        mainFrame.add(subtractButton);
        mainFrame.add(multiplyButton);
        mainFrame.add(divideButton);
        mainFrame.add(rectangleAreaButton);
        mainFrame.add(circleAreaButton);

        // Hiển thị cửa sổ chính
        mainFrame.setVisible(true);
    }

    private static void createAdditionGUI() {
        // Tạo GUI cho phép cộng
    }

    private static void createSubtractionGUI() {
        // Tạo GUI cho phép trừ
    }

    private static void createMultiplicationGUI() {
        // Tạo GUI cho phép nhân
    }

    private static void createDivisionGUI() {
        // Tạo GUI cho phép chia
    }

    private static void createRectangleAreaGUI() {
       //code GUI diện tích HCN
    }

    private static void createCircleAreaGUI() {
        //code GUI dien tich hinh tron
    }
}
