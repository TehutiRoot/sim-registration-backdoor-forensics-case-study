package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
/* loaded from: classes4.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    /* renamed from: a0 */
    public static final int f50895a0 = R.style.Widget_Design_TabLayout;

    /* renamed from: b0 */
    public static final Pools.Pool f50896b0 = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    public int f50897A;

    /* renamed from: B */
    public int f50898B;

    /* renamed from: C */
    public int f50899C;

    /* renamed from: D */
    public int f50900D;

    /* renamed from: E */
    public boolean f50901E;

    /* renamed from: F */
    public boolean f50902F;

    /* renamed from: G */
    public int f50903G;

    /* renamed from: H */
    public int f50904H;

    /* renamed from: I */
    public boolean f50905I;

    /* renamed from: J */
    public C7109a f50906J;

    /* renamed from: K */
    public final TimeInterpolator f50907K;

    /* renamed from: L */
    public BaseOnTabSelectedListener f50908L;

    /* renamed from: M */
    public final ArrayList f50909M;

    /* renamed from: N */
    public BaseOnTabSelectedListener f50910N;

    /* renamed from: O */
    public ValueAnimator f50911O;

    /* renamed from: P */
    public ViewPager f50912P;

    /* renamed from: Q */
    public PagerAdapter f50913Q;

    /* renamed from: R */
    public DataSetObserver f50914R;

    /* renamed from: S */
    public TabLayoutOnPageChangeListener f50915S;

    /* renamed from: T */
    public C7102b f50916T;

    /* renamed from: U */
    public boolean f50917U;

    /* renamed from: V */
    public int f50918V;

    /* renamed from: W */
    public final Pools.Pool f50919W;

    /* renamed from: a */
    public int f50920a;

    /* renamed from: b */
    public final ArrayList f50921b;

    /* renamed from: c */
    public Tab f50922c;

    /* renamed from: d */
    public final C7104d f50923d;

    /* renamed from: e */
    public int f50924e;

    /* renamed from: f */
    public int f50925f;

    /* renamed from: g */
    public int f50926g;

    /* renamed from: h */
    public int f50927h;

    /* renamed from: i */
    public final int f50928i;

    /* renamed from: j */
    public final int f50929j;

    /* renamed from: k */
    public int f50930k;

    /* renamed from: l */
    public ColorStateList f50931l;

    /* renamed from: m */
    public ColorStateList f50932m;

    /* renamed from: n */
    public ColorStateList f50933n;

    /* renamed from: o */
    public Drawable f50934o;

    /* renamed from: p */
    public int f50935p;

    /* renamed from: q */
    public PorterDuff.Mode f50936q;

    /* renamed from: r */
    public float f50937r;

    /* renamed from: s */
    public float f50938s;

    /* renamed from: t */
    public float f50939t;

    /* renamed from: u */
    public final int f50940u;

    /* renamed from: v */
    public int f50941v;

    /* renamed from: w */
    public final int f50942w;

    /* renamed from: x */
    public final int f50943x;

    /* renamed from: y */
    public final int f50944y;

    /* renamed from: z */
    public int f50945z;

    @Deprecated
    /* loaded from: classes4.dex */
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t);

        void onTabSelected(T t);

        void onTabUnselected(T t);
    }

    /* loaded from: classes4.dex */
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    /* loaded from: classes4.dex */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TabIndicatorGravity {
    }

    /* loaded from: classes4.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public final WeakReference f50954a;

        /* renamed from: b */
        public int f50955b;

        /* renamed from: c */
        public int f50956c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f50954a = new WeakReference(tabLayout);
        }

        /* renamed from: a */
        public void m43917a() {
            this.f50956c = 0;
            this.f50955b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f50955b = this.f50956c;
            this.f50956c = i;
            TabLayout tabLayout = (TabLayout) this.f50954a.get();
            if (tabLayout != null) {
                tabLayout.m43951E(this.f50956c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f50954a.get();
            if (tabLayout != null) {
                int i3 = this.f50956c;
                if (i3 == 2 && this.f50955b != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 == 2 && this.f50955b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                tabLayout.m43925z(i, f, z, z2, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f50954a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f50956c;
                if (i2 != 0 && (i2 != 2 || this.f50955b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: a */
        public Tab f50957a;

        /* renamed from: b */
        public TextView f50958b;

        /* renamed from: c */
        public ImageView f50959c;

        /* renamed from: d */
        public View f50960d;

        /* renamed from: e */
        public BadgeDrawable f50961e;

        /* renamed from: f */
        public View f50962f;

        /* renamed from: g */
        public TextView f50963g;

        /* renamed from: h */
        public ImageView f50964h;

        /* renamed from: i */
        public Drawable f50965i;

        /* renamed from: j */
        public int f50966j;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        /* loaded from: classes4.dex */
        public class View$OnLayoutChangeListenerC7100a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ View f50968a;

            public View$OnLayoutChangeListenerC7100a(View view) {
                this.f50968a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f50968a.getVisibility() == 0) {
                    TabView.this.m43892w(this.f50968a);
                }
            }
        }

        public TabView(@NonNull Context context) {
            super(context);
            this.f50966j = 2;
            m43890y(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.f50924e, TabLayout.this.f50925f, TabLayout.this.f50926g, TabLayout.this.f50927h);
            setGravity(17);
            setOrientation(!TabLayout.this.f50901E ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.f50961e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.f50961e == null) {
                this.f50961e = BadgeDrawable.create(getContext());
            }
            m43893v();
            BadgeDrawable badgeDrawable = this.f50961e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: A */
        public final void m43916A() {
            View view;
            ViewParent parent;
            Tab tab = this.f50957a;
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f50962f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f50962f);
                    }
                    addView(view);
                }
                this.f50962f = view;
                TextView textView = this.f50958b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f50959c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f50959c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f50963g = textView2;
                if (textView2 != null) {
                    this.f50966j = TextViewCompat.getMaxLines(textView2);
                }
                this.f50964h = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f50962f;
                if (view3 != null) {
                    removeView(view3);
                    this.f50962f = null;
                }
                this.f50963g = null;
                this.f50964h = null;
            }
            if (this.f50962f == null) {
                if (this.f50959c == null) {
                    m43899p();
                }
                if (this.f50958b == null) {
                    m43898q();
                    this.f50966j = TextViewCompat.getMaxLines(this.f50958b);
                }
                TextViewCompat.setTextAppearance(this.f50958b, TabLayout.this.f50928i);
                if (isSelected() && TabLayout.this.f50930k != -1) {
                    TextViewCompat.setTextAppearance(this.f50958b, TabLayout.this.f50930k);
                } else {
                    TextViewCompat.setTextAppearance(this.f50958b, TabLayout.this.f50929j);
                }
                ColorStateList colorStateList = TabLayout.this.f50931l;
                if (colorStateList != null) {
                    this.f50958b.setTextColor(colorStateList);
                }
                m43915B(this.f50958b, this.f50959c, true);
                m43893v();
                m43906i(this.f50959c);
                m43906i(this.f50958b);
            } else {
                TextView textView3 = this.f50963g;
                if (textView3 != null || this.f50964h != null) {
                    m43915B(textView3, this.f50964h, false);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.f50949d)) {
                setContentDescription(tab.f50949d);
            }
        }

        /* renamed from: B */
        public final void m43915B(TextView textView, ImageView imageView, boolean z) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            CharSequence charSequence2;
            int i2;
            Tab tab = this.f50957a;
            CharSequence charSequence3 = null;
            if (tab != null && tab.getIcon() != null) {
                drawable = DrawableCompat.wrap(this.f50957a.getIcon()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, TabLayout.this.f50932m);
                PorterDuff.Mode mode = TabLayout.this.f50936q;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawable, mode);
                }
            }
            Tab tab2 = this.f50957a;
            if (tab2 != null) {
                charSequence = tab2.getText();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                z2 = (z3 && this.f50957a.f50952g == 1) ? false : false;
                if (z3) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                if (z3) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z2 && imageView.getVisibility() == 0) {
                    i = (int) ViewUtils.dpToPx(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.f50901E) {
                    if (i != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f50957a;
            if (tab3 != null) {
                charSequence3 = tab3.f50949d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z3) {
                    charSequence = charSequence3;
                }
                TooltipCompat.setTooltipText(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            boolean z;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f50965i;
            if (drawable != null && drawable.isStateful()) {
                z = this.f50965i.setState(drawableState);
            } else {
                z = false;
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f50958b, this.f50959c, this.f50962f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f50958b, this.f50959c, this.f50962f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        @Nullable
        public Tab getTab() {
            return this.f50957a;
        }

        /* renamed from: i */
        public final void m43906i(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC7100a(view));
        }

        /* renamed from: j */
        public final float m43905j(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: k */
        public final void m43904k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: l */
        public final FrameLayout m43903l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: m */
        public final void m43902m(Canvas canvas) {
            Drawable drawable = this.f50965i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f50965i.draw(canvas);
            }
        }

        /* renamed from: n */
        public final FrameLayout m43901n(View view) {
            if ((view != this.f50959c && view != this.f50958b) || !BadgeUtils.USE_COMPAT_PARENT) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* renamed from: o */
        public final boolean m43900o() {
            if (this.f50961e != null) {
                return true;
            }
            return false;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f50961e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f50961e.getContentDescription()));
            }
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f50957a.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f50941v, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f50958b != null) {
                float f = TabLayout.this.f50937r;
                int i3 = this.f50966j;
                ImageView imageView = this.f50959c;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.f50958b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f50939t;
                    }
                }
                float textSize = this.f50958b.getTextSize();
                int lineCount = this.f50958b.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f50958b);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f50900D != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.f50958b.getLayout()) != null && m43905j(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f50958b.setTextSize(0, f);
                        this.f50958b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public final void m43899p() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = m43903l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f50959c = imageView;
            frameLayout.addView(imageView, 0);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f50957a != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f50957a.select();
                return true;
            }
            return performClick;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        public final void m43898q() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = m43903l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f50958b = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: r */
        public final void m43897r() {
            if (this.f50960d != null) {
                m43894u();
            }
            this.f50961e = null;
        }

        /* renamed from: s */
        public void m43896s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f50958b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f50959c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f50962f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable Tab tab) {
            if (tab != this.f50957a) {
                this.f50957a = tab;
                m43891x();
            }
        }

        /* renamed from: t */
        public final void m43895t(View view) {
            if (m43900o() && view != null) {
                m43904k(false);
                BadgeUtils.attachBadgeDrawable(this.f50961e, view, m43901n(view));
                this.f50960d = view;
            }
        }

        /* renamed from: u */
        public final void m43894u() {
            if (!m43900o()) {
                return;
            }
            m43904k(true);
            View view = this.f50960d;
            if (view != null) {
                BadgeUtils.detachBadgeDrawable(this.f50961e, view);
                this.f50960d = null;
            }
        }

        /* renamed from: v */
        public final void m43893v() {
            Tab tab;
            Tab tab2;
            if (!m43900o()) {
                return;
            }
            if (this.f50962f != null) {
                m43894u();
            } else if (this.f50959c != null && (tab2 = this.f50957a) != null && tab2.getIcon() != null) {
                View view = this.f50960d;
                ImageView imageView = this.f50959c;
                if (view != imageView) {
                    m43894u();
                    m43895t(this.f50959c);
                    return;
                }
                m43892w(imageView);
            } else if (this.f50958b != null && (tab = this.f50957a) != null && tab.getTabLabelVisibility() == 1) {
                View view2 = this.f50960d;
                TextView textView = this.f50958b;
                if (view2 != textView) {
                    m43894u();
                    m43895t(this.f50958b);
                    return;
                }
                m43892w(textView);
            } else {
                m43894u();
            }
        }

        /* renamed from: w */
        public final void m43892w(View view) {
            if (m43900o() && view == this.f50960d) {
                BadgeUtils.setBadgeDrawableBounds(this.f50961e, view, m43901n(view));
            }
        }

        /* renamed from: x */
        public final void m43891x() {
            boolean z;
            m43916A();
            Tab tab = this.f50957a;
            if (tab != null && tab.isSelected()) {
                z = true;
            } else {
                z = false;
            }
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: y */
        public final void m43890y(Context context) {
            int i = TabLayout.this.f50940u;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i);
                this.f50965i = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.f50965i.setState(getDrawableState());
                }
            } else {
                this.f50965i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f50933n != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.f50933n);
                boolean z = TabLayout.this.f50905I;
                if (z) {
                    gradientDrawable2 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(convertToRippleDrawableColor, gradientDrawable2, gradientDrawable);
            }
            ViewCompat.setBackground(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* renamed from: z */
        public final void m43889z() {
            setOrientation(!TabLayout.this.f50901E ? 1 : 0);
            TextView textView = this.f50963g;
            if (textView == null && this.f50964h == null) {
                m43915B(this.f50958b, this.f50959c, true);
            } else {
                m43915B(textView, this.f50964h, false);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a */
        public final ViewPager f50970a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f50970a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.f50970a.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes4.dex */
    public class C7101a implements ValueAnimator.AnimatorUpdateListener {
        public C7101a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes4.dex */
    public class C7102b implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        public boolean f50972a;

        public C7102b() {
        }

        /* renamed from: a */
        public void m43888a(boolean z) {
            this.f50972a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f50912P == viewPager) {
                tabLayout.m43926y(pagerAdapter2, this.f50972a);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes4.dex */
    public class C7103c extends DataSetObserver {
        public C7103c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m43928w();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m43928w();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes4.dex */
    public class C7104d extends LinearLayout {

        /* renamed from: a */
        public ValueAnimator f50975a;

        /* renamed from: b */
        public int f50976b;

        /* renamed from: com.google.android.material.tabs.TabLayout$d$a */
        /* loaded from: classes4.dex */
        public class C7105a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f50978a;

            /* renamed from: b */
            public final /* synthetic */ View f50979b;

            public C7105a(View view, View view2) {
                this.f50978a = view;
                this.f50979b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7104d.this.m43878j(this.f50978a, this.f50979b, valueAnimator.getAnimatedFraction());
            }
        }

        public C7104d(Context context) {
            super(context);
            this.f50976b = -1;
            setWillNotDraw(false);
        }

        /* renamed from: c */
        public void m43885c(int i, int i2) {
            ValueAnimator valueAnimator = this.f50975a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f50920a != i) {
                this.f50975a.cancel();
            }
            m43877k(true, i, i2);
        }

        /* renamed from: d */
        public boolean m43884d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f50934o.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f50934o.getIntrinsicHeight();
            }
            int i = TabLayout.this.f50899C;
            if (i != 0) {
                if (i != 1) {
                    height = 0;
                    if (i != 2) {
                        if (i != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.f50934o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f50934o.getBounds();
                TabLayout.this.f50934o.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.f50934o.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public final void m43883e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f50920a == -1) {
                tabLayout.f50920a = tabLayout.getSelectedTabPosition();
            }
            m43882f(TabLayout.this.f50920a);
        }

        /* renamed from: f */
        public final void m43882f(int i) {
            if (TabLayout.this.f50918V != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i);
            C7109a c7109a = TabLayout.this.f50906J;
            TabLayout tabLayout = TabLayout.this;
            c7109a.m43872c(tabLayout, childAt, tabLayout.f50934o);
            TabLayout.this.f50920a = i;
        }

        /* renamed from: g */
        public final void m43881g() {
            m43882f(TabLayout.this.getSelectedTabPosition());
        }

        /* renamed from: h */
        public void m43880h(int i, float f) {
            TabLayout.this.f50920a = Math.round(i + f);
            ValueAnimator valueAnimator = this.f50975a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f50975a.cancel();
            }
            m43878j(getChildAt(i), getChildAt(i + 1), f);
        }

        /* renamed from: i */
        public void m43879i(int i) {
            Rect bounds = TabLayout.this.f50934o.getBounds();
            TabLayout.this.f50934o.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: j */
        public final void m43878j(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C7109a c7109a = TabLayout.this.f50906J;
                TabLayout tabLayout = TabLayout.this;
                c7109a.mo31544d(tabLayout, view, view2, f, tabLayout.f50934o);
            } else {
                Drawable drawable = TabLayout.this.f50934o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f50934o.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        /* renamed from: k */
        public final void m43877k(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f50920a == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m43881g();
                return;
            }
            TabLayout.this.f50920a = i;
            C7105a c7105a = new C7105a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f50975a = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.f50907K);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(c7105a);
                valueAnimator.start();
                return;
            }
            this.f50975a.removeAllUpdateListeners();
            this.f50975a.addUpdateListener(c7105a);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f50975a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m43877k(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                m43883e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f50897A == 1 || tabLayout.f50900D == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f50897A = 0;
                    tabLayout2.m43952D(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f50976b != i) {
                requestLayout();
                this.f50976b = i;
            }
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f50921b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Tab tab = (Tab) this.f50921b.get(i);
            if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                if (!this.f50901E) {
                    return 72;
                }
            } else {
                i++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f50942w;
        if (i != -1) {
            return i;
        }
        int i2 = this.f50900D;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.f50944y;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f50923d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: o */
    public static ColorStateList m43936o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        boolean z;
        boolean z2;
        int childCount = this.f50923d.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f50923d.getChildAt(i2);
                boolean z3 = true;
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).m43916A();
                    }
                } else {
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                }
            }
        }
    }

    /* renamed from: A */
    public final void m43955A(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f50912P;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f50915S;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            C7102b c7102b = this.f50916T;
            if (c7102b != null) {
                this.f50912P.removeOnAdapterChangeListener(c7102b);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.f50910N;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.f50910N = null;
        }
        if (viewPager != null) {
            this.f50912P = viewPager;
            if (this.f50915S == null) {
                this.f50915S = new TabLayoutOnPageChangeListener(this);
            }
            this.f50915S.m43917a();
            viewPager.addOnPageChangeListener(this.f50915S);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.f50910N = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                m43926y(adapter, z);
            }
            if (this.f50916T == null) {
                this.f50916T = new C7102b();
            }
            this.f50916T.m43888a(z);
            viewPager.addOnAdapterChangeListener(this.f50916T);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f50912P = null;
            m43926y(null, false);
        }
        this.f50917U = z2;
    }

    /* renamed from: B */
    public final void m43954B() {
        int size = this.f50921b.size();
        for (int i = 0; i < size; i++) {
            ((Tab) this.f50921b.get(i)).m43918g();
        }
    }

    /* renamed from: C */
    public final void m43953C(LinearLayout.LayoutParams layoutParams) {
        if (this.f50900D == 1 && this.f50897A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: D */
    public void m43952D(boolean z) {
        for (int i = 0; i < this.f50923d.getChildCount(); i++) {
            View childAt = this.f50923d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m43953C((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: E */
    public void m43951E(int i) {
        this.f50918V = i;
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.f50921b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m43942i(view);
    }

    public void clearOnTabSelectedListeners() {
        this.f50909M.clear();
    }

    public Tab createTabFromPool() {
        Tab tab = (Tab) f50896b0.acquire();
        if (tab == null) {
            return new Tab();
        }
        return tab;
    }

    /* renamed from: g */
    public final void m43944g(TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.setIcon(drawable);
        }
        int i = tabItem.customLayout;
        if (i != 0) {
            newTab.setCustomView(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f50922c;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (Tab) this.f50921b.get(i);
        }
        return null;
    }

    public int getTabCount() {
        return this.f50921b.size();
    }

    public int getTabGravity() {
        return this.f50897A;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f50932m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f50904H;
    }

    public int getTabIndicatorGravity() {
        return this.f50899C;
    }

    public int getTabMaxWidth() {
        return this.f50941v;
    }

    public int getTabMode() {
        return this.f50900D;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f50933n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f50934o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f50931l;
    }

    /* renamed from: h */
    public final void m43943h(Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f50923d.addView(tabView, tab.getPosition(), m43935p());
    }

    public boolean hasUnboundedRipple() {
        return this.f50905I;
    }

    /* renamed from: i */
    public final void m43942i(View view) {
        if (view instanceof TabItem) {
            m43944g((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public boolean isInlineLabel() {
        return this.f50901E;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.f50902F;
    }

    /* renamed from: j */
    public final void m43941j(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && !this.f50923d.m43884d()) {
            int scrollX = getScrollX();
            int m43938m = m43938m(i, 0.0f);
            if (scrollX != m43938m) {
                m43930u();
                this.f50911O.setIntValues(scrollX, m43938m);
                this.f50911O.start();
            }
            this.f50923d.m43885c(i, this.f50898B);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    /* renamed from: k */
    public final void m43940k(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.f50923d.setGravity(1);
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.f50923d.setGravity(GravityCompat.START);
    }

    /* renamed from: l */
    public final void m43939l() {
        int max;
        int i = this.f50900D;
        if (i != 0 && i != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f50945z - this.f50924e);
        }
        ViewCompat.setPaddingRelative(this.f50923d, max, 0, 0, 0);
        int i2 = this.f50900D;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                if (this.f50897A == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f50923d.setGravity(1);
            }
        } else {
            m43940k(this.f50897A);
        }
        m43952D(true);
    }

    /* renamed from: m */
    public final int m43938m(int i, float f) {
        View childAt;
        View view;
        int i2 = this.f50900D;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f50923d.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.f50923d.getChildCount()) {
            view = this.f50923d.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: n */
    public final void m43937n(Tab tab, int i) {
        tab.m43919f(i);
        this.f50921b.add(i, tab);
        int size = this.f50921b.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((Tab) this.f50921b.get(i3)).getPosition() == this.f50920a) {
                i2 = i3;
            }
            ((Tab) this.f50921b.get(i3)).m43919f(i3);
        }
        this.f50920a = i2;
    }

    @NonNull
    public Tab newTab() {
        Tab createTabFromPool = createTabFromPool();
        createTabFromPool.parent = this;
        createTabFromPool.view = m43934q(createTabFromPool);
        if (createTabFromPool.f50953h != -1) {
            createTabFromPool.view.setId(createTabFromPool.f50953h);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f50912P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m43955A((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f50917U) {
            setupWithViewPager(null);
            this.f50917U = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f50923d.getChildCount(); i++) {
            View childAt = this.f50923d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m43902m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m43929v() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int round = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f50943x;
            if (i3 <= 0) {
                i3 = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.f50941v = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f50900D;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !m43929v()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final LinearLayout.LayoutParams m43935p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m43953C(layoutParams);
        return layoutParams;
    }

    /* renamed from: q */
    public final TabView m43934q(Tab tab) {
        TabView tabView;
        Pools.Pool pool = this.f50919W;
        if (pool != null) {
            tabView = (TabView) pool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f50949d)) {
            tabView.setContentDescription(tab.f50948c);
        } else {
            tabView.setContentDescription(tab.f50949d);
        }
        return tabView;
    }

    /* renamed from: r */
    public final void m43933r(Tab tab) {
        for (int size = this.f50909M.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.f50909M.get(size)).onTabReselected(tab);
        }
    }

    public boolean releaseFromTabPool(Tab tab) {
        return f50896b0.release(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.f50923d.getChildCount() - 1; childCount >= 0; childCount--) {
            m43927x(childCount);
        }
        Iterator it = this.f50921b.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            it.remove();
            tab.m43920e();
            releaseFromTabPool(tab);
        }
        this.f50922c = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent == this) {
            removeTabAt(tab.getPosition());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        Tab tab;
        Tab tab2 = this.f50922c;
        if (tab2 != null) {
            i2 = tab2.getPosition();
        } else {
            i2 = 0;
        }
        m43927x(i);
        Tab tab3 = (Tab) this.f50921b.remove(i);
        if (tab3 != null) {
            tab3.m43920e();
            releaseFromTabPool(tab3);
        }
        int size = this.f50921b.size();
        int i3 = -1;
        for (int i4 = i; i4 < size; i4++) {
            if (((Tab) this.f50921b.get(i4)).getPosition() == this.f50920a) {
                i3 = i4;
            }
            ((Tab) this.f50921b.get(i4)).m43919f(i4);
        }
        this.f50920a = i3;
        if (i2 == i) {
            if (this.f50921b.isEmpty()) {
                tab = null;
            } else {
                tab = (Tab) this.f50921b.get(Math.max(0, i - 1));
            }
            selectTab(tab);
        }
    }

    /* renamed from: s */
    public final void m43932s(Tab tab) {
        for (int size = this.f50909M.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.f50909M.get(size)).onTabSelected(tab);
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f50901E != z) {
            this.f50901E = z;
            for (int i = 0; i < this.f50923d.getChildCount(); i++) {
                View childAt = this.f50923d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m43889z();
                }
            }
            m43939l();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m43930u();
        this.f50911O.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.f50934o = mutate;
        DrawableUtils.setTint(mutate, this.f50935p);
        int i = this.f50903G;
        if (i == -1) {
            i = this.f50934o.getIntrinsicHeight();
        }
        this.f50923d.m43879i(i);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f50935p = i;
        DrawableUtils.setTint(this.f50934o, i);
        m43952D(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f50899C != i) {
            this.f50899C = i;
            ViewCompat.postInvalidateOnAnimation(this.f50923d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f50903G = i;
        this.f50923d.m43879i(i);
    }

    public void setTabGravity(int i) {
        if (this.f50897A != i) {
            this.f50897A = i;
            m43939l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f50932m != colorStateList) {
            this.f50932m = colorStateList;
            m43954B();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f50904H = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f50906J = new C1539VV();
                    return;
                }
                throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
            }
            this.f50906J = new C10149eR();
            return;
        }
        this.f50906J = new C7109a();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f50902F = z;
        this.f50923d.m43881g();
        ViewCompat.postInvalidateOnAnimation(this.f50923d);
    }

    public void setTabMode(int i) {
        if (i != this.f50900D) {
            this.f50900D = i;
            m43939l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f50933n != colorStateList) {
            this.f50933n = colorStateList;
            for (int i = 0; i < this.f50923d.getChildCount(); i++) {
                View childAt = this.f50923d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m43890y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f50931l != colorStateList) {
            this.f50931l = colorStateList;
            m43954B();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m43926y(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f50905I != z) {
            this.f50905I = z;
            for (int i = 0; i < this.f50923d.getChildCount(); i++) {
                View childAt = this.f50923d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m43890y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void m43931t(Tab tab) {
        for (int size = this.f50909M.size() - 1; size >= 0; size--) {
            ((BaseOnTabSelectedListener) this.f50909M.get(size)).onTabUnselected(tab);
        }
    }

    /* renamed from: u */
    public final void m43930u() {
        if (this.f50911O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f50911O = valueAnimator;
            valueAnimator.setInterpolator(this.f50907K);
            this.f50911O.setDuration(this.f50898B);
            this.f50911O.addUpdateListener(new C7101a());
        }
    }

    /* renamed from: v */
    public final boolean m43929v() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public void m43928w() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.f50913Q;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().setText(this.f50913Q.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f50912P;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    /* renamed from: x */
    public final void m43927x(int i) {
        TabView tabView = (TabView) this.f50923d.getChildAt(i);
        this.f50923d.removeViewAt(i);
        if (tabView != null) {
            tabView.m43896s();
            this.f50919W.release(tabView);
        }
        requestLayout();
    }

    /* renamed from: y */
    public void m43926y(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f50913Q;
        if (pagerAdapter2 != null && (dataSetObserver = this.f50914R) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f50913Q = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f50914R == null) {
                this.f50914R = new C7103c();
            }
            pagerAdapter.registerDataSetObserver(this.f50914R);
        }
        m43928w();
    }

    /* renamed from: z */
    public void m43925z(int i, float f, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int round = Math.round(i + f);
        if (round >= 0 && round < this.f50923d.getChildCount()) {
            if (z2) {
                this.f50923d.m43880h(i, f);
            }
            ValueAnimator valueAnimator = this.f50911O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f50911O.cancel();
            }
            int m43938m = m43938m(i, f);
            int scrollX = getScrollX();
            if ((i < getSelectedTabPosition() && m43938m >= scrollX) || ((i > getSelectedTabPosition() && m43938m <= scrollX) || i == getSelectedTabPosition())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                if ((i < getSelectedTabPosition() && m43938m <= scrollX) || ((i > getSelectedTabPosition() && m43938m >= scrollX) || i == getSelectedTabPosition())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 || this.f50918V == 1 || z3) {
                if (i < 0) {
                    m43938m = 0;
                }
                scrollTo(m43938m, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class Tab {
        public static final int INVALID_POSITION = -1;

        /* renamed from: a */
        public Object f50946a;

        /* renamed from: b */
        public Drawable f50947b;

        /* renamed from: c */
        public CharSequence f50948c;

        /* renamed from: d */
        public CharSequence f50949d;

        /* renamed from: f */
        public View f50951f;
        @Nullable
        public TabLayout parent;
        @NonNull
        public TabView view;

        /* renamed from: e */
        public int f50950e = -1;

        /* renamed from: g */
        public int f50952g = 1;

        /* renamed from: h */
        public int f50953h = -1;

        /* renamed from: e */
        public void m43920e() {
            this.parent = null;
            this.view = null;
            this.f50946a = null;
            this.f50947b = null;
            this.f50953h = -1;
            this.f50948c = null;
            this.f50949d = null;
            this.f50950e = -1;
            this.f50951f = null;
        }

        /* renamed from: f */
        public void m43919f(int i) {
            this.f50950e = i;
        }

        /* renamed from: g */
        public void m43918g() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.m43891x();
            }
        }

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.f50951f;
        }

        @Nullable
        public Drawable getIcon() {
            return this.f50947b;
        }

        public int getId() {
            return this.f50953h;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.f50950e;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.f50952g;
        }

        @Nullable
        public Object getTag() {
            return this.f50946a;
        }

        @Nullable
        public CharSequence getText() {
            return this.f50948c;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.f50950e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.m43897r();
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@StringRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@Nullable View view) {
            this.f50951f = view;
            m43918g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@Nullable Drawable drawable) {
            this.f50947b = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f50897A == 1 || tabLayout.f50900D == 2) {
                tabLayout.m43952D(true);
            }
            m43918g();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.m43900o() && this.view.f50961e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setId(int i) {
            this.f50953h = i;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(@LabelVisibility int i) {
            this.f50952g = i;
            TabLayout tabLayout = this.parent;
            if (tabLayout.f50897A == 1 || tabLayout.f50900D == 2) {
                tabLayout.m43952D(true);
            }
            m43918g();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.m43900o() && this.view.f50961e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTag(@Nullable Object obj) {
            this.f50946a = obj;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f50949d) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.f50948c = charSequence;
            m43918g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@LayoutRes int i) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i, (ViewGroup) this.view, false));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.f50949d = charSequence;
            m43918g();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@StringRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@DrawableRes int i) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.f50909M.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.f50909M.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i) {
        addTab(tab, i, this.f50921b.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m43942i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.f50909M.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z) {
        Tab tab2 = this.f50922c;
        if (tab2 == tab) {
            if (tab2 != null) {
                m43933r(tab);
                m43941j(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                m43941j(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.f50922c = tab;
        if (tab2 != null && tab2.parent != null) {
            m43931t(tab2);
        }
        if (tab != null) {
            m43932s(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f50908L;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.f50908L = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        m43925z(i, f, z, z2, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z) {
        m43955A(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addTab(@NonNull Tab tab, boolean z) {
        addTab(tab, this.f50921b.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m43942i(view);
    }

    public void addTab(@NonNull Tab tab, int i, boolean z) {
        if (tab.parent == this) {
            m43937n(tab, i);
            m43943h(tab);
            if (z) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m43942i(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m43936o(i, i2));
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
