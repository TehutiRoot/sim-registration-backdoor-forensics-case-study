package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.C7043a;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.material.search.a */
/* loaded from: classes4.dex */
public class C7043a {

    /* renamed from: d */
    public Animator f50555d;

    /* renamed from: e */
    public Animator f50556e;

    /* renamed from: f */
    public boolean f50557f;

    /* renamed from: g */
    public boolean f50558g;

    /* renamed from: a */
    public final Set f50552a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f50553b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f50554c = new LinkedHashSet();

    /* renamed from: h */
    public boolean f50559h = true;

    /* renamed from: i */
    public Animator f50560i = null;

    /* renamed from: com.google.android.material.search.a$a */
    /* loaded from: classes4.dex */
    public class C7044a extends AnimatorListenerAdapter {
        public C7044a() {
            C7043a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7043a.this.m44306k(new InterfaceC7050g() { // from class: RE1
                @Override // com.google.android.material.search.C7043a.InterfaceC7050g
                /* renamed from: a */
                public final void mo44290a(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                    onLoadAnimationCallback.onAnimationEnd();
                }
            });
        }
    }

    /* renamed from: com.google.android.material.search.a$b */
    /* loaded from: classes4.dex */
    public class C7045b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f50562a;

        /* renamed from: b */
        public final /* synthetic */ Animator f50563b;

        public C7045b(View view, Animator animator) {
            C7043a.this = r1;
            this.f50562a = view;
            this.f50563b = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f50562a.setVisibility(8);
            this.f50563b.start();
        }
    }

    /* renamed from: com.google.android.material.search.a$c */
    /* loaded from: classes4.dex */
    public class C7046c extends AnimatorListenerAdapter {
        public C7046c() {
            C7043a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7043a.this.f50560i = null;
        }
    }

    /* renamed from: com.google.android.material.search.a$d */
    /* loaded from: classes4.dex */
    public class C7047d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ SearchBar f50566a;

        public C7047d(SearchBar searchBar) {
            C7043a.this = r1;
            this.f50566a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7043a.this.f50557f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f50566a.setVisibility(4);
        }
    }

    /* renamed from: com.google.android.material.search.a$e */
    /* loaded from: classes4.dex */
    public class C7048e extends AnimatorListenerAdapter {
        public C7048e() {
            C7043a.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7043a.this.f50560i = null;
        }
    }

    /* renamed from: com.google.android.material.search.a$f */
    /* loaded from: classes4.dex */
    public class C7049f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ SearchBar f50569a;

        public C7049f(SearchBar searchBar) {
            C7043a.this = r1;
            this.f50569a = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f50569a.setVisibility(0);
            C7043a.this.f50558g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f50569a.stopOnLoadAnimation();
        }
    }

    /* renamed from: com.google.android.material.search.a$g */
    /* loaded from: classes4.dex */
    public interface InterfaceC7050g {
        /* renamed from: a */
        void mo44290a(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    /* renamed from: A */
    public static /* synthetic */ void m44327A(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        ViewCompat.setBackground(view, materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    /* renamed from: a */
    public static /* synthetic */ void m44316a(View view, ValueAnimator valueAnimator) {
        view.setAlpha(0.0f);
    }

    /* renamed from: c */
    public static /* synthetic */ void m44314c(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        m44327A(materialShapeDrawable, view, valueAnimator);
    }

    /* renamed from: C */
    public final /* synthetic */ void m44325C(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m44297t(searchBar, view), m44302o(searchBar, view, appBarLayout));
        animatorSet.addListener(new C7046c());
        for (AnimatorListenerAdapter animatorListenerAdapter : this.f50553b) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f50560i = animatorSet;
    }

    /* renamed from: D */
    public boolean m44324D(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50554c.remove(animatorListenerAdapter);
    }

    /* renamed from: E */
    public boolean m44323E(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f50553b.remove(animatorListenerAdapter);
    }

    /* renamed from: F */
    public boolean m44322F(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f50552a.remove(onLoadAnimationCallback);
    }

    /* renamed from: G */
    public void m44321G(boolean z) {
        this.f50559h = z;
    }

    /* renamed from: H */
    public void m44320H(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        Animator animator;
        if (m44292y() && (animator = this.f50560i) != null) {
            animator.cancel();
        }
        this.f50558g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m44305l(searchBar, view, appBarLayout), m44298s(searchBar));
        animatorSet.addListener(new C7048e());
        for (AnimatorListenerAdapter animatorListenerAdapter : this.f50554c) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f50560i = animatorSet;
    }

    /* renamed from: I */
    public void m44319I(final SearchBar searchBar, final View view, final AppBarLayout appBarLayout, final boolean z) {
        Animator animator;
        if (m44293x() && (animator = this.f50560i) != null) {
            animator.cancel();
        }
        this.f50557f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: OE1
            @Override // java.lang.Runnable
            public final void run() {
                C7043a.this.m44325C(searchBar, view, appBarLayout, z);
            }
        });
    }

    /* renamed from: J */
    public void m44318J(SearchBar searchBar) {
        m44306k(new InterfaceC7050g() { // from class: ME1
            @Override // com.google.android.material.search.C7043a.InterfaceC7050g
            /* renamed from: a */
            public final void mo44290a(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator m44295v = m44295v(textView, secondaryActionMenuItemView);
        m44295v.addListener(new C7044a());
        this.f50555d = m44295v;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: NE1
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    m44295v.start();
                }
            });
        } else if (centerView != null) {
            centerView.setAlpha(0.0f);
            centerView.setVisibility(0);
            Animator m44304m = m44304m(centerView);
            this.f50556e = m44304m;
            m44304m.addListener(new C7045b(centerView, m44295v));
            m44304m.start();
        } else {
            m44295v.start();
        }
    }

    /* renamed from: K */
    public void m44317K(SearchBar searchBar) {
        Animator animator = this.f50555d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f50556e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }

    /* renamed from: h */
    public void m44309h(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50554c.add(animatorListenerAdapter);
    }

    /* renamed from: i */
    public void m44308i(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50553b.add(animatorListenerAdapter);
    }

    /* renamed from: j */
    public void m44307j(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f50552a.add(onLoadAnimationCallback);
    }

    /* renamed from: k */
    public final void m44306k(InterfaceC7050g interfaceC7050g) {
        for (SearchBar.OnLoadAnimationCallback onLoadAnimationCallback : this.f50552a) {
            interfaceC7050g.mo44290a(onLoadAnimationCallback);
        }
    }

    /* renamed from: l */
    public final Animator m44305l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return m44301p(searchBar, view, appBarLayout).setDuration(250L).addListener(new C7049f(searchBar)).getCollapseAnimator();
    }

    /* renamed from: m */
    public final Animator m44304m(View view) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        ofFloat.setInterpolator(timeInterpolator);
        long j2 = 0;
        if (this.f50559h) {
            j = 250;
        } else {
            j = 0;
        }
        ofFloat.setDuration(j);
        if (this.f50559h) {
            j2 = 500;
        }
        ofFloat.setStartDelay(j2);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* renamed from: n */
    public final List m44303n(View view) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((!isLayoutRtl && (childAt instanceof ActionMenuView)) || (isLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final Animator m44302o(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return m44301p(searchBar, view, appBarLayout).setDuration(300L).addListener(new C7047d(searchBar)).getExpandAnimator();
    }

    /* renamed from: p */
    public final ExpandCollapseAnimationHelper m44301p(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        int i;
        ExpandCollapseAnimationHelper additionalUpdateListener = new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(m44300q(searchBar, view));
        if (appBarLayout != null) {
            i = appBarLayout.getTop();
        } else {
            i = 0;
        }
        return additionalUpdateListener.setCollapsedViewOffsetY(i).addEndAnchoredViews(m44303n(view));
    }

    /* renamed from: q */
    public final ValueAnimator.AnimatorUpdateListener m44300q(SearchBar searchBar, final View view) {
        final MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        createWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        createWithElevationOverlay.setElevation(ViewCompat.getElevation(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: PE1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7043a.m44314c(MaterialShapeDrawable.this, view, valueAnimator);
            }
        };
    }

    /* renamed from: r */
    public final List m44299r(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    /* renamed from: s */
    public final Animator m44298s(SearchBar searchBar) {
        List m44299r = m44299r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(m44299r));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    /* renamed from: t */
    public final Animator m44297t(SearchBar searchBar, final View view) {
        List m44299r = m44299r(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(m44299r));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: QE1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7043a.m44316a(view, valueAnimator);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    /* renamed from: u */
    public final Animator m44296u(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    /* renamed from: v */
    public final Animator m44295v(TextView textView, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(m44294w(textView));
        if (view != null) {
            animatorSet.play(m44296u(view));
        }
        return animatorSet;
    }

    /* renamed from: w */
    public final Animator m44294w(TextView textView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    /* renamed from: x */
    public boolean m44293x() {
        return this.f50558g;
    }

    /* renamed from: y */
    public boolean m44292y() {
        return this.f50557f;
    }

    /* renamed from: z */
    public boolean m44291z() {
        return this.f50559h;
    }
}
