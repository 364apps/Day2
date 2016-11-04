package ru.a364apps.day2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private Button mButton1;
    private RelativeLayout mRelativeLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout)findViewById(R.id.activity_main);
        mCheckBox1 = (CheckBox)findViewById(R.id.checkBox_green);
        mCheckBox2 = (CheckBox)findViewById(R.id.checkBox_red);
        mButton1 = (Button)findViewById(R.id.button_check_box);
        mTextView = (TextView)findViewById(R.id.textView);
        mButton1.setOnClickListener(this);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton_blue:
                        mTextView.setText("Голубой текст");
                        mTextView.setTextColor(getResources().getColor(R.color.blue));
                        break;
                    case R.id.radioButton_yellow:
                        mTextView.setText("Желтый текст!");
                        mTextView.setTextColor(getResources().getColor(R.color.yellow));
                        break;

                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_check_box:
                if (mCheckBox2.isChecked()) mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.red));
                mCheckBox2.setChecked(false);
                if (mCheckBox1.isChecked()) mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.green));
                mCheckBox1.setChecked(false);
            break;

            }
        }
    }

