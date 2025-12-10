package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import androidx.core.view.GravityCompat;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public class C2261a extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {

    /* renamed from: e */
    public C2265d f10039e;

    /* renamed from: f */
    public Drawable f10040f;

    /* renamed from: g */
    public boolean f10041g;

    /* renamed from: h */
    public boolean f10042h;

    /* renamed from: i */
    public boolean f10043i;

    /* renamed from: j */
    public int f10044j;

    /* renamed from: k */
    public int f10045k;

    /* renamed from: l */
    public int f10046l;

    /* renamed from: m */
    public boolean f10047m;

    /* renamed from: n */
    public boolean f10048n;

    /* renamed from: o */
    public boolean f10049o;

    /* renamed from: p */
    public boolean f10050p;

    /* renamed from: q */
    public int f10051q;

    /* renamed from: r */
    public final SparseBooleanArray f10052r;

    /* renamed from: s */
    public C2267e f10053s;

    /* renamed from: t */
    public C2262a f10054t;

    /* renamed from: u */
    public RunnableC2264c f10055u;

    /* renamed from: v */
    public C2263b f10056v;

    /* renamed from: w */
    public final C2268f f10057w;

    /* renamed from: x */
    public int f10058x;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C2262a extends MenuPopupHelper {
        public C2262a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.actionOverflowMenuStyle);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                View view2 = C2261a.this.f10039e;
                setAnchorView(view2 == null ? (View) ((BaseMenuPresenter) C2261a.this).mMenuView : view2);
            }
            setPresenterCallback(C2261a.this.f10057w);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
            C2261a c2261a = C2261a.this;
            c2261a.f10054t = null;
            c2261a.f10058x = 0;
            super.onDismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    /* loaded from: classes.dex */
    public class C2263b extends ActionMenuItemView.PopupCallback {
        public C2263b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public ShowableListMenu getPopup() {
            C2262a c2262a = C2261a.this.f10054t;
            if (c2262a != null) {
                return c2262a.getPopup();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$c */
    /* loaded from: classes.dex */
    public class RunnableC2264c implements Runnable {

        /* renamed from: a */
        public C2267e f10061a;

        public RunnableC2264c(C2267e c2267e) {
            this.f10061a = c2267e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((BaseMenuPresenter) C2261a.this).mMenu != null) {
                ((BaseMenuPresenter) C2261a.this).mMenu.changeMenuMode();
            }
            View view = (View) ((BaseMenuPresenter) C2261a.this).mMenuView;
            if (view != null && view.getWindowToken() != null && this.f10061a.tryShow()) {
                C2261a.this.f10053s = this.f10061a;
            }
            C2261a.this.f10055u = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$d */
    /* loaded from: classes.dex */
    public class C2265d extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {

        /* renamed from: androidx.appcompat.widget.a$d$a */
        /* loaded from: classes.dex */
        public class C2266a extends ForwardingListener {

            /* renamed from: j */
            public final /* synthetic */ C2261a f10064j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2266a(View view, C2261a c2261a) {
                super(view);
                this.f10064j = c2261a;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu getPopup() {
                C2267e c2267e = C2261a.this.f10053s;
                if (c2267e == null) {
                    return null;
                }
                return c2267e.getPopup();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStarted() {
                C2261a.this.m64089u();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public boolean onForwardingStopped() {
                C2261a c2261a = C2261a.this;
                if (c2261a.f10055u != null) {
                    return false;
                }
                c2261a.m64099k();
                return true;
            }
        }

        public C2265d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new C2266a(this, C2261a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C2261a.this.m64089u();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$e */
    /* loaded from: classes.dex */
    public class C2267e extends MenuPopupHelper {
        public C2267e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, z, R.attr.actionOverflowMenuStyle);
            setGravity(GravityCompat.END);
            setPresenterCallback(C2261a.this.f10057w);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public void onDismiss() {
            if (((BaseMenuPresenter) C2261a.this).mMenu != null) {
                ((BaseMenuPresenter) C2261a.this).mMenu.close();
            }
            C2261a.this.f10053s = null;
            super.onDismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$f */
    /* loaded from: classes.dex */
    public class C2268f implements MenuPresenter.Callback {
        public C2268f() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            MenuPresenter.Callback callback = C2261a.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == ((BaseMenuPresenter) C2261a.this).mMenu) {
                return false;
            }
            C2261a.this.f10058x = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback callback = C2261a.this.getCallback();
            if (callback == null) {
                return false;
            }
            return callback.onOpenSubMenu(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.widget.a$g */
    /* loaded from: classes.dex */
    public static class C2269g implements Parcelable {
        public static final Parcelable.Creator<C2269g> CREATOR = new C2270a();

        /* renamed from: a */
        public int f10068a;

        /* renamed from: androidx.appcompat.widget.a$g$a */
        /* loaded from: classes.dex */
        public class C2270a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2269g createFromParcel(Parcel parcel) {
                return new C2269g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2269g[] newArray(int i) {
                return new C2269g[i];
            }
        }

        public C2269g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10068a);
        }

        public C2269g(Parcel parcel) {
            this.f10068a = parcel.readInt();
        }
    }

    public C2261a(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f10052r = new SparseBooleanArray();
        this.f10057w = new C2268f();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.f10056v == null) {
            this.f10056v = new C2263b();
        }
        actionMenuItemView.setPopupCallback(this.f10056v);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f10039e) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        ArrayList<MenuItemImpl> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        C2261a c2261a = this;
        MenuBuilder menuBuilder = c2261a.mMenu;
        View view = null;
        int i5 = 0;
        if (menuBuilder != null) {
            arrayList = menuBuilder.getVisibleItems();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c2261a.f10046l;
        int i7 = c2261a.f10045k;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2261a.mMenuView;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            MenuItemImpl menuItemImpl = arrayList.get(i10);
            if (menuItemImpl.requiresActionButton()) {
                i8++;
            } else if (menuItemImpl.requestsActionButton()) {
                i9++;
            } else {
                z3 = true;
            }
            if (c2261a.f10050p && menuItemImpl.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (c2261a.f10042h && (z3 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = c2261a.f10052r;
        sparseBooleanArray.clear();
        if (c2261a.f10048n) {
            int i12 = c2261a.f10051q;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i13);
            if (menuItemImpl2.requiresActionButton()) {
                View itemView = c2261a.getItemView(menuItemImpl2, view, viewGroup);
                if (c2261a.f10048n) {
                    i3 -= ActionMenuView.m64398r(itemView, i2, i3, makeMeasureSpec, i5);
                } else {
                    itemView.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.setIsActionButton(true);
                i4 = i;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                if ((i11 > 0 || z4) && i7 > 0 && (!c2261a.f10048n || i3 > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = z;
                i4 = i;
                if (z) {
                    View itemView2 = c2261a.getItemView(menuItemImpl2, null, viewGroup);
                    if (c2261a.f10048n) {
                        int m64398r = ActionMenuView.m64398r(itemView2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m64398r;
                        if (m64398r == 0) {
                            z5 = false;
                        }
                    } else {
                        itemView2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    if (!c2261a.f10048n ? i7 + i14 > 0 : i7 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z6 & z2;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i15);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i11++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z) {
                    i11--;
                }
                menuItemImpl2.setIsActionButton(z);
            } else {
                i4 = i;
                menuItemImpl2.setIsActionButton(false);
                i13++;
                view = null;
                c2261a = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            c2261a = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = this.mMenuView;
        MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    /* renamed from: h */
    public boolean m64102h() {
        return m64099k() | m64098l();
    }

    /* renamed from: i */
    public final View m64101i(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        if (!this.f10043i) {
            this.f10042h = actionBarPolicy.showsOverflowMenuButton();
        }
        if (!this.f10049o) {
            this.f10044j = actionBarPolicy.getEmbeddedMenuWidthLimit();
        }
        if (!this.f10047m) {
            this.f10046l = actionBarPolicy.getMaxActionButtons();
        }
        int i = this.f10044j;
        if (this.f10042h) {
            if (this.f10039e == null) {
                C2265d c2265d = new C2265d(this.mSystemContext);
                this.f10039e = c2265d;
                if (this.f10041g) {
                    c2265d.setImageDrawable(this.f10040f);
                    this.f10040f = null;
                    this.f10041g = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10039e.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f10039e.getMeasuredWidth();
        } else {
            this.f10039e = null;
        }
        this.f10045k = i;
        this.f10051q = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: j */
    public Drawable m64100j() {
        C2265d c2265d = this.f10039e;
        if (c2265d != null) {
            return c2265d.getDrawable();
        }
        if (this.f10041g) {
            return this.f10040f;
        }
        return null;
    }

    /* renamed from: k */
    public boolean m64099k() {
        MenuView menuView;
        RunnableC2264c runnableC2264c = this.f10055u;
        if (runnableC2264c != null && (menuView = this.mMenuView) != null) {
            ((View) menuView).removeCallbacks(runnableC2264c);
            this.f10055u = null;
            return true;
        }
        C2267e c2267e = this.f10053s;
        if (c2267e != null) {
            c2267e.dismiss();
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m64098l() {
        C2262a c2262a = this.f10054t;
        if (c2262a != null) {
            c2262a.dismiss();
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m64097m() {
        if (this.f10055u == null && !m64096n()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean m64096n() {
        C2267e c2267e = this.f10053s;
        if (c2267e != null && c2267e.isShowing()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m64095o() {
        return this.f10042h;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        m64102h();
        super.onCloseMenu(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C2269g) && (i = ((C2269g) parcelable).f10068a) > 0 && (findItem = this.mMenu.findItem(i)) != null) {
            onSubMenuSelected((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        C2269g c2269g = new C2269g();
        c2269g.f10068a = this.f10058x;
        return c2269g;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
        }
        View m64101i = m64101i(subMenuBuilder2.getItem());
        if (m64101i == null) {
            return false;
        }
        this.f10058x = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C2262a c2262a = new C2262a(this.mContext, subMenuBuilder, m64101i);
        this.f10054t = c2262a;
        c2262a.setForceShowIcon(z);
        this.f10054t.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder != null) {
            menuBuilder.close(false);
        }
    }

    /* renamed from: p */
    public void m64094p(Configuration configuration) {
        if (!this.f10047m) {
            this.f10046l = ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        }
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder != null) {
            menuBuilder.onItemsChanged(true);
        }
    }

    /* renamed from: q */
    public void m64093q(boolean z) {
        this.f10050p = z;
    }

    /* renamed from: r */
    public void m64092r(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    /* renamed from: s */
    public void m64091s(Drawable drawable) {
        C2265d c2265d = this.f10039e;
        if (c2265d != null) {
            c2265d.setImageDrawable(drawable);
            return;
        }
        this.f10041g = true;
        this.f10040f = drawable;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    /* renamed from: t */
    public void m64090t(boolean z) {
        this.f10042h = z;
        this.f10043i = true;
    }

    /* renamed from: u */
    public boolean m64089u() {
        MenuBuilder menuBuilder;
        if (this.f10042h && !m64096n() && (menuBuilder = this.mMenu) != null && this.mMenuView != null && this.f10055u == null && !menuBuilder.getNonActionItems().isEmpty()) {
            RunnableC2264c runnableC2264c = new RunnableC2264c(new C2267e(this.mContext, this.mMenu, this.f10039e, true));
            this.f10055u = runnableC2264c;
            ((View) this.mMenuView).post(runnableC2264c);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        ArrayList<MenuItemImpl> arrayList;
        super.updateMenuView(z);
        ((View) this.mMenuView).requestLayout();
        MenuBuilder menuBuilder = this.mMenu;
        boolean z2 = false;
        if (menuBuilder != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                ActionProvider supportActionProvider = actionItems.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.mMenu;
        if (menuBuilder2 != null) {
            arrayList = menuBuilder2.getNonActionItems();
        } else {
            arrayList = null;
        }
        if (this.f10042h && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f10039e == null) {
                this.f10039e = new C2265d(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.f10039e.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10039e);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.f10039e, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            C2265d c2265d = this.f10039e;
            if (c2265d != null) {
                ViewParent parent = c2265d.getParent();
                MenuView menuView = this.mMenuView;
                if (parent == menuView) {
                    ((ViewGroup) menuView).removeView(this.f10039e);
                }
            }
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.f10042h);
    }
}
