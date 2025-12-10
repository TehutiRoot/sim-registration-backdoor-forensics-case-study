package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    public static final Interpolator f9865j = new DecelerateInterpolator();

    /* renamed from: a */
    public Runnable f9866a;

    /* renamed from: b */
    public View$OnClickListenerC2209c f9867b;

    /* renamed from: c */
    public LinearLayoutCompat f9868c;

    /* renamed from: d */
    public Spinner f9869d;

    /* renamed from: e */
    public boolean f9870e;

    /* renamed from: f */
    public int f9871f;

    /* renamed from: g */
    public int f9872g;

    /* renamed from: h */
    public int f9873h;

    /* renamed from: i */
    public int f9874i;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimator mVisibilityAnim;

    /* loaded from: classes.dex */
    public class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9875a = false;

        /* renamed from: b */
        public int f9876b;

        public VisibilityAnimListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9875a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9875a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.mVisibilityAnim = null;
            scrollingTabContainerView.setVisibility(this.f9876b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f9875a = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f9876b = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    /* loaded from: classes.dex */
    public class RunnableC2207a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f9878a;

        public RunnableC2207a(View view) {
            this.f9878a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f9878a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f9878a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f9866a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    /* loaded from: classes.dex */
    public class C2208b extends BaseAdapter {
        public C2208b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f9868c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C2210d) ScrollingTabContainerView.this.f9868c.getChildAt(i)).m64176b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.m64181c((ActionBar.Tab) getItem(i), true);
            }
            ((C2210d) view).m64177a((ActionBar.Tab) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2209c implements View.OnClickListener {
        public View$OnClickListenerC2209c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((C2210d) view).m64176b().select();
            int childCount = ScrollingTabContainerView.this.f9868c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f9868c.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    /* loaded from: classes.dex */
    public class C2210d extends LinearLayout {

        /* renamed from: a */
        public final int[] f9882a;

        /* renamed from: b */
        public ActionBar.Tab f9883b;

        /* renamed from: c */
        public TextView f9884c;

        /* renamed from: d */
        public ImageView f9885d;

        /* renamed from: e */
        public View f9886e;

        public C2210d(Context context, ActionBar.Tab tab, boolean z) {
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f9882a = iArr;
            this.f9883b = tab;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            m64175c();
        }

        /* renamed from: a */
        public void m64177a(ActionBar.Tab tab) {
            this.f9883b = tab;
            m64175c();
        }

        /* renamed from: b */
        public ActionBar.Tab m64176b() {
            return this.f9883b;
        }

        /* renamed from: c */
        public void m64175c() {
            ActionBar.Tab tab = this.f9883b;
            View customView = tab.getCustomView();
            CharSequence charSequence = null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.f9886e = customView;
                TextView textView = this.f9884c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9885d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9885d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f9886e;
            if (view != null) {
                removeView(view);
                this.f9886e = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.f9885d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f9885d = appCompatImageView;
                }
                this.f9885d.setImageDrawable(icon);
                this.f9885d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f9885d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f9885d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(text);
            if (z) {
                if (this.f9884c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f9884c = appCompatTextView;
                }
                this.f9884c.setText(text);
                this.f9884c.setVisibility(0);
            } else {
                TextView textView2 = this.f9884c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f9884c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f9885d;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.getContentDescription());
            }
            if (!z) {
                charSequence = tab.getContentDescription();
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f9871f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f9871f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.f9872g = actionBarPolicy.getStackedTabMaxWidth();
        LinearLayoutCompat m64182b = m64182b();
        this.f9868c = m64182b;
        addView(m64182b, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public final Spinner m64183a() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
        C2210d m64181c = m64181c(tab, false);
        this.f9868c.addView(m64181c, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f9869d;
        if (spinner != null) {
            ((C2208b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            m64181c.setSelected(true);
        }
        if (this.f9870e) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        View childAt = this.f9868c.getChildAt(i);
        Runnable runnable = this.f9866a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC2207a runnableC2207a = new RunnableC2207a(childAt);
        this.f9866a = runnableC2207a;
        post(runnableC2207a);
    }

    public void animateToVisibility(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(f9865j);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(f9865j);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        alpha2.start();
    }

    /* renamed from: b */
    public final LinearLayoutCompat m64182b() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: c */
    public C2210d m64181c(ActionBar.Tab tab, boolean z) {
        C2210d c2210d = new C2210d(getContext(), tab, z);
        if (z) {
            c2210d.setBackgroundDrawable(null);
            c2210d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f9873h));
        } else {
            c2210d.setFocusable(true);
            if (this.f9867b == null) {
                this.f9867b = new View$OnClickListenerC2209c();
            }
            c2210d.setOnClickListener(this.f9867b);
        }
        return c2210d;
    }

    /* renamed from: d */
    public final boolean m64180d() {
        Spinner spinner = this.f9869d;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m64179e() {
        if (m64180d()) {
            return;
        }
        if (this.f9869d == null) {
            this.f9869d = m64183a();
        }
        removeView(this.f9868c);
        addView(this.f9869d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f9869d.getAdapter() == null) {
            this.f9869d.setAdapter((SpinnerAdapter) new C2208b());
        }
        Runnable runnable = this.f9866a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f9866a = null;
        }
        this.f9869d.setSelection(this.f9874i);
    }

    /* renamed from: f */
    public final boolean m64178f() {
        if (!m64180d()) {
            return false;
        }
        removeView(this.f9869d);
        addView(this.f9868c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f9869d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f9866a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.f9872g = actionBarPolicy.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f9866a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C2210d) view).m64176b().select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f9868c.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f9871f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f9871f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f9871f = Math.min(this.f9871f, this.f9872g);
        } else {
            this.f9871f = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f9873h, 1073741824);
        if (!z && this.f9870e) {
            this.f9868c.measure(0, makeMeasureSpec);
            if (this.f9868c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m64179e();
            } else {
                m64178f();
            }
        } else {
            m64178f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f9874i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.f9868c.removeAllViews();
        Spinner spinner = this.f9869d;
        if (spinner != null) {
            ((C2208b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9870e) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.f9868c.removeViewAt(i);
        Spinner spinner = this.f9869d;
        if (spinner != null) {
            ((C2208b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9870e) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f9870e = z;
    }

    public void setContentHeight(int i) {
        this.f9873h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f9874i = i;
        int childCount = this.f9868c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f9868c.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
        }
        Spinner spinner = this.f9869d;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void updateTab(int i) {
        ((C2210d) this.f9868c.getChildAt(i)).m64175c();
        Spinner spinner = this.f9869d;
        if (spinner != null) {
            ((C2208b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9870e) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        C2210d m64181c = m64181c(tab, false);
        this.f9868c.addView(m64181c, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f9869d;
        if (spinner != null) {
            ((C2208b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            m64181c.setSelected(true);
        }
        if (this.f9870e) {
            requestLayout();
        }
    }
}