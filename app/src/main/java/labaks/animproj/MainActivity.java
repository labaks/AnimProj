package labaks.animproj;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<LogoAnim> logoAnims = Arrays.asList(
                new LogoAnim(this, (ImageView) findViewById(R.id.logoCross), R.anim.cross),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoWhite), R.anim.white),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoOrange), R.anim.orange),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoGreen), R.anim.green),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoYellow), R.anim.yellow),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoBlue), R.anim.blue),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoRed1), R.anim.red1),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoRed2), R.anim.red2),
                new LogoAnim(this, (ImageView) findViewById(R.id.logoRed3), R.anim.red3)
        );
        for (LogoAnim e : logoAnims) {
            Starter starter = new Starter(e);
            starter.run();
        }
    }
}

class Starter implements Runnable {
    private final LogoAnim la;

    Starter(LogoAnim la) {
        this.la = la;
    }

    public void run() {
        la.startAnim();
    }
}
