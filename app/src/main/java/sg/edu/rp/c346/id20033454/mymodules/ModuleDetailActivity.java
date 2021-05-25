package sg.edu.rp.c346.id20033454.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModule=findViewById(R.id.textView);

        Intent intentReceived=getIntent();
        String modulecode = intentReceived.getStringExtra("code");
        String modulename = intentReceived.getStringExtra("name");
        int credit = intentReceived.getIntExtra("credit", 4);
        String venue = intentReceived.getStringExtra("venue");
        String output = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s",
                modulecode, modulename, 2021, 1, credit, venue);

        tvModule.setText(output);



    }
}