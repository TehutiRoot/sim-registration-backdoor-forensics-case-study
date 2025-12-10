package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* renamed from: P42 */
/* loaded from: classes2.dex */
public abstract class P42 {

    /* renamed from: a */
    public static final Field f4668a;

    /* renamed from: b */
    public static final LongSparseArray f4669b;

    /* renamed from: c */
    public static final Object f4670c;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        f4668a = field;
        f4669b = new LongSparseArray(3);
        f4670c = new Object();
    }

    /* renamed from: a */
    public static Typeface m67022a(AbstractC23392zX1 abstractC23392zX1, Context context, Typeface typeface, int i, boolean z) {
        if (!m67019d()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f4670c) {
            try {
                long m67020c = m67020c(typeface);
                LongSparseArray longSparseArray = f4669b;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(m67020c);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(m67020c, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface m67021b = m67021b(abstractC23392zX1, context, typeface, i, z);
                if (m67021b == null) {
                    m67021b = m67018e(typeface, i, z);
                }
                sparseArray.put(i2, m67021b);
                return m67021b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static Typeface m67021b(AbstractC23392zX1 abstractC23392zX1, Context context, Typeface typeface, int i, boolean z) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry m114g = abstractC23392zX1.m114g(typeface);
        if (m114g == null) {
            return null;
        }
        return abstractC23392zX1.m119b(context, m114g, context.getResources(), i, z);
    }

    /* renamed from: c */
    public static long m67020c(Typeface typeface) {
        try {
            return ((Number) f4668a.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m67019d() {
        if (f4668a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Typeface m67018e(Typeface typeface, int i, boolean z) {
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