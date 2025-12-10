package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;

/* loaded from: classes5.dex */
public class RoundedImageView extends ImageView {
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final String TAG = "RoundedImageView";

    /* renamed from: a */
    public final float[] f58391a;

    /* renamed from: b */
    public Drawable f58392b;

    /* renamed from: c */
    public ColorStateList f58393c;

    /* renamed from: d */
    public float f58394d;

    /* renamed from: e */
    public ColorFilter f58395e;

    /* renamed from: f */
    public boolean f58396f;

    /* renamed from: g */
    public Drawable f58397g;

    /* renamed from: h */
    public boolean f58398h;

    /* renamed from: i */
    public boolean f58399i;

    /* renamed from: j */
    public boolean f58400j;

    /* renamed from: k */
    public int f58401k;

    /* renamed from: l */
    public int f58402l;

    /* renamed from: m */
    public ImageView.ScaleType f58403m;

    /* renamed from: n */
    public Shader.TileMode f58404n;

    /* renamed from: o */
    public Shader.TileMode f58405o;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;

    /* renamed from: p */
    public static final ImageView.ScaleType[] f58390p = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.makeramen.roundedimageview.RoundedImageView$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9125a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58406a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f58406a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58406a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58406a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58406a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58406a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58406a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58406a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f58391a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f58393c = ColorStateList.valueOf(-16777216);
        this.f58394d = 0.0f;
        this.f58395e = null;
        this.f58396f = false;
        this.f58398h = false;
        this.f58399i = false;
        this.f58400j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f58404n = tileMode;
        this.f58405o = tileMode;
    }

    /* renamed from: b */
    public static Shader.TileMode m33706b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Shader.TileMode.MIRROR;
            }
            return Shader.TileMode.REPEAT;
        }
        return Shader.TileMode.CLAMP;
    }

    /* renamed from: a */
    public final void m33707a() {
        Drawable drawable = this.f58397g;
        if (drawable != null && this.f58396f) {
            Drawable mutate = drawable.mutate();
            this.f58397g = mutate;
            if (this.f58398h) {
                mutate.setColorFilter(this.f58395e);
            }
        }
    }

    /* renamed from: c */
    public final Drawable m33705c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f58402l;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w(TAG, "Unable to find resource: " + this.f58402l, e);
                this.f58402l = 0;
            }
        }
        return RoundedDrawable.fromDrawable(drawable);
    }

    /* renamed from: d */
    public final Drawable m33704d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f58401k;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w(TAG, "Unable to find resource: " + this.f58401k, e);
                this.f58401k = 0;
            }
        }
        return RoundedDrawable.fromDrawable(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: e */
    public final void m33703e(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof RoundedDrawable) {
            RoundedDrawable roundedDrawable = (RoundedDrawable) drawable;
            roundedDrawable.setScaleType(scaleType).setBorderWidth(this.f58394d).setBorderColor(this.f58393c).setOval(this.f58399i).setTileModeX(this.f58404n).setTileModeY(this.f58405o);
            float[] fArr = this.f58391a;
            if (fArr != null) {
                roundedDrawable.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m33707a();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m33703e(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* renamed from: f */
    public final void m33702f(boolean z) {
        if (this.f58400j) {
            if (z) {
                this.f58392b = RoundedDrawable.fromDrawable(this.f58392b);
            }
            m33703e(this.f58392b, ImageView.ScaleType.FIT_XY);
        }
    }

    /* renamed from: g */
    public final void m33701g() {
        m33703e(this.f58397g, this.f58403m);
    }

    @ColorInt
    public int getBorderColor() {
        return this.f58393c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f58393c;
    }

    public float getBorderWidth() {
        return this.f58394d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.f58391a) {
            f = Math.max(f2, f);
        }
        return f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f58403m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f58404n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f58405o;
    }

    public boolean isOval() {
        return this.f58399i;
    }

    public void mutateBackground(boolean z) {
        if (this.f58400j == z) {
            return;
        }
        this.f58400j = z;
        m33702f(true);
        invalidate();
    }

    public boolean mutatesBackground() {
        return this.f58400j;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f58392b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f58392b = drawable;
        m33702f(true);
        super.setBackgroundDrawable(this.f58392b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.f58402l != i) {
            this.f58402l = i;
            Drawable m33705c = m33705c();
            this.f58392b = m33705c;
            setBackgroundDrawable(m33705c);
        }
    }

    public void setBorderColor(@ColorInt int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderWidth(@DimenRes int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f58395e != colorFilter) {
            this.f58395e = colorFilter;
            this.f58398h = true;
            this.f58396f = true;
            m33707a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        setCornerRadius(f, f, f, f);
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        setCornerRadius(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f58401k = 0;
        this.f58397g = RoundedDrawable.fromBitmap(bitmap);
        m33701g();
        super.setImageDrawable(this.f58397g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f58401k = 0;
        this.f58397g = RoundedDrawable.fromDrawable(drawable);
        m33701g();
        super.setImageDrawable(this.f58397g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.f58401k != i) {
            this.f58401k = i;
            this.f58397g = m33704d();
            m33701g();
            super.setImageDrawable(this.f58397g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f58399i = z;
        m33701g();
        m33702f(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f58403m != scaleType) {
            this.f58403m = scaleType;
            switch (C9125a.f58406a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m33701g();
            m33702f(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f58404n == tileMode) {
            return;
        }
        this.f58404n = tileMode;
        m33701g();
        m33702f(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f58405o == tileMode) {
            return;
        }
        this.f58405o = tileMode;
        m33701g();
        m33702f(false);
        invalidate();
    }

    public float getCornerRadius(int i) {
        return this.f58391a[i];
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f58393c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f58393c = colorStateList;
        m33701g();
        m33702f(false);
        if (this.f58394d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f58394d == f) {
            return;
        }
        this.f58394d = f;
        m33701g();
        m33702f(false);
        invalidate();
    }

    public void setCornerRadius(int i, float f) {
        float[] fArr = this.f58391a;
        if (fArr[i] == f) {
            return;
        }
        fArr[i] = f;
        m33701g();
        m33702f(false);
        invalidate();
    }

    public void setCornerRadiusDimen(int i, @DimenRes int i2) {
        setCornerRadius(i, getResources().getDimensionPixelSize(i2));
    }

    public void setCornerRadius(float f, float f2, float f3, float f4) {
        float[] fArr = this.f58391a;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m33701g();
        m33702f(false);
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f58391a = fArr;
        this.f58393c = ColorStateList.valueOf(-16777216);
        this.f58394d = 0.0f;
        this.f58395e = null;
        this.f58396f = false;
        this.f58398h = false;
        this.f58399i = false;
        this.f58400j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f58404n = tileMode;
        this.f58405o = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedImageView, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(f58390p[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f58391a;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f58391a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f58391a[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_border_width, -1);
        this.f58394d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f58394d = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.RoundedImageView_riv_border_color);
        this.f58393c = colorStateList;
        if (colorStateList == null) {
            this.f58393c = ColorStateList.valueOf(-16777216);
        }
        this.f58400j = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_mutate_background, false);
        this.f58399i = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_oval, false);
        int i5 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(m33706b(i5));
            setTileModeY(m33706b(i5));
        }
        int i6 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(m33706b(i6));
        }
        int i7 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(m33706b(i7));
        }
        m33701g();
        m33702f(true);
        if (this.f58400j) {
            super.setBackgroundDrawable(this.f58392b);
        }
        obtainStyledAttributes.recycle();
    }
}
