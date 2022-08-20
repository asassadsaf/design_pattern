package com.fkp.principles.open_and_close;

public class SkinTest {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        DefaultSkin defaultSkin = new DefaultSkin();
        UserSkin userSkin = new UserSkin();
        souGouInput.setAbstractSkin(userSkin);
        souGouInput.display();
    }
}
