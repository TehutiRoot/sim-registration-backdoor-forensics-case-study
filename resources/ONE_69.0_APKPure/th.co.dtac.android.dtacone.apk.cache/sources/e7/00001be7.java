package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CascadingMenuPopup extends AbstractC21202ms0 implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    public static final int f9347B = R.layout.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public boolean f9348A;

    /* renamed from: b */
    public final Context f9349b;

    /* renamed from: c */
    public final int f9350c;

    /* renamed from: d */
    public final int f9351d;

    /* renamed from: e */
    public final int f9352e;

    /* renamed from: f */
    public final boolean f9353f;

    /* renamed from: g */
    public final Handler f9354g;

    /* renamed from: o */
    public View f9362o;

    /* renamed from: p */
    public View f9363p;

    /* renamed from: r */
    public boolean f9365r;

    /* renamed from: s */
    public boolean f9366s;

    /* renamed from: t */
    public int f9367t;

    /* renamed from: u */
    public int f9368u;

    /* renamed from: w */
    public boolean f9370w;

    /* renamed from: x */
    public MenuPresenter.Callback f9371x;

    /* renamed from: y */
    public ViewTreeObserver f9372y;

    /* renamed from: z */
    public PopupWindow.OnDismissListener f9373z;

    /* renamed from: h */
    public final List f9355h = new ArrayList();

    /* renamed from: i */
    public final List f9356i = new ArrayList();

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f9357j = new ViewTreeObserver$OnGlobalLayoutListenerC2127a();

    /* renamed from: k */
    public final View.OnAttachStateChangeListener f9358k = new View$OnAttachStateChangeListenerC2128b();

    /* renamed from: l */
    public final MenuItemHoverListener f9359l = new C2129c();

    /* renamed from: m */
    public int f9360m = 0;

    /* renamed from: n */
    public int f9361n = 0;

    /* renamed from: v */
    public boolean f9369v = false;

    /* renamed from: q */
    public int f9364q = m64411s();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HorizPosition {
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2127a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2127a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.isShowing() && CascadingMenuPopup.this.f9356i.size() > 0 && !((C2131d) CascadingMenuPopup.this.f9356i.get(0)).f9381a.isModal()) {
                View view = CascadingMenuPopup.this.f9363p;
                if (view != null && view.isShown()) {
                    for (C2131d c2131d : CascadingMenuPopup.this.f9356i) {
                        c2131d.f9381a.show();
                    }
                    return;
                }
                CascadingMenuPopup.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC2128b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC2128b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f9372y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f9372y = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f9372y.removeGlobalOnLayoutListener(cascadingMenuPopup.f9357j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$c */
    /* loaded from: classes.dex */
    public class C2129c implements MenuItemHoverListener {

        /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$c$a */
        /* loaded from: classes.dex */
        public class RunnableC2130a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2131d f9377a;

            /* renamed from: b */
            public final /* synthetic */ MenuItem f9378b;

            /* renamed from: c */
            public final /* synthetic */ MenuBuilder f9379c;

            public RunnableC2130a(C2131d c2131d, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f9377a = c2131d;
                this.f9378b = menuItem;
                this.f9379c = menuBuilder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2131d c2131d = this.f9377a;
                if (c2131d != null) {
                    CascadingMenuPopup.this.f9348A = true;
                    c2131d.f9382b.close(false);
                    CascadingMenuPopup.this.f9348A = false;
                }
                if (this.f9378b.isEnabled() && this.f9378b.hasSubMenu()) {
                    this.f9379c.performItemAction(this.f9378b, 4);
                }
            }
        }

        public C2129c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem) {
            C2131d c2131d = null;
            CascadingMenuPopup.this.f9354g.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f9356i.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (menuBuilder == ((C2131d) CascadingMenuPopup.this.f9356i.get(i)).f9382b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < CascadingMenuPopup.this.f9356i.size()) {
                c2131d = (C2131d) CascadingMenuPopup.this.f9356i.get(i2);
            }
            CascadingMenuPopup.this.f9354g.postAtTime(new RunnableC2130a(c2131d, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f9354g.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$d */
    /* loaded from: classes.dex */
    public static class C2131d {

        /* renamed from: a */
        public final MenuPopupWindow f9381a;

        /* renamed from: b */
        public final MenuBuilder f9382b;

        /* renamed from: c */
        public final int f9383c;

        public C2131d(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f9381a = menuPopupWindow;
            this.f9382b = menuBuilder;
            this.f9383c = i;
        }

        /* renamed from: a */
        public ListView m64408a() {
            return this.f9381a.getListView();
        }
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.f9349b = context;
        this.f9362o = view;
        this.f9351d = i;
        this.f9352e = i2;
        this.f9353f = z;
        Resources resources = context.getResources();
        this.f9350c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9354g = new Handler();
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: a */
    public void mo26504a(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f9349b);
        if (isShowing()) {
            m64409u(menuBuilder);
        } else {
            this.f9355h.add(menuBuilder);
        }
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: b */
    public boolean mo26503b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f9356i.size();
        if (size > 0) {
            C2131d[] c2131dArr = (C2131d[]) this.f9356i.toArray(new C2131d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C2131d c2131d = c2131dArr[i];
                if (c2131d.f9381a.isShowing()) {
                    c2131d.f9381a.dismiss();
                }
            }
        }
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: e */
    public void mo26500e(View view) {
        if (this.f9362o != view) {
            this.f9362o = view;
            this.f9361n = GravityCompat.getAbsoluteGravity(this.f9360m, ViewCompat.getLayoutDirection(view));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: g */
    public void mo26498g(boolean z) {
        this.f9369v = z;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        if (this.f9356i.isEmpty()) {
            return null;
        }
        List list = this.f9356i;
        return ((C2131d) list.get(list.size() - 1)).m64408a();
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: h */
    public void mo26497h(int i) {
        if (this.f9360m != i) {
            this.f9360m = i;
            this.f9361n = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.f9362o));
        }
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: i */
    public void mo26496i(int i) {
        this.f9365r = true;
        this.f9367t = i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        if (this.f9356i.size() <= 0 || !((C2131d) this.f9356i.get(0)).f9381a.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: j */
    public void mo26495j(PopupWindow.OnDismissListener onDismissListener) {
        this.f9373z = onDismissListener;
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: k */
    public void mo26494k(boolean z) {
        this.f9370w = z;
    }

    @Override // p000.AbstractC21202ms0
    /* renamed from: l */
    public void mo26493l(int i) {
        this.f9366s = true;
        this.f9368u = i;
    }

    /* renamed from: o */
    public final MenuPopupWindow m64415o() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f9349b, null, this.f9351d, this.f9352e);
        menuPopupWindow.setHoverListener(this.f9359l);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f9362o);
        menuPopupWindow.setDropDownGravity(this.f9361n);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int m64414p = m64414p(menuBuilder);
        if (m64414p < 0) {
            return;
        }
        int i = m64414p + 1;
        if (i < this.f9356i.size()) {
            ((C2131d) this.f9356i.get(i)).f9382b.close(false);
        }
        C2131d c2131d = (C2131d) this.f9356i.remove(m64414p);
        c2131d.f9382b.removeMenuPresenter(this);
        if (this.f9348A) {
            c2131d.f9381a.setExitTransition(null);
            c2131d.f9381a.setAnimationStyle(0);
        }
        c2131d.f9381a.dismiss();
        int size = this.f9356i.size();
        if (size > 0) {
            this.f9364q = ((C2131d) this.f9356i.get(size - 1)).f9383c;
        } else {
            this.f9364q = m64411s();
        }
        if (size == 0) {
            dismiss();
            MenuPresenter.Callback callback = this.f9371x;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, true);
            }
            ViewTreeObserver viewTreeObserver = this.f9372y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f9372y.removeGlobalOnLayoutListener(this.f9357j);
                }
                this.f9372y = null;
            }
            this.f9363p.removeOnAttachStateChangeListener(this.f9358k);
            this.f9373z.onDismiss();
        } else if (z) {
            ((C2131d) this.f9356i.get(0)).f9382b.close(false);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C2131d c2131d;
        int size = this.f9356i.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c2131d = (C2131d) this.f9356i.get(i);
                if (!c2131d.f9381a.isShowing()) {
                    break;
                }
                i++;
            } else {
                c2131d = null;
                break;
            }
        }
        if (c2131d != null) {
            c2131d.f9382b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        for (C2131d c2131d : this.f9356i) {
            if (subMenuBuilder == c2131d.f9382b) {
                c2131d.m64408a().requestFocus();
                return true;
            }
        }
        if (subMenuBuilder.hasVisibleItems()) {
            mo26504a(subMenuBuilder);
            MenuPresenter.Callback callback = this.f9371x;
            if (callback != null) {
                callback.onOpenSubMenu(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int m64414p(MenuBuilder menuBuilder) {
        int size = this.f9356i.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == ((C2131d) this.f9356i.get(i)).f9382b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final MenuItem m64413q(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: r */
    public final View m64412r(C2131d c2131d, MenuBuilder menuBuilder) {
        MenuAdapter menuAdapter;
        int i;
        int firstVisiblePosition;
        MenuItem m64413q = m64413q(c2131d.f9382b, menuBuilder);
        if (m64413q == null) {
            return null;
        }
        ListView m64408a = c2131d.m64408a();
        ListAdapter adapter = m64408a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            i = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 < count) {
                if (m64413q == menuAdapter.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - m64408a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m64408a.getChildCount()) {
            return null;
        }
        return m64408a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: s */
    public final int m64411s() {
        if (ViewCompat.getLayoutDirection(this.f9362o) != 1) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f9371x = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z;
        if (isShowing()) {
            return;
        }
        for (MenuBuilder menuBuilder : this.f9355h) {
            m64409u(menuBuilder);
        }
        this.f9355h.clear();
        View view = this.f9362o;
        this.f9363p = view;
        if (view != null) {
            if (this.f9372y == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9372y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9357j);
            }
            this.f9363p.addOnAttachStateChangeListener(this.f9358k);
        }
    }

    /* renamed from: t */
    public final int m64410t(int i) {
        List list = this.f9356i;
        ListView m64408a = ((C2131d) list.get(list.size() - 1)).m64408a();
        int[] iArr = new int[2];
        m64408a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f9363p.getWindowVisibleDisplayFrame(rect);
        if (this.f9364q == 1) {
            if (iArr[0] + m64408a.getWidth() + i <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: u */
    public final void m64409u(MenuBuilder menuBuilder) {
        C2131d c2131d;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f9349b);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, from, this.f9353f, f9347B);
        if (!isShowing() && this.f9369v) {
            menuAdapter.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter.setForceShowIcon(AbstractC21202ms0.m26492m(menuBuilder));
        }
        int m26501d = AbstractC21202ms0.m26501d(menuAdapter, null, this.f9349b, this.f9350c);
        MenuPopupWindow m64415o = m64415o();
        m64415o.setAdapter(menuAdapter);
        m64415o.setContentWidth(m26501d);
        m64415o.setDropDownGravity(this.f9361n);
        if (this.f9356i.size() > 0) {
            List list = this.f9356i;
            c2131d = (C2131d) list.get(list.size() - 1);
            view = m64412r(c2131d, menuBuilder);
        } else {
            c2131d = null;
            view = null;
        }
        if (view != null) {
            m64415o.setTouchModal(false);
            m64415o.setEnterTransition(null);
            int m64410t = m64410t(m26501d);
            if (m64410t == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f9364q = m64410t;
            if (Build.VERSION.SDK_INT >= 26) {
                m64415o.setAnchorView(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f9362o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f9361n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f9362o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f9361n & 5) == 5) {
                if (!z) {
                    m26501d = view.getWidth();
                    i3 = i - m26501d;
                }
                i3 = i + m26501d;
            } else {
                if (z) {
                    m26501d = view.getWidth();
                    i3 = i + m26501d;
                }
                i3 = i - m26501d;
            }
            m64415o.setHorizontalOffset(i3);
            m64415o.setOverlapAnchor(true);
            m64415o.setVerticalOffset(i2);
        } else {
            if (this.f9365r) {
                m64415o.setHorizontalOffset(this.f9367t);
            }
            if (this.f9366s) {
                m64415o.setVerticalOffset(this.f9368u);
            }
            m64415o.setEpicenterBounds(m26502c());
        }
        this.f9356i.add(new C2131d(m64415o, menuBuilder, this.f9364q));
        m64415o.show();
        ListView listView = m64415o.getListView();
        listView.setOnKeyListener(this);
        if (c2131d == null && this.f9370w && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuBuilder.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            m64415o.show();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        for (C2131d c2131d : this.f9356i) {
            AbstractC21202ms0.m26491n(c2131d.m64408a().getAdapter()).notifyDataSetChanged();
        }
    }
}