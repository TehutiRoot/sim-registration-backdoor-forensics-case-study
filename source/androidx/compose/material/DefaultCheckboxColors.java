package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.state.ToggleableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DefaultCheckboxColors implements CheckboxColors {

    /* renamed from: a */
    public final long f14439a;

    /* renamed from: b */
    public final long f14440b;

    /* renamed from: c */
    public final long f14441c;

    /* renamed from: d */
    public final long f14442d;

    /* renamed from: e */
    public final long f14443e;

    /* renamed from: f */
    public final long f14444f;

    /* renamed from: g */
    public final long f14445g;

    /* renamed from: h */
    public final long f14446h;

    /* renamed from: i */
    public final long f14447i;

    /* renamed from: j */
    public final long f14448j;

    /* renamed from: k */
    public final long f14449k;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Override // androidx.compose.material.CheckboxColors
    public State borderColor(boolean z, ToggleableState state, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f14447i;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f14446h;
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f14449k;
                }
            }
            j = this.f14448j;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-796405227);
            if (state == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State boxColor(boolean z, ToggleableState state, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f14442d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f14441c;
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j = this.f14444f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f14445g;
                }
            } else {
                j = this.f14443e;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2010643468);
            if (state == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State checkmarkColor(ToggleableState state, Composer composer, int i) {
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        if (state == toggleableState) {
            j = this.f14440b;
        } else {
            j = this.f14439a;
        }
        long j2 = j;
        if (state == toggleableState) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        State<Color> m69242animateColorAsStateeuL9pac = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69242animateColorAsStateeuL9pac;
    }

    public DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f14439a = j;
        this.f14440b = j2;
        this.f14441c = j3;
        this.f14442d = j4;
        this.f14443e = j5;
        this.f14444f = j6;
        this.f14445g = j7;
        this.f14446h = j8;
        this.f14447i = j9;
        this.f14448j = j10;
        this.f14449k = j11;
    }
}
