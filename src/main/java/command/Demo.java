package command;

import abstractfactory.ForceUser;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        ForceUser forceUser = new LordVader();
        forceUser.useForces();
    }
}
