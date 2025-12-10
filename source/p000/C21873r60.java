package p000;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import androidx.compose.p003ui.unit.C3641Dp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21873r60 extends EdgeEffect {

    /* renamed from: a */
    public final float f77170a;

    /* renamed from: b */
    public float f77171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21873r60(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77170a = AndroidDensity_androidKt.Density(context).mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(1));
    }

    /* renamed from: a */
    public final void m23359a(float f) {
        float f2 = this.f77171b + f;
        this.f77171b = f2;
        if (Math.abs(f2) > this.f77170a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        this.f77171b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        this.f77171b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f77171b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        this.f77171b = 0.0f;
        super.onPull(f);
    }
}
