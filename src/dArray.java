public class dArray {
    public static void main(String[] args) {
        int[] marks;//1-d array
        int[][] flats;//2d array
        flats = new int[2][3];
        flats[0][0] = 001;
        flats[0][2] = 002;
        flats[0][2] = 003;
        flats[1][0] = 100;
        flats[1][2] = 102;
        System.out.println("print 2d array:");
        for (int i = 0; i < flats.length; i++) {
for (int j=0;j<flats[i].length;j++){
    System.out.print(flats[i][j]);
    System.out.print("  ");
}
            System.out.println("  ");
        }
    }
}


