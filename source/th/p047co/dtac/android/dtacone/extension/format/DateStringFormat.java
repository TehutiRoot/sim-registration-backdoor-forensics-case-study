package th.p047co.dtac.android.dtacone.extension.format;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/extension/format/DateStringFormat;", "", "()V", "getCurrentDate", "", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.DateStringFormat */
/* loaded from: classes7.dex */
public final class DateStringFormat {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String FORMAT_BIRTH_DAY_DISPLAY_DATE = "dd MMMM yyyy";
    @NotNull
    public static final String FORMAT_DATE_TIME = "dd MMM yyyy HH:mm น.";
    @NotNull
    public static final String FORMAT_IDCARD_DISPLAY_DATE_EN = "dd MMM. yyyy";
    @NotNull
    public static final String FORMAT_IDCARD_DISPLAY_DATE_TH = "dd MMM yyyy";
    @NotNull
    public static final String FORMAT_SERVER_DATE = "yyyy-MM-dd";
    @NotNull
    public static final String FORMAT_SERVER_DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/extension/format/DateStringFormat$Companion;", "", "()V", "FORMAT_BIRTH_DAY_DISPLAY_DATE", "", "FORMAT_DATE_TIME", "FORMAT_IDCARD_DISPLAY_DATE_EN", "FORMAT_IDCARD_DISPLAY_DATE_TH", "FORMAT_SERVER_DATE", "FORMAT_SERVER_DATE_TIME", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.extension.format.DateStringFormat$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    public final String getCurrentDate() {
        Locale locale = Locale.US;
        String format = new SimpleDateFormat("yyyy-MM-dd", locale).format(Calendar.getInstance(locale).getTime());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.time)");
        return format;
    }
}
