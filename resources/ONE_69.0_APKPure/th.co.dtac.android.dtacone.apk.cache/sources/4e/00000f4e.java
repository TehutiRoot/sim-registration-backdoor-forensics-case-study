package p000;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Q42 */
/* loaded from: classes2.dex */
public abstract class Q42 {

    /* renamed from: a */
    public static final Field f5109a;

    /* renamed from: b */
    public static final Method f5110b;

    /* renamed from: c */
    public static final Method f5111c;

    /* renamed from: d */
    public static final Constructor f5112d;

    /* renamed from: e */
    public static final LongSparseArray f5113e;

    /* renamed from: f */
    public static final Object f5114f;

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
        f5109a = field;
        f5110b = method2;
        f5111c = method;
        f5112d = constructor;
        f5113e = new LongSparseArray(3);
        f5114f = new Object();
    }

    /* renamed from: a */
    public static Typeface m66850a(long j) {
        try {
            return (Typeface) f5112d.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Typeface m66849b(Typeface typeface, int i, boolean z) {
        Typeface m66850a;
        if (!m66847d()) {
            return null;
        }
        int i2 = (i << 1) | z;
        synchronized (f5114f) {
            try {
                long m66848c = m66848c(typeface);
                LongSparseArray longSparseArray = f5113e;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m66848c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m66848c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z == typeface.isItalic()) {
                    m66850a = m66850a(m66845f(m66848c, i));
                } else {
                    m66850a = m66850a(m66846e(m66848c, i, z));
                }
                sparseArray.put(i2, m66850a);
                return m66850a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static long m66848c(Typeface typeface) {
        try {
            return f5109a.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m66847d() {
        if (f5109a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static long m66846e(long j, int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        try {
            Long l = (Long) f5110b.invoke(null, Long.valueOf(j), Integer.valueOf(i2));
            l.longValue();
            return ((Long) f5111c.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    public static long m66845f(long j, int i) {
        try {
            return ((Long) f5111c.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}