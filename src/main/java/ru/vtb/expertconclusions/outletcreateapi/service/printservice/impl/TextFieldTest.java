package ru.vtb.expertconclusions.outletcreateapi.service.printservice.impl;

// Использование текстовых полей JTextField

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

import static ru.vtb.expertconclusions.outletcreateapi.util.Constant.shaffle;
import static ru.vtb.expertconclusions.outletcreateapi.util.Constant.timeToWait;

//@Component
public class TextFieldTest extends JFrame {
    // Текстовые поля
    JTextField smallField, bigField;

    public TextFieldTest(List<String> worlds) {
        super("sadf");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 200, 1500, 300);
        // Создание текстовых полей
//        smallField = new JTextField(15);
        while (true) {
            if(shaffle.name().equals("on")){
                Collections.shuffle(worlds);
                Collections.shuffle(worlds);
                Collections.shuffle(worlds);
                Collections.shuffle(worlds);
            }
            printMy(worlds);
        }
    }
    private void printMy(List<String> worlds) {
        for (String world : worlds) {
            bigField = new JTextField(world, 49);
            // Настройка шрифта
            bigField.setFont(new Font("Dialog", Font.PLAIN, 40));
//        bigField.setHorizontalAlignment(JTextField.LEFT);
            // Слушатель окончания ввода

            // Поле с паролем
//        JPasswordField password = new JPasswordField(12);
//        password.setEchoChar('*');
            // Создание панели с текстовыми полями

            try {
                Thread.sleep(timeToWait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        contents.add(smallField);
            contents.add(bigField);
//        contents.add(password  );
            setContentPane(contents);
            // Определяем размер окна и выводим его на экран
            setSize(2000, 300);
            setVisible(true);
        }
    }
}