package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes5.dex */
public class RoundedDrawable extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";

    /* renamed from: a */
    public final RectF f58381a = new RectF();

    /* renamed from: b */
    public final RectF f58382b = new RectF();

    /* renamed from: c */
    public final RectF f58383c;

    /* renamed from: d */
    public final Bitmap f58384d;

    /* renamed from: e */
    public final Paint f58385e;

    /* renamed from: f */
    public final int f58386f;

    /* renamed from: g */
    public final int f58387g;

    /* renamed from: h */
    public final RectF f58388h;

    /* renamed from: i */
    public final Paint f58389i;

    /* renamed from: j */
    public final Matrix f58390j;

    /* renamed from: k */
    public final RectF f58391k;

    /* renamed from: l */
    public Shader.TileMode f58392l;

    /* renamed from: m */
    public Shader.TileMode f58393m;

    /* renamed from: n */
    public boolean f58394n;

    /* renamed from: o */
    public float f58395o;

    /* renamed from: p */
    public final boolean[] f58396p;

    /* renamed from: q */
    public boolean f58397q;

    /* renamed from: r */
    public float f58398r;

    /* renamed from: s */
    public ColorStateList f58399s;

    /* renamed from: t */
    public ImageView.ScaleType f58400t;

    /* renamed from: com.makeramen.roundedimageview.RoundedDrawable$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9113a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58401a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f58401a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58401a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58401a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58401a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58401a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58401a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58401a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedDrawable(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f58383c = rectF;
        this.f58388h = new RectF();
        this.f58390j = new Matrix();
        this.f58391k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f58392l = tileMode;
        this.f58393m = tileMode;
        this.f58394n = true;
        this.f58395o = 0.0f;
        this.f58396p = new boolean[]{true, true, true, true};
        this.f58397q = false;
        this.f58398r = 0.0f;
        this.f58399s = ColorStateList.valueOf(-16777216);
        this.f58400t = ImageView.ScaleType.FIT_CENTER;
        this.f58384d = bitmap;
        int width = bitmap.getWidth();
        this.f58386f = width;
        int height = bitmap.getHeight();
        this.f58387g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f58385e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f58389i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f58399s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f58398r);
    }

    /* renamed from: a */
    public static boolean m33705a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m33704b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m33703c(int i, boolean[] zArr) {
        int length = zArr.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                return true;
            }
            boolean z2 = zArr[i2];
            if (i2 != i) {
                z = false;
            }
            if (z2 != z) {
                return false;
            }
            i2++;
        }
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(TAG, "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static RoundedDrawable fromBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new RoundedDrawable(bitmap);
        }
        return null;
    }

    public static Drawable fromDrawable(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof RoundedDrawable) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), fromDrawable(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
            Bitmap drawableToBitmap = drawableToBitmap(drawable);
            if (drawableToBitmap != null) {
                return new RoundedDrawable(drawableToBitmap);
            }
            return drawable;
        }
        return drawable;
    }

    /* renamed from: d */
    public final void m33702d(Canvas canvas) {
        if (m33705a(this.f58396p) || this.f58395o == 0.0f) {
            return;
        }
        RectF rectF = this.f58382b;
        float f = rectF.left;
        float f2 = rectF.top;
        float width = rectF.width() + f;
        float height = this.f58382b.height() + f2;
        float f3 = this.f58395o;
        if (!this.f58396p[0]) {
            this.f58391k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f58391k, this.f58385e);
        }
        if (!this.f58396p[1]) {
            this.f58391k.set(width - f3, f2, width, f3);
            canvas.drawRect(this.f58391k, this.f58385e);
        }
        if (!this.f58396p[2]) {
            this.f58391k.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.f58391k, this.f58385e);
        }
        if (!this.f58396p[3]) {
            this.f58391k.set(f, height - f3, f3 + f, height);
            canvas.drawRect(this.f58391k, this.f58385e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f58394n) {
            BitmapShader bitmapShader = new BitmapShader(this.f58384d, this.f58392l, this.f58393m);
            Shader.TileMode tileMode = this.f58392l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f58393m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f58390j);
            }
            this.f58385e.setShader(bitmapShader);
            this.f58394n = false;
        }
        if (this.f58397q) {
            if (this.f58398r > 0.0f) {
                canvas.drawOval(this.f58382b, this.f58385e);
                canvas.drawOval(this.f58388h, this.f58389i);
                return;
            }
            canvas.drawOval(this.f58382b, this.f58385e);
        } else if (m33704b(this.f58396p)) {
            float f = this.f58395o;
            if (this.f58398r > 0.0f) {
                canvas.drawRoundRect(this.f58382b, f, f, this.f58385e);
                canvas.drawRoundRect(this.f58388h, f, f, this.f58389i);
                m33702d(canvas);
                m33701e(canvas);
                return;
            }
            canvas.drawRoundRect(this.f58382b, f, f, this.f58385e);
            m33702d(canvas);
        } else {
            canvas.drawRect(this.f58382b, this.f58385e);
            if (this.f58398r > 0.0f) {
                canvas.drawRect(this.f58388h, this.f58389i);
            }
        }
    }

    /* renamed from: e */
    public final void m33701e(Canvas canvas) {
        float f;
        if (m33705a(this.f58396p) || this.f58395o == 0.0f) {
            return;
        }
        RectF rectF = this.f58382b;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width() + f2;
        float height = f3 + this.f58382b.height();
        float f4 = this.f58395o;
        float f5 = this.f58398r / 2.0f;
        if (!this.f58396p[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.f58389i);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.f58389i);
        }
        if (!this.f58396p[1]) {
            canvas.drawLine((width - f4) - f5, f3, width, f3, this.f58389i);
            canvas.drawLine(width, f3 - f5, width, f3 + f4, this.f58389i);
        }
        if (!this.f58396p[2]) {
            f = f4;
            canvas.drawLine((width - f4) - f5, height, width + f5, height, this.f58389i);
            canvas.drawLine(width, height - f, width, height, this.f58389i);
        } else {
            f = f4;
        }
        if (!this.f58396p[3]) {
            canvas.drawLine(f2 - f5, height, f2 + f, height, this.f58389i);
            canvas.drawLine(f2, height - f, f2, height, this.f58389i);
        }
    }

    /* renamed from: f */
    public final void m33700f() {
        float width;
        float height;
        float min;
        int i = C9113a.f58401a[this.f58400t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                this.f58388h.set(this.f58383c);
                                this.f58390j.setRectToRect(this.f58383c, this.f58381a, Matrix.ScaleToFit.CENTER);
                                this.f58390j.mapRect(this.f58388h);
                                RectF rectF = this.f58388h;
                                float f = this.f58398r;
                                rectF.inset(f / 2.0f, f / 2.0f);
                                this.f58390j.setRectToRect(this.f58383c, this.f58388h, Matrix.ScaleToFit.FILL);
                            } else {
                                this.f58388h.set(this.f58381a);
                                RectF rectF2 = this.f58388h;
                                float f2 = this.f58398r;
                                rectF2.inset(f2 / 2.0f, f2 / 2.0f);
                                this.f58390j.reset();
                                this.f58390j.setRectToRect(this.f58383c, this.f58388h, Matrix.ScaleToFit.FILL);
                            }
                        } else {
                            this.f58388h.set(this.f58383c);
                            this.f58390j.setRectToRect(this.f58383c, this.f58381a, Matrix.ScaleToFit.START);
                            this.f58390j.mapRect(this.f58388h);
                            RectF rectF3 = this.f58388h;
                            float f3 = this.f58398r;
                            rectF3.inset(f3 / 2.0f, f3 / 2.0f);
                            this.f58390j.setRectToRect(this.f58383c, this.f58388h, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        this.f58388h.set(this.f58383c);
                        this.f58390j.setRectToRect(this.f58383c, this.f58381a, Matrix.ScaleToFit.END);
                        this.f58390j.mapRect(this.f58388h);
                        RectF rectF4 = this.f58388h;
                        float f4 = this.f58398r;
                        rectF4.inset(f4 / 2.0f, f4 / 2.0f);
                        this.f58390j.setRectToRect(this.f58383c, this.f58388h, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    this.f58390j.reset();
                    if (this.f58386f <= this.f58381a.width() && this.f58387g <= this.f58381a.height()) {
                        min = 1.0f;
                    } else {
                        min = Math.min(this.f58381a.width() / this.f58386f, this.f58381a.height() / this.f58387g);
                    }
                    this.f58390j.setScale(min, min);
                    this.f58390j.postTranslate((int) (((this.f58381a.width() - (this.f58386f * min)) * 0.5f) + 0.5f), (int) (((this.f58381a.height() - (this.f58387g * min)) * 0.5f) + 0.5f));
                    this.f58388h.set(this.f58383c);
                    this.f58390j.mapRect(this.f58388h);
                    RectF rectF5 = this.f58388h;
                    float f5 = this.f58398r;
                    rectF5.inset(f5 / 2.0f, f5 / 2.0f);
                    this.f58390j.setRectToRect(this.f58383c, this.f58388h, Matrix.ScaleToFit.FILL);
                }
            } else {
                this.f58388h.set(this.f58381a);
                RectF rectF6 = this.f58388h;
                float f6 = this.f58398r;
                rectF6.inset(f6 / 2.0f, f6 / 2.0f);
                this.f58390j.reset();
                float f7 = 0.0f;
                if (this.f58386f * this.f58388h.height() > this.f58388h.width() * this.f58387g) {
                    width = this.f58388h.height() / this.f58387g;
                    f7 = (this.f58388h.width() - (this.f58386f * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = this.f58388h.width() / this.f58386f;
                    height = (this.f58388h.height() - (this.f58387g * width)) * 0.5f;
                }
                this.f58390j.setScale(width, width);
                Matrix matrix = this.f58390j;
                float f8 = this.f58398r;
                matrix.postTranslate(((int) (f7 + 0.5f)) + (f8 / 2.0f), ((int) (height + 0.5f)) + (f8 / 2.0f));
            }
        } else {
            this.f58388h.set(this.f58381a);
            RectF rectF7 = this.f58388h;
            float f9 = this.f58398r;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.f58390j.reset();
            this.f58390j.setTranslate((int) (((this.f58388h.width() - this.f58386f) * 0.5f) + 0.5f), (int) (((this.f58388h.height() - this.f58387g) * 0.5f) + 0.5f));
        }
        this.f58382b.set(this.f58388h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f58385e.getAlpha();
    }

    public int getBorderColor() {
        return this.f58399s.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f58399s;
    }

    public float getBorderWidth() {
        return this.f58398r;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f58385e.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f58395o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f58387g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f58386f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f58400t;
    }

    public Bitmap getSourceBitmap() {
        return this.f58384d;
    }

    public Shader.TileMode getTileModeX() {
        return this.f58392l;
    }

    public Shader.TileMode getTileModeY() {
        return this.f58393m;
    }

    public boolean isOval() {
        return this.f58397q;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f58399s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f58381a.set(rect);
        m33700f();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f58399s.getColorForState(iArr, 0);
        if (this.f58389i.getColor() != colorForState) {
            this.f58389i.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f58385e.setAlpha(i);
        invalidateSelf();
    }

    public RoundedDrawable setBorderColor(@ColorInt int i) {
        return setBorderColor(ColorStateList.valueOf(i));
    }

    public RoundedDrawable setBorderWidth(float f) {
        this.f58398r = f;
        this.f58389i.setStrokeWidth(f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f58385e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public RoundedDrawable setCornerRadius(float f) {
        setCornerRadius(f, f, f, f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f58385e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f58385e.setFilterBitmap(z);
        invalidateSelf();
    }

    public RoundedDrawable setOval(boolean z) {
        this.f58397q = z;
        return this;
    }

    public RoundedDrawable setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f58400t != scaleType) {
            this.f58400t = scaleType;
            m33700f();
        }
        return this;
    }

    public RoundedDrawable setTileModeX(Shader.TileMode tileMode) {
        if (this.f58392l != tileMode) {
            this.f58392l = tileMode;
            this.f58394n = true;
            invalidateSelf();
        }
        return this;
    }

    public RoundedDrawable setTileModeY(Shader.TileMode tileMode) {
        if (this.f58393m != tileMode) {
            this.f58393m = tileMode;
            this.f58394n = true;
            invalidateSelf();
        }
        return this;
    }

    public Bitmap toBitmap() {
        return drawableToBitmap(this);
    }

    public float getCornerRadius(int i) {
        if (this.f58396p[i]) {
            return this.f58395o;
        }
        return 0.0f;
    }

    public RoundedDrawable setBorderColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f58399s = colorStateList;
        this.f58389i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public RoundedDrawable setCornerRadius(int i, float f) {
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i2 != 0) {
            float f2 = this.f58395o;
            if (f2 != 0.0f && f2 != f) {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
            }
        }
        if (i2 == 0) {
            if (m33703c(i, this.f58396p)) {
                this.f58395o = 0.0f;
            }
            this.f58396p[i] = false;
        } else {
            if (this.f58395o == 0.0f) {
                this.f58395o = f;
            }
            this.f58396p[i] = true;
        }
        return this;
    }

    public RoundedDrawable setCornerRadius(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.f58395o = floatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                }
            } else {
                this.f58395o = 0.0f;
            }
            boolean[] zArr = this.f58396p;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            zArr[3] = f4 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }
}