import com.google.gson.Gson;
import model.User;
import org.json.JSONException;
import org.json.JSONObject;

public class Application {
    public static void main(String[] args) throws JSONException {
        Gson gson = new Gson();
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("firstName","farzad");
        jsonObject.put("userName","farzadAfi");
        jsonObject.put("password","afi");

        User user = gson.fromJson(String.valueOf(jsonObject),User.class);

        System.out.println(user);
    }
}
