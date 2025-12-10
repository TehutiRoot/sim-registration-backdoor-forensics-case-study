package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* renamed from: S32 */
/* loaded from: classes2.dex */
public abstract class S32 {

    /* renamed from: a */
    public static final Field f5504a;

    /* renamed from: b */
    public static final LongSparseArray f5505b;

    /* renamed from: c */
    public static final Object f5506c;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        f5504a = field;
        f5505b = new LongSparseArray(3);
        f5506c = new Object();
    }

    /* renamed from: a */
    public static Typeface m66375a(CW1 cw1, Context context, Typeface typeface, int i, boolean z) {
        if (!m66372d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f5506c) {
            try {
                long m66373c = m66373c(typeface);
                LongSparseArray longSparseArray = f5505b;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m66373c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m66373c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface m66374b = m66374b(cw1, context, typeface, i, z);
                if (m66374b == null) {
                    m66374b = m66371e(typeface, i, z);
                }
                sparseArray.put(i2, m66374b);
                return m66374b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static Typeface m66374b(CW1 cw1, Context context, Typeface typeface, int i, boolean z) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry m68766g = cw1.m68766g(typeface);
        if (m68766g == null) {
            return null;
        }
        return cw1.m68770b(context, m68766g, context.getResources(), i, z);
    }

    /* renamed from: c */
    public static long m66373c(Typeface typeface) {
        try {
            return ((Number) f5504a.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m66372d() {
        if (f5504a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Typeface m66371e(Typeface typeface, int i, boolean z) {
        boolean z2;
        int i2 = 0;
        if (i >= 600) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            if (!z2) {
                i2 = 2;
            } else if (!z) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        return Typeface.create(typeface, i2);
    }
}
