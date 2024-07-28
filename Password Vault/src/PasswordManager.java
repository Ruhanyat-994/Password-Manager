import java.io.FileWriter;
import java.io.IOException;

public class PasswordManager {
    private PasswordGenerator passwordGenerator;

    public PasswordManager(){
        passwordGenerator = new PasswordGenerator();

    }

    public void createAndStorePassword (int length, String website)
    {
        String password = passwordGenerator.generatePassword(length);
        storePassword(website,password);
    }

    private void storePassword(String website,String  password)
    {
        try (FileWriter writer = new FileWriter("auraPass.txt",true))
        {

            writer.write(website + " : " + password+System.lineSeparator());
            System.out.println("++++++++++++Password Saved Successfully++++++++++++");

        }catch(IOException e){
            System.out.println("------------An error occured when saving the Passsword!!!------------");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage: java PasswordManager <length> <website>");
            return;
        }
        try {
            int length = Integer.parseInt(args[0]);
            String website = args[1];

            PasswordManager manager = new PasswordManager();
            manager.createAndStorePassword(length,website);

        }catch (NumberFormatException e){
            System.out.println("Invalid length. Please enter a valid number.");
        }
    }
}
