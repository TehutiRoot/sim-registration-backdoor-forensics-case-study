package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: wd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22889wd2 {

    /* renamed from: a */
    public final String f108505a;

    /* renamed from: b */
    public final String f108506b;

    /* renamed from: c */
    public final long f108507c;

    /* renamed from: d */
    public final long f108508d;

    /* renamed from: e */
    public final long f108509e;

    /* renamed from: f */
    public final long f108510f;

    /* renamed from: g */
    public final long f108511g;

    /* renamed from: h */
    public final Long f108512h;

    /* renamed from: i */
    public final Long f108513i;

    /* renamed from: j */
    public final Long f108514j;

    /* renamed from: k */
    public final Boolean f108515k;

    public C22889wd2(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
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
        this.f108505a = str;
        this.f108506b = str2;
        this.f108507c = j;
        this.f108508d = j2;
        this.f108509e = j3;
        this.f108510f = j4;
        this.f108511g = j5;
        this.f108512h = l;
        this.f108513i = l2;
        this.f108514j = l3;
        this.f108515k = bool;
    }

    /* renamed from: a */
    public final C22889wd2 m690a(Long l, Long l2, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new C22889wd2(this.f108505a, this.f108506b, this.f108507c, this.f108508d, this.f108509e, this.f108510f, this.f108511g, this.f108512h, l, l2, bool2);
    }

    /* renamed from: b */
    public final C22889wd2 m689b(long j, long j2) {
        return new C22889wd2(this.f108505a, this.f108506b, this.f108507c, this.f108508d, this.f108509e, this.f108510f, j, Long.valueOf(j2), this.f108513i, this.f108514j, this.f108515k);
    }

    /* renamed from: c */
    public final C22889wd2 m688c(long j) {
        return new C22889wd2(this.f108505a, this.f108506b, this.f108507c, this.f108508d, this.f108509e, j, this.f108511g, this.f108512h, this.f108513i, this.f108514j, this.f108515k);
    }
}