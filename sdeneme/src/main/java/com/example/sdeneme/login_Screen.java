package com.example.sdeneme;

import com.example.sdeneme.backend.Kullanicilar;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class login_Screen {

    @FXML
    private Button giris_butonu;

    @FXML
    private TextField kullaniciadi_giris;

    @FXML
    private PasswordField sifre_giris;

    @FXML
    void anaekrana_gecis(MouseEvent event) {
        String kullaniciID = kullaniciadi_giris.getText();
        String sifre = sifre_giris.getText();
        boolean girisBasarili = false;
        Kullanicilar kullanici1 = new Kullanicilar("Emin","Dinc","1282845","blabla");
        if (kullaniciID.equals(kullanici1.getID()) && sifre.equals(kullanici1.getSifre())) {
            girisBasarili = true;
        }
        Alert alert;
        if (girisBasarili) {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Giriş Başarılı");
            alert.setHeaderText((String)null);
            alert.setContentText("Giriş başarılı!");
            alert.showAndWait();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("anaekran.fxml"));
                Parent root = loader.load();
                main_Screen anaEkranController = loader.getController();
                anaEkranController.setAnaMerhaba(kullanici1.getAd(), kullanici1.getSoyad());
                Stage stage = (Stage) giris_butonu.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ana Sayfa");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            if (kullaniciID.isEmpty() || sifre.isEmpty()) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Eksik Giriş");
                alert.setHeaderText((String)null);
                alert.setContentText("Kullanıcı adı veya şifre boş olamaz!");
                alert.showAndWait();
                return;
            } else if (kullaniciID.equals(kullanici1.getID())) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hatalı Sifre");
                alert.setHeaderText((String)null);
                alert.setContentText("Sifre hatalı! Tekrar deneyin.");
                alert.showAndWait();
                sifre_giris.clear();
                return;
            }
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hatalı Giriş");
            alert.setHeaderText((String)null);
            alert.setContentText("Boyle bir kullanici bulunamadi!!!");
            alert.showAndWait();
            kullaniciadi_giris.clear();
            sifre_giris.clear();
        }
    }
}
