package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* renamed from: fc */
/* loaded from: classes4.dex */
public class C10236fc extends Drawable {

    /* renamed from: b */
    public final Paint f61850b;

    /* renamed from: h */
    public float f61856h;

    /* renamed from: i */
    public int f61857i;

    /* renamed from: j */
    public int f61858j;

    /* renamed from: k */
    public int f61859k;

    /* renamed from: l */
    public int f61860l;

    /* renamed from: m */
    public int f61861m;

    /* renamed from: o */
    public ShapeAppearanceModel f61863o;

    /* renamed from: p */
    public ColorStateList f61864p;

    /* renamed from: a */
    public final ShapeAppearancePathProvider f61849a = ShapeAppearancePathProvider.getInstance();

    /* renamed from: c */
    public final Path f61851c = new Path();

    /* renamed from: d */
    public final Rect f61852d = new Rect();

    /* renamed from: e */
    public final RectF f61853e = new RectF();

    /* renamed from: f */
    public final RectF f61854f = new RectF();

    /* renamed from: g */
    public final C10238b f61855g = new C10238b();

    /* renamed from: n */
    public boolean f61862n = true;

    /* renamed from: fc$b */
    /* loaded from: classes4.dex */
    public class C10238b extends Drawable.ConstantState {
        public C10238b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C10236fc.this;
        }
    }

    public C10236fc(ShapeAppearanceModel shapeAppearanceModel) {
        this.f61863o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f61850b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final Shader m31286a() {
        Rect rect = this.f61852d;
        copyBounds(rect);
        float height = this.f61856h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f61857i, this.f61861m), ColorUtils.compositeColors(this.f61858j, this.f61861m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f61858j, 0), this.f61861m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f61860l, 0), this.f61861m), ColorUtils.compositeColors(this.f61860l, this.f61861m), ColorUtils.compositeColors(this.f61859k, this.f61861m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    public RectF m31285b() {
        this.f61854f.set(getBounds());
        return this.f61854f;
    }

    /* renamed from: c */
    public void m31284c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f61861m = colorStateList.getColorForState(getState(), this.f61861m);
        }
        this.f61864p = colorStateList;
        this.f61862n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m31283d(float f) {
        if (this.f61856h != f) {
            this.f61856h = f;
            this.f61850b.setStrokeWidth(f * 1.3333f);
            this.f61862n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f61862n) {
            this.f61850b.setShader(m31286a());
            this.f61862n = false;
        }
        float strokeWidth = this.f61850b.getStrokeWidth() / 2.0f;
        copyBounds(this.f61852d);
        this.f61853e.set(this.f61852d);
        float min = Math.min(this.f61863o.getTopLeftCornerSize().getCornerSize(m31285b()), this.f61853e.width() / 2.0f);
        if (this.f61863o.isRoundRect(m31285b())) {
            this.f61853e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f61853e, min, min, this.f61850b);
        }
    }

    /* renamed from: e */
    public void m31282e(int i, int i2, int i3, int i4) {
        this.f61857i = i;
        this.f61858j = i2;
        this.f61859k = i3;
        this.f61860l = i4;
    }

    /* renamed from: f */
    public void m31281f(ShapeAppearanceModel shapeAppearanceModel) {
        this.f61863o = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f61855g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f61856h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f61863o.isRoundRect(m31285b())) {
            outline.setRoundRect(getBounds(), this.f61863o.getTopLeftCornerSize().getCornerSize(m31285b()));
            return;
        }
        copyBounds(this.f61852d);
        this.f61853e.set(this.f61852d);
        this.f61849a.calculatePath(this.f61863o, 1.0f, this.f61853e, this.f61851c);
        DrawableUtils.setOutlineToPath(outline, this.f61851c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f61863o.isRoundRect(m31285b())) {
            int round = Math.round(this.f61856h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f61864p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f61862n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f61864p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f61861m)) != this.f61861m) {
            this.f61862n = true;
            this.f61861m = colorForState;
        }
        if (this.f61862n) {
            invalidateSelf();
        }
        return this.f61862n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f61850b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f61850b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
