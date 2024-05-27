package io.github.wanggui.password;

import io.github.wanggui.md5.MD5Hash;

/**
 * @Author WangGui
 * @Create 2024/5/23 13:25
 */
public class PasswordUtils {

    public static String getPassword(String password){
        if (password == null || password.trim().isEmpty()) return password;
        for (int i = 0; i < 5; i++){
            password = MD5Hash.md5Java(password);
        }
        return password;
    }
}
