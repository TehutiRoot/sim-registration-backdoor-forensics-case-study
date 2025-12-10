package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\\\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010!R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010!R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010!R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010!R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010!R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010!R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010!R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010!R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m28850d2 = {"Landroidx/compose/material3/SliderColors;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "thumbColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "trackColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "tickColor$material3_release", "tickColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SliderColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26060a;

    /* renamed from: b */
    public final long f26061b;

    /* renamed from: c */
    public final long f26062c;

    /* renamed from: d */
    public final long f26063d;

    /* renamed from: e */
    public final long f26064e;

    /* renamed from: f */
    public final long f26065f;

    /* renamed from: g */
    public final long f26066g;

    /* renamed from: h */
    public final long f26067h;

    /* renamed from: i */
    public final long f26068i;

    /* renamed from: j */
    public final long f26069j;

    public /* synthetic */ SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        if (Color.m71736equalsimpl0(this.f26060a, sliderColors.f26060a) && Color.m71736equalsimpl0(this.f26061b, sliderColors.f26061b) && Color.m71736equalsimpl0(this.f26062c, sliderColors.f26062c) && Color.m71736equalsimpl0(this.f26063d, sliderColors.f26063d) && Color.m71736equalsimpl0(this.f26064e, sliderColors.f26064e) && Color.m71736equalsimpl0(this.f26065f, sliderColors.f26065f) && Color.m71736equalsimpl0(this.f26066g, sliderColors.f26066g) && Color.m71736equalsimpl0(this.f26067h, sliderColors.f26067h) && Color.m71736equalsimpl0(this.f26068i, sliderColors.f26068i) && Color.m71736equalsimpl0(this.f26069j, sliderColors.f26069j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m71742hashCodeimpl(this.f26060a) * 31) + Color.m71742hashCodeimpl(this.f26061b)) * 31) + Color.m71742hashCodeimpl(this.f26062c)) * 31) + Color.m71742hashCodeimpl(this.f26063d)) * 31) + Color.m71742hashCodeimpl(this.f26064e)) * 31) + Color.m71742hashCodeimpl(this.f26065f)) * 31) + Color.m71742hashCodeimpl(this.f26066g)) * 31) + Color.m71742hashCodeimpl(this.f26067h)) * 31) + Color.m71742hashCodeimpl(this.f26068i)) * 31) + Color.m71742hashCodeimpl(this.f26069j);
    }

    @Composable
    @NotNull
    public final State<Color> thumbColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1917959445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1917959445, i, -1, "androidx.compose.material3.SliderColors.thumbColor (Slider.kt:1352)");
        }
        if (z) {
            j = this.f26060a;
        } else {
            j = this.f26065f;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> tickColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(337026738);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(337026738, i, -1, "androidx.compose.material3.SliderColors.tickColor (Slider.kt:1368)");
        }
        if (z) {
            if (z2) {
                j = this.f26062c;
            } else {
                j = this.f26064e;
            }
        } else if (z2) {
            j = this.f26067h;
        } else {
            j = this.f26069j;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trackColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(760609284);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(760609284, i, -1, "androidx.compose.material3.SliderColors.trackColor (Slider.kt:1357)");
        }
        if (z) {
            if (z2) {
                j = this.f26061b;
            } else {
                j = this.f26063d;
            }
        } else if (z2) {
            j = this.f26066g;
        } else {
            j = this.f26068i;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f26060a = j;
        this.f26061b = j2;
        this.f26062c = j3;
        this.f26063d = j4;
        this.f26064e = j5;
        this.f26065f = j6;
        this.f26066g = j7;
        this.f26067h = j8;
        this.f26068i = j9;
        this.f26069j = j10;
    }
}
