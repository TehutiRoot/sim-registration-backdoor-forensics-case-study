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
    public Paint f33298k;

    /* renamed from: l */
    public MotionLayout f33299l;

    /* renamed from: m */
    public float[] f33300m;

    /* renamed from: n */
    public Matrix f33301n;

    /* renamed from: o */
    public int f33302o;

    /* renamed from: p */
    public int f33303p;

    /* renamed from: q */
    public float f33304q;

    public MotionTelltales(Context context) {
        super(context);
        this.f33298k = new Paint();
        this.f33300m = new float[2];
        this.f33301n = new Matrix();
        this.f33302o = 0;
        this.f33303p = -65281;
        this.f33304q = 0.25f;
        m58099a(context, null);
    }

    /* renamed from: a */
    public final void m58099a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.f33303p = obtainStyledAttributes.getColor(index, this.f33303p);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.f33302o = obtainStyledAttributes.getInt(index, this.f33302o);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.f33304q = obtainStyledAttributes.getFloat(index, this.f33304q);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f33298k.setColor(this.f33303p);
        this.f33298k.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f33301n);
        if (this.f33299l == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f33299l = (MotionLayout) parent;
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
                this.f33299l.getViewVelocity(this, f2, f, this.f33300m, this.f33302o);
                this.f33301n.mapVectors(this.f33300m);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.f33300m;
                float f5 = fArr2[0];
                float f6 = this.f33304q;
                float f7 = f4 - (fArr2[1] * f6);
                this.f33301n.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f33298k);
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
        this.f33298k = new Paint();
        this.f33300m = new float[2];
        this.f33301n = new Matrix();
        this.f33302o = 0;
        this.f33303p = -65281;
        this.f33304q = 0.25f;
        m58099a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33298k = new Paint();
        this.f33300m = new float[2];
        this.f33301n = new Matrix();
        this.f33302o = 0;
        this.f33303p = -65281;
        this.f33304q = 0.25f;
        m58099a(context, attributeSet);
    }
}