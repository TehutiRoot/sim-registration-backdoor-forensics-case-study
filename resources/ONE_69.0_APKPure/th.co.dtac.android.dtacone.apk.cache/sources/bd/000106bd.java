package p000;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qF */
/* loaded from: classes.dex */
public final class C13171qF implements TextFieldColors {

    /* renamed from: a */
    public final long f77118a;

    /* renamed from: b */
    public final long f77119b;

    /* renamed from: c */
    public final long f77120c;

    /* renamed from: d */
    public final long f77121d;

    /* renamed from: e */
    public final long f77122e;

    /* renamed from: f */
    public final long f77123f;

    /* renamed from: g */
    public final long f77124g;

    /* renamed from: h */
    public final long f77125h;

    /* renamed from: i */
    public final long f77126i;

    /* renamed from: j */
    public final long f77127j;

    /* renamed from: k */
    public final long f77128k;

    /* renamed from: l */
    public final long f77129l;

    /* renamed from: m */
    public final long f77130m;

    /* renamed from: n */
    public final long f77131n;

    /* renamed from: o */
    public final long f77132o;

    /* renamed from: p */
    public final long f77133p;

    /* renamed from: q */
    public final long f77134q;

    /* renamed from: r */
    public final long f77135r;

    /* renamed from: s */
    public final long f77136s;

    /* renamed from: t */
    public final long f77137t;

    /* renamed from: u */
    public final long f77138u;

    public /* synthetic */ C13171qF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: a */
    public static final boolean m23684a(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m23683b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(this.f77132o), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State cursorColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
        }
        if (z) {
            j = this.f77121d;
        } else {
            j = this.f77120c;
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
        if (obj == null || C13171qF.class != obj.getClass()) {
            return false;
        }
        C13171qF c13171qF = (C13171qF) obj;
        if (Color.m71920equalsimpl0(this.f77118a, c13171qF.f77118a) && Color.m71920equalsimpl0(this.f77119b, c13171qF.f77119b) && Color.m71920equalsimpl0(this.f77120c, c13171qF.f77120c) && Color.m71920equalsimpl0(this.f77121d, c13171qF.f77121d) && Color.m71920equalsimpl0(this.f77122e, c13171qF.f77122e) && Color.m71920equalsimpl0(this.f77123f, c13171qF.f77123f) && Color.m71920equalsimpl0(this.f77124g, c13171qF.f77124g) && Color.m71920equalsimpl0(this.f77125h, c13171qF.f77125h) && Color.m71920equalsimpl0(this.f77126i, c13171qF.f77126i) && Color.m71920equalsimpl0(this.f77127j, c13171qF.f77127j) && Color.m71920equalsimpl0(this.f77128k, c13171qF.f77128k) && Color.m71920equalsimpl0(this.f77129l, c13171qF.f77129l) && Color.m71920equalsimpl0(this.f77130m, c13171qF.f77130m) && Color.m71920equalsimpl0(this.f77131n, c13171qF.f77131n) && Color.m71920equalsimpl0(this.f77132o, c13171qF.f77132o) && Color.m71920equalsimpl0(this.f77133p, c13171qF.f77133p) && Color.m71920equalsimpl0(this.f77134q, c13171qF.f77134q) && Color.m71920equalsimpl0(this.f77135r, c13171qF.f77135r) && Color.m71920equalsimpl0(this.f77136s, c13171qF.f77136s) && Color.m71920equalsimpl0(this.f77137t, c13171qF.f77137t) && Color.m71920equalsimpl0(this.f77138u, c13171qF.f77138u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m71926hashCodeimpl(this.f77118a) * 31) + Color.m71926hashCodeimpl(this.f77119b)) * 31) + Color.m71926hashCodeimpl(this.f77120c)) * 31) + Color.m71926hashCodeimpl(this.f77121d)) * 31) + Color.m71926hashCodeimpl(this.f77122e)) * 31) + Color.m71926hashCodeimpl(this.f77123f)) * 31) + Color.m71926hashCodeimpl(this.f77124g)) * 31) + Color.m71926hashCodeimpl(this.f77125h)) * 31) + Color.m71926hashCodeimpl(this.f77126i)) * 31) + Color.m71926hashCodeimpl(this.f77127j)) * 31) + Color.m71926hashCodeimpl(this.f77128k)) * 31) + Color.m71926hashCodeimpl(this.f77129l)) * 31) + Color.m71926hashCodeimpl(this.f77130m)) * 31) + Color.m71926hashCodeimpl(this.f77131n)) * 31) + Color.m71926hashCodeimpl(this.f77132o)) * 31) + Color.m71926hashCodeimpl(this.f77133p)) * 31) + Color.m71926hashCodeimpl(this.f77134q)) * 31) + Color.m71926hashCodeimpl(this.f77135r)) * 31) + Color.m71926hashCodeimpl(this.f77136s)) * 31) + Color.m71926hashCodeimpl(this.f77137t)) * 31) + Color.m71926hashCodeimpl(this.f77138u);
    }

    @Override // androidx.compose.material.TextFieldColors
    public State indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f77125h;
        } else if (z2) {
            j = this.f77124g;
        } else if (m23684a(collectIsFocusedAsState)) {
            j = this.f77122e;
        } else {
            j = this.f77123f;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2054190397);
            rememberUpdatedState = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054190292);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j2), composer, 0);
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
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f77135r;
        } else if (z2) {
            j = this.f77136s;
        } else if (m23683b(collectIsFocusedAsState)) {
            j = this.f77133p;
        } else {
            j = this.f77134q;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
        }
        if (!z) {
            j = this.f77127j;
        } else if (z2) {
            j = this.f77128k;
        } else {
            j = this.f77126i;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State placeholderColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
        }
        if (z) {
            j = this.f77137t;
        } else {
            j = this.f77138u;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State textColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        if (z) {
            j = this.f77118a;
        } else {
            j = this.f77119b;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State trailingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        if (!z) {
            j = this.f77130m;
        } else if (z2) {
            j = this.f77131n;
        } else {
            j = this.f77129l;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C13171qF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f77118a = j;
        this.f77119b = j2;
        this.f77120c = j3;
        this.f77121d = j4;
        this.f77122e = j5;
        this.f77123f = j6;
        this.f77124g = j7;
        this.f77125h = j8;
        this.f77126i = j9;
        this.f77127j = j10;
        this.f77128k = j11;
        this.f77129l = j12;
        this.f77130m = j13;
        this.f77131n = j14;
        this.f77132o = j15;
        this.f77133p = j16;
        this.f77134q = j17;
        this.f77135r = j18;
        this.f77136s = j19;
        this.f77137t = j20;
        this.f77138u = j21;
    }
}