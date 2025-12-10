package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.bson.codecs.pojo.f */
/* loaded from: classes6.dex */
public final class C12928f {

    /* renamed from: a */
    public final Map f75927a;

    /* renamed from: org.bson.codecs.pojo.f$b */
    /* loaded from: classes6.dex */
    public static final class C12930b {

        /* renamed from: a */
        public final Map f75928a;

        /* renamed from: a */
        public C12930b m24199a(int i) {
            this.f75928a.put(-1, Integer.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public C12930b m24198b(int i, int i2) {
            this.f75928a.put(Integer.valueOf(i), Integer.valueOf(i2));
            return this;
        }

        /* renamed from: c */
        public C12928f m24197c() {
            if (this.f75928a.size() > 1 && this.f75928a.containsKey(-1)) {
                throw new IllegalStateException("You cannot have a generic field that also has type parameters.");
            }
            return new C12928f(this.f75928a);
        }

        public C12930b() {
            this.f75928a = new HashMap();
        }
    }

    /* renamed from: a */
    public static C12930b m24202a() {
        return new C12930b();
    }

    /* renamed from: b */
    public Map m24201b() {
        return this.f75927a;
    }

    /* renamed from: c */
    public boolean m24200c() {
        return !this.f75927a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12928f.class == obj.getClass() && m24201b().equals(((C12928f) obj).m24201b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m24201b().hashCode();
    }

    public String toString() {
        return "TypeParameterMap{fieldToClassParamIndexMap=" + this.f75927a + "}";
    }

    public C12928f(Map map) {
        this.f75927a = Collections.unmodifiableMap(map);
    }
}
