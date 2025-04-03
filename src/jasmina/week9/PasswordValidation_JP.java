package jasmina.week9;

public class PasswordValidation_JP {

    public static void main(String[] args) {
        System.out.println(validPassword("Password"));
        System.out.println(validPassword("password"));
        System.out.println(validPassword("PASSWORD"));
        System.out.println(validPassword("Password12"));
        System.out.println(validPassword("Password*"));
        System.out.println(validPassword("Password1*"));
    }


    public static boolean validPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        String specialChars = "!@#$&*";

        for(char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;

            }else if (Character.isLowerCase(c)) {
                hasLowerCase = true;

            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;

            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}
/*  String -- Password Validation Task
Write a return method that can verify if a password is valid or not.

Requirements:
Password MUST be at least have 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit

If all requirements above are met, the method returns true, otherwise returns false. */