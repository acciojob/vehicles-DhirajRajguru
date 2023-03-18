package com.driver;




public class F1 extends Car {


    public F1(String name, boolean isManual)
    {

        super(name , 4 ,4 , 5 ,isManual ,name ,2);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate)
    {
        int newSpeed ; //set the value of new speed by using currentSpeed and rate
        // setting new speed
        newSpeed = getCurrentSpeed()+rate;

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         * comment tst
         */

        if(newSpeed == 0) {
            super.stop();

            setCurrentGear(1);
            //Stop the car, set gear as 1
        } else if (newSpeed<=50) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);

        } else if (newSpeed<=100) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(2);

        } else if (newSpeed<=150) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);

        } else if (newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);

        } else if (newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);

        } else
        { // newSpeed >250
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);

        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
