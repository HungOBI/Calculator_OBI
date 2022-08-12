package com.example.calculator_obi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resultTV,solutionTV;
    MaterialButton buttonC;
    MaterialButton buttonDivide,buttonMultiply,buttonMinus,buttonEquals,buttonPlus;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttonDot;
    String solution;
    String result;
    boolean checkDot=false,checkEquals=false;
    double number1,number2,output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV=findViewById(R.id.result_tv);
        solutionTV=findViewById(R.id.solution);
        assignId(buttonC,R.id.buttonC);
        assignId(buttonDivide,R.id.button_device);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonEquals,R.id.button_equals);
        assignId(buttonPlus,R.id.button_plus);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonAC,R.id.button_AC);
        assignId(buttonDot,R.id.button_dot);

    }
    void assignId(MaterialButton btn,int id){

        btn=findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText=button.getText().toString();
        if(buttonText.equals(".")){
            if(!checkEquals){
                if(!checkDot){
                    solution=resultTV.getText().toString();
                    resultTV.setText(solution+".");
                    checkDot=true;
                }

            }
        }
        if(buttonText.equals("0")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"0");
            }

        }
        if(buttonText.equals("1")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"1");
            }

        }
        if(buttonText.equals("2")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"2");
            }

        }
        if(buttonText.equals("3")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"3");
            }

        }
        if(buttonText.equals("4")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"4");
            }

        }
        if(buttonText.equals("5")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"5");
            }

        }
        if(buttonText.equals("6")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"6");
            }

        }
        if(buttonText.equals("7")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"7");
            }

        }
        if(buttonText.equals("8")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"8");
            }

        }
        if(buttonText.equals("9")){
            if(!checkEquals){
                solution=resultTV.getText().toString();
                resultTV.setText(solution+"9");
            }

        }
        if(buttonText.equals("+")){
            if(resultTV.getText()==""){
                number1=0;
                solutionTV.setText("0 + ");
            }else{
                number1=Double.parseDouble(resultTV.getText()+"");
                solutionTV.setText(resultTV.getText().toString()+"+");
            }
            resultTV.setText("");
            solution="";
            result="+";
            checkEquals=false;
            checkDot=false;
        }
        if(buttonText.equals("-")){
            if(resultTV.getText()==""){
                number1=0;
                solutionTV.setText("0 - ");
            }else{
                number1=Double.parseDouble(resultTV.getText()+"");
                solutionTV.setText(resultTV.getText().toString()+"-");
            }
            resultTV.setText("");
            solution="";
            result="-";
            checkEquals=false;
            checkDot=false;
        }
        if(buttonText.equals("*")){
            if(resultTV.getText()==""){
                number1=0;
                solutionTV.setText("0 * ");
            }else{
                number1=Double.parseDouble(resultTV.getText()+"");
                solutionTV.setText(resultTV.getText().toString()+"*");
            }
            resultTV.setText("");
            solution="";
            result="*";
            checkEquals=false;
            checkDot=false;
        }
        if(buttonText.equals("/")){
            if(resultTV.getText()==""){
                number1=0;
                solutionTV.setText("0 / ");
            }else{
                number1=Double.parseDouble(resultTV.getText()+"");
                solutionTV.setText(resultTV.getText().toString()+"/");
            }
            resultTV.setText("");
            solution="";
            result="/";
            checkEquals=false;
            checkDot=false;
        }
        if(buttonText.equals("AC")){
            solutionTV.setText("");
            resultTV.setText("0");
            checkEquals=false;
            checkDot=false;
            return;
        }
        if(buttonText.equals("=")){
            if(!checkEquals){
                checkDot=false;
                solution=resultTV.getText().toString();
                number2=Double.parseDouble(resultTV.getText()+"");
                solutionTV.setText(solutionTV.getText().toString()+resultTV.getText().toString());
                resultTV.setText("");
                if(result=="+"){
                    output=number1+number2;
                }
                else if(result=="-"){
                    output=number1-number2;
                }
                else if(result=="*"){
                    output=number1*number2;
                }
                else if(result=="/"){
                    output=number1/number2;
                }
                checkEquals=true;
                resultTV.setText(output+"");
                return;
            }
            result="";
        }
        if(buttonText.equals("C")){
            if(!checkEquals){
                String val=resultTV.getText().toString();
                if(!val.isEmpty()){
                    val=val.substring(0,val.length()-1);
                    resultTV.setText(val);
                }

            }
        }
    }
}