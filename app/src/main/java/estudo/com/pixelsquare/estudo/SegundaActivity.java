package estudo.com.pixelsquare.estudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        String msg = getIntent().getStringExtra("msg");

        TextView txt = (TextView) findViewById(R.id.txt);

        txt.setText(msg);
    }
}
