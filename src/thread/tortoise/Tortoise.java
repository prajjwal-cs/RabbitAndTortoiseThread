/*   Created by IntelliJ IDEA.
 *   Author:Prajjwal Pachauri (cypher0p)
 *   Date: 28-10-2020
 *   Time: 19:54
 *   File: Tortoise.java
 */

package thread.tortoise;

import javax.swing.*;

public class Tortoise implements Runnable {

    private static final int MILESTONE = 5;

    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index2 = 0; index2 < MILESTONE; index2++) {
            switch (index2) {
                case 0:
                    System.out.println("The Tortoise starts from the Start Line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Oak Tree!");
                    System.err.println("The Tortoise is left behind from Rabbit hence Tortoise runs Continue!");
                    try {
                        Thread.sleep(9000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortoise left behind so far!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the Finish Line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has Completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}