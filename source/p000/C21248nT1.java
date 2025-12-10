package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: nT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21248nT1 {

    /* renamed from: c */
    public static final C21248nT1 f72229c = new C21248nT1(null, null);

    /* renamed from: a */
    public final Long f72230a;

    /* renamed from: b */
    public final TimeZone f72231b;

    public C21248nT1(Long l, TimeZone timeZone) {
        this.f72230a = l;
        this.f72231b = timeZone;
    }

    /* renamed from: c */
    public static C21248nT1 m26125c() {
        return f72229c;
    }

    /* renamed from: a */
    public Calendar m26127a() {
        return m26126b(this.f72231b);
    }

    /* renamed from: b */
    public Calendar m26126b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f72230a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
