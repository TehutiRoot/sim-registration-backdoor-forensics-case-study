package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzix {

    /* renamed from: a */
    public static final Boolean f45898a;

    /* renamed from: b */
    public static final String f45899b;

    /* renamed from: c */
    public static final Character f45900c;

    /* renamed from: d */
    public static final Byte f45901d;

    /* renamed from: e */
    public static final Short f45902e;

    /* renamed from: f */
    public static final Integer f45903f;

    /* renamed from: g */
    public static final Float f45904g;

    /* renamed from: h */
    public static final Long f45905h;

    /* renamed from: i */
    public static final Double f45906i;

    /* renamed from: j */
    public static final BigInteger f45907j;

    /* renamed from: k */
    public static final BigDecimal f45908k;

    /* renamed from: l */
    public static final zzje f45909l;

    /* renamed from: m */
    public static final ConcurrentHashMap f45910m;

    static {
        Boolean bool = new Boolean(true);
        f45898a = bool;
        String str = new String();
        f45899b = str;
        Character ch2 = new Character((char) 0);
        f45900c = ch2;
        Byte b = new Byte((byte) 0);
        f45901d = b;
        Short sh = new Short((short) 0);
        f45902e = sh;
        Integer num = new Integer(0);
        f45903f = num;
        Float f = new Float(0.0f);
        f45904g = f;
        Long l = new Long(0L);
        f45905h = l;
        Double d = new Double(0.0d);
        f45906i = d;
        BigInteger bigInteger = new BigInteger("0");
        f45907j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f45908k = bigDecimal;
        zzje zzjeVar = new zzje(0L);
        f45909l = zzjeVar;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f45910m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch2);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(zzje.class, zzjeVar);
    }

    public static <T> T clone(T t) {
        T t2;
        if (t != null && !zza(t.getClass())) {
            if (t instanceof zzjf) {
                return (T) ((zzjf) ((zzjf) t).clone());
            }
            Class<?> cls = t.getClass();
            if (cls.isArray()) {
                t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
            } else if (t instanceof zziq) {
                t2 = (T) ((zziq) ((zziq) t).clone());
            } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                zza(array, array);
                return (T) Arrays.asList(array);
            } else {
                t2 = (T) zzjs.zzf((Class<Object>) cls);
            }
            zza(t, t2);
            return t2;
        }
        return t;
    }

    public static boolean isNull(Object obj) {
        if (obj != null && obj == f45910m.get(obj.getClass())) {
            return true;
        }
        return false;
    }

    public static void zza(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        int i = 0;
        zzml.checkArgument(cls == obj2.getClass());
        if (cls.isArray()) {
            zzml.checkArgument(Array.getLength(obj) == Array.getLength(obj2));
            for (Object obj3 : zzjs.zzi(obj)) {
                Array.set(obj2, i, clone(obj3));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(clone(obj4));
            }
        } else {
            boolean isAssignableFrom = zzjf.class.isAssignableFrom(cls);
            if (!isAssignableFrom && Map.class.isAssignableFrom(cls)) {
                if (zziq.class.isAssignableFrom(cls)) {
                    zziq zziqVar = (zziq) obj2;
                    zziq zziqVar2 = (zziq) obj;
                    int size = zziqVar2.size();
                    while (i < size) {
                        zziqVar.set(i, clone(zziqVar2.zzak(i)));
                        i++;
                    }
                    return;
                }
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), clone(entry.getValue()));
                }
                return;
            }
            zziv zzc = isAssignableFrom ? ((zzjf) obj).f45916b : zziv.zzc(cls);
            for (String str : zzc.f45897d) {
                zzjd zzao = zzc.zzao(str);
                if (!zzao.zzih() && (!isAssignableFrom || !zzao.isPrimitive())) {
                    Object zzh = zzao.zzh(obj);
                    if (zzh != null) {
                        zzao.zzb(obj2, clone(zzh));
                    }
                }
            }
        }
    }

    public static Collection<Object> zzb(Type type) {
        Class cls;
        if (type instanceof WildcardType) {
            type = zzjs.zza((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type != null && !(type instanceof GenericArrayType) && (cls == null || (!cls.isArray() && !cls.isAssignableFrom(ArrayList.class)))) {
            if (cls != null) {
                if (cls.isAssignableFrom(HashSet.class)) {
                    return new HashSet();
                }
                if (cls.isAssignableFrom(TreeSet.class)) {
                    return new TreeSet();
                }
                return (Collection) zzjs.zzf((Class<Object>) cls);
            }
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(valueOf.length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T zzd(Class<?> cls) {
        Enum r0;
        int i = 0;
        T t = (T) f45910m.get(cls);
        if (t == null) {
            if (cls.isArray()) {
                Class<?> cls2 = cls;
                do {
                    cls2 = cls2.getComponentType();
                    i++;
                } while (cls2.isArray());
                r0 = Array.newInstance(cls2, new int[i]);
            } else if (cls.isEnum()) {
                zzjd zzao = zziv.zzc(cls).zzao(null);
                Object[] objArr = {cls};
                if (zzao != null) {
                    r0 = zzao.zzii();
                } else {
                    throw new NullPointerException(zzmt.zzb("enum missing constant with @NullValue annotation: %s", objArr));
                }
            } else {
                r0 = zzjs.zzf((Class<Object>) cls);
            }
            T t2 = r0;
            T t3 = (T) f45910m.putIfAbsent(cls, t2);
            if (t3 != null) {
                return t3;
            }
            return t2;
        }
        return t;
    }

    public static Map<String, Object> zze(Class<?> cls) {
        if (cls != null && !cls.isAssignableFrom(zziq.class)) {
            if (cls.isAssignableFrom(TreeMap.class)) {
                return new TreeMap();
            }
            return (Map) zzjs.zzf((Class<Object>) cls);
        }
        return new zziq();
    }

    public static Map<String, Object> zzf(Object obj) {
        if (obj != null && !isNull(obj)) {
            if (obj instanceof Map) {
                return (Map) obj;
            }
            return new C23402zz2(obj, false);
        }
        return Collections.emptyMap();
    }

    public static boolean zzg(Object obj) {
        if (obj != null && !zza(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static boolean zza(Type type) {
        if (type instanceof WildcardType) {
            type = zzjs.zza((WildcardType) type);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == zzje.class || cls == Boolean.class;
        }
        return false;
    }

    public static Object zza(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls != Character.class && cls != Character.TYPE) {
                if (cls != Boolean.class && cls != Boolean.TYPE) {
                    if (cls != Byte.class && cls != Byte.TYPE) {
                        if (cls != Short.class && cls != Short.TYPE) {
                            if (cls != Integer.class && cls != Integer.TYPE) {
                                if (cls != Long.class && cls != Long.TYPE) {
                                    if (cls != Float.class && cls != Float.TYPE) {
                                        if (cls != Double.class && cls != Double.TYPE) {
                                            if (cls == zzje.class) {
                                                return zzje.zzap(str);
                                            }
                                            if (cls == BigInteger.class) {
                                                return new BigInteger(str);
                                            }
                                            if (cls == BigDecimal.class) {
                                                return new BigDecimal(str);
                                            }
                                            if (cls.isEnum()) {
                                                if (zziv.zzc(cls).f45897d.contains(str)) {
                                                    return zziv.zzc(cls).zzao(str).zzii();
                                                }
                                                throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", str));
                                            }
                                        } else {
                                            return Double.valueOf(str);
                                        }
                                    } else {
                                        return Float.valueOf(str);
                                    }
                                } else {
                                    return Long.valueOf(str);
                                }
                            } else {
                                return Integer.valueOf(str);
                            }
                        } else {
                            return Short.valueOf(str);
                        }
                    } else {
                        return Byte.valueOf(str);
                    }
                } else {
                    return Boolean.valueOf(str);
                }
            } else if (str.length() == 1) {
                return Character.valueOf(str.charAt(0));
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Type zza(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = zzjs.zza((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type zza = zzjs.zza(list, (TypeVariable) type);
            if (zza != null) {
                type = zza;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
