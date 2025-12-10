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
    public Drawable f50245a;

    /* renamed from: b */
    public Rect f50246b;

    /* renamed from: c */
    public Rect f50247c;

    /* renamed from: d */
    public boolean f50248d;

    /* renamed from: e */
    public boolean f50249e;

    /* renamed from: f */
    public boolean f50250f;

    /* renamed from: g */
    public boolean f50251g;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    /* loaded from: classes4.dex */
    public class C6996a implements OnApplyWindowInsetsListener {
        public C6996a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean z;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f50246b == null) {
                scrimInsetsFrameLayout.f50246b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f50246b.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            ScrimInsetsFrameLayout.this.onInsetsChanged(windowInsetsCompat);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (windowInsetsCompat.hasSystemWindowInsets() && ScrimInsetsFrameLayout.this.f50245a != null) {
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
        if (this.f50246b != null && this.f50245a != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f50248d) {
                this.f50247c.set(0, 0, width, this.f50246b.top);
                this.f50245a.setBounds(this.f50247c);
                this.f50245a.draw(canvas);
            }
            if (this.f50249e) {
                this.f50247c.set(0, height - this.f50246b.bottom, width, height);
                this.f50245a.setBounds(this.f50247c);
                this.f50245a.draw(canvas);
            }
            if (this.f50250f) {
                Rect rect = this.f50247c;
                Rect rect2 = this.f50246b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f50245a.setBounds(this.f50247c);
                this.f50245a.draw(canvas);
            }
            if (this.f50251g) {
                Rect rect3 = this.f50247c;
                Rect rect4 = this.f50246b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f50245a.setBounds(this.f50247c);
                this.f50245a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f50245a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f50245a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f50249e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f50250f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.f50251g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f50248d = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f50245a = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50247c = new Rect();
        this.f50248d = true;
        this.f50249e = true;
        this.f50250f = true;
        this.f50251g = true;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f50245a = obtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new C6996a());
    }
}
