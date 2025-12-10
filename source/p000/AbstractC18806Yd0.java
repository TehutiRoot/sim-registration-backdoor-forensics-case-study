package p000;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.IndeterminateDrawable;

/* renamed from: Yd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18806Yd0 {

    /* renamed from: a */
    public IndeterminateDrawable f7801a;

    /* renamed from: b */
    public final float[] f7802b;

    /* renamed from: c */
    public final int[] f7803c;

    public AbstractC18806Yd0(int i) {
        this.f7802b = new float[i * 2];
        this.f7803c = new int[i];
    }

    /* renamed from: a */
    public abstract void mo51887a();

    /* renamed from: b */
    public float m65332b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* renamed from: c */
    public abstract void mo51886c();

    /* renamed from: d */
    public abstract void mo51885d(Animatable2Compat.AnimationCallback animationCallback);

    /* renamed from: e */
    public void m65331e(IndeterminateDrawable indeterminateDrawable) {
        this.f7801a = indeterminateDrawable;
    }

    /* renamed from: f */
    public abstract void mo51884f();

    /* renamed from: g */
    public abstract void mo51883g();

    /* renamed from: h */
    public abstract void mo51882h();
}
