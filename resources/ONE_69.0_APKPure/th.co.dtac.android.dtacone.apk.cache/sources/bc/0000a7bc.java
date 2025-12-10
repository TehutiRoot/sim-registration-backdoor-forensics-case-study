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
        public final String f52769a;

        /* renamed from: b */
        public final C7420b f52770b;

        /* renamed from: c */
        public C7420b f52771c;

        /* renamed from: d */
        public boolean f52772d;

        /* renamed from: e */
        public boolean f52773e;

        /* renamed from: com.google.common.base.MoreObjects$ToStringHelper$a */
        /* loaded from: classes4.dex */
        public static final class C7419a extends C7420b {
            public C7419a() {
            }
        }

        /* renamed from: com.google.common.base.MoreObjects$ToStringHelper$b */
        /* loaded from: classes4.dex */
        public static class C7420b {

            /* renamed from: a */
            public String f52774a;

            /* renamed from: b */
            public Object f52775b;

            /* renamed from: c */
            public C7420b f52776c;
        }

        /* renamed from: g */
        public static boolean m41301g(Object obj) {
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
        public final C7420b m41307a() {
            C7420b c7420b = new C7420b();
            this.f52771c.f52776c = c7420b;
            this.f52771c = c7420b;
            return c7420b;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @CheckForNull Object obj) {
            return m41305c(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@CheckForNull Object obj) {
            return m41306b(obj);
        }

        /* renamed from: b */
        public final ToStringHelper m41306b(Object obj) {
            m41307a().f52775b = obj;
            return this;
        }

        /* renamed from: c */
        public final ToStringHelper m41305c(String str, Object obj) {
            C7420b m41307a = m41307a();
            m41307a.f52775b = obj;
            m41307a.f52774a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        /* renamed from: d */
        public final C7419a m41304d() {
            C7419a c7419a = new C7419a();
            this.f52771c.f52776c = c7419a;
            this.f52771c = c7419a;
            return c7419a;
        }

        /* renamed from: e */
        public final ToStringHelper m41303e(Object obj) {
            m41304d().f52775b = obj;
            return this;
        }

        /* renamed from: f */
        public final ToStringHelper m41302f(String str, Object obj) {
            C7419a m41304d = m41304d();
            m41304d.f52775b = obj;
            m41304d.f52774a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.f52772d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f52772d;
            boolean z2 = this.f52773e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52769a);
            sb.append('{');
            String str = "";
            for (C7420b c7420b = this.f52770b.f52776c; c7420b != null; c7420b = c7420b.f52776c) {
                Object obj = c7420b.f52775b;
                if (!(c7420b instanceof C7419a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m41301g(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c7420b.f52774a;
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
            C7420b c7420b = new C7420b();
            this.f52770b = c7420b;
            this.f52771c = c7420b;
            this.f52772d = false;
            this.f52773e = false;
            this.f52769a = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            return m41302f(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            return m41303e(String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            return m41302f(str, String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            return m41303e(String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return m41302f(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return m41303e(String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            return m41302f(str, String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            return m41303e(String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            return m41302f(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            return m41303e(String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            return m41302f(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            return m41303e(String.valueOf(j));
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