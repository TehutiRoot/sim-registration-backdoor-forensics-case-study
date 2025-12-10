package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {

    /* renamed from: o */
    public C2125c f9069o;

    /* renamed from: p */
    public AbstractC2129g f9070p;

    /* renamed from: q */
    public int f9071q;

    /* renamed from: r */
    public int f9072r;

    /* renamed from: s */
    public boolean f9073s;

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$b */
    /* loaded from: classes.dex */
    public static class C2124b extends AbstractC2129g {

        /* renamed from: a */
        public final Animatable f9074a;

        public C2124b(Animatable animatable) {
            super();
            this.f9074a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: c */
        public void mo64539c() {
            this.f9074a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: d */
        public void mo64538d() {
            this.f9074a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$c */
    /* loaded from: classes.dex */
    public static class C2125c extends StateListDrawableCompat.C2134a {

        /* renamed from: K */
        public LongSparseArray f9075K;

        /* renamed from: L */
        public SparseArrayCompat f9076L;

        public C2125c(C2125c c2125c, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(c2125c, animatedStateListDrawableCompat, resources);
            if (c2125c != null) {
                this.f9075K = c2125c.f9075K;
                this.f9076L = c2125c.f9076L;
                return;
            }
            this.f9075K = new LongSparseArray();
            this.f9076L = new SparseArrayCompat();
        }

        /* renamed from: E */
        public static long m64549E(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: C */
        public int m64551C(int[] iArr, Drawable drawable, int i) {
            int m64494A = super.m64494A(iArr, drawable);
            this.f9076L.put(m64494A, Integer.valueOf(i));
            return m64494A;
        }

        /* renamed from: D */
        public int m64550D(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int m64525a = super.m64525a(drawable);
            long m64549E = m64549E(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = m64525a;
            this.f9075K.append(m64549E, Long.valueOf(j2 | j));
            if (z) {
                this.f9075K.append(m64549E(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m64525a;
        }

        /* renamed from: F */
        public int m64548F(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f9076L.get(i, 0)).intValue();
        }

        /* renamed from: G */
        public int m64547G(int[] iArr) {
            int m64493B = super.m64493B(iArr);
            if (m64493B >= 0) {
                return m64493B;
            }
            return super.m64493B(StateSet.WILD_CARD);
        }

        /* renamed from: H */
        public int m64546H(int i, int i2) {
            return (int) ((Long) this.f9075K.get(m64549E(i, i2), -1L)).longValue();
        }

        /* renamed from: I */
        public boolean m64545I(int i, int i2) {
            if ((((Long) this.f9075K.get(m64549E(i, i2), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: J */
        public boolean m64544J(int i, int i2) {
            if ((((Long) this.f9075K.get(m64549E(i, i2), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2134a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2134a, androidx.appcompat.graphics.drawable.DrawableContainerCompat.AbstractC2133d
        /* renamed from: s */
        public void mo64491s() {
            this.f9075K = this.f9075K.m69190clone();
            this.f9076L = this.f9076L.m69191clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2134a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$d */
    /* loaded from: classes.dex */
    public static class C2126d extends AbstractC2129g {

        /* renamed from: a */
        public final AnimatedVectorDrawableCompat f9077a;

        public C2126d(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f9077a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: c */
        public void mo64539c() {
            this.f9077a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: d */
        public void mo64538d() {
            this.f9077a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$e */
    /* loaded from: classes.dex */
    public static class C2127e extends AbstractC2129g {

        /* renamed from: a */
        public final ObjectAnimator f9078a;

        /* renamed from: b */
        public final boolean f9079b;

        public C2127e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            int i2 = z ? 0 : numberOfFrames - 1;
            C2128f c2128f = new C2128f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            Compatibility.Api18Impl.setAutoCancel(ofInt, true);
            ofInt.setDuration(c2128f.m64543a());
            ofInt.setInterpolator(c2128f);
            this.f9079b = z2;
            this.f9078a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: a */
        public boolean mo64541a() {
            return this.f9079b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: b */
        public void mo64540b() {
            this.f9078a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: c */
        public void mo64539c() {
            this.f9078a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2129g
        /* renamed from: d */
        public void mo64538d() {
            this.f9078a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$f */
    /* loaded from: classes.dex */
    public static class C2128f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f9080a;

        /* renamed from: b */
        public int f9081b;

        /* renamed from: c */
        public int f9082c;

        public C2128f(AnimationDrawable animationDrawable, boolean z) {
            m64542b(animationDrawable, z);
        }

        /* renamed from: a */
        public int m64543a() {
            return this.f9082c;
        }

        /* renamed from: b */
        public int m64542b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9081b = numberOfFrames;
            int[] iArr = this.f9080a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9080a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9080a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f9082c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * this.f9082c) + 0.5f);
            int i2 = this.f9081b;
            int[] iArr = this.f9080a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = i / this.f9082c;
            } else {
                f2 = 0.0f;
            }
            return (i3 / i2) + f2;
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2129g {
        public AbstractC2129g() {
        }

        /* renamed from: a */
        public boolean mo64541a() {
            return false;
        }

        /* renamed from: b */
        public void mo64540b() {
        }

        /* renamed from: c */
        public abstract void mo64539c();

        /* renamed from: d */
        public abstract void mo64538d();
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    @Nullable
    public static AnimatedStateListDrawableCompat create(@NonNull Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return createFromXmlInner(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @NonNull
    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m64555o() {
        onStateChange(getState());
    }

    public void addState(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
        ObjectsCompat.requireNonNull(drawable);
        this.f9069o.m64551C(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, @NonNull T t, boolean z) {
        ObjectsCompat.requireNonNull(t);
        this.f9069o.m64550D(i, i2, t, z);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: h */
    public void mo64499h(DrawableContainerCompat.AbstractC2133d abstractC2133d) {
        super.mo64499h(abstractC2133d);
        if (abstractC2133d instanceof C2125c) {
            this.f9069o = (C2125c) abstractC2133d;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(obtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        m64557m(obtainAttributes);
        m64531i(resources);
        obtainAttributes.recycle();
        m64558l(context, resources, xmlPullParser, attributeSet, theme);
        m64555o();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC2129g abstractC2129g = this.f9070p;
        if (abstractC2129g != null) {
            abstractC2129g.mo64538d();
            this.f9070p = null;
            m64532g(this.f9071q);
            this.f9071q = -1;
            this.f9072r = -1;
        }
    }

    /* renamed from: l */
    public final void m64558l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            m64554p(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            m64553q(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final void m64557m(TypedArray typedArray) {
        C2125c c2125c = this.f9069o;
        c2125c.f9109d |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        c2125c.m64503y(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, c2125c.f9114i));
        c2125c.m64507u(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, c2125c.f9117l));
        c2125c.m64506v(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, c2125c.f9097A));
        c2125c.m64505w(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, c2125c.f9098B));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, c2125c.f9129x));
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f9073s && super.mutate() == this) {
            this.f9069o.mo64491s();
            this.f9073s = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* renamed from: n */
    public C2125c mo64498j() {
        return new C2125c(this.f9069o, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean z;
        int m64547G = this.f9069o.m64547G(iArr);
        if (m64547G != m64536c() && (m64552r(m64547G) || m64532g(m64547G))) {
            z = true;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    /* renamed from: p */
    public final int m64554p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableItem);
        int resourceId = obtainAttributes.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = obtainAttributes.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        if (resourceId2 > 0) {
            drawable = ResourceManagerInternal.get().getDrawable(context, resourceId2);
        } else {
            drawable = null;
        }
        obtainAttributes.recycle();
        int[] m64497k = m64497k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            return this.f9069o.m64551C(m64497k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: q */
    public final int m64553q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = obtainAttributes.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = obtainAttributes.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = obtainAttributes.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (resourceId3 > 0) {
            drawable = ResourceManagerInternal.get().getDrawable(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = obtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        obtainAttributes.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            if (resourceId != -1 && resourceId2 != -1) {
                return this.f9069o.m64550D(resourceId, resourceId2, drawable, z);
            }
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    public final boolean m64552r(int i) {
        int m64536c;
        int m64546H;
        AbstractC2129g c2124b;
        AbstractC2129g abstractC2129g = this.f9070p;
        if (abstractC2129g != null) {
            if (i == this.f9071q) {
                return true;
            }
            if (i == this.f9072r && abstractC2129g.mo64541a()) {
                abstractC2129g.mo64540b();
                this.f9071q = this.f9072r;
                this.f9072r = i;
                return true;
            }
            m64536c = this.f9071q;
            abstractC2129g.mo64538d();
        } else {
            m64536c = m64536c();
        }
        this.f9070p = null;
        this.f9072r = -1;
        this.f9071q = -1;
        C2125c c2125c = this.f9069o;
        int m64548F = c2125c.m64548F(m64536c);
        int m64548F2 = c2125c.m64548F(i);
        if (m64548F2 == 0 || m64548F == 0 || (m64546H = c2125c.m64546H(m64548F, m64548F2)) < 0) {
            return false;
        }
        boolean m64544J = c2125c.m64544J(m64548F, m64548F2);
        m64532g(m64546H);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c2124b = new C2127e((AnimationDrawable) current, c2125c.m64545I(m64548F, m64548F2), m64544J);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            c2124b = new C2126d((AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof Animatable) {
                c2124b = new C2124b((Animatable) current);
            }
            return false;
        }
        c2124b.mo64539c();
        this.f9070p = c2124b;
        this.f9072r = m64536c;
        this.f9071q = i;
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC2129g abstractC2129g = this.f9070p;
        if (abstractC2129g != null && (visible || z2)) {
            if (z) {
                abstractC2129g.mo64539c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(C2125c c2125c, Resources resources) {
        super(null);
        this.f9071q = -1;
        this.f9072r = -1;
        mo64499h(new C2125c(c2125c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
