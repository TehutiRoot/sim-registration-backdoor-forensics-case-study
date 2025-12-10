package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MotionTelltales extends MockView {

    /* renamed from: k */
    public Paint f33210k;

    /* renamed from: l */
    public MotionLayout f33211l;

    /* renamed from: m */
    public float[] f33212m;

    /* renamed from: n */
    public Matrix f33213n;

    /* renamed from: o */
    public int f33214o;

    /* renamed from: p */
    public int f33215p;

    /* renamed from: q */
    public float f33216q;

    public MotionTelltales(Context context) {
        super(context);
        this.f33210k = new Paint();
        this.f33212m = new float[2];
        this.f33213n = new Matrix();
        this.f33214o = 0;
        this.f33215p = -65281;
        this.f33216q = 0.25f;
        m58149a(context, null);
    }

    /* renamed from: a */
    public final void m58149a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.f33215p = obtainStyledAttributes.getColor(index, this.f33215p);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.f33214o = obtainStyledAttributes.getInt(index, this.f33214o);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.f33216q = obtainStyledAttributes.getFloat(index, this.f33216q);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f33210k.setColor(this.f33215p);
        this.f33210k.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f33213n);
        if (this.f33211l == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f33211l = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f33211l.getViewVelocity(this, f2, f, this.f33212m, this.f33214o);
                this.f33213n.mapVectors(this.f33212m);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f33212m;
                float f5 = fArr2[0];
                float f6 = this.f33216q;
                float f7 = f4 - (fArr2[1] * f6);
                this.f33213n.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f33210k);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33210k = new Paint();
        this.f33212m = new float[2];
        this.f33213n = new Matrix();
        this.f33214o = 0;
        this.f33215p = -65281;
        this.f33216q = 0.25f;
        m58149a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33210k = new Paint();
        this.f33212m = new float[2];
        this.f33213n = new Matrix();
        this.f33214o = 0;
        this.f33215p = -65281;
        this.f33216q = 0.25f;
        m58149a(context, attributeSet);
    }
}
