/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 4/8/2021
 *   Time: 1:52 PM
 *   File: Hanoi.java
 */

import java.util.Scanner;

public class Hanoi {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            shift(n, 'A', 'A', 'D');
        }

        public static void shift(int n, char s, char a, char d) {

            if (n >= 1) {

                shift(n - 1, s, d, a);
                System.out.println(n + " " + s + "  " + d);
                shift(n - 1, a, s, d);

            }
        }
    }



