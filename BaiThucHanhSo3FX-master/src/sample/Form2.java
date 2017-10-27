package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Form2 implements Initializable {
    public ComboBox combobox;
    public TextField txtName;
    public JFXButton btnCancel;

    String element[] = {"< 18",
            "18 - 30",
            "31 - 60",
            "> 60"};
    People people = null;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        combobox.getItems().addAll(element);
        combobox.setValue(element[0]);
    }

    public void ClickOk(ActionEvent actionEvent) {
        if (!txtName.getText().equals("")) {
            String old = combobox.getSelectionModel().getSelectedItem().toString();
            people = new People(txtName.getText(), old, Form1.chuyenNganh);
            Main.listPeople.add(people);
            ShowNotification.notificationInformation("Thông báo", "Thêm thành công");
        } else {
            ShowNotification.notificationWarning("Thông báo", "Bạn chưa nhập tên");
        }
    }

    public void ClickCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        // do what you have to do
        stage.close();
    }


}
