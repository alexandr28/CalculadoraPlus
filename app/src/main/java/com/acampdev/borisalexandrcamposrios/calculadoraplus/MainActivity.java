package com.acampdev.borisalexandrcamposrios.calculadoraplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public TextView pant;
    public double operando1, operando2, resultado;
    int ope;
    public Button acercade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        pant=(TextView)findViewById(R.id.txt_resultado);
        acercade = (Button) findViewById(R.id.btnacerca);
        acercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acerca = new Intent(MainActivity.this,AcercaDe.class);
                startActivity(acerca);
            }
        });
    }

    public void btn0 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }


    public void btn1 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }

    public void btn2 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }

    public void btn3 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }

    public void btn4 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }

    public void btn5 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }

    public void btn6 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }

    public void btn7 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }

    public void btn8 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }

    public void btn9 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }

    public void btn15 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }

    public void SIN (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"SIN";
        pant.setText(cap);
    }

    public void COS (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"COS";
        pant.setText(cap);
    }
    public void TAN (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"TAN";
        pant.setText(cap);
    }
    public void LOG (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"LOG";
        pant.setText(cap);
    }
    public void btn16 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+"(";
        pant.setText(cap);
    }
    public void btn17 (View v)
    {
        String cap=pant.getText().toString();
        cap=cap+")";
        pant.setText(cap);
    }

    public void suma (View v)

    {
        try{
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);

        } catch (NumberFormatException nfe)
        {

        }

        pant.setText("");
        ope=1;
    }


    public void resta (View v)

    {
        try{
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);

        } catch (NumberFormatException nfe)
        {

        }

        pant.setText("");
        ope=2;
    }

    public void multiplicacion (View v)

    {
        try{
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);

        } catch (NumberFormatException nfe)
        {

        }

        pant.setText("");
        ope=3;
    }


    public void division (View v)

    {
        try{
            String aux1=pant.getText().toString();
            operando1=Double.parseDouble(aux1);

        } catch (NumberFormatException nfe)
        {

        }

        pant.setText("");
        ope=4;
    }


    public void igual (View v)

    {
        try{
            String aux1=pant.getText().toString();
            operando2=Double.parseDouble(aux1);

        } catch (NumberFormatException nfe)
        {

        }

        pant.setText("");

        if(ope==1)
        {
            resultado=operando1+operando2;
        }

        else if(ope==2)
        {
            resultado=operando1-operando2;
        }

        else if(ope==3)
        {
            resultado=operando1*operando2;
        }

        else if(ope==4)
        {
            if (operando2==0)
            {
                pant.setText("Error");
            }
            else
            {
                resultado=operando1/operando2;
            }
        }

        pant.setText(""+resultado);
        operando1=resultado;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
