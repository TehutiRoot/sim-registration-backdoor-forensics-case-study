package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* renamed from: Q5 */
/* loaded from: classes.dex */
public class C1146Q5 extends C0990O5 {

    /* renamed from: d */
    public final SeekBar f4947d;

    /* renamed from: e */
    public Drawable f4948e;

    /* renamed from: f */
    public ColorStateList f4949f;

    /* renamed from: g */
    public PorterDuff.Mode f4950g;

    /* renamed from: h */
    public boolean f4951h;

    /* renamed from: i */
    public boolean f4952i;

    public C1146Q5(SeekBar seekBar) {
        super(seekBar);
        this.f4949f = null;
        this.f4950g = null;
        this.f4951h = false;
        this.f4952i = false;
        this.f4947d = seekBar;
    }

    @Override // p000.C0990O5
    /* renamed from: c */
    public void mo66688c(AttributeSet attributeSet, int i) {
        super.mo66688c(attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f4947d.getContext(), attributeSet, R.styleable.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f4947d;
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), R.styleable.AppCompatSeekBar, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.f4947d.setThumb(drawableIfKnown);
        }
        m66683j(obtainStyledAttributes.getDrawable(R.styleable.AppCompatSeekBar_tickMark));
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f4950g = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f4950g);
            this.f4952i = true;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f4949f = obtainStyledAttributes.getColorStateList(R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f4951h = true;
        }
        obtainStyledAttributes.recycle();
        m66687f();
    }

    /* renamed from: f */
    public final void m66687f() {
        Drawable drawable = this.f4948e;
        if (drawable != null) {
            if (this.f4951h || this.f4952i) {
                Drawable wrap = DrawableCompat.wrap(drawable.mutate());
                this.f4948e = wrap;
                if (this.f4951h) {
                    DrawableCompat.setTintList(wrap, this.f4949f);
                }
                if (this.f4952i) {
                    DrawableCompat.setTintMode(this.f4948e, this.f4950g);
                }
                if (this.f4948e.isStateful()) {
                    this.f4948e.setState(this.f4947d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m66686g(Canvas canvas) {
        int i;
        if (this.f4948e != null) {
            int max = this.f4947d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f4948e.getIntrinsicWidth();
                int intrinsicHeight = this.f4948e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f4948e.setBounds(-i, -i2, i, i2);
                float width = ((this.f4947d.getWidth() - this.f4947d.getPaddingLeft()) - this.f4947d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f4947d.getPaddingLeft(), this.f4947d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f4948e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m66685h() {
        Drawable drawable = this.f4948e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f4947d.getDrawableState())) {
            this.f4947d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m66684i() {
        Drawable drawable = this.f4948e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m66683j(Drawable drawable) {
        Drawable drawable2 = this.f4948e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4948e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f4947d);
            DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(this.f4947d));
            if (drawable.isStateful()) {
                drawable.setState(this.f4947d.getDrawableState());
            }
            m66687f();
        }
        this.f4947d.invalidate();
    }
}
