package ade.nugroho.aplikasi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String theText;
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText=(TextView) findViewById(R.id.show_text);
        theText="aplikasi";
        addSeparator();
        showText.setText(theText);

    }
    private void addSeparator(){
        this.theText +="\n----------------\n";
    }

}
