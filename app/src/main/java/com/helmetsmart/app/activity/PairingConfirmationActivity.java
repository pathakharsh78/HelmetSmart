package com.helmetsmart.app.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.helmetsmart.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Pairing Confirmation Activity
 */
public class PairingConfirmationActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.txtToolbarTitle)
    TextView txtToolbarTitle;
    @BindView(R.id.imgBackArrow)
    ImageView imgBackArrow;
    @BindView(R.id.btnYes)
    Button btnYes;
    @BindView(R.id.btnNo)
    Button btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairing_confirmation);
        init();
    }

    /**
     * Method to init Data and Views
     */
    private void init() {
        ButterKnife.bind(this);
        txtToolbarTitle.setText(getString(R.string.str_pairing_confirmation));

        //Handling Click Listener for Views
        imgBackArrow.setOnClickListener(this);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgBackArrow:
                onBackPressed();
                break;
            case R.id.btnYes:
                Intent intent = new Intent(getApplicationContext(), ConnectHelmetSmartActivity.class);
                startActivity(intent);
                break;
            case R.id.btnNo:
                finish();
                break;
        }
    }
}