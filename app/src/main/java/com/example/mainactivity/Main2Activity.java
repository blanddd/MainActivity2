package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Stack;
import androidx.appcompat.app.AppCompatActivity;



public class Main2Activity extends AppCompatActivity {
    String head;
    String result;
    private RadioButton cm1;
    private RadioButton m1;
    private  RadioButton dm1;
    private RadioButton km1;
    private RadioButton cm;
    private RadioButton m;
    private  RadioButton dm;
    private RadioButton km;
    private RadioGroup lengthgroup1;
    private RadioGroup lengthgroup;
    public int chooseone;
    public int choosetwo;
    private StringBuilder show_equation = new StringBuilder();//显示运算式
    private int signal = 0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入



    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
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
        cm =(RadioButton)findViewById(R.id.cm);
        dm=(RadioButton)findViewById(R.id.dm);
        m=(RadioButton)findViewById(R.id.m);
        km=(RadioButton)findViewById(R.id.km);
        cm1 =(RadioButton)findViewById(R.id.cm1);
        dm1=(RadioButton)findViewById(R.id.dm1);
        m1=(RadioButton)findViewById(R.id.m1);
        km1=(RadioButton)findViewById(R.id.km1);
        final  TextView genderRusult = (TextView) findViewById(R.id.output);
        final EditText result =  (EditText)findViewById(R.id.input);
        head = genderRusult.getText().toString();
        Button equal =(Button)findViewById(R.id.equal);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                new Intent(Main2Activity.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
        }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(Main2Activity.this,
                                volume.class);
                startActivity(intent);
                finish();
            }
        });
        radix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(Main2Activity.this,
                                radix.class);
                startActivity(intent);
                finish();
            }
        });
        lengthgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup lengthgroup1, int checkedId) {
                if( checkedId ==cm1.getId()) {
                   choosetwo=1;
                }else if(checkedId==dm1.getId()){
                   choosetwo=2;
                }else if(checkedId==m1.getId()) {
                    choosetwo=3;
                }else if(checkedId==km1.getId()){
                   choosetwo=4;
                }
                genderRusult.setText(choosetwo);
            }
        });
        lengthgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup lengthgroup, int checkedId) {
                if( checkedId ==cm1.getId()) {
                    chooseone=1;
                }else if(checkedId==dm1.getId()){
                    chooseone=2;
                }else if(checkedId==m1.getId()) {
                    chooseone=3;
                }else if(checkedId==km1.getId()){
                    chooseone=4;
                }
                genderRusult.setText(chooseone);
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
                    double countresult=0;
                    if (chooseone == 1 && choosetwo == 1) {
                        countresult = number1;
                    } else if (chooseone == 1 && choosetwo == 2) {
                        countresult = number1 / (10);
                    } else if (chooseone == 1 && choosetwo == 3) {
                        countresult = number1 / (100);
                    } else if (chooseone == 1 && choosetwo == 4) {
                        countresult = number1 / (1000);
                    } else if (chooseone == 2 && choosetwo == 1) {
                        countresult = number1 * 10;
                    } else if (chooseone == 2 && choosetwo == 2) {
                        countresult = number1;
                    } else if (chooseone == 2 && choosetwo == 3) {
                        countresult = number1 / 10;
                    } else if (chooseone == 2 && choosetwo == 4) {
                        countresult = number1 / 100;
                    } else if (chooseone == 3 && choosetwo == 1) {
                        countresult = number1 * 100;
                    } else if (chooseone == 3 && choosetwo == 2) {
                        countresult = number1 * 10;
                    } else if (chooseone == 3 && choosetwo == 3) {
                        countresult = number1;
                    } else if (chooseone == 3 && choosetwo == 4) {
                        countresult = number1 / 10;
                    } else if (chooseone == 4 && choosetwo == 1) {
                        countresult = number1 * 1000;
                    } else if (chooseone == 4 && choosetwo == 2) {
                        countresult = number1 * 100;
                    } else if (chooseone == 4 && choosetwo == 3) {
                        countresult = number1 * 10;
                    } else if (chooseone == 4 && choosetwo == 4) {
                        countresult = number1;
                    }
                    result.setText(String.valueOf(countresult));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    show_equation.append(String.valueOf(countresult));
                }
            }
        });




        }

        }




