package p000;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: KE */
/* loaded from: classes.dex */
public final class C0726KE implements RadioButtonColors {

    /* renamed from: a */
    public final long f3144a;

    /* renamed from: b */
    public final long f3145b;

    /* renamed from: c */
    public final long f3146c;

    public /* synthetic */ C0726KE(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0726KE.class != obj.getClass()) {
            return false;
        }
        C0726KE c0726ke = (C0726KE) obj;
        if (Color.m71736equalsimpl0(this.f3144a, c0726ke.f3144a) && Color.m71736equalsimpl0(this.f3145b, c0726ke.f3145b) && Color.m71736equalsimpl0(this.f3146c, c0726ke.f3146c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m71742hashCodeimpl(this.f3144a) * 31) + Color.m71742hashCodeimpl(this.f3145b)) * 31) + Color.m71742hashCodeimpl(this.f3146c);
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State radioColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.f3146c;
        } else if (!z2) {
            j = this.f3145b;
        } else {
            j = this.f3144a;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1052799107);
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public C0726KE(long j, long j2, long j3) {
        this.f3144a = j;
        this.f3145b = j2;
        this.f3146c = j3;
    }
}
