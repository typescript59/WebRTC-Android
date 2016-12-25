package mmstart0312.com.webrtc_android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences AppInfo;
    private String deviceToken_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppInfo = getApplication().getSharedPreferences("AppInfo", MODE_PRIVATE);
        deviceToken_string = AppInfo.getString("deviceToken","");

        if (deviceToken_string != "") {
            Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
            startActivity(intent);
        } else{
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        }
    }
}
