package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class ClassInfo {

    /* renamed from: e */
    public static final ConcurrentMap f52294e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap f52295f = new ConcurrentHashMap();

    /* renamed from: a */
    public final Class f52296a;

    /* renamed from: b */
    public final boolean f52297b;

    /* renamed from: c */
    public final IdentityHashMap f52298c = new IdentityHashMap();

    /* renamed from: d */
    public final List f52299d;

    /* renamed from: com.google.api.client.util.ClassInfo$a */
    /* loaded from: classes4.dex */
    public class C7310a implements Comparator {
        public C7310a() {
            ClassInfo.this = r1;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (Objects.equal(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    public ClassInfo(Class cls, boolean z) {
        boolean z2;
        Field[] declaredFields;
        List unmodifiableList;
        boolean z3;
        String str;
        Field field;
        this.f52296a = cls;
        this.f52297b = z;
        if (z && cls.isEnum()) {
            z2 = false;
        } else {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new C7310a());
        for (Field field2 : cls.getDeclaredFields()) {
            FieldInfo m41700of = FieldInfo.m41700of(field2);
            if (m41700of != null) {
                String name = m41700of.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                FieldInfo fieldInfo = (FieldInfo) this.f52298c.get(name);
                if (fieldInfo == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                if (fieldInfo == null) {
                    field = null;
                } else {
                    field = fieldInfo.getField();
                }
                Preconditions.checkArgument(z3, "two fields have the same %sname <%s>: %s and %s", str, name, field2, field);
                this.f52298c.put(name, m41700of);
                treeSet.add(name);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo m41708of = m41708of(superclass, z);
            treeSet.addAll(m41708of.f52299d);
            for (Map.Entry entry : m41708of.f52298c.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!this.f52298c.containsKey(str2)) {
                    this.f52298c.put(str2, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f52299d = unmodifiableList;
    }

    /* renamed from: of */
    public static ClassInfo m41709of(Class<?> cls) {
        return m41708of(cls, false);
    }

    public Field getField(String str) {
        FieldInfo fieldInfo = getFieldInfo(str);
        if (fieldInfo == null) {
            return null;
        }
        return fieldInfo.getField();
    }

    public FieldInfo getFieldInfo(String str) {
        if (str != null) {
            if (this.f52297b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return (FieldInfo) this.f52298c.get(str);
    }

    public Collection<FieldInfo> getFieldInfos() {
        return Collections.unmodifiableCollection(this.f52298c.values());
    }

    public final boolean getIgnoreCase() {
        return this.f52297b;
    }

    public Collection<String> getNames() {
        return this.f52299d;
    }

    public Class<?> getUnderlyingClass() {
        return this.f52296a;
    }

    public boolean isEnum() {
        return this.f52296a.isEnum();
    }

    /* renamed from: of */
    public static ClassInfo m41708of(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap concurrentMap = z ? f52295f : f52294e;
        ClassInfo classInfo = (ClassInfo) concurrentMap.get(cls);
        if (classInfo == null) {
            ClassInfo classInfo2 = new ClassInfo(cls, z);
            ClassInfo classInfo3 = (ClassInfo) concurrentMap.putIfAbsent(cls, classInfo2);
            return classInfo3 == null ? classInfo2 : classInfo3;
        }
        return classInfo;
    }
}
