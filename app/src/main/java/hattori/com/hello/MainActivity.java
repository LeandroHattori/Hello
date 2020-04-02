package hattori.com.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnMudarCor;
    private Button btnMudarTexto;
    private TextView txtHello;


    private EditText edtName;
    private Button btnMudarNome;

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnMudarCor = (Button) findViewById(R.id.btnMudaCor);
        btnMudarTexto = (Button) findViewById(R.id.btnMudaTexto);
        txtHello = (TextView) findViewById(R.id.txtHello);


        btnMudarCor.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtHello.setBackgroundColor(Color.parseColor("#0B9AE2"));
            }
        });

        btnMudarTexto.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtHello.setText("Hello Leandro!");
            }
        });






        edtName = (EditText) findViewById(R.id.edtName);
        btnMudarNome = (Button) findViewById(R.id.btnMudarNome);

        btnMudarNome.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String teste = edtName.getText().toString();
                Toast.makeText(getApplicationContext(), teste, Toast.LENGTH_LONG).show();
            }
        });




        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        btnTeste   = (Button) findViewById(R.id.btnTeste);

        btnTeste.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton    = (RadioButton) findViewById(selectedId);

                Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
