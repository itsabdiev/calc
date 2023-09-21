import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;


public class Controller implements EventHandler<ActionEvent> {
    private final Model model;
    public Controller(View view) {
        System.out.println("Controller is ready");
    	this.model = new Model(view);
    }

    @Override
    public void handle(ActionEvent event) {
        Button button = (Button) event.getSource();
        Button button1 = (Button) event.getTarget();
        System.out.println(button.getText());
        System.out.println(button1.getText());
    }
}
