package com.example.sdeneme;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class main_Screen {

    @FXML
    private Label merhabaLabel;

    @FXML
    private Button cikisbutonu;

    @FXML
    private Button deneybutonu;

    @FXML
    private Button ekipmanliste;

    @FXML
    private Button kimyasalbuton;

    @FXML
    private ListView<String> liste1;

    @FXML
    private ListView<String> liste2;

    public void setAnaMerhaba(String kullaniciAdi, String kullaniciSoyadi) {
        merhabaLabel.setText("Merhaba " + kullaniciAdi + " " + kullaniciSoyadi);
    }

    @FXML
    void deneYap(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("malzemeList.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) deneybutonu.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Deneyden Once!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void ekipmanList(MouseEvent event) {

    }

    @FXML
    void giriseDon(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cikis onayi");
        alert.setHeaderText("Programdan cikmak istediginize emin misiniz?");
        Optional<ButtonType> secim = alert.showAndWait();
        if (secim.isPresent() && secim.get() == ButtonType.OK){
            Stage kapattt = (Stage)cikisbutonu.getScene().getWindow();
            kapattt.close();
        }
    }

    @FXML
    void kimyasalList(MouseEvent event) {

    }

}
