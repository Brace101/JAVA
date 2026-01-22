public class FireDrill3{

    public static void main(String[] args) {
        OddNumbers();
    }

    public static void OddNumbers() {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 != 0) {
                System.out.println(index);
            }
        }
    }
}

