package labaks.animproj;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    ImageView logo;
    AnimationDrawable logoDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logo = (ImageView) findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.new_anim);
                logo.startAnimation(anim);
            }
        });


    }

    class Starter implements Runnable {
        private final AnimationDrawable ad;

        Starter(AnimationDrawable ad) {
            this.ad = ad;
        }

        public void run() {
            ad.start();
        }
    }

}
