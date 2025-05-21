package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiFunctionApp extends JFrame {
    // Các thành phần giao diện
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JLabel lblSo1, lblSo2, lblKetQua;
    private JButton btnCong, btnTru, btnNhan, btnTienNuoc, btnDienTich, btnChiaHet;

    public MultiFunctionApp() {
        // Thiết lập JFrame
        setTitle("Ứng dụng Đa chức năng");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình
        setLayout(new GridLayout(0, 1, 10, 10));

        // Khởi tạo các thành phần
        initComponents();

        // Thêm các thành phần vào JFrame
        add(lblSo1);
        add(txtSo1);
        add(lblSo2);
        add(txtSo2);
        add(lblKetQua);
        add(txtKetQua);

        // Panel chứa các nút chức năng
        JPanel pnlButtons = new JPanel(new GridLayout(2, 3, 10, 10));
        pnlButtons.add(btnCong);
        pnlButtons.add(btnTru);
        pnlButtons.add(btnNhan);
        pnlButtons.add(btnTienNuoc);
        pnlButtons.add(btnDienTich);
        pnlButtons.add(btnChiaHet);
        
        add(pnlButtons);
    }

    private void initComponents() {
        // Tạo các label và text field
        lblSo1 = new JLabel("Số thứ nhất:");
        txtSo1 = new JTextField();
        
        lblSo2 = new JLabel("Số thứ hai:");
        txtSo2 = new JTextField();
        
        lblKetQua = new JLabel("Kết quả:");
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);

        // Tạo các nút chức năng
        btnCong = new JButton("Cộng hai số");
        btnTru = new JButton("Trừ hai số");
        btnNhan = new JButton("Nhân hai số");
        btnTienNuoc = new JButton("Tính tiền nước");
        btnDienTich = new JButton("Diện tích HCN");
        btnChiaHet = new JButton("Kiểm tra chia hết");

        // Gán sự kiện cho các nút
        btnCong.addActionListener(this::xuLyPhepCong);
        btnTru.addActionListener(this::xuLyPhepTru);
        btnNhan.addActionListener(this::xuLyPhepNhan);
        btnTienNuoc.addActionListener(this::xuLyTienNuoc);
        btnDienTich.addActionListener(this::xuLyDienTich);
        btnChiaHet.addActionListener(this::xuLyKiemTraChiaHet);
    }

    // Các phương thức xử lý sự kiện
    private void xuLyPhepCong(ActionEvent evt) {

    }

    private void xuLyPhepTru(ActionEvent evt) {

    }

    private void xuLyPhepNhan(ActionEvent evt) {
        try {
            double num1 = Double.parseDouble(txtSo1.getText());
            double num2 = Double.parseDouble(txtSo2.getText());
            double result = num1 * num2;
            txtKetQua.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void xuLyTienNuoc(ActionEvent evt) {

    }

    private void xuLyDienTich(ActionEvent evt) {
        try {
            double chieuDai = Double.parseDouble(txtSo1.getText());
            double chieuRong = Double.parseDouble(txtSo2.getText());
            
            if (chieuDai <= 0 || chieuRong <= 0) {
                JOptionPane.showMessageDialog(this, "Chiều dài và chiều rộng phải > 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double dienTich = chieuDai * chieuRong;
            txtKetQua.setText(String.valueOf(dienTich));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void xuLyKiemTraChiaHet(ActionEvent evt) {

    }

    public static void main(String[] args) {
        // Chạy ứng dụng
        SwingUtilities.invokeLater(() -> {
            new MultiFunctionApp().setVisible(true);
        });
    }
}