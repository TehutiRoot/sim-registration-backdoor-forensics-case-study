package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class zziv {

    /* renamed from: e */
    public static final ConcurrentMap f45892e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap f45893f = new ConcurrentHashMap();

    /* renamed from: a */
    public final Class f45894a;

    /* renamed from: b */
    public final boolean f45895b;

    /* renamed from: c */
    public final IdentityHashMap f45896c = new IdentityHashMap();

    /* renamed from: d */
    public final List f45897d;

    public zziv(Class cls, boolean z) {
        boolean z2;
        Field[] declaredFields;
        List unmodifiableList;
        boolean z3;
        String str;
        Field zzig;
        this.f45894a = cls;
        this.f45895b = z;
        if (z && cls.isEnum()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        zzml.checkArgument(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new C19446cz2(this));
        for (Field field : cls.getDeclaredFields()) {
            zzjd zza = zzjd.zza(field);
            if (zza != null) {
                String name = zza.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                zzjd zzjdVar = (zzjd) this.f45896c.get(name);
                if (zzjdVar == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                if (zzjdVar == null) {
                    zzig = null;
                } else {
                    zzig = zzjdVar.zzig();
                }
                Object[] objArr = {str, name, field, zzig};
                if (z3) {
                    this.f45896c.put(name, zza);
                    treeSet.add(name);
                } else {
                    throw new IllegalArgumentException(zzmt.zzb("two fields have the same %sname <%s>: %s and %s", objArr));
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            zziv zza2 = zza(superclass, z);
            treeSet.addAll(zza2.f45897d);
            for (Map.Entry entry : zza2.f45896c.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!this.f45896c.containsKey(str2)) {
                    this.f45896c.put(str2, (zzjd) entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f45897d = unmodifiableList;
    }

    public static zziv zza(Class<?> cls, boolean z) {
        ConcurrentMap concurrentMap;
        if (cls == null) {
            return null;
        }
        if (z) {
            concurrentMap = f45893f;
        } else {
            concurrentMap = f45892e;
        }
        zziv zzivVar = (zziv) concurrentMap.get(cls);
        if (zzivVar == null) {
            zziv zzivVar2 = new zziv(cls, z);
            zziv zzivVar3 = (zziv) concurrentMap.putIfAbsent(cls, zzivVar2);
            if (zzivVar3 == null) {
                return zzivVar2;
            }
            return zzivVar3;
        }
        return zzivVar;
    }

    public static zziv zzc(Class<?> cls) {
        return zza(cls, false);
    }

    public final boolean isEnum() {
        return this.f45894a.isEnum();
    }

    public final zzjd zzao(String str) {
        if (str != null) {
            if (this.f45895b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return (zzjd) this.f45896c.get(str);
    }

    public final boolean zzie() {
        return this.f45895b;
    }

    public final Collection<zzjd> zzif() {
        return Collections.unmodifiableCollection(this.f45896c.values());
    }
}
