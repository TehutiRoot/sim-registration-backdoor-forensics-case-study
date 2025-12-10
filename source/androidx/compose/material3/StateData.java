package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001?B8\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R+\u00103\u001a\u00020,2\u0006\u0010-\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u0011\u00108\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b7\u00100R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b=\u0010;\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m28850d2 = {"Landroidx/compose/material3/StateData;", "", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "startDateMillis", "endDateMillis", "", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "displayMode", "switchDisplayMode-vCnGnXg", "(I)V", "switchDisplayMode", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "Landroidx/compose/material3/CalendarModel;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material3/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/CalendarModel;", "calendarModel", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarDate;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getSelectedStartDate", "()Landroidx/compose/runtime/MutableState;", "setSelectedStartDate", "(Landroidx/compose/runtime/MutableState;)V", "selectedStartDate", "d", "getSelectedEndDate", "setSelectedEndDate", "selectedEndDate", "Landroidx/compose/material3/CalendarMonth;", "<set-?>", "e", "getDisplayedMonth", "()Landroidx/compose/material3/CalendarMonth;", "setDisplayedMonth", "(Landroidx/compose/material3/CalendarMonth;)V", "displayedMonth", OperatorName.FILL_NON_ZERO, "getDisplayMode", "setDisplayMode", "getCurrentMonth", "currentMonth", "", "getDisplayedMonthIndex", "()I", "displayedMonthIndex", "getTotalMonthsInRange", "totalMonthsInRange", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1920:1\n76#2:1921\n102#2,2:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n*L\n871#1:1921\n871#1:1922,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StateData {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final IntRange f26130a;

    /* renamed from: b */
    public final CalendarModel f26131b;

    /* renamed from: c */
    public MutableState f26132c;

    /* renamed from: d */
    public MutableState f26133d;

    /* renamed from: e */
    public final MutableState f26134e;

    /* renamed from: f */
    public MutableState f26135f;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/material3/StateData$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/StateData;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<StateData, Object> Saver() {
            return ListSaverKt.listSaver(StateData$Companion$Saver$1.INSTANCE, StateData$Companion$Saver$2.INSTANCE);
        }

        public Companion() {
        }
    }

    public /* synthetic */ StateData(Long l, Long l2, Long l3, IntRange intRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, intRange, i);
    }

    @NotNull
    public final CalendarModel getCalendarModel() {
        return this.f26131b;
    }

    @NotNull
    public final CalendarMonth getCurrentMonth() {
        CalendarModel calendarModel = this.f26131b;
        return calendarModel.getMonth(calendarModel.getToday());
    }

    @NotNull
    public final MutableState<DisplayMode> getDisplayMode() {
        return this.f26135f;
    }

    @NotNull
    public final CalendarMonth getDisplayedMonth() {
        return (CalendarMonth) this.f26134e.getValue();
    }

    public final int getDisplayedMonthIndex() {
        return getDisplayedMonth().indexIn(this.f26130a);
    }

    @NotNull
    public final MutableState<CalendarDate> getSelectedEndDate() {
        return this.f26133d;
    }

    @NotNull
    public final MutableState<CalendarDate> getSelectedStartDate() {
        return this.f26132c;
    }

    public final int getTotalMonthsInRange() {
        return ((this.f26130a.getLast() - this.f26130a.getFirst()) + 1) * 12;
    }

    @NotNull
    public final IntRange getYearRange() {
        return this.f26130a;
    }

    public final void setDisplayMode(@NotNull MutableState<DisplayMode> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.f26135f = mutableState;
    }

    public final void setDisplayedMonth(@NotNull CalendarMonth calendarMonth) {
        Intrinsics.checkNotNullParameter(calendarMonth, "<set-?>");
        this.f26134e.setValue(calendarMonth);
    }

    public final void setSelectedEndDate(@NotNull MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.f26133d = mutableState;
    }

    public final void setSelectedStartDate(@NotNull MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.f26132c = mutableState;
    }

    public final void setSelection(@Nullable Long l, @Nullable Long l2) {
        CalendarDate calendarDate;
        CalendarDate calendarDate2 = null;
        if (l != null) {
            calendarDate = this.f26131b.getCanonicalDate(l.longValue());
        } else {
            calendarDate = null;
        }
        if (l2 != null) {
            calendarDate2 = this.f26131b.getCanonicalDate(l2.longValue());
        }
        if (calendarDate != null && !this.f26130a.contains(calendarDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + calendarDate.getYear() + ") is out of the years range of " + this.f26130a + '.').toString());
        } else if (calendarDate2 != null && !this.f26130a.contains(calendarDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + calendarDate2.getYear() + ") is out of the years range of " + this.f26130a + '.').toString());
        } else {
            if (calendarDate2 != null) {
                if (calendarDate != null) {
                    if (calendarDate.getUtcTimeMillis() > calendarDate2.getUtcTimeMillis()) {
                        throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("An end date was provided without a start date.".toString());
                }
            }
            this.f26132c.setValue(calendarDate);
            this.f26133d.setValue(calendarDate2);
        }
    }

    /* renamed from: switchDisplayMode-vCnGnXg  reason: not valid java name */
    public final void m70549switchDisplayModevCnGnXg(int i) {
        CalendarDate calendarDate = (CalendarDate) this.f26132c.getValue();
        if (calendarDate != null) {
            setDisplayedMonth(this.f26131b.getMonth(calendarDate));
        }
        if (this.f26132c.getValue() == null && this.f26133d.getValue() != null) {
            this.f26133d.setValue(null);
        }
        this.f26135f.setValue(DisplayMode.m70360boximpl(i));
    }

    public StateData(Long l, Long l2, Long l3, IntRange yearRange, int i) {
        MutableState m31891g;
        MutableState m31891g2;
        CalendarMonth currentMonth;
        MutableState m31891g3;
        MutableState m31891g4;
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
        this.f26130a = yearRange;
        CalendarModel CalendarModel = CalendarModel_androidKt.CalendarModel();
        this.f26131b = CalendarModel;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26132c = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26133d = m31891g2;
        setSelection(l, l2);
        if (l3 != null) {
            currentMonth = CalendarModel.getMonth(l3.longValue());
            if (!yearRange.contains(currentMonth.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + currentMonth.getYear() + ") is out of the years range of " + yearRange + '.').toString());
            }
        } else {
            currentMonth = getCurrentMonth();
        }
        m31891g3 = AbstractC19508dK1.m31891g(currentMonth, null, 2, null);
        this.f26134e = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(DisplayMode.m70360boximpl(i), null, 2, null);
        this.f26135f = m31891g4;
    }
}
