package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.m */
/* loaded from: classes4.dex */
public abstract class AbstractC7972m {

    /* renamed from: com.google.common.collect.m$b */
    /* loaded from: classes4.dex */
    public static final class C7974b {

        /* renamed from: a */
        public final Field f53733a;

        /* renamed from: a */
        public void m40201a(Object obj, int i) {
            try {
                this.f53733a.set(obj, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public void m40200b(Object obj, Object obj2) {
            try {
                this.f53733a.set(obj, obj2);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public C7974b(Field field) {
            this.f53733a = field;
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    public static C7974b m40212a(Class cls, String str) {
        try {
            return new C7974b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static void m40211b(Map map, ObjectInputStream objectInputStream) {
        m40210c(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: c */
    public static void m40210c(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: d */
    public static void m40209d(Multimap multimap, ObjectInputStream objectInputStream) {
        m40208e(multimap, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: e */
    public static void m40208e(Multimap multimap, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: f */
    public static void m40207f(Multiset multiset, ObjectInputStream objectInputStream) {
        m40206g(multiset, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: g */
    public static void m40206g(Multiset multiset, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: h */
    public static int m40205h(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    /* renamed from: i */
    public static void m40204i(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: j */
    public static void m40203j(Multimap multimap, ObjectOutputStream objectOutputStream) {
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
    public static void m40202k(Multiset multiset, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}