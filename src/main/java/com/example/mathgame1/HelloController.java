package com.example.mathgame1;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    private Button val1 = null;
    private Button val2 = null;
    static FindCl find;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5blue;
    @FXML
    private Button btn6blue;
    @FXML
    private Button btn7blue;
    @FXML
    private Button btn8blue;
    @FXML
    private Button btn9;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Collections.shuffle(list);
       /* btn1.setText(String.valueOf(list.get(0)));
        btn2.setText(String.valueOf(list.get(1)));
        btn3.setText(String.valueOf(list.get(2)));
        btn4.setText(String.valueOf(list.get(3)));
        btn5blue.setText(String.valueOf(list.get(4)));
        btn6blue.setText(String.valueOf(list.get(5)));
        btn7blue.setText(String.valueOf(list.get(6)));
        btn8blue.setText(String.valueOf(list.get(7)));
        btn9.setText(String.valueOf(list.get(8)));
        btn10.setText(String.valueOf(list.get(9)));
        btn11.setText(String.valueOf(list.get(10)));
        btn12.setText(String.valueOf(list.get(11)));*/
    }

    public void func() {
        System.out.println(val1.getText() + " " + val2.getText());
        if (!(val1.getText().equals(val2.getText()))) {
            find = new FindCl("Ищите лучше!");
            find.call();
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(e -> {
                        System.out.println("j");
                        val1.setText("");
                        val2.setText("");
                        val1 = null;
                        val2 = null;
                    }
            );
            pause.play();


        } else {
            find = new FindCl("Нашли!");
            find.call();
            val1 = null;
            val2 = null;
        }
    }

    public void btn1(MouseEvent mouseEvent) {
        btn1.setText(String.valueOf(list.get(0)));


        if (val1 == null) {
            val1 = btn1;
        } else {
            val2 = btn1;
            func();
        }
    }

    public void btn2(MouseEvent mouseEvent) {
        //Collections.shuffle(list);
        btn2.setText(String.valueOf(list.get(1)));
        if (val1 == null) {
            val1 = btn2;
        } else {
            val2 = btn2;
            func();
        }

    }


    public void btn3(MouseEvent mouseEvent) {
        btn3.setText(String.valueOf(list.get(2)));
        if (val1 == null) {
            val1 = btn3;
        } else {
            val2 = btn3;
            func();
        }
    }

    public void btn4(MouseEvent mouseEvent) {
        btn4.setText(String.valueOf(list.get(3)));
        if (val1 == null) {
            val1 = btn4;
        } else {
            val2 = btn4;
            func();
        }
    }

    public void btn5blue(MouseEvent mouseEvent) {
        btn5blue.setText(String.valueOf(list.get(4)));
        if (val1 == null) {
            val1 = btn5blue;
        } else {
            val2 = btn5blue;
            func();
        }
    }

    public void btn6blue(MouseEvent mouseEvent) {
        btn6blue.setText(String.valueOf(list.get(5)));
        if (val1 == null) {
            val1 = btn6blue;
        } else {
            val2 = btn6blue;
            func();
        }
    }

    public void btn7blue(MouseEvent mouseEvent) {
        btn7blue.setText(String.valueOf(list.get(6)));
        if (val1 == null) {
            val1 = btn7blue;
        } else {
            val2 = btn7blue;
            func();
        }

    }

    public void btn8blue(MouseEvent mouseEvent) {
        btn8blue.setText(String.valueOf(list.get(7)));
        if (val1 == null) {
            val1 = btn8blue;
        } else {
            val2 = btn8blue;
            func();
        }

    }

    public void btn9(MouseEvent mouseEvent) {

        btn9.setText(String.valueOf(list.get(8)));
        if (val1 == null) {
            val1 = btn9;
        } else {
            val2 = btn9;
            func();
        }
    }

    public void btn10(MouseEvent mouseEvent) {
        btn10.setText(String.valueOf(list.get(9)));
        if (val1 == null) {
            val1 = btn10;
        } else {
            val2 = btn10;
            func();
        }
    }


    public void btn11(MouseEvent mouseEvent) {
        btn11.setText(String.valueOf(list.get(10)));
        if (val1 == null) {
            val1 = btn11;
        } else {
            val2 = btn11;
            func();
        }
    }

    public void btn12(MouseEvent mouseEvent) {
        btn12.setText(String.valueOf(list.get(11)));
        if (val1 == null) {
            val1 = btn12;
        } else {
            val2 = btn12;
            func();
        }
    }
}