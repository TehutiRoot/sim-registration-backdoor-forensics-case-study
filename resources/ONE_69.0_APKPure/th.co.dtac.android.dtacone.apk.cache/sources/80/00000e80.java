package p000;

import androidx.compose.material.SelectableChipColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: PE */
/* loaded from: classes.dex */
public final class C1075PE implements SelectableChipColors {

    /* renamed from: a */
    public final long f4715a;

    /* renamed from: b */
    public final long f4716b;

    /* renamed from: c */
    public final long f4717c;

    /* renamed from: d */
    public final long f4718d;

    /* renamed from: e */
    public final long f4719e;

    /* renamed from: f */
    public final long f4720f;

    /* renamed from: g */
    public final long f4721g;

    /* renamed from: h */
    public final long f4722h;

    /* renamed from: i */
    public final long f4723i;

    public /* synthetic */ C1075PE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
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
            j = this.f4718d;
        } else if (!z2) {
            j = this.f4715a;
        } else {
            j = this.f4721g;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
            j = this.f4719e;
        } else if (!z2) {
            j = this.f4716b;
        } else {
            j = this.f4722h;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
        if (obj == null || C1075PE.class != obj.getClass()) {
            return false;
        }
        C1075PE c1075pe = (C1075PE) obj;
        if (Color.m71920equalsimpl0(this.f4715a, c1075pe.f4715a) && Color.m71920equalsimpl0(this.f4716b, c1075pe.f4716b) && Color.m71920equalsimpl0(this.f4717c, c1075pe.f4717c) && Color.m71920equalsimpl0(this.f4718d, c1075pe.f4718d) && Color.m71920equalsimpl0(this.f4719e, c1075pe.f4719e) && Color.m71920equalsimpl0(this.f4720f, c1075pe.f4720f) && Color.m71920equalsimpl0(this.f4721g, c1075pe.f4721g) && Color.m71920equalsimpl0(this.f4722h, c1075pe.f4722h) && Color.m71920equalsimpl0(this.f4723i, c1075pe.f4723i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Color.m71926hashCodeimpl(this.f4715a) * 31) + Color.m71926hashCodeimpl(this.f4716b)) * 31) + Color.m71926hashCodeimpl(this.f4717c)) * 31) + Color.m71926hashCodeimpl(this.f4718d)) * 31) + Color.m71926hashCodeimpl(this.f4719e)) * 31) + Color.m71926hashCodeimpl(this.f4720f)) * 31) + Color.m71926hashCodeimpl(this.f4721g)) * 31) + Color.m71926hashCodeimpl(this.f4722h)) * 31) + Color.m71926hashCodeimpl(this.f4723i);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        if (!z) {
            j = this.f4720f;
        } else if (!z2) {
            j = this.f4717c;
        } else {
            j = this.f4723i;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C1075PE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f4715a = j;
        this.f4716b = j2;
        this.f4717c = j3;
        this.f4718d = j4;
        this.f4719e = j5;
        this.f4720f = j6;
        this.f4721g = j7;
        this.f4722h = j8;
        this.f4723i = j9;
    }
}