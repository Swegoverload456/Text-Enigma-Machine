import java.util.Random;
import java.util.Scanner;

public class main {

    private static String r;
    private static String b;
    private static String inputM = "";
    private static int r1Num;
    private static int r1Pos;
    private static int r2Num;
    private static int r2Pos;
    private static int r3Num;
    private static int r3Pos;
    private static enigmaMachine m;
    private static boolean encrypt;
    private static boolean random;


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //Asking if you want the rotors randomized
        System.out.println("Type 'Y' if you would like to randomize the Rotors? If not type 'N' ");
        r = in.nextLine();
        if(r.equals("Y") || r.equals("y")){
            random = true;
            genRandomRotorNumbers();
            System.out.println("Rotor 1 #: " + r1Num + " Rotor 1 Pos: " + r1Pos);
            System.out.println("Rotor 2 #: " + r2Num + " Rotor 2 Pos: " + r2Pos);
            System.out.println("Rotor 3 #: " + r3Num + " Rotor 3 Pos: " + r3Pos);
        }
        else if(r.equals("N") || r.equals("n")){
            random = false;
        }
        //Asking if you are encrypting a word or decrypting a word
        System.out.println("Type 'E' if encrypting or 'D' if decrypting:");
        b = in.nextLine();
        if(b.equals("E") || b.equals("e")){
            encrypt = true;
        }
        else if(b.equals("D") || b.equals("d")){
            encrypt = false;
        }
        //Case for the previous action
        if(encrypt) {

            System.out.println("What text would you like to encrypt?");
            inputM = in.nextLine();
            while(!random) {
                System.out.println("What is the number of the 1st rotor?");
                r1Num = in.nextInt();
                System.out.println("What is the position of the 1st rotor?");
                r1Pos = in.nextInt();
                System.out.println("What is the number of the 2nd rotor?");
                r2Num = in.nextInt();
                System.out.println("What is the position of the 2nd rotor?");
                r2Pos = in.nextInt();
                System.out.println("What is the number of the 3rd rotor?");
                r3Num = in.nextInt();
                System.out.println("What is the position of the 3rd rotor?");
                r3Pos = in.nextInt();
                random = true;
            }
                m = new enigmaMachine(inputM, r1Num, r1Pos, r2Num, r2Pos, r3Num, r3Pos);
                System.out.println("Encrypted Result: " + m.magic());
        }
        else if(!encrypt){

            System.out.println("What text would you like to decrypt?");
            inputM = in.nextLine();
            while(!random) {
                System.out.println("What is the number of the 1st rotor?");
                r1Num = in.nextInt();
                System.out.println("What is the position of the 1st rotor?");
                r1Pos = in.nextInt();
                System.out.println("What is the number of the 2nd rotor?");
                r2Num = in.nextInt();
                System.out.println("What is the position of the 2nd rotor?");
                r2Pos = in.nextInt();
                System.out.println("What is the number of the 3rd rotor?");
                r3Num = in.nextInt();
                System.out.println("What is the position of the 3rd rotor?");
                r3Pos = in.nextInt();
                random = true;
            }
                m = new enigmaMachine(inputM, r1Num, r1Pos, r2Num, r2Pos, r3Num, r3Pos);
                System.out.println("Encrypted Result: " + m.magic());
        }

    }

    public static void genRandomRotorNumbers(){

        Random rand = new Random();

        r1Pos = rand.nextInt(26);
        r2Pos = rand.nextInt(26);
        r2Pos = rand.nextInt(26);

        r1Num = rand.nextInt(5);
        r2Num = r1Num;
        r3Num = r1Num;
        while(r2Num == r1Num){

            r2Num = rand.nextInt(5);

        }
        while(r3Num == r2Num || r3Num == r1Num){

            r3Num = rand.nextInt(5);

        }

        r1Num++;
        r2Num++;
        r3Num++;

    }

}

