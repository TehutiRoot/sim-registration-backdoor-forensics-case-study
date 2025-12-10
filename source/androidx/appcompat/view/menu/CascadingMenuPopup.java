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
public final class CascadingMenuPopup extends AbstractC20111gs0 implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    public static final int f9259B = R.layout.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public boolean f9260A;

    /* renamed from: b */
    public final Context f9261b;

    /* renamed from: c */
    public final int f9262c;

    /* renamed from: d */
    public final int f9263d;

    /* renamed from: e */
    public final int f9264e;

    /* renamed from: f */
    public final boolean f9265f;

    /* renamed from: g */
    public final Handler f9266g;

    /* renamed from: o */
    public View f9274o;

    /* renamed from: p */
    public View f9275p;

    /* renamed from: r */
    public boolean f9277r;

    /* renamed from: s */
    public boolean f9278s;

    /* renamed from: t */
    public int f9279t;

    /* renamed from: u */
    public int f9280u;

    /* renamed from: w */
    public boolean f9282w;

    /* renamed from: x */
    public MenuPresenter.Callback f9283x;

    /* renamed from: y */
    public ViewTreeObserver f9284y;

    /* renamed from: z */
    public PopupWindow.OnDismissListener f9285z;

    /* renamed from: h */
    public final List f9267h = new ArrayList();

    /* renamed from: i */
    public final List f9268i = new ArrayList();

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f9269j = new ViewTreeObserver$OnGlobalLayoutListenerC2145a();

    /* renamed from: k */
    public final View.OnAttachStateChangeListener f9270k = new View$OnAttachStateChangeListenerC2146b();

    /* renamed from: l */
    public final MenuItemHoverListener f9271l = new C2147c();

    /* renamed from: m */
    public int f9272m = 0;

    /* renamed from: n */
    public int f9273n = 0;

    /* renamed from: v */
    public boolean f9281v = false;

    /* renamed from: q */
    public int f9276q = m64460s();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HorizPosition {
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2145a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2145a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CascadingMenuPopup.this.isShowing() && CascadingMenuPopup.this.f9268i.size() > 0 && !((C2149d) CascadingMenuPopup.this.f9268i.get(0)).f9293a.isModal()) {
                View view = CascadingMenuPopup.this.f9275p;
                if (view != null && view.isShown()) {
                    for (C2149d c2149d : CascadingMenuPopup.this.f9268i) {
                        c2149d.f9293a.show();
                    }
                    return;
                }
                CascadingMenuPopup.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC2146b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC2146b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f9284y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f9284y = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f9284y.removeGlobalOnLayoutListener(cascadingMenuPopup.f9269j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$c */
    /* loaded from: classes.dex */
    public class C2147c implements MenuItemHoverListener {

        /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$c$a */
        /* loaded from: classes.dex */
        public class RunnableC2148a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2149d f9289a;

            /* renamed from: b */
            public final /* synthetic */ MenuItem f9290b;

            /* renamed from: c */
            public final /* synthetic */ MenuBuilder f9291c;

            public RunnableC2148a(C2149d c2149d, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f9289a = c2149d;
                this.f9290b = menuItem;
                this.f9291c = menuBuilder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2149d c2149d = this.f9289a;
                if (c2149d != null) {
                    CascadingMenuPopup.this.f9260A = true;
                    c2149d.f9294b.close(false);
                    CascadingMenuPopup.this.f9260A = false;
                }
                if (this.f9290b.isEnabled() && this.f9290b.hasSubMenu()) {
                    this.f9291c.performItemAction(this.f9290b, 4);
                }
            }
        }

        public C2147c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem) {
            C2149d c2149d = null;
            CascadingMenuPopup.this.f9266g.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f9268i.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (menuBuilder == ((C2149d) CascadingMenuPopup.this.f9268i.get(i)).f9294b) {
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
            if (i2 < CascadingMenuPopup.this.f9268i.size()) {
                c2149d = (C2149d) CascadingMenuPopup.this.f9268i.get(i2);
            }
            CascadingMenuPopup.this.f9266g.postAtTime(new RunnableC2148a(c2149d, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f9266g.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$d */
    /* loaded from: classes.dex */
    public static class C2149d {

        /* renamed from: a */
        public final MenuPopupWindow f9293a;

        /* renamed from: b */
        public final MenuBuilder f9294b;

        /* renamed from: c */
        public final int f9295c;

        public C2149d(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f9293a = menuPopupWindow;
            this.f9294b = menuBuilder;
            this.f9295c = i;
        }

        /* renamed from: a */
        public ListView m64457a() {
            return this.f9293a.getListView();
        }
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.f9261b = context;
        this.f9274o = view;
        this.f9263d = i;
        this.f9264e = i2;
        this.f9265f = z;
        Resources resources = context.getResources();
        this.f9262c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9266g = new Handler();
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: a */
    public void mo30977a(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f9261b);
        if (isShowing()) {
            m64458u(menuBuilder);
        } else {
            this.f9267h.add(menuBuilder);
        }
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: b */
    public boolean mo30976b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f9268i.size();
        if (size > 0) {
            C2149d[] c2149dArr = (C2149d[]) this.f9268i.toArray(new C2149d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C2149d c2149d = c2149dArr[i];
                if (c2149d.f9293a.isShowing()) {
                    c2149d.f9293a.dismiss();
                }
            }
        }
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: e */
    public void mo30973e(View view) {
        if (this.f9274o != view) {
            this.f9274o = view;
            this.f9273n = GravityCompat.getAbsoluteGravity(this.f9272m, ViewCompat.getLayoutDirection(view));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: g */
    public void mo30971g(boolean z) {
        this.f9281v = z;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        if (this.f9268i.isEmpty()) {
            return null;
        }
        List list = this.f9268i;
        return ((C2149d) list.get(list.size() - 1)).m64457a();
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: h */
    public void mo30970h(int i) {
        if (this.f9272m != i) {
            this.f9272m = i;
            this.f9273n = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.f9274o));
        }
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: i */
    public void mo30969i(int i) {
        this.f9277r = true;
        this.f9279t = i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        if (this.f9268i.size() <= 0 || !((C2149d) this.f9268i.get(0)).f9293a.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: j */
    public void mo30968j(PopupWindow.OnDismissListener onDismissListener) {
        this.f9285z = onDismissListener;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: k */
    public void mo30967k(boolean z) {
        this.f9282w = z;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: l */
    public void mo30966l(int i) {
        this.f9278s = true;
        this.f9280u = i;
    }

    /* renamed from: o */
    public final MenuPopupWindow m64464o() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f9261b, null, this.f9263d, this.f9264e);
        menuPopupWindow.setHoverListener(this.f9271l);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f9274o);
        menuPopupWindow.setDropDownGravity(this.f9273n);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int m64463p = m64463p(menuBuilder);
        if (m64463p < 0) {
            return;
        }
        int i = m64463p + 1;
        if (i < this.f9268i.size()) {
            ((C2149d) this.f9268i.get(i)).f9294b.close(false);
        }
        C2149d c2149d = (C2149d) this.f9268i.remove(m64463p);
        c2149d.f9294b.removeMenuPresenter(this);
        if (this.f9260A) {
            c2149d.f9293a.setExitTransition(null);
            c2149d.f9293a.setAnimationStyle(0);
        }
        c2149d.f9293a.dismiss();
        int size = this.f9268i.size();
        if (size > 0) {
            this.f9276q = ((C2149d) this.f9268i.get(size - 1)).f9295c;
        } else {
            this.f9276q = m64460s();
        }
        if (size == 0) {
            dismiss();
            MenuPresenter.Callback callback = this.f9283x;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, true);
            }
            ViewTreeObserver viewTreeObserver = this.f9284y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f9284y.removeGlobalOnLayoutListener(this.f9269j);
                }
                this.f9284y = null;
            }
            this.f9275p.removeOnAttachStateChangeListener(this.f9270k);
            this.f9285z.onDismiss();
        } else if (z) {
            ((C2149d) this.f9268i.get(0)).f9294b.close(false);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C2149d c2149d;
        int size = this.f9268i.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c2149d = (C2149d) this.f9268i.get(i);
                if (!c2149d.f9293a.isShowing()) {
                    break;
                }
                i++;
            } else {
                c2149d = null;
                break;
            }
        }
        if (c2149d != null) {
            c2149d.f9294b.close(false);
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
        for (C2149d c2149d : this.f9268i) {
            if (subMenuBuilder == c2149d.f9294b) {
                c2149d.m64457a().requestFocus();
                return true;
            }
        }
        if (subMenuBuilder.hasVisibleItems()) {
            mo30977a(subMenuBuilder);
            MenuPresenter.Callback callback = this.f9283x;
            if (callback != null) {
                callback.onOpenSubMenu(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int m64463p(MenuBuilder menuBuilder) {
        int size = this.f9268i.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == ((C2149d) this.f9268i.get(i)).f9294b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final MenuItem m64462q(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
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
    public final View m64461r(C2149d c2149d, MenuBuilder menuBuilder) {
        MenuAdapter menuAdapter;
        int i;
        int firstVisiblePosition;
        MenuItem m64462q = m64462q(c2149d.f9294b, menuBuilder);
        if (m64462q == null) {
            return null;
        }
        ListView m64457a = c2149d.m64457a();
        ListAdapter adapter = m64457a.getAdapter();
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
                if (m64462q == menuAdapter.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - m64457a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m64457a.getChildCount()) {
            return null;
        }
        return m64457a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: s */
    public final int m64460s() {
        if (ViewCompat.getLayoutDirection(this.f9274o) != 1) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f9283x = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z;
        if (isShowing()) {
            return;
        }
        for (MenuBuilder menuBuilder : this.f9267h) {
            m64458u(menuBuilder);
        }
        this.f9267h.clear();
        View view = this.f9274o;
        this.f9275p = view;
        if (view != null) {
            if (this.f9284y == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9284y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9269j);
            }
            this.f9275p.addOnAttachStateChangeListener(this.f9270k);
        }
    }

    /* renamed from: t */
    public final int m64459t(int i) {
        List list = this.f9268i;
        ListView m64457a = ((C2149d) list.get(list.size() - 1)).m64457a();
        int[] iArr = new int[2];
        m64457a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f9275p.getWindowVisibleDisplayFrame(rect);
        if (this.f9276q == 1) {
            if (iArr[0] + m64457a.getWidth() + i <= rect.right) {
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
    public final void m64458u(MenuBuilder menuBuilder) {
        C2149d c2149d;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f9261b);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, from, this.f9265f, f9259B);
        if (!isShowing() && this.f9281v) {
            menuAdapter.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter.setForceShowIcon(AbstractC20111gs0.m30965m(menuBuilder));
        }
        int m30974d = AbstractC20111gs0.m30974d(menuAdapter, null, this.f9261b, this.f9262c);
        MenuPopupWindow m64464o = m64464o();
        m64464o.setAdapter(menuAdapter);
        m64464o.setContentWidth(m30974d);
        m64464o.setDropDownGravity(this.f9273n);
        if (this.f9268i.size() > 0) {
            List list = this.f9268i;
            c2149d = (C2149d) list.get(list.size() - 1);
            view = m64461r(c2149d, menuBuilder);
        } else {
            c2149d = null;
            view = null;
        }
        if (view != null) {
            m64464o.setTouchModal(false);
            m64464o.setEnterTransition(null);
            int m64459t = m64459t(m30974d);
            if (m64459t == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f9276q = m64459t;
            if (Build.VERSION.SDK_INT >= 26) {
                m64464o.setAnchorView(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f9274o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f9273n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f9274o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f9273n & 5) == 5) {
                if (!z) {
                    m30974d = view.getWidth();
                    i3 = i - m30974d;
                }
                i3 = i + m30974d;
            } else {
                if (z) {
                    m30974d = view.getWidth();
                    i3 = i + m30974d;
                }
                i3 = i - m30974d;
            }
            m64464o.setHorizontalOffset(i3);
            m64464o.setOverlapAnchor(true);
            m64464o.setVerticalOffset(i2);
        } else {
            if (this.f9277r) {
                m64464o.setHorizontalOffset(this.f9279t);
            }
            if (this.f9278s) {
                m64464o.setVerticalOffset(this.f9280u);
            }
            m64464o.setEpicenterBounds(m30975c());
        }
        this.f9268i.add(new C2149d(m64464o, menuBuilder, this.f9276q));
        m64464o.show();
        ListView listView = m64464o.getListView();
        listView.setOnKeyListener(this);
        if (c2149d == null && this.f9282w && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuBuilder.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            m64464o.show();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        for (C2149d c2149d : this.f9268i) {
            AbstractC20111gs0.m30964n(c2149d.m64457a().getAdapter()).notifyDataSetChanged();
        }
    }
}
