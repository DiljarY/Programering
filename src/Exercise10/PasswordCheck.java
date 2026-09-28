package Exercise10;

public class PasswordCheck {
    public boolean check(String password) {


        boolean enoughCharachters = false;
        boolean hasDigits = false;
        boolean hasSpecialCharachters = false;

        if (password.length() >=8) {
            enoughCharachters = true;
        }

        for(int i = 0; i <password.length(); i++) {

            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;

            }
        if (!Character.isLetterOrDigit(c)) {
            hasSpecialCharachters = true;

        }

        }

        return enoughCharachters && hasDigits && hasSpecialCharachters;
    }
}
