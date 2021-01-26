import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Controller {

    @FXML
    private TextField vtField, vnField, p1f, p1t, p2f, p2t, p3f, p3t, p4t,
            p4f, p5t, p5f, p6f, p6t, p7t, p7f, p8t, p8f, sField;

    @FXML
    private Label resLabel;

    @FXML
    private void click() {
        String termSym = vtField.getText();
        String netermSym = vnField.getText();
        String s = sField.getText();
        Map<Character, String> map = new HashMap<>();
        if (!p1f.getText().isEmpty()) map.put(p1f.getText().charAt(0), p1t.getText());
        if (!p2f.getText().isEmpty()) map.put(p2f.getText().charAt(0), p2t.getText());
        if (!p3f.getText().isEmpty()) map.put(p3f.getText().charAt(0), p3t.getText());
        if (!p4f.getText().isEmpty()) map.put(p4f.getText().charAt(0), p4t.getText());
        if (!p5f.getText().isEmpty()) map.put(p5f.getText().charAt(0), p5t.getText());
        if (!p6f.getText().isEmpty()) map.put(p6f.getText().charAt(0), p6t.getText());
        if (!p7f.getText().isEmpty()) map.put(p7f.getText().charAt(0), p7t.getText());
        if (!p8f.getText().isEmpty()) map.put(p8f.getText().charAt(0), p8t.getText());

        Set<Character> v0 = new HashSet<>();
        Set<Character> v1 = new HashSet<>();
        v0.add(p1f.getText().charAt(0));
        while (!v0.isEmpty()) {
            Set v0Copy = new HashSet<>(v0);
            for (Map.Entry<Character, String> entry: map.entrySet()) {
                if (v0.contains(entry.getKey())) {
                    for (int i = 0; i < entry.getValue().length(); i++) {
                        if (netermSym.contains(String.valueOf(entry.getValue().charAt(i))) && !v1.contains(entry.getValue().charAt(i))) {
                            v0.add(entry.getValue().charAt(i));
                        }
                    }
                    v0.remove(entry.getKey());
                    v1.add(entry.getKey());
                }
            }
            for (Character c: (HashSet<Character>)((HashSet<Character>) v0).clone()) {
                if (v0Copy.contains(c)) v0.remove(c);
            }
        }
        StringBuilder res = new StringBuilder("Недостижимые символы: ");
        for (int i = 0; i < netermSym.length(); i++) {
            if (!v1.contains(netermSym.charAt(i))) {
                res.append(netermSym.charAt(i));
            }
        }
        if (res.length() == 22) {
            resLabel.setText("Недостижимых символов нет");
        } else {
            resLabel.setText(res.toString());
        }
    }
}
