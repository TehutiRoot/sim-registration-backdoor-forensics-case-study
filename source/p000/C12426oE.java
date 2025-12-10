package p000;

import androidx.compose.material.ChipColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oE */
/* loaded from: classes.dex */
public final class C12426oE implements ChipColors {

    /* renamed from: a */
    public final long f72609a;

    /* renamed from: b */
    public final long f72610b;

    /* renamed from: c */
    public final long f72611c;

    /* renamed from: d */
    public final long f72612d;

    /* renamed from: e */
    public final long f72613e;

    /* renamed from: f */
    public final long f72614f;

    public /* synthetic */ C12426oE(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @Override // androidx.compose.material.ChipColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:592)");
        }
        if (z) {
            j = this.f72609a;
        } else {
            j = this.f72612d;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    public State contentColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:597)");
        }
        if (z) {
            j = this.f72610b;
        } else {
            j = this.f72613e;
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
        if (obj == null || C12426oE.class != obj.getClass()) {
            return false;
        }
        C12426oE c12426oE = (C12426oE) obj;
        if (Color.m71736equalsimpl0(this.f72609a, c12426oE.f72609a) && Color.m71736equalsimpl0(this.f72610b, c12426oE.f72610b) && Color.m71736equalsimpl0(this.f72611c, c12426oE.f72611c) && Color.m71736equalsimpl0(this.f72612d, c12426oE.f72612d) && Color.m71736equalsimpl0(this.f72613e, c12426oE.f72613e) && Color.m71736equalsimpl0(this.f72614f, c12426oE.f72614f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m71742hashCodeimpl(this.f72609a) * 31) + Color.m71742hashCodeimpl(this.f72610b)) * 31) + Color.m71742hashCodeimpl(this.f72611c)) * 31) + Color.m71742hashCodeimpl(this.f72612d)) * 31) + Color.m71742hashCodeimpl(this.f72613e)) * 31) + Color.m71742hashCodeimpl(this.f72614f);
    }

    @Override // androidx.compose.material.ChipColors
    public State leadingIconContentColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:602)");
        }
        if (z) {
            j = this.f72611c;
        } else {
            j = this.f72614f;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C12426oE(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f72609a = j;
        this.f72610b = j2;
        this.f72611c = j3;
        this.f72612d = j4;
        this.f72613e = j5;
        this.f72614f = j6;
    }
}
