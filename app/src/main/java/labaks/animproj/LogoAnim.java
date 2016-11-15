package labaks.animproj;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by alexey on 11/15/16.
 */
public class LogoAnim {
    ImageView logoPart;
    int animId;
    Context context;
    Animation anim;

    public LogoAnim(Context context, ImageView logoPart, int animId) {
        this.context = context;
        this.logoPart = logoPart;
        this.animId = animId;
    }

    public void startAnim() {
        anim = AnimationUtils.loadAnimation(context, animId);
        logoPart.startAnimation(anim);
    }
}
