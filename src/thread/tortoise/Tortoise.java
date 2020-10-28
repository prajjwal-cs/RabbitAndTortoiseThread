/*   Created by IntelliJ IDEA.
 *   Author: Divyansh Bhardwaj (dbc2201)
 *   Date: 28-10-2020
 *   Time: 19:54
 *   File: Tortoise.java
 */

package thread.tortoise;

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
                case 1:
                    System.out.println("The Tortoise ");
                case 2:
                case 3:
                case 4:
            }
        }
    }
}

