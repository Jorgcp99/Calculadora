package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {
	@FXML
	private Button sumar;
	@FXML
	private Button restar;
	@FXML
	private Button multiplicar;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private TextField resul;

	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	// When user click on myButton this method will be called.
	public void sumar(ActionEvent event) {
		System.out.println("Button suma!");
		int x = Integer.parseInt(num1.getText());
		int y = Integer.parseInt(num2.getText());
		int res = x + y;
		resul.setText(Integer.toString(res));
	}
	public void restar(ActionEvent event) {
		System.out.println("Button resta!");
		int x = Integer.parseInt(num1.getText());
		int y = Integer.parseInt(num2.getText());
		int res = x - y;
		resul.setText(Integer.toString(res));
	}
	public void multiplicar(ActionEvent event) {
		System.out.println("Button multiplicacion!");
		int x = Integer.parseInt(num1.getText());
		int y = Integer.parseInt(num2.getText());
		int res = x * y;
		resul.setText(Integer.toString(res));
	}
}