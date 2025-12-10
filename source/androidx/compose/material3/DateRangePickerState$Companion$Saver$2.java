package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/material3/DateRangePickerState;", "value", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState$Companion$Saver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n1#2:810\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangePickerState$Companion$Saver$2 extends Lambda implements Function1<Object, DateRangePickerState> {
    public static final DateRangePickerState$Companion$Saver$2 INSTANCE = new DateRangePickerState$Companion$Saver$2();

    public DateRangePickerState$Companion$Saver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final DateRangePickerState invoke(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StateData restore = StateData.Companion.Saver().restore(value);
        Intrinsics.checkNotNull(restore);
        return new DateRangePickerState(restore, null);
    }
}
