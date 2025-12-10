package p000;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: U32 */
/* loaded from: classes2.dex */
public abstract class U32 {

    /* renamed from: a */
    public static final Field f6193a;

    /* renamed from: b */
    public static final Method f6194b;

    /* renamed from: c */
    public static final Constructor f6195c;

    /* renamed from: d */
    public static final LongSparseArray f6196d;

    /* renamed from: e */
    public static final Object f6197e;

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
        f6193a = field;
        f6194b = method;
        f6195c = constructor;
        f6196d = new LongSparseArray(3);
        f6197e = new Object();
    }

    /* renamed from: a */
    public static Typeface m66138a(long j) {
        try {
            return (Typeface) f6195c.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Typeface m66137b(Typeface typeface, int i, boolean z) {
        if (!m66135d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f6197e) {
            try {
                long m66136c = m66136c(typeface);
                LongSparseArray longSparseArray = f6196d;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m66136c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m66136c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface m66138a = m66138a(m66134e(m66136c, i, z));
                sparseArray.put(i2, m66138a);
                return m66138a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static long m66136c(Typeface typeface) {
        try {
            return f6193a.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m66135d() {
        if (f6193a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static long m66134e(long j, int i, boolean z) {
        try {
            return ((Long) f6194b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
