package th.p047co.dtac.android.dtacone.view.appOne.tol.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, m29142d2 = {"toDateString", "", "", "format", "locale", "Ljava/util/Locale;", "toLocalDate", "Ljava/util/Calendar;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.util.LongHelperKt */
/* loaded from: classes10.dex */
public final class LongHelperKt {
    @NotNull
    public static final String toDateString(long j, @NotNull String format, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, locale);
        Calendar calendar = Calendar.getInstance();
        calendar.getTime().setTime(j);
        calendar.add(1, 543);
        String format2 = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format2, "formatter.format(cal.time)");
        return format2;
    }

    public static /* synthetic */ String toDateString$default(long j, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "dd MMMM yyyy";
        }
        if ((i & 2) != 0) {
            locale = new Locale(LanguageSupport.LANG_TH);
        }
        return toDateString(j, str, locale);
    }

    @NotNull
    public static final Calendar toLocalDate(long j) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.getTime().setTime(j);
        Intrinsics.checkNotNullExpressionValue(cal, "cal");
        return cal;
    }
}