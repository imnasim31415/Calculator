package easy.tuto.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView resultTv,solutionTv;
    MaterialButton buttonDel,buttonPer,buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonAnswer,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonDot;

    float mValuOne,mvalueTwo;
    boolean  additon,subtract,multi,div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       resultTv = findViewById(R.id.result_tv);
       solutionTv = findViewById(R.id.solution_tv);


       assignId(buttonDivide,R.id.button_divide);
       assignId(buttonMultiply,R.id.button_multiply);
       assignId(buttonPlus,R.id.button_plus);
       assignId(buttonMinus,R.id.button_minus);
       assignId(buttonAnswer,R.id.button_ANSWER);
       assignId(button0,R.id.button_0);
       assignId(buttonPer,R.id.button_per);
       assignId(button1,R.id.button_1);
       assignId(button2,R.id.button_2);
       assignId(button3,R.id.button_3);
       assignId(button4,R.id.button_4);
       assignId(button5,R.id.button_5);
       assignId(button6,R.id.button_6);
       assignId(button7,R.id.button_7);
       assignId(button8,R.id.button_8);
       assignId(button9,R.id.button_9);
       assignId(buttonDel,R.id.button_DEL);
       assignId(buttonDot,R.id.button_dot);
       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               resultTv.setText(resultTv.getText()+"0");
           }
       });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"1");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+"9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(resultTv.getText()+".");
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTv.setText(  "");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultTv==null){resultTv.setText("");}
                else{
                    mValuOne=Float.parseFloat(resultTv.getText()+"");
                    additon=true;
                    resultTv.setText(null);
                }
            }

        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mValuOne=Float.parseFloat(resultTv.getText()+"");
             subtract=true;
             resultTv.setText(null);
            }

        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValuOne=Float.parseFloat(resultTv.getText()+"");
                multi=true;
                resultTv.setText(null);
            }

        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValuOne=Float.parseFloat(resultTv.getText()+"");
                div=true;
                resultTv.setText(null);
            }

        });
        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo=Float.parseFloat(resultTv.getText()+"");
                if(additon==true){
                    resultTv.setText(mValuOne+mvalueTwo+"");
                    additon=false;
                }
                if(subtract==true){
                    resultTv.setText(mValuOne-mvalueTwo+"");
                    subtract=false;
                }
                if(multi==true){
                    resultTv.setText(mValuOne*mvalueTwo+"");
                    multi=false;
                }
                if(div==true){
                    resultTv.setText(mValuOne/mvalueTwo+"");
                    div=false;
                }

            }

        });


    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}