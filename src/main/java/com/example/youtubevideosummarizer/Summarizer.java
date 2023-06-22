package com.example.youtubevideosummarizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class Summarizer extends AppCompatActivity {
EditText link;
Button summarize;
TextView summary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summarizer);

        link=findViewById(R.id.link);
        summarize=findViewById(R.id.button);
        summary=findViewById(R.id.textView);

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        summarize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GenerateSummary();

            }
        });

    }

    private void GenerateSummary() {

        String yt_link=link.getText().toString();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Python py = Python.getInstance();
                PyObject pyObject = py.getModule("app");
                PyObject obj = pyObject.callAttr("GenerateSummary", yt_link);
                Handler threadHandler = new Handler(Looper.getMainLooper());
                threadHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Summarizer.this,"Summary Generation Completed",Toast.LENGTH_SHORT).show();
                        summary.setText(obj.toString());
                        summary.setMovementMethod(new ScrollingMovementMethod());
                    }
                });

            }
            }).start();
    }
}