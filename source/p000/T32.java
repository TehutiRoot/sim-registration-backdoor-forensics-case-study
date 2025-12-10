package p000;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: T32 */
/* loaded from: classes2.dex */
public abstract class T32 {

    /* renamed from: a */
    public static final Field f5909a;

    /* renamed from: b */
    public static final Method f5910b;

    /* renamed from: c */
    public static final Method f5911c;

    /* renamed from: d */
    public static final Constructor f5912d;

    /* renamed from: e */
    public static final LongSparseArray f5913e;

    /* renamed from: f */
    public static final Object f5914f;

    static {
        Field field;
        Method method;
        Constructor constructor;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method2 = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            method2.setAccessible(true);
            method = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f5909a = field;
        f5910b = method2;
        f5911c = method;
        f5912d = constructor;
        f5913e = new LongSparseArray(3);
        f5914f = new Object();
    }

    /* renamed from: a */
    public static Typeface m66236a(long j) {
        try {
            return (Typeface) f5912d.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Typeface m66235b(Typeface typeface, int i, boolean z) {
        Typeface m66236a;
        if (!m66233d()) {
            return null;
        }
        int i2 = (i << 1) | z;
        synchronized (f5914f) {
            try {
                long m66234c = m66234c(typeface);
                LongSparseArray longSparseArray = f5913e;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m66234c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m66234c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z == typeface.isItalic()) {
                    m66236a = m66236a(m66231f(m66234c, i));
                } else {
                    m66236a = m66236a(m66232e(m66234c, i, z));
                }
                sparseArray.put(i2, m66236a);
                return m66236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static long m66234c(Typeface typeface) {
        try {
            return f5909a.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m66233d() {
        if (f5909a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static long m66232e(long j, int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        try {
            Long l = (Long) f5910b.invoke(null, Long.valueOf(j), Integer.valueOf(i2));
            l.longValue();
            return ((Long) f5911c.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    public static long m66231f(long j, int i) {
        try {
            return ((Long) f5911c.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
