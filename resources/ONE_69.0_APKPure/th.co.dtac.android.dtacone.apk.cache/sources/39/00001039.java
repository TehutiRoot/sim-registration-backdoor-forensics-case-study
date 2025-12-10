package p000;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: R42 */
/* loaded from: classes2.dex */
public abstract class R42 {

    /* renamed from: a */
    public static final Field f5395a;

    /* renamed from: b */
    public static final Method f5396b;

    /* renamed from: c */
    public static final Constructor f5397c;

    /* renamed from: d */
    public static final LongSparseArray f5398d;

    /* renamed from: e */
    public static final Object f5399e;

    static {
        Field field;
        Constructor constructor;
        Method method;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            field = null;
            constructor = null;
            method = null;
        }
        f5395a = field;
        f5396b = method;
        f5397c = constructor;
        f5398d = new LongSparseArray(3);
        f5399e = new Object();
    }

    /* renamed from: a */
    public static Typeface m66704a(long j) {
        try {
            return (Typeface) f5397c.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Typeface m66703b(Typeface typeface, int i, boolean z) {
        if (!m66701d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f5399e) {
            try {
                long m66702c = m66702c(typeface);
                LongSparseArray longSparseArray = f5398d;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m66702c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m66702c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface m66704a = m66704a(m66700e(m66702c, i, z));
                sparseArray.put(i2, m66704a);
                return m66704a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static long m66702c(Typeface typeface) {
        try {
            return f5395a.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m66701d() {
        if (f5395a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static long m66700e(long j, int i, boolean z) {
        try {
            return ((Long) f5396b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}