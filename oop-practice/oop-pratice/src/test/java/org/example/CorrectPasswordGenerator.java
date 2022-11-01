package org.example;

import org.passay.PasswordData;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "aabbccee";
    }
}
