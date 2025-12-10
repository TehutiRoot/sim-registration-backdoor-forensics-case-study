package p000;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: Te0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18489Te0 extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: c */
    public final View f6052c;

    /* renamed from: d */
    public int f6053d;

    /* renamed from: e */
    public int f6054e;

    /* renamed from: f */
    public final int[] f6055f;

    public C18489Te0(View view) {
        super(0);
        this.f6055f = new int[2];
        this.f6052c = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f6052c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f6052c.getLocationOnScreen(this.f6055f);
        this.f6053d = this.f6055f[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) it.next();
            if ((windowInsetsAnimationCompat.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f6052c.setTranslationY(AnimationUtils.lerp(this.f6054e, 0, windowInsetsAnimationCompat.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.f6052c.getLocationOnScreen(this.f6055f);
        int i = this.f6053d - this.f6055f[1];
        this.f6054e = i;
        this.f6052c.setTranslationY(i);
        return boundsCompat;
    }
}
