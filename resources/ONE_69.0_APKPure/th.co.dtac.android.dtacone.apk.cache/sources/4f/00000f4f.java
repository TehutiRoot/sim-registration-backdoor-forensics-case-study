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
public class C1136Q5 extends C0979O5 {

    /* renamed from: d */
    public final SeekBar f5115d;

    /* renamed from: e */
    public Drawable f5116e;

    /* renamed from: f */
    public ColorStateList f5117f;

    /* renamed from: g */
    public PorterDuff.Mode f5118g;

    /* renamed from: h */
    public boolean f5119h;

    /* renamed from: i */
    public boolean f5120i;

    public C1136Q5(SeekBar seekBar) {
        super(seekBar);
        this.f5117f = null;
        this.f5118g = null;
        this.f5119h = false;
        this.f5120i = false;
        this.f5115d = seekBar;
    }

    @Override // p000.C0979O5
    /* renamed from: c */
    public void mo66844c(AttributeSet attributeSet, int i) {
        super.mo66844c(attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f5115d.getContext(), attributeSet, R.styleable.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f5115d;
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), R.styleable.AppCompatSeekBar, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.f5115d.setThumb(drawableIfKnown);
        }
        m66839j(obtainStyledAttributes.getDrawable(R.styleable.AppCompatSeekBar_tickMark));
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f5118g = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f5118g);
            this.f5120i = true;
        }
        if (obtainStyledAttributes.hasValue(R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f5117f = obtainStyledAttributes.getColorStateList(R.styleable.AppCompatSeekBar_tickMarkTint);
            this.f5119h = true;
        }
        obtainStyledAttributes.recycle();
        m66843f();
    }

    /* renamed from: f */
    public final void m66843f() {
        Drawable drawable = this.f5116e;
        if (drawable != null) {
            if (this.f5119h || this.f5120i) {
                Drawable wrap = DrawableCompat.wrap(drawable.mutate());
                this.f5116e = wrap;
                if (this.f5119h) {
                    DrawableCompat.setTintList(wrap, this.f5117f);
                }
                if (this.f5120i) {
                    DrawableCompat.setTintMode(this.f5116e, this.f5118g);
                }
                if (this.f5116e.isStateful()) {
                    this.f5116e.setState(this.f5115d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m66842g(Canvas canvas) {
        int i;
        if (this.f5116e != null) {
            int max = this.f5115d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f5116e.getIntrinsicWidth();
                int intrinsicHeight = this.f5116e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f5116e.setBounds(-i, -i2, i, i2);
                float width = ((this.f5115d.getWidth() - this.f5115d.getPaddingLeft()) - this.f5115d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f5115d.getPaddingLeft(), this.f5115d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5116e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m66841h() {
        Drawable drawable = this.f5116e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f5115d.getDrawableState())) {
            this.f5115d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m66840i() {
        Drawable drawable = this.f5116e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m66839j(Drawable drawable) {
        Drawable drawable2 = this.f5116e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5116e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f5115d);
            DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(this.f5115d));
            if (drawable.isStateful()) {
                drawable.setState(this.f5115d.getDrawableState());
            }
            m66843f();
        }
        this.f5115d.invalidate();
    }
}