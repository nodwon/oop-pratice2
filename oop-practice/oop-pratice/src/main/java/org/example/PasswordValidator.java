package org.example;

import org.jetbrains.annotations.NotNull;

public class PasswordValidator {
    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀 번호는 최소 8자이상이여야한다";

    public static void validate(@org.jetbrains.annotations.NotNull String password) {
        int length = password.length();

        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
        }
    }
    public void validate2(@NotNull PasswordGeneratePolicy passwordGeneratePolicy) {
        String password = passwordGeneratePolicy.generatePassword();

        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
        }
    }



}
