public class reflector {

    int[][] spaghet;

    reflector(){
        spaghet  = new int[][] {{0, 21}, {1, 10}, {2, 22}, {3, 17}, {4, 6}, {5, 8}, {6, 4}, {7, 19}, {8, 5}, {9, 25}, {10, 1}, {11, 20},
                {12, 18}, {13, 15}, {14, 16}, {15, 13}, {16, 14}, {17, 3}, {18, 12}, {19, 7}, {20, 11}, {21, 0}, {22, 2}, {23, 24}, {24, 23}, {25, 9}};
    }

    int tick(int inp, boolean forward) {

        inp = (inp) % 26;
        if (forward) {
            return spaghet[inp][1];
        } else {
            return spaghet[inp][0];
        }

    }

}
