/*
2- Show the for statement for a loop that counts from 1000 to 0 by –2.
Output
1000 998 ... 4 2
*/
package daytree;
public class DayTreeProblem1Ex2 {

    public static void main(String[] args) {
        for (int i=1000; i>=0; i--){
            System.out.print(" " + i--);
        }
    }
    
}
