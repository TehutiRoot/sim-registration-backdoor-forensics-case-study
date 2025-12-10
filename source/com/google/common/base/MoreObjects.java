package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class MoreObjects {

    /* loaded from: classes4.dex */
    public static final class ToStringHelper {

        /* renamed from: a */
        public final String f52757a;

        /* renamed from: b */
        public final C7431b f52758b;

        /* renamed from: c */
        public C7431b f52759c;

        /* renamed from: d */
        public boolean f52760d;

        /* renamed from: e */
        public boolean f52761e;

        /* renamed from: com.google.common.base.MoreObjects$ToStringHelper$a */
        /* loaded from: classes4.dex */
        public static final class C7430a extends C7431b {
            public C7430a() {
            }
        }

        /* renamed from: com.google.common.base.MoreObjects$ToStringHelper$b */
        /* loaded from: classes4.dex */
        public static class C7431b {

            /* renamed from: a */
            public String f52762a;

            /* renamed from: b */
            public Object f52763b;

            /* renamed from: c */
            public C7431b f52764c;
        }

        /* renamed from: g */
        public static boolean m41314g(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() != 0) {
                    return false;
                }
                return true;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Optional) {
                    return !((Optional) obj).isPresent();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: a */
        public final C7431b m41320a() {
            C7431b c7431b = new C7431b();
            this.f52759c.f52764c = c7431b;
            this.f52759c = c7431b;
            return c7431b;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @CheckForNull Object obj) {
            return m41318c(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@CheckForNull Object obj) {
            return m41319b(obj);
        }

        /* renamed from: b */
        public final ToStringHelper m41319b(Object obj) {
            m41320a().f52763b = obj;
            return this;
        }

        /* renamed from: c */
        public final ToStringHelper m41318c(String str, Object obj) {
            C7431b m41320a = m41320a();
            m41320a.f52763b = obj;
            m41320a.f52762a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        /* renamed from: d */
        public final C7430a m41317d() {
            C7430a c7430a = new C7430a();
            this.f52759c.f52764c = c7430a;
            this.f52759c = c7430a;
            return c7430a;
        }

        /* renamed from: e */
        public final ToStringHelper m41316e(Object obj) {
            m41317d().f52763b = obj;
            return this;
        }

        /* renamed from: f */
        public final ToStringHelper m41315f(String str, Object obj) {
            C7430a m41317d = m41317d();
            m41317d.f52763b = obj;
            m41317d.f52762a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.f52760d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f52760d;
            boolean z2 = this.f52761e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52757a);
            sb.append('{');
            String str = "";
            for (C7431b c7431b = this.f52758b.f52764c; c7431b != null; c7431b = c7431b.f52764c) {
                Object obj = c7431b.f52763b;
                if (!(c7431b instanceof C7430a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m41314g(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c7431b.f52762a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper(String str) {
            C7431b c7431b = new C7431b();
            this.f52758b = c7431b;
            this.f52759c = c7431b;
            this.f52760d = false;
            this.f52761e = false;
            this.f52757a = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            return m41315f(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            return m41316e(String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            return m41315f(str, String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            return m41316e(String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return m41315f(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return m41316e(String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            return m41315f(str, String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            return m41316e(String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            return m41315f(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            return m41316e(String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            return m41315f(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            return m41316e(String.valueOf(j));
        }
    }

    public static <T> T firstNonNull(@CheckForNull T t, @CheckForNull T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
