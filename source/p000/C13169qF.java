package p000;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColorsWithIcons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qF */
/* loaded from: classes.dex */
public final class C13169qF implements TextFieldColorsWithIcons {

    /* renamed from: a */
    public final long f76909a;

    /* renamed from: b */
    public final long f76910b;

    /* renamed from: c */
    public final long f76911c;

    /* renamed from: d */
    public final long f76912d;

    /* renamed from: e */
    public final long f76913e;

    /* renamed from: f */
    public final long f76914f;

    /* renamed from: g */
    public final long f76915g;

    /* renamed from: h */
    public final long f76916h;

    /* renamed from: i */
    public final long f76917i;

    /* renamed from: j */
    public final long f76918j;

    /* renamed from: k */
    public final long f76919k;

    /* renamed from: l */
    public final long f76920l;

    /* renamed from: m */
    public final long f76921m;

    /* renamed from: n */
    public final long f76922n;

    /* renamed from: o */
    public final long f76923o;

    /* renamed from: p */
    public final long f76924p;

    /* renamed from: q */
    public final long f76925q;

    /* renamed from: r */
    public final long f76926r;

    /* renamed from: s */
    public final long f76927s;

    /* renamed from: t */
    public final long f76928t;

    /* renamed from: u */
    public final long f76929u;

    /* renamed from: v */
    public final long f76930v;

    public /* synthetic */ C13169qF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    /* renamed from: a */
    public static final boolean m23525a(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m23524b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final boolean m23523c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-28962788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28962788, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:643)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(this.f76924p), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State cursorColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-930693132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-930693132, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:675)");
        }
        if (z) {
            j = this.f76912d;
        } else {
            j = this.f76911c;
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
        if (obj == null || C13169qF.class != obj.getClass()) {
            return false;
        }
        C13169qF c13169qF = (C13169qF) obj;
        if (Color.m71736equalsimpl0(this.f76909a, c13169qF.f76909a) && Color.m71736equalsimpl0(this.f76910b, c13169qF.f76910b) && Color.m71736equalsimpl0(this.f76911c, c13169qF.f76911c) && Color.m71736equalsimpl0(this.f76912d, c13169qF.f76912d) && Color.m71736equalsimpl0(this.f76913e, c13169qF.f76913e) && Color.m71736equalsimpl0(this.f76914f, c13169qF.f76914f) && Color.m71736equalsimpl0(this.f76915g, c13169qF.f76915g) && Color.m71736equalsimpl0(this.f76916h, c13169qF.f76916h) && Color.m71736equalsimpl0(this.f76917i, c13169qF.f76917i) && Color.m71736equalsimpl0(this.f76918j, c13169qF.f76918j) && Color.m71736equalsimpl0(this.f76919k, c13169qF.f76919k) && Color.m71736equalsimpl0(this.f76920l, c13169qF.f76920l) && Color.m71736equalsimpl0(this.f76921m, c13169qF.f76921m) && Color.m71736equalsimpl0(this.f76922n, c13169qF.f76922n) && Color.m71736equalsimpl0(this.f76923o, c13169qF.f76923o) && Color.m71736equalsimpl0(this.f76924p, c13169qF.f76924p) && Color.m71736equalsimpl0(this.f76925q, c13169qF.f76925q) && Color.m71736equalsimpl0(this.f76926r, c13169qF.f76926r) && Color.m71736equalsimpl0(this.f76927s, c13169qF.f76927s) && Color.m71736equalsimpl0(this.f76928t, c13169qF.f76928t) && Color.m71736equalsimpl0(this.f76929u, c13169qF.f76929u) && Color.m71736equalsimpl0(this.f76930v, c13169qF.f76930v)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m71742hashCodeimpl(this.f76909a) * 31) + Color.m71742hashCodeimpl(this.f76910b)) * 31) + Color.m71742hashCodeimpl(this.f76911c)) * 31) + Color.m71742hashCodeimpl(this.f76912d)) * 31) + Color.m71742hashCodeimpl(this.f76913e)) * 31) + Color.m71742hashCodeimpl(this.f76914f)) * 31) + Color.m71742hashCodeimpl(this.f76915g)) * 31) + Color.m71742hashCodeimpl(this.f76916h)) * 31) + Color.m71742hashCodeimpl(this.f76917i)) * 31) + Color.m71742hashCodeimpl(this.f76918j)) * 31) + Color.m71742hashCodeimpl(this.f76919k)) * 31) + Color.m71742hashCodeimpl(this.f76920l)) * 31) + Color.m71742hashCodeimpl(this.f76921m)) * 31) + Color.m71742hashCodeimpl(this.f76922n)) * 31) + Color.m71742hashCodeimpl(this.f76923o)) * 31) + Color.m71742hashCodeimpl(this.f76924p)) * 31) + Color.m71742hashCodeimpl(this.f76925q)) * 31) + Color.m71742hashCodeimpl(this.f76926r)) * 31) + Color.m71742hashCodeimpl(this.f76927s)) * 31) + Color.m71742hashCodeimpl(this.f76928t)) * 31) + Color.m71742hashCodeimpl(this.f76929u)) * 31) + Color.m71742hashCodeimpl(this.f76930v);
    }

    @Override // androidx.compose.material.TextFieldColors
    public State indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(476110356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(476110356, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:622)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f76916h;
        } else if (z2) {
            j = this.f76915g;
        } else if (m23525a(collectIsFocusedAsState)) {
            j = this.f76913e;
        } else {
            j = this.f76914f;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(182315078);
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(182315183);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1749156593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749156593, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:653)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f76927s;
        } else if (z2) {
            j = this.f76928t;
        } else if (m23524b(collectIsFocusedAsState)) {
            j = this.f76925q;
        } else {
            j = this.f76926r;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public /* synthetic */ State leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        return WR1.m65630a(this, z, z2, interactionSource, composer, i);
    }

    @Override // androidx.compose.material.TextFieldColors
    public State placeholderColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1742462291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742462291, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:648)");
        }
        if (z) {
            j = this.f76929u;
        } else {
            j = this.f76930v;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State textColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(394526077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394526077, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:670)");
        }
        if (z) {
            j = this.f76909a;
        } else {
            j = this.f76910b;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State trailingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1665901393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665901393, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:593)");
        }
        if (!z) {
            j = this.f76922n;
        } else if (z2) {
            j = this.f76923o;
        } else {
            j = this.f76920l;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C13169qF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.f76909a = j;
        this.f76910b = j2;
        this.f76911c = j3;
        this.f76912d = j4;
        this.f76913e = j5;
        this.f76914f = j6;
        this.f76915g = j7;
        this.f76916h = j8;
        this.f76917i = j9;
        this.f76918j = j10;
        this.f76919k = j11;
        this.f76920l = j12;
        this.f76921m = j13;
        this.f76922n = j14;
        this.f76923o = j15;
        this.f76924p = j16;
        this.f76925q = j17;
        this.f76926r = j18;
        this.f76927s = j19;
        this.f76928t = j20;
        this.f76929u = j21;
        this.f76930v = j22;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-776179197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776179197, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:582)");
        }
        if (!z) {
            j = this.f76918j;
        } else if (z2) {
            j = this.f76919k;
        } else {
            j = this.f76917i;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public State trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(79259602);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(79259602, i, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:604)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f76922n;
        } else if (z2) {
            j = this.f76923o;
        } else {
            j = m23523c(collectIsFocusedAsState) ? this.f76921m : this.f76920l;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
