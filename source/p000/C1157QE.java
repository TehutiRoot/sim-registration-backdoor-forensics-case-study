package p000;

import androidx.compose.material.SliderColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: QE */
/* loaded from: classes.dex */
public final class C1157QE implements SliderColors {

    /* renamed from: a */
    public final long f4997a;

    /* renamed from: b */
    public final long f4998b;

    /* renamed from: c */
    public final long f4999c;

    /* renamed from: d */
    public final long f5000d;

    /* renamed from: e */
    public final long f5001e;

    /* renamed from: f */
    public final long f5002f;

    /* renamed from: g */
    public final long f5003g;

    /* renamed from: h */
    public final long f5004h;

    /* renamed from: i */
    public final long f5005i;

    /* renamed from: j */
    public final long f5006j;

    public /* synthetic */ C1157QE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1157QE.class != obj.getClass()) {
            return false;
        }
        C1157QE c1157qe = (C1157QE) obj;
        if (Color.m71736equalsimpl0(this.f4997a, c1157qe.f4997a) && Color.m71736equalsimpl0(this.f4998b, c1157qe.f4998b) && Color.m71736equalsimpl0(this.f4999c, c1157qe.f4999c) && Color.m71736equalsimpl0(this.f5000d, c1157qe.f5000d) && Color.m71736equalsimpl0(this.f5001e, c1157qe.f5001e) && Color.m71736equalsimpl0(this.f5002f, c1157qe.f5002f) && Color.m71736equalsimpl0(this.f5003g, c1157qe.f5003g) && Color.m71736equalsimpl0(this.f5004h, c1157qe.f5004h) && Color.m71736equalsimpl0(this.f5005i, c1157qe.f5005i) && Color.m71736equalsimpl0(this.f5006j, c1157qe.f5006j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m71742hashCodeimpl(this.f4997a) * 31) + Color.m71742hashCodeimpl(this.f4998b)) * 31) + Color.m71742hashCodeimpl(this.f4999c)) * 31) + Color.m71742hashCodeimpl(this.f5000d)) * 31) + Color.m71742hashCodeimpl(this.f5001e)) * 31) + Color.m71742hashCodeimpl(this.f5002f)) * 31) + Color.m71742hashCodeimpl(this.f5003g)) * 31) + Color.m71742hashCodeimpl(this.f5004h)) * 31) + Color.m71742hashCodeimpl(this.f5005i)) * 31) + Color.m71742hashCodeimpl(this.f5006j);
    }

    @Override // androidx.compose.material.SliderColors
    public State thumbColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1086)");
        }
        if (z) {
            j = this.f4997a;
        } else {
            j = this.f4998b;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State tickColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1102)");
        }
        if (z) {
            if (z2) {
                j = this.f5003g;
            } else {
                j = this.f5004h;
            }
        } else if (z2) {
            j = this.f5005i;
        } else {
            j = this.f5006j;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    public State trackColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1091)");
        }
        if (z) {
            if (z2) {
                j = this.f4999c;
            } else {
                j = this.f5000d;
            }
        } else if (z2) {
            j = this.f5001e;
        } else {
            j = this.f5002f;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C1157QE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f4997a = j;
        this.f4998b = j2;
        this.f4999c = j3;
        this.f5000d = j4;
        this.f5001e = j5;
        this.f5002f = j6;
        this.f5003g = j7;
        this.f5004h = j8;
        this.f5005i = j9;
        this.f5006j = j10;
    }
}
