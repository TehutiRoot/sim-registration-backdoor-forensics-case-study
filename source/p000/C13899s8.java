package p000;

import p000.AbstractC1387TS;

/* renamed from: s8 */
/* loaded from: classes3.dex */
public final class C13899s8 extends AbstractC1387TS {

    /* renamed from: b */
    public final long f79583b;

    /* renamed from: c */
    public final int f79584c;

    /* renamed from: d */
    public final int f79585d;

    /* renamed from: e */
    public final long f79586e;

    /* renamed from: f */
    public final int f79587f;

    /* renamed from: s8$b */
    /* loaded from: classes3.dex */
    public static final class C13901b extends AbstractC1387TS.AbstractC1388a {

        /* renamed from: a */
        public Long f79588a;

        /* renamed from: b */
        public Integer f79589b;

        /* renamed from: c */
        public Integer f79590c;

        /* renamed from: d */
        public Long f79591d;

        /* renamed from: e */
        public Integer f79592e;

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: a */
        public AbstractC1387TS mo22699a() {
            String str = "";
            if (this.f79588a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f79589b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f79590c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f79591d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f79592e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C13899s8(this.f79588a.longValue(), this.f79589b.intValue(), this.f79590c.intValue(), this.f79591d.longValue(), this.f79592e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: b */
        public AbstractC1387TS.AbstractC1388a mo22698b(int i) {
            this.f79590c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: c */
        public AbstractC1387TS.AbstractC1388a mo22697c(long j) {
            this.f79591d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: d */
        public AbstractC1387TS.AbstractC1388a mo22696d(int i) {
            this.f79589b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: e */
        public AbstractC1387TS.AbstractC1388a mo22695e(int i) {
            this.f79592e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1387TS.AbstractC1388a
        /* renamed from: f */
        public AbstractC1387TS.AbstractC1388a mo22694f(long j) {
            this.f79588a = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC1387TS
    /* renamed from: b */
    public int mo22704b() {
        return this.f79585d;
    }

    @Override // p000.AbstractC1387TS
    /* renamed from: c */
    public long mo22703c() {
        return this.f79586e;
    }

    @Override // p000.AbstractC1387TS
    /* renamed from: d */
    public int mo22702d() {
        return this.f79584c;
    }

    @Override // p000.AbstractC1387TS
    /* renamed from: e */
    public int mo22701e() {
        return this.f79587f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1387TS)) {
            return false;
        }
        AbstractC1387TS abstractC1387TS = (AbstractC1387TS) obj;
        if (this.f79583b == abstractC1387TS.mo22700f() && this.f79584c == abstractC1387TS.mo22702d() && this.f79585d == abstractC1387TS.mo22704b() && this.f79586e == abstractC1387TS.mo22703c() && this.f79587f == abstractC1387TS.mo22701e()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC1387TS
    /* renamed from: f */
    public long mo22700f() {
        return this.f79583b;
    }

    public int hashCode() {
        long j = this.f79583b;
        long j2 = this.f79586e;
        return this.f79587f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f79584c) * 1000003) ^ this.f79585d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f79583b + ", loadBatchSize=" + this.f79584c + ", criticalSectionEnterTimeoutMs=" + this.f79585d + ", eventCleanUpAge=" + this.f79586e + ", maxBlobByteSizePerRow=" + this.f79587f + "}";
    }

    public C13899s8(long j, int i, int i2, long j2, int i3) {
        this.f79583b = j;
        this.f79584c = i;
        this.f79585d = i2;
        this.f79586e = j2;
        this.f79587f = i3;
    }
}
