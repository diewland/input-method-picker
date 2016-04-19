package com.diewland.inputmethodpicker;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        InputMethodManager localInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (localInputMethodManager != null) {
            localInputMethodManager.showInputMethodPicker();
        }
        else {
            Toast.makeText(getApplicationContext(), "Cannot find Input method service", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}