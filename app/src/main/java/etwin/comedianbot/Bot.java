package etwin.comedianbot;

import android.util.Log;

/**
 * Created by probuse on 12/17/17.
 */

public class Bot {
    public final static String creatorName = "etwin";
    // final - means that this attribute is immutable...it can not be
    // changed....it is final....you can't even override it if it is
    // a method.
    // Adding final to methods or variables is really important for when
    // you want to create a line of code or a block of code that you don't
    // want ever changed...ie creatorName above...you wouldn't want anyone
    // changing that.

    // static on the other hand means sharable.
    // it means that this attribute or property or variable is shareable
    // among all instances if this class...and you can not change it for one
    // instance only...this change is always shared by all instances of the class.
    // Using static keyword is great for particular type of data that needs to be
    // shared by entire groups of objects.

    private String name = "ROBOT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void talk(String whatToSay) {
        Log.e(getName(), whatToSay);
    }
}
