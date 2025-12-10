package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: XD */
/* loaded from: classes4.dex */
public abstract class AbstractC1663XD {

    /* renamed from: XD$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC1664a {
    }

    static {
        try {
            m65533b("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        } catch (LinkageError unused) {
            m65533b("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
    }

    /* renamed from: a */
    public static String m65534a(long j) {
        throw null;
    }

    /* renamed from: b */
    public static InterfaceC1664a m65533b(String str) {
        try {
            AbstractC22494uj2.m1214a(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
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
    public static long m65532c(String str) {
        throw null;
    }
}
