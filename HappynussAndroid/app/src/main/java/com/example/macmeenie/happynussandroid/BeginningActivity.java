package com.example.macmeenie.happynussandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BeginningActivitay extends Activity {
    RelativeLayout rl;
    LinearLayout loginBox;
    LinearLayout signupBox;
    TextView login;
    ImageButton loginBtn;
    TextView signupEmail;
    ImageButton signupEmailBtn;
    ImageButton cancelBtn;
    int signupEmailCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginnig_ui); //레이아웃 받아오기
        loginBox = (LinearLayout)findViewById(R.id.loginBox); //로그인 입력 창
        loginBox.setVisibility(View.INVISIBLE); //로그인 입력 창 숨기기 (디폴트)
        signupBox = (LinearLayout)findViewById(R.id.signupBox); //회원가입 입력 창
        signupBox.setVisibility(View.INVISIBLE); //회원가입 입력 창 숨기기 (디폴트)
        signupEmailCount = 0; //회원가입 창 띄우고 닫기 위한 변수, 0이면 띄우기 1이면 닫기
        login = (TextView)findViewById(R.id.loginBottomBtn); //로그인 입력 창 열기 버튼
        loginBtn = (ImageButton)findViewById(R.id.loginBtn); //로그인 버튼
        signupEmail = (TextView)findViewById(R.id.signupEmailTxt); //회원가입 텍스트
        signupEmailBtn = (ImageButton)findViewById(R.id.signupEmailBtn); //회원가입 창 열기 버튼
        cancelBtn = (ImageButton)findViewById(R.id.cancelBtn); //로그인 창 닫기 버튼
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginBox.setVisibility(View.VISIBLE);
                signupEmailBtn.setVisibility(View.INVISIBLE);

            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(),MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View V)
            {
                loginBox.setVisibility(View.INVISIBLE);
                signupEmailBtn.setVisibility(View.VISIBLE);
            }
        });
        signupEmailBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*
                if(signupEmailCount==0) {
                    signupBox.setVisibility(View.VISIBLE);
                    signupEmailCount++;
                }
                else{
                    signupBox.setVisibility(View.INVISIBLE);
                    signupEmailCount = 0;
                }
                */
                Intent intent = new Intent(getBaseContext(),SignupActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_beginning_activitay, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar wiloginBox
        // automaticaloginBoxy handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
