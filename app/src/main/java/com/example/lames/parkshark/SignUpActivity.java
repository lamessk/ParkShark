package com.example.lames.parkshark;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
//import android.support.design.widget.Snackbar;
//import android.support.design.widget.TextInputLayout;


public class SignUpActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextFullName;
    EditText editTextAddress;
    EditText editTextLicensePlate;
//
//    TextInputLayout textInputLayoutAddress;
//    TextInputLayout textInputLayoutEmail;
//    TextInputLayout textInputLayoutPassword;
//    TextInputLayout textInputLayoutFullName;
//    TextInputLayout textInputLayoutLicensePlate;

    ImageButton backButton;

    Button buttonFinish;

    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        dbHandler = new DBHandler(this);
        initTextViewLogin();
        initViews();
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (validate()) {
//                    String FullName = editTextFullName.getText().toString();
//                    String LicensePlate = editTextLicensePlate.getText().toString();
//                    String Address = editTextAddress.getText().toString();
//                    String Email = editTextEmail.getText().toString();
//                    String Password = editTextPassword.getText().toString();
//
//                    //Check in the database is there any user associated with  this email
//                    if (!dbHandler.isEmailExists(Email)) {
//
//                        //Email does not exist now add new user to database
//                        dbHandler.addUser(new User(null, FullName, Address, LicensePlate,Password));
//                        Snackbar.make(buttonFinish, "User created successfully! Please Login ", Snackbar.LENGTH_LONG).show();
//                        new Handler().postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//                                finish();
//                            }
//                        }, Snackbar.LENGTH_LONG);
//                    }else {
//
//                        //Email exists with email input provided so show error user already exist
//                        Snackbar.make(buttonFinish, "User already exists with same email ", Snackbar.LENGTH_LONG).show();
//                    }


//                }
            }
        });
    }


    //this method used to set Login TextView click event
    private void initTextViewLogin() {
        TextView textViewLogin = (TextView) findViewById(R.id.textViewLogin);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initViews() {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        editTextLicensePlate = (EditText) findViewById(R.id.editTextLicensePlate);
        editTextFullName = (EditText) findViewById(R.id.editTextFullName);


        backButton = (ImageButton) findViewById(R.id.buttonBack2);

        buttonFinish = (Button) findViewById(R.id.buttonFinish);

    }

    //This method is used to validate input given by user
    public boolean validate() {
        boolean valid = false;

        //Get values from EditText fields
        String FullName = editTextFullName.getText().toString();
        String LicensePlate = editTextLicensePlate.getText().toString();
        String Address = editTextAddress.getText().toString();
        String Email = editTextEmail.getText().toString();
        String Password = editTextPassword.getText().toString();

        //Handling validation for UserName field
//        if (FullName.isEmpty()) {
//            valid = false;
//            textInputLayoutFullName.setError("Please enter valid name!");
//        } else {
//            if (FullName.length() > 5) {
//                valid = true;
//                textInputLayoutFullName.setError(null);
//            } else {
//                valid = false;
//                textInputLayoutFullName.setError("Full Name is to short!");
//            }
//        }
//
//        //Handling validation for Email field
//        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
//            valid = false;
//            textInputLayoutEmail.setError("Please enter valid email!");
//        } else {
//            valid = true;
//            textInputLayoutEmail.setError(null);
//        }
//
//        //Handling validation for Password field
//        if (Password.isEmpty()) {
//            valid = false;
//            textInputLayoutPassword.setError("Please enter valid password!");
//        } else {
//            if (Password.length() > 5) {
//                valid = true;
//                textInputLayoutPassword.setError(null);
//            } else {
//                valid = false;
//                textInputLayoutPassword.setError("Password is to short!");
//            }
//        }


        return valid;
    }
}