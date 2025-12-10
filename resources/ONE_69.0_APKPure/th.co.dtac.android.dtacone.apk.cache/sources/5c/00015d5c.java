package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacInteractiveEditText */
/* loaded from: classes9.dex */
public abstract class DtacInteractiveEditText extends DtacEditText implements View.OnTouchListener {

    /* renamed from: b */
    public boolean f107434b;

    /* renamed from: c */
    public Context f107435c;

    /* renamed from: d */
    public Drawable[] f107436d;

    /* renamed from: e */
    public int f107437e;

    public DtacInteractiveEditText(Context context) {
        super(context);
        this.f107434b = true;
        this.f107437e = R.color.colorBlue;
        initView(context);
    }

    private void initView(Context context) {
        setOnTouchListener(this);
        this.f107435c = context;
        this.f107436d = getCompoundDrawables();
        if (!isEnabled() && this.f107436d != null) {
            if (this.f107434b) {
                setCompoundDrawables(ContextCompat.getColor(context, R.color.warmGrey));
            }
            setTextColor(ContextCompat.getColor(context, R.color.warmGrey));
            invalidate();
        }
    }

    private synchronized void setCompoundDrawables(int i) {
        Drawable[] drawableArr;
        try {
            for (Drawable drawable : this.f107436d) {
                if (drawable != null) {
                    drawable.mutate();
                    drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                }
            }
            invalidate();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @CallSuper
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int color;
        super.onFocusChanged(z, i, rect);
        if (this.f107434b) {
            if (z && isEnabled()) {
                color = ContextCompat.getColor(this.f107435c, this.f107437e);
            } else if (!isEnabled()) {
                color = ContextCompat.getColor(this.f107435c, R.color.warmGreySeven);
            } else {
                color = ContextCompat.getColor(this.f107435c, R.color.grayishBrown);
            }
            setCompoundDrawables(color);
            Drawable[] drawableArr = this.f107436d;
            setCompoundDrawables(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
        }
    }

    public abstract void onRightTouchUpAction();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f107436d[2] != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int width = (getWidth() - getPaddingRight()) - this.f107436d[2].getIntrinsicWidth();
            int width2 = getWidth();
            if (x >= width && x <= width2 && y >= 0 && y <= getBottom() - getTop()) {
                if (motionEvent.getAction() == 1) {
                    onRightTouchUpAction();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void setFocusColor(int i) {
        this.f107437e = i;
    }

    public void setTextAndCompoundColor(@ColorRes int i) {
        setCompoundDrawables(ContextCompat.getColor(this.f107435c, i));
        setTextColor(ContextCompat.getColor(this.f107435c, i));
        invalidate();
    }

    public void setupRightDrawable(int i, boolean z) {
        this.f107436d[2] = null;
        if (z && isEnabled()) {
            this.f107436d[2] = ResourcesCompat.getDrawable(getResources(), i, null);
            this.f107436d[2].setColorFilter(ContextCompat.getColor(this.f107435c, this.f107437e), PorterDuff.Mode.SRC_IN);
            Drawable drawable = this.f107436d[2];
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f107436d[2].getIntrinsicHeight());
            int paddingTop = getPaddingTop() + this.f107436d[2].getIntrinsicHeight() + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingTop) {
                setMinimumHeight(paddingTop);
            }
        }
        Drawable[] drawableArr = this.f107436d;
        setCompoundDrawables(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
    }

    public DtacInteractiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f107434b = true;
        this.f107437e = R.color.colorBlue;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DtacInteractiveEditText, 0, 0);
        try {
            this.f107434b = obtainStyledAttributes.getBoolean(R.styleable.DtacInteractiveEditText_interactiveIconColor, true);
            obtainStyledAttributes.recycle();
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setupRightDrawable(int i, boolean z, Integer num) {
        this.f107436d[2] = null;
        if (z && isEnabled()) {
            this.f107436d[2] = ResourcesCompat.getDrawable(getResources(), i, null);
            Drawable drawable = this.f107436d[2];
            if (drawable != null) {
                if (num != null) {
                    drawable.setColorFilter(ContextCompat.getColor(this.f107435c, num.intValue()), PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.f107436d[2];
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f107436d[2].getIntrinsicHeight());
            }
            int paddingTop = getPaddingTop() + this.f107436d[2].getIntrinsicHeight() + getPaddingBottom();
            if (getSuggestedMinimumHeight() < paddingTop) {
                setMinimumHeight(paddingTop);
            }
        }
        Drawable[] drawableArr = this.f107436d;
        setCompoundDrawables(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
    }

    public DtacInteractiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107434b = true;
        this.f107437e = R.color.colorBlue;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DtacInteractiveEditText, 0, 0);
        try {
            this.f107434b = obtainStyledAttributes.getBoolean(R.styleable.DtacInteractiveEditText_interactiveIconColor, true);
            obtainStyledAttributes.recycle();
            initView(context);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}