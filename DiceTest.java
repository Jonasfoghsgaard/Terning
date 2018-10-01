

import static org.junit.Assert.*;

public class DiceTest {
    Dice testTerning = new Dice();

    @org.junit.Test
    public void roll() {

       int slag =  testTerning.roll();

       assertTrue(slag<7 && slag >0);

    }

    @org.junit.Test
    public void rollMultiple() {


        int [] array = new int [6];
        for (int i = 0; i < 60000;i++){
            int slag = testTerning.roll();
            array[slag-1]++;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[0]+array[1]+array[2]+array[3]+ array[4] + array[5]);

        assertTrue(9600<array[0]&&array[0]<10400);
        assertTrue(9600<array[1]&&array[1]<10400);
        assertTrue(9600<array[2]&&array[2]<10400);
        assertTrue(9600<array[3]&&array[3]<10400);
        assertTrue(9600<array[4]&&array[4]<10400);
        assertTrue(9600<array[5]&&array[5]<10400);
        //Lasse
        //Sersan
        
        //Frederik
    }


}
