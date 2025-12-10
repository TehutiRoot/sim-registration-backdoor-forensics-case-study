package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: d */
    public float f33154d;

    /* renamed from: e */
    public float f33155e;

    /* renamed from: f */
    public Path f33156f;

    /* renamed from: g */
    public ViewOutlineProvider f33157g;

    /* renamed from: h */
    public RectF f33158h;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    /* loaded from: classes2.dex */
    public class C3772a extends ViewOutlineProvider {
        public C3772a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f33154d) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    /* loaded from: classes2.dex */
    public class C3773b extends ViewOutlineProvider {
        public C3773b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f33155e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f33154d = 0.0f;
        this.f33155e = Float.NaN;
        m58161c(context, null);
    }

    /* renamed from: c */
    private void m58161c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f33155e;
    }

    public float getRoundPercent() {
        return this.f33154d;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33155e = f;
            float f2 = this.f33154d;
            this.f33154d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33155e != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33155e = f;
        if (f != 0.0f) {
            if (this.f33156f == null) {
                this.f33156f = new Path();
            }
            if (this.f33158h == null) {
                this.f33158h = new RectF();
            }
            if (this.f33157g == null) {
                C3773b c3773b = new C3773b();
                this.f33157g = c3773b;
                setOutlineProvider(c3773b);
            }
            setClipToOutline(true);
            this.f33158h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33156f.reset();
            Path path = this.f33156f;
            RectF rectF = this.f33158h;
            float f3 = this.f33155e;
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
        if (this.f33154d != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33154d = f;
        if (f != 0.0f) {
            if (this.f33156f == null) {
                this.f33156f = new Path();
            }
            if (this.f33158h == null) {
                this.f33158h = new RectF();
            }
            if (this.f33157g == null) {
                C3772a c3772a = new C3772a();
                this.f33157g = c3772a;
                setOutlineProvider(c3772a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33154d) / 2.0f;
            this.f33158h.set(0.0f, 0.0f, width, height);
            this.f33156f.reset();
            this.f33156f.addRoundRect(this.f33158h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33154d = 0.0f;
        this.f33155e = Float.NaN;
        m58161c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33154d = 0.0f;
        this.f33155e = Float.NaN;
        m58161c(context, attributeSet);
    }
}
