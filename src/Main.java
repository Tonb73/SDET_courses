//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean res = registration("ASD_123", "123_F","123_F");
        System.out.println(res);
        BoltActionGun boltActionRifle = new BoltActionGun("Российская империя","M1891",5,true,true);

        boltActionRifle.reload();
        boltActionRifle.shoot();
        boltActionRifle.shoot();
        boltActionRifle.charge();
        boltActionRifle.shoot();
        boltActionRifle.charge();
        boltActionRifle.shoot();
        boltActionRifle.reload();
        boltActionRifle.showGunInfo();

        MachineGunGun machineGun = new MachineGunGun("США", "BAR",30,100);
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.cool();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.reload();
        machineGun.shoot();
        machineGun.showGunInfo();

    }
    public static boolean registration(String login, String password, String confirmPassword){
        try{
            if(login == null){throw new WrongLoginException("Логин не введен");}
            if(login.length() >= 20){throw new WrongLoginException("Логин должен содержать менее 20 символов");}
            if(!login.matches("[A-Za-z0-9_]+")){throw new WrongLoginException("Логин содержит недопустимый символ");}

            if(password == null){throw new WrongPasswordException("Пароль не введен");}
            if(password.length() >= 20){throw new WrongPasswordException("Пароль должен содержать менее 20 символов");}
            if(!password.matches("[A-Za-z0-9_]+")){throw new WrongPasswordException("Пароль содержит недопустимый символ");}

            if(!password.equals(confirmPassword)){throw new WrongPasswordException("Пароли не совпадают");}

        }catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;

        }

        return true;
    }
}