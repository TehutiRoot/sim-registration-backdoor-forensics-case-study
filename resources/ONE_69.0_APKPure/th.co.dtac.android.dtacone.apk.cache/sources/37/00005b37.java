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
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u008c\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010)R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010)R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010)R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010)R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010)R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010)R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u0010)R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u0010)R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b2\u0010)R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010)R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u0010)R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u0010)R\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b6\u0010)R\u001d\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u0010)R\u001d\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m29142d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "thumbColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "thumbColor", "trackColor$material3_release", "trackColor", "borderColor$material3_release", "borderColor", "iconColor$material3_release", "iconColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "o", "p", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SwitchColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26354a;

    /* renamed from: b */
    public final long f26355b;

    /* renamed from: c */
    public final long f26356c;

    /* renamed from: d */
    public final long f26357d;

    /* renamed from: e */
    public final long f26358e;

    /* renamed from: f */
    public final long f26359f;

    /* renamed from: g */
    public final long f26360g;

    /* renamed from: h */
    public final long f26361h;

    /* renamed from: i */
    public final long f26362i;

    /* renamed from: j */
    public final long f26363j;

    /* renamed from: k */
    public final long f26364k;

    /* renamed from: l */
    public final long f26365l;

    /* renamed from: m */
    public final long f26366m;

    /* renamed from: n */
    public final long f26367n;

    /* renamed from: o */
    public final long f26368o;

    /* renamed from: p */
    public final long f26369p;

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
                j = this.f26356c;
            } else {
                j = this.f26360g;
            }
        } else if (z2) {
            j = this.f26364k;
        } else {
            j = this.f26368o;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
        if (Color.m71920equalsimpl0(this.f26354a, switchColors.f26354a) && Color.m71920equalsimpl0(this.f26355b, switchColors.f26355b) && Color.m71920equalsimpl0(this.f26356c, switchColors.f26356c) && Color.m71920equalsimpl0(this.f26357d, switchColors.f26357d) && Color.m71920equalsimpl0(this.f26358e, switchColors.f26358e) && Color.m71920equalsimpl0(this.f26359f, switchColors.f26359f) && Color.m71920equalsimpl0(this.f26360g, switchColors.f26360g) && Color.m71920equalsimpl0(this.f26361h, switchColors.f26361h) && Color.m71920equalsimpl0(this.f26362i, switchColors.f26362i) && Color.m71920equalsimpl0(this.f26363j, switchColors.f26363j) && Color.m71920equalsimpl0(this.f26364k, switchColors.f26364k) && Color.m71920equalsimpl0(this.f26365l, switchColors.f26365l) && Color.m71920equalsimpl0(this.f26366m, switchColors.f26366m) && Color.m71920equalsimpl0(this.f26367n, switchColors.f26367n) && Color.m71920equalsimpl0(this.f26368o, switchColors.f26368o) && Color.m71920equalsimpl0(this.f26369p, switchColors.f26369p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m71926hashCodeimpl(this.f26354a) * 31) + Color.m71926hashCodeimpl(this.f26355b)) * 31) + Color.m71926hashCodeimpl(this.f26356c)) * 31) + Color.m71926hashCodeimpl(this.f26357d)) * 31) + Color.m71926hashCodeimpl(this.f26358e)) * 31) + Color.m71926hashCodeimpl(this.f26359f)) * 31) + Color.m71926hashCodeimpl(this.f26360g)) * 31) + Color.m71926hashCodeimpl(this.f26361h)) * 31) + Color.m71926hashCodeimpl(this.f26362i)) * 31) + Color.m71926hashCodeimpl(this.f26363j)) * 31) + Color.m71926hashCodeimpl(this.f26364k)) * 31) + Color.m71926hashCodeimpl(this.f26365l)) * 31) + Color.m71926hashCodeimpl(this.f26366m)) * 31) + Color.m71926hashCodeimpl(this.f26367n)) * 31) + Color.m71926hashCodeimpl(this.f26368o)) * 31) + Color.m71926hashCodeimpl(this.f26369p);
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
                j = this.f26357d;
            } else {
                j = this.f26361h;
            }
        } else if (z2) {
            j = this.f26365l;
        } else {
            j = this.f26369p;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
                j = this.f26354a;
            } else {
                j = this.f26358e;
            }
        } else if (z2) {
            j = this.f26362i;
        } else {
            j = this.f26366m;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
                j = this.f26355b;
            } else {
                j = this.f26359f;
            }
        } else if (z2) {
            j = this.f26363j;
        } else {
            j = this.f26367n;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f26354a = j;
        this.f26355b = j2;
        this.f26356c = j3;
        this.f26357d = j4;
        this.f26358e = j5;
        this.f26359f = j6;
        this.f26360g = j7;
        this.f26361h = j8;
        this.f26362i = j9;
        this.f26363j = j10;
        this.f26364k = j11;
        this.f26365l = j12;
        this.f26366m = j13;
        this.f26367n = j14;
        this.f26368o = j15;
        this.f26369p = j16;
    }
}