package io.realm;

import io.realm.RealmMap;
import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmDictionary<V> extends RealmMap<String, V> {
    public RealmDictionary() {
    }

    /* renamed from: c */
    public static C1233RI m29659c(Class cls, BaseRealm baseRealm, OsMap osMap) {
        AbstractC11417l c11295h;
        C22761wF1 c22761wF1 = new C22761wF1(baseRealm, osMap, String.class, cls);
        if (cls == RealmAny.class) {
            c11295h = new C11481t(baseRealm, osMap, c22761wF1);
        } else if (cls == Long.class) {
            c11295h = new C11295h(Long.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.LONG);
        } else if (cls == Float.class) {
            c11295h = new C11295h(Float.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.FLOAT);
        } else if (cls == Double.class) {
            c11295h = new C11295h(Double.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.DOUBLE);
        } else if (cls == String.class) {
            c11295h = new C11295h(String.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.STRING);
        } else if (cls == Boolean.class) {
            c11295h = new C11295h(Boolean.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.BOOLEAN);
        } else if (cls == Date.class) {
            c11295h = new C11295h(Date.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.DATE);
        } else if (cls == Decimal128.class) {
            c11295h = new C11295h(Decimal128.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.DECIMAL128);
        } else if (cls == Integer.class) {
            c11295h = new C11414k(baseRealm, osMap, c22761wF1);
        } else if (cls == Short.class) {
            c11295h = new C11488w(baseRealm, osMap, c22761wF1);
        } else if (cls == Byte.class) {
            c11295h = new C11290c(baseRealm, osMap, c22761wF1);
        } else if (cls == byte[].class) {
            c11295h = new C11295h(byte[].class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.BINARY, new C10313gb());
        } else if (cls == ObjectId.class) {
            c11295h = new C11295h(ObjectId.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.OBJECT_ID);
        } else if (cls == UUID.class) {
            c11295h = new C11295h(UUID.class, baseRealm, osMap, c22761wF1, RealmMapEntrySet.IteratorType.UUID);
        } else {
            throw new IllegalArgumentException("Only Maps of RealmAny or one of the types that can be boxed inside RealmAny can be used.");
        }
        return new C1233RI(baseRealm, c11295h, c22761wF1);
    }

    /* renamed from: e */
    public static C1233RI m29658e(String str, BaseRealm baseRealm, OsMap osMap) {
        AbstractC11417l c11487v;
        if (str.equals(RealmAny.class.getCanonicalName())) {
            c11487v = new C11481t(baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, RealmAny.class));
        } else if (str.equals(Long.class.getCanonicalName())) {
            c11487v = new C11295h(Long.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Long.class), RealmMapEntrySet.IteratorType.LONG);
        } else if (str.equals(Float.class.getCanonicalName())) {
            c11487v = new C11295h(Float.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Float.class), RealmMapEntrySet.IteratorType.FLOAT);
        } else if (str.equals(Double.class.getCanonicalName())) {
            c11487v = new C11295h(Double.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Double.class), RealmMapEntrySet.IteratorType.DOUBLE);
        } else if (str.equals(String.class.getCanonicalName())) {
            c11487v = new C11295h(String.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, String.class), RealmMapEntrySet.IteratorType.STRING);
        } else if (str.equals(Boolean.class.getCanonicalName())) {
            c11487v = new C11295h(Boolean.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Boolean.class), RealmMapEntrySet.IteratorType.BOOLEAN);
        } else if (str.equals(Date.class.getCanonicalName())) {
            c11487v = new C11295h(Date.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Date.class), RealmMapEntrySet.IteratorType.DATE);
        } else if (str.equals(Decimal128.class.getCanonicalName())) {
            c11487v = new C11295h(Decimal128.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Decimal128.class), RealmMapEntrySet.IteratorType.DECIMAL128);
        } else if (str.equals(Integer.class.getCanonicalName())) {
            c11487v = new C11414k(baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Integer.class));
        } else if (str.equals(Short.class.getCanonicalName())) {
            c11487v = new C11488w(baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Short.class));
        } else if (str.equals(Byte.class.getCanonicalName())) {
            c11487v = new C11290c(baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, Byte.class));
        } else if (str.equals(byte[].class.getCanonicalName())) {
            c11487v = new C11295h(byte[].class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, byte[].class), RealmMapEntrySet.IteratorType.BINARY, new C10313gb());
        } else if (str.equals(ObjectId.class.getCanonicalName())) {
            c11487v = new C11295h(ObjectId.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, ObjectId.class), RealmMapEntrySet.IteratorType.OBJECT_ID);
        } else if (str.equals(UUID.class.getCanonicalName())) {
            c11487v = new C11295h(UUID.class, baseRealm, osMap, new C22761wF1(baseRealm, osMap, String.class, UUID.class), RealmMapEntrySet.IteratorType.UUID);
        } else {
            c11487v = new C11487v(baseRealm, osMap, new C0449GL(baseRealm, osMap, str));
        }
        return new C1233RI(baseRealm, c11487v, c11487v.f66907d);
    }

    /* renamed from: f */
    public static C19568dj0 m29657f(Class cls, BaseRealm baseRealm, OsMap osMap) {
        return new C19568dj0(baseRealm, osMap, String.class, cls);
    }

    /* renamed from: g */
    public static RealmMap.C11260b m29656g(Class cls, BaseRealm baseRealm, OsMap osMap) {
        if (CollectionUtils.m29749c(cls)) {
            C19568dj0 m29657f = m29657f(cls, baseRealm, osMap);
            return new RealmMap.C11260b(new C1233RI(baseRealm, new C11487v(baseRealm, osMap, m29657f), m29657f));
        }
        return new RealmMap.C11260b(m29659c(cls, baseRealm, osMap));
    }

    /* renamed from: h */
    public static RealmMap.C11260b m29655h(String str, BaseRealm baseRealm, OsMap osMap) {
        return new RealmMap.C11260b(m29658e(str, baseRealm, osMap));
    }

    public RealmDictionary(Map<String, V> map) {
        super(map);
    }

    public RealmDictionary(BaseRealm baseRealm, OsMap osMap, Class cls) {
        super((RealmMap.AbstractC11261c) m29656g(cls, baseRealm, osMap));
    }

    public RealmDictionary(BaseRealm baseRealm, OsMap osMap, String str) {
        super((RealmMap.AbstractC11261c) m29655h(str, baseRealm, osMap));
    }
}
