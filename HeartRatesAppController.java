import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.math.RoundingMode;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class HeartRatesAppController {
    private double targetHeartAge20 = 20;
    private double targetHeartAge10= 10;
    private double targetHeartAge30 = 30;
    private double targetHeartAge35 = 35;
    private double targetHeartAge40 = 40;
    private double targetHeartAge45 = 45;
    private double targetHeartAge50 = 50;
    private double targetHeartAge55 = 55;
    private double targetHeartAge60 = 60;
    private double targetHeartAge65 = 65;
    private double targetHeartAge70 = 70;

    private double currentYear=2024;

    @FXML
    private TextField maximumHeartRateTextField;

    @FXML
    private TextField ageTextField;

    //@FXML
    //private Button CalculateButtonPressedButton;

    @FXML
    private TextField heartRateRangeTextField;

    @FXML
    private TextField birthDateTextField;

    @FXML
    public void calculateButtonPressed(ActionEvent event) {
        try {
            double birthDate= new Double(birthDateTextField.getText());
            double age=currentYear-birthDate;
            if (age>targetHeartAge10 && age<=targetHeartAge20) {
                ageTextField.setText("0-20");
                heartRateRangeTextField.setText("100-170 bpm");
                maximumHeartRateTextField.setText("200 bpm");
            }
            if (age>targetHeartAge20 && age<=targetHeartAge30) {
                ageTextField.setText("21-30");
                heartRateRangeTextField.setText("100-170 bpm");
                maximumHeartRateTextField.setText("200 bpm");
            }
            if (age>targetHeartAge30 && age<=targetHeartAge40) {
                ageTextField.setText("31-35");
                heartRateRangeTextField.setText("95-162 bpm");
                maximumHeartRateTextField.setText("190 bpm");
            }
            if (age>targetHeartAge35 && age<=targetHeartAge40) {
                ageTextField.setText("36-40");
                heartRateRangeTextField.setText("93-157 bpm");
                maximumHeartRateTextField.setText("185 bpm");
            }
            if (age>targetHeartAge40 && age<=targetHeartAge45) {
                ageTextField.setText("41-45");
                heartRateRangeTextField.setText("90-153 bpm");
                maximumHeartRateTextField.setText("180 bpm");
            }
            if (age>targetHeartAge45 && age<=targetHeartAge50) {
                ageTextField.setText("46-50");
                heartRateRangeTextField.setText("88-149 bpm");
                maximumHeartRateTextField.setText("175 bpm");
            }
             if (age>targetHeartAge50 && age<=targetHeartAge55) {
                ageTextField.setText("51-55");
                heartRateRangeTextField.setText("85-145 bpm");
                maximumHeartRateTextField.setText("170 bpm");
            }
            if (age>targetHeartAge55 && age<=targetHeartAge60) {
                ageTextField.setText("56-60");
                heartRateRangeTextField.setText("83-140 bpm");
                maximumHeartRateTextField.setText("165 bpm");
            }
            if (age>targetHeartAge60 && age<=targetHeartAge65) {
                ageTextField.setText("61-65");
                heartRateRangeTextField.setText("80-136 bpm");
                maximumHeartRateTextField.setText("160 bpm");
            }
            if (age>targetHeartAge65 && age<=targetHeartAge70) {
                ageTextField.setText("66-70");
                heartRateRangeTextField.setText("78-132 bpm");
                maximumHeartRateTextField.setText("155 bpm");
            }
            if (age>targetHeartAge70 ) {
                ageTextField.setText("Above 70");
                heartRateRangeTextField.setText("75-128 bpm");
                maximumHeartRateTextField.setText("150 bpm");
            }
        }
        catch (NumberFormatException ex) {
            birthDateTextField.setText("Enter your birth year");
            birthDateTextField.selectAll ();
            birthDateTextField.requestFocus ();
        }
        
    }
    public void initialize () {
        targetHeartAge20 = 20;
       /* heartRateRangeTextField.valueProperty().addListener (
            new ChangeListener<Number>() {
                @Override
                public void changed (ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue) {
                    heartRateRange=
                    Bigdecimal.valueOf(newValue.intValue());
                    heartRateRangeTextField.setText (percent.format(heartRateRange));
                }
            });*/
            
    }


}
