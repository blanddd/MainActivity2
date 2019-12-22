package com.example.mainactivity;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class radix extends AppCompatActivity {
    String head;
    String result;
    private RadioButton tworadix;
    private RadioButton eightradix;
    private  RadioButton tenradix;
    private RadioButton sixteenradix;
    private RadioButton tworadix1;
    private RadioButton eightradix1;
    private  RadioButton tenradix1;
    private RadioButton sixteenradix1;
    private RadioGroup lengthgroup1;
    private RadioGroup lengthgroup;
    public int chooseone;
    public int choosetwo;
    private StringBuilder show_equation = new StringBuilder();//显示运算式
    private int signal = 0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radix);
        Button radix = (Button) findViewById(R.id.radix);
        Button volume = (Button) findViewById(R.id.volume);
        Button zero = (Button) findViewById(R.id.zero);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button back = (Button) findViewById(R.id.back);
        Button length = (Button) findViewById(R.id.length);
        lengthgroup1 = findViewById(R.id.lengthGroup1);
        lengthgroup = findViewById(R.id.lengthGroup);
        tworadix =(RadioButton)findViewById(R.id.tworadix);
        eightradix=(RadioButton)findViewById(R.id.eightradix);
        tenradix=(RadioButton)findViewById(R.id.tenradix);
        sixteenradix=(RadioButton)findViewById(R.id.sixteenradix);
        tworadix1 =(RadioButton)findViewById(R.id.tworadix1);
        eightradix1=(RadioButton)findViewById(R.id.eightradix1);
        tenradix1=(RadioButton)findViewById(R.id.tenradix1);
        sixteenradix1=(RadioButton)findViewById(R.id.sixteenradix1);
        final TextView genderRusult = (TextView) findViewById(R.id.output);
        final EditText result =  (EditText)findViewById(R.id.input);
        head = genderRusult.getText().toString();
        Button equal =(Button)findViewById(R.id.equal);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(radix.this, MainActivity.class);
                startActivity(intent);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(radix.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(radix.this, volume.class);
                startActivity(intent);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(show_equation.toString().equals("0"))) {
                    if (signal == 0) {
                        show_equation.append("0");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    } else {
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("0");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        signal = 0;
                    }
                }
            }
        });
        one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (signal == 0) {
                            show_equation.append("1");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        } else {
                            show_equation.delete(0, show_equation.length());
                            show_equation.append("1");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                            signal = 0;
                        }
                    }
                });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!show_equation.toString().equals("")) {
                    String number = result.getText().toString();
                    double number1 = Double.parseDouble(number);


                }
            }
        });
        /*static char chs[] = new char[36];
        static {
            for(int i = 0; i < 10 ; i++) {
                chs[i] = (char)('0' + i);
            }
            for(int i = 10; i < chs.length; i++) {
                chs[i] = (char)('A' + (i - 10));
            }
        }

        static String transRadix(String num, int fromRadix, int toRadix) {
            int number = Integer.valueOf(num, fromRadix);
            StringBuilder sb = new StringBuilder();
            while (number != 0) {
                sb.append(chs[number%toRadix]);
                number = number / toRadix;
            }
            return sb.reverse().toString();*/
    }
}
