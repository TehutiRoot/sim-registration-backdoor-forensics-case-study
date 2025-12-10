package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {

    /* renamed from: m */
    public C2134a f9146m;

    /* renamed from: n */
    public boolean f9147n;

    /* renamed from: androidx.appcompat.graphics.drawable.StateListDrawableCompat$a */
    /* loaded from: classes.dex */
    public static class C2134a extends DrawableContainerCompat.AbstractC2133d {

        /* renamed from: J */
        public int[][] f9148J;

        public C2134a(C2134a c2134a, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(c2134a, stateListDrawableCompat, resources);
            if (c2134a != null) {
                this.f9148J = c2134a.f9148J;
            } else {
                this.f9148J = new int[m64520f()];
            }
        }

        /* renamed from: A */
        public int m64494A(int[] iArr, Drawable drawable) {
            int m64525a = m64525a(drawable);
            this.f9148J[m64525a] = iArr;
            return m64525a;
        }

        /* renamed from: B */
        public int m64493B(int[] iArr) {
            int[][] iArr2 = this.f9148J;
            int m64518h = m64518h();
            for (int i = 0; i < m64518h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.AbstractC2133d
        /* renamed from: o */
        public void mo64492o(int i, int i2) {
            super.mo64492o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f9148J, 0, iArr, 0, i);
            this.f9148J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.AbstractC2133d
        /* renamed from: s */
        public void mo64491s() {
            int[] iArr;
            int[][] iArr2 = this.f9148J;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f9148J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f9148J = iArr3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }
    }

    public StateListDrawableCompat() {
        this(null, null);
    }

    /* renamed from: l */
    private void m64496l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        C2134a c2134a = this.f9146m;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next2 != 3) {
                    if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.StateListDrawableItem);
                        int resourceId = obtainAttributes.getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
                        if (resourceId > 0) {
                            drawable = ResourceManagerInternal.get().getDrawable(context, resourceId);
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
                                drawable = Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                            } else {
                                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        c2134a.m64494A(m64497k, drawable);
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
    private void m64495m(TypedArray typedArray) {
        C2134a c2134a = this.f9146m;
        c2134a.f9109d |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        c2134a.f9114i = typedArray.getBoolean(R.styleable.StateListDrawable_android_variablePadding, c2134a.f9114i);
        c2134a.f9117l = typedArray.getBoolean(R.styleable.StateListDrawable_android_constantSize, c2134a.f9117l);
        c2134a.f9097A = typedArray.getInt(R.styleable.StateListDrawable_android_enterFadeDuration, c2134a.f9097A);
        c2134a.f9098B = typedArray.getInt(R.styleable.StateListDrawable_android_exitFadeDuration, c2134a.f9098B);
        c2134a.f9129x = typedArray.getBoolean(R.styleable.StateListDrawable_android_dither, c2134a.f9129x);
    }

    public void addState(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f9146m.m64494A(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: h */
    public void mo64499h(DrawableContainerCompat.AbstractC2133d abstractC2133d) {
        super.mo64499h(abstractC2133d);
        if (abstractC2133d instanceof C2134a) {
            this.f9146m = (C2134a) abstractC2133d;
        }
    }

    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.StateListDrawable);
        setVisible(obtainAttributes.getBoolean(R.styleable.StateListDrawable_android_visible, true), true);
        m64495m(obtainAttributes);
        m64531i(resources);
        obtainAttributes.recycle();
        m64496l(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* renamed from: j */
    public C2134a mo64500b() {
        return new C2134a(this.f9146m, this, null);
    }

    /* renamed from: k */
    public int[] m64497k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f9147n && super.mutate() == this) {
            this.f9146m.mo64491s();
            this.f9147n = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m64493B = this.f9146m.m64493B(iArr);
        if (m64493B < 0) {
            m64493B = this.f9146m.m64493B(StateSet.WILD_CARD);
        }
        if (!m64532g(m64493B) && !onStateChange) {
            return false;
        }
        return true;
    }

    public StateListDrawableCompat(C2134a c2134a, Resources resources) {
        mo64499h(new C2134a(c2134a, this, resources));
        onStateChange(getState());
    }

    public StateListDrawableCompat(C2134a c2134a) {
        if (c2134a != null) {
            mo64499h(c2134a);
        }
    }
}
