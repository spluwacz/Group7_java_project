package dansverdlov.week9;

public class PasswordValidation_DS {

    public static void main(String[] args) {
        String password = "Passw0rd!";
        System.out.println("Is the password valid? : " + isValidPassword(password));
    }

    public static boolean isValidPassword(String password) {
        // Check if the password is at least 6 characters long
        if (password.length() < 6) {
            return false;
        }

        // Check if the password contains any spaces
        if (password.contains(" ")) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Loop through each character of the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true if all conditions are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }


}
