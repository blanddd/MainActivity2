package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class volume extends AppCompatActivity {
    String head;
    String result;
    private RadioButton sqcm1;
    private RadioButton sqm1;
    private  RadioButton sqdm1;
    private RadioButton sqkm1;
    private RadioButton sqcm;
    private RadioButton sqm;
    private  RadioButton sqdm;
    private RadioButton sqkm;
    private RadioGroup lengthgroup1;
    private RadioGroup lengthgroup;
    public int chooseone;
    public int choosetwo;
    private StringBuilder show_equation = new StringBuilder();//显示运算式
    private int signal = 0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

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
        lengthgroup1 = findViewById(R.id.lengthGroup1);
        lengthgroup = findViewById(R.id.lengthGroup);
        sqcm =(RadioButton)findViewById(R.id.sqcm);
        sqdm=(RadioButton)findViewById(R.id.sqdm);
        sqm=(RadioButton)findViewById(R.id.sqm);
        sqkm=(RadioButton)findViewById(R.id.sqkm);
        sqcm1 =(RadioButton)findViewById(R.id.sqcm1);
        sqdm1=(RadioButton)findViewById(R.id.sqdm1);
        sqm1=(RadioButton)findViewById(R.id.sqm1);
        sqkm1=(RadioButton)findViewById(R.id.sqkm1);
        final TextView genderRusult = (TextView) findViewById(R.id.output);
        final EditText result =  (EditText)findViewById(R.id.input);
        head = genderRusult.getText().toString();
        Button equal =(Button)findViewById(R.id.equal);
        Button back = (Button)findViewById(R.id.back);
        Button length = (Button)findViewById(R.id.length);
        Button radix = (Button)findViewById(R.id.radix);

       back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(volume.this, MainActivity.class);
                startActivity(intent);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(volume.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        radix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(volume.this, radix.class);
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
                    double countresult=0;
                    if (chooseone == 1 && choosetwo == 1) {
                        countresult = number1;
                    } else if (chooseone == 1 && choosetwo == 2) {
                        countresult = number1 / (100);
                    } else if (chooseone == 1 && choosetwo == 3) {
                        countresult = number1 / (10000);
                    } else if (chooseone == 1 && choosetwo == 4) {
                        countresult = number1 / (1000000);
                    } else if (chooseone == 2 && choosetwo == 1) {
                        countresult = number1 * 100;
                    } else if (chooseone == 2 && choosetwo == 2) {
                        countresult = number1;
                    } else if (chooseone == 2 && choosetwo == 3) {
                        countresult = number1 / 100;
                    } else if (chooseone == 2 && choosetwo == 4) {
                        countresult = number1 / 10000;
                    } else if (chooseone == 3 && choosetwo == 1) {
                        countresult = number1 * 10000;
                    } else if (chooseone == 3 && choosetwo == 2) {
                        countresult = number1 * 100;
                    } else if (chooseone == 3 && choosetwo == 3) {
                        countresult = number1;
                    } else if (chooseone == 3 && choosetwo == 4) {
                        countresult = number1 / 100;
                    } else if (chooseone == 4 && choosetwo == 1) {
                        countresult = number1 * 100000;
                    } else if (chooseone == 4 && choosetwo == 2) {
                        countresult = number1 * 10000;
                    } else if (chooseone == 4 && choosetwo == 3) {
                        countresult = number1 * 100;
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
