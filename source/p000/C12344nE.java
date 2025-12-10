package p000;

import androidx.compose.material.ButtonColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nE */
/* loaded from: classes.dex */
public final class C12344nE implements ButtonColors {

    /* renamed from: a */
    public final long f72158a;

    /* renamed from: b */
    public final long f72159b;

    /* renamed from: c */
    public final long f72160c;

    /* renamed from: d */
    public final long f72161d;

    public /* synthetic */ C12344nE(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @Override // androidx.compose.material.ButtonColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)");
        }
        if (z) {
            j = this.f72158a;
        } else {
            j = this.f72160c;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    public State contentColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)");
        }
        if (z) {
            j = this.f72159b;
        } else {
            j = this.f72161d;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12344nE.class != obj.getClass()) {
            return false;
        }
        C12344nE c12344nE = (C12344nE) obj;
        if (Color.m71736equalsimpl0(this.f72158a, c12344nE.f72158a) && Color.m71736equalsimpl0(this.f72159b, c12344nE.f72159b) && Color.m71736equalsimpl0(this.f72160c, c12344nE.f72160c) && Color.m71736equalsimpl0(this.f72161d, c12344nE.f72161d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m71742hashCodeimpl(this.f72158a) * 31) + Color.m71742hashCodeimpl(this.f72159b)) * 31) + Color.m71742hashCodeimpl(this.f72160c)) * 31) + Color.m71742hashCodeimpl(this.f72161d);
    }

    public C12344nE(long j, long j2, long j3, long j4) {
        this.f72158a = j;
        this.f72159b = j2;
        this.f72160c = j3;
        this.f72161d = j4;
    }
}
