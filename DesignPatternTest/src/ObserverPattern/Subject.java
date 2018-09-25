package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {        
    private List<Observer> observers = new ArrayList<>();    //״̬�ı�    
    public void setMsg(Integer i) {     
    	System.out.println("This state change: "+i);
        notifyAll(i);    
    }   
     //����    
    public void addAttach(Observer observer) {        
        observers.add(observer);    
    }    
    //֪ͨ���ж��ĵĹ۲���    
    private void notifyAll(Integer i) {        
        for (Observer observer : observers) {            
            observer.update(i);        
        }   
    }
}