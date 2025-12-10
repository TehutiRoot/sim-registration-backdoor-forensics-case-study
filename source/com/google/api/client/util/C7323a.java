package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.util.a */
/* loaded from: classes4.dex */
public final class C7323a extends AbstractMap {

    /* renamed from: a */
    public final Object f52357a;

    /* renamed from: b */
    public final ClassInfo f52358b;

    /* renamed from: com.google.api.client.util.a$a */
    /* loaded from: classes4.dex */
    public final class C7324a implements Map.Entry {

        /* renamed from: a */
        public Object f52359a;

        /* renamed from: b */
        public final FieldInfo f52360b;

        public C7324a(FieldInfo fieldInfo, Object obj) {
            C7323a.this = r1;
            this.f52360b = fieldInfo;
            this.f52359a = Preconditions.checkNotNull(obj);
        }

        @Override // java.util.Map.Entry
        /* renamed from: a */
        public String getKey() {
            String name = this.f52360b.getName();
            if (C7323a.this.f52358b.getIgnoreCase()) {
                return name.toLowerCase(Locale.US);
            }
            return name;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey().equals(entry.getKey()) && getValue().equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f52359a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f52359a;
            this.f52359a = Preconditions.checkNotNull(obj);
            this.f52360b.setValue(C7323a.this.f52357a, obj);
            return obj2;
        }
    }

    /* renamed from: com.google.api.client.util.a$b */
    /* loaded from: classes4.dex */
    public final class C7325b implements Iterator {

        /* renamed from: a */
        public int f52362a = -1;

        /* renamed from: b */
        public FieldInfo f52363b;

        /* renamed from: c */
        public Object f52364c;

        /* renamed from: d */
        public boolean f52365d;

        /* renamed from: e */
        public boolean f52366e;

        /* renamed from: f */
        public FieldInfo f52367f;

        public C7325b() {
            C7323a.this = r1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                FieldInfo fieldInfo = this.f52363b;
                this.f52367f = fieldInfo;
                Object obj = this.f52364c;
                this.f52366e = false;
                this.f52365d = false;
                this.f52363b = null;
                this.f52364c = null;
                return new C7324a(fieldInfo, obj);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f52366e) {
                this.f52366e = true;
                this.f52364c = null;
                while (this.f52364c == null) {
                    int i = this.f52362a + 1;
                    this.f52362a = i;
                    if (i >= C7323a.this.f52358b.f52299d.size()) {
                        break;
                    }
                    ClassInfo classInfo = C7323a.this.f52358b;
                    FieldInfo fieldInfo = classInfo.getFieldInfo((String) classInfo.f52299d.get(this.f52362a));
                    this.f52363b = fieldInfo;
                    this.f52364c = fieldInfo.getValue(C7323a.this.f52357a);
                }
            }
            if (this.f52364c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f52367f != null && !this.f52365d) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f52365d = true;
            this.f52367f.setValue(C7323a.this.f52357a, null);
        }
    }

    /* renamed from: com.google.api.client.util.a$c */
    /* loaded from: classes4.dex */
    public final class C7326c extends AbstractSet {
        public C7326c() {
            C7323a.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public C7325b iterator() {
            return new C7325b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            for (String str : C7323a.this.f52358b.f52299d) {
                C7323a.this.f52358b.getFieldInfo(str).setValue(C7323a.this.f52357a, null);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            for (String str : C7323a.this.f52358b.f52299d) {
                if (C7323a.this.f52358b.getFieldInfo(str).getValue(C7323a.this.f52357a) != null) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (String str : C7323a.this.f52358b.f52299d) {
                if (C7323a.this.f52358b.getFieldInfo(str).getValue(C7323a.this.f52357a) != null) {
                    i++;
                }
            }
            return i;
        }
    }

    public C7323a(Object obj, boolean z) {
        this.f52357a = obj;
        this.f52358b = ClassInfo.m41708of(obj.getClass(), z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public C7326c entrySet() {
        return new C7326c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public Object put(String str, Object obj) {
        FieldInfo fieldInfo = this.f52358b.getFieldInfo(str);
        Preconditions.checkNotNull(fieldInfo, "no field of key " + str);
        Object value = fieldInfo.getValue(this.f52357a);
        fieldInfo.setValue(this.f52357a, Preconditions.checkNotNull(obj));
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        FieldInfo fieldInfo;
        if (!(obj instanceof String) || (fieldInfo = this.f52358b.getFieldInfo((String) obj)) == null) {
            return null;
        }
        return fieldInfo.getValue(this.f52357a);
    }
}
