package com.google.api.client.util;

import com.google.api.client.util.C7323a;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class GenericData extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: a */
    public Map f52321a;

    /* renamed from: b */
    public final ClassInfo f52322b;

    /* loaded from: classes4.dex */
    public enum Flags {
        IGNORE_CASE
    }

    /* renamed from: com.google.api.client.util.GenericData$a */
    /* loaded from: classes4.dex */
    public final class C7313a implements Iterator {

        /* renamed from: a */
        public boolean f52323a;

        /* renamed from: b */
        public final Iterator f52324b;

        /* renamed from: c */
        public final Iterator f52325c;

        public C7313a(C7323a.C7326c c7326c) {
            this.f52324b = c7326c.iterator();
            this.f52325c = GenericData.this.f52321a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (!this.f52323a) {
                if (this.f52324b.hasNext()) {
                    return (Map.Entry) this.f52324b.next();
                }
                this.f52323a = true;
            }
            return (Map.Entry) this.f52325c.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f52324b.hasNext() && !this.f52325c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f52323a) {
                this.f52325c.remove();
            }
            this.f52324b.remove();
        }
    }

    /* renamed from: com.google.api.client.util.GenericData$b */
    /* loaded from: classes4.dex */
    public final class C7314b extends AbstractSet {

        /* renamed from: a */
        public final C7323a.C7326c f52327a;

        public C7314b() {
            this.f52327a = new C7323a(GenericData.this, GenericData.this.f52322b.getIgnoreCase()).entrySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            GenericData.this.f52321a.clear();
            this.f52327a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7313a(this.f52327a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return GenericData.this.f52321a.size() + this.f52327a.size();
        }
    }

    public GenericData() {
        this(EnumSet.noneOf(Flags.class));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new C7314b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof GenericData)) {
            return false;
        }
        GenericData genericData = (GenericData) obj;
        if (super.equals(genericData) && java.util.Objects.equals(this.f52322b, genericData.f52322b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        FieldInfo fieldInfo = this.f52322b.getFieldInfo(str);
        if (fieldInfo != null) {
            return fieldInfo.getValue(this);
        }
        if (this.f52322b.getIgnoreCase()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f52321a.get(str);
    }

    public final ClassInfo getClassInfo() {
        return this.f52322b;
    }

    public final Map<String, Object> getUnknownKeys() {
        return this.f52321a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return java.util.Objects.hash(Integer.valueOf(super.hashCode()), this.f52322b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f52322b.getFieldInfo(str) == null) {
            if (this.f52322b.getIgnoreCase()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.f52321a.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public GenericData set(String str, Object obj) {
        FieldInfo fieldInfo = this.f52322b.getFieldInfo(str);
        if (fieldInfo != null) {
            fieldInfo.setValue(this, obj);
        } else {
            if (this.f52322b.getIgnoreCase()) {
                str = str.toLowerCase(Locale.US);
            }
            this.f52321a.put(str, obj);
        }
        return this;
    }

    public final void setUnknownKeys(Map<String, Object> map) {
        this.f52321a = map;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "GenericData{classInfo=" + this.f52322b.f52299d + ", " + super.toString() + "}";
    }

    public GenericData(EnumSet<Flags> enumSet) {
        this.f52321a = ArrayMap.create();
        this.f52322b = ClassInfo.m41708of(getClass(), enumSet.contains(Flags.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap
    public GenericData clone() {
        try {
            GenericData genericData = (GenericData) super.clone();
            Data.deepCopy(this, genericData);
            genericData.f52321a = (Map) Data.clone(this.f52321a);
            return genericData;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(String str, Object obj) {
        FieldInfo fieldInfo = this.f52322b.getFieldInfo(str);
        if (fieldInfo != null) {
            Object value = fieldInfo.getValue(this);
            fieldInfo.setValue(this, obj);
            return value;
        }
        if (this.f52322b.getIgnoreCase()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f52321a.put(str, obj);
    }
}
