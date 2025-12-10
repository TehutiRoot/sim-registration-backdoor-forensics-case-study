package p000;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: LE */
/* loaded from: classes.dex */
public final class C0785LE implements RadioButtonColors {

    /* renamed from: a */
    public final long f3539a;

    /* renamed from: b */
    public final long f3540b;

    /* renamed from: c */
    public final long f3541c;

    public /* synthetic */ C0785LE(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0785LE.class != obj.getClass()) {
            return false;
        }
        C0785LE c0785le = (C0785LE) obj;
        if (Color.m71920equalsimpl0(this.f3539a, c0785le.f3539a) && Color.m71920equalsimpl0(this.f3540b, c0785le.f3540b) && Color.m71920equalsimpl0(this.f3541c, c0785le.f3541c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m71926hashCodeimpl(this.f3539a) * 31) + Color.m71926hashCodeimpl(this.f3540b)) * 31) + Color.m71926hashCodeimpl(this.f3541c);
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State radioColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.f3541c;
        } else if (!z2) {
            j = this.f3540b;
        } else {
            j = this.f3539a;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1052799107);
            rememberUpdatedState = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C0785LE(long j, long j2, long j3) {
        this.f3539a = j;
        this.f3540b = j2;
        this.f3541c = j3;
    }
}