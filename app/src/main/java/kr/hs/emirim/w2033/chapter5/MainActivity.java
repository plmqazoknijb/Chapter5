package kr.hs.emirim.w2033.chapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearDog, linearCat, linearHamster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        linearDog = findViewById(R.id.linear_dog);
        linearCat = findViewById(R.id.linear_cat);
        linearHamster = findViewById(R.id.linear_hamster);

        Button btnDog = findViewById(R.id.btn_dog);
        Button btnCat = findViewById(R.id.btn_cat);
        Button btnHamster = findViewById(R.id.btn_hamster);

        btnDog.setOnClickListener(btnLinear);
        btnCat.setOnClickListener(btnLinear);
        btnHamster.setOnClickListener(btnLinear);

    }

    View.OnClickListener btnLinear = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            linearDog.setVisibility(View.INVISIBLE);
            linearCat.setVisibility(View.INVISIBLE);
            linearHamster.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_dog:
                    linearDog.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_cat:
                    linearCat.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_hamster:
                    linearHamster.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}