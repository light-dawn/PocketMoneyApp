package com.shu.pocketmoneyapp.Utils;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.NumberPicker;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
//    private static DatePickerDialog mDatePickerDialog;
    /*
    获取当前时间（年月日）
    @return yyyy-MM-dd
     */
    public static String[] getCurYMD() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        return date.split("-");
    }

//    /*
//    获取当前时间（年月）
//    @return yyyy-MM
//     */
//    public static String getDeviceTimeOfYM() {
//        String date = "";
//        try {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
//            date = df.format(new Date());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return date;
//    }
//
//    public static TimeUtils showDatePickerDialog(Context context, String title,
//                                                 int year, int month, int day) {
//        mDatePickerDialog = new DatePickerDialog(context, new OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
//            }
//        })
//    }
//    // 设置为年月选择器
//    public void setYearMonthPicker() {
//        try {
//            DatePicker dp = mDatePickerDialog.getDatePicker();
//            NumberPicker dayView = (NumberPicker)((ViewGroup)((ViewGroup)
//                    dp.getChildAt(0)).getChildAt(0)).getChildAt(2);
//            dayView.setVisibility(View.GONE);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
