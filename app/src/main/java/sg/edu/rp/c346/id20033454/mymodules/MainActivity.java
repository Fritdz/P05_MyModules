package sg.edu.rp.c346.id20033454.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c203;
    Button c206;
    Button c218;
    Button c235;
    Button c346;
    Button g953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c203=findViewById(R.id.btnc203);
        c206=findViewById(R.id.btnc206);
        c218=findViewById(R.id.btnc218);
        c235=findViewById(R.id.btnc235);
        c346=findViewById(R.id.btnc346);
        g953=findViewById(R.id.btng953);

        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("venue", "W67N");
                startActivity(intent);
            }
        });

        c206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("venue", "W67N");
                startActivity(intent);
            }
        });

        c218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C218");
                intent.putExtra("name", "UI/UX Design for App");
                intent.putExtra("venue", "W64G");
                startActivity(intent);
            }
        });

        c235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("venue", "W67N");
                startActivity(intent);
            }
        });

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });

        g953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","G953");
                intent.putExtra("name", "Life Skills III");
                intent.putExtra("venue", "HB01");
                intent.putExtra("credit", 2);
                startActivity(intent);
            }
        });
    }
}