package p000;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* renamed from: A50 */
/* loaded from: classes5.dex */
public class A50 {

    /* renamed from: a */
    public final DateTimeZone f18a;

    /* renamed from: b */
    public final Instant f19b;

    /* renamed from: c */
    public final int f20c;

    public A50(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.f18a = dateTimeZone;
        this.f19b = instant;
        this.f20c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A50)) {
            return false;
        }
        A50 a50 = (A50) obj;
        Instant instant = this.f19b;
        if (instant == null) {
            if (a50.f19b != null) {
                return false;
            }
        } else if (!instant.equals(a50.f19b)) {
            return false;
        }
        if (this.f20c != a50.f20c) {
            return false;
        }
        DateTimeZone dateTimeZone = this.f18a;
        if (dateTimeZone == null) {
            if (a50.f18a != null) {
                return false;
            }
        } else if (!dateTimeZone.equals(a50.f18a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Instant instant = this.f19b;
        int i = 0;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        int i2 = (((hashCode + 31) * 31) + this.f20c) * 31;
        DateTimeZone dateTimeZone = this.f18a;
        if (dateTimeZone != null) {
            i = dateTimeZone.hashCode();
        }
        return i2 + i;
    }
}
