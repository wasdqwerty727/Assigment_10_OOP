package com.itvdn.junit;

public class StrongPassword {
    public boolean isStrongPassword(String password){
        // ^ represents the starting of the string.
        // (?=.*[a-z]) represent at least one lowercase character.
        // (?=.*[A-Z]) represents at least one uppercase character.
        // (?=.*\\d) represents at least one numeric value.
        // (?=.*[-+_!@#$%^&*., ?]) represents at least one special character.
        // . represents any character except line break.
        // + represents one or more times.
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$");
    }
}
