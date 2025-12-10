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

/* renamed from: pF */
/* loaded from: classes.dex */
public final class C13071pF implements TextFieldColors {

    /* renamed from: a */
    public final long f76517a;

    /* renamed from: b */
    public final long f76518b;

    /* renamed from: c */
    public final long f76519c;

    /* renamed from: d */
    public final long f76520d;

    /* renamed from: e */
    public final long f76521e;

    /* renamed from: f */
    public final long f76522f;

    /* renamed from: g */
    public final long f76523g;

    /* renamed from: h */
    public final long f76524h;

    /* renamed from: i */
    public final long f76525i;

    /* renamed from: j */
    public final long f76526j;

    /* renamed from: k */
    public final long f76527k;

    /* renamed from: l */
    public final long f76528l;

    /* renamed from: m */
    public final long f76529m;

    /* renamed from: n */
    public final long f76530n;

    /* renamed from: o */
    public final long f76531o;

    /* renamed from: p */
    public final long f76532p;

    /* renamed from: q */
    public final long f76533q;

    /* renamed from: r */
    public final long f76534r;

    /* renamed from: s */
    public final long f76535s;

    /* renamed from: t */
    public final long f76536t;

    /* renamed from: u */
    public final long f76537u;

    public /* synthetic */ C13071pF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: a */
    public static final boolean m23716a(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m23715b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(this.f76531o), composer, 0);
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
            j = this.f76520d;
        } else {
            j = this.f76519c;
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
        if (obj == null || C13071pF.class != obj.getClass()) {
            return false;
        }
        C13071pF c13071pF = (C13071pF) obj;
        if (Color.m71736equalsimpl0(this.f76517a, c13071pF.f76517a) && Color.m71736equalsimpl0(this.f76518b, c13071pF.f76518b) && Color.m71736equalsimpl0(this.f76519c, c13071pF.f76519c) && Color.m71736equalsimpl0(this.f76520d, c13071pF.f76520d) && Color.m71736equalsimpl0(this.f76521e, c13071pF.f76521e) && Color.m71736equalsimpl0(this.f76522f, c13071pF.f76522f) && Color.m71736equalsimpl0(this.f76523g, c13071pF.f76523g) && Color.m71736equalsimpl0(this.f76524h, c13071pF.f76524h) && Color.m71736equalsimpl0(this.f76525i, c13071pF.f76525i) && Color.m71736equalsimpl0(this.f76526j, c13071pF.f76526j) && Color.m71736equalsimpl0(this.f76527k, c13071pF.f76527k) && Color.m71736equalsimpl0(this.f76528l, c13071pF.f76528l) && Color.m71736equalsimpl0(this.f76529m, c13071pF.f76529m) && Color.m71736equalsimpl0(this.f76530n, c13071pF.f76530n) && Color.m71736equalsimpl0(this.f76531o, c13071pF.f76531o) && Color.m71736equalsimpl0(this.f76532p, c13071pF.f76532p) && Color.m71736equalsimpl0(this.f76533q, c13071pF.f76533q) && Color.m71736equalsimpl0(this.f76534r, c13071pF.f76534r) && Color.m71736equalsimpl0(this.f76535s, c13071pF.f76535s) && Color.m71736equalsimpl0(this.f76536t, c13071pF.f76536t) && Color.m71736equalsimpl0(this.f76537u, c13071pF.f76537u)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.m71742hashCodeimpl(this.f76517a) * 31) + Color.m71742hashCodeimpl(this.f76518b)) * 31) + Color.m71742hashCodeimpl(this.f76519c)) * 31) + Color.m71742hashCodeimpl(this.f76520d)) * 31) + Color.m71742hashCodeimpl(this.f76521e)) * 31) + Color.m71742hashCodeimpl(this.f76522f)) * 31) + Color.m71742hashCodeimpl(this.f76523g)) * 31) + Color.m71742hashCodeimpl(this.f76524h)) * 31) + Color.m71742hashCodeimpl(this.f76525i)) * 31) + Color.m71742hashCodeimpl(this.f76526j)) * 31) + Color.m71742hashCodeimpl(this.f76527k)) * 31) + Color.m71742hashCodeimpl(this.f76528l)) * 31) + Color.m71742hashCodeimpl(this.f76529m)) * 31) + Color.m71742hashCodeimpl(this.f76530n)) * 31) + Color.m71742hashCodeimpl(this.f76531o)) * 31) + Color.m71742hashCodeimpl(this.f76532p)) * 31) + Color.m71742hashCodeimpl(this.f76533q)) * 31) + Color.m71742hashCodeimpl(this.f76534r)) * 31) + Color.m71742hashCodeimpl(this.f76535s)) * 31) + Color.m71742hashCodeimpl(this.f76536t)) * 31) + Color.m71742hashCodeimpl(this.f76537u);
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
            j = this.f76524h;
        } else if (z2) {
            j = this.f76523g;
        } else if (m23716a(collectIsFocusedAsState)) {
            j = this.f76521e;
        } else {
            j = this.f76522f;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2054190397);
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054190292);
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
        composer.startReplaceableGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f76534r;
        } else if (z2) {
            j = this.f76535s;
        } else if (m23715b(collectIsFocusedAsState)) {
            j = this.f76532p;
        } else {
            j = this.f76533q;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
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
            j = this.f76526j;
        } else if (z2) {
            j = this.f76527k;
        } else {
            j = this.f76525i;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
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
            j = this.f76536t;
        } else {
            j = this.f76537u;
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
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        if (z) {
            j = this.f76517a;
        } else {
            j = this.f76518b;
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
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        if (!z) {
            j = this.f76529m;
        } else if (z2) {
            j = this.f76530n;
        } else {
            j = this.f76528l;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C13071pF(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f76517a = j;
        this.f76518b = j2;
        this.f76519c = j3;
        this.f76520d = j4;
        this.f76521e = j5;
        this.f76522f = j6;
        this.f76523g = j7;
        this.f76524h = j8;
        this.f76525i = j9;
        this.f76526j = j10;
        this.f76527k = j11;
        this.f76528l = j12;
        this.f76529m = j13;
        this.f76530n = j14;
        this.f76531o = j15;
        this.f76532p = j16;
        this.f76533q = j17;
        this.f76534r = j18;
        this.f76535s = j19;
        this.f76536t = j20;
        this.f76537u = j21;
    }
}
