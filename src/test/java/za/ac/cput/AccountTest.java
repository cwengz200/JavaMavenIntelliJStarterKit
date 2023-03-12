package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//import org.junit.
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test

    public void testObjectEquality (){
        //public static void main (String args[]){
        Account acc1 = new Account(8567, "Cwenga Dlova", "Cheque");
        Account acc2 = new Account(8567, "Cwenga Dlova", "Cheque");

        System.out.println(acc1.equals(acc2));


        // }
    }
    @Test

    public void testObjectIdentity() {

        Account acc1 = new Account(8567, "Cwenga Dlova", "Cheque");
        Account acc2 = new Account(8567, "Cwenga Dlova", "Cheque");

        assertNotSame(acc1, acc2);
    }
    @Test

    public void testFailingTest(){

        Account acc1 = new Account(8567, "Cwenga Dlova", "Cheque");
        Account acc2 = new Account(8567, "Cwenga Dlova", "Cheque");

        System.out.println(acc1 != acc2);
    }

    @Test
    @Timeout(3000)

    public void testTimeouts() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("This test is timed out!");



    }


    class testDisabledTest{
        @Disabled
        @Test
        Void testWillNotBeExecuted(){

            return null;

        }
        @Test
        void testWillBeExecuted(){

        }
    }

}