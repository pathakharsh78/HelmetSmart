package com.helmetsmart.app.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.helmetsmart.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class HelmetSmartActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.txtToolbarTitle)
    TextView txtToolbarTitle;
    @BindView(R.id.imgMenu)
    ImageView imgMenu;
    @BindView(R.id.txtTime)
    TextView txtTime;
    @BindView(R.id.txtSpeedAvg)
    TextView txtSpeedAvg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helmet_smart);
        init();
    }

    /**
     * Method to init Data and Views
     */
    private void init() {
        ButterKnife.bind(this);
        txtToolbarTitle.setText(getString(R.string.app_name));
        txtToolbarTitle.setCompoundDrawablePadding(8);
        txtToolbarTitle.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_white_helmet_actionbar, 0, 0, 0);

        txtTime.setText("57 min");
        txtSpeedAvg.setText("36 km/hr");

        //Handling Click Listener for Views
        imgMenu.setOnClickListener(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgMenu:
                break;
        }
    }
}