package p000;

import androidx.compose.material3.CalendarDate;
import androidx.compose.material3.CalendarModel;
import androidx.compose.material3.CalendarModel_androidKt;
import androidx.compose.material3.CalendarMonth;
import androidx.compose.material3.DateInputFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ug */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC16838ug {
    /* renamed from: a */
    public static String m1241a(CalendarModel calendarModel, CalendarDate date, String skeleton, Locale locale) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(date.getUtcTimeMillis(), skeleton, locale);
    }

    /* renamed from: b */
    public static String m1240b(CalendarModel calendarModel, CalendarMonth month, String skeleton, Locale locale) {
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(month.getStartUtcTimeMillis(), skeleton, locale);
    }

    /* renamed from: c */
    public static /* synthetic */ String m1239c(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return calendarModel.formatWithSkeleton(calendarDate, str, locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    /* renamed from: d */
    public static /* synthetic */ String m1238d(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    /* renamed from: e */
    public static /* synthetic */ DateInputFormat m1237e(CalendarModel calendarModel, Locale locale, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
            return calendarModel.getDateInputFormat(locale);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
    }
}
