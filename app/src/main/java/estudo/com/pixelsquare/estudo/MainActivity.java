package estudo.com.pixelsquare.estudo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view){
        Intent intent = new Intent(this, SegundaActivity.class);

        String msg = "Mensagem Vinda da Primeira Activity";

        intent.putExtra("msg", msg);

        startActivity(intent);
    }
}
