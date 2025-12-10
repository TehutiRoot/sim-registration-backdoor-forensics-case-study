package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u008c\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010)R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010)R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010)R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010)R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010)R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010)R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u0010)R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u0010)R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b2\u0010)R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010)R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u0010)R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010)R\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b6\u0010)R\u001d\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u0010)R\u001d\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m28850d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "thumbColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "thumbColor", "trackColor$material3_release", "trackColor", "borderColor$material3_release", "borderColor", "iconColor$material3_release", "iconColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "o", "p", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SwitchColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26266a;

    /* renamed from: b */
    public final long f26267b;

    /* renamed from: c */
    public final long f26268c;

    /* renamed from: d */
    public final long f26269d;

    /* renamed from: e */
    public final long f26270e;

    /* renamed from: f */
    public final long f26271f;

    /* renamed from: g */
    public final long f26272g;

    /* renamed from: h */
    public final long f26273h;

    /* renamed from: i */
    public final long f26274i;

    /* renamed from: j */
    public final long f26275j;

    /* renamed from: k */
    public final long f26276k;

    /* renamed from: l */
    public final long f26277l;

    /* renamed from: m */
    public final long f26278m;

    /* renamed from: n */
    public final long f26279n;

    /* renamed from: o */
    public final long f26280o;

    /* renamed from: p */
    public final long f26281p;

    public /* synthetic */ SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Composable
    @NotNull
    public final State<Color> borderColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(462653665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(462653665, i, -1, "androidx.compose.material3.SwitchColors.borderColor (Switch.kt:406)");
        }
        if (z) {
            if (z2) {
                j = this.f26268c;
            } else {
                j = this.f26272g;
            }
        } else if (z2) {
            j = this.f26276k;
        } else {
            j = this.f26280o;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        if (Color.m71736equalsimpl0(this.f26266a, switchColors.f26266a) && Color.m71736equalsimpl0(this.f26267b, switchColors.f26267b) && Color.m71736equalsimpl0(this.f26268c, switchColors.f26268c) && Color.m71736equalsimpl0(this.f26269d, switchColors.f26269d) && Color.m71736equalsimpl0(this.f26270e, switchColors.f26270e) && Color.m71736equalsimpl0(this.f26271f, switchColors.f26271f) && Color.m71736equalsimpl0(this.f26272g, switchColors.f26272g) && Color.m71736equalsimpl0(this.f26273h, switchColors.f26273h) && Color.m71736equalsimpl0(this.f26274i, switchColors.f26274i) && Color.m71736equalsimpl0(this.f26275j, switchColors.f26275j) && Color.m71736equalsimpl0(this.f26276k, switchColors.f26276k) && Color.m71736equalsimpl0(this.f26277l, switchColors.f26277l) && Color.m71736equalsimpl0(this.f26278m, switchColors.f26278m) && Color.m71736equalsimpl0(this.f26279n, switchColors.f26279n) && Color.m71736equalsimpl0(this.f26280o, switchColors.f26280o) && Color.m71736equalsimpl0(this.f26281p, switchColors.f26281p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m71742hashCodeimpl(this.f26266a) * 31) + Color.m71742hashCodeimpl(this.f26267b)) * 31) + Color.m71742hashCodeimpl(this.f26268c)) * 31) + Color.m71742hashCodeimpl(this.f26269d)) * 31) + Color.m71742hashCodeimpl(this.f26270e)) * 31) + Color.m71742hashCodeimpl(this.f26271f)) * 31) + Color.m71742hashCodeimpl(this.f26272g)) * 31) + Color.m71742hashCodeimpl(this.f26273h)) * 31) + Color.m71742hashCodeimpl(this.f26274i)) * 31) + Color.m71742hashCodeimpl(this.f26275j)) * 31) + Color.m71742hashCodeimpl(this.f26276k)) * 31) + Color.m71742hashCodeimpl(this.f26277l)) * 31) + Color.m71742hashCodeimpl(this.f26278m)) * 31) + Color.m71742hashCodeimpl(this.f26279n)) * 31) + Color.m71742hashCodeimpl(this.f26280o)) * 31) + Color.m71742hashCodeimpl(this.f26281p);
    }

    @Composable
    @NotNull
    public final State<Color> iconColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-153383122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-153383122, i, -1, "androidx.compose.material3.SwitchColors.iconColor (Switch.kt:423)");
        }
        if (z) {
            if (z2) {
                j = this.f26269d;
            } else {
                j = this.f26273h;
            }
        } else if (z2) {
            j = this.f26277l;
        } else {
            j = this.f26281p;
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
    public final State<Color> thumbColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1539933265);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539933265, i, -1, "androidx.compose.material3.SwitchColors.thumbColor (Switch.kt:372)");
        }
        if (z) {
            if (z2) {
                j = this.f26266a;
            } else {
                j = this.f26270e;
            }
        } else if (z2) {
            j = this.f26274i;
        } else {
            j = this.f26278m;
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
        composer.startReplaceableGroup(961511844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(961511844, i, -1, "androidx.compose.material3.SwitchColors.trackColor (Switch.kt:389)");
        }
        if (z) {
            if (z2) {
                j = this.f26267b;
            } else {
                j = this.f26271f;
            }
        } else if (z2) {
            j = this.f26275j;
        } else {
            j = this.f26279n;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f26266a = j;
        this.f26267b = j2;
        this.f26268c = j3;
        this.f26269d = j4;
        this.f26270e = j5;
        this.f26271f = j6;
        this.f26272g = j7;
        this.f26273h = j8;
        this.f26274i = j9;
        this.f26275j = j10;
        this.f26276k = j11;
        this.f26277l = j12;
        this.f26278m = j13;
        this.f26279n = j14;
        this.f26280o = j15;
        this.f26281p = j16;
    }
}
