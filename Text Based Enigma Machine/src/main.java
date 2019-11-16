import java.util.Scanner;

public class main {

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

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Type 'E' if encrypting or 'D' if decrypting:");
        b = in.nextLine();
        if(b.equals("E") || b.equals("e")){
            encrypt = true;
        }
        else if(b.equals("D") || b.equals("d")){
            encrypt = false;
        }
        if(encrypt) {

            System.out.println("What character would you like to encrypt?");
            inputM = in.nextLine();
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
            m = new enigmaMachine(inputM, r1Num, r1Pos, r2Num, r2Pos, r3Num, r3Pos);
            System.out.println("Encrypted Result: " + m.magic());
        }
        else if(!encrypt){

            System.out.println("What character would you like to decrypt?");
            inputM = in.nextLine();
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
            m = new enigmaMachine(inputM, r1Num, r1Pos, r2Num, r2Pos, r3Num, r3Pos);
            System.out.println("Encrypted Result: " + m.magic());

        }

    }

}
