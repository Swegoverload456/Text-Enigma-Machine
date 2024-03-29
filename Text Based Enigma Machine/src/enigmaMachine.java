import java.util.ArrayList;

public class enigmaMachine {

    rotor r1;
    rotor r2;
    rotor r3;
    reflector r = new reflector();
    String t;

    enigmaMachine(String text, int r1n, int r1p, int r2n, int r2p, int r3n, int r3p){

        r1 = new rotor(r1n, r1p);
        r2 = new rotor(r2n, r2p);
        r3 = new rotor(r3n, r3p);
        r = new reflector();
        t = text;

    }

    String magic(){

        String s = "";
        for(int i = 0; i < t.length(); i++){

            s += enigma(stringToInt(t).get(i));

        }
        return s;

    }
    ArrayList<Integer> stringToInt(String in){

        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < in.length(); i++){

            a.add(charToInt(in.charAt(i)));

        }
        return a;

    }
    char enigma(int i){

        int inp = i;
        i = r1.tick(inp, true);
        i = r2.tick(i, true);
        i = r3.tick(i, true);
        i = r.tick(i, true);
        i = r3.tick(i, false);
        i = r2.tick(i, false);
        i = r1.tick(i, false);
        if(i == -1){
            System.out.println(r1.pos + r2.pos + r3.pos);
        }

        if(i == inp){
            System.out.println(inp + r1.pos + r2.pos + r3.pos);
        }
        moveRotors();

        return intToChar(i);

    }
    void moveRotors() {
        r1.pos +=1;
        if (r1.pos == 26) {
            r1.pos = 0;
            r2.pos+=1;
            if (r2.pos == 26) {
                r2.pos = 0;
                r3.pos+=1;
                if (r3.pos == 26) {
                    r3.pos = 0;
                }
            }
        }
    }
    char intToChar(int a){

        char c = ' ';

        if(a == 0){

            c = 'A';

        }
        if(a == 1){

            c = 'B';

        }
        if(a == 2){

            c = 'C';

        }
        if(a == 3){

            c = 'D';

        }
        if(a == 4){

            c = 'E';

        }
        if(a == 5){

            c = 'F';

        }
        if(a == 6){

            c = 'G';

        }
        if(a == 7){

            c = 'H';

        }
        if(a == 8){

            c = 'I';

        }
        if(a == 9){

            c = 'J';

        }
        if(a == 10){

            c = 'K';

        }
        if(a == 11){

            c = 'L';

        }
        if(a == 12){

            c = 'M';

        }
        if(a == 13){

            c = 'N';

        }
        if(a == 14){

            c = 'O';

        }
        if(a == 15){

            c = 'P';

        }
        if(a == 16){

            c = 'Q';

        }
        if(a == 17){

            c = 'R';

        }
        if(a == 18){

            c = 'S';

        }
        if(a == 19){

            c = 'T';

        }
        if(a == 20){

            c = 'U';

        }
        if(a == 21){

            c = 'V';

        }
        if(a == 22){

            c = 'W';

        }
        if(a == 23){

            c = 'X';

        }
        if(a == 24){

            c = 'Y';

        }
        if(a == 25){

            c = 'Z';

        }

        return c;

    }
    int charToInt(char a){

        int num = 26;

        if(a == 'A' || a == 'a'){
            num = 0;
        }
        if(a == 'B' || a == 'b'){
            num = 1;
        }
        if(a == 'C' || a == 'c'){
            num = 2;
        }
        if(a == 'D' || a == 'd'){
            num = 3;
        }
        if(a == 'E' || a == 'e'){
            num = 4;
        }
        if(a == 'F' || a == 'f'){
            num = 5;
        }
        if(a == 'G' || a == 'g'){
            num = 6;
        }
        if(a == 'H' || a == 'h'){
            num = 7;
        }
        if(a == 'I' || a == 'i'){
            num = 8;
        }
        if(a == 'J' || a == 'j'){
            num = 9;
        }
        if(a == 'K' || a == 'k'){
            num = 10;
        }
        if(a == 'L' || a == 'l'){
            num = 11;
        }
        if(a == 'M' || a == 'm'){
            num = 12;
        }
        if(a == 'N' || a == 'n'){
            num = 13;
        }
        if(a == 'O' || a == 'o'){
            num = 14;
        }
        if(a == 'P' || a == 'p'){
            num = 15;
        }
        if(a == 'Q' || a == 'q'){
            num = 16;
        }
        if(a == 'R' || a == 'r'){
            num = 17;
        }
        if(a == 'S' || a == 's'){
            num = 18;
        }
        if(a == 'T' || a == 't'){
            num = 19;
        }
        if(a == 'U' || a == 'u'){
            num = 20;
        }
        if(a == 'V' || a == 'v'){
            num = 21;
        }
        if(a == 'W' || a == 'w'){
            num = 22;
        }
        if(a == 'X' || a == 'x'){
            num = 23;
        }
        if(a == 'Y' || a == 'y'){
            num = 24;
        }
        if(a == 'Z' || a == 'z'){
            num = 25;
        }

        return num;

    }

}
