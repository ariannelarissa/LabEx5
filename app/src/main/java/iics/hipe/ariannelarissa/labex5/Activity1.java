package iics.hipe.ariannelarissa.labex5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    Button act2Butt = (Button) findViewById(R.id.act2Button);
    Button mapButt = (Button) findViewById(R.id.mapButton);

        act2Butt.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent even = new Intent(Activity1.this, Activity2.class);
        startActivity(even);
    }

    });

        mapButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri IntentUri = Uri.parse("geo:37.4734048,126.6165903");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, IntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

}

}
