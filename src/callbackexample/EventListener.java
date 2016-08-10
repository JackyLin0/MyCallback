/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbackexample;

/**
 *
 * @author lhm05
 */
public class EventListener implements Listener{
    String name;
    
    public EventListener(String name )
    {       this.name=name; }
    @Override
    public void onEvent(String str) {
        System.out.println(name+":"+str);
    }
    
}
