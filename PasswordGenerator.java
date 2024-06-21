import java.util.Random;

// password generation part
public class PasswordGenerator
 {
    //characters/numbers/symbols to be used in password
    public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "012345679";
    public static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>/?";

    private final Random random;

    public PasswordGenerator()
    {
        random = new Random();
    }

    public String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers,
                                    boolean includeSpecialSymbols)
    {   
        StringBuilder passwordBuilder = new StringBuilder();

        String validCharacters = "";
        if(includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
        if(includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
        if(includeNumbers) validCharacters += NUMBERS;
        if(includeSpecialSymbols) validCharacters += SPECIAL_SYMBOLS;

        for(int i = 0; i < length; i++)
        {
            int randomIndex = random.nextInt(validCharacters.length());
            char randomChar = validCharacters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}

