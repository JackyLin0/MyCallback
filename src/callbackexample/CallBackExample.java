/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbackexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lhm05
 */
public class CallBackExample {

     List<Listener> listeners=new ArrayList<>(); 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            CallBackExample callback=new CallBackExample();
            callback.addListener(new EventListener("L1"));
            callback.addListener(new EventListener("L2"));
            callback.trigger("hello");
            callback.trigger("good morning");

    
    }
    
    public void addListener(Listener l)
    {
        listeners.add(l);
    }
    
    public void trigger(String msg)
    {
        for(Listener l:listeners)
        { l.onEvent(msg);
        }
    
    }
}
