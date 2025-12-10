package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ArrayValueMap {

    /* renamed from: a */
    public final Map f52294a = ArrayMap.create();

    /* renamed from: b */
    public final Map f52295b = ArrayMap.create();

    /* renamed from: c */
    public final Object f52296c;

    /* renamed from: com.google.api.client.util.ArrayValueMap$a */
    /* loaded from: classes4.dex */
    public static class C7295a {

        /* renamed from: a */
        public final Class f52297a;

        /* renamed from: b */
        public final ArrayList f52298b = new ArrayList();

        public C7295a(Class cls) {
            this.f52297a = cls;
        }

        /* renamed from: a */
        public void m41698a(Class cls, Object obj) {
            boolean z;
            if (cls == this.f52297a) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f52298b.add(obj);
        }

        /* renamed from: b */
        public Object m41697b() {
            return Types.toArray(this.f52298b, this.f52297a);
        }
    }

    public ArrayValueMap(Object obj) {
        this.f52296c = obj;
    }

    public void put(Field field, Class<?> cls, Object obj) {
        C7295a c7295a = (C7295a) this.f52295b.get(field);
        if (c7295a == null) {
            c7295a = new C7295a(cls);
            this.f52295b.put(field, c7295a);
        }
        c7295a.m41698a(cls, obj);
    }

    public void setValues() {
        for (Map.Entry entry : this.f52294a.entrySet()) {
            ((Map) this.f52296c).put(entry.getKey(), ((C7295a) entry.getValue()).m41697b());
        }
        for (Map.Entry entry2 : this.f52295b.entrySet()) {
            FieldInfo.setFieldValue((Field) entry2.getKey(), this.f52296c, ((C7295a) entry2.getValue()).m41697b());
        }
    }

    public void put(String str, Class<?> cls, Object obj) {
        C7295a c7295a = (C7295a) this.f52294a.get(str);
        if (c7295a == null) {
            c7295a = new C7295a(cls);
            this.f52294a.put(str, c7295a);
        }
        c7295a.m41698a(cls, obj);
    }
}