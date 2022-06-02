package mcm.edu.ph.abude_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button btn1,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.empname);
        ed2 = findViewById(R.id.empsalary);
        ed3 = findViewById(R.id.emptax);
        ed4 = findViewById(R.id.empnsal);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empsal();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }
    public void empsal()
    {

        double salary = Double.parseDouble(ed1.getText().toString());
        double tax, nsal;

        if (salary > 50000)
        {
            tax = salary * 10 / 100;
        }
        else if (salary > 30000)
        {
            tax = salary * 5 / 100;
        }
        else
        {
            tax = 0;
        }

        ed3.setText(String.valueOf(tax));

        nsal = salary - tax;

        ed4.setText(String.valueOf(nsal));

    }


    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed1.requestFocus();

    }
}