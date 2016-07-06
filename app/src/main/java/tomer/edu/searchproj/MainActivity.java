package tomer.edu.searchproj;

import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    ImageButton btnYoutube;
    ImageButton btnGoogleSearch;
    ImageButton btnAndroidDev;
    Button btnDial;
    Button btnWebpage;
    Button btnMap;
    Button btnAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.edtText);
        btnYoutube = (ImageButton) findViewById(R.id.btnYoutube);
        btnGoogleSearch = (ImageButton) findViewById(R.id.btnGoogleSearch);
        btnAndroidDev = (ImageButton) findViewById(R.id.btnAndroidDev);
        btnDial = (Button) findViewById(R.id.btnDial);
        btnWebpage = (Button) findViewById(R.id.btnWebpage);
        btnMap = (Button) findViewById(R.id.btnMap);
        btnAlarm = (Button) findViewById(R.id.btnSetalarm);
    }


    public void showYouTube(View view) {
        Uri data = Uri.parse("https://www.youtube.com/results?search_query=" + edtText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW,data);
        startActivity(intent);
    }

    public void showGoogle(View view) {
        Uri data = Uri.parse("https://www.google.co.il/search?q=" + edtText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW,data);
        startActivity(intent);
    }

    public void showAndroid(View view) {
        Uri data = Uri.parse("https://developer.android.com/index.html#q=" + edtText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW,data);
        startActivity(intent);
    }

    public void showDial(View view) {
        Uri data = Uri.parse("tel://0507123012");
        Intent intent = new Intent(Intent.ACTION_DIAL, data);
        startActivity(intent);
    }


    public void showWebpage(View view) {
        Uri data = Uri.parse("https://developer.android.com/index.html#q=intent");
        Intent intent = new Intent(Intent.ACTION_VIEW,data);
        startActivity(intent);
    }



    public void ShowMap(View view) {
        Uri data = Uri.parse("geo:32.0455057,34.9093156?z=17");
        //Uri data = Uri.parse("geo:47.6,-122.3");
        //Uri data = Uri.parse("geo:0,0?q=Ashdod");
        //Uri data = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA");
        Intent intent = new Intent(Intent.ACTION_VIEW,data);
       /* if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }*/
        startActivity(intent);
    }


    public void setAlarm(View v) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_HOUR, 22);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 20);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Call Mom!");
        startActivity(intent);
    }
}

