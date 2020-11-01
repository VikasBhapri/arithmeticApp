import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,sub,mul,div;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.edit_number1);
        num2=findViewById(R.id.edit_number2);
        add=findViewById(R.id.button);
        sub=findViewById(R.id.button2);
        mul=findViewById(R.id.button3);
        div=findViewById(R.id.button4);
        result=findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(num1.getText().toString()); //num1 converted to int
                int number2= Integer.parseInt(num2.getText().toString()); //num2 converted to int
                int sum= number1+number2;
                result.setText("Sum=" + String.valueOf(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(num1.getText().toString()); //num1 converted to int
                int number2= Integer.parseInt(num2.getText().toString()); //num2 converted to int
                int dif= number1-number2;
                result.setText("Difference=" + String.valueOf(dif));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(num1.getText().toString()); //num1 converted to int
                int number2= Integer.parseInt(num2.getText().toString()); //num2 converted to int
                int product= number1*number2;
                result.setText("Product=" + String.valueOf(product));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(num1.getText().toString()); //num1 converted to int
                int number2= Integer.parseInt(num2.getText().toString()); //num2 converted to int
                int quo= number1/number2;
                result.setText("Quotient=" + String.valueOf(quo));
            }
        });


    }
}
