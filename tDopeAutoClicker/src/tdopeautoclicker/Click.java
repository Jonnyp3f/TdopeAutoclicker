/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdopeautoclicker;

import java.awt.Robot;
import java.awt.event.*;

/*
 * @author Jonathan Lamb
 */
public class Click implements Runnable{

    private Robot robot;

    private int delay;

    private boolean isOn;

    Click(int lengthOfDelay) {
        try {
            this.setDelay(lengthOfDelay);
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
         }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setDelay(int ms) {
        this.delay = ms;
    }

    public void run(){
        try {
            Click click = new Click(delay);
            //Ison determines weather or not the loop should be running
            isOn = true;

            while(isOn == true){

                try{
                    click.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void startClicker(int lengthOfDelay){
        Thread t1 = new Thread(new Click(lengthOfDelay));
        t1.start();

    }

    public boolean stopClicker(){
        setOn(false);
        return isOn;
    }
    public void clickMouse(int button) {
        try {
            robot.mousePress(button);
            robot.delay(200);
            robot.mouseRelease(button);
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
