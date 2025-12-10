package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m28850d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/compose/material3/CalendarDate;", "calendarDate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "locale", "validate-XivgLIo", "(Landroidx/compose/material3/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "validate", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/StateData;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material3/DateInputFormat;", OperatorName.CURVE_TO, "Landroidx/compose/material3/DatePickerFormatter;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Ljava/lang/String;", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DateInputValidator {

    /* renamed from: a */
    public final StateData f25685a;

    /* renamed from: b */
    public final DateInputFormat f25686b;

    /* renamed from: c */
    public final DatePickerFormatter f25687c;

    /* renamed from: d */
    public final Function1 f25688d;

    /* renamed from: e */
    public final String f25689e;

    /* renamed from: f */
    public final String f25690f;

    /* renamed from: g */
    public final String f25691g;

    /* renamed from: h */
    public final String f25692h;

    public DateInputValidator(@NotNull StateData stateData, @NotNull DateInputFormat dateInputFormat, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @NotNull String errorDatePattern, @NotNull String errorDateOutOfYearRange, @NotNull String errorInvalidNotAllowed, @NotNull String errorInvalidRangeInput) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(errorDatePattern, "errorDatePattern");
        Intrinsics.checkNotNullParameter(errorDateOutOfYearRange, "errorDateOutOfYearRange");
        Intrinsics.checkNotNullParameter(errorInvalidNotAllowed, "errorInvalidNotAllowed");
        Intrinsics.checkNotNullParameter(errorInvalidRangeInput, "errorInvalidRangeInput");
        this.f25685a = stateData;
        this.f25686b = dateInputFormat;
        this.f25687c = dateFormatter;
        this.f25688d = dateValidator;
        this.f25689e = errorDatePattern;
        this.f25690f = errorDateOutOfYearRange;
        this.f25691g = errorInvalidNotAllowed;
        this.f25692h = errorInvalidRangeInput;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r0 < r2) goto L24;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: validate-XivgLIo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m70335validateXivgLIo(@org.jetbrains.annotations.Nullable androidx.compose.material3.CalendarDate r12, int r13, @org.jetbrains.annotations.NotNull java.util.Locale r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = 1
            java.lang.String r3 = "format(this, *args)"
            if (r12 != 0) goto L2f
            java.lang.String r12 = r11.f25689e
            androidx.compose.material3.DateInputFormat r13 = r11.f25686b
            java.lang.String r13 = r13.getPatternWithDelimiters()
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toUpperCase(r14)
            java.lang.String r14 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r1] = r13
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r14, r2)
            java.lang.String r12 = java.lang.String.format(r12, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
        L2f:
            androidx.compose.material3.StateData r4 = r11.f25685a
            kotlin.ranges.IntRange r4 = r4.getYearRange()
            int r5 = r12.getYear()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L6f
            java.lang.String r12 = r11.f25690f
            androidx.compose.material3.StateData r13 = r11.f25685a
            kotlin.ranges.IntRange r13 = r13.getYearRange()
            int r13 = r13.getFirst()
            java.lang.String r13 = androidx.compose.material3.DatePickerKt.toLocalString(r13)
            androidx.compose.material3.StateData r14 = r11.f25685a
            kotlin.ranges.IntRange r14 = r14.getYearRange()
            int r14 = r14.getLast()
            java.lang.String r14 = androidx.compose.material3.DatePickerKt.toLocalString(r14)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r13
            r4[r2] = r14
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String r12 = java.lang.String.format(r12, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
        L6f:
            kotlin.jvm.functions.Function1 r0 = r11.f25688d
            long r4 = r12.getUtcTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La9
            java.lang.String r13 = r11.f25691g
            androidx.compose.material3.DatePickerFormatter r4 = r11.f25687c
            androidx.compose.material3.StateData r0 = r11.f25685a
            androidx.compose.material3.CalendarModel r6 = r0.getCalendarModel()
            r9 = 8
            r10 = 0
            r8 = 0
            r5 = r12
            r7 = r14
            java.lang.String r12 = androidx.compose.material3.DatePickerFormatter.formatDate$material3_release$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r1] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r14, r2)
            java.lang.String r12 = java.lang.String.format(r13, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
        La9:
            androidx.compose.material3.InputIdentifier$Companion r14 = androidx.compose.material3.InputIdentifier.Companion
            int r0 = r14.m70443getStartDateInputJ2x2o4M()
            boolean r0 = androidx.compose.material3.InputIdentifier.m70437equalsimpl0(r13, r0)
            if (r0 == 0) goto Ld5
            long r0 = r12.getUtcTimeMillis()
            androidx.compose.material3.StateData r2 = r11.f25685a
            androidx.compose.runtime.MutableState r2 = r2.getSelectedEndDate()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.material3.CalendarDate r2 = (androidx.compose.material3.CalendarDate) r2
            if (r2 == 0) goto Lcc
            long r2 = r2.getUtcTimeMillis()
            goto Ld1
        Lcc:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Ld1:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lfc
        Ld5:
            int r14 = r14.m70441getEndDateInputJ2x2o4M()
            boolean r13 = androidx.compose.material3.InputIdentifier.m70437equalsimpl0(r13, r14)
            if (r13 == 0) goto Lff
            long r12 = r12.getUtcTimeMillis()
            androidx.compose.material3.StateData r14 = r11.f25685a
            androidx.compose.runtime.MutableState r14 = r14.getSelectedStartDate()
            java.lang.Object r14 = r14.getValue()
            androidx.compose.material3.CalendarDate r14 = (androidx.compose.material3.CalendarDate) r14
            if (r14 == 0) goto Lf6
            long r0 = r14.getUtcTimeMillis()
            goto Lf8
        Lf6:
            r0 = -9223372036854775808
        Lf8:
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 > 0) goto Lff
        Lfc:
            java.lang.String r12 = r11.f25692h
            return r12
        Lff:
            java.lang.String r12 = ""
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m70335validateXivgLIo(androidx.compose.material3.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}
