package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ResourceManagerInternal {

    /* renamed from: i */
    public static ResourceManagerInternal f9768i;

    /* renamed from: a */
    public WeakHashMap f9770a;

    /* renamed from: b */
    public SimpleArrayMap f9771b;

    /* renamed from: c */
    public SparseArrayCompat f9772c;

    /* renamed from: d */
    public final WeakHashMap f9773d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f9774e;

    /* renamed from: f */
    public boolean f9775f;

    /* renamed from: g */
    public ResourceManagerHooks f9776g;

    /* renamed from: h */
    public static final PorterDuff.Mode f9767h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C2221c f9769j = new C2221c(6);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ResourceManagerHooks {
        @Nullable
        Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DrawableRes int i);

        @Nullable
        ColorStateList getTintListForDrawableRes(@NonNull Context context, @DrawableRes int i);

        @Nullable
        PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);

        boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$a */
    /* loaded from: classes.dex */
    public static class C2219a implements InterfaceC2223e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC2223e
        /* renamed from: a */
        public Drawable mo64233a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$b */
    /* loaded from: classes.dex */
    public static class C2220b implements InterfaceC2223e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC2223e
        /* renamed from: a */
        public Drawable mo64233a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$c */
    /* loaded from: classes.dex */
    public static class C2221c extends LruCache {
        public C2221c(int i) {
            super(i);
        }

        /* renamed from: b */
        public static int m64236b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: c */
        public PorterDuffColorFilter m64235c(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m64236b(i, mode)));
        }

        /* renamed from: d */
        public PorterDuffColorFilter m64234d(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m64236b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$d */
    /* loaded from: classes.dex */
    public static class C2222d implements InterfaceC2223e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC2223e
        /* renamed from: a */
        public Drawable mo64233a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C2222d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2223e {
        /* renamed from: a */
        Drawable mo64233a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$f */
    /* loaded from: classes.dex */
    public static class C2224f implements InterfaceC2223e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InterfaceC2223e
        /* renamed from: a */
        public Drawable mo64233a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m64251e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m64249g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            try {
                if (f9768i == null) {
                    ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                    f9768i = resourceManagerInternal2;
                    m64243m(resourceManagerInternal2);
                }
                resourceManagerInternal = f9768i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return resourceManagerInternal;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m64235c;
        synchronized (ResourceManagerInternal.class) {
            C2221c c2221c = f9769j;
            m64235c = c2221c.m64235c(i, mode);
            if (m64235c == null) {
                m64235c = new PorterDuffColorFilter(i, mode);
                c2221c.m64234d(i, mode, m64235c);
            }
        }
        return m64235c;
    }

    /* renamed from: m */
    public static void m64243m(ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.m64255a("vector", new C2224f());
            resourceManagerInternal.m64255a("animated-vector", new C2220b());
            resourceManagerInternal.m64255a("animated-selector", new C2219a());
            resourceManagerInternal.m64255a("drawable", new C2222d());
        }
    }

    /* renamed from: n */
    public static boolean m64242n(Drawable drawable) {
        if (!(drawable instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static void m64238r(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable) {
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.mHasTintList;
        if (!z && !tintInfo.mHasTintMode) {
            drawable.clearColorFilter();
        } else {
            if (z) {
                colorStateList = tintInfo.mTintList;
            } else {
                colorStateList = null;
            }
            if (tintInfo.mHasTintMode) {
                mode = tintInfo.mTintMode;
            } else {
                mode = f9767h;
            }
            drawable.setColorFilter(m64249g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void m64255a(String str, InterfaceC2223e interfaceC2223e) {
        if (this.f9771b == null) {
            this.f9771b = new SimpleArrayMap();
        }
        this.f9771b.put(str, interfaceC2223e);
    }

    /* renamed from: b */
    public final synchronized boolean m64254b(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.f9773d.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray();
                    this.f9773d.put(context, longSparseArray);
                }
                longSparseArray.put(j, new WeakReference(constantState));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final void m64253c(Context context, int i, ColorStateList colorStateList) {
        if (this.f9770a == null) {
            this.f9770a = new WeakHashMap();
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.f9770a.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            this.f9770a.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i, colorStateList);
    }

    /* renamed from: d */
    public final void m64252d(Context context) {
        if (this.f9775f) {
            return;
        }
        this.f9775f = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable != null && m64242n(drawable)) {
            return;
        }
        this.f9775f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    /* renamed from: f */
    public final Drawable m64250f(Context context, int i) {
        Drawable createDrawableFor;
        if (this.f9774e == null) {
            this.f9774e = new TypedValue();
        }
        TypedValue typedValue = this.f9774e;
        context.getResources().getValue(i, typedValue, true);
        long m64251e = m64251e(typedValue);
        Drawable m64248h = m64248h(context, m64251e);
        if (m64248h != null) {
            return m64248h;
        }
        ResourceManagerHooks resourceManagerHooks = this.f9776g;
        if (resourceManagerHooks == null) {
            createDrawableFor = null;
        } else {
            createDrawableFor = resourceManagerHooks.createDrawableFor(this, context, i);
        }
        if (createDrawableFor != null) {
            createDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            m64254b(context, m64251e, createDrawableFor);
        }
        return createDrawableFor;
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return m64247i(context, i, false);
    }

    /* renamed from: h */
    public final synchronized Drawable m64248h(Context context, long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f9773d.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.get(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j);
        }
        return null;
    }

    /* renamed from: i */
    public synchronized Drawable m64247i(Context context, int i, boolean z) {
        Drawable m64241o;
        try {
            m64252d(context);
            m64241o = m64241o(context, i);
            if (m64241o == null) {
                m64241o = m64250f(context, i);
            }
            if (m64241o == null) {
                m64241o = ContextCompat.getDrawable(context, i);
            }
            if (m64241o != null) {
                m64241o = m64239q(context, i, z, m64241o);
            }
            if (m64241o != null) {
                DrawableUtils.m64297a(m64241o);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m64241o;
    }

    /* renamed from: j */
    public synchronized ColorStateList m64246j(Context context, int i) {
        ColorStateList m64245k;
        m64245k = m64245k(context, i);
        if (m64245k == null) {
            ResourceManagerHooks resourceManagerHooks = this.f9776g;
            if (resourceManagerHooks == null) {
                m64245k = null;
            } else {
                m64245k = resourceManagerHooks.getTintListForDrawableRes(context, i);
            }
            if (m64245k != null) {
                m64253c(context, i, m64245k);
            }
        }
        return m64245k;
    }

    /* renamed from: k */
    public final ColorStateList m64245k(Context context, int i) {
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f9770a;
        if (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sparseArrayCompat.get(i);
    }

    /* renamed from: l */
    public PorterDuff.Mode m64244l(int i) {
        ResourceManagerHooks resourceManagerHooks = this.f9776g;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i);
    }

    /* renamed from: o */
    public final Drawable m64241o(Context context, int i) {
        int next;
        SimpleArrayMap simpleArrayMap = this.f9771b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = this.f9772c;
        if (sparseArrayCompat != null) {
            String str = (String) sparseArrayCompat.get(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f9771b.get(str) == null)) {
                return null;
            }
        } else {
            this.f9772c = new SparseArrayCompat();
        }
        if (this.f9774e == null) {
            this.f9774e = new TypedValue();
        }
        TypedValue typedValue = this.f9774e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m64251e = m64251e(typedValue);
        Drawable m64248h = m64248h(context, m64251e);
        if (m64248h != null) {
            return m64248h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f9772c.append(i, name);
                    InterfaceC2223e interfaceC2223e = (InterfaceC2223e) this.f9771b.get(name);
                    if (interfaceC2223e != null) {
                        m64248h = interfaceC2223e.mo64233a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m64248h != null) {
                        m64248h.setChangingConfigurations(typedValue.changingConfigurations);
                        m64254b(context, m64251e, m64248h);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (m64248h == null) {
            this.f9772c.append(i, "appcompat_skip_skip");
        }
        return m64248h;
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f9773d.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: p */
    public synchronized Drawable m64240p(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        try {
            Drawable m64241o = m64241o(context, i);
            if (m64241o == null) {
                m64241o = vectorEnabledTintResources.m67451a(i);
            }
            if (m64241o != null) {
                return m64239q(context, i, false, m64241o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: q */
    public final Drawable m64239q(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m64246j = m64246j(context, i);
        if (m64246j != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, m64246j);
            PorterDuff.Mode m64244l = m64244l(i);
            if (m64244l != null) {
                DrawableCompat.setTintMode(wrap, m64244l);
                return wrap;
            }
            return wrap;
        }
        ResourceManagerHooks resourceManagerHooks = this.f9776g;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i, drawable)) && !m64237s(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: s */
    public boolean m64237s(Context context, int i, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.f9776g;
        if (resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i, drawable)) {
            return true;
        }
        return false;
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.f9776g = resourceManagerHooks;
    }
}
