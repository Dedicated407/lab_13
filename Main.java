package ikbo.lab13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пароль: ");
        String password;
        Scanner scanner = new Scanner(System.in);
        password = scanner.next();
        if (Pattern.matches("[A-z0-9_]{8,}", password) && Pattern.matches(".*[A-Z]+.*", password) &&
                Pattern.matches(".*[a-z]+.*", password) && Pattern.matches(".*[0-9]+.*", password))
                        System.out.println("Nice password");
    }
}
/*
5.	Проверить, надежно ли составлен пароль.
Пароль считается надежным, если он состоит из 8 или более символов.
Где символом может быть цифр, английская буква, и знак подчеркивания.
Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
– пример правильных выражений: F032_Password, TrySpy1(тут 7 символов, ору).
– пример неправильных выражений: smart_pass, A007.
*/
