package com.roughike.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.XmlRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.C9790a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class BottomBar extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A */
    public int f58953A;

    /* renamed from: B */
    public int f58954B;

    /* renamed from: C */
    public TabSelectionInterceptor f58955C;

    /* renamed from: D */
    public OnTabSelectListener f58956D;

    /* renamed from: E */
    public OnTabReselectListener f58957E;

    /* renamed from: F */
    public boolean f58958F;

    /* renamed from: G */
    public boolean f58959G;

    /* renamed from: H */
    public ShySettings f58960H;

    /* renamed from: I */
    public boolean f58961I;

    /* renamed from: J */
    public boolean f58962J;

    /* renamed from: K */
    public BottomBarTab[] f58963K;

    /* renamed from: a */
    public C9790a f58964a;

    /* renamed from: b */
    public int f58965b;

    /* renamed from: c */
    public int f58966c;

    /* renamed from: d */
    public int f58967d;

    /* renamed from: e */
    public int f58968e;

    /* renamed from: f */
    public int f58969f;

    /* renamed from: g */
    public boolean f58970g;

    /* renamed from: h */
    public int f58971h;

    /* renamed from: i */
    public float f58972i;

    /* renamed from: j */
    public float f58973j;

    /* renamed from: k */
    public int f58974k;

    /* renamed from: l */
    public int f58975l;

    /* renamed from: m */
    public int f58976m;

    /* renamed from: n */
    public boolean f58977n;

    /* renamed from: o */
    public boolean f58978o;

    /* renamed from: p */
    public int f58979p;

    /* renamed from: q */
    public Typeface f58980q;

    /* renamed from: r */
    public boolean f58981r;

    /* renamed from: s */
    public float f58982s;

    /* renamed from: t */
    public View f58983t;

    /* renamed from: u */
    public View f58984u;

    /* renamed from: v */
    public ViewGroup f58985v;

    /* renamed from: w */
    public ViewGroup f58986w;

    /* renamed from: x */
    public int f58987x;

    /* renamed from: y */
    public int f58988y;

    /* renamed from: z */
    public int f58989z;

    /* renamed from: com.roughike.bottombar.BottomBar$a */
    /* loaded from: classes5.dex */
    public class C9769a implements C9790a.InterfaceC9791a {
        public C9769a() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setInActiveAlpha(BottomBar.this.f58972i);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$b */
    /* loaded from: classes5.dex */
    public class C9770b implements C9790a.InterfaceC9791a {
        public C9770b() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setActiveAlpha(BottomBar.this.f58973j);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$c */
    /* loaded from: classes5.dex */
    public class C9771c implements C9790a.InterfaceC9791a {
        public C9771c() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setInActiveColor(BottomBar.this.f58974k);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$d */
    /* loaded from: classes5.dex */
    public class C9772d implements C9790a.InterfaceC9791a {
        public C9772d() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setActiveColor(BottomBar.this.f58975l);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$e */
    /* loaded from: classes5.dex */
    public class C9773e implements C9790a.InterfaceC9791a {
        public C9773e() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setBadgeBackgroundColor(BottomBar.this.f58976m);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$f */
    /* loaded from: classes5.dex */
    public class C9774f implements C9790a.InterfaceC9791a {

        /* renamed from: a */
        public final /* synthetic */ boolean f58995a;

        public C9774f(boolean z) {
            this.f58995a = z;
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setBadgeHidesWhenActive(this.f58995a);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$g */
    /* loaded from: classes5.dex */
    public class C9775g implements C9790a.InterfaceC9791a {
        public C9775g() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setTitleTextAppearance(BottomBar.this.f58979p);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$h */
    /* loaded from: classes5.dex */
    public class C9776h implements C9790a.InterfaceC9791a {
        public C9776h() {
        }

        @Override // com.roughike.bottombar.C9790a.InterfaceC9791a
        /* renamed from: a */
        public void mo33220a(BottomBarTab bottomBarTab) {
            bottomBarTab.setTitleTypeface(BottomBar.this.f58980q);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$i */
    /* loaded from: classes5.dex */
    public class C9777i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f58999a;

        public C9777i(int i) {
            this.f58999a = i;
        }

        /* renamed from: a */
        public final void m33267a() {
            BottomBar.this.f58985v.setBackgroundColor(this.f58999a);
            BottomBar.this.f58984u.setVisibility(4);
            ViewCompat.setAlpha(BottomBar.this.f58984u, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m33267a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m33267a();
        }
    }

    public BottomBar(Context context) {
        this(context, null);
    }

    private BottomBarTab.Config getTabConfig() {
        return new BottomBarTab.Config.Builder().inActiveTabAlpha(this.f58972i).activeTabAlpha(this.f58973j).inActiveTabColor(this.f58974k).activeTabColor(this.f58975l).barColorWhenSelected(this.f58987x).badgeBackgroundColor(this.f58976m).hideBadgeWhenSelected(this.f58977n).titleTextAppearance(this.f58979p).titleTypeFace(this.f58980q).build();
    }

    /* renamed from: A */
    public boolean m33305A() {
        return this.f58961I;
    }

    /* renamed from: B */
    public final void m33304B(Context context, AttributeSet attributeSet, int i, int i2) {
        float f;
        int color;
        this.f58965b = AbstractC18178Ns0.m67190b(getContext(), R.attr.colorPrimary);
        this.f58966c = AbstractC18178Ns0.m67188d(getContext());
        this.f58967d = AbstractC18178Ns0.m67191a(getContext(), 10.0f);
        this.f58968e = AbstractC18178Ns0.m67191a(getContext(), 168.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BottomBar, i, i2);
        try {
            this.f58969f = obtainStyledAttributes.getResourceId(R.styleable.BottomBar_bb_tabXmlResource, 0);
            this.f58970g = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_tabletMode, false);
            this.f58971h = obtainStyledAttributes.getInteger(R.styleable.BottomBar_bb_behavior, 0);
            int i3 = R.styleable.BottomBar_bb_inActiveTabAlpha;
            if (m33269y()) {
                f = 0.6f;
            } else {
                f = 1.0f;
            }
            this.f58972i = obtainStyledAttributes.getFloat(i3, f);
            this.f58973j = obtainStyledAttributes.getFloat(R.styleable.BottomBar_bb_activeTabAlpha, 1.0f);
            int i4 = -1;
            if (m33269y()) {
                color = -1;
            } else {
                color = ContextCompat.getColor(context, R.color.bb_inActiveBottomBarItemColor);
            }
            if (!m33269y()) {
                i4 = this.f58965b;
            }
            this.f58978o = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_longPressHintsEnabled, true);
            this.f58974k = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_inActiveTabColor, color);
            this.f58975l = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_activeTabColor, i4);
            this.f58976m = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_badgeBackgroundColor, SupportMenu.CATEGORY_MASK);
            this.f58977n = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_badgesHideWhenActive, true);
            this.f58979p = obtainStyledAttributes.getResourceId(R.styleable.BottomBar_bb_titleTextAppearance, 0);
            this.f58980q = m33279o(obtainStyledAttributes.getString(R.styleable.BottomBar_bb_titleTypeFace));
            this.f58981r = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_showShadow, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: C */
    public final void m33303C(int i) {
        this.f58985v.clearAnimation();
        this.f58984u.clearAnimation();
        this.f58984u.setBackgroundColor(i);
        this.f58984u.setVisibility(0);
    }

    /* renamed from: D */
    public final void m33302D() {
        int height = getHeight();
        if (height != 0 && !this.f58962J) {
            this.f58962J = true;
            this.f58986w.getLayoutParams().height = height;
            int m33208a = height + AbstractC9794c.m33208a(getContext());
            getLayoutParams().height = m33208a;
            if (m33268z()) {
                m33295K(m33208a);
            }
        }
    }

    /* renamed from: E */
    public final void m33301E(BottomBarTab[] bottomBarTabArr) {
        int m67186f = AbstractC18178Ns0.m67186f(getContext(), getWidth());
        if (m67186f <= 0 || m67186f > this.f58966c) {
            m67186f = this.f58966c;
        }
        int min = Math.min(AbstractC18178Ns0.m67191a(getContext(), m67186f / bottomBarTabArr.length), this.f58968e);
        double d = min;
        this.f58953A = (int) (0.9d * d);
        this.f58954B = (int) (d + ((bottomBarTabArr.length - 1) * 0.1d * d));
        int round = Math.round(getContext().getResources().getDimension(R.dimen.bb_height));
        for (BottomBarTab bottomBarTab : bottomBarTabArr) {
            ViewGroup.LayoutParams layoutParams = bottomBarTab.getLayoutParams();
            layoutParams.height = round;
            if (m33269y()) {
                if (bottomBarTab.m33257j()) {
                    layoutParams.width = this.f58954B;
                } else {
                    layoutParams.width = this.f58953A;
                }
            } else {
                layoutParams.width = min;
            }
            if (bottomBarTab.getParent() == null) {
                this.f58986w.addView(bottomBarTab);
            }
            bottomBarTab.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: F */
    public void m33300F(Bundle bundle) {
        if (bundle != null) {
            this.f58958F = true;
            this.f58959G = true;
            selectTabAtPosition(bundle.getInt("STATE_CURRENT_SELECTED_TAB", this.f58989z), false);
        }
    }

    /* renamed from: G */
    public Bundle m33299G() {
        Bundle bundle = new Bundle();
        bundle.putInt("STATE_CURRENT_SELECTED_TAB", this.f58989z);
        return bundle;
    }

    /* renamed from: H */
    public final void m33298H(BottomBarTab bottomBarTab, BottomBarTab bottomBarTab2, boolean z) {
        if (m33269y()) {
            bottomBarTab.m33248s(this.f58953A, z);
            bottomBarTab2.m33248s(this.f58954B, z);
        }
    }

    /* renamed from: I */
    public final void m33297I(List list) {
        BottomBarTab.Type type;
        this.f58986w.removeAllViews();
        BottomBarTab[] bottomBarTabArr = new BottomBarTab[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            BottomBarTab bottomBarTab = (BottomBarTab) it.next();
            if (m33269y()) {
                type = BottomBarTab.Type.SHIFTING;
            } else if (this.f58970g) {
                type = BottomBarTab.Type.TABLET;
            } else {
                type = BottomBarTab.Type.FIXED;
            }
            if (m33270x()) {
                bottomBarTab.setIsTitleless(true);
            }
            bottomBarTab.setType(type);
            bottomBarTab.m33256k();
            if (i == this.f58989z) {
                bottomBarTab.m33253n(false);
                m33278p(bottomBarTab, false);
            } else {
                bottomBarTab.m33259h(false);
            }
            if (!this.f58970g) {
                if (bottomBarTab.getWidth() > i2) {
                    i2 = bottomBarTab.getWidth();
                }
                bottomBarTabArr[i] = bottomBarTab;
            } else {
                this.f58986w.addView(bottomBarTab);
            }
            bottomBarTab.setOnClickListener(this);
            bottomBarTab.setOnLongClickListener(this);
            i++;
        }
        this.f58963K = bottomBarTabArr;
        if (!this.f58970g) {
            m33301E(bottomBarTabArr);
        }
    }

    /* renamed from: J */
    public final void m33296J(int i) {
        int id2 = getTabAtPosition(i).getId();
        if (i != this.f58989z) {
            OnTabSelectListener onTabSelectListener = this.f58956D;
            if (onTabSelectListener != null) {
                onTabSelectListener.onTabSelected(id2);
            }
        } else {
            OnTabReselectListener onTabReselectListener = this.f58957E;
            if (onTabReselectListener != null && !this.f58959G) {
                onTabReselectListener.onTabReSelected(id2);
            }
        }
        this.f58989z = i;
        if (this.f58959G) {
            this.f58959G = false;
        }
    }

    /* renamed from: K */
    public final void m33295K(int i) {
        ((CoordinatorLayout.LayoutParams) getLayoutParams()).setBehavior(new C13100pc(i, 0, false));
    }

    /* renamed from: L */
    public final void m33294L() {
        if (m33270x()) {
            return;
        }
        int tabCount = getTabCount();
        if (this.f58986w != null && tabCount != 0 && m33269y()) {
            for (int i = 0; i < tabCount; i++) {
                TextView titleView = getTabAtPosition(i).getTitleView();
                if (titleView != null) {
                    int height = this.f58967d - (titleView.getHeight() - titleView.getBaseline());
                    if (height > 0) {
                        titleView.setPadding(titleView.getPaddingLeft(), titleView.getPaddingTop(), titleView.getPaddingRight(), height + titleView.getPaddingBottom());
                    }
                }
            }
        }
    }

    public int findPositionForTabWithId(@IdRes int i) {
        return getTabWithId(i).getIndexInTabContainer();
    }

    public BottomBarTab getCurrentTab() {
        return getTabAtPosition(getCurrentTabPosition());
    }

    @IdRes
    public int getCurrentTabId() {
        return getCurrentTab().getId();
    }

    public int getCurrentTabPosition() {
        return this.f58989z;
    }

    public ShySettings getShySettings() {
        m33268z();
        if (this.f58960H == null) {
            this.f58960H = new ShySettings(this);
        }
        return this.f58960H;
    }

    public BottomBarTab getTabAtPosition(int i) {
        View childAt = this.f58986w.getChildAt(i);
        if (childAt instanceof BadgeContainer) {
            return m33280n((BadgeContainer) childAt);
        }
        return (BottomBarTab) childAt;
    }

    public int getTabCount() {
        return this.f58986w.getChildCount();
    }

    public BottomBarTab getTabWithId(@IdRes int i) {
        return (BottomBarTab) this.f58986w.findViewById(i);
    }

    /* renamed from: j */
    public final void m33284j(View view, int i) {
        m33303C(i);
        if (!this.f58985v.isAttachedToWindow()) {
            return;
        }
        m33283k(view, i);
    }

    /* renamed from: k */
    public final void m33283k(View view, int i) {
        int i2;
        int width;
        int x = (int) (ViewCompat.getX(view) + (view.getMeasuredWidth() / 2));
        if (this.f58970g) {
            i2 = (int) ViewCompat.getY(view);
        } else {
            i2 = 0;
        }
        int measuredHeight = i2 + (view.getMeasuredHeight() / 2);
        if (this.f58970g) {
            width = this.f58985v.getHeight();
        } else {
            width = this.f58985v.getWidth();
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f58984u, x, measuredHeight, 0, width);
        if (this.f58970g) {
            createCircularReveal.setDuration(500L);
        }
        createCircularReveal.addListener(new C9777i(i));
        createCircularReveal.start();
    }

    /* renamed from: l */
    public final void m33282l() {
        if (m33269y()) {
            this.f58987x = this.f58965b;
        }
        Drawable background = getBackground();
        if (background != null && (background instanceof ColorDrawable)) {
            this.f58987x = ((ColorDrawable) background).getColor();
            setBackgroundColor(0);
        }
    }

    /* renamed from: m */
    public final boolean m33281m() {
        if (!this.f58970g && m33275s(4) && AbstractC9794c.m33205d(getContext())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final BottomBarTab m33280n(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof BottomBarTab) {
                return (BottomBarTab) childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final Typeface m33279o(String str) {
        if (str != null) {
            return Typeface.createFromAsset(getContext().getAssets(), str);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!(view instanceof BottomBarTab)) {
            return;
        }
        m33277q((BottomBarTab) view);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (!this.f58970g) {
                m33301E(this.f58963K);
            }
            m33294L();
            if (m33268z()) {
                m33272v();
            }
            if (m33281m()) {
                m33302D();
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if ((view instanceof BottomBarTab) && !m33276r((BottomBarTab) view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            m33300F(bundle);
            parcelable = bundle.getParcelable("superstate");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle m33299G = m33299G();
        m33299G.putParcelable("superstate", super.onSaveInstanceState());
        return m33299G;
    }

    /* renamed from: p */
    public final void m33278p(BottomBarTab bottomBarTab, boolean z) {
        int barColorWhenSelected = bottomBarTab.getBarColorWhenSelected();
        if (this.f58988y == barColorWhenSelected) {
            return;
        }
        if (!z) {
            this.f58985v.setBackgroundColor(barColorWhenSelected);
            return;
        }
        boolean m33258i = bottomBarTab.m33258i();
        ViewGroup viewGroup = bottomBarTab;
        if (m33258i) {
            viewGroup = bottomBarTab.getOuterView();
        }
        m33284j(viewGroup, barColorWhenSelected);
        this.f58988y = barColorWhenSelected;
    }

    /* renamed from: q */
    public final void m33277q(BottomBarTab bottomBarTab) {
        BottomBarTab currentTab = getCurrentTab();
        TabSelectionInterceptor tabSelectionInterceptor = this.f58955C;
        if (tabSelectionInterceptor != null && tabSelectionInterceptor.shouldInterceptTabSelection(currentTab.getId(), bottomBarTab.getId())) {
            return;
        }
        currentTab.m33259h(true);
        bottomBarTab.m33253n(true);
        m33298H(currentTab, bottomBarTab, true);
        m33278p(bottomBarTab, true);
        m33296J(bottomBarTab.getIndexInTabContainer());
    }

    /* renamed from: r */
    public final boolean m33276r(BottomBarTab bottomBarTab) {
        boolean z;
        if (!m33269y() && !this.f58970g) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !bottomBarTab.m33257j();
        if (z && z2 && this.f58978o) {
            Toast.makeText(getContext(), bottomBarTab.getTitle(), 0).show();
        }
        return true;
    }

    public void removeOnTabReselectListener() {
        this.f58957E = null;
    }

    public void removeOnTabSelectListener() {
        this.f58956D = null;
    }

    public void removeOverrideTabSelectionListener() {
        this.f58955C = null;
    }

    /* renamed from: s */
    public final boolean m33275s(int i) {
        int i2 = this.f58971h;
        if ((i | i2) == i2) {
            return true;
        }
        return false;
    }

    public void selectTabAtPosition(int i) {
        selectTabAtPosition(i, false);
    }

    public void selectTabWithId(@IdRes int i) {
        selectTabAtPosition(findPositionForTabWithId(i));
    }

    public void setActiveTabAlpha(float f) {
        this.f58973j = f;
        this.f58964a.m33221a(new C9770b());
    }

    public void setActiveTabColor(@ColorInt int i) {
        this.f58975l = i;
        this.f58964a.m33221a(new C9772d());
    }

    public void setBadgeBackgroundColor(@ColorInt int i) {
        this.f58976m = i;
        this.f58964a.m33221a(new C9773e());
    }

    public void setBadgesHideWhenActive(boolean z) {
        this.f58977n = z;
        this.f58964a.m33221a(new C9774f(z));
    }

    public void setDefaultTab(@IdRes int i) {
        setDefaultTabPosition(findPositionForTabWithId(i));
    }

    public void setDefaultTabPosition(int i) {
        if (this.f58958F) {
            return;
        }
        selectTabAtPosition(i);
    }

    public void setInActiveTabAlpha(float f) {
        this.f58972i = f;
        this.f58964a.m33221a(new C9769a());
    }

    public void setInActiveTabColor(@ColorInt int i) {
        this.f58974k = i;
        this.f58964a.m33221a(new C9771c());
    }

    public void setItems(@XmlRes int i) {
        setItems(i, null);
    }

    public void setLongPressHintsEnabled(boolean z) {
        this.f58978o = z;
    }

    public void setOnTabReselectListener(@NonNull OnTabReselectListener onTabReselectListener) {
        this.f58957E = onTabReselectListener;
    }

    public void setOnTabSelectListener(@NonNull OnTabSelectListener onTabSelectListener) {
        setOnTabSelectListener(onTabSelectListener, true);
    }

    public void setTabSelectionInterceptor(@NonNull TabSelectionInterceptor tabSelectionInterceptor) {
        this.f58955C = tabSelectionInterceptor;
    }

    public void setTabTitleTextAppearance(int i) {
        this.f58979p = i;
        this.f58964a.m33221a(new C9775g());
    }

    public void setTabTitleTypeface(String str) {
        setTabTitleTypeface(m33279o(str));
    }

    /* renamed from: t */
    public final void m33274t(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f58964a = new C9790a(this);
        m33304B(context, attributeSet, i, i2);
        m33271w();
        m33282l();
        m33273u(context);
        int i3 = this.f58969f;
        if (i3 != 0) {
            setItems(i3);
        }
    }

    /* renamed from: u */
    public final void m33273u(Context context) {
        if (this.f58981r) {
            float elevation = getElevation();
            this.f58982s = elevation;
            if (elevation <= 0.0f) {
                elevation = getResources().getDimensionPixelSize(R.dimen.bb_default_elevation);
            }
            this.f58982s = elevation;
            setElevation(AbstractC18178Ns0.m67191a(context, elevation));
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
    }

    /* renamed from: v */
    public final void m33272v() {
        int height;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof CoordinatorLayout)) {
            if (!this.f58961I && (height = getHeight()) != 0) {
                m33295K(height);
                getShySettings().m33229a();
                this.f58961I = true;
                return;
            }
            return;
        }
        throw new RuntimeException("In order to have shy behavior, the BottomBar must be a direct child of a CoordinatorLayout.");
    }

    /* renamed from: w */
    public final void m33271w() {
        int i;
        int i2;
        boolean z = this.f58970g;
        int i3 = -1;
        if (z) {
            i = -2;
        } else {
            i = -1;
        }
        if (!z) {
            i3 = -2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i3);
        setLayoutParams(layoutParams);
        setOrientation(!this.f58970g ? 1 : 0);
        Context context = getContext();
        if (this.f58970g) {
            i2 = R.layout.bb_bottom_bar_item_container_tablet;
        } else {
            i2 = R.layout.bb_bottom_bar_item_container;
        }
        View inflate = View.inflate(context, i2, this);
        inflate.setLayoutParams(layoutParams);
        this.f58984u = inflate.findViewById(R.id.bb_bottom_bar_background_overlay);
        this.f58985v = (ViewGroup) inflate.findViewById(R.id.bb_bottom_bar_outer_container);
        this.f58986w = (ViewGroup) inflate.findViewById(R.id.bb_bottom_bar_item_container);
        this.f58983t = findViewById(R.id.bb_bottom_bar_shadow);
    }

    /* renamed from: x */
    public final boolean m33270x() {
        if (!this.f58970g && m33275s(8)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m33269y() {
        if (!this.f58970g && m33275s(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m33268z() {
        if (!this.f58970g && m33275s(2)) {
            return true;
        }
        return false;
    }

    public BottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void selectTabAtPosition(int i, boolean z) {
        if (i <= getTabCount() - 1 && i >= 0) {
            BottomBarTab currentTab = getCurrentTab();
            BottomBarTab tabAtPosition = getTabAtPosition(i);
            currentTab.m33259h(z);
            tabAtPosition.m33253n(z);
            m33296J(i);
            m33298H(currentTab, tabAtPosition, z);
            m33278p(tabAtPosition, z);
            return;
        }
        throw new IndexOutOfBoundsException("Can't select tab at position " + i + ". This BottomBar has no items at that position.");
    }

    public void setItems(@XmlRes int i, BottomBarTab.Config config) {
        if (i != 0) {
            if (config == null) {
                config = getTabConfig();
            }
            m33297I(new TabParser(getContext(), config, i).m33223d());
            return;
        }
        throw new RuntimeException("No items specified for the BottomBar!");
    }

    public void setOnTabSelectListener(@NonNull OnTabSelectListener onTabSelectListener, boolean z) {
        this.f58956D = onTabSelectListener;
        if (!z || getTabCount() <= 0) {
            return;
        }
        onTabSelectListener.onTabSelected(getCurrentTabId());
    }

    public BottomBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58987x = -1;
        m33274t(context, attributeSet, i, 0);
    }

    public void setTabTitleTypeface(Typeface typeface) {
        this.f58980q = typeface;
        this.f58964a.m33221a(new C9776h());
    }

    @RequiresApi(21)
    public BottomBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f58987x = -1;
        m33274t(context, attributeSet, i, i2);
    }
}