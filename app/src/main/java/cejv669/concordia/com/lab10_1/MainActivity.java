package cejv669.concordia.com.lab10_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = findViewById(R.id.radioGroup1);



        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radio_emaillogin)
                {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =
                            fragmentManager.beginTransaction();
                    FragmentLoginEmail fragment = new FragmentLoginEmail();
                    fragmentTransaction.replace(R.id.login_frame, fragment);
                    fragmentTransaction.commit();
                }

                if (checkedId == R.id.radio_pinlogin)
                {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =
                            fragmentManager.beginTransaction();
                    FragmentLoginPin fragment = new FragmentLoginPin();
                    fragmentTransaction.replace(R.id.login_frame, fragment);
                    fragmentTransaction.commit();

                }
            }
        });
    }


}
