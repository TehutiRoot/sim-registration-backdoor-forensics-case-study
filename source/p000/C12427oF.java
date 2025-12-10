package p000;

import androidx.compose.material.SwitchColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oF */
/* loaded from: classes.dex */
public final class C12427oF implements SwitchColors {

    /* renamed from: a */
    public final long f72620a;

    /* renamed from: b */
    public final long f72621b;

    /* renamed from: c */
    public final long f72622c;

    /* renamed from: d */
    public final long f72623d;

    /* renamed from: e */
    public final long f72624e;

    /* renamed from: f */
    public final long f72625f;

    /* renamed from: g */
    public final long f72626g;

    /* renamed from: h */
    public final long f72627h;

    public /* synthetic */ C12427oF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12427oF.class != obj.getClass()) {
            return false;
        }
        C12427oF c12427oF = (C12427oF) obj;
        if (Color.m71736equalsimpl0(this.f72620a, c12427oF.f72620a) && Color.m71736equalsimpl0(this.f72621b, c12427oF.f72621b) && Color.m71736equalsimpl0(this.f72622c, c12427oF.f72622c) && Color.m71736equalsimpl0(this.f72623d, c12427oF.f72623d) && Color.m71736equalsimpl0(this.f72624e, c12427oF.f72624e) && Color.m71736equalsimpl0(this.f72625f, c12427oF.f72625f) && Color.m71736equalsimpl0(this.f72626g, c12427oF.f72626g) && Color.m71736equalsimpl0(this.f72627h, c12427oF.f72627h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m71742hashCodeimpl(this.f72620a) * 31) + Color.m71742hashCodeimpl(this.f72621b)) * 31) + Color.m71742hashCodeimpl(this.f72622c)) * 31) + Color.m71742hashCodeimpl(this.f72623d)) * 31) + Color.m71742hashCodeimpl(this.f72624e)) * 31) + Color.m71742hashCodeimpl(this.f72625f)) * 31) + Color.m71742hashCodeimpl(this.f72626g)) * 31) + Color.m71742hashCodeimpl(this.f72627h);
    }

    @Override // androidx.compose.material.SwitchColors
    public State thumbColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:366)");
        }
        if (z) {
            if (z2) {
                j = this.f72620a;
            } else {
                j = this.f72622c;
            }
        } else if (z2) {
            j = this.f72624e;
        } else {
            j = this.f72626g;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    public State trackColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:377)");
        }
        if (z) {
            if (z2) {
                j = this.f72621b;
            } else {
                j = this.f72623d;
            }
        } else if (z2) {
            j = this.f72625f;
        } else {
            j = this.f72627h;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C12427oF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f72620a = j;
        this.f72621b = j2;
        this.f72622c = j3;
        this.f72623d = j4;
        this.f72624e = j5;
        this.f72625f = j6;
        this.f72626g = j7;
        this.f72627h = j8;
    }
}
