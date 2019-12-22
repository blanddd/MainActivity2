package com.example.mainactivity;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.*;

import androidx.appcompat.app.AppCompatActivity;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private StringBuilder show_equation = new StringBuilder();//显示运算式
    private ArrayList calculate_equation;//计算式
    private int signal = 0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        show_equation = new StringBuilder();
        calculate_equation = new ArrayList<>();
        Button button = (Button) findViewById(R.id.AnotherActivity);
        Button button1 = (Button) findViewById(R.id.sincosActivity);
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
        Button cls = (Button) findViewById(R.id.cls);
        Button div = (Button) findViewById(R.id.div);
        Button mul = (Button) findViewById(R.id.mul);
        Button backspace = (Button) findViewById(R.id.Backspace);
        Button sub = (Button) findViewById(R.id.sub);
        Button add = (Button) findViewById(R.id.add);
        Button leftbracket = (Button) findViewById(R.id.leftbrackets);
        Button rightbracket = (Button) findViewById(R.id.rightbrackets);
        Button heng = (Button) findViewById(R.id.heng);
        Button shu = (Button) findViewById(R.id.shu);
        Button helo = (Button) findViewById(R.id.help);
        final Button equal = (Button) findViewById(R.id.equal);
        final Button point = (Button) findViewById(R.id.spot);
        final EditText result = (EditText) findViewById(R.id.result);

        result.setCursorVisible(true);
        disableShowInput(result);
        //点击文本框时光标始终在文本末尾
        helo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, help.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this,sincosActivity.class);
                startActivity(intent);
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setSelection(result.getText().length());
            }
        });
        heng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
        shu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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


        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0, show_equation.length());
                calculate_equation.clear();
                signal = 0;
                result.setText("");
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
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    String a = show_equation.toString();
                    if (a.equals("")) {
                        show_equation.append(".");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    } else {
                        int i;
                        char t = '0';
                        for (i = a.length(); i > 0; i--) {
                            t = a.charAt(i - 1);
                            if (t == '.' || t == '+' || t == '-' || t == '*' || t == '/')
                                break;
                        }
                        if (i == 0) {
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        } else if (t == '+' || t == '-' || t == '*' || t == '/') {
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }
                    }
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append(".");
                    result.setText(".");
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if (!show_equation.toString().equals("")) {
                    stack s = new stack();
                    String expression =  show_equation.toString();
                    int data = s.evaluateExpression(expression);
                    result.setText(String.valueOf(data));
                    result.setSelection(result.getText().length());
                    show_equation.delete(0, show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(String.valueOf(data));
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if (!(show_equation.toString().equals(""))) {
                    signal = 0;
                    char temp = show_equation.charAt(show_equation.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        show_equation.append("+");
                    } else
                        show_equation.append("+");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if (!(show_equation.toString().equals(""))) {
                    signal = 0;
                    char temp = show_equation.charAt(show_equation.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        show_equation.append("-");
                    } else
                        show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if (!(show_equation.toString().equals(""))) {
                    signal = 0;
                    char temp = show_equation.charAt(show_equation.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        show_equation.append("*");
                    } else
                        show_equation.append("*");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        leftbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append("(");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("(");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });
        rightbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signal == 0) {
                    show_equation.append(")");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                } else {
                    show_equation.delete(0, show_equation.length());
                    show_equation.append(")");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal = 0;
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if (!(show_equation.toString().equals(""))) {
                    signal = 0;
                    char temp = show_equation.charAt(show_equation.length() - 1);
                    if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        show_equation.append("/");
                    } else
                        show_equation.append("/");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
    }


    //当API最低版小于21时使用这个函数实现点击文本框不弹出键盘
    public void disableShowInput(EditText et) {
        Class<EditText> cls = EditText.class;
        Method method;
        try {
            method = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
            method.setAccessible(true);
            method.invoke(et, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public class stack {
        //这个函数的作用就是使用空格分割字符串，以便后面使用分割函数使得将字符串分割成数组
        public String insetBlanks(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                        s.charAt(i) == '+' || s.charAt(i) == '-'
                        || s.charAt(i) == '*' || s.charAt(i) == '/')
                    result += " " + s.charAt(i) + " ";
                else
                    result += s.charAt(i);
            }
            return result;
        }

        public int evaluateExpression(String expression) {
            Stack<Integer> operandStack = new Stack<>();
            Stack<Character> operatorStack = new Stack<>();
            expression = insetBlanks(expression);
            String[] tokens = expression.split(" ");
            for (String token : tokens) {
                if (token.length() == 0)   //如果是空格的话就继续循环，什么也不操作
                    continue;
                    //如果是加减的话，因为加减的优先级最低，因此这里的只要遇到加减号，无论操作符栈中的是什么运算符都要运算
                else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
                    //当栈不是空的，并且栈中最上面的一个元素是加减乘除的人任意一个
                    while (!operatorStack.isEmpty() && (operatorStack.peek() == '-' || operatorStack.peek() == '+' || operatorStack.peek() == '/' || operatorStack.peek() == '*')) {
                        processAnOperator(operandStack, operatorStack);   //开始运算
                    }
                    operatorStack.push(token.charAt(0));   //运算完之后将当前的运算符入栈
                }
                //当前运算符是乘除的时候，因为优先级高于加减，因此要判断最上面的是否是乘除，如果是乘除就运算，否则的话直接入栈
                else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
                    while (!operatorStack.isEmpty() && (operatorStack.peek() == '/' || operatorStack.peek() == '*')) {
                        processAnOperator(operandStack, operatorStack);
                    }
                    operatorStack.push(token.charAt(0));   //将当前操作符入栈
                }
                //如果是左括号的话直接入栈，什么也不用操作,trim()函数是用来去除空格的，由于上面的分割操作可能会令操作符带有空格
                else if (token.trim().charAt(0) == '(') {
                    operatorStack.push('(');
                }
                //如果是右括号的话，清除栈中的运算符直至左括号
                else if (token.trim().charAt(0) == ')') {
                    while (operatorStack.peek() != '(') {
                        processAnOperator(operandStack, operatorStack);    //开始运算
                    }
                    operatorStack.pop();   //这里的是运算完之后清除左括号
                }
                //这里如果是数字的话直接如数据的栈
                else {
                    operandStack.push(Integer.parseInt(token));   //将数字字符串转换成数字然后压入栈中
                }
            }
            //最后当栈中不是空的时候继续运算，知道栈中为空即可
            while (!operatorStack.isEmpty()) {
                processAnOperator(operandStack, operatorStack);
            }
            return operandStack.pop();    //此时数据栈中的数据就是运算的结果
        }

        //这个函数的作用就是处理栈中的两个数据，然后将栈中的两个数据运算之后将结果存储在栈中
        public void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
            char op = operatorStack.pop();  //弹出一个操作符
            int op1 = operandStack.pop();  //从存储数据的栈中弹出连个两个数用来和操作符op运算
            int op2 = operandStack.pop();
            if (op == '+')  //如果操作符为+就执行加运算
                operandStack.push(op1 + op2);
            else if (op == '-')
                operandStack.push(op2 - op1);   //因为这个是栈的结构，自然是上面的数字是后面的，因此用op2-op1
            else if (op == '*')
                operandStack.push(op1 * op2);
            else if (op == '/')
                operandStack.push(op2 / op1);
        }
    }
}
