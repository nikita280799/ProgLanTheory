import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField s0t1from, s0t2from, s0t3from, s0t4from, s0t1to, s0t2to, s0t3to, s0t4to,
            s1t1from, s1t2from, s1t3from, s1t4from, s1t1to, s1t2to, s1t3to, s1t4to,
            s2t1from, s2t2from, s2t3from, s2t4from, s2t1to, s2t2to, s2t3to, s2t4to,
            s3t1from, s3t2from, s3t3from, s3t4from, s3t1to, s3t2to, s3t3to, s3t4to,
            s4t1from, s4t2from, s4t3from, s4t4from, s4t1to, s4t2to, s4t3to, s4t4to,
            s5t1from, s5t2from, s5t3from, s5t4from, s5t1to, s5t2to, s5t3to, s5t4to,
            s6t1from, s6t2from, s6t3from, s6t4from, s6t1to, s6t2to, s6t3to, s6t4to,
            s7t1from, s7t2from, s7t3from, s7t4from, s7t1to, s7t2to, s7t3to, s7t4to, input;

    @FXML
    private Label curState;

    @FXML
    private void click() {
        switch (Integer.parseInt(curState.getText())) {
            case 0:
                goToNextState(s0t1from, s0t1to, s0t2from, s0t2to, s0t3from, s0t3to, s0t4from, s0t4to);
                break;
            case 1:
                goToNextState(s1t1from, s1t1to, s1t2from, s1t2to, s1t3from, s1t3to, s1t4from, s1t4to);
                break;
            case 2:
                goToNextState(s2t1from, s2t1to, s2t2from, s2t2to, s2t3from, s2t3to, s2t4from, s2t4to);
                break;
            case 3:
                goToNextState(s3t1from, s3t1to, s3t2from, s3t2to, s3t3from, s3t3to, s3t4from, s3t4to);
                break;
            case 4:
                goToNextState(s4t1from, s4t1to, s4t2from, s4t2to, s4t3from, s4t3to, s4t4from, s4t4to);
                break;
            case 5:
                goToNextState(s5t1from, s5t1to, s5t2from, s5t2to, s5t3from, s5t3to, s5t4from, s5t4to);
                break;
            case 6:
                goToNextState(s6t1from, s6t1to, s6t2from, s6t2to, s6t3from, s6t3to, s6t4from, s6t4to);
                break;
            case 7:
                goToNextState(s7t1from, s7t1to, s7t2from, s7t2to, s7t3from, s7t3to, s7t4from, s7t4to);
                break;
        }
    }

    private void goToNextState(TextField t1from, TextField t1to, TextField t2from, TextField t2to,
                               TextField t3from, TextField t3to, TextField t4from, TextField t4to) {
       if (input.getText().equals(t1from.getText())) {
           curState.setText(t1to.getText());
           return;
       }
        if (input.getText().equals(t2from.getText())) {
            curState.setText(t2to.getText());
            return;
        }
        if (input.getText().equals(t3from.getText())) {
            curState.setText(t3to.getText());
            return;
        }
        if (input.getText().equals(t4from.getText())) {
            curState.setText(t4to.getText());
        }
    }
}
