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

/* renamed from: WD */
/* loaded from: classes4.dex */
public abstract class AbstractC1581WD {
    /* renamed from: a */
    public static Pair m65793a(Long l, Long l2) {
        return m65792b(l, l2, null);
    }

    /* renamed from: b */
    public static Pair m65792b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, m65790d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return Pair.create(m65790d(l.longValue(), simpleDateFormat), null);
        }
        Calendar m22895o = AbstractC22096s12.m22895o();
        Calendar m22893q = AbstractC22096s12.m22893q();
        m22893q.setTimeInMillis(l.longValue());
        Calendar m22893q2 = AbstractC22096s12.m22893q();
        m22893q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (m22893q.get(1) == m22893q2.get(1)) {
            if (m22893q.get(1) == m22895o.get(1)) {
                return Pair.create(m65787g(l.longValue(), Locale.getDefault()), m65787g(l2.longValue(), Locale.getDefault()));
            }
            return Pair.create(m65787g(l.longValue(), Locale.getDefault()), m65780n(l2.longValue(), Locale.getDefault()));
        } else {
            return Pair.create(m65780n(l.longValue(), Locale.getDefault()), m65780n(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    public static String m65791c(long j) {
        return m65790d(j, null);
    }

    /* renamed from: d */
    public static String m65790d(long j, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (m65777q(j)) {
            return m65788f(j);
        }
        return m65781m(j);
    }

    /* renamed from: e */
    public static String m65789e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String m65784j = m65784j(j);
        if (z) {
            m65784j = String.format(context.getString(R.string.mtrl_picker_today_description), m65784j);
        }
        if (z2) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), m65784j);
        }
        if (z3) {
            return String.format(context.getString(R.string.mtrl_picker_end_date_description), m65784j);
        }
        return m65784j;
    }

    /* renamed from: f */
    public static String m65788f(long j) {
        return m65787g(j, Locale.getDefault());
    }

    /* renamed from: g */
    public static String m65787g(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22096s12.m22907c(locale).format(new Date(j));
            return format;
        }
        return AbstractC22096s12.m22898l(locale).format(new Date(j));
    }

    /* renamed from: h */
    public static String m65786h(long j) {
        return m65785i(j, Locale.getDefault());
    }

    /* renamed from: i */
    public static String m65785i(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22096s12.m22906d(locale).format(new Date(j));
            return format;
        }
        return AbstractC22096s12.m22900j(locale).format(new Date(j));
    }

    /* renamed from: j */
    public static String m65784j(long j) {
        if (m65777q(j)) {
            return m65786h(j);
        }
        return m65779o(j);
    }

    /* renamed from: k */
    public static String m65783k(Context context, int i) {
        if (AbstractC22096s12.m22895o().get(1) == i) {
            return String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    /* renamed from: l */
    public static String m65782l(long j) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22096s12.m22889u(Locale.getDefault()).format(new Date(j));
            return format;
        }
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* renamed from: m */
    public static String m65781m(long j) {
        return m65780n(j, Locale.getDefault());
    }

    /* renamed from: n */
    public static String m65780n(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22096s12.m22891s(locale).format(new Date(j));
            return format;
        }
        return AbstractC22096s12.m22899k(locale).format(new Date(j));
    }

    /* renamed from: o */
    public static String m65779o(long j) {
        return m65778p(j, Locale.getDefault());
    }

    /* renamed from: p */
    public static String m65778p(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = AbstractC22096s12.m22890t(locale).format(new Date(j));
            return format;
        }
        return AbstractC22096s12.m22900j(locale).format(new Date(j));
    }

    /* renamed from: q */
    public static boolean m65777q(long j) {
        Calendar m22895o = AbstractC22096s12.m22895o();
        Calendar m22893q = AbstractC22096s12.m22893q();
        m22893q.setTimeInMillis(j);
        if (m22895o.get(1) == m22893q.get(1)) {
            return true;
        }
        return false;
    }
}