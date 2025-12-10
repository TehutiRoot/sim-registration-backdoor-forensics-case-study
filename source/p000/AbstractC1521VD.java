package p000;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: VD */
/* loaded from: classes4.dex */
public abstract class AbstractC1521VD {
    /* renamed from: a */
    public static Pair m65902a(Long l, Long l2) {
        return m65901b(l, l2, null);
    }

    /* renamed from: b */
    public static Pair m65901b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, m65899d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return Pair.create(m65899d(l.longValue(), simpleDateFormat), null);
        }
        Calendar m1135o = AbstractC22545v02.m1135o();
        Calendar m1133q = AbstractC22545v02.m1133q();
        m1133q.setTimeInMillis(l.longValue());
        Calendar m1133q2 = AbstractC22545v02.m1133q();
        m1133q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (m1133q.get(1) == m1133q2.get(1)) {
            if (m1133q.get(1) == m1135o.get(1)) {
                return Pair.create(m65896g(l.longValue(), Locale.getDefault()), m65896g(l2.longValue(), Locale.getDefault()));
            }
            return Pair.create(m65896g(l.longValue(), Locale.getDefault()), m65889n(l2.longValue(), Locale.getDefault()));
        } else {
            return Pair.create(m65889n(l.longValue(), Locale.getDefault()), m65889n(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    public static String m65900c(long j) {
        return m65899d(j, null);
    }

    /* renamed from: d */
    public static String m65899d(long j, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (m65886q(j)) {
            return m65897f(j);
        }
        return m65890m(j);
    }

    /* renamed from: e */
    public static String m65898e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String m65893j = m65893j(j);
        if (z) {
            m65893j = String.format(context.getString(R.string.mtrl_picker_today_description), m65893j);
        }
        if (z2) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), m65893j);
        }
        if (z3) {
            return String.format(context.getString(R.string.mtrl_picker_end_date_description), m65893j);
        }
        return m65893j;
    }

    /* renamed from: f */
    public static String m65897f(long j) {
        return m65896g(j, Locale.getDefault());
    }

    /* renamed from: g */
    public static String m65896g(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22545v02.m1147c(locale).format(new Date(j));
            return format;
        }
        return AbstractC22545v02.m1138l(locale).format(new Date(j));
    }

    /* renamed from: h */
    public static String m65895h(long j) {
        return m65894i(j, Locale.getDefault());
    }

    /* renamed from: i */
    public static String m65894i(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22545v02.m1146d(locale).format(new Date(j));
            return format;
        }
        return AbstractC22545v02.m1140j(locale).format(new Date(j));
    }

    /* renamed from: j */
    public static String m65893j(long j) {
        if (m65886q(j)) {
            return m65895h(j);
        }
        return m65888o(j);
    }

    /* renamed from: k */
    public static String m65892k(Context context, int i) {
        if (AbstractC22545v02.m1135o().get(1) == i) {
            return String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    /* renamed from: l */
    public static String m65891l(long j) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22545v02.m1129u(Locale.getDefault()).format(new Date(j));
            return format;
        }
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* renamed from: m */
    public static String m65890m(long j) {
        return m65889n(j, Locale.getDefault());
    }

    /* renamed from: n */
    public static String m65889n(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22545v02.m1131s(locale).format(new Date(j));
            return format;
        }
        return AbstractC22545v02.m1139k(locale).format(new Date(j));
    }

    /* renamed from: o */
    public static String m65888o(long j) {
        return m65887p(j, Locale.getDefault());
    }

    /* renamed from: p */
    public static String m65887p(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22545v02.m1130t(locale).format(new Date(j));
            return format;
        }
        return AbstractC22545v02.m1140j(locale).format(new Date(j));
    }

    /* renamed from: q */
    public static boolean m65886q(long j) {
        Calendar m1135o = AbstractC22545v02.m1135o();
        Calendar m1133q = AbstractC22545v02.m1133q();
        m1133q.setTimeInMillis(j);
        if (m1135o.get(1) == m1133q.get(1)) {
            return true;
        }
        return false;
    }
}
