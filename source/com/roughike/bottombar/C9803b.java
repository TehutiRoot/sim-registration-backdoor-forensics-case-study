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
public class C9803b extends TextView {

    /* renamed from: a */
    public int f59040a;

    /* renamed from: b */
    public boolean f59041b;

    /* renamed from: com.roughike.bottombar.b$a */
    /* loaded from: classes5.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC9804a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ BadgeContainer f59042a;

        /* renamed from: b */
        public final /* synthetic */ BottomBarTab f59043b;

        public ViewTreeObserver$OnGlobalLayoutListenerC9804a(BadgeContainer badgeContainer, BottomBarTab bottomBarTab) {
            this.f59042a = badgeContainer;
            this.f59043b = bottomBarTab;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f59042a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C9803b.this.m33227a(this.f59043b);
        }
    }

    public C9803b(Context context) {
        super(context);
        this.f59041b = false;
    }

    /* renamed from: a */
    public void m33227a(BottomBarTab bottomBarTab) {
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
    public void m33226b(BottomBarTab bottomBarTab, int i) {
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        AbstractC17757Hs0.m68027g(this, R.style.BB_BottomBarBadge_Text);
        m33220h(i);
        m33217k(bottomBarTab);
    }

    /* renamed from: c */
    public int m33225c() {
        return this.f59040a;
    }

    /* renamed from: d */
    public void m33224d() {
        this.f59041b = false;
        ViewCompat.animate(this).setDuration(150L).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).start();
    }

    /* renamed from: e */
    public boolean m33223e() {
        return this.f59041b;
    }

    /* renamed from: f */
    public void m33222f(BottomBarTab bottomBarTab) {
        BadgeContainer badgeContainer = (BadgeContainer) getParent();
        ViewGroup viewGroup = (ViewGroup) badgeContainer.getParent();
        badgeContainer.removeView(bottomBarTab);
        viewGroup.removeView(badgeContainer);
        viewGroup.addView(bottomBarTab, bottomBarTab.getIndexInTabContainer());
    }

    /* renamed from: g */
    public final void m33221g(Drawable drawable) {
        setBackground(drawable);
    }

    /* renamed from: h */
    public void m33220h(int i) {
        int m68033a = AbstractC17757Hs0.m68033a(getContext(), 1.0f);
        ShapeDrawable m65389a = AbstractC1735Y9.m65389a(m68033a * 3, i);
        setPadding(m68033a, m68033a, m68033a, m68033a);
        m33221g(m65389a);
    }

    /* renamed from: i */
    public void m33219i(int i) {
        this.f59040a = i;
        setText(String.valueOf(i));
    }

    /* renamed from: j */
    public void m33218j() {
        this.f59041b = true;
        ViewCompat.animate(this).setDuration(150L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }

    /* renamed from: k */
    public final void m33217k(BottomBarTab bottomBarTab) {
        ViewGroup viewGroup = (ViewGroup) bottomBarTab.getParent();
        viewGroup.removeView(bottomBarTab);
        BadgeContainer badgeContainer = new BadgeContainer(getContext());
        badgeContainer.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        badgeContainer.addView(bottomBarTab);
        badgeContainer.addView(this);
        viewGroup.addView(badgeContainer, bottomBarTab.getIndexInTabContainer());
        badgeContainer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC9804a(badgeContainer, bottomBarTab));
    }
}
