public class NestedLoopJ {
    public static void main(String[] args) {

        int rows = 10;
//
//        // (a) Left-aligned increasing triangle
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(); // blank line
//
        // (b) Left-aligned decreasing triangle
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // blank line

//        // (c) Right-aligned decreasing triangle
//        for (int i = rows; i >= 1; i--) {
//            for (int space = 1; space <= rows - i; space++) {
//                System.out.print("  ");
//            }
//            for (int star = 1; star <= i; star++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(); // blank line
//
//        // (d) Right-aligned increasing triangle
//        for (int i = 1; i <= rows; i++) {
//            for (int space = 1; space <= rows - i; space++) {
//                System.out.print("  ");
//            }
//            for (int star = 1; star <= i; star++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
}


