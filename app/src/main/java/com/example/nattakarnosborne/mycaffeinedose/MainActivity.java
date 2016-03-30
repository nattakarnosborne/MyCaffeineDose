package com.example.nattakarnosborne.mycaffeinedose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int coffeeCaffeine =95;
    int decaffCaffeine = 2;
    int espressoCaffeine = 64;
    int instantCaffeine = 31;
    int todayDoseCaffeine = 0;


    int coffeeQuantity =0;
    int decaffQuantity = 0;
    int espressoQuantity = 0;
    int instantQuantity = 0;
    int todayDoseQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void addCoffee(View view) {

        coffeeQuantity = coffeeQuantity + 1;
        displayForCoffeeQuantity(coffeeQuantity);




    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void subCoffee(View view) {


        try{
            if(coffeeQuantity>0){

// if condition is true,do your thing here!
                coffeeQuantity = coffeeQuantity - 1;
                displayForCoffeeQuantity(coffeeQuantity);
                coffeeCaffeine = coffeeQuantity*coffeeCaffeine;

            }
        }catch (NullPointerException e){

//if price is null this part will be executed,in your case leave it blank
            displayForCoffeeQuantity(coffeeQuantity);
        }
        catch (NumberFormatException exception) {
        }



    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void addDecaffeinated(View view) {

        decaffQuantity = decaffQuantity + 1;
        displayForDecaffCoffeeQuantity(decaffQuantity);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void subDecaffeinated(View view) {

        try{
            if(decaffQuantity>0){

// if condition is true,do your thing here!
                decaffQuantity = decaffQuantity - 1;
                displayForDecaffCoffeeQuantity(decaffQuantity);

            }
        }catch (NullPointerException e){

//if price is null this part will be executed,in your case leave it blank
            displayForCoffeeQuantity(decaffQuantity);
        }
        catch (NumberFormatException exception) {
        }




    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void addEspresso(View view) {

        espressoQuantity = espressoQuantity + 1;
        displayForEsspressoQuantity(espressoQuantity);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void subEspresso(View view) {


        try{
            if(espressoQuantity>0){

// if condition is true,do your thing here!
                espressoQuantity = espressoQuantity - 1;
                displayForEsspressoQuantity(espressoQuantity);

            }
        }catch (NullPointerException e){

//if price is null this part will be executed,in your case leave it blank
            displayForCoffeeQuantity(espressoQuantity);
        }
        catch (NumberFormatException exception) {
        }




    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void addInstantCoffee(View view) {

        instantQuantity = instantQuantity + 1;
        displayForinstantQuantity(instantQuantity);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void subInstantCoffee(View view) {

        try{
            if(instantQuantity>0){

// if condition is true,do your thing here!
                instantQuantity = instantQuantity - 1;
                displayForinstantQuantity(instantQuantity);

            }
        }catch (NullPointerException e){

//if price is null this part will be executed,in your case leave it blank
            displayForCoffeeQuantity(instantQuantity);
        }
        catch (NumberFormatException exception) {
        }




    }

    /**
     * This method is a total of caffeine.
     */
    public void todayDoes(View view) {

        int totalDose = coffeeQuantity*95;
        String dose = totalDose;
        displayMyTotalDoes(dose);


    }

    /**
     * Displays the given coffee quantity.
     */
    public void displayForCoffeeQuantity(int quantity) {
        TextView coffeeQuantityView = (TextView) findViewById(R.id.coffeeQuantity);
        coffeeQuantityView.setText("" + quantity);
    }

    public void displayForDecaffCoffeeQuantity(int quantity) {
        TextView decaffQuantityView = (TextView) findViewById(R.id.DecaffeinatedQuantity);
        decaffQuantityView.setText("" + quantity);
    }

    public void displayForEsspressoQuantity(int quantity) {
        TextView esspressoQuantityView = (TextView) findViewById(R.id.espressoQuantity);
        esspressoQuantityView.setText("" + quantity);
    }

    public void displayForinstantQuantity(int quantity) {
        TextView instantQuantityView = (TextView) findViewById(R.id.instantQuantity);
        instantQuantityView.setText("" + quantity);
    }


    public void displayMyTotalDoes(int quantity) {
        TextView myTotalDoseView = (TextView) findViewById(R.id.myTotalDose);
        myTotalDoseView.setText("" + quantity);
    }





}
