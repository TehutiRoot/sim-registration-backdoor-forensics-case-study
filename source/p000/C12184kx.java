package p000;

/* renamed from: kx */
/* loaded from: classes5.dex */
public final class C12184kx {

    /* renamed from: a */
    public static final C12184kx f71485a = new C12184kx();

    /* renamed from: b */
    public static final double f71486b = Math.log(2.0d);

    /* renamed from: c */
    public static final double f71487c;

    /* renamed from: d */
    public static final double f71488d;

    /* renamed from: e */
    public static final double f71489e;

    /* renamed from: f */
    public static final double f71490f;

    /* renamed from: g */
    public static final double f71491g;

    static {
        double ulp = Math.ulp(1.0d);
        f71487c = ulp;
        double sqrt = Math.sqrt(ulp);
        f71488d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f71489e = sqrt2;
        double d = 1;
        f71490f = d / sqrt;
        f71491g = d / sqrt2;
    }
}
