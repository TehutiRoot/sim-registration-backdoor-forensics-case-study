package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class Operators {

    /* renamed from: a */
    public final Map f60260a;

    /* renamed from: b */
    public static final Operator f60235b = new C13062p6();

    /* renamed from: c */
    public static final Operator f60236c = new C13160q6();

    /* renamed from: d */
    public static final Operator f60237d = new C13231r6();

    /* renamed from: e */
    public static final Operator f60238e = new C13892s6();

    /* renamed from: f */
    public static final Operator f60239f = new C13974t6();

    /* renamed from: g */
    public static final Operator f60240g = new C16796u6();

    /* renamed from: h */
    public static final Operator f60241h = new C16871v6();

    /* renamed from: i */
    public static final Operator f60242i = new C16946w6();

    /* renamed from: j */
    public static final Operator f60243j = new C17022x6();

    /* renamed from: k */
    public static final Operator f60244k = new C17098y6();

    /* renamed from: l */
    public static final Operator f60245l = new C17172z6();

    /* renamed from: m */
    public static final Operator f60246m = new C0009A6();

    /* renamed from: n */
    public static final Operator f60247n = new C0078B6();

    /* renamed from: o */
    public static final Operator f60248o = new C0156C6();

    /* renamed from: p */
    public static final Operator f60249p = new C0228D6();

    /* renamed from: q */
    public static final Operator f60250q = new C0299E6();

    /* renamed from: r */
    public static final Operator f60251r = new C0366F6();

    /* renamed from: s */
    public static final Operator f60252s = new C0431G6();

    /* renamed from: t */
    public static final Operator f60253t = new C0503H6();

    /* renamed from: u */
    public static final Operator f60254u = new C0575I6();

    /* renamed from: v */
    public static final Operator f60255v = new C0648J6();

    /* renamed from: w */
    public static final Operator f60256w = new C0813Lb();

    /* renamed from: x */
    public static final Operator f60257x = new C0880Mb();

    /* renamed from: y */
    public static final Operator f60258y = new C18594Uu1();

    /* renamed from: z */
    public static final Operator f60259z = new C0955Nb();

    /* renamed from: A */
    public static final Operator f60218A = new C18658Vu1();

    /* renamed from: B */
    public static final Operator f60219B = new C18722Wu1();

    /* renamed from: C */
    public static final Operator f60220C = new C18786Xu1();

    /* renamed from: D */
    public static final Operator f60221D = new C18850Yu1();

    /* renamed from: E */
    public static final Operator f60222E = new C18914Zu1();

    /* renamed from: F */
    public static final Operator f60223F = new C1024Ob();

    /* renamed from: G */
    public static final Operator f60224G = new C1108Pb();

    /* renamed from: H */
    public static final Operator f60225H = new C1188Qb();

    /* renamed from: I */
    public static final Operator f60226I = new C1256Rb();

    /* renamed from: J */
    public static final Operator f60227J = new C11497iw();

    /* renamed from: K */
    public static final Operator f60228K = new C11610jw();

    /* renamed from: L */
    public static final Operator f60229L = new TK1();

    /* renamed from: M */
    public static final Operator f60230M = new UK1();

    /* renamed from: N */
    public static final Operator f60231N = new VK1();

    /* renamed from: O */
    public static final Operator f60232O = new WK1();

    /* renamed from: P */
    public static final Operator f60233P = new XK1();

    /* renamed from: Q */
    public static final Operator f60234Q = new YK1();

    public Operators() {
        HashMap hashMap = new HashMap();
        this.f60260a = hashMap;
        hashMap.put(ProductAction.ACTION_ADD, f60236c);
        hashMap.put("abs", f60235b);
        hashMap.put("atan", f60237d);
        hashMap.put("ceiling", f60238e);
        hashMap.put("cos", f60239f);
        hashMap.put("cvi", f60240g);
        hashMap.put("cvr", f60241h);
        hashMap.put("div", f60242i);
        hashMap.put("exp", f60243j);
        hashMap.put("floor", f60244k);
        hashMap.put("idiv", f60245l);
        hashMap.put("ln", f60246m);
        hashMap.put("log", f60247n);
        hashMap.put("mod", f60248o);
        hashMap.put("mul", f60249p);
        hashMap.put("neg", f60250q);
        hashMap.put("round", f60251r);
        hashMap.put("sin", f60252s);
        hashMap.put("sqrt", f60253t);
        hashMap.put("sub", f60254u);
        hashMap.put("truncate", f60255v);
        hashMap.put("and", f60256w);
        hashMap.put("bitshift", f60257x);
        hashMap.put("eq", f60258y);
        hashMap.put("false", f60259z);
        hashMap.put("ge", f60218A);
        hashMap.put("gt", f60219B);
        hashMap.put("le", f60220C);
        hashMap.put("lt", f60221D);
        hashMap.put("ne", f60222E);
        hashMap.put("not", f60223F);
        hashMap.put("or", f60224G);
        hashMap.put("true", f60225H);
        hashMap.put("xor", f60226I);
        hashMap.put("if", f60227J);
        hashMap.put("ifelse", f60228K);
        hashMap.put("copy", f60229L);
        hashMap.put("dup", f60230M);
        hashMap.put("exch", f60231N);
        hashMap.put(FirebaseAnalytics.Param.INDEX, f60232O);
        hashMap.put("pop", f60233P);
        hashMap.put("roll", f60234Q);
    }

    public Operator getOperator(String str) {
        return (Operator) this.f60260a.get(str);
    }
}
