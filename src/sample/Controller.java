package sample;


import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button button;
    public TextField txBoq;
    public TextField txPassword;


    public void calculate(){
        String boqText = txBoq.getText();
        if ("".equals(boqText)){
            txPassword.setText("请输入正确BOQ号！");
        }
        Integer id = 1111;
        Integer date = 0;
        Integer serial = 0;

        try {
            id = Integer.valueOf(boqText.substring(8, 12));
            date = Integer.valueOf(boqText.substring(12, 20));
            serial = Integer.valueOf(boqText.substring(21));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        String key = String.valueOf(id*11/13+date*17/19+serial*1111+1234);

        txPassword.setText(key);
        System.out.println(boqText);
        System.out.println(id);
        System.out.println(date);
        System.out.println(serial);
        System.out.println(key);
        System.out.println(9999*11/13+99991231*17/19+9999*1111+1234);
    }
}
