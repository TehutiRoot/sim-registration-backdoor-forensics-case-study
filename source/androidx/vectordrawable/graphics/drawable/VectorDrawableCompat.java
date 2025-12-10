package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class VectorDrawableCompat extends P02 {

    /* renamed from: k */
    public static final PorterDuff.Mode f37878k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C5156h f37879b;

    /* renamed from: c */
    public PorterDuffColorFilter f37880c;

    /* renamed from: d */
    public ColorFilter f37881d;

    /* renamed from: e */
    public boolean f37882e;

    /* renamed from: f */
    public boolean f37883f;

    /* renamed from: g */
    public Drawable.ConstantState f37884g;

    /* renamed from: h */
    public final float[] f37885h;

    /* renamed from: i */
    public final Matrix f37886i;

    /* renamed from: j */
    public final Rect f37887j;

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$b */
    /* loaded from: classes2.dex */
    public static class C5150b extends AbstractC5154f {
        public C5150b() {
        }

        /* renamed from: f */
        private void m52544f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f37914b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f37913a = PathParser.createNodesFromPathData(string2);
            }
            this.f37915c = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC5154f
        /* renamed from: c */
        public boolean mo52534c() {
            return true;
        }

        /* renamed from: e */
        public void m52545e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AbstractC13060p4.f76471d);
            m52544f(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        public C5150b(C5150b c5150b) {
            super(c5150b);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5153e {
        public AbstractC5153e() {
        }

        /* renamed from: a */
        public boolean mo52536a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo52535b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$h */
    /* loaded from: classes2.dex */
    public static class C5156h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f37934a;

        /* renamed from: b */
        public C5155g f37935b;

        /* renamed from: c */
        public ColorStateList f37936c;

        /* renamed from: d */
        public PorterDuff.Mode f37937d;

        /* renamed from: e */
        public boolean f37938e;

        /* renamed from: f */
        public Bitmap f37939f;

        /* renamed from: g */
        public ColorStateList f37940g;

        /* renamed from: h */
        public PorterDuff.Mode f37941h;

        /* renamed from: i */
        public int f37942i;

        /* renamed from: j */
        public boolean f37943j;

        /* renamed from: k */
        public boolean f37944k;

        /* renamed from: l */
        public Paint f37945l;

        public C5156h(C5156h c5156h) {
            this.f37936c = null;
            this.f37937d = VectorDrawableCompat.f37878k;
            if (c5156h != null) {
                this.f37934a = c5156h.f37934a;
                C5155g c5155g = new C5155g(c5156h.f37935b);
                this.f37935b = c5155g;
                if (c5156h.f37935b.f37922e != null) {
                    c5155g.f37922e = new Paint(c5156h.f37935b.f37922e);
                }
                if (c5156h.f37935b.f37921d != null) {
                    this.f37935b.f37921d = new Paint(c5156h.f37935b.f37921d);
                }
                this.f37936c = c5156h.f37936c;
                this.f37937d = c5156h.f37937d;
                this.f37938e = c5156h.f37938e;
            }
        }

        /* renamed from: a */
        public boolean m52525a(int i, int i2) {
            if (i == this.f37939f.getWidth() && i2 == this.f37939f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m52524b() {
            if (!this.f37944k && this.f37940g == this.f37936c && this.f37941h == this.f37937d && this.f37943j == this.f37938e && this.f37942i == this.f37935b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m52523c(int i, int i2) {
            if (this.f37939f == null || !m52525a(i, i2)) {
                this.f37939f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f37944k = true;
            }
        }

        /* renamed from: d */
        public void m52522d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f37939f, (Rect) null, rect, m52521e(colorFilter));
        }

        /* renamed from: e */
        public Paint m52521e(ColorFilter colorFilter) {
            if (!m52520f() && colorFilter == null) {
                return null;
            }
            if (this.f37945l == null) {
                Paint paint = new Paint();
                this.f37945l = paint;
                paint.setFilterBitmap(true);
            }
            this.f37945l.setAlpha(this.f37935b.getRootAlpha());
            this.f37945l.setColorFilter(colorFilter);
            return this.f37945l;
        }

        /* renamed from: f */
        public boolean m52520f() {
            if (this.f37935b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean m52519g() {
            return this.f37935b.m52527f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f37934a;
        }

        /* renamed from: h */
        public boolean m52518h(int[] iArr) {
            boolean m52526g = this.f37935b.m52526g(iArr);
            this.f37944k |= m52526g;
            return m52526g;
        }

        /* renamed from: i */
        public void m52517i() {
            this.f37940g = this.f37936c;
            this.f37941h = this.f37937d;
            this.f37942i = this.f37935b.getRootAlpha();
            this.f37943j = this.f37938e;
            this.f37944k = false;
        }

        /* renamed from: j */
        public void m52516j(int i, int i2) {
            this.f37939f.eraseColor(0);
            this.f37935b.m52531b(new Canvas(this.f37939f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public C5156h() {
            this.f37936c = null;
            this.f37937d = VectorDrawableCompat.f37878k;
            this.f37935b = new C5155g();
        }
    }

    public VectorDrawableCompat() {
        this.f37883f = true;
        this.f37885h = new float[9];
        this.f37886i = new Matrix();
        this.f37887j = new Rect();
        this.f37879b = new C5156h();
    }

    /* renamed from: a */
    public static int m52553a(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @Nullable
    public static VectorDrawableCompat create(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f4617a = ResourcesCompat.getDrawable(resources, i, theme);
            vectorDrawableCompat.f37884g = new C5157i(vectorDrawableCompat.f4617a.getConstantState());
            return vectorDrawableCompat;
        }
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
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m52549e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: b */
    public Object m52552b(String str) {
        return this.f37879b.f37935b.f37933p.get(str);
    }

    /* renamed from: c */
    public final void m52551c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C5156h c5156h = this.f37879b;
        C5155g c5155g = c5156h.f37935b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5155g.f37925h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C5152d c5152d = (C5152d) arrayDeque.peek();
                if (ClientCookie.PATH_ATTR.equals(name)) {
                    C5151c c5151c = new C5151c();
                    c5151c.m52541g(resources, attributeSet, theme, xmlPullParser);
                    c5152d.f37901b.add(c5151c);
                    if (c5151c.getPathName() != null) {
                        c5155g.f37933p.put(c5151c.getPathName(), c5151c);
                    }
                    c5156h.f37934a = c5151c.f37916d | c5156h.f37934a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C5150b c5150b = new C5150b();
                    c5150b.m52545e(resources, attributeSet, theme, xmlPullParser);
                    c5152d.f37901b.add(c5150b);
                    if (c5150b.getPathName() != null) {
                        c5155g.f37933p.put(c5150b.getPathName(), c5150b);
                    }
                    c5156h.f37934a = c5150b.f37916d | c5156h.f37934a;
                } else if ("group".equals(name)) {
                    C5152d c5152d2 = new C5152d();
                    c5152d2.m52539c(resources, attributeSet, theme, xmlPullParser);
                    c5152d.f37901b.add(c5152d2);
                    arrayDeque.push(c5152d2);
                    if (c5152d2.getGroupName() != null) {
                        c5155g.f37933p.put(c5152d2.getGroupName(), c5152d2);
                    }
                    c5156h.f37934a = c5152d2.f37910k | c5156h.f37934a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.canApplyTheme(drawable);
            return false;
        }
        return false;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public final boolean m52550d() {
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f37887j);
        if (this.f37887j.width() > 0 && this.f37887j.height() > 0) {
            ColorFilter colorFilter = this.f37881d;
            if (colorFilter == null) {
                colorFilter = this.f37880c;
            }
            canvas.getMatrix(this.f37886i);
            this.f37886i.getValues(this.f37885h);
            float abs = Math.abs(this.f37885h[0]);
            float abs2 = Math.abs(this.f37885h[4]);
            float abs3 = Math.abs(this.f37885h[1]);
            float abs4 = Math.abs(this.f37885h[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.f37887j.width() * abs));
            int min2 = Math.min(2048, (int) (this.f37887j.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f37887j;
                canvas.translate(rect.left, rect.top);
                if (m52550d()) {
                    canvas.translate(this.f37887j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f37887j.offsetTo(0, 0);
                this.f37879b.m52523c(min, min2);
                if (!this.f37883f) {
                    this.f37879b.m52516j(min, min2);
                } else if (!this.f37879b.m52524b()) {
                    this.f37879b.m52516j(min, min2);
                    this.f37879b.m52517i();
                }
                this.f37879b.m52522d(canvas, colorFilter, this.f37887j);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: f */
    public void m52548f(boolean z) {
        this.f37883f = z;
    }

    /* renamed from: g */
    public final void m52547g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C5156h c5156h = this.f37879b;
        C5155g c5155g = c5156h.f37935b;
        c5156h.f37937d = m52549e(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            c5156h.f37936c = namedColorStateList;
        }
        c5156h.f37938e = TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, c5156h.f37938e);
        c5155g.f37928k = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, c5155g.f37928k);
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, c5155g.f37929l);
        c5155g.f37929l = namedFloat;
        if (c5155g.f37928k > 0.0f) {
            if (namedFloat > 0.0f) {
                c5155g.f37926i = typedArray.getDimension(3, c5155g.f37926i);
                float dimension = typedArray.getDimension(2, c5155g.f37927j);
                c5155g.f37927j = dimension;
                if (c5155g.f37926i > 0.0f) {
                    if (dimension > 0.0f) {
                        c5155g.setAlpha(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, c5155g.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            c5155g.f37931n = string;
                            c5155g.f37933p.put(string, c5155g);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.getAlpha(drawable);
        }
        return this.f37879b.f37935b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f37879b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.getColorFilter(drawable);
        }
        return this.f37881d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4617a != null && Build.VERSION.SDK_INT >= 24) {
            return new C5157i(this.f4617a.getConstantState());
        }
        this.f37879b.f37934a = getChangingConfigurations();
        return this.f37879b;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f37879b.f37935b.f37927j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f37879b.f37935b.f37926i;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public float getPixelSize() {
        C5155g c5155g;
        C5156h c5156h = this.f37879b;
        if (c5156h != null && (c5155g = c5156h.f37935b) != null) {
            float f = c5155g.f37926i;
            if (f != 0.0f) {
                float f2 = c5155g.f37927j;
                if (f2 != 0.0f) {
                    float f3 = c5155g.f37929l;
                    if (f3 != 0.0f) {
                        float f4 = c5155g.f37928k;
                        if (f4 != 0.0f) {
                            return Math.min(f4 / f, f3 / f2);
                        }
                        return 1.0f;
                    }
                    return 1.0f;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public PorterDuffColorFilter m52546h(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.isAutoMirrored(drawable);
        }
        return this.f37879b.f37938e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C5156h c5156h;
        ColorStateList colorStateList;
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((c5156h = this.f37879b) == null || (!c5156h.m52519g() && ((colorStateList = this.f37879b.f37936c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f37882e && super.mutate() == this) {
            this.f37879b = new C5156h(this.f37879b);
            this.f37882e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C5156h c5156h = this.f37879b;
        ColorStateList colorStateList = c5156h.f37936c;
        if (colorStateList != null && (mode = c5156h.f37937d) != null) {
            this.f37880c = m52546h(this.f37880c, colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        if (c5156h.m52519g() && c5156h.m52518h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f37879b.f37935b.getRootAlpha() != i) {
            this.f37879b.f37935b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f37879b.f37938e = z;
        }
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        C5156h c5156h = this.f37879b;
        if (c5156h.f37936c != colorStateList) {
            c5156h.f37936c = colorStateList;
            this.f37880c = m52546h(this.f37880c, colorStateList, c5156h.f37937d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        C5156h c5156h = this.f37879b;
        if (c5156h.f37937d != mode) {
            c5156h.f37937d = mode;
            this.f37880c = m52546h(this.f37880c, c5156h.f37936c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$i */
    /* loaded from: classes2.dex */
    public static class C5157i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f37946a;

        public C5157i(Drawable.ConstantState constantState) {
            this.f37946a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f37946a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f37946a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f4617a = (VectorDrawable) this.f37946a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f4617a = (VectorDrawable) this.f37946a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f4617a = (VectorDrawable) this.f37946a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f37881d = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5154f extends AbstractC5153e {

        /* renamed from: a */
        public PathParser.PathDataNode[] f37913a;

        /* renamed from: b */
        public String f37914b;

        /* renamed from: c */
        public int f37915c;

        /* renamed from: d */
        public int f37916d;

        public AbstractC5154f() {
            super();
            this.f37913a = null;
            this.f37915c = 0;
        }

        /* renamed from: c */
        public boolean mo52534c() {
            return false;
        }

        /* renamed from: d */
        public void m52533d(Path path) {
            path.reset();
            PathParser.PathDataNode[] pathDataNodeArr = this.f37913a;
            if (pathDataNodeArr != null) {
                PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
            }
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f37913a;
        }

        public String getPathName() {
            return this.f37914b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.f37913a, pathDataNodeArr)) {
                this.f37913a = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.f37913a, pathDataNodeArr);
            }
        }

        public AbstractC5154f(AbstractC5154f abstractC5154f) {
            super();
            this.f37913a = null;
            this.f37915c = 0;
            this.f37914b = abstractC5154f.f37914b;
            this.f37916d = abstractC5154f.f37916d;
            this.f37913a = PathParser.deepCopyNodes(abstractC5154f.f37913a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C5156h c5156h = this.f37879b;
        c5156h.f37935b = new C5155g();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AbstractC13060p4.f76468a);
        m52547g(obtainAttributes, xmlPullParser, theme);
        obtainAttributes.recycle();
        c5156h.f37934a = getChangingConfigurations();
        c5156h.f37944k = true;
        m52551c(resources, xmlPullParser, attributeSet, theme);
        this.f37880c = m52546h(this.f37880c, c5156h.f37936c, c5156h.f37937d);
    }

    public VectorDrawableCompat(C5156h c5156h) {
        this.f37883f = true;
        this.f37885h = new float[9];
        this.f37886i = new Matrix();
        this.f37887j = new Rect();
        this.f37879b = c5156h;
        this.f37880c = m52546h(this.f37880c, c5156h.f37936c, c5156h.f37937d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$c */
    /* loaded from: classes2.dex */
    public static class C5151c extends AbstractC5154f {

        /* renamed from: e */
        public int[] f37888e;

        /* renamed from: f */
        public ComplexColorCompat f37889f;

        /* renamed from: g */
        public float f37890g;

        /* renamed from: h */
        public ComplexColorCompat f37891h;

        /* renamed from: i */
        public float f37892i;

        /* renamed from: j */
        public float f37893j;

        /* renamed from: k */
        public float f37894k;

        /* renamed from: l */
        public float f37895l;

        /* renamed from: m */
        public float f37896m;

        /* renamed from: n */
        public Paint.Cap f37897n;

        /* renamed from: o */
        public Paint.Join f37898o;

        /* renamed from: p */
        public float f37899p;

        public C5151c() {
            this.f37890g = 0.0f;
            this.f37892i = 1.0f;
            this.f37893j = 1.0f;
            this.f37894k = 0.0f;
            this.f37895l = 1.0f;
            this.f37896m = 0.0f;
            this.f37897n = Paint.Cap.BUTT;
            this.f37898o = Paint.Join.MITER;
            this.f37899p = 4.0f;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC5153e
        /* renamed from: a */
        public boolean mo52536a() {
            if (!this.f37891h.isStateful() && !this.f37889f.isStateful()) {
                return false;
            }
            return true;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC5153e
        /* renamed from: b */
        public boolean mo52535b(int[] iArr) {
            return this.f37889f.onStateChanged(iArr) | this.f37891h.onStateChanged(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m52543e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m52542f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m52541g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AbstractC13060p4.f76470c);
            m52540h(obtainAttributes, xmlPullParser, theme);
            obtainAttributes.recycle();
        }

        public float getFillAlpha() {
            return this.f37893j;
        }

        @ColorInt
        public int getFillColor() {
            return this.f37891h.getColor();
        }

        public float getStrokeAlpha() {
            return this.f37892i;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f37889f.getColor();
        }

        public float getStrokeWidth() {
            return this.f37890g;
        }

        public float getTrimPathEnd() {
            return this.f37895l;
        }

        public float getTrimPathOffset() {
            return this.f37896m;
        }

        public float getTrimPathStart() {
            return this.f37894k;
        }

        /* renamed from: h */
        public final void m52540h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f37888e = null;
            if (!TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f37914b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f37913a = PathParser.createNodesFromPathData(string2);
            }
            this.f37891h = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f37893j = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f37893j);
            this.f37897n = m52543e(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f37897n);
            this.f37898o = m52542f(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f37898o);
            this.f37899p = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f37899p);
            this.f37889f = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f37892i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.f37892i);
            this.f37890g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f37890g);
            this.f37895l = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.f37895l);
            this.f37896m = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.f37896m);
            this.f37894k = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.f37894k);
            this.f37915c = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.f37915c);
        }

        public void setFillAlpha(float f) {
            this.f37893j = f;
        }

        public void setFillColor(int i) {
            this.f37891h.setColor(i);
        }

        public void setStrokeAlpha(float f) {
            this.f37892i = f;
        }

        public void setStrokeColor(int i) {
            this.f37889f.setColor(i);
        }

        public void setStrokeWidth(float f) {
            this.f37890g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f37895l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f37896m = f;
        }

        public void setTrimPathStart(float f) {
            this.f37894k = f;
        }

        public C5151c(C5151c c5151c) {
            super(c5151c);
            this.f37890g = 0.0f;
            this.f37892i = 1.0f;
            this.f37893j = 1.0f;
            this.f37894k = 0.0f;
            this.f37895l = 1.0f;
            this.f37896m = 0.0f;
            this.f37897n = Paint.Cap.BUTT;
            this.f37898o = Paint.Join.MITER;
            this.f37899p = 4.0f;
            this.f37888e = c5151c.f37888e;
            this.f37889f = c5151c.f37889f;
            this.f37890g = c5151c.f37890g;
            this.f37892i = c5151c.f37892i;
            this.f37891h = c5151c.f37891h;
            this.f37915c = c5151c.f37915c;
            this.f37893j = c5151c.f37893j;
            this.f37894k = c5151c.f37894k;
            this.f37895l = c5151c.f37895l;
            this.f37896m = c5151c.f37896m;
            this.f37897n = c5151c.f37897n;
            this.f37898o = c5151c.f37898o;
            this.f37899p = c5151c.f37899p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$g */
    /* loaded from: classes2.dex */
    public static class C5155g {

        /* renamed from: q */
        public static final Matrix f37917q = new Matrix();

        /* renamed from: a */
        public final Path f37918a;

        /* renamed from: b */
        public final Path f37919b;

        /* renamed from: c */
        public final Matrix f37920c;

        /* renamed from: d */
        public Paint f37921d;

        /* renamed from: e */
        public Paint f37922e;

        /* renamed from: f */
        public PathMeasure f37923f;

        /* renamed from: g */
        public int f37924g;

        /* renamed from: h */
        public final C5152d f37925h;

        /* renamed from: i */
        public float f37926i;

        /* renamed from: j */
        public float f37927j;

        /* renamed from: k */
        public float f37928k;

        /* renamed from: l */
        public float f37929l;

        /* renamed from: m */
        public int f37930m;

        /* renamed from: n */
        public String f37931n;

        /* renamed from: o */
        public Boolean f37932o;

        /* renamed from: p */
        public final ArrayMap f37933p;

        public C5155g() {
            this.f37920c = new Matrix();
            this.f37926i = 0.0f;
            this.f37927j = 0.0f;
            this.f37928k = 0.0f;
            this.f37929l = 0.0f;
            this.f37930m = 255;
            this.f37931n = null;
            this.f37932o = null;
            this.f37933p = new ArrayMap();
            this.f37925h = new C5152d();
            this.f37918a = new Path();
            this.f37919b = new Path();
        }

        /* renamed from: a */
        public static float m52532a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void m52531b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m52530c(this.f37925h, f37917q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void m52530c(C5152d c5152d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c5152d.f37900a.set(matrix);
            c5152d.f37900a.preConcat(c5152d.f37909j);
            canvas.save();
            for (int i3 = 0; i3 < c5152d.f37901b.size(); i3++) {
                AbstractC5153e abstractC5153e = (AbstractC5153e) c5152d.f37901b.get(i3);
                if (abstractC5153e instanceof C5152d) {
                    m52530c((C5152d) abstractC5153e, c5152d.f37900a, canvas, i, i2, colorFilter);
                } else if (abstractC5153e instanceof AbstractC5154f) {
                    m52529d(c5152d, (AbstractC5154f) abstractC5153e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m52529d(C5152d c5152d, AbstractC5154f abstractC5154f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = i / this.f37928k;
            float f2 = i2 / this.f37929l;
            float min = Math.min(f, f2);
            Matrix matrix = c5152d.f37900a;
            this.f37920c.set(matrix);
            this.f37920c.postScale(f, f2);
            float m52528e = m52528e(matrix);
            if (m52528e == 0.0f) {
                return;
            }
            abstractC5154f.m52533d(this.f37918a);
            Path path = this.f37918a;
            this.f37919b.reset();
            if (abstractC5154f.mo52534c()) {
                Path path2 = this.f37919b;
                if (abstractC5154f.f37915c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f37919b.addPath(path, this.f37920c);
                canvas.clipPath(this.f37919b);
                return;
            }
            C5151c c5151c = (C5151c) abstractC5154f;
            float f3 = c5151c.f37894k;
            if (f3 != 0.0f || c5151c.f37895l != 1.0f) {
                float f4 = c5151c.f37896m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c5151c.f37895l + f4) % 1.0f;
                if (this.f37923f == null) {
                    this.f37923f = new PathMeasure();
                }
                this.f37923f.setPath(this.f37918a, false);
                float length = this.f37923f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f37923f.getSegment(f7, length, path, true);
                    this.f37923f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f37923f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f37919b.addPath(path, this.f37920c);
            if (c5151c.f37891h.willDraw()) {
                ComplexColorCompat complexColorCompat = c5151c.f37891h;
                if (this.f37922e == null) {
                    Paint paint = new Paint(1);
                    this.f37922e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f37922e;
                if (complexColorCompat.isGradient()) {
                    Shader shader = complexColorCompat.getShader();
                    shader.setLocalMatrix(this.f37920c);
                    paint2.setShader(shader);
                    paint2.setAlpha(Math.round(c5151c.f37893j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(VectorDrawableCompat.m52553a(complexColorCompat.getColor(), c5151c.f37893j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f37919b;
                if (c5151c.f37915c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f37919b, paint2);
            }
            if (c5151c.f37889f.willDraw()) {
                ComplexColorCompat complexColorCompat2 = c5151c.f37889f;
                if (this.f37921d == null) {
                    Paint paint3 = new Paint(1);
                    this.f37921d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f37921d;
                Paint.Join join = c5151c.f37898o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c5151c.f37897n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c5151c.f37899p);
                if (complexColorCompat2.isGradient()) {
                    Shader shader2 = complexColorCompat2.getShader();
                    shader2.setLocalMatrix(this.f37920c);
                    paint4.setShader(shader2);
                    paint4.setAlpha(Math.round(c5151c.f37892i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(VectorDrawableCompat.m52553a(complexColorCompat2.getColor(), c5151c.f37892i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c5151c.f37890g * min * m52528e);
                canvas.drawPath(this.f37919b, paint4);
            }
        }

        /* renamed from: e */
        public final float m52528e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m52532a = m52532a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(m52532a) / max;
        }

        /* renamed from: f */
        public boolean m52527f() {
            if (this.f37932o == null) {
                this.f37932o = Boolean.valueOf(this.f37925h.mo52536a());
            }
            return this.f37932o.booleanValue();
        }

        /* renamed from: g */
        public boolean m52526g(int[] iArr) {
            return this.f37925h.mo52535b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f37930m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f37930m = i;
        }

        public C5155g(C5155g c5155g) {
            this.f37920c = new Matrix();
            this.f37926i = 0.0f;
            this.f37927j = 0.0f;
            this.f37928k = 0.0f;
            this.f37929l = 0.0f;
            this.f37930m = 255;
            this.f37931n = null;
            this.f37932o = null;
            ArrayMap arrayMap = new ArrayMap();
            this.f37933p = arrayMap;
            this.f37925h = new C5152d(c5155g.f37925h, arrayMap);
            this.f37918a = new Path(c5155g.f37918a);
            this.f37919b = new Path(c5155g.f37919b);
            this.f37926i = c5155g.f37926i;
            this.f37927j = c5155g.f37927j;
            this.f37928k = c5155g.f37928k;
            this.f37929l = c5155g.f37929l;
            this.f37924g = c5155g.f37924g;
            this.f37930m = c5155g.f37930m;
            this.f37931n = c5155g.f37931n;
            String str = c5155g.f37931n;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f37932o = c5155g.f37932o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$d */
    /* loaded from: classes2.dex */
    public static class C5152d extends AbstractC5153e {

        /* renamed from: a */
        public final Matrix f37900a;

        /* renamed from: b */
        public final ArrayList f37901b;

        /* renamed from: c */
        public float f37902c;

        /* renamed from: d */
        public float f37903d;

        /* renamed from: e */
        public float f37904e;

        /* renamed from: f */
        public float f37905f;

        /* renamed from: g */
        public float f37906g;

        /* renamed from: h */
        public float f37907h;

        /* renamed from: i */
        public float f37908i;

        /* renamed from: j */
        public final Matrix f37909j;

        /* renamed from: k */
        public int f37910k;

        /* renamed from: l */
        public int[] f37911l;

        /* renamed from: m */
        public String f37912m;

        public C5152d(C5152d c5152d, ArrayMap arrayMap) {
            super();
            AbstractC5154f c5150b;
            this.f37900a = new Matrix();
            this.f37901b = new ArrayList();
            this.f37902c = 0.0f;
            this.f37903d = 0.0f;
            this.f37904e = 0.0f;
            this.f37905f = 1.0f;
            this.f37906g = 1.0f;
            this.f37907h = 0.0f;
            this.f37908i = 0.0f;
            Matrix matrix = new Matrix();
            this.f37909j = matrix;
            this.f37912m = null;
            this.f37902c = c5152d.f37902c;
            this.f37903d = c5152d.f37903d;
            this.f37904e = c5152d.f37904e;
            this.f37905f = c5152d.f37905f;
            this.f37906g = c5152d.f37906g;
            this.f37907h = c5152d.f37907h;
            this.f37908i = c5152d.f37908i;
            this.f37911l = c5152d.f37911l;
            String str = c5152d.f37912m;
            this.f37912m = str;
            this.f37910k = c5152d.f37910k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(c5152d.f37909j);
            ArrayList arrayList = c5152d.f37901b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C5152d) {
                    this.f37901b.add(new C5152d((C5152d) obj, arrayMap));
                } else {
                    if (obj instanceof C5151c) {
                        c5150b = new C5151c((C5151c) obj);
                    } else if (obj instanceof C5150b) {
                        c5150b = new C5150b((C5150b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f37901b.add(c5150b);
                    String str2 = c5150b.f37914b;
                    if (str2 != null) {
                        arrayMap.put(str2, c5150b);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC5153e
        /* renamed from: a */
        public boolean mo52536a() {
            for (int i = 0; i < this.f37901b.size(); i++) {
                if (((AbstractC5153e) this.f37901b.get(i)).mo52536a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AbstractC5153e
        /* renamed from: b */
        public boolean mo52535b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f37901b.size(); i++) {
                z |= ((AbstractC5153e) this.f37901b.get(i)).mo52535b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m52539c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AbstractC13060p4.f76469b);
            m52537e(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        /* renamed from: d */
        public final void m52538d() {
            this.f37909j.reset();
            this.f37909j.postTranslate(-this.f37903d, -this.f37904e);
            this.f37909j.postScale(this.f37905f, this.f37906g);
            this.f37909j.postRotate(this.f37902c, 0.0f, 0.0f);
            this.f37909j.postTranslate(this.f37907h + this.f37903d, this.f37908i + this.f37904e);
        }

        /* renamed from: e */
        public final void m52537e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f37911l = null;
            this.f37902c = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, Key.ROTATION, 5, this.f37902c);
            this.f37903d = typedArray.getFloat(1, this.f37903d);
            this.f37904e = typedArray.getFloat(2, this.f37904e);
            this.f37905f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.f37905f);
            this.f37906g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.f37906g);
            this.f37907h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.f37907h);
            this.f37908i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.f37908i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f37912m = string;
            }
            m52538d();
        }

        public String getGroupName() {
            return this.f37912m;
        }

        public Matrix getLocalMatrix() {
            return this.f37909j;
        }

        public float getPivotX() {
            return this.f37903d;
        }

        public float getPivotY() {
            return this.f37904e;
        }

        public float getRotation() {
            return this.f37902c;
        }

        public float getScaleX() {
            return this.f37905f;
        }

        public float getScaleY() {
            return this.f37906g;
        }

        public float getTranslateX() {
            return this.f37907h;
        }

        public float getTranslateY() {
            return this.f37908i;
        }

        public void setPivotX(float f) {
            if (f != this.f37903d) {
                this.f37903d = f;
                m52538d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f37904e) {
                this.f37904e = f;
                m52538d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f37902c) {
                this.f37902c = f;
                m52538d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f37905f) {
                this.f37905f = f;
                m52538d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f37906g) {
                this.f37906g = f;
                m52538d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f37907h) {
                this.f37907h = f;
                m52538d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f37908i) {
                this.f37908i = f;
                m52538d();
            }
        }

        public C5152d() {
            super();
            this.f37900a = new Matrix();
            this.f37901b = new ArrayList();
            this.f37902c = 0.0f;
            this.f37903d = 0.0f;
            this.f37904e = 0.0f;
            this.f37905f = 1.0f;
            this.f37906g = 1.0f;
            this.f37907h = 0.0f;
            this.f37908i = 0.0f;
            this.f37909j = new Matrix();
            this.f37912m = null;
        }
    }
}
