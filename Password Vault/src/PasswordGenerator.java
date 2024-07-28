import java.util.Random;

public class PasswordGenerator {
    private static final String CHARCTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|:;<>,.?/";

    public String generatePassword(int length){
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i< length ;i++)
        {
            int index = random.nextInt(CHARCTERS.length());
            password.append(CHARCTERS.charAt(index));
        }
        return password.toString();
    }


}
