package p000;

/* renamed from: kx */
/* loaded from: classes5.dex */
public final class C12161kx {

    /* renamed from: a */
    public static final C12161kx f71543a = new C12161kx();

    /* renamed from: b */
    public static final double f71544b = Math.log(2.0d);

    /* renamed from: c */
    public static final double f71545c;

    /* renamed from: d */
    public static final double f71546d;

    /* renamed from: e */
    public static final double f71547e;

    /* renamed from: f */
    public static final double f71548f;

    /* renamed from: g */
    public static final double f71549g;

    static {
        double ulp = Math.ulp(1.0d);
        f71545c = ulp;
        double sqrt = Math.sqrt(ulp);
        f71546d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f71547e = sqrt2;
        double d = 1;
        f71548f = d / sqrt;
        f71549g = d / sqrt2;
    }
}