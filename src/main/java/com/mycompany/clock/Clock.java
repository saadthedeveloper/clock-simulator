/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clock;

/**
 *
 * @author MKAY
 */
public class Clock {

    public static void main(String[] args) {
        
        for(int hours = 0; hours <= 12; hours++)
        {
            for(int minutes = 0; minutes <= 59; minutes++)
            {
                for(int seconds = 0; seconds <= 59; seconds++)
                {
                     System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }
      
    }
}
