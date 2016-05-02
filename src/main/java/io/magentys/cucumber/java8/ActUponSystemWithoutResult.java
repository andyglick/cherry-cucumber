package io.magentys.cucumber.java8;

import io.magentys.Agent;
import io.magentys.Mission;

public class ActUponSystemWithoutResult implements Mission<Agent> {
    @Override
    public Agent accomplishAs(Agent agent) {

        // perform mission here...
             /*
                  ... more code goes here
              */
        // and then:
        return agent;
    }
}
