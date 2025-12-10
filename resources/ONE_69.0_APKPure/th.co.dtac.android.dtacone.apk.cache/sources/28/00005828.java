package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B¤\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R#\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R#\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R#\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b<\u00101R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u00101R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b>\u00101R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u00101R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b@\u00101R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bA\u00101R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bB\u00101R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bC\u00101R\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bD\u00101R\u001d\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bE\u00101R\u001d\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bF\u00101R#\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u00103R#\u0010\u0014\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u00103R\u001d\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bK\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, m29142d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "yearContentColor", "currentYearContentColor", "selectedYearContentColor", "selectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "<init>", "(JJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContainerColor", "currentYear", "yearContentColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getContainerColor-0d7_KjU$material3_release", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTitleContentColor-0d7_KjU$material3_release", OperatorName.CURVE_TO, "getHeadlineContentColor-0d7_KjU$material3_release", "d", "getWeekdayContentColor-0d7_KjU$material3_release", "e", "getSubheadContentColor-0d7_KjU$material3_release", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "o", "p", OperatorName.SAVE, "getTodayDateBorderColor-0d7_KjU$material3_release", PDPageLabelRange.STYLE_ROMAN_LOWER, "getDayInSelectionRangeContainerColor-0d7_KjU$material3_release", OperatorName.CLOSE_AND_STROKE, "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DatePickerColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25781a;

    /* renamed from: b */
    public final long f25782b;

    /* renamed from: c */
    public final long f25783c;

    /* renamed from: d */
    public final long f25784d;

    /* renamed from: e */
    public final long f25785e;

    /* renamed from: f */
    public final long f25786f;

    /* renamed from: g */
    public final long f25787g;

    /* renamed from: h */
    public final long f25788h;

    /* renamed from: i */
    public final long f25789i;

    /* renamed from: j */
    public final long f25790j;

    /* renamed from: k */
    public final long f25791k;

    /* renamed from: l */
    public final long f25792l;

    /* renamed from: m */
    public final long f25793m;

    /* renamed from: n */
    public final long f25794n;

    /* renamed from: o */
    public final long f25795o;

    /* renamed from: p */
    public final long f25796p;

    /* renamed from: q */
    public final long f25797q;

    /* renamed from: r */
    public final long f25798r;

    /* renamed from: s */
    public final long f25799s;

    public /* synthetic */ DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    @Composable
    @NotNull
    public final State<Color> dayContainerColor$material3_release(boolean z, boolean z2, boolean z3, @Nullable Composer composer, int i) {
        long m71954getTransparent0d7_KjU;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1240482658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:611)");
        }
        if (z) {
            if (z2) {
                m71954getTransparent0d7_KjU = this.f25794n;
            } else {
                m71954getTransparent0d7_KjU = this.f25795o;
            }
        } else {
            m71954getTransparent0d7_KjU = Color.Companion.m71954getTransparent0d7_KjU();
        }
        long j = m71954getTransparent0d7_KjU;
        if (z3) {
            composer.startReplaceableGroup(1577406023);
            rememberUpdatedState = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1577406187);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j), composer, 0);
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
    public final State<Color> dayContentColor$material3_release(boolean z, boolean z2, boolean z3, boolean z4, @Nullable Composer composer, int i) {
        long j;
        State<Color> m69428animateColorAsStateeuL9pac;
        composer.startReplaceableGroup(-1233694918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:576)");
        }
        if (z2 && z4) {
            j = this.f25792l;
        } else if (z2 && !z4) {
            j = this.f25793m;
        } else if (z3 && z4) {
            j = this.f25799s;
        } else if (z3 && !z4) {
            j = this.f25791k;
        } else if (z) {
            j = this.f25796p;
        } else if (z4) {
            j = this.f25790j;
        } else {
            j = this.f25791k;
        }
        long j2 = j;
        if (z3) {
            composer.startReplaceableGroup(379006271);
            m69428animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m71909boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(379006329);
            m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        if (!Color.m71920equalsimpl0(this.f25781a, datePickerColors.f25781a) || !Color.m71920equalsimpl0(this.f25782b, datePickerColors.f25782b) || !Color.m71920equalsimpl0(this.f25783c, datePickerColors.f25783c) || !Color.m71920equalsimpl0(this.f25784d, datePickerColors.f25784d) || !Color.m71920equalsimpl0(this.f25785e, datePickerColors.f25785e) || !Color.m71920equalsimpl0(this.f25786f, datePickerColors.f25786f) || !Color.m71920equalsimpl0(this.f25787g, datePickerColors.f25787g) || !Color.m71920equalsimpl0(this.f25788h, datePickerColors.f25788h) || !Color.m71920equalsimpl0(this.f25789i, datePickerColors.f25789i) || !Color.m71920equalsimpl0(this.f25790j, datePickerColors.f25790j) || !Color.m71920equalsimpl0(this.f25791k, datePickerColors.f25791k) || !Color.m71920equalsimpl0(this.f25792l, datePickerColors.f25792l) || !Color.m71920equalsimpl0(this.f25793m, datePickerColors.f25793m) || !Color.m71920equalsimpl0(this.f25794n, datePickerColors.f25794n) || !Color.m71920equalsimpl0(this.f25795o, datePickerColors.f25795o) || !Color.m71920equalsimpl0(this.f25796p, datePickerColors.f25796p) || !Color.m71920equalsimpl0(this.f25797q, datePickerColors.f25797q) || !Color.m71920equalsimpl0(this.f25798r, datePickerColors.f25798r) || !Color.m71920equalsimpl0(this.f25799s, datePickerColors.f25799s)) {
            return false;
        }
        return true;
    }

    /* renamed from: getContainerColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70520getContainerColor0d7_KjU$material3_release() {
        return this.f25781a;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70521getDayInSelectionRangeContainerColor0d7_KjU$material3_release() {
        return this.f25798r;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70522getHeadlineContentColor0d7_KjU$material3_release() {
        return this.f25783c;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70523getSubheadContentColor0d7_KjU$material3_release() {
        return this.f25785e;
    }

    /* renamed from: getTitleContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70524getTitleContentColor0d7_KjU$material3_release() {
        return this.f25782b;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70525getTodayDateBorderColor0d7_KjU$material3_release() {
        return this.f25797q;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70526getWeekdayContentColor0d7_KjU$material3_release() {
        return this.f25784d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Color.m71926hashCodeimpl(this.f25781a) * 31) + Color.m71926hashCodeimpl(this.f25782b)) * 31) + Color.m71926hashCodeimpl(this.f25783c)) * 31) + Color.m71926hashCodeimpl(this.f25784d)) * 31) + Color.m71926hashCodeimpl(this.f25785e)) * 31) + Color.m71926hashCodeimpl(this.f25786f)) * 31) + Color.m71926hashCodeimpl(this.f25787g)) * 31) + Color.m71926hashCodeimpl(this.f25788h)) * 31) + Color.m71926hashCodeimpl(this.f25789i)) * 31) + Color.m71926hashCodeimpl(this.f25790j)) * 31) + Color.m71926hashCodeimpl(this.f25791k)) * 31) + Color.m71926hashCodeimpl(this.f25792l)) * 31) + Color.m71926hashCodeimpl(this.f25793m)) * 31) + Color.m71926hashCodeimpl(this.f25794n)) * 31) + Color.m71926hashCodeimpl(this.f25795o)) * 31) + Color.m71926hashCodeimpl(this.f25796p)) * 31) + Color.m71926hashCodeimpl(this.f25797q)) * 31) + Color.m71926hashCodeimpl(this.f25798r)) * 31) + Color.m71926hashCodeimpl(this.f25799s);
    }

    @Composable
    @NotNull
    public final State<Color> yearContainerColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long m71954getTransparent0d7_KjU;
        composer.startReplaceableGroup(488208633);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(488208633, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:659)");
        }
        if (z) {
            m71954getTransparent0d7_KjU = this.f25789i;
        } else {
            m71954getTransparent0d7_KjU = Color.Companion.m71954getTransparent0d7_KjU();
        }
        State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(m71954getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> yearContentColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1749254827);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749254827, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:638)");
        }
        if (z2) {
            j = this.f25788h;
        } else if (z) {
            j = this.f25787g;
        } else {
            j = this.f25786f;
        }
        State<Color> m69428animateColorAsStateeuL9pac = SingleValueAnimationKt.m69428animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69428animateColorAsStateeuL9pac;
    }

    public DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f25781a = j;
        this.f25782b = j2;
        this.f25783c = j3;
        this.f25784d = j4;
        this.f25785e = j5;
        this.f25786f = j6;
        this.f25787g = j7;
        this.f25788h = j8;
        this.f25789i = j9;
        this.f25790j = j10;
        this.f25791k = j11;
        this.f25792l = j12;
        this.f25793m = j13;
        this.f25794n = j14;
        this.f25795o = j15;
        this.f25796p = j16;
        this.f25797q = j17;
        this.f25798r = j18;
        this.f25799s = j19;
    }
}