import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class View  extends Pane {
    private final Controller controller;
    public View() {
        System.out.println("View is ready");
        controller = new Controller(this);
        setStyle("-fx-background-radius: 40;-fx-background-color:  #010101;");
        Button buttonC = createButton("C", 16.0, 233.0," #a5a5a5",55.0,"#010101");
        Button buttonPlusMinus = createButton("Del", 87.0, 233.0," #a5a5a5",55.0,"#010101");
        Button buttonPercent = createButton("%", 158.0, 233.0," #a5a5a5",55.0,"#010101");
        Button buttonDivide = createButton("/", 229.0, 233.0,"#ff9f0a",55.0,"#ebeae9");
        Button button7 = createButton("7", 16.0, 309.0,"#333333",55.0,"#ebeae9");
        Button button8 = createButton("8", 87.0, 309.0,"#333333",55.0,"#ebeae9");
        Button button9 = createButton("9", 158.0, 309.0,"#333333",55.0,"#ebeae9");
        Button buttonMultiply = createButton("x", 229.0, 309.0,"#ff9f0a",55.0,"#ebeae9");
        Button button4 = createButton("4", 16.0, 385.0,"#333333",55.0,"#ebeae9");
        Button button5 = createButton("5", 87.0, 385.0,"#333333",55.0,"#ebeae9");
        Button button6 = createButton("6", 158.0, 385.0,"#333333",55.0,"#ebeae9");
        Button buttonMinus = createButton("-", 229.0, 385.0,"#ff9f0a",55.0,"#ebeae9");
        Button button1 = createButton("1", 16.0, 461.0,"#333333",55.0,"#ebeae9");
        Button button2 = createButton("2", 87.0, 461.0,"#333333",55.0,"#ebeae9");
        Button button3 = createButton("3", 158.0, 461.0,"#333333",55.0,"#ebeae9");
        Button buttonPlus = createButton("+", 229.0, 461.0,"#ff9f0a",55.0,"#ebeae9");
        Button button0 = createButton("0", 16.0, 528.0,"#333333",126.0,"#ebeae9");
        Button buttonDot = createButton(".", 158.0, 528.0,"#333333",55.0,"#ebeae9");
        Button buttonEquals = createButton("=", 229.0, 528.0,"#ff9f0a",55.0,"#ebeae9");
        button0.setOnAction(controller);
        button0.setAlignment(Pos.CENTER_LEFT);
        button0.setPadding(new Insets(0,0,0,20));
        Label label = new Label("40");
        label.setLayoutX(139.0);
        label.setLayoutY(136.0);
        label.setPrefWidth(149.0);
        label.setPrefHeight(55.0);
        label.setTextFill(Color.web("#ebeae9"));
        label.setFont(new Font(33.0));
        label.setAlignment(Pos.CENTER_RIGHT);
        getChildren().addAll(
                buttonC, buttonPlusMinus, buttonPercent, buttonDivide, button7, button8, button9, buttonMultiply,
                button4, button5, button6, buttonMinus, button1, button2, button3, buttonPlus, button0, buttonDot,
                buttonEquals, label
        );
    }

    private Button createButton(String text, double layoutX, double layoutY, String color, double width,String textFillColor) {
        Button button = new Button(text);
        button.setLayoutX(layoutX);
        button.setLayoutY(layoutY);
        button.setPrefHeight(55.0);
        button.setPrefWidth(width);
        button.setStyle(String.format("-fx-background-radius: 55; -fx-background-color: %s;",color));
        button.setTextFill(Color.web(textFillColor));
        Font font = new Font("Verdana Bold", 15.0);
        button.setFont(font);
        return button;
    }


}
