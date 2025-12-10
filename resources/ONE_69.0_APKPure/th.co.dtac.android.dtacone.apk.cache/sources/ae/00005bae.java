package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B|\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J \u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J \u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R#\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010'R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010'R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010'R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u0010'R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010'R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010'R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010'R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010'R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010'R\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m29142d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getClockDialColor-0d7_KjU$material3_release", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSelectorColor-0d7_KjU$material3_release", OperatorName.CURVE_TO, "getContainerColor-0d7_KjU$material3_release", "d", "getPeriodSelectorBorderColor-0d7_KjU$material3_release", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TimePickerColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26456a;

    /* renamed from: b */
    public final long f26457b;

    /* renamed from: c */
    public final long f26458c;

    /* renamed from: d */
    public final long f26459d;

    /* renamed from: e */
    public final long f26460e;

    /* renamed from: f */
    public final long f26461f;

    /* renamed from: g */
    public final long f26462g;

    /* renamed from: h */
    public final long f26463h;

    /* renamed from: i */
    public final long f26464i;

    /* renamed from: j */
    public final long f26465j;

    /* renamed from: k */
    public final long f26466k;

    /* renamed from: l */
    public final long f26467l;

    /* renamed from: m */
    public final long f26468m;

    /* renamed from: n */
    public final long f26469n;

    public /* synthetic */ TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: clockDialContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70885clockDialContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26460e;
        }
        return this.f26461f;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(TimePickerColors.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.material3.TimePickerColors");
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        if (Color.m71920equalsimpl0(this.f26456a, timePickerColors.f26456a) && Color.m71920equalsimpl0(this.f26457b, timePickerColors.f26457b) && Color.m71920equalsimpl0(this.f26458c, timePickerColors.f26458c) && Color.m71920equalsimpl0(this.f26459d, timePickerColors.f26459d) && Color.m71920equalsimpl0(this.f26462g, timePickerColors.f26462g) && Color.m71920equalsimpl0(this.f26463h, timePickerColors.f26463h) && Color.m71920equalsimpl0(this.f26464i, timePickerColors.f26464i) && Color.m71920equalsimpl0(this.f26465j, timePickerColors.f26465j) && Color.m71920equalsimpl0(this.f26466k, timePickerColors.f26466k) && Color.m71920equalsimpl0(this.f26467l, timePickerColors.f26467l) && Color.m71920equalsimpl0(this.f26468m, timePickerColors.f26468m) && Color.m71920equalsimpl0(this.f26469n, timePickerColors.f26469n)) {
            return true;
        }
        return false;
    }

    /* renamed from: getClockDialColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70886getClockDialColor0d7_KjU$material3_release() {
        return this.f26456a;
    }

    /* renamed from: getContainerColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70887getContainerColor0d7_KjU$material3_release() {
        return this.f26458c;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70888getPeriodSelectorBorderColor0d7_KjU$material3_release() {
        return this.f26459d;
    }

    /* renamed from: getSelectorColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70889getSelectorColor0d7_KjU$material3_release() {
        return this.f26457b;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m71926hashCodeimpl(this.f26456a) * 31) + Color.m71926hashCodeimpl(this.f26457b)) * 31) + Color.m71926hashCodeimpl(this.f26458c)) * 31) + Color.m71926hashCodeimpl(this.f26459d)) * 31) + Color.m71926hashCodeimpl(this.f26462g)) * 31) + Color.m71926hashCodeimpl(this.f26463h)) * 31) + Color.m71926hashCodeimpl(this.f26464i)) * 31) + Color.m71926hashCodeimpl(this.f26465j)) * 31) + Color.m71926hashCodeimpl(this.f26466k)) * 31) + Color.m71926hashCodeimpl(this.f26467l)) * 31) + Color.m71926hashCodeimpl(this.f26468m)) * 31) + Color.m71926hashCodeimpl(this.f26469n);
    }

    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70890periodSelectorContainerColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26462g;
        }
        return this.f26463h;
    }

    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70891periodSelectorContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26464i;
        }
        return this.f26465j;
    }

    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70892timeSelectorContainerColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26466k;
        }
        return this.f26467l;
    }

    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70893timeSelectorContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26468m;
        }
        return this.f26469n;
    }

    public TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f26456a = j;
        this.f26457b = j2;
        this.f26458c = j3;
        this.f26459d = j4;
        this.f26460e = j5;
        this.f26461f = j6;
        this.f26462g = j7;
        this.f26463h = j8;
        this.f26464i = j9;
        this.f26465j = j10;
        this.f26466k = j11;
        this.f26467l = j12;
        this.f26468m = j13;
        this.f26469n = j14;
    }
}