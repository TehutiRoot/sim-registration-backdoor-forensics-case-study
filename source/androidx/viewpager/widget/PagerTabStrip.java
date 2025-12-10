package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: A */
    public boolean f37966A;

    /* renamed from: B */
    public int f37967B;

    /* renamed from: C */
    public boolean f37968C;

    /* renamed from: D */
    public float f37969D;

    /* renamed from: E */
    public float f37970E;

    /* renamed from: F */
    public int f37971F;

    /* renamed from: q */
    public int f37972q;

    /* renamed from: r */
    public int f37973r;

    /* renamed from: s */
    public int f37974s;

    /* renamed from: t */
    public int f37975t;

    /* renamed from: u */
    public int f37976u;

    /* renamed from: v */
    public int f37977v;

    /* renamed from: w */
    public final Paint f37978w;

    /* renamed from: x */
    public final Rect f37979x;

    /* renamed from: y */
    public int f37980y;

    /* renamed from: z */
    public boolean f37981z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC5172a implements View.OnClickListener {
        public View$OnClickListenerC5172a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f37986a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC5173b implements View.OnClickListener {
        public View$OnClickListenerC5173b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f37986a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: c */
    public void mo52495c(int i, float f, boolean z) {
        Rect rect = this.f37979x;
        int height = getHeight();
        int left = this.f37988c.getLeft() - this.f37977v;
        int right = this.f37988c.getRight() + this.f37977v;
        int i2 = height - this.f37973r;
        rect.set(left, i2, right, height);
        super.mo52495c(i, f, z);
        this.f37980y = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f37988c.getLeft() - this.f37977v, i2, this.f37988c.getRight() + this.f37977v, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f37981z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f37976u);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f37972q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f37988c.getLeft() - this.f37977v;
        int right = this.f37988c.getRight() + this.f37977v;
        this.f37978w.setColor((this.f37980y << 24) | (this.f37972q & ViewCompat.MEASURED_SIZE_MASK));
        float f = height;
        canvas.drawRect(left, height - this.f37973r, right, f, this.f37978w);
        if (this.f37981z) {
            this.f37978w.setColor((this.f37972q & ViewCompat.MEASURED_SIZE_MASK) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f37967B, getWidth() - getPaddingRight(), f, this.f37978w);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f37968C) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x - this.f37969D) > this.f37971F || Math.abs(y - this.f37970E) > this.f37971F)) {
                    this.f37968C = true;
                }
            } else if (x < this.f37988c.getLeft() - this.f37977v) {
                ViewPager viewPager = this.f37986a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x > this.f37988c.getRight() + this.f37977v) {
                ViewPager viewPager2 = this.f37986a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.f37969D = x;
            this.f37970E = y;
            this.f37968C = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f37966A) {
            if ((i & (-16777216)) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f37981z = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f37966A) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f37981z = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f37966A) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f37981z = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f37981z = z;
        this.f37966A = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f37974s;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f37972q = i;
        this.f37978w.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f37975t;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f37978w = paint;
        this.f37979x = new Rect();
        this.f37980y = 255;
        this.f37981z = false;
        this.f37966A = false;
        int i = this.f37999n;
        this.f37972q = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f37973r = (int) ((3.0f * f) + 0.5f);
        this.f37974s = (int) ((6.0f * f) + 0.5f);
        this.f37975t = (int) (64.0f * f);
        this.f37977v = (int) ((16.0f * f) + 0.5f);
        this.f37967B = (int) ((1.0f * f) + 0.5f);
        this.f37976u = (int) ((f * 32.0f) + 0.5f);
        this.f37971F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f37987b.setFocusable(true);
        this.f37987b.setOnClickListener(new View$OnClickListenerC5172a());
        this.f37989d.setFocusable(true);
        this.f37989d.setOnClickListener(new View$OnClickListenerC5173b());
        if (getBackground() == null) {
            this.f37981z = true;
        }
    }
}
