package com.example.hw_assignment1_retry;

import android.app.Activity;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.HorizontalScrollView;

import android.widget.ScrollView;
import android.widget.TextView;
import android.view.ViewGroup;

import java.lang.reflect.Type;

public class GridLayoutActivity extends Activity {
    GridLayout.Spec row_spec;
    GridLayout.Spec col_spec;
    GridLayout.LayoutParams row_params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HorizontalScrollView root = new HorizontalScrollView(this);
/*
        RelativeLayout first_child = new RelativeLayout(this);
*/

        GridLayout gridlayout = new GridLayout(this);
        ViewGroup.LayoutParams gridlayout_params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        gridlayout.setLayoutParams(gridlayout_params);
        gridlayout.setColumnCount(5);
        gridlayout.setRowCount(11);
        /*  Creati*/
        GridLayout.Spec row0_spec = GridLayout.spec(0,1);
        GridLayout.Spec col_row0_spec = GridLayout.spec(0,4);
        GridLayout.LayoutParams row0_params = new GridLayout.LayoutParams(row0_spec, col_row0_spec);
        row0_params.setGravity(Gravity.FILL_HORIZONTAL);

        TextView tv_row0 = new TextView(this);
        tv_row0.setText("Rules void hello1(int hour)");
        tv_row0.setTextColor(Color.WHITE);
        tv_row0.setBackgroundColor(Color.BLACK);
        tv_row0.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv_row0.setLayoutParams(row0_params);
        gridlayout.addView(tv_row0, row0_params);

        /* Row 1: Three TextView children, who use different
         *         row_params for each view to parent gridLayout */
        TextView tv = new TextView(this);
        tv.setText("properties");
        row_spec = GridLayout.spec(1,2);
        col_spec = GridLayout.spec(0,1);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.CENTER_VERTICAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        row_spec = GridLayout.spec(1,1);
        col_spec = GridLayout.spec(1,2);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        row_spec = GridLayout.spec(1,1);
        col_spec = GridLayout.spec(3,1);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /* Row 2: Three TextView children, who use different
         *         row_params for each view to parent gridLayout */



        tv = new TextView(this);
        tv.setText("category");
        row_spec = GridLayout.spec(2,1);
        col_spec = GridLayout.spec(1,2);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        row_spec = GridLayout.spec(2,1);
        col_spec = GridLayout.spec(3,1);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);


        /*Row 3*/
        tv = new TextView(this);
        tv.setText("Rule");
        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(0,1, 1);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(1,2, 2f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(3,1, 2f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*  ROW 4   */
        tv = new TextView(this);
        tv.setText("");
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(1,2, 2f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText(R.string.println);
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(3,1, 2f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(10, 0,10,0);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      ROW 5       */
        tv = new TextView(this);
        tv.setText("");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("int min");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setPadding(50, 0, 50, 0);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        row_spec = GridLayout.spec(5,2);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(50, 0, 50, 0);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#C89CF8F8"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      ROW 6       */
        tv = new TextView(this);
        tv.setText("Rule");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(1,1, 2f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(5, 0,0,0);
        tv.setBackgroundColor(Color.parseColor("#ffbf80"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      ROW 7       */
        tv = new TextView(this);
        tv.setText("R10");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#ffffe0"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(5, 0,0,0);
        tv.setBackgroundColor(Color.parseColor("#ffbf80"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      ROW 8       */
        tv = new TextView(this);
        tv.setText("R20");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(5, 0,0,0);
        tv.setBackgroundColor(Color.parseColor("#ffbf80"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      Row 9       */
        tv = new TextView(this);
        tv.setText("R30");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#ffffe0"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(5, 0,0,0);
        tv.setBackgroundColor(Color.parseColor("#ffbf80"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        /*      ROW 10      */
        tv = new TextView(this);
        tv.setText("R40");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(0,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(1,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(2,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setBackgroundColor(Color.parseColor("#B4FDFD78"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(3,1, 1f);
        row_params = new GridLayout.LayoutParams(row_spec, col_spec);
        row_params.setGravity(Gravity.FILL_HORIZONTAL);
        tv.setPadding(5, 0,0,0);
        tv.setBackgroundColor(Color.parseColor("#ffbf80"));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        tv.setLayoutParams(row_params);
        gridlayout.addView(tv);



//        Add all gridLayout objects to root horizontal scroll
        root.addView(gridlayout);
        setContentView(root);
    }
}

/*
  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        for(int j=0;j<=4;j++)
        {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);
            // Create TextView
            TextView tv = new TextView(this);
            product.setText("   "+j+"    ");
            ll.addView(tv);
            TextView tv1 = new TextView(this);
            price.setText(" "+j+"     ");
            ll.addView(price);
*/