package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: d */
    public C3771c f33119d;

    /* renamed from: e */
    public boolean f33120e;

    /* renamed from: f */
    public Drawable f33121f;

    /* renamed from: g */
    public Drawable f33122g;

    /* renamed from: h */
    public float f33123h;

    /* renamed from: i */
    public float f33124i;

    /* renamed from: j */
    public float f33125j;

    /* renamed from: k */
    public Path f33126k;

    /* renamed from: l */
    public ViewOutlineProvider f33127l;

    /* renamed from: m */
    public RectF f33128m;

    /* renamed from: n */
    public Drawable[] f33129n;

    /* renamed from: o */
    public LayerDrawable f33130o;

    /* renamed from: p */
    public float f33131p;

    /* renamed from: q */
    public float f33132q;

    /* renamed from: r */
    public float f33133r;

    /* renamed from: s */
    public float f33134s;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    /* loaded from: classes2.dex */
    public class C3769a extends ViewOutlineProvider {
        public C3769a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f33124i) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    /* loaded from: classes2.dex */
    public class C3770b extends ViewOutlineProvider {
        public C3770b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f33125j);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    /* loaded from: classes2.dex */
    public static class C3771c {

        /* renamed from: a */
        public float[] f33137a = new float[20];

        /* renamed from: b */
        public ColorMatrix f33138b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f33139c = new ColorMatrix();

        /* renamed from: d */
        public float f33140d = 1.0f;

        /* renamed from: e */
        public float f33141e = 1.0f;

        /* renamed from: f */
        public float f33142f = 1.0f;

        /* renamed from: g */
        public float f33143g = 1.0f;

        /* renamed from: a */
        public final void m58168a(float f) {
            float[] fArr = this.f33137a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void m58167b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f33137a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void m58166c(ImageView imageView) {
            boolean z;
            this.f33138b.reset();
            float f = this.f33141e;
            boolean z2 = true;
            if (f != 1.0f) {
                m58167b(f);
                this.f33138b.set(this.f33137a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f33142f;
            if (f2 != 1.0f) {
                this.f33139c.setScale(f2, f2, f2, 1.0f);
                this.f33138b.postConcat(this.f33139c);
                z = true;
            }
            float f3 = this.f33143g;
            if (f3 != 1.0f) {
                m58165d(f3);
                this.f33139c.set(this.f33137a);
                this.f33138b.postConcat(this.f33139c);
                z = true;
            }
            float f4 = this.f33140d;
            if (f4 != 1.0f) {
                m58168a(f4);
                this.f33139c.set(this.f33137a);
                this.f33138b.postConcat(this.f33139c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f33138b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void m58165d(float f) {
            float log;
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = f4 - 60.0f;
                f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f4)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            if (f4 < 66.0f) {
                if (f4 > 19.0f) {
                    f3 = (((float) Math.log(f4 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f2, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f3, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f33137a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f33119d = new C3771c();
        this.f33120e = true;
        this.f33121f = null;
        this.f33122g = null;
        this.f33123h = 0.0f;
        this.f33124i = 0.0f;
        this.f33125j = Float.NaN;
        this.f33129n = new Drawable[2];
        this.f33131p = Float.NaN;
        this.f33132q = Float.NaN;
        this.f33133r = Float.NaN;
        this.f33134s = Float.NaN;
        m58171c(context, null);
    }

    /* renamed from: c */
    private void m58171c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f33121f = obtainStyledAttributes.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_crossfade) {
                    this.f33123h = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f33120e));
                } else if (index == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f33131p));
                } else if (index == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f33132q));
                } else if (index == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f33134s));
                } else if (index == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f33133r));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f33122g = drawable;
            if (this.f33121f != null && drawable != null) {
                Drawable[] drawableArr = this.f33129n;
                Drawable mutate = getDrawable().mutate();
                this.f33122g = mutate;
                drawableArr[0] = mutate;
                this.f33129n[1] = this.f33121f.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f33129n);
                this.f33130o = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f33123h * 255.0f));
                if (!this.f33120e) {
                    this.f33130o.getDrawable(0).setAlpha((int) ((1.0f - this.f33123h) * 255.0f));
                }
                super.setImageDrawable(this.f33130o);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f33122g = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f33129n;
                Drawable mutate2 = drawable2.mutate();
                this.f33122g = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: d */
    private void m58170d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.f33131p) && Float.isNaN(this.f33132q) && Float.isNaN(this.f33133r) && Float.isNaN(this.f33134s)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.f33131p)) {
            f = 0.0f;
        } else {
            f = this.f33131p;
        }
        if (Float.isNaN(this.f33132q)) {
            f2 = 0.0f;
        } else {
            f2 = this.f33132q;
        }
        if (Float.isNaN(this.f33133r)) {
            f3 = 1.0f;
        } else {
            f3 = this.f33133r;
        }
        if (!Float.isNaN(this.f33134s)) {
            f5 = this.f33134s;
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

    /* renamed from: e */
    private void m58169e() {
        if (Float.isNaN(this.f33131p) && Float.isNaN(this.f33132q) && Float.isNaN(this.f33133r) && Float.isNaN(this.f33134s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m58170d();
        }
    }

    private void setOverlay(boolean z) {
        this.f33120e = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f33119d.f33140d;
    }

    public float getContrast() {
        return this.f33119d.f33142f;
    }

    public float getCrossfade() {
        return this.f33123h;
    }

    public float getImagePanX() {
        return this.f33131p;
    }

    public float getImagePanY() {
        return this.f33132q;
    }

    public float getImageRotate() {
        return this.f33134s;
    }

    public float getImageZoom() {
        return this.f33133r;
    }

    public float getRound() {
        return this.f33125j;
    }

    public float getRoundPercent() {
        return this.f33124i;
    }

    public float getSaturation() {
        return this.f33119d.f33141e;
    }

    public float getWarmth() {
        return this.f33119d.f33143g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m58170d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
        this.f33121f = mutate;
        Drawable[] drawableArr = this.f33129n;
        drawableArr[0] = this.f33122g;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f33129n);
        this.f33130o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f33123h);
    }

    public void setBrightness(float f) {
        C3771c c3771c = this.f33119d;
        c3771c.f33140d = f;
        c3771c.m58166c(this);
    }

    public void setContrast(float f) {
        C3771c c3771c = this.f33119d;
        c3771c.f33142f = f;
        c3771c.m58166c(this);
    }

    public void setCrossfade(float f) {
        this.f33123h = f;
        if (this.f33129n != null) {
            if (!this.f33120e) {
                this.f33130o.getDrawable(0).setAlpha((int) ((1.0f - this.f33123h) * 255.0f));
            }
            this.f33130o.getDrawable(1).setAlpha((int) (this.f33123h * 255.0f));
            super.setImageDrawable(this.f33130o);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f33121f != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f33122g = mutate;
            Drawable[] drawableArr = this.f33129n;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33121f;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33129n);
            this.f33130o = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33123h);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.f33131p = f;
        m58169e();
    }

    public void setImagePanY(float f) {
        this.f33132q = f;
        m58169e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f33121f != null) {
            Drawable mutate = AppCompatResources.getDrawable(getContext(), i).mutate();
            this.f33122g = mutate;
            Drawable[] drawableArr = this.f33129n;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f33121f;
            LayerDrawable layerDrawable = new LayerDrawable(this.f33129n);
            this.f33130o = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f33123h);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f33134s = f;
        m58169e();
    }

    public void setImageZoom(float f) {
        this.f33133r = f;
        m58169e();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33125j = f;
            float f2 = this.f33124i;
            this.f33124i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33125j != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33125j = f;
        if (f != 0.0f) {
            if (this.f33126k == null) {
                this.f33126k = new Path();
            }
            if (this.f33128m == null) {
                this.f33128m = new RectF();
            }
            if (this.f33127l == null) {
                C3770b c3770b = new C3770b();
                this.f33127l = c3770b;
                setOutlineProvider(c3770b);
            }
            setClipToOutline(true);
            this.f33128m.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33126k.reset();
            Path path = this.f33126k;
            RectF rectF = this.f33128m;
            float f3 = this.f33125j;
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
        if (this.f33124i != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33124i = f;
        if (f != 0.0f) {
            if (this.f33126k == null) {
                this.f33126k = new Path();
            }
            if (this.f33128m == null) {
                this.f33128m = new RectF();
            }
            if (this.f33127l == null) {
                C3769a c3769a = new C3769a();
                this.f33127l = c3769a;
                setOutlineProvider(c3769a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33124i) / 2.0f;
            this.f33128m.set(0.0f, 0.0f, width, height);
            this.f33126k.reset();
            this.f33126k.addRoundRect(this.f33128m, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C3771c c3771c = this.f33119d;
        c3771c.f33141e = f;
        c3771c.m58166c(this);
    }

    public void setWarmth(float f) {
        C3771c c3771c = this.f33119d;
        c3771c.f33143g = f;
        c3771c.m58166c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33119d = new C3771c();
        this.f33120e = true;
        this.f33121f = null;
        this.f33122g = null;
        this.f33123h = 0.0f;
        this.f33124i = 0.0f;
        this.f33125j = Float.NaN;
        this.f33129n = new Drawable[2];
        this.f33131p = Float.NaN;
        this.f33132q = Float.NaN;
        this.f33133r = Float.NaN;
        this.f33134s = Float.NaN;
        m58171c(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33119d = new C3771c();
        this.f33120e = true;
        this.f33121f = null;
        this.f33122g = null;
        this.f33123h = 0.0f;
        this.f33124i = 0.0f;
        this.f33125j = Float.NaN;
        this.f33129n = new Drawable[2];
        this.f33131p = Float.NaN;
        this.f33132q = Float.NaN;
        this.f33133r = Float.NaN;
        this.f33134s = Float.NaN;
        m58171c(context, attributeSet);
    }
}
