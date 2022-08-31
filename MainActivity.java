package kr.co.company.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        Button button = (Button) findViewById(R.id.button);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);


        button.setOnClickListener(new View.OnClickListener() {
            int number1 = 0;
            int number2 = 0;
            int number3 = 0;
            int number4 = 0;
            int number5 = 0;
            int number6 = 0;
            public void onClick(View v) {
                int num = (int) (Math.random() * 6 + 1);
                if (num == 1) {
                    imageView1.setImageResource(R.drawable.one);
                    number1++;
                    textView1.setText("1=>" + number1);
                }
                else if (num == 2) {
                    imageView1.setImageResource(R.drawable.two);
                    number2++;
                    textView2.setText("2=>" + number2);
                }
                else if (num == 3) {
                    imageView1.setImageResource(R.drawable.three);
                    number3++;
                    textView3.setText("3=>" + number3);
                }
                else if (num == 4) {
                    imageView1.setImageResource(R.drawable.four);
                    number4++;
                    textView4.setText("4=>" + number4);
                }

                else if (num == 5) {
                    imageView1.setImageResource(R.drawable.five);
                    number5++;
                    textView5.setText("5=>" + number5);
                }

                else if (num == 6) {
                    imageView1.setImageResource(R.drawable.six);
                    number6++;
                    textView6.setText("6=>" + number6);
                }
            }
        });
    }
}