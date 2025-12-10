package org.joda.time.p045tz;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.CachedDateTimeZone */
/* loaded from: classes5.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient C13023a[] iInfoCache;
    private final DateTimeZone iZone;

    /* renamed from: org.joda.time.tz.CachedDateTimeZone$a */
    /* loaded from: classes5.dex */
    public static final class C13023a {

        /* renamed from: a */
        public final long f76339a;

        /* renamed from: b */
        public final DateTimeZone f76340b;

        /* renamed from: c */
        public C13023a f76341c;

        /* renamed from: d */
        public String f76342d;

        /* renamed from: e */
        public int f76343e = Integer.MIN_VALUE;

        /* renamed from: f */
        public int f76344f = Integer.MIN_VALUE;

        public C13023a(DateTimeZone dateTimeZone, long j) {
            this.f76339a = j;
            this.f76340b = dateTimeZone;
        }

        /* renamed from: a */
        public String m23823a(long j) {
            C13023a c13023a = this.f76341c;
            if (c13023a != null && j >= c13023a.f76339a) {
                return c13023a.m23823a(j);
            }
            if (this.f76342d == null) {
                this.f76342d = this.f76340b.getNameKey(this.f76339a);
            }
            return this.f76342d;
        }

        /* renamed from: b */
        public int m23822b(long j) {
            C13023a c13023a = this.f76341c;
            if (c13023a != null && j >= c13023a.f76339a) {
                return c13023a.m23822b(j);
            }
            if (this.f76343e == Integer.MIN_VALUE) {
                this.f76343e = this.f76340b.getOffset(this.f76339a);
            }
            return this.f76343e;
        }

        /* renamed from: c */
        public int m23821c(long j) {
            C13023a c13023a = this.f76341c;
            if (c13023a != null && j >= c13023a.f76339a) {
                return c13023a.m23821c(j);
            }
            if (this.f76344f == Integer.MIN_VALUE) {
                this.f76344f = this.f76340b.getStandardOffset(this.f76339a);
            }
            return this.f76344f;
        }
    }

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new C13023a[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private C13023a createInfo(long j) {
        long j2 = j & (-4294967296L);
        C13023a c13023a = new C13023a(this.iZone, j2);
        long j3 = BodyPartID.bodyIdMax | j2;
        C13023a c13023a2 = c13023a;
        while (true) {
            long nextTransition = this.iZone.nextTransition(j2);
            if (nextTransition == j2 || nextTransition > j3) {
                break;
            }
            C13023a c13023a3 = new C13023a(this.iZone, nextTransition);
            c13023a2.f76341c = c13023a3;
            c13023a2 = c13023a3;
            j2 = nextTransition;
        }
        return c13023a;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone instanceof CachedDateTimeZone) {
            return (CachedDateTimeZone) dateTimeZone;
        }
        return new CachedDateTimeZone(dateTimeZone);
    }

    private C13023a getInfo(long j) {
        int i = (int) (j >> 32);
        C13023a[] c13023aArr = this.iInfoCache;
        int i2 = cInfoCacheMask & i;
        C13023a c13023a = c13023aArr[i2];
        if (c13023a == null || ((int) (c13023a.f76339a >> 32)) != i) {
            C13023a createInfo = createInfo(j);
            c13023aArr[i2] = createInfo;
            return createInfo;
        }
        return c13023a;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j) {
        return getInfo(j).m23823a(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j) {
        return getInfo(j).m23822b(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j) {
        return getInfo(j).m23821c(j);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j) {
        return this.iZone.nextTransition(j);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j) {
        return this.iZone.previousTransition(j);
    }
}
