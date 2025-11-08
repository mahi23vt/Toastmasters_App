package com.example.toastmasters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {
    EditText usernamelabeltext;
    EditText passwordlabeltext;
    Button loginbutton;

    CheckBox remembermecheckbox;
    boolean isRemember=false;
    String usernameString;
    String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        usernamelabeltext = findViewById(R.id.usernameEditText);
        passwordlabeltext = findViewById(R.id.passwordEditText);
        loginbutton = findViewById(R.id.loginbutton);
        remembermecheckbox = findViewById(R.id.rememberme);
        usernameString = usernamelabeltext.getText().toString();
        passwordString = passwordlabeltext.getText().toString();

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernameString == null || passwordString == null)
                    Toast.makeText(Login.this, "Username or Password is missing", Toast.LENGTH_SHORT).show();
                else
                    if(remembermecheckbox.isChecked())
                    {
                        Toast.makeText(Login.this, "username and Password saved", Toast.LENGTH_SHORT).show();
                    }
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}