package com.shu.pocketmoneyapp.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.shu.pocketmoneyapp.R;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.shu.pocketmoneyapp.Utils.TimeUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private Button btnDate;
    private TextView tvYear;
    private TextView tvMonth;
    Calendar calendar = Calendar.getInstance(Locale.CHINA);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvYear = findViewById(R.id.tvYear);
        tvMonth = findViewById(R.id.tvMonth);
        defaultDateSet();
//        btnDate = findViewById(R.id.btnSelectDate);
//        btnDate.setOnClickListener(this);
    }

    // 多个按钮共用一个onClick()方法，通过按钮的id区分单击了哪个按钮
    public void onClick(View v) {
//        if (v.getId() == R.id.btnSelectDate) {
//            Calendar calendar = Calendar.getInstance();
//            DatePickerDialog dialog = new DatePickerDialog(this, this,
//                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
//                calendar.get(Calendar.DAY_OF_MONTH));
//            dialog.show();
//        }
        if (v.getId() == R.id.layoutLeft) {
            showDatePickerDialog(this, 2, tvYear, tvMonth, calendar);
        }
    }

    /*
    这里只想显示年月的选择，不需要day，尝试隐藏。
    当前设置的年月数据需要记录，来显示对应的记账数据。
    */
    public static void showDatePickerDialog(Activity activity, int themeResId, final TextView tvY,
                                            final TextView tvM, Calendar calendar) {
        new DatePickerDialog(activity, themeResId, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tvY.setText(year + "年");
                tvM.setText((month + 1) + "月");
            }
        },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//        String date = String.format("%d年%d月", year, monthOfYear+1);
//        btnDate.setText(date);
    }

    // defaultDateSet方法为显示年月的控件初始化了值
    public void defaultDateSet() {
        String[] dateArray = TimeUtils.getCurYMD();
        tvYear.setText(String.format(getString(R.string.year), dateArray[0]));
        tvMonth.setText(String.format(getString(R.string.month), dateArray[1]));
    }
}
