package com.example.yamak.tictacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int tik=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        View.OnClickListener oc=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button gelen=(Button) v;
                if(gelen.getText().toString().equals("")){
                    if(tik==1){
                        gelen.setText("x");
                        tik=2;
                    }else{
                        gelen.setText("o");
                        tik=1;
                    }

                }
                controlToWin();

            }
        };
        b1.setOnClickListener(oc);
        b2.setOnClickListener(oc);
        b3.setOnClickListener(oc);
        b4.setOnClickListener(oc);
        b5.setOnClickListener(oc);
        b6.setOnClickListener(oc);
        b7.setOnClickListener(oc);
        b8.setOnClickListener(oc);
        b9.setOnClickListener(oc);


    }
    public  void controlToWin(){
        boolean kazandi=false;
        if(b1.getText().toString().equals(b2.getText().toString())&&
                b2.getText().toString().equals(b3.getText().toString())&&
                !b3.getText().toString().equals(""))
            kazandi=true;
        else if(b4.getText().toString().equals(b5.getText().toString())&&
                b5.getText().toString().equals(b6.getText().toString())&&
                !b6.getText().toString().equals(""))
            kazandi=true;
        else if(b7.getText().toString().equals(b8.getText().toString())&&
                b8.getText().toString().equals(b9.getText().toString())&&
                !b9.getText().toString().equals(""))
            kazandi=true;
        else if(b1.getText().toString().equals(b4.getText().toString())&&
                b4.getText().toString().equals(b7.getText().toString())&&
                !b7.getText().toString().equals(""))
            kazandi=true;
        else if(b2.getText().toString().equals(b5.getText().toString())&&
                b5.getText().toString().equals(b8.getText().toString())&&
                !b8.getText().toString().equals(""))
            kazandi=true;
        else if(b3.getText().toString().equals(b6.getText().toString())&&
                b6.getText().toString().equals(b9.getText().toString())&&
                !b9.getText().toString().equals(""))
            kazandi=true;
        else if(b1.getText().toString().equals(b5.getText().toString())&&
                b5.getText().toString().equals(b9.getText().toString())&&
                !b9.getText().toString().equals(""))
            kazandi=true;
        else if(b3.getText().toString().equals(b5.getText().toString())&&
                b5.getText().toString().equals(b7.getText().toString())&&
                !b7.getText().toString().equals(""))
            kazandi=true;

        if (kazandi)
            Toast.makeText(MainActivity.this,"kazandın",Toast.LENGTH_SHORT).show();






    }
}
