package com.google.api.client.util;

/* loaded from: classes4.dex */
public final class Objects {

    /* loaded from: classes4.dex */
    public static final class ToStringHelper {

        /* renamed from: a */
        public final String f52353a;

        /* renamed from: b */
        public C7305a f52354b;

        /* renamed from: c */
        public C7305a f52355c;

        /* renamed from: d */
        public boolean f52356d;

        /* renamed from: com.google.api.client.util.Objects$ToStringHelper$a */
        /* loaded from: classes4.dex */
        public static final class C7305a {

            /* renamed from: a */
            public String f52357a;

            /* renamed from: b */
            public Object f52358b;

            /* renamed from: c */
            public C7305a f52359c;

            public C7305a() {
            }
        }

        public ToStringHelper(String str) {
            C7305a c7305a = new C7305a();
            this.f52354b = c7305a;
            this.f52355c = c7305a;
            this.f52353a = str;
        }

        /* renamed from: a */
        public final C7305a m41683a() {
            C7305a c7305a = new C7305a();
            this.f52355c.f52359c = c7305a;
            this.f52355c = c7305a;
            return c7305a;
        }

        public ToStringHelper add(String str, Object obj) {
            return m41682b(str, obj);
        }

        /* renamed from: b */
        public final ToStringHelper m41682b(String str, Object obj) {
            C7305a m41683a = m41683a();
            m41683a.f52358b = obj;
            m41683a.f52357a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper omitNullValues() {
            this.f52356d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f52356d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52353a);
            sb.append('{');
            String str = "";
            for (C7305a c7305a = this.f52354b.f52359c; c7305a != null; c7305a = c7305a.f52359c) {
                if (!z || c7305a.f52358b != null) {
                    sb.append(str);
                    String str2 = c7305a.f52357a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(c7305a.f52358b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return com.google.common.base.Objects.equal(obj, obj2);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}