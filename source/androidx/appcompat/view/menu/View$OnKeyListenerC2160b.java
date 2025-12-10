package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC2160b extends AbstractC20111gs0 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {

    /* renamed from: v */
    public static final int f9424v = R.layout.abc_popup_menu_item_layout;

    /* renamed from: b */
    public final Context f9425b;

    /* renamed from: c */
    public final MenuBuilder f9426c;

    /* renamed from: d */
    public final MenuAdapter f9427d;

    /* renamed from: e */
    public final boolean f9428e;

    /* renamed from: f */
    public final int f9429f;

    /* renamed from: g */
    public final int f9430g;

    /* renamed from: h */
    public final int f9431h;

    /* renamed from: i */
    public final MenuPopupWindow f9432i;

    /* renamed from: l */
    public PopupWindow.OnDismissListener f9435l;

    /* renamed from: m */
    public View f9436m;

    /* renamed from: n */
    public View f9437n;

    /* renamed from: o */
    public MenuPresenter.Callback f9438o;

    /* renamed from: p */
    public ViewTreeObserver f9439p;

    /* renamed from: q */
    public boolean f9440q;

    /* renamed from: r */
    public boolean f9441r;

    /* renamed from: s */
    public int f9442s;

    /* renamed from: u */
    public boolean f9444u;

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f9433j = new ViewTreeObserver$OnGlobalLayoutListenerC2161a();

    /* renamed from: k */
    public final View.OnAttachStateChangeListener f9434k = new View$OnAttachStateChangeListenerC2162b();

    /* renamed from: t */
    public int f9443t = 0;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2161a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2161a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC2160b.this.isShowing() && !View$OnKeyListenerC2160b.this.f9432i.isModal()) {
                View view = View$OnKeyListenerC2160b.this.f9437n;
                if (view != null && view.isShown()) {
                    View$OnKeyListenerC2160b.this.f9432i.show();
                } else {
                    View$OnKeyListenerC2160b.this.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC2162b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC2162b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC2160b.this.f9439p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC2160b.this.f9439p = view.getViewTreeObserver();
                }
                View$OnKeyListenerC2160b view$OnKeyListenerC2160b = View$OnKeyListenerC2160b.this;
                view$OnKeyListenerC2160b.f9439p.removeGlobalOnLayoutListener(view$OnKeyListenerC2160b.f9433j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC2160b(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f9425b = context;
        this.f9426c = menuBuilder;
        this.f9428e = z;
        this.f9427d = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, f9424v);
        this.f9430g = i;
        this.f9431h = i2;
        Resources resources = context.getResources();
        this.f9429f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9436m = view;
        this.f9432i = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: a */
    public void mo30977a(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if (isShowing()) {
            this.f9432i.dismiss();
        }
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: e */
    public void mo30973e(View view) {
        this.f9436m = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: g */
    public void mo30971g(boolean z) {
        this.f9427d.setForceShowIcon(z);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        return this.f9432i.getListView();
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: h */
    public void mo30970h(int i) {
        this.f9443t = i;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: i */
    public void mo30969i(int i) {
        this.f9432i.setHorizontalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        if (!this.f9440q && this.f9432i.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: j */
    public void mo30968j(PopupWindow.OnDismissListener onDismissListener) {
        this.f9435l = onDismissListener;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: k */
    public void mo30967k(boolean z) {
        this.f9444u = z;
    }

    @Override // p000.AbstractC20111gs0
    /* renamed from: l */
    public void mo30966l(int i) {
        this.f9432i.setVerticalOffset(i);
    }

    /* renamed from: o */
    public final boolean m64415o() {
        View view;
        boolean z;
        if (isShowing()) {
            return true;
        }
        if (this.f9440q || (view = this.f9436m) == null) {
            return false;
        }
        this.f9437n = view;
        this.f9432i.setOnDismissListener(this);
        this.f9432i.setOnItemClickListener(this);
        this.f9432i.setModal(true);
        View view2 = this.f9437n;
        if (this.f9439p == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9439p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9433j);
        }
        view2.addOnAttachStateChangeListener(this.f9434k);
        this.f9432i.setAnchorView(view2);
        this.f9432i.setDropDownGravity(this.f9443t);
        if (!this.f9441r) {
            this.f9442s = AbstractC20111gs0.m30974d(this.f9427d, null, this.f9425b, this.f9429f);
            this.f9441r = true;
        }
        this.f9432i.setContentWidth(this.f9442s);
        this.f9432i.setInputMethodMode(2);
        this.f9432i.setEpicenterBounds(m30975c());
        this.f9432i.show();
        ListView listView = this.f9432i.getListView();
        listView.setOnKeyListener(this);
        if (this.f9444u && this.f9426c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f9425b).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f9426c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f9432i.setAdapter(this.f9427d);
        this.f9432i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f9426c) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f9438o;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f9440q = true;
        this.f9426c.close();
        ViewTreeObserver viewTreeObserver = this.f9439p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9439p = this.f9437n.getViewTreeObserver();
            }
            this.f9439p.removeGlobalOnLayoutListener(this.f9433j);
            this.f9439p = null;
        }
        this.f9437n.removeOnAttachStateChangeListener(this.f9434k);
        PopupWindow.OnDismissListener onDismissListener = this.f9435l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f9425b, subMenuBuilder, this.f9437n, this.f9428e, this.f9430g, this.f9431h);
            menuPopupHelper.setPresenterCallback(this.f9438o);
            menuPopupHelper.setForceShowIcon(AbstractC20111gs0.m30965m(subMenuBuilder));
            menuPopupHelper.setOnDismissListener(this.f9435l);
            this.f9435l = null;
            this.f9426c.close(false);
            int horizontalOffset = this.f9432i.getHorizontalOffset();
            int verticalOffset = this.f9432i.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f9443t, ViewCompat.getLayoutDirection(this.f9436m)) & 7) == 5) {
                horizontalOffset += this.f9436m.getWidth();
            }
            if (menuPopupHelper.tryShow(horizontalOffset, verticalOffset)) {
                MenuPresenter.Callback callback = this.f9438o;
                if (callback != null) {
                    callback.onOpenSubMenu(subMenuBuilder);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f9438o = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if (m64415o()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        this.f9441r = false;
        MenuAdapter menuAdapter = this.f9427d;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
