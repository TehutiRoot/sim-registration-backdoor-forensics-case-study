package com.google.api.client.util;

/* loaded from: classes4.dex */
public final class Objects {

    /* loaded from: classes4.dex */
    public static final class ToStringHelper {

        /* renamed from: a */
        public final String f52341a;

        /* renamed from: b */
        public C7316a f52342b;

        /* renamed from: c */
        public C7316a f52343c;

        /* renamed from: d */
        public boolean f52344d;

        /* renamed from: com.google.api.client.util.Objects$ToStringHelper$a */
        /* loaded from: classes4.dex */
        public static final class C7316a {

            /* renamed from: a */
            public String f52345a;

            /* renamed from: b */
            public Object f52346b;

            /* renamed from: c */
            public C7316a f52347c;

            public C7316a() {
            }
        }

        public ToStringHelper(String str) {
            C7316a c7316a = new C7316a();
            this.f52342b = c7316a;
            this.f52343c = c7316a;
            this.f52341a = str;
        }

        /* renamed from: a */
        public final C7316a m41696a() {
            C7316a c7316a = new C7316a();
            this.f52343c.f52347c = c7316a;
            this.f52343c = c7316a;
            return c7316a;
        }

        public ToStringHelper add(String str, Object obj) {
            return m41695b(str, obj);
        }

        /* renamed from: b */
        public final ToStringHelper m41695b(String str, Object obj) {
            C7316a m41696a = m41696a();
            m41696a.f52346b = obj;
            m41696a.f52345a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper omitNullValues() {
            this.f52344d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f52344d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52341a);
            sb.append('{');
            String str = "";
            for (C7316a c7316a = this.f52342b.f52347c; c7316a != null; c7316a = c7316a.f52347c) {
                if (!z || c7316a.f52346b != null) {
                    sb.append(str);
                    String str2 = c7316a.f52345a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(c7316a.f52346b);
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
