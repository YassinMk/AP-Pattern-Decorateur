module org.yassinmk.cafeshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.yassinmk.cafeshop to javafx.fxml;
    exports org.yassinmk.cafeshop;
    exports org.yassinmk.cafeshop.composant;
    opens org.yassinmk.cafeshop.composant to javafx.fxml;
    exports org.yassinmk.cafeshop.decorator;
    opens org.yassinmk.cafeshop.decorator to javafx.fxml;
}