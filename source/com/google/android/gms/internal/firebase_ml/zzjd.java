package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zzjd {

    /* renamed from: d */
    public static final Map f45911d = new WeakHashMap();

    /* renamed from: a */
    public final boolean f45912a;

    /* renamed from: b */
    public final Field f45913b;

    /* renamed from: c */
    public final String f45914c;

    public zzjd(Field field, String str) {
        String intern;
        this.f45913b = field;
        if (str == null) {
            intern = null;
        } else {
            intern = str.intern();
        }
        this.f45914c = intern;
        this.f45912a = zzix.zza(field.getType());
    }

    /* renamed from: a */
    public static Object m47889a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static zzjd zza(Enum<?> r5) {
        try {
            zzjd zza = zza(r5.getClass().getField(r5.name()));
            Object[] objArr = {r5};
            if (zza != null) {
                return zza;
            }
            throw new IllegalArgumentException(zzmt.zzb("enum constant missing @Value or @NullValue annotation: %s", objArr));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public final Type getGenericType() {
        return this.f45913b.getGenericType();
    }

    public final String getName() {
        return this.f45914c;
    }

    public final boolean isPrimitive() {
        return this.f45912a;
    }

    public final void zzb(Object obj, Object obj2) {
        zza(this.f45913b, obj, obj2);
    }

    public final Object zzh(Object obj) {
        return m47889a(this.f45913b, obj);
    }

    public final Field zzig() {
        return this.f45913b;
    }

    public final boolean zzih() {
        return Modifier.isFinal(this.f45913b.getModifiers());
    }

    public final <T extends Enum<T>> T zzii() {
        return (T) Enum.valueOf(this.f45913b.getDeclaringClass(), this.f45913b.getName());
    }

    public static zzjd zza(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        Map map = f45911d;
        synchronized (map) {
            try {
                zzjd zzjdVar = (zzjd) map.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (zzjdVar == null) {
                    if (!isEnumConstant) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                        }
                    }
                    if (isEnumConstant) {
                        zzjx zzjxVar = (zzjx) field.getAnnotation(zzjx.class);
                        if (zzjxVar != null) {
                            str = zzjxVar.value();
                        } else if (((zzjn) field.getAnnotation(zzjn.class)) == null) {
                            return null;
                        }
                    } else {
                        zzjg zzjgVar = (zzjg) field.getAnnotation(zzjg.class);
                        if (zzjgVar == null) {
                            return null;
                        }
                        str = zzjgVar.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(str)) {
                        str = field.getName();
                    }
                    zzjdVar = new zzjd(field, str);
                    map.put(field, zzjdVar);
                }
                return zzjdVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zza(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object m47889a = m47889a(field, obj);
            if (obj2 == null) {
                if (m47889a == null) {
                    return;
                }
            } else if (obj2.equals(m47889a)) {
                return;
            }
            String valueOf = String.valueOf(m47889a);
            String valueOf2 = String.valueOf(obj2);
            String name = field.getName();
            String name2 = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 48 + valueOf2.length() + String.valueOf(name).length() + name2.length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(name);
            sb.append(" field in ");
            sb.append(name2);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        } catch (SecurityException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
