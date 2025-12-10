package p000;

import androidx.compose.material.SelectableChipColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: OE */
/* loaded from: classes.dex */
public final class C1000OE implements SelectableChipColors {

    /* renamed from: a */
    public final long f4331a;

    /* renamed from: b */
    public final long f4332b;

    /* renamed from: c */
    public final long f4333c;

    /* renamed from: d */
    public final long f4334d;

    /* renamed from: e */
    public final long f4335e;

    /* renamed from: f */
    public final long f4336f;

    /* renamed from: g */
    public final long f4337g;

    /* renamed from: h */
    public final long f4338h;

    /* renamed from: i */
    public final long f4339i;

    public /* synthetic */ C1000OE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State backgroundColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:654)");
        }
        if (!z) {
            j = this.f4334d;
        } else if (!z2) {
            j = this.f4331a;
        } else {
            j = this.f4337g;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State contentColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:664)");
        }
        if (!z) {
            j = this.f4335e;
        } else if (!z2) {
            j = this.f4332b;
        } else {
            j = this.f4338h;
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
        if (obj == null || C1000OE.class != obj.getClass()) {
            return false;
        }
        C1000OE c1000oe = (C1000OE) obj;
        if (Color.m71736equalsimpl0(this.f4331a, c1000oe.f4331a) && Color.m71736equalsimpl0(this.f4332b, c1000oe.f4332b) && Color.m71736equalsimpl0(this.f4333c, c1000oe.f4333c) && Color.m71736equalsimpl0(this.f4334d, c1000oe.f4334d) && Color.m71736equalsimpl0(this.f4335e, c1000oe.f4335e) && Color.m71736equalsimpl0(this.f4336f, c1000oe.f4336f) && Color.m71736equalsimpl0(this.f4337g, c1000oe.f4337g) && Color.m71736equalsimpl0(this.f4338h, c1000oe.f4338h) && Color.m71736equalsimpl0(this.f4339i, c1000oe.f4339i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Color.m71742hashCodeimpl(this.f4331a) * 31) + Color.m71742hashCodeimpl(this.f4332b)) * 31) + Color.m71742hashCodeimpl(this.f4333c)) * 31) + Color.m71742hashCodeimpl(this.f4334d)) * 31) + Color.m71742hashCodeimpl(this.f4335e)) * 31) + Color.m71742hashCodeimpl(this.f4336f)) * 31) + Color.m71742hashCodeimpl(this.f4337g)) * 31) + Color.m71742hashCodeimpl(this.f4338h)) * 31) + Color.m71742hashCodeimpl(this.f4339i);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        if (!z) {
            j = this.f4336f;
        } else if (!z2) {
            j = this.f4333c;
        } else {
            j = this.f4339i;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C1000OE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f4331a = j;
        this.f4332b = j2;
        this.f4333c = j3;
        this.f4334d = j4;
        this.f4335e = j5;
        this.f4336f = j6;
        this.f4337g = j7;
        this.f4338h = j8;
        this.f4339i = j9;
    }
}
