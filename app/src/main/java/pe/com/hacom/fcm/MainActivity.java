package pe.com.hacom.fcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.FirebaseApp;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button btn;
    List<Integer> entero= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        FirebaseApp.initializeApp(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //entero.get(2);
                Crashlytics.getInstance().crash(); // Force a crash
            }
        });
    }
}
