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
    public float f33242d;

    /* renamed from: e */
    public float f33243e;

    /* renamed from: f */
    public Path f33244f;

    /* renamed from: g */
    public ViewOutlineProvider f33245g;

    /* renamed from: h */
    public RectF f33246h;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    /* loaded from: classes2.dex */
    public class C3754a extends ViewOutlineProvider {
        public C3754a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f33242d) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    /* loaded from: classes2.dex */
    public class C3755b extends ViewOutlineProvider {
        public C3755b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f33243e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f33242d = 0.0f;
        this.f33243e = Float.NaN;
        m58111c(context, null);
    }

    /* renamed from: c */
    private void m58111c(Context context, AttributeSet attributeSet) {
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
        return this.f33243e;
    }

    public float getRoundPercent() {
        return this.f33242d;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f33243e = f;
            float f2 = this.f33242d;
            this.f33242d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f33243e != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33243e = f;
        if (f != 0.0f) {
            if (this.f33244f == null) {
                this.f33244f = new Path();
            }
            if (this.f33246h == null) {
                this.f33246h = new RectF();
            }
            if (this.f33245g == null) {
                C3755b c3755b = new C3755b();
                this.f33245g = c3755b;
                setOutlineProvider(c3755b);
            }
            setClipToOutline(true);
            this.f33246h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f33244f.reset();
            Path path = this.f33244f;
            RectF rectF = this.f33246h;
            float f3 = this.f33243e;
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
        if (this.f33242d != f) {
            z = true;
        } else {
            z = false;
        }
        this.f33242d = f;
        if (f != 0.0f) {
            if (this.f33244f == null) {
                this.f33244f = new Path();
            }
            if (this.f33246h == null) {
                this.f33246h = new RectF();
            }
            if (this.f33245g == null) {
                C3754a c3754a = new C3754a();
                this.f33245g = c3754a;
                setOutlineProvider(c3754a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f33242d) / 2.0f;
            this.f33246h.set(0.0f, 0.0f, width, height);
            this.f33244f.reset();
            this.f33244f.addRoundRect(this.f33246h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33242d = 0.0f;
        this.f33243e = Float.NaN;
        m58111c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33242d = 0.0f;
        this.f33243e = Float.NaN;
        m58111c(context, attributeSet);
    }
}