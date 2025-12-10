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
    public final float[] f58403a;

    /* renamed from: b */
    public Drawable f58404b;

    /* renamed from: c */
    public ColorStateList f58405c;

    /* renamed from: d */
    public float f58406d;

    /* renamed from: e */
    public ColorFilter f58407e;

    /* renamed from: f */
    public boolean f58408f;

    /* renamed from: g */
    public Drawable f58409g;

    /* renamed from: h */
    public boolean f58410h;

    /* renamed from: i */
    public boolean f58411i;

    /* renamed from: j */
    public boolean f58412j;

    /* renamed from: k */
    public int f58413k;

    /* renamed from: l */
    public int f58414l;

    /* renamed from: m */
    public ImageView.ScaleType f58415m;

    /* renamed from: n */
    public Shader.TileMode f58416n;

    /* renamed from: o */
    public Shader.TileMode f58417o;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;

    /* renamed from: p */
    public static final ImageView.ScaleType[] f58402p = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.makeramen.roundedimageview.RoundedImageView$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9114a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58418a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f58418a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58418a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58418a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58418a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58418a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58418a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58418a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f58403a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f58405c = ColorStateList.valueOf(-16777216);
        this.f58406d = 0.0f;
        this.f58407e = null;
        this.f58408f = false;
        this.f58410h = false;
        this.f58411i = false;
        this.f58412j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f58416n = tileMode;
        this.f58417o = tileMode;
    }

    /* renamed from: b */
    public static Shader.TileMode m33698b(int i) {
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
    public final void m33699a() {
        Drawable drawable = this.f58409g;
        if (drawable != null && this.f58408f) {
            Drawable mutate = drawable.mutate();
            this.f58409g = mutate;
            if (this.f58410h) {
                mutate.setColorFilter(this.f58407e);
            }
        }
    }

    /* renamed from: c */
    public final Drawable m33697c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f58414l;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w(TAG, "Unable to find resource: " + this.f58414l, e);
                this.f58414l = 0;
            }
        }
        return RoundedDrawable.fromDrawable(drawable);
    }

    /* renamed from: d */
    public final Drawable m33696d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f58413k;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w(TAG, "Unable to find resource: " + this.f58413k, e);
                this.f58413k = 0;
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
    public final void m33695e(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof RoundedDrawable) {
            RoundedDrawable roundedDrawable = (RoundedDrawable) drawable;
            roundedDrawable.setScaleType(scaleType).setBorderWidth(this.f58406d).setBorderColor(this.f58405c).setOval(this.f58411i).setTileModeX(this.f58416n).setTileModeY(this.f58417o);
            float[] fArr = this.f58403a;
            if (fArr != null) {
                roundedDrawable.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m33699a();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m33695e(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* renamed from: f */
    public final void m33694f(boolean z) {
        if (this.f58412j) {
            if (z) {
                this.f58404b = RoundedDrawable.fromDrawable(this.f58404b);
            }
            m33695e(this.f58404b, ImageView.ScaleType.FIT_XY);
        }
    }

    /* renamed from: g */
    public final void m33693g() {
        m33695e(this.f58409g, this.f58415m);
    }

    @ColorInt
    public int getBorderColor() {
        return this.f58405c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f58405c;
    }

    public float getBorderWidth() {
        return this.f58406d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.f58403a) {
            f = Math.max(f2, f);
        }
        return f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f58415m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f58416n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f58417o;
    }

    public boolean isOval() {
        return this.f58411i;
    }

    public void mutateBackground(boolean z) {
        if (this.f58412j == z) {
            return;
        }
        this.f58412j = z;
        m33694f(true);
        invalidate();
    }

    public boolean mutatesBackground() {
        return this.f58412j;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f58404b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f58404b = drawable;
        m33694f(true);
        super.setBackgroundDrawable(this.f58404b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.f58414l != i) {
            this.f58414l = i;
            Drawable m33697c = m33697c();
            this.f58404b = m33697c;
            setBackgroundDrawable(m33697c);
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
        if (this.f58407e != colorFilter) {
            this.f58407e = colorFilter;
            this.f58410h = true;
            this.f58408f = true;
            m33699a();
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
        this.f58413k = 0;
        this.f58409g = RoundedDrawable.fromBitmap(bitmap);
        m33693g();
        super.setImageDrawable(this.f58409g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f58413k = 0;
        this.f58409g = RoundedDrawable.fromDrawable(drawable);
        m33693g();
        super.setImageDrawable(this.f58409g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.f58413k != i) {
            this.f58413k = i;
            this.f58409g = m33696d();
            m33693g();
            super.setImageDrawable(this.f58409g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f58411i = z;
        m33693g();
        m33694f(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f58415m != scaleType) {
            this.f58415m = scaleType;
            switch (C9114a.f58418a[scaleType.ordinal()]) {
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
            m33693g();
            m33694f(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f58416n == tileMode) {
            return;
        }
        this.f58416n = tileMode;
        m33693g();
        m33694f(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f58417o == tileMode) {
            return;
        }
        this.f58417o = tileMode;
        m33693g();
        m33694f(false);
        invalidate();
    }

    public float getCornerRadius(int i) {
        return this.f58403a[i];
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f58405c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f58405c = colorStateList;
        m33693g();
        m33694f(false);
        if (this.f58406d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f58406d == f) {
            return;
        }
        this.f58406d = f;
        m33693g();
        m33694f(false);
        invalidate();
    }

    public void setCornerRadius(int i, float f) {
        float[] fArr = this.f58403a;
        if (fArr[i] == f) {
            return;
        }
        fArr[i] = f;
        m33693g();
        m33694f(false);
        invalidate();
    }

    public void setCornerRadiusDimen(int i, @DimenRes int i2) {
        setCornerRadius(i, getResources().getDimensionPixelSize(i2));
    }

    public void setCornerRadius(float f, float f2, float f3, float f4) {
        float[] fArr = this.f58403a;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m33693g();
        m33694f(false);
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f58403a = fArr;
        this.f58405c = ColorStateList.valueOf(-16777216);
        this.f58406d = 0.0f;
        this.f58407e = null;
        this.f58408f = false;
        this.f58410h = false;
        this.f58411i = false;
        this.f58412j = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.f58416n = tileMode;
        this.f58417o = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedImageView, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(f58402p[i2]);
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
            float[] fArr2 = this.f58403a;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f58403a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f58403a[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_border_width, -1);
        this.f58406d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f58406d = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.RoundedImageView_riv_border_color);
        this.f58405c = colorStateList;
        if (colorStateList == null) {
            this.f58405c = ColorStateList.valueOf(-16777216);
        }
        this.f58412j = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_mutate_background, false);
        this.f58411i = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_oval, false);
        int i5 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(m33698b(i5));
            setTileModeY(m33698b(i5));
        }
        int i6 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(m33698b(i6));
        }
        int i7 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(m33698b(i7));
        }
        m33693g();
        m33694f(true);
        if (this.f58412j) {
            super.setBackgroundDrawable(this.f58404b);
        }
        obtainStyledAttributes.recycle();
    }
}