package c.assignment_102;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeHolder placeHolder = (placeHolder)getSupportFragmentManager().findFragmentByTag("placeHolder");
        if (placeHolder ==null){

            placeHolder = new placeHolder();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.mainActivity, placeHolder, "placeHolder");
            fragmentTransaction.commit();
        }
        getFragmentManager().beginTransaction().add(R.id.mainActivity, new DescriptionFrag()).commit();
    }



}
