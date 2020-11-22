package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Register extends AppCompatActivity {
    EditText fn, ln, pwd, eml, cnct;
    String fn1, ln1, pwd1, eml1, cnct1;
    Button regis;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regis = findViewById(R.id.regis);
        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        cnct = findViewById(R.id.cnct);
        pwd = findViewById(R.id.pwd);
        eml = findViewById(R.id.eml);
        db = FirebaseFirestore.getInstance();

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn1 = fn.getText().toString().trim();
                ln1 = ln.getText().toString().trim();
                pwd1 = pwd.getText().toString().trim();
                eml1 = eml.getText().toString().trim();
                cnct1 = cnct.getText().toString().trim();
                addData(fn1, ln1, pwd1, eml1, cnct1);

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void addData(String fn1, String ln1, String pwd1, String eml1, String cnct1) {
        Registration p = new Registration(fn1, ln1, pwd1, eml1, cnct1);
        db.collection("myapplication")
                .add(p)
                .addOnSuccessListener(documentReference -> Toast.makeText(getApplicationContext(), "Registration Success", Toast.LENGTH_LONG).show())
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Registration Failed", Toast.LENGTH_LONG).show();

                    }
                });
    }
}