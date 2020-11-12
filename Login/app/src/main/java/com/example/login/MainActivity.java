package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean Login_BTN_State = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login_Click(View view) {
        EditText editText_Account = findViewById(R.id.Account);
        EditText editText_Password = findViewById(R.id.Password);
        Button Login_BTN = (Button) view;

        // 取得鍵盤管理物件
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        // 隱藏指定 view 的虛擬鍵盤
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if( !String.valueOf(editText_Account.getText()).equals("")
        &&  !String.valueOf(editText_Password.getText()).equals(""))
        {
            Login_BTN_State = !Login_BTN_State;
            if (Login_BTN_State) {
                Login_BTN.setText(R.string.Logout);
                Toast.makeText(this, "登入成功!", Toast.LENGTH_SHORT).show();
            } else {
                Login_BTN.setText(R.string.Login);
                Toast.makeText(this, "登出成功!", Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(this, "輸入欄位不得為空", Toast.LENGTH_SHORT).show();
    }

    public void Reg_Click(View view) {
        EditText editText_Account = findViewById(R.id.Account);
        EditText editText_Password = findViewById(R.id.Password);

        // 取得鍵盤管理物件
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        // 隱藏指定 view 的虛擬鍵盤
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        if( !String.valueOf(editText_Account.getText()).equals("")
        &&  !String.valueOf(editText_Password.getText()).equals(""))
        {
            Toast.makeText(this, "註冊成功!", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "輸入欄位不得為空", Toast.LENGTH_SHORT).show();
    }
}