package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.common.base.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7455a {

    /* renamed from: a */
    public static final InterfaceC17353Bj1 f52806a = m41253e();

    /* renamed from: com.google.common.base.a$b */
    /* loaded from: classes4.dex */
    public static final class C7457b implements InterfaceC17353Bj1 {
        public C7457b() {
        }

        @Override // p000.InterfaceC17353Bj1
        /* renamed from: a */
        public AbstractC11495iu mo41248a(String str) {
            return new JdkPattern(Pattern.compile(str));
        }

        @Override // p000.InterfaceC17353Bj1
        /* renamed from: b */
        public boolean mo41247b() {
            return true;
        }
    }

    /* renamed from: a */
    public static AbstractC11495iu m41257a(String str) {
        Preconditions.checkNotNull(str);
        return f52806a.mo41248a(str);
    }

    /* renamed from: b */
    public static String m41256b(String str) {
        if (m41249i(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m41255c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* renamed from: d */
    public static Optional m41254d(Class cls, String str) {
        WeakReference weakReference = (WeakReference) Enums.m41334a(cls).get(str);
        if (weakReference == null) {
            return Optional.absent();
        }
        return Optional.fromNullable((Enum) cls.cast(weakReference.get()));
    }

    /* renamed from: e */
    public static InterfaceC17353Bj1 m41253e() {
        return new C7457b();
    }

    /* renamed from: f */
    public static String m41252f(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: g */
    public static boolean m41251g() {
        return f52806a.mo41247b();
    }

    /* renamed from: h */
    public static CharMatcher m41250h(CharMatcher charMatcher) {
        return charMatcher.m41343e();
    }

    /* renamed from: i */
    public static boolean m41249i(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
