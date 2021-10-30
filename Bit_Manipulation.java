//Code By : Dileep
package Bit_Manipulation;

public class Bit_Mask {
    public static void main(String args[]){
        //Get Bits in Bit Manipulation
        int n = 5;//0101
        int pos = 3;
        int Bit_Mask = 1<<pos;

        if((Bit_Mask & n)==0){
            System.out.println("Bit is Zero");
        }
        else{
            System.out.println("Bit is One");
        }

        //Set Bits in Bit Manipulation
        int n1 = 5; //0101
        int pos1 = 1;
        int Bit_Mask1 = 1<<pos1;
        int NewNumber = Bit_Mask1 | n1;
        System.out.println("The New Number is: "+NewNumber);

        //Clear Bits in Bit Manipulation
        int n2 = 5; //0101
        int pos2 = 2;
        int Bit_Mask2 = 1<<pos2;
        int NotBit_Mask = ~(Bit_Mask2);
        int NewNumber1 = NotBit_Mask & n2;
        System.out.println("The New Number is: "+NewNumber1);

        //Update the Bits in Bit Manipulation
        int oper = 1;
        //oper=1 : set oper=0 : clear
        int n3 = 5;//0101 -> 0111 -> dec 7
        int pos3 = 1;

        int BitMask3 = 1<<pos3;
        if(oper==1) {
            //set
            int newNumber = BitMask3 | n3;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(BitMask3);
            int newNumber = newBitMask & n3;
            System.out.println(newNumber);
        }

    }
}
