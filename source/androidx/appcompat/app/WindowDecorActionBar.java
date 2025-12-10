package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* renamed from: F */
    public static final Interpolator f9000F = new AccelerateInterpolator();

    /* renamed from: G */
    public static final Interpolator f9001G = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f9002A;

    /* renamed from: B */
    public boolean f9003B;

    /* renamed from: a */
    public Context f9007a;

    /* renamed from: b */
    public Context f9008b;

    /* renamed from: c */
    public Activity f9009c;

    /* renamed from: d */
    public ActionBarOverlayLayout f9010d;

    /* renamed from: e */
    public ActionBarContainer f9011e;

    /* renamed from: f */
    public DecorToolbar f9012f;

    /* renamed from: g */
    public ActionBarContextView f9013g;

    /* renamed from: h */
    public View f9014h;

    /* renamed from: i */
    public ScrollingTabContainerView f9015i;

    /* renamed from: k */
    public TabImpl f9017k;

    /* renamed from: m */
    public boolean f9019m;

    /* renamed from: n */
    public ActionModeImpl f9020n;

    /* renamed from: o */
    public ActionMode f9021o;

    /* renamed from: p */
    public ActionMode.Callback f9022p;

    /* renamed from: q */
    public boolean f9023q;

    /* renamed from: s */
    public boolean f9025s;

    /* renamed from: v */
    public boolean f9028v;

    /* renamed from: w */
    public boolean f9029w;

    /* renamed from: x */
    public boolean f9030x;

    /* renamed from: z */
    public ViewPropertyAnimatorCompatSet f9032z;

    /* renamed from: j */
    public ArrayList f9016j = new ArrayList();

    /* renamed from: l */
    public int f9018l = -1;

    /* renamed from: r */
    public ArrayList f9024r = new ArrayList();

    /* renamed from: t */
    public int f9026t = 0;

    /* renamed from: u */
    public boolean f9027u = true;

    /* renamed from: y */
    public boolean f9031y = true;

    /* renamed from: C */
    public final ViewPropertyAnimatorListener f9004C = new C2110a();

    /* renamed from: D */
    public final ViewPropertyAnimatorListener f9005D = new C2111b();

    /* renamed from: E */
    public final ViewPropertyAnimatorUpdateListener f9006E = new C2112c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {

        /* renamed from: c */
        public final Context f9033c;

        /* renamed from: d */
        public final MenuBuilder f9034d;

        /* renamed from: e */
        public ActionMode.Callback f9035e;

        /* renamed from: f */
        public WeakReference f9036f;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f9033c = context;
            this.f9035e = callback;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.f9034d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        public boolean dispatchOnCreate() {
            this.f9034d.stopDispatchingItemsChanged();
            try {
                return this.f9035e.onCreateActionMode(this, this.f9034d);
            } finally {
                this.f9034d.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f9020n != this) {
                return;
            }
            if (!WindowDecorActionBar.m64580b(windowDecorActionBar.f9028v, windowDecorActionBar.f9029w, false)) {
                WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
                windowDecorActionBar2.f9021o = this;
                windowDecorActionBar2.f9022p = this.f9035e;
            } else {
                this.f9035e.onDestroyActionMode(this);
            }
            this.f9035e = null;
            WindowDecorActionBar.this.animateToMode(false);
            WindowDecorActionBar.this.f9013g.closeMode();
            WindowDecorActionBar windowDecorActionBar3 = WindowDecorActionBar.this;
            windowDecorActionBar3.f9010d.setHideOnContentScrollEnabled(windowDecorActionBar3.f9003B);
            WindowDecorActionBar.this.f9020n = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public View getCustomView() {
            WeakReference weakReference = this.f9036f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public Menu getMenu() {
            return this.f9034d;
        }

        @Override // androidx.appcompat.view.ActionMode
        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.f9033c);
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence getSubtitle() {
            return WindowDecorActionBar.this.f9013g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence getTitle() {
            return WindowDecorActionBar.this.f9013g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
            if (WindowDecorActionBar.this.f9020n != this) {
                return;
            }
            this.f9034d.stopDispatchingItemsChanged();
            try {
                this.f9035e.onPrepareActionMode(this, this.f9034d);
            } finally {
                this.f9034d.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
            return WindowDecorActionBar.this.f9013g.isTitleOptional();
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public void onCloseSubMenu(SubMenuBuilder subMenuBuilder) {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ActionMode.Callback callback = this.f9035e;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            if (this.f9035e == null) {
                return;
            }
            invalidate();
            WindowDecorActionBar.this.f9013g.showOverflowMenu();
        }

        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            if (this.f9035e == null) {
                return false;
            }
            if (!subMenuBuilder.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.getThemedContext(), subMenuBuilder).show();
            return true;
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(View view) {
            WindowDecorActionBar.this.f9013g.setCustomView(view);
            this.f9036f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(CharSequence charSequence) {
            WindowDecorActionBar.this.f9013g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(CharSequence charSequence) {
            WindowDecorActionBar.this.f9013g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            WindowDecorActionBar.this.f9013g.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int i) {
            setSubtitle(WindowDecorActionBar.this.f9007a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int i) {
            setTitle(WindowDecorActionBar.this.f9007a.getResources().getString(i));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class TabImpl extends ActionBar.Tab {

        /* renamed from: a */
        public ActionBar.TabListener f9038a;

        /* renamed from: b */
        public Object f9039b;

        /* renamed from: c */
        public Drawable f9040c;

        /* renamed from: d */
        public CharSequence f9041d;

        /* renamed from: e */
        public CharSequence f9042e;

        /* renamed from: f */
        public int f9043f = -1;

        /* renamed from: g */
        public View f9044g;

        public TabImpl() {
        }

        public ActionBar.TabListener getCallback() {
            return this.f9038a;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence getContentDescription() {
            return this.f9042e;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public View getCustomView() {
            return this.f9044g;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public Drawable getIcon() {
            return this.f9040c;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
            return this.f9043f;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public Object getTag() {
            return this.f9039b;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public CharSequence getText() {
            return this.f9041d;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
            WindowDecorActionBar.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(int i) {
            return setContentDescription(WindowDecorActionBar.this.f9007a.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(View view) {
            this.f9044g = view;
            int i = this.f9043f;
            if (i >= 0) {
                WindowDecorActionBar.this.f9015i.updateTab(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setIcon(Drawable drawable) {
            this.f9040c = drawable;
            int i = this.f9043f;
            if (i >= 0) {
                WindowDecorActionBar.this.f9015i.updateTab(i);
            }
            return this;
        }

        public void setPosition(int i) {
            this.f9043f = i;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setTabListener(ActionBar.TabListener tabListener) {
            this.f9038a = tabListener;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setTag(Object obj) {
            this.f9039b = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setText(CharSequence charSequence) {
            this.f9041d = charSequence;
            int i = this.f9043f;
            if (i >= 0) {
                WindowDecorActionBar.this.f9015i.updateTab(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setContentDescription(CharSequence charSequence) {
            this.f9042e = charSequence;
            int i = this.f9043f;
            if (i >= 0) {
                WindowDecorActionBar.this.f9015i.updateTab(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setCustomView(int i) {
            return setCustomView(LayoutInflater.from(WindowDecorActionBar.this.getThemedContext()).inflate(i, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setIcon(int i) {
            return setIcon(AppCompatResources.getDrawable(WindowDecorActionBar.this.f9007a, i));
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public ActionBar.Tab setText(int i) {
            return setText(WindowDecorActionBar.this.f9007a.getResources().getText(i));
        }
    }

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$a */
    /* loaded from: classes.dex */
    public class C2110a extends ViewPropertyAnimatorListenerAdapter {
        public C2110a() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f9027u && (view2 = windowDecorActionBar.f9014h) != null) {
                view2.setTranslationY(0.0f);
                WindowDecorActionBar.this.f9011e.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.f9011e.setVisibility(8);
            WindowDecorActionBar.this.f9011e.setTransitioning(false);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.f9032z = null;
            windowDecorActionBar2.m64578d();
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f9010d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.requestApplyInsets(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$b */
    /* loaded from: classes.dex */
    public class C2111b extends ViewPropertyAnimatorListenerAdapter {
        public C2111b() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.f9032z = null;
            windowDecorActionBar.f9011e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$c */
    /* loaded from: classes.dex */
    public class C2112c implements ViewPropertyAnimatorUpdateListener {
        public C2112c() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
        public void onAnimationUpdate(View view) {
            ((View) WindowDecorActionBar.this.f9011e.getParent()).invalidate();
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        this.f9009c = activity;
        View decorView = activity.getWindow().getDecorView();
        m64573i(decorView);
        if (z) {
            return;
        }
        this.f9014h = decorView.findViewById(16908290);
    }

    /* renamed from: b */
    public static boolean m64580b(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f9024r.add(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab) {
        addTab(tab, this.f9016j.isEmpty());
    }

    public void animateToMode(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            m64570l();
        } else {
            m64574h();
        }
        if (m64571k()) {
            if (z) {
                viewPropertyAnimatorCompat2 = this.f9012f.setupAnimatorToVisibility(4, 100L);
                viewPropertyAnimatorCompat = this.f9013g.setupAnimatorToVisibility(0, 200L);
            } else {
                viewPropertyAnimatorCompat = this.f9012f.setupAnimatorToVisibility(0, 200L);
                viewPropertyAnimatorCompat2 = this.f9013g.setupAnimatorToVisibility(8, 100L);
            }
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
            viewPropertyAnimatorCompatSet.playSequentially(viewPropertyAnimatorCompat2, viewPropertyAnimatorCompat);
            viewPropertyAnimatorCompatSet.start();
        } else if (z) {
            this.f9012f.setVisibility(4);
            this.f9013g.setVisibility(0);
        } else {
            this.f9012f.setVisibility(0);
            this.f9013g.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void m64579c() {
        if (this.f9017k != null) {
            selectTab(null);
        }
        this.f9016j.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f9015i;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.removeAllTabs();
        }
        this.f9018l = -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        DecorToolbar decorToolbar = this.f9012f;
        if (decorToolbar != null && decorToolbar.hasExpandedActionView()) {
            this.f9012f.collapseActionView();
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m64578d() {
        ActionMode.Callback callback = this.f9022p;
        if (callback != null) {
            callback.onDestroyActionMode(this.f9021o);
            this.f9021o = null;
            this.f9022p = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.f9023q) {
            return;
        }
        this.f9023q = z;
        int size = this.f9024r.size();
        for (int i = 0; i < size; i++) {
            ((ActionBar.OnMenuVisibilityListener) this.f9024r.get(i)).onMenuVisibilityChanged(z);
        }
    }

    public void doHide(boolean z) {
        View view;
        int[] iArr;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f9032z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        if (this.f9026t == 0 && (this.f9002A || z)) {
            this.f9011e.setAlpha(1.0f);
            this.f9011e.setTransitioning(true);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            float f = -this.f9011e.getHeight();
            if (z) {
                this.f9011e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f9011e).translationY(f);
            translationY.setUpdateListener(this.f9006E);
            viewPropertyAnimatorCompatSet2.play(translationY);
            if (this.f9027u && (view = this.f9014h) != null) {
                viewPropertyAnimatorCompatSet2.play(ViewCompat.animate(view).translationY(f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(f9000F);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.f9004C);
            this.f9032z = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
            return;
        }
        this.f9004C.onAnimationEnd(null);
    }

    public void doShow(boolean z) {
        View view;
        View view2;
        int[] iArr;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f9032z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
        this.f9011e.setVisibility(0);
        if (this.f9026t == 0 && (this.f9002A || z)) {
            this.f9011e.setTranslationY(0.0f);
            float f = -this.f9011e.getHeight();
            if (z) {
                this.f9011e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f9011e.setTranslationY(f);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f9011e).translationY(0.0f);
            translationY.setUpdateListener(this.f9006E);
            viewPropertyAnimatorCompatSet2.play(translationY);
            if (this.f9027u && (view2 = this.f9014h) != null) {
                view2.setTranslationY(f);
                viewPropertyAnimatorCompatSet2.play(ViewCompat.animate(this.f9014h).translationY(0.0f));
            }
            viewPropertyAnimatorCompatSet2.setInterpolator(f9001G);
            viewPropertyAnimatorCompatSet2.setDuration(250L);
            viewPropertyAnimatorCompatSet2.setListener(this.f9005D);
            this.f9032z = viewPropertyAnimatorCompatSet2;
            viewPropertyAnimatorCompatSet2.start();
        } else {
            this.f9011e.setAlpha(1.0f);
            this.f9011e.setTranslationY(0.0f);
            if (this.f9027u && (view = this.f9014h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f9005D.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9010d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    /* renamed from: e */
    public final void m64577e(ActionBar.Tab tab, int i) {
        TabImpl tabImpl = (TabImpl) tab;
        if (tabImpl.getCallback() != null) {
            tabImpl.setPosition(i);
            this.f9016j.add(i, tabImpl);
            int size = this.f9016j.size();
            while (true) {
                i++;
                if (i < size) {
                    ((TabImpl) this.f9016j.get(i)).setPosition(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.f9027u = z;
    }

    /* renamed from: f */
    public final void m64576f() {
        if (this.f9015i != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f9007a);
        if (this.f9025s) {
            scrollingTabContainerView.setVisibility(0);
            this.f9012f.setEmbeddedTabView(scrollingTabContainerView);
        } else {
            if (getNavigationMode() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9010d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f9011e.setTabContainer(scrollingTabContainerView);
        }
        this.f9015i = scrollingTabContainerView;
    }

    /* renamed from: g */
    public final DecorToolbar m64575g(View view) {
        String str;
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = AbstractJsonLexerKt.NULL;
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.f9012f.getCustomView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.f9012f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return ViewCompat.getElevation(this.f9011e);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.f9011e.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.f9010d.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.f9012f.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode != 2) {
                return 0;
            }
            return this.f9016j.size();
        }
        return this.f9012f.getDropdownItemCount();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.f9012f.getNavigationMode();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        TabImpl tabImpl;
        int navigationMode = this.f9012f.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode != 2 || (tabImpl = this.f9017k) == null) {
                return -1;
            }
            return tabImpl.getPosition();
        }
        return this.f9012f.getDropdownSelectedPosition();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getSelectedTab() {
        return this.f9017k;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.f9012f.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab getTabAt(int i) {
        return (ActionBar.Tab) this.f9016j.get(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.f9016j.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        if (this.f9008b == null) {
            TypedValue typedValue = new TypedValue();
            this.f9007a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f9008b = new ContextThemeWrapper(this.f9007a, i);
            } else {
                this.f9008b = this.f9007a;
            }
        }
        return this.f9008b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.f9012f.getTitle();
    }

    /* renamed from: h */
    public final void m64574h() {
        if (this.f9030x) {
            this.f9030x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9010d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m64569m(false);
        }
    }

    public boolean hasIcon() {
        return this.f9012f.hasIcon();
    }

    public boolean hasLogo() {
        return this.f9012f.hasLogo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        if (!this.f9028v) {
            this.f9028v = true;
            m64569m(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (!this.f9029w) {
            this.f9029w = true;
            m64569m(true);
        }
    }

    /* renamed from: i */
    public final void m64573i(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f9010d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f9012f = m64575g(view.findViewById(R.id.action_bar));
        this.f9013g = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f9011e = actionBarContainer;
        DecorToolbar decorToolbar = this.f9012f;
        if (decorToolbar != null && this.f9013g != null && actionBarContainer != null) {
            this.f9007a = decorToolbar.getContext();
            if ((this.f9012f.getDisplayOptions() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f9019m = true;
            }
            ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(this.f9007a);
            if (!actionBarPolicy.enableHomeButtonByDefault() && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            setHomeButtonEnabled(z2);
            m64572j(actionBarPolicy.hasEmbeddedTabs());
            TypedArray obtainStyledAttributes = this.f9007a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
                setHideOnContentScrollEnabled(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                setElevation(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.f9010d.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int height = getHeight();
        if (this.f9031y && (height == 0 || getHideOffset() < height)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        DecorToolbar decorToolbar = this.f9012f;
        if (decorToolbar != null && decorToolbar.isTitleTruncated()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m64572j(boolean z) {
        boolean z2;
        boolean z3;
        this.f9025s = z;
        if (!z) {
            this.f9012f.setEmbeddedTabView(null);
            this.f9011e.setTabContainer(this.f9015i);
        } else {
            this.f9011e.setTabContainer(null);
            this.f9012f.setEmbeddedTabView(this.f9015i);
        }
        boolean z4 = true;
        if (getNavigationMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ScrollingTabContainerView scrollingTabContainerView = this.f9015i;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9010d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        DecorToolbar decorToolbar = this.f9012f;
        if (!this.f9025s && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        decorToolbar.setCollapsible(z3);
        this.f9010d.setHasNonEmbeddedTabs((this.f9025s || !z2) ? false : false);
    }

    /* renamed from: k */
    public final boolean m64571k() {
        return ViewCompat.isLaidOut(this.f9011e);
    }

    /* renamed from: l */
    public final void m64570l() {
        if (!this.f9030x) {
            this.f9030x = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9010d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m64569m(false);
        }
    }

    /* renamed from: m */
    public final void m64569m(boolean z) {
        if (m64580b(this.f9028v, this.f9029w, this.f9030x)) {
            if (!this.f9031y) {
                this.f9031y = true;
                doShow(z);
            }
        } else if (this.f9031y) {
            this.f9031y = false;
            doHide(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.Tab newTab() {
        return new TabImpl();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        m64572j(ActionBarPolicy.get(this.f9007a).hasEmbeddedTabs());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f9032z;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.cancel();
            this.f9032z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menu;
        int i2;
        ActionModeImpl actionModeImpl = this.f9020n;
        if (actionModeImpl == null || (menu = actionModeImpl.getMenu()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i) {
        this.f9026t = i;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        m64579c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.f9024r.remove(onMenuVisibilityListener);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.Tab tab) {
        removeTabAt(tab.getPosition());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i) {
        int i2;
        ActionBar.Tab tab;
        if (this.f9015i == null) {
            return;
        }
        TabImpl tabImpl = this.f9017k;
        if (tabImpl != null) {
            i2 = tabImpl.getPosition();
        } else {
            i2 = this.f9018l;
        }
        this.f9015i.removeTabAt(i);
        TabImpl tabImpl2 = (TabImpl) this.f9016j.remove(i);
        if (tabImpl2 != null) {
            tabImpl2.setPosition(-1);
        }
        int size = this.f9016j.size();
        for (int i3 = i; i3 < size; i3++) {
            ((TabImpl) this.f9016j.get(i3)).setPosition(i3);
        }
        if (i2 == i) {
            if (this.f9016j.isEmpty()) {
                tab = null;
            } else {
                tab = (ActionBar.Tab) this.f9016j.get(Math.max(0, i - 1));
            }
            selectTab(tab);
        }
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f9012f.getViewGroup();
        if (viewGroup != null && !viewGroup.hasFocus()) {
            viewGroup.requestFocus();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.Tab tab) {
        FragmentTransaction fragmentTransaction;
        int i = -1;
        if (getNavigationMode() != 2) {
            if (tab != null) {
                i = tab.getPosition();
            }
            this.f9018l = i;
            return;
        }
        if ((this.f9009c instanceof FragmentActivity) && !this.f9012f.getViewGroup().isInEditMode()) {
            fragmentTransaction = ((FragmentActivity) this.f9009c).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        } else {
            fragmentTransaction = null;
        }
        TabImpl tabImpl = this.f9017k;
        if (tabImpl == tab) {
            if (tabImpl != null) {
                tabImpl.getCallback().onTabReselected(this.f9017k, fragmentTransaction);
                this.f9015i.animateToTab(tab.getPosition());
            }
        } else {
            ScrollingTabContainerView scrollingTabContainerView = this.f9015i;
            if (tab != null) {
                i = tab.getPosition();
            }
            scrollingTabContainerView.setTabSelected(i);
            TabImpl tabImpl2 = this.f9017k;
            if (tabImpl2 != null) {
                tabImpl2.getCallback().onTabUnselected(this.f9017k, fragmentTransaction);
            }
            TabImpl tabImpl3 = (TabImpl) tab;
            this.f9017k = tabImpl3;
            if (tabImpl3 != null) {
                tabImpl3.getCallback().onTabSelected(this.f9017k, fragmentTransaction);
            }
        }
        if (fragmentTransaction != null && !fragmentTransaction.isEmpty()) {
            fragmentTransaction.commit();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.f9011e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, this.f9012f.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (!this.f9019m) {
            setDisplayHomeAsUpEnabled(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.f9019m = true;
        }
        this.f9012f.setDisplayOptions(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        int i;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        ViewCompat.setElevation(this.f9011e, f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int i) {
        if (i != 0 && !this.f9010d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f9010d.setActionBarHideOffset(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.f9010d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f9003B = z;
        this.f9010d.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f9012f.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f9012f.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.f9012f.setHomeButtonEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i) {
        this.f9012f.setIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.OnNavigationListener onNavigationListener) {
        this.f9012f.setDropdownParams(spinnerAdapter, new C2116b(onNavigationListener));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i) {
        this.f9012f.setLogo(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i) {
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.f9012f.getNavigationMode();
        if (navigationMode == 2) {
            this.f9018l = getSelectedNavigationIndex();
            selectTab(null);
            this.f9015i.setVisibility(8);
        }
        if (navigationMode != i && !this.f9025s && (actionBarOverlayLayout = this.f9010d) != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
        this.f9012f.setNavigationMode(i);
        boolean z2 = false;
        if (i == 2) {
            m64576f();
            this.f9015i.setVisibility(0);
            int i2 = this.f9018l;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this.f9018l = -1;
            }
        }
        DecorToolbar decorToolbar = this.f9012f;
        if (i == 2 && !this.f9025s) {
            z = true;
        } else {
            z = false;
        }
        decorToolbar.setCollapsible(z);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9010d;
        if (i == 2 && !this.f9025s) {
            z2 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i) {
        int navigationMode = this.f9012f.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode == 2) {
                selectTab((ActionBar.Tab) this.f9016j.get(i));
                return;
            }
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f9012f.setDropdownSelectedPosition(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f9002A = z;
        if (!z && (viewPropertyAnimatorCompatSet = this.f9032z) != null) {
            viewPropertyAnimatorCompatSet.cancel();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.f9011e.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i) {
        setSubtitle(this.f9007a.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i) {
        setTitle(this.f9007a.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence) {
        this.f9012f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        if (this.f9028v) {
            this.f9028v = false;
            m64569m(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.f9029w) {
            this.f9029w = false;
            m64569m(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.f9020n;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.f9010d.setHideOnContentScrollEnabled(false);
        this.f9013g.killMode();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f9013g.getContext(), callback);
        if (actionModeImpl2.dispatchOnCreate()) {
            this.f9020n = actionModeImpl2;
            actionModeImpl2.invalidate();
            this.f9013g.initForMode(actionModeImpl2);
            animateToMode(true);
            return actionModeImpl2;
        }
        return null;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i) {
        addTab(tab, i, this.f9016j.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int i) {
        this.f9012f.setNavigationContentDescription(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int i) {
        this.f9012f.setNavigationIcon(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.f9012f.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.f9012f.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.f9012f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.f9012f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, boolean z) {
        m64576f();
        this.f9015i.addTab(tab, z);
        m64577e(tab, this.f9016j.size());
        if (z) {
            selectTab(tab);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i, int i2) {
        int displayOptions = this.f9012f.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.f9019m = true;
        }
        this.f9012f.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        this.f9012f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f9012f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        m64576f();
        this.f9015i.addTab(tab, i, z);
        m64577e(tab, i);
        if (z) {
            selectTab(tab);
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        m64573i(dialog.getWindow().getDecorView());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public WindowDecorActionBar(View view) {
        m64573i(view);
    }
}
