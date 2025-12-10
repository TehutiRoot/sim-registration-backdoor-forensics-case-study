package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B.\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/IntOffset;", "gridCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(Lkotlin/Pair;ZZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Pair;", "getGridCoordinates", "()Lkotlin/Pair;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getFirstIsSelectionStart", "()Z", OperatorName.CURVE_TO, "getLastIsSelectionEnd", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SelectedRangeInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Pair f26035a;

    /* renamed from: b */
    public final boolean f26036b;

    /* renamed from: c */
    public final boolean f26037c;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, m28850d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "()V", "calculateRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "month", "Landroidx/compose/material3/CalendarMonth;", "startDate", "Landroidx/compose/material3/CalendarDate;", "endDate", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SelectedRangeInfo calculateRangeInfo(@NotNull CalendarMonth month, @Nullable CalendarDate calendarDate, @Nullable CalendarDate calendarDate2) {
            boolean z;
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            Intrinsics.checkNotNullParameter(month, "month");
            if (calendarDate == null || calendarDate2 == null || calendarDate.getUtcTimeMillis() > month.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < month.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z2 = false;
            if (calendarDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (calendarDate2.getUtcTimeMillis() <= month.getEndUtcTimeMillis()) {
                z2 = true;
            }
            if (z) {
                daysFromStartOfWeekToFirstOfMonth = (month.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth = month.getDaysFromStartOfWeekToFirstOfMonth();
            }
            if (z2) {
                daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + month.getNumberOfDays()) - 1;
            }
            return new SelectedRangeInfo(new Pair(IntOffset.m73767boximpl(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth % 7, daysFromStartOfWeekToFirstOfMonth / 7)), IntOffset.m73767boximpl(IntOffsetKt.IntOffset(daysFromStartOfWeekToFirstOfMonth2 % 7, daysFromStartOfWeekToFirstOfMonth2 / 7))), z, z2);
        }

        public Companion() {
        }
    }

    public SelectedRangeInfo(@NotNull Pair<IntOffset, IntOffset> gridCoordinates, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(gridCoordinates, "gridCoordinates");
        this.f26035a = gridCoordinates;
        this.f26036b = z;
        this.f26037c = z2;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.f26036b;
    }

    @NotNull
    public final Pair<IntOffset, IntOffset> getGridCoordinates() {
        return this.f26035a;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.f26037c;
    }
}
