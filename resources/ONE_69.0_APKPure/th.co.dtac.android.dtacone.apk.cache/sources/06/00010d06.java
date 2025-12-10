package p000;

import p000.AbstractC1667XS;

/* renamed from: s8 */
/* loaded from: classes3.dex */
public final class C13894s8 extends AbstractC1667XS {

    /* renamed from: b */
    public final long f79791b;

    /* renamed from: c */
    public final int f79792c;

    /* renamed from: d */
    public final int f79793d;

    /* renamed from: e */
    public final long f79794e;

    /* renamed from: f */
    public final int f79795f;

    /* renamed from: s8$b */
    /* loaded from: classes3.dex */
    public static final class C13896b extends AbstractC1667XS.AbstractC1668a {

        /* renamed from: a */
        public Long f79796a;

        /* renamed from: b */
        public Integer f79797b;

        /* renamed from: c */
        public Integer f79798c;

        /* renamed from: d */
        public Long f79799d;

        /* renamed from: e */
        public Integer f79800e;

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: a */
        public AbstractC1667XS mo22868a() {
            String str = "";
            if (this.f79796a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f79797b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f79798c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f79799d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f79800e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C13894s8(this.f79796a.longValue(), this.f79797b.intValue(), this.f79798c.intValue(), this.f79799d.longValue(), this.f79800e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: b */
        public AbstractC1667XS.AbstractC1668a mo22867b(int i) {
            this.f79798c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: c */
        public AbstractC1667XS.AbstractC1668a mo22866c(long j) {
            this.f79799d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: d */
        public AbstractC1667XS.AbstractC1668a mo22865d(int i) {
            this.f79797b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: e */
        public AbstractC1667XS.AbstractC1668a mo22864e(int i) {
            this.f79800e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC1667XS.AbstractC1668a
        /* renamed from: f */
        public AbstractC1667XS.AbstractC1668a mo22863f(long j) {
            this.f79796a = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC1667XS
    /* renamed from: b */
    public int mo22873b() {
        return this.f79793d;
    }

    @Override // p000.AbstractC1667XS
    /* renamed from: c */
    public long mo22872c() {
        return this.f79794e;
    }

    @Override // p000.AbstractC1667XS
    /* renamed from: d */
    public int mo22871d() {
        return this.f79792c;
    }

    @Override // p000.AbstractC1667XS
    /* renamed from: e */
    public int mo22870e() {
        return this.f79795f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1667XS)) {
            return false;
        }
        AbstractC1667XS abstractC1667XS = (AbstractC1667XS) obj;
        if (this.f79791b == abstractC1667XS.mo22869f() && this.f79792c == abstractC1667XS.mo22871d() && this.f79793d == abstractC1667XS.mo22873b() && this.f79794e == abstractC1667XS.mo22872c() && this.f79795f == abstractC1667XS.mo22870e()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC1667XS
    /* renamed from: f */
    public long mo22869f() {
        return this.f79791b;
    }

    public int hashCode() {
        long j = this.f79791b;
        long j2 = this.f79794e;
        return this.f79795f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f79792c) * 1000003) ^ this.f79793d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f79791b + ", loadBatchSize=" + this.f79792c + ", criticalSectionEnterTimeoutMs=" + this.f79793d + ", eventCleanUpAge=" + this.f79794e + ", maxBlobByteSizePerRow=" + this.f79795f + "}";
    }

    public C13894s8(long j, int i, int i2, long j2, int i3) {
        this.f79791b = j;
        this.f79792c = i;
        this.f79793d = i2;
        this.f79794e = j2;
        this.f79795f = i3;
    }
}