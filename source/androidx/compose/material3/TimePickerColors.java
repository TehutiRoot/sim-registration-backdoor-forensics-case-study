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
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B|\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J \u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J \u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R#\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010'R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010'R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010'R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u0010'R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010'R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010'R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010'R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010'R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010'R\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m28850d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "periodSelectorContainerColor-vNxB06k$material3_release", "(Z)J", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialContentColor-vNxB06k$material3_release", "clockDialContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getClockDialColor-0d7_KjU$material3_release", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSelectorColor-0d7_KjU$material3_release", OperatorName.CURVE_TO, "getContainerColor-0d7_KjU$material3_release", "d", "getPeriodSelectorBorderColor-0d7_KjU$material3_release", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TimePickerColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26368a;

    /* renamed from: b */
    public final long f26369b;

    /* renamed from: c */
    public final long f26370c;

    /* renamed from: d */
    public final long f26371d;

    /* renamed from: e */
    public final long f26372e;

    /* renamed from: f */
    public final long f26373f;

    /* renamed from: g */
    public final long f26374g;

    /* renamed from: h */
    public final long f26375h;

    /* renamed from: i */
    public final long f26376i;

    /* renamed from: j */
    public final long f26377j;

    /* renamed from: k */
    public final long f26378k;

    /* renamed from: l */
    public final long f26379l;

    /* renamed from: m */
    public final long f26380m;

    /* renamed from: n */
    public final long f26381n;

    public /* synthetic */ TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: clockDialContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70701clockDialContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26372e;
        }
        return this.f26373f;
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
        if (Color.m71736equalsimpl0(this.f26368a, timePickerColors.f26368a) && Color.m71736equalsimpl0(this.f26369b, timePickerColors.f26369b) && Color.m71736equalsimpl0(this.f26370c, timePickerColors.f26370c) && Color.m71736equalsimpl0(this.f26371d, timePickerColors.f26371d) && Color.m71736equalsimpl0(this.f26374g, timePickerColors.f26374g) && Color.m71736equalsimpl0(this.f26375h, timePickerColors.f26375h) && Color.m71736equalsimpl0(this.f26376i, timePickerColors.f26376i) && Color.m71736equalsimpl0(this.f26377j, timePickerColors.f26377j) && Color.m71736equalsimpl0(this.f26378k, timePickerColors.f26378k) && Color.m71736equalsimpl0(this.f26379l, timePickerColors.f26379l) && Color.m71736equalsimpl0(this.f26380m, timePickerColors.f26380m) && Color.m71736equalsimpl0(this.f26381n, timePickerColors.f26381n)) {
            return true;
        }
        return false;
    }

    /* renamed from: getClockDialColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70702getClockDialColor0d7_KjU$material3_release() {
        return this.f26368a;
    }

    /* renamed from: getContainerColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70703getContainerColor0d7_KjU$material3_release() {
        return this.f26370c;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70704getPeriodSelectorBorderColor0d7_KjU$material3_release() {
        return this.f26371d;
    }

    /* renamed from: getSelectorColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m70705getSelectorColor0d7_KjU$material3_release() {
        return this.f26369b;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m71742hashCodeimpl(this.f26368a) * 31) + Color.m71742hashCodeimpl(this.f26369b)) * 31) + Color.m71742hashCodeimpl(this.f26370c)) * 31) + Color.m71742hashCodeimpl(this.f26371d)) * 31) + Color.m71742hashCodeimpl(this.f26374g)) * 31) + Color.m71742hashCodeimpl(this.f26375h)) * 31) + Color.m71742hashCodeimpl(this.f26376i)) * 31) + Color.m71742hashCodeimpl(this.f26377j)) * 31) + Color.m71742hashCodeimpl(this.f26378k)) * 31) + Color.m71742hashCodeimpl(this.f26379l)) * 31) + Color.m71742hashCodeimpl(this.f26380m)) * 31) + Color.m71742hashCodeimpl(this.f26381n);
    }

    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70706periodSelectorContainerColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26374g;
        }
        return this.f26375h;
    }

    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70707periodSelectorContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26376i;
        }
        return this.f26377j;
    }

    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70708timeSelectorContainerColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26378k;
        }
        return this.f26379l;
    }

    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release  reason: not valid java name */
    public final long m70709timeSelectorContentColorvNxB06k$material3_release(boolean z) {
        if (z) {
            return this.f26380m;
        }
        return this.f26381n;
    }

    public TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f26368a = j;
        this.f26369b = j2;
        this.f26370c = j3;
        this.f26371d = j4;
        this.f26372e = j5;
        this.f26373f = j6;
        this.f26374g = j7;
        this.f26375h = j8;
        this.f26376i = j9;
        this.f26377j = j10;
        this.f26378k = j11;
        this.f26379l = j12;
        this.f26380m = j13;
        this.f26381n = j14;
    }
}
