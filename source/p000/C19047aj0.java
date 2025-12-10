package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* renamed from: aj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19047aj0 extends AbstractC18806Yd0 {

    /* renamed from: j */
    public static final Property f8407j = new C1912b(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f8408d;

    /* renamed from: e */
    public FastOutSlowInInterpolator f8409e;

    /* renamed from: f */
    public final BaseProgressIndicatorSpec f8410f;

    /* renamed from: g */
    public int f8411g;

    /* renamed from: h */
    public boolean f8412h;

    /* renamed from: i */
    public float f8413i;

    /* renamed from: aj0$a */
    /* loaded from: classes4.dex */
    public class C1911a extends AnimatorListenerAdapter {
        public C1911a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C19047aj0 c19047aj0 = C19047aj0.this;
            c19047aj0.f8411g = (c19047aj0.f8411g + 1) % C19047aj0.this.f8410f.indicatorColors.length;
            C19047aj0.this.f8412h = true;
        }
    }

    /* renamed from: aj0$b */
    /* loaded from: classes4.dex */
    public class C1912b extends Property {
        public C1912b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C19047aj0 c19047aj0) {
            return Float.valueOf(c19047aj0.m65064n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C19047aj0 c19047aj0, Float f) {
            c19047aj0.m65060r(f.floatValue());
        }
    }

    public C19047aj0(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f8411g = 1;
        this.f8410f = linearProgressIndicatorSpec;
        this.f8409e = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public float m65064n() {
        return this.f8413i;
    }

    /* renamed from: o */
    private void m65063o() {
        if (this.f8408d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f8407j, 0.0f, 1.0f);
            this.f8408d = ofFloat;
            ofFloat.setDuration(333L);
            this.f8408d.setInterpolator(null);
            this.f8408d.setRepeatCount(-1);
            this.f8408d.addListener(new C1911a());
        }
    }

    /* renamed from: s */
    private void m65059s(int i) {
        this.f7802b[0] = 0.0f;
        float m65332b = m65332b(i, 0, 667);
        float[] fArr = this.f7802b;
        float interpolation = this.f8409e.getInterpolation(m65332b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f7802b;
        float interpolation2 = this.f8409e.getInterpolation(m65332b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f7802b[5] = 1.0f;
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: a */
    public void mo51887a() {
        ObjectAnimator objectAnimator = this.f8408d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: c */
    public void mo51886c() {
        m65061q();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: g */
    public void mo51883g() {
        m65063o();
        m65061q();
        this.f8408d.start();
    }

    /* renamed from: p */
    public final void m65062p() {
        if (this.f8412h && this.f7802b[3] < 1.0f) {
            int[] iArr = this.f7803c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = MaterialColors.compositeARGBWithAlpha(this.f8410f.indicatorColors[this.f8411g], this.f7801a.getAlpha());
            this.f8412h = false;
        }
    }

    /* renamed from: q */
    public void m65061q() {
        this.f8412h = true;
        this.f8411g = 1;
        Arrays.fill(this.f7803c, MaterialColors.compositeARGBWithAlpha(this.f8410f.indicatorColors[0], this.f7801a.getAlpha()));
    }

    /* renamed from: r */
    public void m65060r(float f) {
        this.f8413i = f;
        m65059s((int) (f * 333.0f));
        m65062p();
        this.f7801a.invalidateSelf();
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: f */
    public void mo51884f() {
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: h */
    public void mo51882h() {
    }

    @Override // p000.AbstractC18806Yd0
    /* renamed from: d */
    public void mo51885d(Animatable2Compat.AnimationCallback animationCallback) {
    }
}
