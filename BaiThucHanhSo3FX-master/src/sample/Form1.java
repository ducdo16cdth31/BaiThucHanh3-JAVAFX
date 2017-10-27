package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Form1 implements Initializable{
    public ToggleGroup toggleGroup;
    public JFXRadioButton radCNTT;
    public JFXRadioButton radDTVT;
    public JFXRadioButton radKT;
    public JFXRadioButton radCK;
    public JFXRadioButton radXD;
    public JFXRadioButton radMT;
    public TextArea txtArea;
    public JFXButton btnOk;
    public JFXButton btnCancel;
    public static String chuyenNganh = "";
    ArrayList<People> listPeople = new ArrayList<>();
    public void ClickOk(ActionEvent actionEvent) throws IOException {
         if (radCNTT.isSelected()
                || radDTVT.isSelected()
                || radKT.isSelected()
                || radCK.isSelected()
                || radXD.isSelected()
                || radMT.isSelected()) {
             if (radCNTT.isSelected()) {
                 chuyenNganh = radCNTT.getText();
             }
             else if (radDTVT.isSelected()) {
                 chuyenNganh = radDTVT.getText();
             }
             else if (radKT.isSelected()) {
                 chuyenNganh = radKT.getText();
             }
             else if (radKT.isSelected()) {
                 chuyenNganh = radKT.getText();
             }
             else if (radCK.isSelected()) {
                 chuyenNganh = radCK.getText();
             }
             else if (radXD.isSelected()) {
                 chuyenNganh = radXD.getText();
             }
             else if (radMT.isSelected()) {
                 chuyenNganh = radMT.getText();
             }
             Stage form2 = new Stage();
             try {
                 Parent root = FXMLLoader.load(getClass().getResource("form2.fxml"));
                 Scene scene = new Scene(root, 400, 200);
                 scene.getStylesheets().add(getClass().getResource("bt3.css").toExternalForm());
                 form2.setScene(scene);
                 form2.setTitle("Confirm");
                 form2.setResizable(false);
                 form2.initModality(Modality.APPLICATION_MODAL);
                 form2.showAndWait();
                 txtArea.setText(Main.listPeople.toString());
             } catch (IOException e) {
                 e.printStackTrace();
             }
        } else {
             ShowNotification.notificationWarning("Thông báo", "Bạn chưa chọn chuyên ngành");
         }

    }

    public void ClickCancel(ActionEvent actionEvent) {
        clearSelected(radCNTT);
        clearSelected(radDTVT);
        clearSelected(radKT);
        clearSelected(radCK);
        clearSelected(radXD);
        clearSelected(radMT);
        txtArea.clear();

    }

    private void clearSelected(RadioButton rad) {
        rad.setSelected(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }




}
