
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tmail {


    private String emailAddress;

    public Tmail(String emailAddress) throws IllegalArgumentException{

        if (emailAddressIsValid(emailAddress)) {
            this.emailAddress = emailAddress;
        }
        else {
            String errorMessage = emailAddress + " is not a valid email address.";
            throw new IllegalArgumentException(errorMessage);
        }

    }

    public static Tmail fromString(String emailAddress) throws IllegalArgumentException {
        return new Tmail(emailAddress);
    }

    public String toString() {
        return this.emailAddress;
    }

    public static boolean emailAddressIsValid(String emailAddress) {

        boolean isValid = false;

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        Matcher matcher = pattern.matcher(emailAddress);
        isValid = matcher.matches();

        return isValid;
    }

}
