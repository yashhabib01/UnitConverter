package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button0,button1,button2,button3,button4,button5,button6,button7,button8
            ,button9 , button10,buttonC,buttonEqual;
    private EditText editText ;
    private TextView textview_convert_to;
    private Spinner spinner_convertTo, spinner_convertFrom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner_convertFrom = (Spinner) findViewById(R.id.spinner_convertFrom);
         spinner_convertTo = (Spinner) findViewById(R.id.spinner_convertTo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.units_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_convertTo.setAdapter(adapter);
        spinner_convertFrom.setAdapter(adapter);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        editText = (EditText) findViewById(R.id.editTextNumber);
        textview_convert_to = findViewById(R.id.textview_convert_to);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeKeyBoard(view);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String spinner_from =  spinner_convertFrom.getSelectedItem().toString();
                    String spinner_to =  spinner_convertTo.getSelectedItem().toString();
                if(spinner_from.equals(spinner_to)) {
                    textview_convert_to.setText(editText.getText().toString());
                    return;
                }
                         Convert(spinner_from,spinner_to);

            }
        });
    }

    public void Convert(String spinner_from, String Spinner_to){
        Resources res = getResources();
        String[] planets = res.getStringArray(R.array.units_array);



        if(spinner_from.equals(planets[0])){
            if(Spinner_to.equals(planets[3])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i /   1e+6 +"");
                }
            }
            if(Spinner_to.equals(planets[1])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i / 10  +"");
                }
            }
            if(Spinner_to.equals(planets[2])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i / 1000  +"");
                }
            }
        }


        if(spinner_from.equals(planets[1])){
            if(Spinner_to.equals(planets[3])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i /  100000 +"");
                }
            }
            if(Spinner_to.equals(planets[0])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 10  +"");
                }
            }
            if(Spinner_to.equals(planets[2])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i / 100  +"");
                }
            }
        }


        if(spinner_from.equals(planets[2])){
            if(Spinner_to.equals(planets[3])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i / 1000  +"");
                }
            }
            if(Spinner_to.equals(planets[0])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 1000  +"");
                }
            }
            if(Spinner_to.equals(planets[1])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 100  +"");
                }
            }
        }

        if(spinner_from.equals(planets[3])){
            if(Spinner_to.equals(planets[2])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 1000  +"");
                }
            }
            if(Spinner_to.equals(planets[0])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 1e+6  +"");
                }
            }
            if(Spinner_to.equals(planets[1])){
                if(!TextUtils.isEmpty(editText.getText().toString())&& editText.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                    double i  = Double.parseDouble(editText.getText().toString());
                    textview_convert_to.setText( i * 100000  +"");
                }
            }
        }
    }

    public void closeKeyBoard(View view) {
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}