package org.calma.ui.laboratoire3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FichePart1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        Menu menu_1 = new Menu("File");
        Menu menu_2 = new Menu("Edit");
        Menu menu_3 = new Menu("Help");

        MenuBar menu_bar = new MenuBar();
        menu_bar.getMenus().addAll(menu_1, menu_2, menu_3);

        VBox center_vbox = new VBox();

        HBox titre_hbox = new HBox();

        Image img = new Image(FichePart1.class.getResource("img.png").toExternalForm());
        ImageView imgView = new ImageView(img);
        imgView.setFitWidth(60);
        imgView.setPreserveRatio(true);

        Label titre_label = new Label("Fiche descriptive - OPC Corporation");
        titre_label.setFont(Font.font("Arial",FontWeight.BOLD, 16));

        titre_hbox.getChildren().addAll(imgView,titre_label);
        titre_hbox.setSpacing(30);
        titre_hbox.setAlignment(Pos.CENTER_LEFT);
        titre_hbox.setPadding(new Insets(10,10,10,60));

        GridPane input_grid = new GridPane();

        Label input_label_id = new Label("Identifiant");
        Label input_label_prenom = new Label("Prenom");
        Label input_label_nom = new Label("Nom");
        Label input_label_date = new Label("Date Naissance");
        Label input_label_email = new Label("Email");

        TextField input_id = new TextField();
        input_id.setDisable(true);
        TextField input_prenom = new TextField();
        TextField input_nom = new TextField();
        DatePicker input_date_naissance = new DatePicker();
        HBox input_email = new HBox();
        Image img_validation = new Image(FichePart1.class.getResource("email_invalid.png").toExternalForm());
        ImageView img_validation_view = new ImageView(img_validation);
        img_validation_view.setFitWidth(20);
        img_validation_view.setPreserveRatio(true);
        TextField l_input_email = new TextField();
        input_email.getChildren().addAll(l_input_email,img_validation_view);
        input_email.setAlignment(Pos.CENTER_LEFT);

        Label input_departemnt = new Label("Departement(s)");

        HBox box_edit = new HBox();
        VBox box_inclut = new VBox();
        Label label_inclus = new Label("Inclu(s)");
        TextArea text_inclu = new TextArea();
        text_inclu.setPrefSize(120,120);
        box_inclut.getChildren().addAll(label_inclus,text_inclu);
        VBox box_buton = new VBox();
        Button button_left = new Button("<");
        Button button_right = new Button(">");
        box_buton.getChildren().addAll(button_left,button_right);
        VBox box_exclu = new VBox();
        Label label_exclu = new Label("Exclu(s)");
        TextArea text_exclu = new TextArea();
        text_exclu.setPrefSize(120,120);
        box_exclu.getChildren().addAll(label_exclu, text_exclu);

        box_edit.getChildren().addAll(box_inclut ,box_buton,box_exclu);
        box_edit.setAlignment(Pos.CENTER);
        box_edit.setSpacing(20);
        box_buton.setSpacing(10);
        box_buton.setPadding(new Insets(40,10,10,10));


        input_grid.add(input_label_id,0,0);
        input_grid.add(input_label_prenom,0,1);
        input_grid.add(input_label_nom,0,2);
        input_grid.add(input_label_date,0,3);
        input_grid.add(input_label_email,0,4);
        input_grid.add(input_departemnt,0,5);
        input_grid.add(input_id,1,0);
        input_grid.add(input_prenom,1,1);
        input_grid.add(input_nom,1,2);
        input_grid.add(input_date_naissance,1,3);
        input_grid.add(input_email,1,4);
        input_grid.add(box_edit,1,5);

        input_id.setPrefWidth(500);
        l_input_email.setPrefWidth(500);

        input_grid.setHgap(10);
        input_grid.setVgap(10);
        input_grid.setPadding(new Insets(10,10,10,10));


        center_vbox.getChildren().addAll(titre_hbox,input_grid);

        AnchorPane foot = new AnchorPane();
        Button valide_button = new Button("Valider");
        foot.getChildren().addAll(valide_button);
        foot.setPadding(new Insets(10,10,10,10));
        AnchorPane.setRightAnchor(valide_button,0.0);

        root.setCenter(center_vbox);
        root.setTop(menu_bar);
        root.setBottom(foot);

        Scene scene = new Scene(root,640,480);
        stage.setScene(scene);
        stage.setTitle("Laboratoire 3");
        stage.show();
    }
}
