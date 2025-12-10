package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: zc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23333zc2 {

    /* renamed from: a */
    public final String f109121a;

    /* renamed from: b */
    public final String f109122b;

    /* renamed from: c */
    public final long f109123c;

    /* renamed from: d */
    public final long f109124d;

    /* renamed from: e */
    public final long f109125e;

    /* renamed from: f */
    public final long f109126f;

    /* renamed from: g */
    public final long f109127g;

    /* renamed from: h */
    public final Long f109128h;

    /* renamed from: i */
    public final Long f109129i;

    /* renamed from: j */
    public final Long f109130j;

    /* renamed from: k */
    public final Boolean f109131k;

    public C23333zc2(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        Preconditions.checkArgument(j5 >= 0);
        this.f109121a = str;
        this.f109122b = str2;
        this.f109123c = j;
        this.f109124d = j2;
        this.f109125e = j3;
        this.f109126f = j4;
        this.f109127g = j5;
        this.f109128h = l;
        this.f109129i = l2;
        this.f109130j = l3;
        this.f109131k = bool;
    }

    /* renamed from: a */
    public final C23333zc2 m67a(Long l, Long l2, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new C23333zc2(this.f109121a, this.f109122b, this.f109123c, this.f109124d, this.f109125e, this.f109126f, this.f109127g, this.f109128h, l, l2, bool2);
    }

    /* renamed from: b */
    public final C23333zc2 m66b(long j, long j2) {
        return new C23333zc2(this.f109121a, this.f109122b, this.f109123c, this.f109124d, this.f109125e, this.f109126f, j, Long.valueOf(j2), this.f109129i, this.f109130j, this.f109131k);
    }

    /* renamed from: c */
    public final C23333zc2 m65c(long j) {
        return new C23333zc2(this.f109121a, this.f109122b, this.f109123c, this.f109124d, this.f109125e, j, this.f109127g, this.f109128h, this.f109129i, this.f109130j, this.f109131k);
    }
}
