package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: d */
    public ImageFilterView.C3753c f33189d;

    /* renamed from: e */
    public float f33190e;

    /* renamed from: f */
    public float f33191f;

    /* renamed from: g */
    public float f33192g;

    /* renamed from: h */
    public Path f33193h;

    /* renamed from: i */
    public ViewOutlineProvider f33194i;

    /* renamed from: j */
    public RectF f33195j;

    /* renamed from: k */
    public Drawable[] f33196k;

    /* renamed from: l */
    public LayerDrawable f33197l;

    /* renamed from: m */
    public boolean f33198m;

    /* renamed from: n */
    public Drawable f33199n;

    /* renamed from: o */
    public Drawable f33200o;

    /* renamed from: p */
    public float f33201p;

    /* renamed from: q */
    public float f33202q;

    /* renamed from: r */
    public float f33203r;

    /* renamed from: s */
    public float f33204s;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    /* loaded from: classes2.dex */
    public class C3749a extends ViewOutlineProvider {
        public C3749a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f33191f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    /* loaded from: classes2.dex */
    public class C3750b extends ViewOutlineProvider {
        public C3750b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f33192g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f33189d = new ImageFilterView.C3753c();
        this.f33190e = 0.0f;
        this.f33191f = 0.0f;
        this.f33192g = Float.NaN;
        this.f33196k = new Drawable[2];
        this.f33198m = true;
        this.f33199n = null;
        this.f33200o = null;
        this.f33201p = Float.NaN;
        this.f33202q = Float.NaN;
        this.f33203r = Float.NaN;
        this.f33204s = Float.NaN;
        m58126c(context, null);
    }

    private void setOverlay(boolean z) {
        this.f33198m = z;
    }

    /* renamed from: c */
    public final void m58126c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f33199n = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f33190e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f33198m));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f33201p));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f33202q));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f33204s));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f33203r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f33200o = drawable;
            if (this.f33199n != null && drawable != null) {
                Drawable[] drawableArr = this.f33196k;
                Drawable mutate = getDrawable().mutate();
                this.f33200o = mutate;
                drawableArr[0] = mutate;
                this.f33196k[1] = this.f33199n.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f33196k);
                this.f33197l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f33190e * 255.0f));
                if (!this.f33198m) {
                    this.f33197l.getDrawable(0).setAlpha((int) ((1.0f - this.f33190e) * 255.0f));
                }
                super.setImageDrawable(this.f33197l);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f33200o = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f33196k;
                Drawable mutate2 = drawable2.mutate();
                this.f33200o = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: d */
    public final void m58125d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.f33201p) && Float.isNaN(this.f33202q) && Float.isNaN(this.f33203r) && Float.isNaN(this.f33204s)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.f33201p)) {
            f = 0.0f;
        } else {
            f = this.f33201p;
        }
        if (Float.isNaN(this.f33202q)) {
            f2 = 0.0f;
        } else {
            f2 = this.f33202q;
        }
        if (Float.isNaN(this.f33203r)) {
            f3 = 1.0f;
        } else {
            f3 = this.f33203r;
        }
        if (!Float.isNaN(this.f33204s)) {
            f5 = this.f33204s;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f4 = width / intrinsicWidth;
        } else {
            f4 = height / intrinsicHeight;
        }
        float f6 = f3 * f4;
        matrix.postScale(f6, f6);
        float f7 = intrinsicWidth * f6;
        float f8 = f6 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m58124e() {
        if (Float.isNaN(this.f33201p) && Float.isNaN(this.f33202q) && Float.isNaN(this.f33203r) && Float.isNaN(this.f33204s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m58125d();
        }
    }

    public float getContrast() {
        return this.f33189d.f33230f;
    }

    public float getCrossfade() {
        return this.f33190e;
    }

    public float getImagePanX() {
        return this.f33201p;
    }

    public float getImagePanY() {
        return this.f33202q;
    }

    public float getImageRotate() {
        return this.f33204s;
    }

    public float getImageZoom() {
        return this.f33203r;
    }

    public float getRound() {
        return this.f33192g;
    }

    public float getRoundPercent() {
        return this.f33191f;
    }

    public float getSaturation() {
        return this.f33189d.f33229e;
    }

    public float getWarmth() {
        return this.f33189d.f33231g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m58125d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
        this.f33199n = mutate;
        Drawable[] drawableArr = this.f33196k;
        drawableArr[0] = this.f33200o;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f33196k);
        this.f33197l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f33190e);
    }

    public void setBrightness(float f) {
        ImageFilterView.C3753c c3753c = this.f33189d;
        c3753c.f33228d = f;
        c3753c.m58116c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C3753c c3753c = this.f33189d;
        c3753c.f33230f = f;
        c3753c.m58116c(this);
    }

    public void setCrossfade(float f) {
        this.f33190e = f;
        if (this.f33196k != null) {
            if (!this.f33198m) {
                this.f33197l.getDrawable(0).setAlpha((int) ((1.0f - this.f33190e) * 255.0f));
            }
            this.f33197l.getDrawable(1).setAlpha((int) (this.f33190e * 255.0f));
            super.setImageDrawable(this.f33197l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f33199n != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f33200o = mutate;
            Drawable[] drawableArr = this.f33196k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33199n;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33196k);
            this.f33197l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33190e);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.f33201p = f;
        m58124e();
    }

    public void setImagePanY(float f) {
        this.f33202q = f;
        m58124e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f33199n != null) {
            Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
            this.f33200o = mutate;
            Drawable[] drawableArr = this.f33196k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33199n;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33196k);
            this.f33197l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33190e);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f33204s = f;
        m58124e();
    }

    public void setImageZoom(float f) {
        this.f33203r = f;
        m58124e();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33192g = f;
            float f2 = this.f33191f;
            this.f33191f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33192g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33192g = f;
        if (f != 0.0f) {
            if (this.f33193h == null) {
                this.f33193h = new Path();
            }
            if (this.f33195j == null) {
                this.f33195j = new RectF();
            }
            if (this.f33194i == null) {
                C3750b c3750b = new C3750b();
                this.f33194i = c3750b;
                setOutlineProvider(c3750b);
            }
            setClipToOutline(true);
            this.f33195j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33193h.reset();
            Path path = this.f33193h;
            RectF rectF = this.f33195j;
            float f3 = this.f33192g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z;
        if (this.f33191f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33191f = f;
        if (f != 0.0f) {
            if (this.f33193h == null) {
                this.f33193h = new Path();
            }
            if (this.f33195j == null) {
                this.f33195j = new RectF();
            }
            if (this.f33194i == null) {
                C3749a c3749a = new C3749a();
                this.f33194i = c3749a;
                setOutlineProvider(c3749a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33191f) / 2.0f;
            this.f33195j.set(0.0f, 0.0f, width, height);
            this.f33193h.reset();
            this.f33193h.addRoundRect(this.f33195j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C3753c c3753c = this.f33189d;
        c3753c.f33229e = f;
        c3753c.m58116c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C3753c c3753c = this.f33189d;
        c3753c.f33231g = f;
        c3753c.m58116c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33189d = new ImageFilterView.C3753c();
        this.f33190e = 0.0f;
        this.f33191f = 0.0f;
        this.f33192g = Float.NaN;
        this.f33196k = new Drawable[2];
        this.f33198m = true;
        this.f33199n = null;
        this.f33200o = null;
        this.f33201p = Float.NaN;
        this.f33202q = Float.NaN;
        this.f33203r = Float.NaN;
        this.f33204s = Float.NaN;
        m58126c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33189d = new ImageFilterView.C3753c();
        this.f33190e = 0.0f;
        this.f33191f = 0.0f;
        this.f33192g = Float.NaN;
        this.f33196k = new Drawable[2];
        this.f33198m = true;
        this.f33199n = null;
        this.f33200o = null;
        this.f33201p = Float.NaN;
        this.f33202q = Float.NaN;
        this.f33203r = Float.NaN;
        this.f33204s = Float.NaN;
        m58126c(context, attributeSet);
    }
}