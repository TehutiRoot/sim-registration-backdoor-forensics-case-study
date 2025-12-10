package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.bson.codecs.pojo.f */
/* loaded from: classes6.dex */
public final class C12928f {

    /* renamed from: a */
    public final Map f76011a;

    /* renamed from: org.bson.codecs.pojo.f$b */
    /* loaded from: classes6.dex */
    public static final class C12930b {

        /* renamed from: a */
        public final Map f76012a;

        /* renamed from: a */
        public C12930b m24388a(int i) {
            this.f76012a.put(-1, Integer.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public C12930b m24387b(int i, int i2) {
            this.f76012a.put(Integer.valueOf(i), Integer.valueOf(i2));
            return this;
        }

        /* renamed from: c */
        public C12928f m24386c() {
            if (this.f76012a.size() > 1 && this.f76012a.containsKey(-1)) {
                throw new IllegalStateException("You cannot have a generic field that also has type parameters.");
            }
            return new C12928f(this.f76012a);
        }

        public C12930b() {
            this.f76012a = new HashMap();
        }
    }

    /* renamed from: a */
    public static C12930b m24391a() {
        return new C12930b();
    }

    /* renamed from: b */
    public Map m24390b() {
        return this.f76011a;
    }

    /* renamed from: c */
    public boolean m24389c() {
        return !this.f76011a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12928f.class == obj.getClass() && m24390b().equals(((C12928f) obj).m24390b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m24390b().hashCode();
    }

    public String toString() {
        return "TypeParameterMap{fieldToClassParamIndexMap=" + this.f76011a + "}";
    }

    public C12928f(Map map) {
        this.f76011a = Collections.unmodifiableMap(map);
    }
}