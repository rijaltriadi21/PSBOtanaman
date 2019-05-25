package app.tokoonline.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import app.tokoonline.R;

public class Login extends AppCompatActivity {

    TextView txtSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtSignup = findViewById(R.id.txtSignup);
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Signup.class));
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Masuk");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
