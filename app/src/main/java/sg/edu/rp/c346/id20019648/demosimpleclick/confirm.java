package sg.edu.rp.c346.id20019648.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class confirm extends AppCompatActivity {

    Button btnClick;
    EditText etInput;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        btnClick = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textviewDisplay);


    }
}