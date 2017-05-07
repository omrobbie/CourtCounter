package omrobbie.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // deklarasi temporary variable
    public int pointA=0, pointB=0;

    public void setPointA(int value) {
        // deklarasi text penampung hasil perhitungan Team A
        TextView txtPointA = (TextView) findViewById(R.id.txtPointA);

        pointA = (value == 0) ? 0 : pointA + value;
        txtPointA.setText(String.valueOf(pointA));
    }

    public void setPointB(int value) {
        // deklarasi text penampung hasil perhitungan Team B
        TextView txtPointB = (TextView) findViewById(R.id.txtPointB);

        pointB = (value == 0) ? 0 : pointB + value;
        txtPointB.setText(String.valueOf(pointB));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // deklarasi tombol next
        Button btnReset = (Button) findViewById(R.id.btnReset);

        // deklarasi komponen untuk Team A
        Button btnPointA3 = (Button) findViewById(R.id.btnPointA3);
        Button btnPointA2 = (Button) findViewById(R.id.btnPointA2);
        Button btnPointAFree = (Button) findViewById(R.id.btnPointAFree);

        // deklarasi komponen untuk Team B
        Button btnPointB3 = (Button) findViewById(R.id.btnPointB3);
        Button btnPointB2 = (Button) findViewById(R.id.btnPointB2);
        Button btnPointBFree = (Button) findViewById(R.id.btnPointBFree);

        // tambah 3 point untuk Team A
        btnPointA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointA(3);
            }
        });

        // tambah 2 point untuk Team A
        btnPointA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointA(2);
            }
        });

        // tambah 1 point untuk Team A
        btnPointAFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointA(1);
            }
        });

        // tambah 3 point untuk Team B
        btnPointB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointB(3);
            }
        });

        // tambah 2 point untuk Team B
        btnPointB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointB(2);
            }
        });

        // tambah 1 point untuk Team B
        btnPointBFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPointB(1);
            }
        });


        // reset semua angka
        pointA=pointB=0;
        setPointA(0);
        setPointB(0);
    }
}