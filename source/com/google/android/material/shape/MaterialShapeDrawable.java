package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;

    /* renamed from: x */
    public static final String f50632x = "MaterialShapeDrawable";

    /* renamed from: y */
    public static final Paint f50633y;

    /* renamed from: a */
    public MaterialShapeDrawableState f50634a;

    /* renamed from: b */
    public final ShapePath.AbstractC7067e[] f50635b;

    /* renamed from: c */
    public final ShapePath.AbstractC7067e[] f50636c;

    /* renamed from: d */
    public final BitSet f50637d;

    /* renamed from: e */
    public boolean f50638e;

    /* renamed from: f */
    public final Matrix f50639f;

    /* renamed from: g */
    public final Path f50640g;

    /* renamed from: h */
    public final Path f50641h;

    /* renamed from: i */
    public final RectF f50642i;

    /* renamed from: j */
    public final RectF f50643j;

    /* renamed from: k */
    public final Region f50644k;

    /* renamed from: l */
    public final Region f50645l;

    /* renamed from: m */
    public ShapeAppearanceModel f50646m;

    /* renamed from: n */
    public final Paint f50647n;

    /* renamed from: o */
    public final Paint f50648o;

    /* renamed from: p */
    public final ShadowRenderer f50649p;

    /* renamed from: q */
    public final ShapeAppearancePathProvider.PathListener f50650q;

    /* renamed from: r */
    public final ShapeAppearancePathProvider f50651r;

    /* renamed from: s */
    public PorterDuffColorFilter f50652s;

    /* renamed from: t */
    public PorterDuffColorFilter f50653t;

    /* renamed from: u */
    public int f50654u;

    /* renamed from: v */
    public final RectF f50655v;

    /* renamed from: w */
    public boolean f50656w;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CompatibilityShadowMode {
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$a */
    /* loaded from: classes4.dex */
    public class C7058a implements ShapeAppearancePathProvider.PathListener {
        public C7058a() {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i) {
            MaterialShapeDrawable.this.f50637d.set(i, shapePath.m44173c());
            MaterialShapeDrawable.this.f50635b[i] = shapePath.m44172d(matrix);
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i) {
            MaterialShapeDrawable.this.f50637d.set(i + 4, shapePath.m44173c());
            MaterialShapeDrawable.this.f50636c[i] = shapePath.m44172d(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$b */
    /* loaded from: classes4.dex */
    public class C7059b implements ShapeAppearanceModel.CornerSizeUnaryOperator {

        /* renamed from: a */
        public final /* synthetic */ float f50680a;

        public C7059b(float f) {
            this.f50680a = f;
        }

        @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
        public CornerSize apply(CornerSize cornerSize) {
            if (!(cornerSize instanceof RelativeCornerSize)) {
                return new AdjustedCornerSize(this.f50680a, cornerSize);
            }
            return cornerSize;
        }
    }

    static {
        Paint paint = new Paint(1);
        f50633y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    /* renamed from: t */
    public static int m44213t(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f50651r;
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        shapeAppearancePathProvider.calculatePath(materialShapeDrawableState.f50657a, materialShapeDrawableState.f50667k, rectF, this.f50650q, path);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int i) {
        float z = getZ() + getParentAbsoluteElevation();
        ElevationOverlayProvider elevationOverlayProvider = this.f50634a.f50658b;
        if (elevationOverlayProvider != null) {
            return elevationOverlayProvider.compositeOverlayIfNeeded(i, z);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f50647n.setColorFilter(this.f50652s);
        int alpha = this.f50647n.getAlpha();
        this.f50647n.setAlpha(m44213t(alpha, this.f50634a.f50669m));
        this.f50648o.setColorFilter(this.f50653t);
        this.f50648o.setStrokeWidth(this.f50634a.f50668l);
        int alpha2 = this.f50648o.getAlpha();
        this.f50648o.setAlpha(m44213t(alpha2, this.f50634a.f50669m));
        if (this.f50638e) {
            m44226g();
            m44227f(getBoundsAsRectF(), this.f50640g);
            this.f50638e = false;
        }
        m44214s(canvas);
        if (m44217p()) {
            m44222k(canvas);
        }
        if (m44216q()) {
            drawStrokeShape(canvas);
        }
        this.f50647n.setAlpha(alpha);
        this.f50648o.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        m44221l(canvas, paint, path, this.f50634a.f50657a, rectF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawStrokeShape(@NonNull Canvas canvas) {
        m44221l(canvas, this.f50648o, this.f50641h, this.f50646m, m44220m());
    }

    /* renamed from: e */
    public final PorterDuffColorFilter m44228e(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
            this.f50654u = compositeElevationOverlayIfNeeded;
            if (compositeElevationOverlayIfNeeded != color) {
                return new PorterDuffColorFilter(compositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    public final void m44227f(RectF rectF, Path path) {
        calculatePathForSize(rectF, path);
        if (this.f50634a.f50666j != 1.0f) {
            this.f50639f.reset();
            Matrix matrix = this.f50639f;
            float f = this.f50634a.f50666j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f50639f);
        }
        path.computeBounds(this.f50655v, true);
    }

    /* renamed from: g */
    public final void m44226g() {
        ShapeAppearanceModel withTransformedCornerSizes = getShapeAppearanceModel().withTransformedCornerSizes(new C7059b(-m44219n()));
        this.f50646m = withTransformedCornerSizes;
        this.f50651r.calculatePath(withTransformedCornerSizes, this.f50634a.f50667k, m44220m(), this.f50641h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f50634a.f50669m;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.f50634a.f50657a.getBottomLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.f50634a.f50657a.getBottomRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        this.f50642i.set(getBounds());
        return this.f50642i;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f50634a;
    }

    public float getElevation() {
        return this.f50634a.f50671o;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.f50634a.f50660d;
    }

    public float getInterpolation() {
        return this.f50634a.f50667k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f50634a.f50673q == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.f50634a.f50667k);
            return;
        }
        m44227f(getBoundsAsRectF(), this.f50640g);
        DrawableUtils.setOutlineToPath(outline, this.f50640g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f50634a.f50665i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public Paint.Style getPaintStyle() {
        return this.f50634a.f50678v;
    }

    public float getParentAbsoluteElevation() {
        return this.f50634a.f50670n;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, @NonNull Path path) {
        calculatePathForSize(new RectF(0.0f, 0.0f, i, i2), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.f50654u;
    }

    public float getScale() {
        return this.f50634a.f50666j;
    }

    public int getShadowCompatRotation() {
        return this.f50634a.f50676t;
    }

    public int getShadowCompatibilityMode() {
        return this.f50634a.f50673q;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        return (int) (materialShapeDrawableState.f50675s * Math.sin(Math.toRadians(materialShapeDrawableState.f50676t)));
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        return (int) (materialShapeDrawableState.f50675s * Math.cos(Math.toRadians(materialShapeDrawableState.f50676t)));
    }

    public int getShadowRadius() {
        return this.f50634a.f50674r;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.f50634a.f50675s;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f50634a.f50657a;
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f50634a.f50661e;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.f50634a.f50662f;
    }

    public float getStrokeWidth() {
        return this.f50634a.f50668l;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.f50634a.f50663g;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.f50634a.f50657a.getTopLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        return this.f50634a.f50657a.getTopRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.f50634a.f50672p;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f50644k.set(getBounds());
        m44227f(getBoundsAsRectF(), this.f50640g);
        this.f50645l.setPath(this.f50640g, this.f50644k);
        this.f50644k.op(this.f50645l, Region.Op.DIFFERENCE);
        return this.f50644k;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    /* renamed from: h */
    public final PorterDuffColorFilter m44225h(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.f50654u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: i */
    public final PorterDuffColorFilter m44224i(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m44225h(colorStateList, mode, z);
        }
        return m44228e(paint, z);
    }

    public void initializeElevationOverlay(Context context) {
        this.f50634a.f50658b = new ElevationOverlayProvider(context);
        m44209x();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f50638e = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.f50634a.f50658b;
        if (elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isElevationOverlayInitialized() {
        if (this.f50634a.f50658b != null) {
            return true;
        }
        return false;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        return this.f50634a.f50657a.isRoundRect(getBoundsAsRectF());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.f50634a.f50673q;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f50634a.f50663g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f50634a.f50662f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f50634a.f50661e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f50634a.f50660d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m44223j(Canvas canvas) {
        if (this.f50637d.cardinality() > 0) {
            Log.w(f50632x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f50634a.f50675s != 0) {
            canvas.drawPath(this.f50640g, this.f50649p.getShadowPaint());
        }
        for (int i = 0; i < 4; i++) {
            this.f50635b[i].m44112b(this.f50649p, this.f50634a.f50674r, canvas);
            this.f50636c[i].m44112b(this.f50649p, this.f50634a.f50674r, canvas);
        }
        if (this.f50656w) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.f50640g, f50633y);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    /* renamed from: k */
    public final void m44222k(Canvas canvas) {
        m44221l(canvas, this.f50647n, this.f50640g, this.f50634a.f50657a, getBoundsAsRectF());
    }

    /* renamed from: l */
    public final void m44221l(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (shapeAppearanceModel.isRoundRect(rectF)) {
            float cornerSize = shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) * this.f50634a.f50667k;
            canvas.drawRoundRect(rectF, cornerSize, cornerSize, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: m */
    public final RectF m44220m() {
        this.f50643j.set(getBoundsAsRectF());
        float m44219n = m44219n();
        this.f50643j.inset(m44219n, m44219n);
        return this.f50643j;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f50634a = new MaterialShapeDrawableState(this.f50634a);
        return this;
    }

    /* renamed from: n */
    public final float m44219n() {
        if (m44216q()) {
            return this.f50648o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: o */
    public final boolean m44218o() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        int i = materialShapeDrawableState.f50673q;
        if (i != 1 && materialShapeDrawableState.f50674r > 0 && (i == 2 || requiresCompatShadow())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f50638e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m44211v = m44211v(iArr);
        boolean m44210w = m44210w();
        if (!m44211v && !m44210w) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final boolean m44217p() {
        Paint.Style style = this.f50634a.f50678v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m44216q() {
        Paint.Style style = this.f50634a.f50678v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f50648o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void m44215r() {
        super.invalidateSelf();
    }

    public boolean requiresCompatShadow() {
        int i = Build.VERSION.SDK_INT;
        if (!isRoundRect() && !this.f50640g.isConvex() && i < 29) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m44214s(Canvas canvas) {
        if (!m44218o()) {
            return;
        }
        canvas.save();
        m44212u(canvas);
        if (!this.f50656w) {
            m44223j(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f50655v.width() - getBounds().width());
        int height = (int) (this.f50655v.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f50655v.width()) + (this.f50634a.f50674r * 2) + width, ((int) this.f50655v.height()) + (this.f50634a.f50674r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f50634a.f50674r) - width;
            float f2 = (getBounds().top - this.f50634a.f50674r) - height;
            canvas2.translate(-f, -f2);
            m44223j(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m64742to = 255) int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50669m != i) {
            materialShapeDrawableState.f50669m = i;
            m44215r();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f50634a.f50659c = colorFilter;
        m44215r();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.f50634a.f50657a.withCornerSize(f));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.f50651r.m44177k(z);
    }

    public void setElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50671o != f) {
            materialShapeDrawableState.f50671o = f;
            m44209x();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50660d != colorStateList) {
            materialShapeDrawableState.f50660d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50667k != f) {
            materialShapeDrawableState.f50667k = f;
            this.f50638e = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50665i == null) {
            materialShapeDrawableState.f50665i = new Rect();
        }
        this.f50634a.f50665i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f50634a.f50678v = style;
        m44215r();
    }

    public void setParentAbsoluteElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50670n != f) {
            materialShapeDrawableState.f50670n = f;
            m44209x();
        }
    }

    public void setScale(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50666j != f) {
            materialShapeDrawableState.f50666j = f;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z) {
        this.f50656w = z;
    }

    public void setShadowColor(int i) {
        this.f50649p.setShadowColor(i);
        this.f50634a.f50677u = false;
        m44215r();
    }

    public void setShadowCompatRotation(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50676t != i) {
            materialShapeDrawableState.f50676t = i;
            m44215r();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50673q != i) {
            materialShapeDrawableState.f50673q = i;
            m44215r();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation(i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.f50634a.f50674r = i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50675s != i) {
            materialShapeDrawableState.f50675s = i;
            m44215r();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f50634a.f50657a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f, @ColorInt int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50661e != colorStateList) {
            materialShapeDrawableState.f50661e = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f50634a.f50662f = colorStateList;
        m44210w();
        m44215r();
    }

    public void setStrokeWidth(float f) {
        this.f50634a.f50668l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f50634a.f50663g = colorStateList;
        m44210w();
        m44215r();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50664h != mode) {
            materialShapeDrawableState.f50664h = mode;
            m44210w();
            m44215r();
        }
    }

    public void setTranslationZ(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50672p != f) {
            materialShapeDrawableState.f50672p = f;
            m44209x();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        if (materialShapeDrawableState.f50677u != z) {
            materialShapeDrawableState.f50677u = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    /* renamed from: u */
    public final void m44212u(Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    /* renamed from: v */
    public final boolean m44211v(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f50634a.f50660d != null && color2 != (colorForState2 = this.f50634a.f50660d.getColorForState(iArr, (color2 = this.f50647n.getColor())))) {
            this.f50647n.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.f50634a.f50661e != null && color != (colorForState = this.f50634a.f50661e.getColorForState(iArr, (color = this.f50648o.getColor())))) {
            this.f50648o.setColor(colorForState);
            return true;
        }
        return z;
    }

    /* renamed from: w */
    public final boolean m44210w() {
        PorterDuffColorFilter porterDuffColorFilter = this.f50652s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f50653t;
        MaterialShapeDrawableState materialShapeDrawableState = this.f50634a;
        this.f50652s = m44224i(materialShapeDrawableState.f50663g, materialShapeDrawableState.f50664h, this.f50647n, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f50634a;
        this.f50653t = m44224i(materialShapeDrawableState2.f50662f, materialShapeDrawableState2.f50664h, this.f50648o, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f50634a;
        if (materialShapeDrawableState3.f50677u) {
            this.f50649p.setShadowColor(materialShapeDrawableState3.f50663g.getColorForState(getState(), 0));
        }
        if (!ObjectsCompat.equals(porterDuffColorFilter, this.f50652s) || !ObjectsCompat.equals(porterDuffColorFilter2, this.f50653t)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m44209x() {
        float z = getZ();
        this.f50634a.f50674r = (int) Math.ceil(0.75f * z);
        this.f50634a.f50675s = (int) Math.ceil(z * 0.25f);
        m44210w();
        m44215r();
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i, i2).build());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f) {
        int color = MaterialColors.getColor(context, R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        materialShapeDrawable.setElevation(f);
        return materialShapeDrawable;
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.f50634a.f50657a.withCornerSize(cornerSize));
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    public void setStroke(float f, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    public void setStrokeTint(@ColorInt int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f50635b = new ShapePath.AbstractC7067e[4];
        this.f50636c = new ShapePath.AbstractC7067e[4];
        this.f50637d = new BitSet(8);
        this.f50639f = new Matrix();
        this.f50640g = new Path();
        this.f50641h = new Path();
        this.f50642i = new RectF();
        this.f50643j = new RectF();
        this.f50644k = new Region();
        this.f50645l = new Region();
        Paint paint = new Paint(1);
        this.f50647n = paint;
        Paint paint2 = new Paint(1);
        this.f50648o = paint2;
        this.f50649p = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.getInstance();
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.f50651r = shapeAppearancePathProvider;
        this.f50655v = new RectF();
        this.f50656w = true;
        this.f50634a = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m44210w();
        m44211v(getState());
        this.f50650q = new C7058a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* renamed from: a */
        public ShapeAppearanceModel f50657a;

        /* renamed from: b */
        public ElevationOverlayProvider f50658b;

        /* renamed from: c */
        public ColorFilter f50659c;

        /* renamed from: d */
        public ColorStateList f50660d;

        /* renamed from: e */
        public ColorStateList f50661e;

        /* renamed from: f */
        public ColorStateList f50662f;

        /* renamed from: g */
        public ColorStateList f50663g;

        /* renamed from: h */
        public PorterDuff.Mode f50664h;

        /* renamed from: i */
        public Rect f50665i;

        /* renamed from: j */
        public float f50666j;

        /* renamed from: k */
        public float f50667k;

        /* renamed from: l */
        public float f50668l;

        /* renamed from: m */
        public int f50669m;

        /* renamed from: n */
        public float f50670n;

        /* renamed from: o */
        public float f50671o;

        /* renamed from: p */
        public float f50672p;

        /* renamed from: q */
        public int f50673q;

        /* renamed from: r */
        public int f50674r;

        /* renamed from: s */
        public int f50675s;

        /* renamed from: t */
        public int f50676t;

        /* renamed from: u */
        public boolean f50677u;

        /* renamed from: v */
        public Paint.Style f50678v;

        public MaterialShapeDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable ElevationOverlayProvider elevationOverlayProvider) {
            this.f50660d = null;
            this.f50661e = null;
            this.f50662f = null;
            this.f50663g = null;
            this.f50664h = PorterDuff.Mode.SRC_IN;
            this.f50665i = null;
            this.f50666j = 1.0f;
            this.f50667k = 1.0f;
            this.f50669m = 255;
            this.f50670n = 0.0f;
            this.f50671o = 0.0f;
            this.f50672p = 0.0f;
            this.f50673q = 0;
            this.f50674r = 0;
            this.f50675s = 0;
            this.f50676t = 0;
            this.f50677u = false;
            this.f50678v = Paint.Style.FILL_AND_STROKE;
            this.f50657a = shapeAppearanceModel;
            this.f50658b = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f50638e = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.f50660d = null;
            this.f50661e = null;
            this.f50662f = null;
            this.f50663g = null;
            this.f50664h = PorterDuff.Mode.SRC_IN;
            this.f50665i = null;
            this.f50666j = 1.0f;
            this.f50667k = 1.0f;
            this.f50669m = 255;
            this.f50670n = 0.0f;
            this.f50671o = 0.0f;
            this.f50672p = 0.0f;
            this.f50673q = 0;
            this.f50674r = 0;
            this.f50675s = 0;
            this.f50676t = 0;
            this.f50677u = false;
            this.f50678v = Paint.Style.FILL_AND_STROKE;
            this.f50657a = materialShapeDrawableState.f50657a;
            this.f50658b = materialShapeDrawableState.f50658b;
            this.f50668l = materialShapeDrawableState.f50668l;
            this.f50659c = materialShapeDrawableState.f50659c;
            this.f50660d = materialShapeDrawableState.f50660d;
            this.f50661e = materialShapeDrawableState.f50661e;
            this.f50664h = materialShapeDrawableState.f50664h;
            this.f50663g = materialShapeDrawableState.f50663g;
            this.f50669m = materialShapeDrawableState.f50669m;
            this.f50666j = materialShapeDrawableState.f50666j;
            this.f50675s = materialShapeDrawableState.f50675s;
            this.f50673q = materialShapeDrawableState.f50673q;
            this.f50677u = materialShapeDrawableState.f50677u;
            this.f50667k = materialShapeDrawableState.f50667k;
            this.f50670n = materialShapeDrawableState.f50670n;
            this.f50671o = materialShapeDrawableState.f50671o;
            this.f50672p = materialShapeDrawableState.f50672p;
            this.f50674r = materialShapeDrawableState.f50674r;
            this.f50676t = materialShapeDrawableState.f50676t;
            this.f50662f = materialShapeDrawableState.f50662f;
            this.f50678v = materialShapeDrawableState.f50678v;
            if (materialShapeDrawableState.f50665i != null) {
                this.f50665i = new Rect(materialShapeDrawableState.f50665i);
            }
        }
    }
}
