package p000;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p003ui.unit.AndroidDensity_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22974x60 extends EdgeEffect {

    /* renamed from: a */
    public final float f108648a;

    /* renamed from: b */
    public float f108649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22974x60(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108648a = AndroidDensity_androidKt.Density(context).mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(1));
    }

    /* renamed from: a */
    public final void m606a(float f) {
        float f2 = this.f108649b + f;
        this.f108649b = f2;
        if (Math.abs(f2) > this.f108648a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        this.f108649b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        this.f108649b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f108649b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        this.f108649b = 0.0f;
        super.onPull(f);
    }
}