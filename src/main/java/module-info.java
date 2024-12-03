module org.example.pixelart {
  requires javafx.controls;
  requires javafx.fxml;


  opens org.example.pixelart to javafx.fxml;
  exports org.example.pixelart;
}