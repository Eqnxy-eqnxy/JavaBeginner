package Java.Basic;

public class Data2 {

    public static void main(String[] args) {

        String str = "I like Java!!!";

        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит \"Java\": " + containsJava);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Строка начинается с \"I like\": " + startsWithILike);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Строка заканчивается на \"!!!\": " + endsWithExclamation);

        if (containsJava && startsWithILike && endsWithExclamation) {
            String upperCaseStr = str.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseStr);
        }

        String replacedStr = str.replace('a', 'o');
        String subStr = replacedStr.substring(7, 11);
        System.out.println("Замененная строка: " + replacedStr);
        System.out.println("Подстрока \"Jovo\": " + subStr);
    }
}