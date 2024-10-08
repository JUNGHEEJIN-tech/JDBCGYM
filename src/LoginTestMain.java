import Gym.Logic.Common.Input;
import Gym.Logic.Logic.LoginManager;
import Gym.Logic.Logic.ShowManager;

public class LoginTestMain {
    public static void main(String[] args) {

        ShowManager.getInstance().showMainScreen();

        String select = Input.stringScan();

        switch(select)
        {
            case "1":
            {
                LoginManager.getInstance().tryTrainerLogin();
                break;
            }
            case "2":
            {
                LoginManager.getInstance().tryMemberLogin();
                break;
            }
            case "3":
            {
                //LoginManager.getInstance().tryJoin();
                break;
            }
        }

        LoginManager.getInstance().tryTrainerLogin();
    }

}
