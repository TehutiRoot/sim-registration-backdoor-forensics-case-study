package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: Ey1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17606Ey1 {

    /* renamed from: a */
    public static Field f1534a;

    /* renamed from: b */
    public static boolean f1535b;

    /* renamed from: c */
    public static Class f1536c;

    /* renamed from: d */
    public static boolean f1537d;

    /* renamed from: e */
    public static Field f1538e;

    /* renamed from: f */
    public static boolean f1539f;

    /* renamed from: g */
    public static Field f1540g;

    /* renamed from: h */
    public static boolean f1541h;

    /* renamed from: Ey1$a */
    /* loaded from: classes.dex */
    public static class C0349a {
        @DoNotInline
        /* renamed from: a */
        public static void m68555a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m68560a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m68557d(resources);
        } else if (i >= 23) {
            m68558c(resources);
        } else {
            m68559b(resources);
        }
    }

    /* renamed from: b */
    public static void m68559b(Resources resources) {
        Map map;
        if (!f1535b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1534a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1535b = true;
        }
        Field field = f1534a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m68558c(android.content.res.Resources r3) {
        /*
            boolean r0 = p000.AbstractC17606Ey1.f1535b
            if (r0 != 0) goto L15
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            p000.AbstractC17606Ey1.f1534a = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
        L13:
            p000.AbstractC17606Ey1.f1535b = r0
        L15:
            java.lang.reflect.Field r0 = p000.AbstractC17606Ey1.f1534a
            if (r0 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 != 0) goto L22
            return
        L22:
            m68556e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC17606Ey1.m68558c(android.content.res.Resources):void");
    }

    /* renamed from: d */
    public static void m68557d(Resources resources) {
        Object obj;
        if (!f1541h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1540g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1541h = true;
        }
        Field field = f1540g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1535b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1534a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f1535b = true;
        }
        Field field2 = f1534a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m68556e(obj2);
        }
    }

    /* renamed from: e */
    public static void m68556e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1537d) {
            try {
                f1536c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f1537d = true;
        }
        Class cls = f1536c;
        if (cls == null) {
            return;
        }
        if (!f1539f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1538e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f1539f = true;
        }
        Field field = f1538e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C0349a.m68555a(longSparseArray);
        }
    }
}