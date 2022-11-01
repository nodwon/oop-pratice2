package org.example;

public class User {

    private  String password;

    public void initPassword(PasswordGeneratePolicy passwordGenerator){ //랜덤으로 생성되는 컨트롤을 웹에서 주입받아서 사용한다.
    //    RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        if(password.length() >=8 && password.length() <=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
