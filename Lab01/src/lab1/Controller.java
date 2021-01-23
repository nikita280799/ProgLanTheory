package lab1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    @FXML
    private TextField vtField, vnField, chainField, resField, p1f, p1t, p2f, p2t, p3f, p3t, p4t, p4f, p5t, p5f, sField;

    @FXML
    private void click() {
        String termSym = vtField.getText();
        String netermSym = vnField.getText();
        String chain = chainField.getText();
        String s = sField.getText();
        String res;
        Map<String, String> map = new HashMap<>();
        if (!p1f.getText().isEmpty()) map.put(p1f.getText(), p1t.getText());
        if (!p2f.getText().isEmpty()) map.put(p2f.getText(), p2t.getText());
        if (!p3f.getText().isEmpty()) map.put(p3f.getText(), p3t.getText());
        if (!p4f.getText().isEmpty()) map.put(p4f.getText(), p4t.getText());
        if (!p5f.getText().isEmpty()) map.put(p5f.getText(), p5t.getText());

        int cursor = chain.length();
        while (cursor != 0) {
            for (Map.Entry entries : map.entrySet()) {
                if (cursor - entries.getKey().toString().length() > 0){
                    String ss = chain.substring(cursor - entries.getKey().toString().length(), cursor);
                    if (chain.contains(entries.getKey().toString()) &&
                            entries.getKey().equals(chain.substring(cursor - entries.getKey().toString().length(), cursor))) {
                        chain = chain.substring(0, cursor - entries.getKey().toString().length())
                                + entries.getValue().toString() + chain.substring(cursor);
                        cursor += entries.getValue().toString().length();
                        if (cursor > chain.length()) {
                            cursor = chain.length();
                        }
                    }
                }
                cursor--;
            }
        }
        resField.setText(chain);
    }
}
