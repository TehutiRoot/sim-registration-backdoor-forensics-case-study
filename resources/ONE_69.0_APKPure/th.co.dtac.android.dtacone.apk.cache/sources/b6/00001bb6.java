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
    public C2107c f9157o;

    /* renamed from: p */
    public AbstractC2111g f9158p;

    /* renamed from: q */
    public int f9159q;

    /* renamed from: r */
    public int f9160r;

    /* renamed from: s */
    public boolean f9161s;

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$b */
    /* loaded from: classes.dex */
    public static class C2106b extends AbstractC2111g {

        /* renamed from: a */
        public final Animatable f9162a;

        public C2106b(Animatable animatable) {
            super();
            this.f9162a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: c */
        public void mo64490c() {
            this.f9162a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: d */
        public void mo64489d() {
            this.f9162a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$c */
    /* loaded from: classes.dex */
    public static class C2107c extends StateListDrawableCompat.C2116a {

        /* renamed from: K */
        public LongSparseArray f9163K;

        /* renamed from: L */
        public SparseArrayCompat f9164L;

        public C2107c(C2107c c2107c, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(c2107c, animatedStateListDrawableCompat, resources);
            if (c2107c != null) {
                this.f9163K = c2107c.f9163K;
                this.f9164L = c2107c.f9164L;
                return;
            }
            this.f9163K = new LongSparseArray();
            this.f9164L = new SparseArrayCompat();
        }

        /* renamed from: E */
        public static long m64500E(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: C */
        public int m64502C(int[] iArr, Drawable drawable, int i) {
            int m64445A = super.m64445A(iArr, drawable);
            this.f9164L.put(m64445A, Integer.valueOf(i));
            return m64445A;
        }

        /* renamed from: D */
        public int m64501D(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int m64476a = super.m64476a(drawable);
            long m64500E = m64500E(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = m64476a;
            this.f9163K.append(m64500E, Long.valueOf(j2 | j));
            if (z) {
                this.f9163K.append(m64500E(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m64476a;
        }

        /* renamed from: F */
        public int m64499F(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f9164L.get(i, 0)).intValue();
        }

        /* renamed from: G */
        public int m64498G(int[] iArr) {
            int m64444B = super.m64444B(iArr);
            if (m64444B >= 0) {
                return m64444B;
            }
            return super.m64444B(StateSet.WILD_CARD);
        }

        /* renamed from: H */
        public int m64497H(int i, int i2) {
            return (int) ((Long) this.f9163K.get(m64500E(i, i2), -1L)).longValue();
        }

        /* renamed from: I */
        public boolean m64496I(int i, int i2) {
            if ((((Long) this.f9163K.get(m64500E(i, i2), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: J */
        public boolean m64495J(int i, int i2) {
            if ((((Long) this.f9163K.get(m64500E(i, i2), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2116a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2116a, androidx.appcompat.graphics.drawable.DrawableContainerCompat.AbstractC2115d
        /* renamed from: s */
        public void mo64442s() {
            this.f9163K = this.f9163K.m69376clone();
            this.f9164L = this.f9164L.m69377clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.C2116a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$d */
    /* loaded from: classes.dex */
    public static class C2108d extends AbstractC2111g {

        /* renamed from: a */
        public final AnimatedVectorDrawableCompat f9165a;

        public C2108d(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f9165a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: c */
        public void mo64490c() {
            this.f9165a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: d */
        public void mo64489d() {
            this.f9165a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$e */
    /* loaded from: classes.dex */
    public static class C2109e extends AbstractC2111g {

        /* renamed from: a */
        public final ObjectAnimator f9166a;

        /* renamed from: b */
        public final boolean f9167b;

        public C2109e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            int i2 = z ? 0 : numberOfFrames - 1;
            C2110f c2110f = new C2110f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            Compatibility.Api18Impl.setAutoCancel(ofInt, true);
            ofInt.setDuration(c2110f.m64494a());
            ofInt.setInterpolator(c2110f);
            this.f9167b = z2;
            this.f9166a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: a */
        public boolean mo64492a() {
            return this.f9167b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: b */
        public void mo64491b() {
            this.f9166a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: c */
        public void mo64490c() {
            this.f9166a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AbstractC2111g
        /* renamed from: d */
        public void mo64489d() {
            this.f9166a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$f */
    /* loaded from: classes.dex */
    public static class C2110f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f9168a;

        /* renamed from: b */
        public int f9169b;

        /* renamed from: c */
        public int f9170c;

        public C2110f(AnimationDrawable animationDrawable, boolean z) {
            m64493b(animationDrawable, z);
        }

        /* renamed from: a */
        public int m64494a() {
            return this.f9170c;
        }

        /* renamed from: b */
        public int m64493b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9169b = numberOfFrames;
            int[] iArr = this.f9168a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9168a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9168a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f9170c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * this.f9170c) + 0.5f);
            int i2 = this.f9169b;
            int[] iArr = this.f9168a;
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
                f2 = i / this.f9170c;
            } else {
                f2 = 0.0f;
            }
            return (i3 / i2) + f2;
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2111g {
        public AbstractC2111g() {
        }

        /* renamed from: a */
        public boolean mo64492a() {
            return false;
        }

        /* renamed from: b */
        public void mo64491b() {
        }

        /* renamed from: c */
        public abstract void mo64490c();

        /* renamed from: d */
        public abstract void mo64489d();
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
    private void m64506o() {
        onStateChange(getState());
    }

    public void addState(@NonNull int[] iArr, @NonNull Drawable drawable, int i) {
        ObjectsCompat.requireNonNull(drawable);
        this.f9157o.m64502C(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, @NonNull T t, boolean z) {
        ObjectsCompat.requireNonNull(t);
        this.f9157o.m64501D(i, i2, t, z);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: h */
    public void mo64450h(DrawableContainerCompat.AbstractC2115d abstractC2115d) {
        super.mo64450h(abstractC2115d);
        if (abstractC2115d instanceof C2107c) {
            this.f9157o = (C2107c) abstractC2115d;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(obtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        m64508m(obtainAttributes);
        m64482i(resources);
        obtainAttributes.recycle();
        m64509l(context, resources, xmlPullParser, attributeSet, theme);
        m64506o();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC2111g abstractC2111g = this.f9158p;
        if (abstractC2111g != null) {
            abstractC2111g.mo64489d();
            this.f9158p = null;
            m64483g(this.f9159q);
            this.f9159q = -1;
            this.f9160r = -1;
        }
    }

    /* renamed from: l */
    public final void m64509l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            m64505p(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            m64504q(context, resources, xmlPullParser, attributeSet, theme);
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
    public final void m64508m(TypedArray typedArray) {
        C2107c c2107c = this.f9157o;
        c2107c.f9197d |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        c2107c.m64454y(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, c2107c.f9202i));
        c2107c.m64458u(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, c2107c.f9205l));
        c2107c.m64457v(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, c2107c.f9185A));
        c2107c.m64456w(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, c2107c.f9186B));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, c2107c.f9217x));
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f9161s && super.mutate() == this) {
            this.f9157o.mo64442s();
            this.f9161s = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* renamed from: n */
    public C2107c mo64449j() {
        return new C2107c(this.f9157o, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean z;
        int m64498G = this.f9157o.m64498G(iArr);
        if (m64498G != m64487c() && (m64503r(m64498G) || m64483g(m64498G))) {
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
    public final int m64505p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
        int[] m64448k = m64448k(attributeSet);
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
            return this.f9157o.m64502C(m64448k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: q */
    public final int m64504q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                return this.f9157o.m64501D(resourceId, resourceId2, drawable, z);
            }
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    public final boolean m64503r(int i) {
        int m64487c;
        int m64497H;
        AbstractC2111g c2106b;
        AbstractC2111g abstractC2111g = this.f9158p;
        if (abstractC2111g != null) {
            if (i == this.f9159q) {
                return true;
            }
            if (i == this.f9160r && abstractC2111g.mo64492a()) {
                abstractC2111g.mo64491b();
                this.f9159q = this.f9160r;
                this.f9160r = i;
                return true;
            }
            m64487c = this.f9159q;
            abstractC2111g.mo64489d();
        } else {
            m64487c = m64487c();
        }
        this.f9158p = null;
        this.f9160r = -1;
        this.f9159q = -1;
        C2107c c2107c = this.f9157o;
        int m64499F = c2107c.m64499F(m64487c);
        int m64499F2 = c2107c.m64499F(i);
        if (m64499F2 == 0 || m64499F == 0 || (m64497H = c2107c.m64497H(m64499F, m64499F2)) < 0) {
            return false;
        }
        boolean m64495J = c2107c.m64495J(m64499F, m64499F2);
        m64483g(m64497H);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c2106b = new C2109e((AnimationDrawable) current, c2107c.m64496I(m64499F, m64499F2), m64495J);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            c2106b = new C2108d((AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof Animatable) {
                c2106b = new C2106b((Animatable) current);
            }
            return false;
        }
        c2106b.mo64490c();
        this.f9158p = c2106b;
        this.f9160r = m64487c;
        this.f9159q = i;
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC2111g abstractC2111g = this.f9158p;
        if (abstractC2111g != null && (visible || z2)) {
            if (z) {
                abstractC2111g.mo64490c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(C2107c c2107c, Resources resources) {
        super(null);
        this.f9159q = -1;
        this.f9160r = -1;
        mo64450h(new C2107c(c2107c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}