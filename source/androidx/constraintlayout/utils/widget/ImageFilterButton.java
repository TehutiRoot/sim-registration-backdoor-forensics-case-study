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
    public ImageFilterView.C3771c f33101d;

    /* renamed from: e */
    public float f33102e;

    /* renamed from: f */
    public float f33103f;

    /* renamed from: g */
    public float f33104g;

    /* renamed from: h */
    public Path f33105h;

    /* renamed from: i */
    public ViewOutlineProvider f33106i;

    /* renamed from: j */
    public RectF f33107j;

    /* renamed from: k */
    public Drawable[] f33108k;

    /* renamed from: l */
    public LayerDrawable f33109l;

    /* renamed from: m */
    public boolean f33110m;

    /* renamed from: n */
    public Drawable f33111n;

    /* renamed from: o */
    public Drawable f33112o;

    /* renamed from: p */
    public float f33113p;

    /* renamed from: q */
    public float f33114q;

    /* renamed from: r */
    public float f33115r;

    /* renamed from: s */
    public float f33116s;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    /* loaded from: classes2.dex */
    public class C3767a extends ViewOutlineProvider {
        public C3767a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f33103f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    /* loaded from: classes2.dex */
    public class C3768b extends ViewOutlineProvider {
        public C3768b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f33104g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f33101d = new ImageFilterView.C3771c();
        this.f33102e = 0.0f;
        this.f33103f = 0.0f;
        this.f33104g = Float.NaN;
        this.f33108k = new Drawable[2];
        this.f33110m = true;
        this.f33111n = null;
        this.f33112o = null;
        this.f33113p = Float.NaN;
        this.f33114q = Float.NaN;
        this.f33115r = Float.NaN;
        this.f33116s = Float.NaN;
        m58176c(context, null);
    }

    private void setOverlay(boolean z) {
        this.f33110m = z;
    }

    /* renamed from: c */
    public final void m58176c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f33111n = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f33102e = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f33110m));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f33113p));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f33114q));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f33116s));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f33115r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f33112o = drawable;
            if (this.f33111n != null && drawable != null) {
                Drawable[] drawableArr = this.f33108k;
                Drawable mutate = getDrawable().mutate();
                this.f33112o = mutate;
                drawableArr[0] = mutate;
                this.f33108k[1] = this.f33111n.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f33108k);
                this.f33109l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f33102e * 255.0f));
                if (!this.f33110m) {
                    this.f33109l.getDrawable(0).setAlpha((int) ((1.0f - this.f33102e) * 255.0f));
                }
                super.setImageDrawable(this.f33109l);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f33112o = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f33108k;
                Drawable mutate2 = drawable2.mutate();
                this.f33112o = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: d */
    public final void m58175d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.f33113p) && Float.isNaN(this.f33114q) && Float.isNaN(this.f33115r) && Float.isNaN(this.f33116s)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.f33113p)) {
            f = 0.0f;
        } else {
            f = this.f33113p;
        }
        if (Float.isNaN(this.f33114q)) {
            f2 = 0.0f;
        } else {
            f2 = this.f33114q;
        }
        if (Float.isNaN(this.f33115r)) {
            f3 = 1.0f;
        } else {
            f3 = this.f33115r;
        }
        if (!Float.isNaN(this.f33116s)) {
            f5 = this.f33116s;
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
    public final void m58174e() {
        if (Float.isNaN(this.f33113p) && Float.isNaN(this.f33114q) && Float.isNaN(this.f33115r) && Float.isNaN(this.f33116s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m58175d();
        }
    }

    public float getContrast() {
        return this.f33101d.f33142f;
    }

    public float getCrossfade() {
        return this.f33102e;
    }

    public float getImagePanX() {
        return this.f33113p;
    }

    public float getImagePanY() {
        return this.f33114q;
    }

    public float getImageRotate() {
        return this.f33116s;
    }

    public float getImageZoom() {
        return this.f33115r;
    }

    public float getRound() {
        return this.f33104g;
    }

    public float getRoundPercent() {
        return this.f33103f;
    }

    public float getSaturation() {
        return this.f33101d.f33141e;
    }

    public float getWarmth() {
        return this.f33101d.f33143g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m58175d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
        this.f33111n = mutate;
        Drawable[] drawableArr = this.f33108k;
        drawableArr[0] = this.f33112o;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f33108k);
        this.f33109l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f33102e);
    }

    public void setBrightness(float f) {
        ImageFilterView.C3771c c3771c = this.f33101d;
        c3771c.f33140d = f;
        c3771c.m58166c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C3771c c3771c = this.f33101d;
        c3771c.f33142f = f;
        c3771c.m58166c(this);
    }

    public void setCrossfade(float f) {
        this.f33102e = f;
        if (this.f33108k != null) {
            if (!this.f33110m) {
                this.f33109l.getDrawable(0).setAlpha((int) ((1.0f - this.f33102e) * 255.0f));
            }
            this.f33109l.getDrawable(1).setAlpha((int) (this.f33102e * 255.0f));
            super.setImageDrawable(this.f33109l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f33111n != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f33112o = mutate;
            Drawable[] drawableArr = this.f33108k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33111n;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33108k);
            this.f33109l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33102e);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.f33113p = f;
        m58174e();
    }

    public void setImagePanY(float f) {
        this.f33114q = f;
        m58174e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f33111n != null) {
            Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
            this.f33112o = mutate;
            Drawable[] drawableArr = this.f33108k;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33111n;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33108k);
            this.f33109l = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33102e);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f33116s = f;
        m58174e();
    }

    public void setImageZoom(float f) {
        this.f33115r = f;
        m58174e();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33104g = f;
            float f2 = this.f33103f;
            this.f33103f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33104g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33104g = f;
        if (f != 0.0f) {
            if (this.f33105h == null) {
                this.f33105h = new Path();
            }
            if (this.f33107j == null) {
                this.f33107j = new RectF();
            }
            if (this.f33106i == null) {
                C3768b c3768b = new C3768b();
                this.f33106i = c3768b;
                setOutlineProvider(c3768b);
            }
            setClipToOutline(true);
            this.f33107j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33105h.reset();
            Path path = this.f33105h;
            RectF rectF = this.f33107j;
            float f3 = this.f33104g;
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
        if (this.f33103f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33103f = f;
        if (f != 0.0f) {
            if (this.f33105h == null) {
                this.f33105h = new Path();
            }
            if (this.f33107j == null) {
                this.f33107j = new RectF();
            }
            if (this.f33106i == null) {
                C3767a c3767a = new C3767a();
                this.f33106i = c3767a;
                setOutlineProvider(c3767a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33103f) / 2.0f;
            this.f33107j.set(0.0f, 0.0f, width, height);
            this.f33105h.reset();
            this.f33105h.addRoundRect(this.f33107j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C3771c c3771c = this.f33101d;
        c3771c.f33141e = f;
        c3771c.m58166c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C3771c c3771c = this.f33101d;
        c3771c.f33143g = f;
        c3771c.m58166c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33101d = new ImageFilterView.C3771c();
        this.f33102e = 0.0f;
        this.f33103f = 0.0f;
        this.f33104g = Float.NaN;
        this.f33108k = new Drawable[2];
        this.f33110m = true;
        this.f33111n = null;
        this.f33112o = null;
        this.f33113p = Float.NaN;
        this.f33114q = Float.NaN;
        this.f33115r = Float.NaN;
        this.f33116s = Float.NaN;
        m58176c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33101d = new ImageFilterView.C3771c();
        this.f33102e = 0.0f;
        this.f33103f = 0.0f;
        this.f33104g = Float.NaN;
        this.f33108k = new Drawable[2];
        this.f33110m = true;
        this.f33111n = null;
        this.f33112o = null;
        this.f33113p = Float.NaN;
        this.f33114q = Float.NaN;
        this.f33115r = Float.NaN;
        this.f33116s = Float.NaN;
        m58176c(context, attributeSet);
    }
}
