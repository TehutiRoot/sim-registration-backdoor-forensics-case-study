package com.roughike.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* loaded from: classes5.dex */
public class BottomBarTab extends LinearLayout {

    /* renamed from: a */
    public final int f58989a;

    /* renamed from: b */
    public final int f58990b;

    /* renamed from: c */
    public final int f58991c;

    /* renamed from: d */
    public C9803b f58992d;

    /* renamed from: e */
    public Type f58993e;

    /* renamed from: f */
    public boolean f58994f;

    /* renamed from: g */
    public int f58995g;

    /* renamed from: h */
    public String f58996h;

    /* renamed from: i */
    public float f58997i;

    /* renamed from: j */
    public float f58998j;

    /* renamed from: k */
    public int f58999k;

    /* renamed from: l */
    public int f59000l;

    /* renamed from: m */
    public int f59001m;

    /* renamed from: n */
    public int f59002n;

    /* renamed from: o */
    public boolean f59003o;

    /* renamed from: p */
    public AppCompatImageView f59004p;

    /* renamed from: q */
    public TextView f59005q;

    /* renamed from: r */
    public boolean f59006r;

    /* renamed from: s */
    public int f59007s;

    /* renamed from: t */
    public int f59008t;

    /* renamed from: u */
    public Typeface f59009u;

    /* loaded from: classes5.dex */
    public static class Config {

        /* renamed from: a */
        public final float f59010a;

        /* renamed from: b */
        public final float f59011b;

        /* renamed from: c */
        public final int f59012c;

        /* renamed from: d */
        public final int f59013d;

        /* renamed from: e */
        public final int f59014e;

        /* renamed from: f */
        public final int f59015f;

        /* renamed from: g */
        public final int f59016g;

        /* renamed from: h */
        public final Typeface f59017h;

        /* renamed from: i */
        public boolean f59018i;

        /* loaded from: classes5.dex */
        public static class Builder {

            /* renamed from: a */
            public float f59019a;

            /* renamed from: b */
            public float f59020b;

            /* renamed from: c */
            public int f59021c;

            /* renamed from: d */
            public int f59022d;

            /* renamed from: e */
            public int f59023e;

            /* renamed from: f */
            public int f59024f;

            /* renamed from: g */
            public boolean f59025g = true;

            /* renamed from: h */
            public int f59026h;

            /* renamed from: i */
            public Typeface f59027i;

            public Builder activeTabAlpha(float f) {
                this.f59020b = f;
                return this;
            }

            public Builder activeTabColor(@ColorInt int i) {
                this.f59022d = i;
                return this;
            }

            public Builder badgeBackgroundColor(@ColorInt int i) {
                this.f59024f = i;
                return this;
            }

            public Builder barColorWhenSelected(@ColorInt int i) {
                this.f59023e = i;
                return this;
            }

            public Config build() {
                return new Config(this, null);
            }

            public Builder hideBadgeWhenSelected(boolean z) {
                this.f59025g = z;
                return this;
            }

            public Builder inActiveTabAlpha(float f) {
                this.f59019a = f;
                return this;
            }

            public Builder inActiveTabColor(@ColorInt int i) {
                this.f59021c = i;
                return this;
            }

            public Builder titleTextAppearance(int i) {
                this.f59026h = i;
                return this;
            }

            public Builder titleTypeFace(Typeface typeface) {
                this.f59027i = typeface;
                return this;
            }
        }

        public /* synthetic */ Config(Builder builder, C9789a c9789a) {
            this(builder);
        }

        public Config(Builder builder) {
            this.f59018i = true;
            this.f59010a = builder.f59019a;
            this.f59011b = builder.f59020b;
            this.f59012c = builder.f59021c;
            this.f59013d = builder.f59022d;
            this.f59014e = builder.f59023e;
            this.f59015f = builder.f59024f;
            this.f59018i = builder.f59025g;
            this.f59016g = builder.f59026h;
            this.f59017h = builder.f59027i;
        }
    }

    /* loaded from: classes5.dex */
    public enum Type {
        FIXED,
        SHIFTING,
        TABLET
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$a */
    /* loaded from: classes5.dex */
    public class C9789a implements ValueAnimator.AnimatorUpdateListener {
        public C9789a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BottomBarTab.this.setColors(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$b */
    /* loaded from: classes5.dex */
    public class C9790b implements ValueAnimator.AnimatorUpdateListener {
        public C9790b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = BottomBarTab.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
            BottomBarTab.this.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$c */
    /* loaded from: classes5.dex */
    public class C9791c extends AnimatorListenerAdapter {
        public C9791c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomBarTab bottomBarTab;
            C9803b c9803b;
            if (!BottomBarTab.this.f59006r && (c9803b = (bottomBarTab = BottomBarTab.this).f58992d) != null) {
                c9803b.m33227a(bottomBarTab);
                BottomBarTab.this.f58992d.m33218j();
            }
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$d */
    /* loaded from: classes5.dex */
    public class C9792d implements ValueAnimator.AnimatorUpdateListener {
        public C9792d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BottomBarTab.this.f59004p.setPadding(BottomBarTab.this.f59004p.getPaddingLeft(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), BottomBarTab.this.f59004p.getPaddingRight(), BottomBarTab.this.f59004p.getPaddingBottom());
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBarTab$e */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9793e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59032a;

        static {
            int[] iArr = new int[Type.values().length];
            f59032a = iArr;
            try {
                iArr[Type.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59032a[Type.SHIFTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59032a[Type.TABLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BottomBarTab(Context context) {
        super(context);
        this.f58993e = Type.FIXED;
        this.f58989a = AbstractC17757Hs0.m68033a(context, 6.0f);
        this.f58990b = AbstractC17757Hs0.m68033a(context, 8.0f);
        this.f58991c = AbstractC17757Hs0.m68033a(context, 16.0f);
    }

    private void setAlphas(float f) {
        AppCompatImageView appCompatImageView = this.f59004p;
        if (appCompatImageView != null) {
            ViewCompat.setAlpha(appCompatImageView, f);
        }
        TextView textView = this.f59005q;
        if (textView != null) {
            ViewCompat.setAlpha(textView, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColors(int i) {
        AppCompatImageView appCompatImageView = this.f59004p;
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(i);
            this.f59004p.setTag(R.id.bb_bottom_bar_color_id, Integer.valueOf(i));
        }
        TextView textView = this.f59005q;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private void setIconScale(float f) {
        if (this.f58994f && this.f58993e == Type.SHIFTING) {
            ViewCompat.setScaleX(this.f59004p, f);
            ViewCompat.setScaleY(this.f59004p, f);
        }
    }

    private void setTitleScale(float f) {
        if (this.f58993e != Type.TABLET && !this.f58994f) {
            ViewCompat.setScaleX(this.f59005q, f);
            ViewCompat.setScaleY(this.f59005q, f);
        }
    }

    private void setTopPadding(int i) {
        if (this.f58993e != Type.TABLET && !this.f58994f) {
            AppCompatImageView appCompatImageView = this.f59004p;
            appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), i, this.f59004p.getPaddingRight(), this.f59004p.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public final void m33271d(int i, int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i, i2);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new C9789a());
        valueAnimator.setDuration(150L);
        valueAnimator.start();
    }

    /* renamed from: e */
    public final void m33270e(float f, float f2) {
        ViewCompat.animate(this.f59004p).setDuration(150L).alpha(f).start();
        if (this.f58994f && this.f58993e == Type.SHIFTING) {
            m33269f(f2);
        }
    }

    /* renamed from: f */
    public final void m33269f(float f) {
        ViewCompat.animate(this.f59004p).setDuration(150L).scaleX(f).scaleY(f).start();
    }

    /* renamed from: g */
    public final void m33268g(int i, float f, float f2) {
        if (this.f58993e == Type.TABLET && this.f58994f) {
            return;
        }
        m33260o(this.f59004p.getPaddingTop(), i);
        ViewPropertyAnimatorCompat scaleY = ViewCompat.animate(this.f59005q).setDuration(150L).scaleX(f).scaleY(f);
        scaleY.alpha(f2);
        scaleY.start();
    }

    public float getActiveAlpha() {
        return this.f58998j;
    }

    public int getActiveColor() {
        return this.f59000l;
    }

    public int getBadgeBackgroundColor() {
        return this.f59002n;
    }

    public boolean getBadgeHidesWhenActive() {
        return this.f59003o;
    }

    public int getBarColorWhenSelected() {
        return this.f59001m;
    }

    public int getCurrentDisplayedIconColor() {
        Object tag = this.f59004p.getTag(R.id.bb_bottom_bar_color_id);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    public int getCurrentDisplayedTextAppearance() {
        Object tag = this.f59005q.getTag(R.id.bb_bottom_bar_appearance_id);
        if (this.f59005q != null && (tag instanceof Integer)) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    public int getCurrentDisplayedTitleColor() {
        TextView textView = this.f59005q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return 0;
    }

    public int getIconResId() {
        return this.f58995g;
    }

    public AppCompatImageView getIconView() {
        return this.f59004p;
    }

    public float getInActiveAlpha() {
        return this.f58997i;
    }

    public int getInActiveColor() {
        return this.f58999k;
    }

    public int getIndexInTabContainer() {
        return this.f59007s;
    }

    @VisibleForTesting
    public int getLayoutResource() {
        int i = C9793e.f59032a[this.f58993e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return R.layout.bb_bottom_bar_item_fixed_tablet;
                }
                throw new RuntimeException("Unknown BottomBarTab type.");
            }
            return R.layout.bb_bottom_bar_item_shifting;
        }
        return R.layout.bb_bottom_bar_item_fixed;
    }

    public ViewGroup getOuterView() {
        return (ViewGroup) getParent();
    }

    public String getTitle() {
        return this.f58996h;
    }

    public int getTitleTextAppearance() {
        return this.f59008t;
    }

    public Typeface getTitleTypeFace() {
        return this.f59009u;
    }

    public TextView getTitleView() {
        return this.f59005q;
    }

    public Type getType() {
        return this.f58993e;
    }

    /* renamed from: h */
    public void m33267h(boolean z) {
        boolean z2;
        float f;
        int i;
        C9803b c9803b;
        this.f59006r = false;
        if (this.f58993e == Type.SHIFTING) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f = 0.0f;
        } else {
            f = 0.86f;
        }
        if (z2) {
            i = this.f58991c;
        } else {
            i = this.f58990b;
        }
        if (z) {
            m33268g(i, f, this.f58997i);
            m33270e(this.f58997i, 1.0f);
            m33271d(this.f59000l, this.f58999k);
        } else {
            setTitleScale(f);
            setTopPadding(i);
            setIconScale(1.0f);
            setColors(this.f58999k);
            setAlphas(this.f58997i);
        }
        setSelected(false);
        if (!z2 && (c9803b = this.f58992d) != null && !c9803b.m33223e()) {
            this.f58992d.m33218j();
        }
    }

    /* renamed from: i */
    public boolean m33266i() {
        if (this.f58992d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m33265j() {
        return this.f59006r;
    }

    /* renamed from: k */
    public void m33264k() {
        View.inflate(getContext(), getLayoutResource(), this);
        int i = 1;
        setOrientation(1);
        if (this.f58994f) {
            i = 17;
        }
        setGravity(i);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setBackgroundResource(AbstractC17757Hs0.m68031c(getContext(), R.attr.selectableItemBackgroundBorderless));
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.bb_bottom_bar_icon);
        this.f59004p = appCompatImageView;
        appCompatImageView.setImageResource(this.f58995g);
        if (this.f58993e != Type.TABLET && !this.f58994f) {
            TextView textView = (TextView) findViewById(R.id.bb_bottom_bar_title);
            this.f59005q = textView;
            textView.setVisibility(0);
            if (this.f58993e == Type.SHIFTING) {
                findViewById(R.id.spacer).setVisibility(0);
            }
            m33257r();
        }
        m33259p();
        m33258q();
    }

    /* renamed from: l */
    public void m33263l(Bundle bundle) {
        setBadgeCount(bundle.getInt("STATE_BADGE_COUNT_FOR_TAB_" + getIndexInTabContainer()));
    }

    /* renamed from: m */
    public Bundle m33262m() {
        Bundle bundle = new Bundle();
        bundle.putInt("STATE_BADGE_COUNT_FOR_TAB_" + getIndexInTabContainer(), this.f58992d.m33225c());
        return bundle;
    }

    /* renamed from: n */
    public void m33261n(boolean z) {
        this.f59006r = true;
        if (z) {
            m33270e(this.f58998j, 1.24f);
            m33268g(this.f58989a, 1.0f, this.f58998j);
            m33271d(this.f58999k, this.f59000l);
        } else {
            setTitleScale(1.0f);
            setTopPadding(this.f58989a);
            setIconScale(1.24f);
            setColors(this.f59000l);
            setAlphas(this.f58998j);
        }
        setSelected(true);
        C9803b c9803b = this.f58992d;
        if (c9803b != null && this.f59003o) {
            c9803b.m33224d();
        }
    }

    /* renamed from: o */
    public final void m33260o(int i, int i2) {
        if (this.f58993e != Type.TABLET && !this.f58994f) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            ofInt.addUpdateListener(new C9792d());
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            m33263l(bundle);
            parcelable = bundle.getParcelable("superstate");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (this.f58992d != null) {
            Bundle m33262m = m33262m();
            m33262m.putParcelable("superstate", super.onSaveInstanceState());
            return m33262m;
        }
        return super.onSaveInstanceState();
    }

    /* renamed from: p */
    public final void m33259p() {
        int i;
        TextView textView = this.f59005q;
        if (textView != null && (i = this.f59008t) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                textView.setTextAppearance(i);
            } else {
                textView.setTextAppearance(getContext(), this.f59008t);
            }
            this.f59005q.setTag(R.id.bb_bottom_bar_appearance_id, Integer.valueOf(this.f59008t));
        }
    }

    /* renamed from: q */
    public final void m33258q() {
        TextView textView;
        Typeface typeface = this.f59009u;
        if (typeface != null && (textView = this.f59005q) != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: r */
    public final void m33257r() {
        TextView textView = this.f59005q;
        if (textView != null) {
            textView.setText(this.f58996h);
        }
    }

    public void removeBadge() {
        setBadgeCount(0);
    }

    /* renamed from: s */
    public void m33256s(float f, boolean z) {
        C9803b c9803b;
        if (!z) {
            getLayoutParams().width = (int) f;
            if (!this.f59006r && (c9803b = this.f58992d) != null) {
                c9803b.m33227a(this);
                this.f58992d.m33218j();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getWidth(), f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C9790b());
        ofFloat.addListener(new C9791c());
        ofFloat.start();
    }

    public void setActiveAlpha(float f) {
        this.f58998j = f;
        if (this.f59006r) {
            setAlphas(f);
        }
    }

    public void setActiveColor(int i) {
        this.f59000l = i;
        if (this.f59006r) {
            setColors(i);
        }
    }

    public void setBadgeBackgroundColor(int i) {
        this.f59002n = i;
        C9803b c9803b = this.f58992d;
        if (c9803b != null) {
            c9803b.m33220h(i);
        }
    }

    public void setBadgeCount(int i) {
        if (i <= 0) {
            C9803b c9803b = this.f58992d;
            if (c9803b != null) {
                c9803b.m33222f(this);
                this.f58992d = null;
                return;
            }
            return;
        }
        if (this.f58992d == null) {
            C9803b c9803b2 = new C9803b(getContext());
            this.f58992d = c9803b2;
            c9803b2.m33226b(this, this.f59002n);
        }
        this.f58992d.m33219i(i);
        if (this.f59006r && this.f59003o) {
            this.f58992d.m33224d();
        }
    }

    public void setBadgeHidesWhenActive(boolean z) {
        this.f59003o = z;
    }

    public void setBarColorWhenSelected(int i) {
        this.f59001m = i;
    }

    public void setConfig(@NonNull Config config) {
        setInActiveAlpha(config.f59010a);
        setActiveAlpha(config.f59011b);
        setInActiveColor(config.f59012c);
        setActiveColor(config.f59013d);
        setBarColorWhenSelected(config.f59014e);
        setBadgeBackgroundColor(config.f59015f);
        setBadgeHidesWhenActive(config.f59018i);
        setTitleTextAppearance(config.f59016g);
        setTitleTypeface(config.f59017h);
    }

    public void setIconResId(int i) {
        this.f58995g = i;
    }

    public void setIconTint(int i) {
        this.f59004p.setColorFilter(i);
    }

    public void setInActiveAlpha(float f) {
        this.f58997i = f;
        if (!this.f59006r) {
            setAlphas(f);
        }
    }

    public void setInActiveColor(int i) {
        this.f58999k = i;
        if (!this.f59006r) {
            setColors(i);
        }
    }

    public void setIndexInContainer(int i) {
        this.f59007s = i;
    }

    public void setIsTitleless(boolean z) {
        if (z && getIconResId() == 0) {
            throw new IllegalStateException("This tab is supposed to be icon only, yet it has no icon specified. Index in container: " + getIndexInTabContainer());
        }
        this.f58994f = z;
    }

    public void setTitle(String str) {
        this.f58996h = str;
        m33257r();
    }

    public void setTitleTextAppearance(int i) {
        this.f59008t = i;
        m33259p();
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f59009u = typeface;
        m33258q();
    }

    public void setType(Type type) {
        this.f58993e = type;
    }
}
