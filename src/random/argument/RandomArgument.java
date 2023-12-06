/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.argument;

/**
 *
 * @author Maria
 */
import java.util.*;
public class RandomArgument {

    
    public static void main(String[] args) {
        Random randomNumber = new Random(129867L);
        final int TIMES = 15;
        final int LIMIT = 7;
        
        for(int x = 0; x < TIMES; ++x)
            System.out.print(randomNumber.nextInt(LIMIT)+"");
        System.out.println();
    }
    
}
