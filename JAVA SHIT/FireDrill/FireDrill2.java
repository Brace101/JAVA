public class FireDrill2{

    public static void main(String[] args) {
        EvenNumbers();
    }

    public static void EvenNumbers() {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }
    }
}

