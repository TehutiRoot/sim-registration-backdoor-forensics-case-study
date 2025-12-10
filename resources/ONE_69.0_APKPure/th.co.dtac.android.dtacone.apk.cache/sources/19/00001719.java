package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: YD */
/* loaded from: classes4.dex */
public abstract class AbstractC1721YD {

    /* renamed from: YD$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC1722a {
    }

    static {
        try {
            m65487b("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        } catch (LinkageError unused) {
            m65487b("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
    }

    /* renamed from: a */
    public static String m65488a(long j) {
        throw null;
    }

    /* renamed from: b */
    public static InterfaceC1722a m65487b(String str) {
        try {
            AbstractC22045rk2.m23445a(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            return null;
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        } catch (IllegalAccessException e2) {
            throw new ExceptionInInitializerError(e2);
        } catch (InstantiationException e3) {
            throw new ExceptionInInitializerError(e3);
        } catch (NoSuchMethodException e4) {
            throw new ExceptionInInitializerError(e4);
        } catch (InvocationTargetException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    /* renamed from: c */
    public static long m65486c(String str) {
        throw null;
    }
}