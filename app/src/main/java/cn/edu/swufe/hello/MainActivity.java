package cn.edu.swufe.hello;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView text1,text2;
    Button btn;
    String str1,str2;
    double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout3);
    }

    @Override
    public void onClick(View btn){
        Log.i("kkkkkkk","onClick:AAAAAAAAA");
        text1 = findViewById(R.id.editText2);
        str1 = text1.getText().toString();
        num = Double.valueOf(str1);
        text2 = findViewById(R.id.textView10);
        if(btn.getId() == R.id.button8)
            num = num * 0.1454;
        if(btn.getId() == R.id.button9)
            num = num * 0.1241;
        if(btn.getId() == R.id.button10)
            num = num * 161.5997;
        str2 = String.valueOf(num);
        text2.setText(str2);
        if(btn.getId() == R.id.button11){
            Intent config = new Intent(this,MainActivity3.class);
            startActivity(config);
        }
    }
/*
    public void btnc(View btn){//法三
        Log.i("kkk","abc:onClicked");
        text1 = findViewById(R.id.editText5);
        str1 = text1.getText().toString();
        num1 = Double.valueOf(str1);
        text2 = findViewById(R.id.editText6);
        str2 = text2.getText().toString();
        num2 = Double.valueOf(str2);
        text3 = findViewById(R.id.textView9);

        if(num1 <= 0 || num1 >= 2.5){
            Toast.makeText(this,"身高有误",Toast.LENGTH_SHORT).show();
        }
        if(num2 <= 5 || num1 >= 200){
            Toast.makeText(this,"体重有误",Toast.LENGTH_SHORT).show();
        }
        else{
            num3 = num2 / num1 / num1;
            num3 = (double)Math.round(num3*100)/100;
            str3 = String.valueOf(num3);
            if(num3 < 18.5)
                str = "偏瘦";
            if(num3 < 24.9 && num3 >= 18.5)
                str = "正常";
            if(num3 >= 24.9)
                str = "超重";
            text3.setText(str3+"。根据您的BMI值，您的体重："+str+"。最理想的体重指数是22。");
        }
    }*/
}
