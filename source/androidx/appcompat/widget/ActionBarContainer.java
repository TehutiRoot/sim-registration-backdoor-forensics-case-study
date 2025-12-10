package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f9453a;

    /* renamed from: b */
    public View f9454b;

    /* renamed from: c */
    public View f9455c;

    /* renamed from: d */
    public View f9456d;

    /* renamed from: e */
    public Drawable f9457e;

    /* renamed from: f */
    public Drawable f9458f;

    /* renamed from: g */
    public Drawable f9459g;

    /* renamed from: h */
    public boolean f9460h;

    /* renamed from: i */
    public boolean f9461i;

    /* renamed from: j */
    public int f9462j;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    /* loaded from: classes.dex */
    public static class C2164a {
        /* renamed from: a */
        public static void m64410a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int m64412a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m64411b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9457e;
        if (drawable != null && drawable.isStateful()) {
            this.f9457e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9458f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9458f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9459g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f9459g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f9454b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9457e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9458f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9459g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9455c = findViewById(R.id.action_bar);
        this.f9456d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f9453a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f9454b;
        boolean z3 = true;
        boolean z4 = false;
        if (view != null && view.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f9460h) {
            Drawable drawable2 = this.f9459g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f9457e != null) {
                if (this.f9455c.getVisibility() == 0) {
                    this.f9457e.setBounds(this.f9455c.getLeft(), this.f9455c.getTop(), this.f9455c.getRight(), this.f9455c.getBottom());
                } else {
                    View view2 = this.f9456d;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f9457e.setBounds(this.f9456d.getLeft(), this.f9456d.getTop(), this.f9456d.getRight(), this.f9456d.getBottom());
                    } else {
                        this.f9457e.setBounds(0, 0, 0, 0);
                    }
                }
                z4 = true;
            }
            this.f9461i = z2;
            if (z2 && (drawable = this.f9458f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z3 = z4;
            }
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f9455c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f9462j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f9455c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f9454b;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!m64411b(this.f9455c)) {
                i3 = m64412a(this.f9455c);
            } else if (!m64411b(this.f9456d)) {
                i3 = m64412a(this.f9456d);
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i4 = View.MeasureSpec.getSize(i2);
            } else {
                i4 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m64412a(this.f9454b), i4));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9457e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9457e);
        }
        this.f9457e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9455c;
            if (view != null) {
                this.f9457e.setBounds(view.getLeft(), this.f9455c.getTop(), this.f9455c.getRight(), this.f9455c.getBottom());
            }
        }
        boolean z = false;
        if (!this.f9460h ? !(this.f9457e != null || this.f9458f != null) : this.f9459g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C2164a.m64410a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9459g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9459g);
        }
        this.f9459g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9460h && (drawable2 = this.f9459g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f9460h ? !(this.f9457e != null || this.f9458f != null) : this.f9459g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C2164a.m64410a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9458f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9458f);
        }
        this.f9458f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9461i && (drawable2 = this.f9458f) != null) {
                drawable2.setBounds(this.f9454b.getLeft(), this.f9454b.getTop(), this.f9454b.getRight(), this.f9454b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f9460h ? !(this.f9457e != null || this.f9458f != null) : this.f9459g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C2164a.m64410a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f9454b;
        if (view != null) {
            removeView(view);
        }
        this.f9454b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f9453a = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f9457e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f9458f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f9459g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f9457e && !this.f9460h) || ((drawable == this.f9458f && this.f9461i) || ((drawable == this.f9459g && this.f9460h) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.setBackground(this, new C0569I1(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f9457e = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f9458f = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f9462j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.f9460h = true;
            this.f9459g = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f9460h ? this.f9457e != null || this.f9458f != null : this.f9459g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
