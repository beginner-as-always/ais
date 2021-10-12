package ais.lab1;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    public CheckBox chkFourSides;
    public CheckBox chkRightAngles;
    public CheckBox chkEqualSides;
    public CheckBox chkParallelOpposites;

    public TextField answer;

    public void guess() {
        boolean fs = chkFourSides.isSelected();
        boolean ra = chkRightAngles.isSelected();
        boolean es = chkEqualSides.isSelected();
        boolean po = chkParallelOpposites.isSelected();

        if (fs && !ra && !es && !po) answer.setText("Четырехугольник");
        else if (
                (!fs && ra && !es && !po) ||
                (fs && ra && !es && po) ||
                (fs && ra && !es && !po)
        ) answer.setText("Прямоугольник");
        else if (
                (!fs && ra && es) ||
                (fs && ra && es)
        ) answer.setText("Квадрат");
        else if (
                fs && !ra && !es
        ) answer.setText("Параллелограмм");
        else if (
                (fs && !ra && po) ||
                (fs && es)
        ) answer.setText("Ромб");
        else answer.setText("Неизвестная фигура");
        
    }
}
