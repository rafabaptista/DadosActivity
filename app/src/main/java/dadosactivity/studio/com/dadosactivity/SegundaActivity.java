package dadosactivity.studio.com.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = (TextView)findViewById(R.id.textoId);

        Bundle extra = getIntent().getExtras(); //recuperar infos extras que foram passadas no Intent

        if(extra != null){
            String textoPassado = extra.getString("nome");

            texto.setText(textoPassado);
        }
        else
            texto.setText("Nada foi passado!");
    }
}
