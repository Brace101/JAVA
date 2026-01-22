import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        
        int randomInt = secureRandom.nextInt(100);
        System.out.println(randomInt);
    }
}

