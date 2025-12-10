package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: kU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20791kU1 {

    /* renamed from: c */
    public static final C20791kU1 f67979c = new C20791kU1(null, null);

    /* renamed from: a */
    public final Long f67980a;

    /* renamed from: b */
    public final TimeZone f67981b;

    public C20791kU1(Long l, TimeZone timeZone) {
        this.f67980a = l;
        this.f67981b = timeZone;
    }

    /* renamed from: c */
    public static C20791kU1 m29207c() {
        return f67979c;
    }

    /* renamed from: a */
    public Calendar m29209a() {
        return m29208b(this.f67981b);
    }

    /* renamed from: b */
    public Calendar m29208b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f67980a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}