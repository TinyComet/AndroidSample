package jp.softentertainer.scrolldialog;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected  void onResume(){
        super.onResume();

        ImageScrollDialog scrollDialog = ImageScrollDialog.getInstance("hoge", android.R.drawable.ic_dialog_alert);
        scrollDialog.show(getSupportFragmentManager(),null);
    }
}
