package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ResourcesCompat {
    @AnyRes
    public static final int ID_NULL = 0;

    /* renamed from: a */
    public static final ThreadLocal f33836a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f33837b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f33838c = new Object();

    /* loaded from: classes2.dex */
    public static abstract class FontCallback {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: Gx1
                {
                    ResourcesCompat.FontCallback.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback.this.m57402c(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: Fx1
                {
                    ResourcesCompat.FontCallback.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback.this.m57401d(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void m57402c(int i);

        /* renamed from: onFontRetrieved */
        public abstract void m57401d(@NonNull Typeface typeface);
    }

    /* loaded from: classes2.dex */
    public static final class ThemeCompat {

        /* renamed from: androidx.core.content.res.ResourcesCompat$ThemeCompat$a */
        /* loaded from: classes2.dex */
        public static class C3975a {

            /* renamed from: a */
            public static final Object f33839a = new Object();

            /* renamed from: b */
            public static Method f33840b;

            /* renamed from: c */
            public static boolean f33841c;

            /* renamed from: a */
            public static void m57400a(Resources.Theme theme) {
                synchronized (f33839a) {
                    if (!f33841c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f33840b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f33841c = true;
                    }
                    Method method = f33840b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f33840b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.ResourcesCompat$ThemeCompat$b */
        /* loaded from: classes2.dex */
        public static class C3976b {
            @DoNotInline
            /* renamed from: a */
            public static void m57399a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void rebase(@NonNull Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C3976b.m57399a(theme);
            } else if (i >= 23) {
                C3975a.m57400a(theme);
            }
        }
    }

    /* renamed from: androidx.core.content.res.ResourcesCompat$a */
    /* loaded from: classes2.dex */
    public static class C3977a {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m57398a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m57397b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.ResourcesCompat$b */
    /* loaded from: classes2.dex */
    public static class C3978b {
        @DoNotInline
        /* renamed from: a */
        public static int m57396a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static ColorStateList m57395b(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.ResourcesCompat$c */
    /* loaded from: classes2.dex */
    public static class C3979c {
        @DoNotInline
        /* renamed from: a */
        public static float m57394a(@NonNull Resources resources, @DimenRes int i) {
            return resources.getFloat(i);
        }
    }

    /* renamed from: androidx.core.content.res.ResourcesCompat$d */
    /* loaded from: classes2.dex */
    public static class C3980d {

        /* renamed from: a */
        public final ColorStateList f33842a;

        /* renamed from: b */
        public final Configuration f33843b;

        /* renamed from: c */
        public final int f33844c;

        public C3980d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f33842a = colorStateList;
            this.f33843b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f33844c = hashCode;
        }
    }

    /* renamed from: androidx.core.content.res.ResourcesCompat$e */
    /* loaded from: classes2.dex */
    public static final class C3981e {

        /* renamed from: a */
        public final Resources f33845a;

        /* renamed from: b */
        public final Resources.Theme f33846b;

        public C3981e(Resources resources, Resources.Theme theme) {
            this.f33845a = resources;
            this.f33846b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3981e.class != obj.getClass()) {
                return false;
            }
            C3981e c3981e = (C3981e) obj;
            if (this.f33845a.equals(c3981e.f33845a) && ObjectsCompat.equals(this.f33846b, c3981e.f33846b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f33845a, this.f33846b);
        }
    }

    /* renamed from: a */
    public static void m57411a(C3981e c3981e, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f33838c) {
            try {
                WeakHashMap weakHashMap = f33837b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c3981e);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c3981e, sparseArray);
                }
                sparseArray.append(i, new C3980d(colorStateList, c3981e.f33845a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x003c, code lost:
        if (r2.f33844c == r5.hashCode()) goto L17;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m57410b(androidx.core.content.res.ResourcesCompat.C3981e r5, int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.f33838c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = androidx.core.content.res.ResourcesCompat.f33837b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.ResourcesCompat$d r2 = (androidx.core.content.res.ResourcesCompat.C3980d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f33843b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f33845a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f33846b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f33844c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f33844c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f33842a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.m57410b(androidx.core.content.res.ResourcesCompat$e, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static TypedValue m57409c() {
        ThreadLocal threadLocal = f33836a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static void clearCachesForTheme(@NonNull Resources.Theme theme) {
        synchronized (f33838c) {
            try {
                Iterator it = f33837b.keySet().iterator();
                while (it.hasNext()) {
                    C3981e c3981e = (C3981e) it.next();
                    if (c3981e != null && theme.equals(c3981e.f33846b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static ColorStateList m57408d(Resources resources, int i, Resources.Theme theme) {
        if (m57407e(resources, i)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m57407e(Resources resources, int i) {
        TypedValue m57409c = m57409c();
        resources.getValue(i, m57409c, true);
        int i2 = m57409c.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static Typeface m57406f(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m57405g = m57405g(context, resources, typedValue, i, i2, fontCallback, handler, z, z2);
        if (m57405g == null && fontCallback == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m57405g;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m57405g(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.ResourcesCompat.FontCallback r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto La1
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L22
            if (r10 == 0) goto L21
            r10.callbackFailAsync(r14, r11)
        L21:
            return r13
        L22:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.findFromCache(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L32
            if (r10 == 0) goto L31
            r10.callbackSuccessAsync(r1, r11)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r13
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            if (r1 == 0) goto L66
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r1, r2)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            if (r1 != 0) goto L51
            if (r10 == 0) goto L50
            r10.callbackFailAsync(r14, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
        L50:
            return r13
        L51:
            int r5 = r0.assetCookie     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            return r0
        L66:
            int r4 = r0.assetCookie     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            if (r10 == 0) goto L7f
            if (r0 == 0) goto L7c
            r10.callbackSuccessAsync(r0, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
            goto L7f
        L7c:
            r10.callbackFailAsync(r14, r11)     // Catch: java.io.IOException -> L80 org.xmlpull.v1.XmlPullParserException -> L8e
        L7f:
            return r0
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r12)
            goto L9b
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r12)
        L9b:
            if (r10 == 0) goto La0
            r10.callbackFailAsync(r14, r11)
        La0:
            return r13
        La1:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.m57405g(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    @Nullable
    public static Typeface getCachedFont(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m57406f(context, i, new TypedValue(), 0, null, null, false, true);
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3978b.m57396a(resources, i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        C3981e c3981e = new C3981e(resources, theme);
        ColorStateList m57410b = m57410b(c3981e, i);
        if (m57410b != null) {
            return m57410b;
        }
        ColorStateList m57408d = m57408d(resources, i, theme);
        if (m57408d != null) {
            m57411a(c3981e, i, m57408d, theme);
            return m57408d;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C3978b.m57395b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C3977a.m57398a(resources, i, theme);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C3977a.m57397b(resources, i, i2, theme);
    }

    public static float getFloat(@NonNull Resources resources, @DimenRes int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3979c.m57394a(resources, i);
        }
        TypedValue m57409c = m57409c();
        resources.getValue(i, m57409c, true);
        if (m57409c.type == 4) {
            return m57409c.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(m57409c.type) + " is not valid");
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m57406f(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static void getFont(@NonNull Context context, @FontRes int i, @NonNull FontCallback fontCallback, @Nullable Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            m57406f(context, i, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getFont(@NonNull Context context, @FontRes int i, @NonNull TypedValue typedValue, int i2, @Nullable FontCallback fontCallback) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m57406f(context, i, typedValue, i2, fontCallback, null, true, false);
    }
}
