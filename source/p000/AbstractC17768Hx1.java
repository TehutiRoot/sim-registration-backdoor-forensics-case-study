package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: Hx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17768Hx1 {

    /* renamed from: a */
    public static Field f2365a;

    /* renamed from: b */
    public static boolean f2366b;

    /* renamed from: c */
    public static Class f2367c;

    /* renamed from: d */
    public static boolean f2368d;

    /* renamed from: e */
    public static Field f2369e;

    /* renamed from: f */
    public static boolean f2370f;

    /* renamed from: g */
    public static Field f2371g;

    /* renamed from: h */
    public static boolean f2372h;

    /* renamed from: Hx1$a */
    /* loaded from: classes.dex */
    public static class C0564a {
        @DoNotInline
        /* renamed from: a */
        public static void m68015a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m68020a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m68017d(resources);
        } else if (i >= 23) {
            m68018c(resources);
        } else {
            m68019b(resources);
        }
    }

    /* renamed from: b */
    public static void m68019b(Resources resources) {
        Map map;
        if (!f2366b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2365a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2366b = true;
        }
        Field field = f2365a;
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
    public static void m68018c(android.content.res.Resources r3) {
        /*
            boolean r0 = p000.AbstractC17768Hx1.f2366b
            if (r0 != 0) goto L15
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            p000.AbstractC17768Hx1.f2365a = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
        L13:
            p000.AbstractC17768Hx1.f2366b = r0
        L15:
            java.lang.reflect.Field r0 = p000.AbstractC17768Hx1.f2365a
            if (r0 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 != 0) goto L22
            return
        L22:
            m68016e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC17768Hx1.m68018c(android.content.res.Resources):void");
    }

    /* renamed from: d */
    public static void m68017d(Resources resources) {
        Object obj;
        if (!f2372h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2371g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2372h = true;
        }
        Field field = f2371g;
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
        if (!f2366b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2365a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f2366b = true;
        }
        Field field2 = f2365a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            m68016e(obj2);
        }
    }

    /* renamed from: e */
    public static void m68016e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2368d) {
            try {
                f2367c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f2368d = true;
        }
        Class cls = f2367c;
        if (cls == null) {
            return;
        }
        if (!f2370f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2369e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f2370f = true;
        }
        Field field = f2369e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C0564a.m68015a(longSparseArray);
        }
    }
}
