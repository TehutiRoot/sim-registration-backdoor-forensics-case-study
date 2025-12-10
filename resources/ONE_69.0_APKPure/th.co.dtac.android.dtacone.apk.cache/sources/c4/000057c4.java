package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bd\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010$R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010$R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010$R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010$R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010$R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010$R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010$R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010$R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010$R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m29142d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/state/ToggleableState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/runtime/State;", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "checkmarkColor", "", "enabled", "boxColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "borderColor$material3_release", "borderColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CheckboxColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25700a;

    /* renamed from: b */
    public final long f25701b;

    /* renamed from: c */
    public final long f25702c;

    /* renamed from: d */
    public final long f25703d;

    /* renamed from: e */
    public final long f25704e;

    /* renamed from: f */
    public final long f25705f;

    /* renamed from: g */
    public final long f25706g;

    /* renamed from: h */
    public final long f25707h;

    /* renamed from: i */
    public final long f25708i;

    /* renamed from: j */
    public final long f25709j;

    /* renamed from: k */
    public final long f25710k;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
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

    public /* synthetic */ CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    @Composable
    @NotNull
    public final State<Color> borderColor$material3_release(boolean z, @NotNull ToggleableState state, @Nullable Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:448)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f25708i;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f25707h;
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f25710k;
                }
            }
            j = this.f25709j;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1209369567);
            if (state == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209369753);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> boxColor$material3_release(boolean z, @NotNull ToggleableState state, @Nullable Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:417)");
        }
        if (z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    j = this.f25703d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = this.f25702c;
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j = this.f25705f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j = this.f25706g;
                }
            } else {
                j = this.f25704e;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(1143718427);
            if (state == ToggleableState.Off) {
                i2 = 100;
            } else {
                i2 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143718613);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> checkmarkColor$material3_release(@NotNull ToggleableState state, @Nullable Composer composer, int i) {
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:398)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        if (state == toggleableState) {
            j = this.f25701b;
        } else {
            j = this.f25700a;
        }
        long j2 = j;
        if (state == toggleableState) {
            i2 = 100;
        } else {
            i2 = 50;
        }
        State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(i2, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        if (Color.m71920equalsimpl0(this.f25700a, checkboxColors.f25700a) && Color.m71920equalsimpl0(this.f25701b, checkboxColors.f25701b) && Color.m71920equalsimpl0(this.f25702c, checkboxColors.f25702c) && Color.m71920equalsimpl0(this.f25703d, checkboxColors.f25703d) && Color.m71920equalsimpl0(this.f25704e, checkboxColors.f25704e) && Color.m71920equalsimpl0(this.f25705f, checkboxColors.f25705f) && Color.m71920equalsimpl0(this.f25706g, checkboxColors.f25706g) && Color.m71920equalsimpl0(this.f25707h, checkboxColors.f25707h) && Color.m71920equalsimpl0(this.f25708i, checkboxColors.f25708i) && Color.m71920equalsimpl0(this.f25709j, checkboxColors.f25709j) && Color.m71920equalsimpl0(this.f25710k, checkboxColors.f25710k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((Color.m71926hashCodeimpl(this.f25700a) * 31) + Color.m71926hashCodeimpl(this.f25701b)) * 31) + Color.m71926hashCodeimpl(this.f25702c)) * 31) + Color.m71926hashCodeimpl(this.f25703d)) * 31) + Color.m71926hashCodeimpl(this.f25704e)) * 31) + Color.m71926hashCodeimpl(this.f25705f)) * 31) + Color.m71926hashCodeimpl(this.f25706g)) * 31) + Color.m71926hashCodeimpl(this.f25707h)) * 31) + Color.m71926hashCodeimpl(this.f25708i)) * 31) + Color.m71926hashCodeimpl(this.f25709j)) * 31) + Color.m71926hashCodeimpl(this.f25710k);
    }

    public CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f25700a = j;
        this.f25701b = j2;
        this.f25702c = j3;
        this.f25703d = j4;
        this.f25704e = j5;
        this.f25705f = j6;
        this.f25706g = j7;
        this.f25707h = j8;
        this.f25708i = j9;
        this.f25709j = j10;
        this.f25710k = j11;
    }
}