package com.roughike.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;

/* renamed from: com.roughike.bottombar.b */
/* loaded from: classes5.dex */
public class C9792b extends TextView {

    /* renamed from: a */
    public int f59052a;

    /* renamed from: b */
    public boolean f59053b;

    /* renamed from: com.roughike.bottombar.b$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC9793a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ BadgeContainer f59054a;

        /* renamed from: b */
        public final /* synthetic */ BottomBarTab f59055b;

        public ViewTreeObserver$OnGlobalLayoutListenerC9793a(BadgeContainer badgeContainer, BottomBarTab bottomBarTab) {
            this.f59054a = badgeContainer;
            this.f59055b = bottomBarTab;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f59054a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C9792b.this.m33219a(this.f59055b);
        }
    }

    public C9792b(Context context) {
        super(context);
        this.f59053b = false;
    }

    /* renamed from: a */
    public void m33219a(BottomBarTab bottomBarTab) {
        AppCompatImageView iconView = bottomBarTab.getIconView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int max = Math.max(getWidth(), getHeight());
        setX(iconView.getX() + ((float) (iconView.getWidth() / 1.25d)));
        setTranslationY(10.0f);
        if (layoutParams.width != max || layoutParams.height != max) {
            layoutParams.width = max;
            layoutParams.height = max;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public void m33218b(BottomBarTab bottomBarTab, int i) {
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        AbstractC18178Ns0.m67185g(this, R.style.BB_BottomBarBadge_Text);
        m33212h(i);
        m33209k(bottomBarTab);
    }

    /* renamed from: c */
    public int m33217c() {
        return this.f59052a;
    }

    /* renamed from: d */
    public void m33216d() {
        this.f59053b = false;
        ViewCompat.animate(this).setDuration(150L).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).start();
    }

    /* renamed from: e */
    public boolean m33215e() {
        return this.f59053b;
    }

    /* renamed from: f */
    public void m33214f(BottomBarTab bottomBarTab) {
        BadgeContainer badgeContainer = (BadgeContainer) getParent();
        ViewGroup viewGroup = (ViewGroup) badgeContainer.getParent();
        badgeContainer.removeView(bottomBarTab);
        viewGroup.removeView(badgeContainer);
        viewGroup.addView(bottomBarTab, bottomBarTab.getIndexInTabContainer());
    }

    /* renamed from: g */
    public final void m33213g(Drawable drawable) {
        setBackground(drawable);
    }

    /* renamed from: h */
    public void m33212h(int i) {
        int m67191a = AbstractC18178Ns0.m67191a(getContext(), 1.0f);
        ShapeDrawable m65489a = AbstractC1717Y9.m65489a(m67191a * 3, i);
        setPadding(m67191a, m67191a, m67191a, m67191a);
        m33213g(m65489a);
    }

    /* renamed from: i */
    public void m33211i(int i) {
        this.f59052a = i;
        setText(String.valueOf(i));
    }

    /* renamed from: j */
    public void m33210j() {
        this.f59053b = true;
        ViewCompat.animate(this).setDuration(150L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }

    /* renamed from: k */
    public final void m33209k(BottomBarTab bottomBarTab) {
        ViewGroup viewGroup = (ViewGroup) bottomBarTab.getParent();
        viewGroup.removeView(bottomBarTab);
        BadgeContainer badgeContainer = new BadgeContainer(getContext());
        badgeContainer.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        badgeContainer.addView(bottomBarTab);
        badgeContainer.addView(this);
        viewGroup.addView(badgeContainer, bottomBarTab.getIndexInTabContainer());
        badgeContainer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC9793a(badgeContainer, bottomBarTab));
    }
}