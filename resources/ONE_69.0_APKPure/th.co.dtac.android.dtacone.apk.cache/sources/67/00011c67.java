package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m29142d2 = {"Ljava/util/Calendar;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Calendar;)Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentResponseKt */
/* loaded from: classes8.dex */
public final class AppointmentResponseKt {
    /* renamed from: a */
    public static final String m19303a(Calendar calendar) {
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(time)");
        return format;
    }

    /* renamed from: b */
    public static final String m19302b(Calendar calendar) {
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(12))}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(13))}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        return format + ":" + format2 + ":" + format3;
    }
}