package th.ac.su.mid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import th.ac.su.mid.Next.idnumber;

public class numbertext extends AppCompatActivity {
    idnumber n ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbertext);
        n = new idnumber();
        Button guessButton = findViewById(R.id.check);
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.idnumber);
                String text = numberEditText.getText().toString();
                idnumber.CheckResult result = n.checkId(text);
                AlertDialog.Builder dialog = new AlertDialog.Builder(numbertext.this);
                switch (result){
                    case yes:
                        dialog.setTitle("ผลการตรวจสิธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิธิ๊เลือกตั้ง");
                        dialog.setPositiveButton("OK",null);
                        dialog.show();
                        break;
                    case no:
                        dialog.setTitle("ผลการตรวจสิธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้ไม่มีสิธิ๊เลือกตั้ง");
                        dialog.setPositiveButton("OK",null);
                        dialog.show();
                        break;

                    case not:
                        Toast t = Toast.makeText(numbertext.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                        t.show();
                        break;
                }
            }
        });

    }
}