package utils;

import java.util.Random;

public class Utils {

    /**
     * Génère un identifiant aléatoire sur la base de lettres et de nombres
     * @return un identifiant de 10 caractères
     */
    public String getIdentifiant() {
        // create a string of uppercase and lowercase characters and numbers
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder stringBuilder = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 10;

        for(int i = 0; i < length; i++) {

        // generate random index number
        int index = random.nextInt(characters.length());

        // get character specified by index
        // from the string
        char randomChar = characters.charAt(index);

        // append the character to string builder
        stringBuilder.append(randomChar);
        }

        String randomString = stringBuilder.toString();

        return randomString;

    }

}
