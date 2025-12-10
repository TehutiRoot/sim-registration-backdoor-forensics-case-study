package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ArrayValueMap {

    /* renamed from: a */
    public final Map f52282a = ArrayMap.create();

    /* renamed from: b */
    public final Map f52283b = ArrayMap.create();

    /* renamed from: c */
    public final Object f52284c;

    /* renamed from: com.google.api.client.util.ArrayValueMap$a */
    /* loaded from: classes4.dex */
    public static class C7306a {

        /* renamed from: a */
        public final Class f52285a;

        /* renamed from: b */
        public final ArrayList f52286b = new ArrayList();

        public C7306a(Class cls) {
            this.f52285a = cls;
        }

        /* renamed from: a */
        public void m41711a(Class cls, Object obj) {
            boolean z;
            if (cls == this.f52285a) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f52286b.add(obj);
        }

        /* renamed from: b */
        public Object m41710b() {
            return Types.toArray(this.f52286b, this.f52285a);
        }
    }

    public ArrayValueMap(Object obj) {
        this.f52284c = obj;
    }

    public void put(Field field, Class<?> cls, Object obj) {
        C7306a c7306a = (C7306a) this.f52283b.get(field);
        if (c7306a == null) {
            c7306a = new C7306a(cls);
            this.f52283b.put(field, c7306a);
        }
        c7306a.m41711a(cls, obj);
    }

    public void setValues() {
        for (Map.Entry entry : this.f52282a.entrySet()) {
            ((Map) this.f52284c).put(entry.getKey(), ((C7306a) entry.getValue()).m41710b());
        }
        for (Map.Entry entry2 : this.f52283b.entrySet()) {
            FieldInfo.setFieldValue((Field) entry2.getKey(), this.f52284c, ((C7306a) entry2.getValue()).m41710b());
        }
    }

    public void put(String str, Class<?> cls, Object obj) {
        C7306a c7306a = (C7306a) this.f52282a.get(str);
        if (c7306a == null) {
            c7306a = new C7306a(cls);
            this.f52282a.put(str, c7306a);
        }
        c7306a.m41711a(cls, obj);
    }
}
