package p000;

import androidx.compose.material3.NavigationDrawerItemColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tE */
/* loaded from: classes2.dex */
public final class C13985tE implements NavigationDrawerItemColors {

    /* renamed from: a */
    public final long f80037a;

    /* renamed from: b */
    public final long f80038b;

    /* renamed from: c */
    public final long f80039c;

    /* renamed from: d */
    public final long f80040d;

    /* renamed from: e */
    public final long f80041e;

    /* renamed from: f */
    public final long f80042f;

    /* renamed from: g */
    public final long f80043g;

    /* renamed from: h */
    public final long f80044h;

    public /* synthetic */ C13985tE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State badgeColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:803)");
        }
        if (z) {
            j = this.f80043g;
        } else {
            j = this.f80044h;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State containerColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:796)");
        }
        if (z) {
            j = this.f80041e;
        } else {
            j = this.f80042f;
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
        if (!(obj instanceof C13985tE)) {
            return false;
        }
        C13985tE c13985tE = (C13985tE) obj;
        if (Color.m71736equalsimpl0(this.f80037a, c13985tE.f80037a) && Color.m71736equalsimpl0(this.f80038b, c13985tE.f80038b) && Color.m71736equalsimpl0(this.f80039c, c13985tE.f80039c) && Color.m71736equalsimpl0(this.f80040d, c13985tE.f80040d) && Color.m71736equalsimpl0(this.f80041e, c13985tE.f80041e) && Color.m71736equalsimpl0(this.f80042f, c13985tE.f80042f) && Color.m71736equalsimpl0(this.f80043g, c13985tE.f80043g) && Color.m71736equalsimpl0(this.f80044h, c13985tE.f80044h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m71742hashCodeimpl(this.f80037a) * 31) + Color.m71742hashCodeimpl(this.f80038b)) * 31) + Color.m71742hashCodeimpl(this.f80039c)) * 31) + Color.m71742hashCodeimpl(this.f80040d)) * 31) + Color.m71742hashCodeimpl(this.f80041e)) * 31) + Color.m71742hashCodeimpl(this.f80042f)) * 31) + Color.m71742hashCodeimpl(this.f80043g)) * 31) + Color.m71742hashCodeimpl(this.f80044h);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State iconColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:786)");
        }
        if (z) {
            j = this.f80037a;
        } else {
            j = this.f80038b;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State textColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:791)");
        }
        if (z) {
            j = this.f80039c;
        } else {
            j = this.f80040d;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C13985tE(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f80037a = j;
        this.f80038b = j2;
        this.f80039c = j3;
        this.f80040d = j4;
        this.f80041e = j5;
        this.f80042f = j6;
        this.f80043g = j7;
        this.f80044h = j8;
    }
}
