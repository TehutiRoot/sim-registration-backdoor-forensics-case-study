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
    public static final Interpolator f9777j = new DecelerateInterpolator();

    /* renamed from: a */
    public Runnable f9778a;

    /* renamed from: b */
    public View$OnClickListenerC2227c f9779b;

    /* renamed from: c */
    public LinearLayoutCompat f9780c;

    /* renamed from: d */
    public Spinner f9781d;

    /* renamed from: e */
    public boolean f9782e;

    /* renamed from: f */
    public int f9783f;

    /* renamed from: g */
    public int f9784g;

    /* renamed from: h */
    public int f9785h;

    /* renamed from: i */
    public int f9786i;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimator mVisibilityAnim;

    /* loaded from: classes.dex */
    public class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9787a = false;

        /* renamed from: b */
        public int f9788b;

        public VisibilityAnimListener() {
            ScrollingTabContainerView.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9787a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9787a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.mVisibilityAnim = null;
            scrollingTabContainerView.setVisibility(this.f9788b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f9787a = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f9788b = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    /* loaded from: classes.dex */
    public class RunnableC2225a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f9790a;

        public RunnableC2225a(View view) {
            ScrollingTabContainerView.this = r1;
            this.f9790a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f9790a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f9790a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f9778a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    /* loaded from: classes.dex */
    public class C2226b extends BaseAdapter {
        public C2226b() {
            ScrollingTabContainerView.this = r1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f9780c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C2228d) ScrollingTabContainerView.this.f9780c.getChildAt(i)).m64225b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.m64230c((ActionBar.Tab) getItem(i), true);
            }
            ((C2228d) view).m64226a((ActionBar.Tab) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2227c implements View.OnClickListener {
        public View$OnClickListenerC2227c() {
            ScrollingTabContainerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((C2228d) view).m64225b().select();
            int childCount = ScrollingTabContainerView.this.f9780c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f9780c.getChildAt(i);
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
    public class C2228d extends LinearLayout {

        /* renamed from: a */
        public final int[] f9794a;

        /* renamed from: b */
        public ActionBar.Tab f9795b;

        /* renamed from: c */
        public TextView f9796c;

        /* renamed from: d */
        public ImageView f9797d;

        /* renamed from: e */
        public View f9798e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2228d(Context context, ActionBar.Tab tab, boolean z) {
            super(context, null, R.attr.actionBarTabStyle);
            ScrollingTabContainerView.this = r3;
            int[] iArr = {16842964};
            this.f9794a = iArr;
            this.f9795b = tab;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            m64224c();
        }

        /* renamed from: a */
        public void m64226a(ActionBar.Tab tab) {
            this.f9795b = tab;
            m64224c();
        }

        /* renamed from: b */
        public ActionBar.Tab m64225b() {
            return this.f9795b;
        }

        /* renamed from: c */
        public void m64224c() {
            ActionBar.Tab tab = this.f9795b;
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
                this.f9798e = customView;
                TextView textView = this.f9796c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9797d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9797d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f9798e;
            if (view != null) {
                removeView(view);
                this.f9798e = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.f9797d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f9797d = appCompatImageView;
                }
                this.f9797d.setImageDrawable(icon);
                this.f9797d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f9797d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f9797d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(text);
            if (z) {
                if (this.f9796c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f9796c = appCompatTextView;
                }
                this.f9796c.setText(text);
                this.f9796c.setVisibility(0);
            } else {
                TextView textView2 = this.f9796c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f9796c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f9797d;
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
            if (ScrollingTabContainerView.this.f9783f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f9783f;
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
        this.f9784g = actionBarPolicy.getStackedTabMaxWidth();
        LinearLayoutCompat m64231b = m64231b();
        this.f9780c = m64231b;
        addView(m64231b, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public final Spinner m64232a() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
        C2228d m64230c = m64230c(tab, false);
        this.f9780c.addView(m64230c, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f9781d;
        if (spinner != null) {
            ((C2226b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            m64230c.setSelected(true);
        }
        if (this.f9782e) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        View childAt = this.f9780c.getChildAt(i);
        Runnable runnable = this.f9778a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC2225a runnableC2225a = new RunnableC2225a(childAt);
        this.f9778a = runnableC2225a;
        post(runnableC2225a);
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
            alpha.setInterpolator(f9777j);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(f9777j);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        alpha2.start();
    }

    /* renamed from: b */
    public final LinearLayoutCompat m64231b() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: c */
    public C2228d m64230c(ActionBar.Tab tab, boolean z) {
        C2228d c2228d = new C2228d(getContext(), tab, z);
        if (z) {
            c2228d.setBackgroundDrawable(null);
            c2228d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f9785h));
        } else {
            c2228d.setFocusable(true);
            if (this.f9779b == null) {
                this.f9779b = new View$OnClickListenerC2227c();
            }
            c2228d.setOnClickListener(this.f9779b);
        }
        return c2228d;
    }

    /* renamed from: d */
    public final boolean m64229d() {
        Spinner spinner = this.f9781d;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m64228e() {
        if (m64229d()) {
            return;
        }
        if (this.f9781d == null) {
            this.f9781d = m64232a();
        }
        removeView(this.f9780c);
        addView(this.f9781d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f9781d.getAdapter() == null) {
            this.f9781d.setAdapter((SpinnerAdapter) new C2226b());
        }
        Runnable runnable = this.f9778a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f9778a = null;
        }
        this.f9781d.setSelection(this.f9786i);
    }

    /* renamed from: f */
    public final boolean m64227f() {
        if (!m64229d()) {
            return false;
        }
        removeView(this.f9781d);
        addView(this.f9780c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f9781d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f9778a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.f9784g = actionBarPolicy.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f9778a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C2228d) view).m64225b().select();
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
        int childCount = this.f9780c.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f9783f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f9783f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f9783f = Math.min(this.f9783f, this.f9784g);
        } else {
            this.f9783f = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f9785h, 1073741824);
        if (!z && this.f9782e) {
            this.f9780c.measure(0, makeMeasureSpec);
            if (this.f9780c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m64228e();
            } else {
                m64227f();
            }
        } else {
            m64227f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f9786i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.f9780c.removeAllViews();
        Spinner spinner = this.f9781d;
        if (spinner != null) {
            ((C2226b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9782e) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.f9780c.removeViewAt(i);
        Spinner spinner = this.f9781d;
        if (spinner != null) {
            ((C2226b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9782e) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f9782e = z;
    }

    public void setContentHeight(int i) {
        this.f9785h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f9786i = i;
        int childCount = this.f9780c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f9780c.getChildAt(i2);
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
        Spinner spinner = this.f9781d;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void updateTab(int i) {
        ((C2228d) this.f9780c.getChildAt(i)).m64224c();
        Spinner spinner = this.f9781d;
        if (spinner != null) {
            ((C2226b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f9782e) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        C2228d m64230c = m64230c(tab, false);
        this.f9780c.addView(m64230c, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f9781d;
        if (spinner != null) {
            ((C2226b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            m64230c.setSelected(true);
        }
        if (this.f9782e) {
            requestLayout();
        }
    }
}
