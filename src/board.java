public class board {
    char[] a = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    input in = new input();
    char tempX, tempO;

    public void showB() {
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
        System.out.println("\t" + a[0] + "\t" + "||" + "\t" + a[1] + "\t" + "||" + "\t" + a[2] + "\t");
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
        
        System.out.println("------------------------------------------------");
        
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
        System.out.println("\t" + a[3] + "\t" + "||" + "\t" + a[4] + "\t" + "||" + "\t" + a[5] + "\t");
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
        
        System.out.println("------------------------------------------------");
        
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
        System.out.println("\t" + a[6] + "\t" + "||" + "\t" + a[7] + "\t" + "||" + "\t" + a[8] + "\t");
        System.out.println("\t" + " " + "\t" + "||" + "\t" + " " + "\t" + "||" + "\t" + " " + "\t");
    }

    public void PutX() {
        tempX = in.getInX();
        for (int i = 0; i < 9; i++) {
            if (tempX == a[i]) {
                a[i] = 'x';
            }
        }
        showB();
    }

    public void PutO() {
        tempO = in.getInO();
        for (int i = 0; i < 9; i++) {
            if (tempO == a[i]) {
                a[i] = 'o';
            }
        }
        showB();
    }
}
