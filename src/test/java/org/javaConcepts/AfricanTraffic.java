package org.javaConcepts;

public class AfricanTraffic implements TrafficRules{
    @Override
    public void greenGo() {
       System.out.println("Green signal- Then Go");
    }

    @Override
    public void redStop() {
        System.out.println("Red signal- Then Stop");
    }

    @Override
    public void orangeHalt() {
        System.out.println("Orange signal- Then Slow Down");
    }

    public static void main(String[] args) {
        TrafficRules a = new AfricanTraffic();
        a.greenGo();
        a.orangeHalt();
        a.redStop();
    }
}
