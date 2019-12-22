package com.example.mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import java.text.DecimalFormat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.*;
import java.util.Stack;
import androidx.appcompat.app.AppCompatActivity;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class sincosActivity extends AppCompatActivity {
    private StringBuilder show_equation = new StringBuilder();//显示运算式
    private ArrayList calculate_equation;//计算式
    private int signal = 0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入
    double m = Math.PI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincos);
        show_equation = new StringBuilder();
        calculate_equation = new ArrayList<>();
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
        Button backspace = (Button) findViewById(R.id.Backspace);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        final Button tan = (Button) findViewById(R.id.tan);
        final Button point = (Button) findViewById(R.id.spot);
        final EditText result = (EditText) findViewById(R.id.result);
        result.setCursorVisible(true);

        Button button=(Button)findViewById(R.id.countpage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(sincosActivity.this,
                                MainActivity.class);
                startActivity(intent);
                finish();
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
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(show_equation.toString().equals(""))) {
                    if (signal == 0) {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    } else {
                        show_equation.delete(0, show_equation.length());
                        result.setText("");
                        signal = 0;
                    }
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    String dd = show_equation.toString();
                    double d = Double.parseDouble(dd);
                    double tan1 = Math.tan((d*2*m)/360);
                    double tan = (double)(Math.round(tan1*100)/100.0);
                    result.setText(String.valueOf(tan));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(String.valueOf(tan));
                } else {
                    show_equation.delete(0, show_equation.length());
                    String dd = show_equation.toString();
                    double d = Double.parseDouble(dd);
                    double tan = Math.tan((d*2*m)/360);
                    result.setText(String.valueOf(tan));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(String.valueOf(tan));
                    signal = 0;
                }
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    String dd = show_equation.toString();
                    double d = Double.parseDouble(dd);
                    double tan1 = Math.sin((d*2*m)/360);
                    double sin = (double)(Math.round(tan1*100)/100.0);
                    result.setText(String.valueOf(sin));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(String.valueOf(tan));
                } else {
                    show_equation.delete(0, show_equation.length());
                    String dd = show_equation.toString();
                    double d = Double.parseDouble(dd);
                    double sin = Math.sin((d*2*m)/360);
                    result.setText(String.valueOf(sin));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(String.valueOf(tan));
                    signal = 0;
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    if (signal == 0) {
                        String dd = show_equation.toString();
                        double d = Double.parseDouble(dd);
                        double tan1 = Math.cos((d*2*m)/360);
                        double tan = (double)(Math.round(tan1*100)/100.0);
                        result.setText(String.valueOf(tan));
                        result.setSelection(result.getText().length());
                        show_equation.delete(0, show_equation.length());
                        calculate_equation.clear();
                        show_equation.append(String.valueOf(tan));
                    } else {
                        show_equation.delete(0, show_equation.length());
                        String dd = show_equation.toString();
                        double d = Double.parseDouble(dd);
                        double tan = Math.cos((d*2*m)/360);
                        result.setText(String.valueOf(tan));
                        result.setSelection(result.getText().length());
                        show_equation.delete(0, show_equation.length());
                        calculate_equation.clear();
                        show_equation.append(String.valueOf(tan));
                        signal = 0;
                    }
                }
            });



    }
}
