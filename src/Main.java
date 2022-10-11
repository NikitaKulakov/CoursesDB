import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String args[]) {

        JFrame frame = new JFrame("Studs&Teachs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1270,720);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Преподаватели");
        JMenu m2 = new JMenu("Студенты");
        mb.add(m1);
        mb.add(m2);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Введите текст");
        JTextField textField= new JTextField(10);
        JButton send = new JButton("Отправить");

        frame.getContentPane().add(BorderLayout.SOUTH,);

    }
}