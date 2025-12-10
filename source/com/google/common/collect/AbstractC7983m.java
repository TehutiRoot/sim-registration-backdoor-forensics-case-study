package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.m */
/* loaded from: classes4.dex */
public abstract class AbstractC7983m {

    /* renamed from: com.google.common.collect.m$b */
    /* loaded from: classes4.dex */
    public static final class C7985b {

        /* renamed from: a */
        public final Field f53721a;

        /* renamed from: a */
        public void m40210a(Object obj, int i) {
            try {
                this.f53721a.set(obj, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public void m40209b(Object obj, Object obj2) {
            try {
                this.f53721a.set(obj, obj2);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public C7985b(Field field) {
            this.f53721a = field;
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    public static C7985b m40221a(Class cls, String str) {
        try {
            return new C7985b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static void m40220b(Map map, ObjectInputStream objectInputStream) {
        m40219c(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: c */
    public static void m40219c(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: d */
    public static void m40218d(Multimap multimap, ObjectInputStream objectInputStream) {
        m40217e(multimap, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: e */
    public static void m40217e(Multimap multimap, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: f */
    public static void m40216f(Multiset multiset, ObjectInputStream objectInputStream) {
        m40215g(multiset, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: g */
    public static void m40215g(Multiset multiset, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: h */
    public static int m40214h(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    /* renamed from: i */
    public static void m40213i(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: j */
    public static void m40212j(Multimap multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object obj : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(obj);
            }
        }
    }

    /* renamed from: k */
    public static void m40211k(Multiset multiset, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}
