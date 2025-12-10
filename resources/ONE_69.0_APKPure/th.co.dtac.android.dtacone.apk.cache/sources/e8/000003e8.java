package p000;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* renamed from: E50 */
/* loaded from: classes5.dex */
public class E50 {

    /* renamed from: a */
    public final DateTimeZone f1251a;

    /* renamed from: b */
    public final Instant f1252b;

    /* renamed from: c */
    public final int f1253c;

    public E50(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.f1251a = dateTimeZone;
        this.f1252b = instant;
        this.f1253c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E50)) {
            return false;
        }
        E50 e50 = (E50) obj;
        Instant instant = this.f1252b;
        if (instant == null) {
            if (e50.f1252b != null) {
                return false;
            }
        } else if (!instant.equals(e50.f1252b)) {
            return false;
        }
        if (this.f1253c != e50.f1253c) {
            return false;
        }
        DateTimeZone dateTimeZone = this.f1251a;
        if (dateTimeZone == null) {
            if (e50.f1251a != null) {
                return false;
            }
        } else if (!dateTimeZone.equals(e50.f1251a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Instant instant = this.f1252b;
        int i = 0;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        int i2 = (((hashCode + 31) * 31) + this.f1253c) * 31;
        DateTimeZone dateTimeZone = this.f1251a;
        if (dateTimeZone != null) {
            i = dateTimeZone.hashCode();
        }
        return i2 + i;
    }
}