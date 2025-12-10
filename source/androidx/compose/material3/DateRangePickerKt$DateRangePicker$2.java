package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DateRangePickerKt$DateRangePicker$2 extends Lambda implements Function1<Long, Boolean> {
    public static final DateRangePickerKt$DateRangePicker$2 INSTANCE = new DateRangePickerKt$DateRangePicker$2();

    public DateRangePickerKt$DateRangePicker$2() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(long j) {
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
        return invoke(l.longValue());
    }
}
