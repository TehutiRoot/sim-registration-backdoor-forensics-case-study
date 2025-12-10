package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReadOnlyClassToSerializerMap {

    /* renamed from: a */
    public final C6130a[] f43408a;

    /* renamed from: b */
    public final int f43409b;

    /* renamed from: c */
    public final int f43410c;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$a */
    /* loaded from: classes3.dex */
    public static final class C6130a {

        /* renamed from: a */
        public final JsonSerializer f43411a;

        /* renamed from: b */
        public final C6130a f43412b;

        /* renamed from: c */
        public final Class f43413c;

        /* renamed from: d */
        public final JavaType f43414d;

        /* renamed from: e */
        public final boolean f43415e;

        public C6130a(C6130a c6130a, TypeKey typeKey, JsonSerializer jsonSerializer) {
            this.f43412b = c6130a;
            this.f43411a = jsonSerializer;
            this.f43415e = typeKey.isTyped();
            this.f43413c = typeKey.getRawType();
            this.f43414d = typeKey.getType();
        }

        /* renamed from: a */
        public boolean m49401a(JavaType javaType) {
            if (this.f43415e && javaType.equals(this.f43414d)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m49400b(Class cls) {
            if (this.f43413c == cls && this.f43415e) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean m49399c(JavaType javaType) {
            if (!this.f43415e && javaType.equals(this.f43414d)) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean m49398d(Class cls) {
            if (this.f43413c == cls && !this.f43415e) {
                return true;
            }
            return false;
        }
    }

    public ReadOnlyClassToSerializerMap(Map<TypeKey, JsonSerializer<Object>> map) {
        int m49402a = m49402a(map.size());
        this.f43409b = m49402a;
        this.f43410c = m49402a - 1;
        C6130a[] c6130aArr = new C6130a[m49402a];
        for (Map.Entry<TypeKey, JsonSerializer<Object>> entry : map.entrySet()) {
            TypeKey key = entry.getKey();
            int hashCode = key.hashCode() & this.f43410c;
            c6130aArr[hashCode] = new C6130a(c6130aArr[hashCode], key, entry.getValue());
        }
        this.f43408a = c6130aArr;
    }

    /* renamed from: a */
    public static final int m49402a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap<TypeKey, JsonSerializer<Object>> hashMap) {
        return new ReadOnlyClassToSerializerMap(hashMap);
    }

    public int size() {
        return this.f43409b;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        C6130a c6130a = this.f43408a[TypeKey.typedHash(javaType) & this.f43410c];
        if (c6130a == null) {
            return null;
        }
        if (c6130a.m49401a(javaType)) {
            return c6130a.f43411a;
        }
        do {
            c6130a = c6130a.f43412b;
            if (c6130a == null) {
                return null;
            }
        } while (!c6130a.m49401a(javaType));
        return c6130a.f43411a;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        C6130a c6130a = this.f43408a[TypeKey.untypedHash(javaType) & this.f43410c];
        if (c6130a == null) {
            return null;
        }
        if (c6130a.m49399c(javaType)) {
            return c6130a.f43411a;
        }
        do {
            c6130a = c6130a.f43412b;
            if (c6130a == null) {
                return null;
            }
        } while (!c6130a.m49399c(javaType));
        return c6130a.f43411a;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        C6130a c6130a = this.f43408a[TypeKey.typedHash(cls) & this.f43410c];
        if (c6130a == null) {
            return null;
        }
        if (c6130a.m49400b(cls)) {
            return c6130a.f43411a;
        }
        do {
            c6130a = c6130a.f43412b;
            if (c6130a == null) {
                return null;
            }
        } while (!c6130a.m49400b(cls));
        return c6130a.f43411a;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        C6130a c6130a = this.f43408a[TypeKey.untypedHash(cls) & this.f43410c];
        if (c6130a == null) {
            return null;
        }
        if (c6130a.m49398d(cls)) {
            return c6130a.f43411a;
        }
        do {
            c6130a = c6130a.f43412b;
            if (c6130a == null) {
                return null;
            }
        } while (!c6130a.m49398d(cls));
        return c6130a.f43411a;
    }
}
