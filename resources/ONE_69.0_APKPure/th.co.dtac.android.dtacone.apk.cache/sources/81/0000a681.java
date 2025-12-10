package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.util.a */
/* loaded from: classes4.dex */
public final class C7312a extends AbstractMap {

    /* renamed from: a */
    public final Object f52369a;

    /* renamed from: b */
    public final ClassInfo f52370b;

    /* renamed from: com.google.api.client.util.a$a */
    /* loaded from: classes4.dex */
    public final class C7313a implements Map.Entry {

        /* renamed from: a */
        public Object f52371a;

        /* renamed from: b */
        public final FieldInfo f52372b;

        public C7313a(FieldInfo fieldInfo, Object obj) {
            this.f52372b = fieldInfo;
            this.f52371a = Preconditions.checkNotNull(obj);
        }

        @Override // java.util.Map.Entry
        /* renamed from: a */
        public String getKey() {
            String name = this.f52372b.getName();
            if (C7312a.this.f52370b.getIgnoreCase()) {
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
            return this.f52371a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f52371a;
            this.f52371a = Preconditions.checkNotNull(obj);
            this.f52372b.setValue(C7312a.this.f52369a, obj);
            return obj2;
        }
    }

    /* renamed from: com.google.api.client.util.a$b */
    /* loaded from: classes4.dex */
    public final class C7314b implements Iterator {

        /* renamed from: a */
        public int f52374a = -1;

        /* renamed from: b */
        public FieldInfo f52375b;

        /* renamed from: c */
        public Object f52376c;

        /* renamed from: d */
        public boolean f52377d;

        /* renamed from: e */
        public boolean f52378e;

        /* renamed from: f */
        public FieldInfo f52379f;

        public C7314b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                FieldInfo fieldInfo = this.f52375b;
                this.f52379f = fieldInfo;
                Object obj = this.f52376c;
                this.f52378e = false;
                this.f52377d = false;
                this.f52375b = null;
                this.f52376c = null;
                return new C7313a(fieldInfo, obj);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f52378e) {
                this.f52378e = true;
                this.f52376c = null;
                while (this.f52376c == null) {
                    int i = this.f52374a + 1;
                    this.f52374a = i;
                    if (i >= C7312a.this.f52370b.f52311d.size()) {
                        break;
                    }
                    ClassInfo classInfo = C7312a.this.f52370b;
                    FieldInfo fieldInfo = classInfo.getFieldInfo((String) classInfo.f52311d.get(this.f52374a));
                    this.f52375b = fieldInfo;
                    this.f52376c = fieldInfo.getValue(C7312a.this.f52369a);
                }
            }
            if (this.f52376c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f52379f != null && !this.f52377d) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f52377d = true;
            this.f52379f.setValue(C7312a.this.f52369a, null);
        }
    }

    /* renamed from: com.google.api.client.util.a$c */
    /* loaded from: classes4.dex */
    public final class C7315c extends AbstractSet {
        public C7315c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public C7314b iterator() {
            return new C7314b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            for (String str : C7312a.this.f52370b.f52311d) {
                C7312a.this.f52370b.getFieldInfo(str).setValue(C7312a.this.f52369a, null);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            for (String str : C7312a.this.f52370b.f52311d) {
                if (C7312a.this.f52370b.getFieldInfo(str).getValue(C7312a.this.f52369a) != null) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (String str : C7312a.this.f52370b.f52311d) {
                if (C7312a.this.f52370b.getFieldInfo(str).getValue(C7312a.this.f52369a) != null) {
                    i++;
                }
            }
            return i;
        }
    }

    public C7312a(Object obj, boolean z) {
        this.f52369a = obj;
        this.f52370b = ClassInfo.m41695of(obj.getClass(), z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public C7315c entrySet() {
        return new C7315c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public Object put(String str, Object obj) {
        FieldInfo fieldInfo = this.f52370b.getFieldInfo(str);
        Preconditions.checkNotNull(fieldInfo, "no field of key " + str);
        Object value = fieldInfo.getValue(this.f52369a);
        fieldInfo.setValue(this.f52369a, Preconditions.checkNotNull(obj));
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
        if (!(obj instanceof String) || (fieldInfo = this.f52370b.getFieldInfo((String) obj)) == null) {
            return null;
        }
        return fieldInfo.getValue(this.f52369a);
    }
}