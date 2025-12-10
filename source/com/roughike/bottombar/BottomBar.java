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
import com.roughike.bottombar.C9801a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class BottomBar extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A */
    public int f58941A;

    /* renamed from: B */
    public int f58942B;

    /* renamed from: C */
    public TabSelectionInterceptor f58943C;

    /* renamed from: D */
    public OnTabSelectListener f58944D;

    /* renamed from: E */
    public OnTabReselectListener f58945E;

    /* renamed from: F */
    public boolean f58946F;

    /* renamed from: G */
    public boolean f58947G;

    /* renamed from: H */
    public ShySettings f58948H;

    /* renamed from: I */
    public boolean f58949I;

    /* renamed from: J */
    public boolean f58950J;

    /* renamed from: K */
    public BottomBarTab[] f58951K;

    /* renamed from: a */
    public C9801a f58952a;

    /* renamed from: b */
    public int f58953b;

    /* renamed from: c */
    public int f58954c;

    /* renamed from: d */
    public int f58955d;

    /* renamed from: e */
    public int f58956e;

    /* renamed from: f */
    public int f58957f;

    /* renamed from: g */
    public boolean f58958g;

    /* renamed from: h */
    public int f58959h;

    /* renamed from: i */
    public float f58960i;

    /* renamed from: j */
    public float f58961j;

    /* renamed from: k */
    public int f58962k;

    /* renamed from: l */
    public int f58963l;

    /* renamed from: m */
    public int f58964m;

    /* renamed from: n */
    public boolean f58965n;

    /* renamed from: o */
    public boolean f58966o;

    /* renamed from: p */
    public int f58967p;

    /* renamed from: q */
    public Typeface f58968q;

    /* renamed from: r */
    public boolean f58969r;

    /* renamed from: s */
    public float f58970s;

    /* renamed from: t */
    public View f58971t;

    /* renamed from: u */
    public View f58972u;

    /* renamed from: v */
    public ViewGroup f58973v;

    /* renamed from: w */
    public ViewGroup f58974w;

    /* renamed from: x */
    public int f58975x;

    /* renamed from: y */
    public int f58976y;

    /* renamed from: z */
    public int f58977z;

    /* renamed from: com.roughike.bottombar.BottomBar$a */
    /* loaded from: classes5.dex */
    public class C9780a implements C9801a.InterfaceC9802a {
        public C9780a() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setInActiveAlpha(BottomBar.this.f58960i);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$b */
    /* loaded from: classes5.dex */
    public class C9781b implements C9801a.InterfaceC9802a {
        public C9781b() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setActiveAlpha(BottomBar.this.f58961j);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$c */
    /* loaded from: classes5.dex */
    public class C9782c implements C9801a.InterfaceC9802a {
        public C9782c() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setInActiveColor(BottomBar.this.f58962k);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$d */
    /* loaded from: classes5.dex */
    public class C9783d implements C9801a.InterfaceC9802a {
        public C9783d() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setActiveColor(BottomBar.this.f58963l);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$e */
    /* loaded from: classes5.dex */
    public class C9784e implements C9801a.InterfaceC9802a {
        public C9784e() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setBadgeBackgroundColor(BottomBar.this.f58964m);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$f */
    /* loaded from: classes5.dex */
    public class C9785f implements C9801a.InterfaceC9802a {

        /* renamed from: a */
        public final /* synthetic */ boolean f58983a;

        public C9785f(boolean z) {
            this.f58983a = z;
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setBadgeHidesWhenActive(this.f58983a);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$g */
    /* loaded from: classes5.dex */
    public class C9786g implements C9801a.InterfaceC9802a {
        public C9786g() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setTitleTextAppearance(BottomBar.this.f58967p);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$h */
    /* loaded from: classes5.dex */
    public class C9787h implements C9801a.InterfaceC9802a {
        public C9787h() {
        }

        @Override // com.roughike.bottombar.C9801a.InterfaceC9802a
        /* renamed from: a */
        public void mo33228a(BottomBarTab bottomBarTab) {
            bottomBarTab.setTitleTypeface(BottomBar.this.f58968q);
        }
    }

    /* renamed from: com.roughike.bottombar.BottomBar$i */
    /* loaded from: classes5.dex */
    public class C9788i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f58987a;

        public C9788i(int i) {
            this.f58987a = i;
        }

        /* renamed from: a */
        public final void m33275a() {
            BottomBar.this.f58973v.setBackgroundColor(this.f58987a);
            BottomBar.this.f58972u.setVisibility(4);
            ViewCompat.setAlpha(BottomBar.this.f58972u, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m33275a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m33275a();
        }
    }

    public BottomBar(Context context) {
        this(context, null);
    }

    private BottomBarTab.Config getTabConfig() {
        return new BottomBarTab.Config.Builder().inActiveTabAlpha(this.f58960i).activeTabAlpha(this.f58961j).inActiveTabColor(this.f58962k).activeTabColor(this.f58963l).barColorWhenSelected(this.f58975x).badgeBackgroundColor(this.f58964m).hideBadgeWhenSelected(this.f58965n).titleTextAppearance(this.f58967p).titleTypeFace(this.f58968q).build();
    }

    /* renamed from: A */
    public boolean m33313A() {
        return this.f58949I;
    }

    /* renamed from: B */
    public final void m33312B(Context context, AttributeSet attributeSet, int i, int i2) {
        float f;
        int color;
        this.f58953b = AbstractC17757Hs0.m68032b(getContext(), R.attr.colorPrimary);
        this.f58954c = AbstractC17757Hs0.m68030d(getContext());
        this.f58955d = AbstractC17757Hs0.m68033a(getContext(), 10.0f);
        this.f58956e = AbstractC17757Hs0.m68033a(getContext(), 168.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BottomBar, i, i2);
        try {
            this.f58957f = obtainStyledAttributes.getResourceId(R.styleable.BottomBar_bb_tabXmlResource, 0);
            this.f58958g = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_tabletMode, false);
            this.f58959h = obtainStyledAttributes.getInteger(R.styleable.BottomBar_bb_behavior, 0);
            int i3 = R.styleable.BottomBar_bb_inActiveTabAlpha;
            if (m33277y()) {
                f = 0.6f;
            } else {
                f = 1.0f;
            }
            this.f58960i = obtainStyledAttributes.getFloat(i3, f);
            this.f58961j = obtainStyledAttributes.getFloat(R.styleable.BottomBar_bb_activeTabAlpha, 1.0f);
            int i4 = -1;
            if (m33277y()) {
                color = -1;
            } else {
                color = ContextCompat.getColor(context, R.color.bb_inActiveBottomBarItemColor);
            }
            if (!m33277y()) {
                i4 = this.f58953b;
            }
            this.f58966o = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_longPressHintsEnabled, true);
            this.f58962k = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_inActiveTabColor, color);
            this.f58963l = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_activeTabColor, i4);
            this.f58964m = obtainStyledAttributes.getColor(R.styleable.BottomBar_bb_badgeBackgroundColor, SupportMenu.CATEGORY_MASK);
            this.f58965n = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_badgesHideWhenActive, true);
            this.f58967p = obtainStyledAttributes.getResourceId(R.styleable.BottomBar_bb_titleTextAppearance, 0);
            this.f58968q = m33287o(obtainStyledAttributes.getString(R.styleable.BottomBar_bb_titleTypeFace));
            this.f58969r = obtainStyledAttributes.getBoolean(R.styleable.BottomBar_bb_showShadow, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: C */
    public final void m33311C(int i) {
        this.f58973v.clearAnimation();
        this.f58972u.clearAnimation();
        this.f58972u.setBackgroundColor(i);
        this.f58972u.setVisibility(0);
    }

    /* renamed from: D */
    public final void m33310D() {
        int height = getHeight();
        if (height != 0 && !this.f58950J) {
            this.f58950J = true;
            this.f58974w.getLayoutParams().height = height;
            int m33216a = height + AbstractC9805c.m33216a(getContext());
            getLayoutParams().height = m33216a;
            if (m33276z()) {
                m33303K(m33216a);
            }
        }
    }

    /* renamed from: E */
    public final void m33309E(BottomBarTab[] bottomBarTabArr) {
        int m68028f = AbstractC17757Hs0.m68028f(getContext(), getWidth());
        if (m68028f <= 0 || m68028f > this.f58954c) {
            m68028f = this.f58954c;
        }
        int min = Math.min(AbstractC17757Hs0.m68033a(getContext(), m68028f / bottomBarTabArr.length), this.f58956e);
        double d = min;
        this.f58941A = (int) (0.9d * d);
        this.f58942B = (int) (d + ((bottomBarTabArr.length - 1) * 0.1d * d));
        int round = Math.round(getContext().getResources().getDimension(R.dimen.bb_height));
        for (BottomBarTab bottomBarTab : bottomBarTabArr) {
            ViewGroup.LayoutParams layoutParams = bottomBarTab.getLayoutParams();
            layoutParams.height = round;
            if (m33277y()) {
                if (bottomBarTab.m33265j()) {
                    layoutParams.width = this.f58942B;
                } else {
                    layoutParams.width = this.f58941A;
                }
            } else {
                layoutParams.width = min;
            }
            if (bottomBarTab.getParent() == null) {
                this.f58974w.addView(bottomBarTab);
            }
            bottomBarTab.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: F */
    public void m33308F(Bundle bundle) {
        if (bundle != null) {
            this.f58946F = true;
            this.f58947G = true;
            selectTabAtPosition(bundle.getInt("STATE_CURRENT_SELECTED_TAB", this.f58977z), false);
        }
    }

    /* renamed from: G */
    public Bundle m33307G() {
        Bundle bundle = new Bundle();
        bundle.putInt("STATE_CURRENT_SELECTED_TAB", this.f58977z);
        return bundle;
    }

    /* renamed from: H */
    public final void m33306H(BottomBarTab bottomBarTab, BottomBarTab bottomBarTab2, boolean z) {
        if (m33277y()) {
            bottomBarTab.m33256s(this.f58941A, z);
            bottomBarTab2.m33256s(this.f58942B, z);
        }
    }

    /* renamed from: I */
    public final void m33305I(List list) {
        BottomBarTab.Type type;
        this.f58974w.removeAllViews();
        BottomBarTab[] bottomBarTabArr = new BottomBarTab[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            BottomBarTab bottomBarTab = (BottomBarTab) it.next();
            if (m33277y()) {
                type = BottomBarTab.Type.SHIFTING;
            } else if (this.f58958g) {
                type = BottomBarTab.Type.TABLET;
            } else {
                type = BottomBarTab.Type.FIXED;
            }
            if (m33278x()) {
                bottomBarTab.setIsTitleless(true);
            }
            bottomBarTab.setType(type);
            bottomBarTab.m33264k();
            if (i == this.f58977z) {
                bottomBarTab.m33261n(false);
                m33286p(bottomBarTab, false);
            } else {
                bottomBarTab.m33267h(false);
            }
            if (!this.f58958g) {
                if (bottomBarTab.getWidth() > i2) {
                    i2 = bottomBarTab.getWidth();
                }
                bottomBarTabArr[i] = bottomBarTab;
            } else {
                this.f58974w.addView(bottomBarTab);
            }
            bottomBarTab.setOnClickListener(this);
            bottomBarTab.setOnLongClickListener(this);
            i++;
        }
        this.f58951K = bottomBarTabArr;
        if (!this.f58958g) {
            m33309E(bottomBarTabArr);
        }
    }

    /* renamed from: J */
    public final void m33304J(int i) {
        int id2 = getTabAtPosition(i).getId();
        if (i != this.f58977z) {
            OnTabSelectListener onTabSelectListener = this.f58944D;
            if (onTabSelectListener != null) {
                onTabSelectListener.onTabSelected(id2);
            }
        } else {
            OnTabReselectListener onTabReselectListener = this.f58945E;
            if (onTabReselectListener != null && !this.f58947G) {
                onTabReselectListener.onTabReSelected(id2);
            }
        }
        this.f58977z = i;
        if (this.f58947G) {
            this.f58947G = false;
        }
    }

    /* renamed from: K */
    public final void m33303K(int i) {
        ((CoordinatorLayout.LayoutParams) getLayoutParams()).setBehavior(new C13098pc(i, 0, false));
    }

    /* renamed from: L */
    public final void m33302L() {
        if (m33278x()) {
            return;
        }
        int tabCount = getTabCount();
        if (this.f58974w != null && tabCount != 0 && m33277y()) {
            for (int i = 0; i < tabCount; i++) {
                TextView titleView = getTabAtPosition(i).getTitleView();
                if (titleView != null) {
                    int height = this.f58955d - (titleView.getHeight() - titleView.getBaseline());
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
        return this.f58977z;
    }

    public ShySettings getShySettings() {
        m33276z();
        if (this.f58948H == null) {
            this.f58948H = new ShySettings(this);
        }
        return this.f58948H;
    }

    public BottomBarTab getTabAtPosition(int i) {
        View childAt = this.f58974w.getChildAt(i);
        if (childAt instanceof BadgeContainer) {
            return m33288n((BadgeContainer) childAt);
        }
        return (BottomBarTab) childAt;
    }

    public int getTabCount() {
        return this.f58974w.getChildCount();
    }

    public BottomBarTab getTabWithId(@IdRes int i) {
        return (BottomBarTab) this.f58974w.findViewById(i);
    }

    /* renamed from: j */
    public final void m33292j(View view, int i) {
        m33311C(i);
        if (!this.f58973v.isAttachedToWindow()) {
            return;
        }
        m33291k(view, i);
    }

    /* renamed from: k */
    public final void m33291k(View view, int i) {
        int i2;
        int width;
        int x = (int) (ViewCompat.getX(view) + (view.getMeasuredWidth() / 2));
        if (this.f58958g) {
            i2 = (int) ViewCompat.getY(view);
        } else {
            i2 = 0;
        }
        int measuredHeight = i2 + (view.getMeasuredHeight() / 2);
        if (this.f58958g) {
            width = this.f58973v.getHeight();
        } else {
            width = this.f58973v.getWidth();
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f58972u, x, measuredHeight, 0, width);
        if (this.f58958g) {
            createCircularReveal.setDuration(500L);
        }
        createCircularReveal.addListener(new C9788i(i));
        createCircularReveal.start();
    }

    /* renamed from: l */
    public final void m33290l() {
        if (m33277y()) {
            this.f58975x = this.f58953b;
        }
        Drawable background = getBackground();
        if (background != null && (background instanceof ColorDrawable)) {
            this.f58975x = ((ColorDrawable) background).getColor();
            setBackgroundColor(0);
        }
    }

    /* renamed from: m */
    public final boolean m33289m() {
        if (!this.f58958g && m33283s(4) && AbstractC9805c.m33213d(getContext())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final BottomBarTab m33288n(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof BottomBarTab) {
                return (BottomBarTab) childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final Typeface m33287o(String str) {
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
        m33285q((BottomBarTab) view);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (!this.f58958g) {
                m33309E(this.f58951K);
            }
            m33302L();
            if (m33276z()) {
                m33280v();
            }
            if (m33289m()) {
                m33310D();
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if ((view instanceof BottomBarTab) && !m33284r((BottomBarTab) view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            m33308F(bundle);
            parcelable = bundle.getParcelable("superstate");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle m33307G = m33307G();
        m33307G.putParcelable("superstate", super.onSaveInstanceState());
        return m33307G;
    }

    /* renamed from: p */
    public final void m33286p(BottomBarTab bottomBarTab, boolean z) {
        int barColorWhenSelected = bottomBarTab.getBarColorWhenSelected();
        if (this.f58976y == barColorWhenSelected) {
            return;
        }
        if (!z) {
            this.f58973v.setBackgroundColor(barColorWhenSelected);
            return;
        }
        boolean m33266i = bottomBarTab.m33266i();
        ViewGroup viewGroup = bottomBarTab;
        if (m33266i) {
            viewGroup = bottomBarTab.getOuterView();
        }
        m33292j(viewGroup, barColorWhenSelected);
        this.f58976y = barColorWhenSelected;
    }

    /* renamed from: q */
    public final void m33285q(BottomBarTab bottomBarTab) {
        BottomBarTab currentTab = getCurrentTab();
        TabSelectionInterceptor tabSelectionInterceptor = this.f58943C;
        if (tabSelectionInterceptor != null && tabSelectionInterceptor.shouldInterceptTabSelection(currentTab.getId(), bottomBarTab.getId())) {
            return;
        }
        currentTab.m33267h(true);
        bottomBarTab.m33261n(true);
        m33306H(currentTab, bottomBarTab, true);
        m33286p(bottomBarTab, true);
        m33304J(bottomBarTab.getIndexInTabContainer());
    }

    /* renamed from: r */
    public final boolean m33284r(BottomBarTab bottomBarTab) {
        boolean z;
        if (!m33277y() && !this.f58958g) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !bottomBarTab.m33265j();
        if (z && z2 && this.f58966o) {
            Toast.makeText(getContext(), bottomBarTab.getTitle(), 0).show();
        }
        return true;
    }

    public void removeOnTabReselectListener() {
        this.f58945E = null;
    }

    public void removeOnTabSelectListener() {
        this.f58944D = null;
    }

    public void removeOverrideTabSelectionListener() {
        this.f58943C = null;
    }

    /* renamed from: s */
    public final boolean m33283s(int i) {
        int i2 = this.f58959h;
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
        this.f58961j = f;
        this.f58952a.m33229a(new C9781b());
    }

    public void setActiveTabColor(@ColorInt int i) {
        this.f58963l = i;
        this.f58952a.m33229a(new C9783d());
    }

    public void setBadgeBackgroundColor(@ColorInt int i) {
        this.f58964m = i;
        this.f58952a.m33229a(new C9784e());
    }

    public void setBadgesHideWhenActive(boolean z) {
        this.f58965n = z;
        this.f58952a.m33229a(new C9785f(z));
    }

    public void setDefaultTab(@IdRes int i) {
        setDefaultTabPosition(findPositionForTabWithId(i));
    }

    public void setDefaultTabPosition(int i) {
        if (this.f58946F) {
            return;
        }
        selectTabAtPosition(i);
    }

    public void setInActiveTabAlpha(float f) {
        this.f58960i = f;
        this.f58952a.m33229a(new C9780a());
    }

    public void setInActiveTabColor(@ColorInt int i) {
        this.f58962k = i;
        this.f58952a.m33229a(new C9782c());
    }

    public void setItems(@XmlRes int i) {
        setItems(i, null);
    }

    public void setLongPressHintsEnabled(boolean z) {
        this.f58966o = z;
    }

    public void setOnTabReselectListener(@NonNull OnTabReselectListener onTabReselectListener) {
        this.f58945E = onTabReselectListener;
    }

    public void setOnTabSelectListener(@NonNull OnTabSelectListener onTabSelectListener) {
        setOnTabSelectListener(onTabSelectListener, true);
    }

    public void setTabSelectionInterceptor(@NonNull TabSelectionInterceptor tabSelectionInterceptor) {
        this.f58943C = tabSelectionInterceptor;
    }

    public void setTabTitleTextAppearance(int i) {
        this.f58967p = i;
        this.f58952a.m33229a(new C9786g());
    }

    public void setTabTitleTypeface(String str) {
        setTabTitleTypeface(m33287o(str));
    }

    /* renamed from: t */
    public final void m33282t(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f58952a = new C9801a(this);
        m33312B(context, attributeSet, i, i2);
        m33279w();
        m33290l();
        m33281u(context);
        int i3 = this.f58957f;
        if (i3 != 0) {
            setItems(i3);
        }
    }

    /* renamed from: u */
    public final void m33281u(Context context) {
        if (this.f58969r) {
            float elevation = getElevation();
            this.f58970s = elevation;
            if (elevation <= 0.0f) {
                elevation = getResources().getDimensionPixelSize(R.dimen.bb_default_elevation);
            }
            this.f58970s = elevation;
            setElevation(AbstractC17757Hs0.m68033a(context, elevation));
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
    }

    /* renamed from: v */
    public final void m33280v() {
        int height;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof CoordinatorLayout)) {
            if (!this.f58949I && (height = getHeight()) != 0) {
                m33303K(height);
                getShySettings().m33237a();
                this.f58949I = true;
                return;
            }
            return;
        }
        throw new RuntimeException("In order to have shy behavior, the BottomBar must be a direct child of a CoordinatorLayout.");
    }

    /* renamed from: w */
    public final void m33279w() {
        int i;
        int i2;
        boolean z = this.f58958g;
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
        setOrientation(!this.f58958g ? 1 : 0);
        Context context = getContext();
        if (this.f58958g) {
            i2 = R.layout.bb_bottom_bar_item_container_tablet;
        } else {
            i2 = R.layout.bb_bottom_bar_item_container;
        }
        View inflate = View.inflate(context, i2, this);
        inflate.setLayoutParams(layoutParams);
        this.f58972u = inflate.findViewById(R.id.bb_bottom_bar_background_overlay);
        this.f58973v = (ViewGroup) inflate.findViewById(R.id.bb_bottom_bar_outer_container);
        this.f58974w = (ViewGroup) inflate.findViewById(R.id.bb_bottom_bar_item_container);
        this.f58971t = findViewById(R.id.bb_bottom_bar_shadow);
    }

    /* renamed from: x */
    public final boolean m33278x() {
        if (!this.f58958g && m33283s(8)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m33277y() {
        if (!this.f58958g && m33283s(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m33276z() {
        if (!this.f58958g && m33283s(2)) {
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
            currentTab.m33267h(z);
            tabAtPosition.m33261n(z);
            m33304J(i);
            m33306H(currentTab, tabAtPosition, z);
            m33286p(tabAtPosition, z);
            return;
        }
        throw new IndexOutOfBoundsException("Can't select tab at position " + i + ". This BottomBar has no items at that position.");
    }

    public void setItems(@XmlRes int i, BottomBarTab.Config config) {
        if (i != 0) {
            if (config == null) {
                config = getTabConfig();
            }
            m33305I(new TabParser(getContext(), config, i).m33231d());
            return;
        }
        throw new RuntimeException("No items specified for the BottomBar!");
    }

    public void setOnTabSelectListener(@NonNull OnTabSelectListener onTabSelectListener, boolean z) {
        this.f58944D = onTabSelectListener;
        if (!z || getTabCount() <= 0) {
            return;
        }
        onTabSelectListener.onTabSelected(getCurrentTabId());
    }

    public BottomBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58975x = -1;
        m33282t(context, attributeSet, i, 0);
    }

    public void setTabTitleTypeface(Typeface typeface) {
        this.f58968q = typeface;
        this.f58952a.m33229a(new C9787h());
    }

    @RequiresApi(21)
    public BottomBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f58975x = -1;
        m33282t(context, attributeSet, i, i2);
    }
}
