package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B:\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R4\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m28850d2 = {"Landroidx/compose/material3/DateRangePickerState;", "", "Landroidx/compose/material3/StateData;", "stateData", "<init>", "(Landroidx/compose/material3/StateData;)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "startDateMillis", "endDateMillis", "", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/StateData;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,809:1\n76#2:810\n102#2,2:811\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n*L\n274#1:810\n274#1:811,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangePickerState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final StateData f25736a;

    /* renamed from: b */
    public final MutableState f25737b;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/material3/DateRangePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerState;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DateRangePickerState, ?> Saver() {
            return SaverKt.Saver(DateRangePickerState$Companion$Saver$1.INSTANCE, DateRangePickerState$Companion$Saver$2.INSTANCE);
        }

        public Companion() {
        }
    }

    public /* synthetic */ DateRangePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* renamed from: getDisplayMode-jFl-4v0  reason: not valid java name */
    public final int m70358getDisplayModejFl4v0() {
        return ((DisplayMode) this.f25737b.getValue()).m70366unboximpl();
    }

    @Nullable
    public final Long getSelectedEndDateMillis() {
        CalendarDate value = this.f25736a.getSelectedEndDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Nullable
    public final Long getSelectedStartDateMillis() {
        CalendarDate value = this.f25736a.getSelectedStartDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @NotNull
    public final StateData getStateData$material3_release() {
        return this.f25736a;
    }

    /* renamed from: setDisplayMode-vCnGnXg  reason: not valid java name */
    public final void m70359setDisplayModevCnGnXg(int i) {
        this.f25737b.setValue(DisplayMode.m70360boximpl(i));
    }

    public final void setSelection(@Nullable Long l, @Nullable Long l2) {
        this.f25736a.setSelection(l, l2);
    }

    public /* synthetic */ DateRangePickerState(Long l, Long l2, Long l3, IntRange intRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, intRange, i);
    }

    public DateRangePickerState(StateData stateData) {
        this.f25736a = stateData;
        this.f25737b = stateData.getDisplayMode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateRangePickerState(Long l, Long l2, Long l3, IntRange yearRange, int i) {
        this(new StateData(l, l2, l3, yearRange, i, null));
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
    }
}
