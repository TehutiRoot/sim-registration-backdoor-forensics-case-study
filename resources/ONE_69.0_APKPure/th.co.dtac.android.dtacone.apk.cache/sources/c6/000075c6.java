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
    public boolean f38054A;

    /* renamed from: B */
    public int f38055B;

    /* renamed from: C */
    public boolean f38056C;

    /* renamed from: D */
    public float f38057D;

    /* renamed from: E */
    public float f38058E;

    /* renamed from: F */
    public int f38059F;

    /* renamed from: q */
    public int f38060q;

    /* renamed from: r */
    public int f38061r;

    /* renamed from: s */
    public int f38062s;

    /* renamed from: t */
    public int f38063t;

    /* renamed from: u */
    public int f38064u;

    /* renamed from: v */
    public int f38065v;

    /* renamed from: w */
    public final Paint f38066w;

    /* renamed from: x */
    public final Rect f38067x;

    /* renamed from: y */
    public int f38068y;

    /* renamed from: z */
    public boolean f38069z;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC5154a implements View.OnClickListener {
        public View$OnClickListenerC5154a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f38074a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC5155b implements View.OnClickListener {
        public View$OnClickListenerC5155b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f38074a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: c */
    public void mo52447c(int i, float f, boolean z) {
        Rect rect = this.f38067x;
        int height = getHeight();
        int left = this.f38076c.getLeft() - this.f38065v;
        int right = this.f38076c.getRight() + this.f38065v;
        int i2 = height - this.f38061r;
        rect.set(left, i2, right, height);
        super.mo52447c(i, f, z);
        this.f38068y = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f38076c.getLeft() - this.f38065v, i2, this.f38076c.getRight() + this.f38065v, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f38069z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f38064u);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f38060q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f38076c.getLeft() - this.f38065v;
        int right = this.f38076c.getRight() + this.f38065v;
        this.f38066w.setColor((this.f38068y << 24) | (this.f38060q & ViewCompat.MEASURED_SIZE_MASK));
        float f = height;
        canvas.drawRect(left, height - this.f38061r, right, f, this.f38066w);
        if (this.f38069z) {
            this.f38066w.setColor((this.f38060q & ViewCompat.MEASURED_SIZE_MASK) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f38055B, getWidth() - getPaddingRight(), f, this.f38066w);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f38056C) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x - this.f38057D) > this.f38059F || Math.abs(y - this.f38058E) > this.f38059F)) {
                    this.f38056C = true;
                }
            } else if (x < this.f38076c.getLeft() - this.f38065v) {
                ViewPager viewPager = this.f38074a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x > this.f38076c.getRight() + this.f38065v) {
                ViewPager viewPager2 = this.f38074a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.f38057D = x;
            this.f38058E = y;
            this.f38056C = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f38054A) {
            if ((i & (-16777216)) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f38069z = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f38054A) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f38069z = z;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f38054A) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f38069z = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f38069z = z;
        this.f38054A = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f38062s;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f38060q = i;
        this.f38066w.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f38063t;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f38066w = paint;
        this.f38067x = new Rect();
        this.f38068y = 255;
        this.f38069z = false;
        this.f38054A = false;
        int i = this.f38087n;
        this.f38060q = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f38061r = (int) ((3.0f * f) + 0.5f);
        this.f38062s = (int) ((6.0f * f) + 0.5f);
        this.f38063t = (int) (64.0f * f);
        this.f38065v = (int) ((16.0f * f) + 0.5f);
        this.f38055B = (int) ((1.0f * f) + 0.5f);
        this.f38064u = (int) ((f * 32.0f) + 0.5f);
        this.f38059F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f38075b.setFocusable(true);
        this.f38075b.setOnClickListener(new View$OnClickListenerC5154a());
        this.f38077d.setFocusable(true);
        this.f38077d.setOnClickListener(new View$OnClickListenerC5155b());
        if (getBackground() == null) {
            this.f38069z = true;
        }
    }
}