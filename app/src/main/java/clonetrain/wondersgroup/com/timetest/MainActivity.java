package clonetrain.wondersgroup.com.timetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimeTest tt = new TimeTest();
        Log.e("获取当天日期:", "获取当天日期=" + tt.getNowTime("yyyy-MM-dd"));
        Log.e("获取本周一日期:", "获取本周一日期=" + tt.getMondayOFWeek());
        Log.e("获取本周日的日期", "获取本周日的日期=" + tt.getCurrentWeekday());
        Log.e("获取上周一日期", "获取上周一日期=" + tt.getPreviousWeekday());
        Log.e("获取上周日日期", "获取上周日日期=" + tt.getPreviousWeekSunday());
        Log.e("获取下周一日期", "获取下周一日期=" + tt.getNextMonday());
        Log.e("获取下周日日期", "获取下周日日期=" + tt.getNextSunday());
        Log.e("获得相应周的周六的日期", "获得相应周的周六的日期=" + tt.getNowTime("yyyy-MM-dd"));
        Log.e("获取本月第一天日期", "获取本月第一天日期=" + tt.getFirstDayOfMonth());
        Log.e("获取本月最后一天日期", "获取本月最后一天日期=" + tt.getDefaultDay());
        Log.e("获取上月第一天日期", "获取上月第一天日期=" + tt.getPreviousMonthFirst());
        Log.e("获取上月最后一天的日期", "获取上月最后一天的日期=" + tt.getPreviousMonthEnd());
        Log.e("获取下月第一天日期", "获取下月第一天日期=" + tt.getNextMonthFirst());
        Log.e("获取下月最后一天日期", "获取下月最后一天日期=" + tt.getNextMonthEnd());
        Log.e("获取本年的第一天日期", "获取本年的第一天日期=" + tt.getCurrentYearFirst());
        Log.e("获取本年最后一天日期", "获取本年最后一天日期=" + tt.getCurrentYearEnd());
        Log.e("获取本年最后一天日期", "获取本年最后一天日期=" + tt.getPreviousYearFirst());
        Log.e("获取去年的最后一天日期", "获取去年的最后一天日期=" + tt.getPreviousYearEnd());
        Log.e("获取明年第一天日期", "获取明年第一天日期=" + tt.getNextYearFirst());
        Log.e("获取明年最后一天日期", "获取明年最后一天日期=" + tt.getNextYearEnd());
        Log.e("获取本季度第一天到最后一天:", "获取本季度第一天到最后一天" + tt.getThisSeasonTime(11));
        Log.e("获取两个日期之间间隔天数", "获取两个日期之间间隔天数=" + TimeTest.getTwoDay("2010-12-31", "2010-9-14"));
    }
}
