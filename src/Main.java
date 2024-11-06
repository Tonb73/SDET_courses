//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setItem("Предмет");
        System.out.println(stringGenericBox.getItem());

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setItem(123);
        System.out.println(integerGenericBox.getItem());

        BoltActionGun boltActionRifle =
                new BoltActionGun("Российская империя","M1891",5,true,true);

        GenericBox<Gun> gunGenericBox = new GenericBox<>();
        gunGenericBox.setItem(boltActionRifle);
        System.out.println(gunGenericBox.getItem());

        IPredicate<Integer> integerIsDivisibleBy13 = (number -> number % 13 == 0);
        int testNumber1 = 26;
        IPredicate<Float> floatIsDivisibleBy13 = (number -> number % 13 == 0);

        System.out.println(integerIsDivisibleBy13.test(26) + " | " + floatIsDivisibleBy13.test(26f) + " | " + integerIsDivisibleBy13.test(27));

        //IPredicate<String> strIsDivisibleBy13 = (number -> number % 13 == 0);

        IDiscriminant discriminant = ( (a, b, c) -> (b * b) - (4 * a * c) );
        System.out.println("D = " + discriminant.calculate(1.0, 5.0,6.0));

    }
    public static boolean registration(String login, String password, String confirmPassword){
        try{
            if(login == null)
            {throw new WrongLoginException("Логин не введен");}
            if(login.length() >= 20)
            {throw new WrongLoginException("Логин должен содержать менее 20 символов");}
            if(!login.matches("[A-Za-z0-9_]+"))
            {throw new WrongLoginException("Логин содержит недопустимый символ");}

            if(password == null)
            {throw new WrongPasswordException("Пароль не введен");}
            if(password.length() >= 20)
            {throw new WrongPasswordException("Пароль должен содержать менее 20 символов");}
            if(!password.matches("[A-Za-z0-9_]+"))
            {throw new WrongPasswordException("Пароль содержит недопустимый символ");}

            if(!password.equals(confirmPassword))
            {throw new WrongPasswordException("Пароли не совпадают");}

        }catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;

        }

        return true;
    }
}