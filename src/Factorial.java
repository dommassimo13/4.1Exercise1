import com.sun.codemodel.internal.JOp;

import javax.swing.*;

/**
 * Created by dominicmassimo on 3/30/17.
 */
public class Factorial {
    public static void main(String [] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int count =n;
        //input validation
        if (count==0) {
            n=1;
            JOptionPane.showMessageDialog(null,n);

        } else if(count<0) {
            JOptionPane.showMessageDialog(null,"Input cannot be negative");


        }else {
            while(count>1){
                n*=(count-1);
                count--;
            }
            JOptionPane.showMessageDialog(null,n);
        }


    }
}
