/*   Created by IntelliJ IDEA.
 *   Author: Divyansh Bhardwaj (dbc2201)
 *   Date: 28-10-2020
 *   Time: 19:45
 *   File: Main.java
 */

package main;

import thread.rabbit.Rabbit;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
    }
}

