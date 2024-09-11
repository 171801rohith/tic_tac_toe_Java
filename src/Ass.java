public class Ass {
    public Ass() {
        int i;
        int count = 0;
        board bo = new board();
        bo.showB();
        for (i = 0; i < 9; i++) {
            if (!((bo.a[0] == bo.a[1] && bo.a[1] == bo.a[2]) || (bo.a[3] == bo.a[4] && bo.a[4] == bo.a[5])
                    || (bo.a[6] == bo.a[7] && bo.a[7] == bo.a[8]) || (bo.a[0] == bo.a[3] && bo.a[3] == bo.a[6])
                    || (bo.a[1] == bo.a[4] && bo.a[4] == bo.a[7]) || (bo.a[2] == bo.a[5] && bo.a[5] == bo.a[8])
                    || (bo.a[0] == bo.a[4] && bo.a[4] == bo.a[8]) || (bo.a[2] == bo.a[4] && bo.a[4] == bo.a[6]))
                    && (i % 2 == 0)) {
                bo.PutX();
                count = 2;
            } else if (!((bo.a[0] == bo.a[1] && bo.a[1] == bo.a[2]) || (bo.a[3] == bo.a[4] && bo.a[4] == bo.a[5])
                    || (bo.a[6] == bo.a[7] && bo.a[7] == bo.a[8]) || (bo.a[0] == bo.a[3] && bo.a[3] == bo.a[6])
                    || (bo.a[1] == bo.a[4] && bo.a[4] == bo.a[7]) || (bo.a[2] == bo.a[5] && bo.a[5] == bo.a[8])
                    || (bo.a[0] == bo.a[4] && bo.a[4] == bo.a[8]) || (bo.a[2] == bo.a[4] && bo.a[4] == bo.a[6]))
                    && (i % 2 != 0)) {
                bo.PutO();
                count = 4;
            } else{
                break;
            }

        }
        if (i == 9) {
            System.out.println("Draw :(");
        } else if (count == 2) {
            System.out.println("Player X wins :)");
        } else if (count == 4) {
            System.out.println("Player O wins :)");
        }
    }
}
