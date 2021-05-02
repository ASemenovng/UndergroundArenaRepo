package com.company;

import java.awt.event.KeyEvent;

public abstract class Notifier {

    private Notifier next;

    public Notifier linkWith(Notifier next){
        this.next = next;
        return next;
    }

    public abstract boolean check(KeyEvent event);

    protected boolean checkNext(KeyEvent event) {
        if (next == null) {
            return true;
        }
        return next.check(event);
    }

}
