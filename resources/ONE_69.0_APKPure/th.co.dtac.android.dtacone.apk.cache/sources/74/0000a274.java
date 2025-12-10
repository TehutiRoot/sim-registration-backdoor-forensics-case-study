package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    public Drawable f50257a;

    /* renamed from: b */
    public Rect f50258b;

    /* renamed from: c */
    public Rect f50259c;

    /* renamed from: d */
    public boolean f50260d;

    /* renamed from: e */
    public boolean f50261e;

    /* renamed from: f */
    public boolean f50262f;

    /* renamed from: g */
    public boolean f50263g;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    /* loaded from: classes4.dex */
    public class C6985a implements OnApplyWindowInsetsListener {
        public C6985a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean z;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f50258b == null) {
                scrimInsetsFrameLayout.f50258b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f50258b.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            ScrimInsetsFrameLayout.this.onInsetsChanged(windowInsetsCompat);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (windowInsetsCompat.hasSystemWindowInsets() && ScrimInsetsFrameLayout.this.f50257a != null) {
                z = false;
            } else {
                z = true;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ViewCompat.postInvalidateOnAnimation(ScrimInsetsFrameLayout.this);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f50258b != null && this.f50257a != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f50260d) {
                this.f50259c.set(0, 0, width, this.f50258b.top);
                this.f50257a.setBounds(this.f50259c);
                this.f50257a.draw(canvas);
            }
            if (this.f50261e) {
                this.f50259c.set(0, height - this.f50258b.bottom, width, height);
                this.f50257a.setBounds(this.f50259c);
                this.f50257a.draw(canvas);
            }
            if (this.f50262f) {
                Rect rect = this.f50259c;
                Rect rect2 = this.f50258b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f50257a.setBounds(this.f50259c);
                this.f50257a.draw(canvas);
            }
            if (this.f50263g) {
                Rect rect3 = this.f50259c;
                Rect rect4 = this.f50258b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f50257a.setBounds(this.f50259c);
                this.f50257a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f50257a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f50257a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f50261e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f50262f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.f50263g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f50260d = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f50257a = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50259c = new Rect();
        this.f50260d = true;
        this.f50261e = true;
        this.f50262f = true;
        this.f50263g = true;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f50257a = obtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new C6985a());
    }
}