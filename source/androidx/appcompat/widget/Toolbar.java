package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {

    /* renamed from: A */
    public ColorStateList f9951A;

    /* renamed from: B */
    public boolean f9952B;

    /* renamed from: C */
    public boolean f9953C;

    /* renamed from: D */
    public final ArrayList f9954D;

    /* renamed from: E */
    public final ArrayList f9955E;

    /* renamed from: F */
    public final int[] f9956F;

    /* renamed from: G */
    public final MenuHostHelper f9957G;

    /* renamed from: H */
    public ArrayList f9958H;

    /* renamed from: I */
    public OnMenuItemClickListener f9959I;

    /* renamed from: J */
    public final ActionMenuView.OnMenuItemClickListener f9960J;

    /* renamed from: K */
    public ToolbarWidgetWrapper f9961K;

    /* renamed from: L */
    public C2261a f9962L;

    /* renamed from: M */
    public C2257f f9963M;

    /* renamed from: N */
    public MenuPresenter.Callback f9964N;

    /* renamed from: O */
    public MenuBuilder.Callback f9965O;

    /* renamed from: P */
    public boolean f9966P;

    /* renamed from: Q */
    public OnBackInvokedCallback f9967Q;

    /* renamed from: R */
    public OnBackInvokedDispatcher f9968R;

    /* renamed from: S */
    public boolean f9969S;

    /* renamed from: T */
    public final Runnable f9970T;

    /* renamed from: a */
    public ActionMenuView f9971a;

    /* renamed from: b */
    public TextView f9972b;

    /* renamed from: c */
    public TextView f9973c;

    /* renamed from: d */
    public ImageButton f9974d;

    /* renamed from: e */
    public ImageView f9975e;

    /* renamed from: f */
    public Drawable f9976f;

    /* renamed from: g */
    public CharSequence f9977g;

    /* renamed from: h */
    public ImageButton f9978h;

    /* renamed from: i */
    public View f9979i;

    /* renamed from: j */
    public Context f9980j;

    /* renamed from: k */
    public int f9981k;

    /* renamed from: l */
    public int f9982l;

    /* renamed from: m */
    public int f9983m;

    /* renamed from: n */
    public int f9984n;

    /* renamed from: o */
    public int f9985o;

    /* renamed from: p */
    public int f9986p;

    /* renamed from: q */
    public int f9987q;

    /* renamed from: r */
    public int f9988r;

    /* renamed from: s */
    public int f9989s;

    /* renamed from: t */
    public C17898Jy1 f9990t;

    /* renamed from: u */
    public int f9991u;

    /* renamed from: v */
    public int f9992v;

    /* renamed from: w */
    public int f9993w;

    /* renamed from: x */
    public CharSequence f9994x;

    /* renamed from: y */
    public CharSequence f9995y;

    /* renamed from: z */
    public ColorStateList f9996z;

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2251a();

        /* renamed from: b */
        public int f9998b;

        /* renamed from: c */
        public boolean f9999c;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes.dex */
        public class C2251a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9998b);
            parcel.writeInt(this.f9999c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9998b = parcel.readInt();
            this.f9999c = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C2252a implements ActionMenuView.OnMenuItemClickListener {
        public C2252a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f9957G.onMenuItemSelected(menuItem)) {
                return true;
            }
            OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.f9959I;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public class RunnableC2253b implements Runnable {
        public RunnableC2253b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class C2254c implements MenuBuilder.Callback {
        public C2254c() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            MenuBuilder.Callback callback = Toolbar.this.f9965O;
            if (callback != null && callback.onMenuItemSelected(menuBuilder, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (!Toolbar.this.f9971a.isOverflowMenuShowing()) {
                Toolbar.this.f9957G.onPrepareMenu(menuBuilder);
            }
            MenuBuilder.Callback callback = Toolbar.this.f9965O;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2255d implements View.OnClickListener {
        public View$OnClickListenerC2255d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C2256e {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m64120a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static OnBackInvokedCallback m64119b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: BT1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64118c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback((int) DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64117d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public class C2257f implements MenuPresenter {

        /* renamed from: a */
        public MenuBuilder f10004a;

        /* renamed from: b */
        public MenuItemImpl f10005b;

        public C2257f() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            View view = Toolbar.this.f9979i;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f9979i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f9978h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f9979i = null;
            toolbar3.m64150a();
            this.f10005b = null;
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            Toolbar.this.m64125z();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.m64147d();
            ViewParent parent = Toolbar.this.f9978h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f9978h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f9978h);
            }
            Toolbar.this.f9979i = menuItemImpl.getActionView();
            this.f10005b = menuItemImpl;
            ViewParent parent2 = Toolbar.this.f9979i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f9979i);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.gravity = (toolbar4.f9984n & 112) | GravityCompat.START;
                generateDefaultLayoutParams.f9997a = 2;
                toolbar4.f9979i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f9979i);
            }
            Toolbar.this.m64128w();
            Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            View view = Toolbar.this.f9979i;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewExpanded();
            }
            Toolbar.this.m64125z();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public MenuView getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f10004a;
            if (menuBuilder2 != null && (menuItemImpl = this.f10005b) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.f10004a = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
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
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(MenuPresenter.Callback callback) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean z) {
            if (this.f10005b != null) {
                MenuBuilder menuBuilder = this.f10004a;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f10004a.getItem(i) == this.f10005b) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f10004a, this.f10005b);
            }
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    /* renamed from: a */
    public void m64150a() {
        for (int size = this.f9955E.size() - 1; size >= 0; size--) {
            addView((View) this.f9955E.get(size));
        }
        this.f9955E.clear();
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f9957G.addMenuProvider(menuProvider);
    }

    /* renamed from: b */
    public final void m64149b(List list, int i) {
        boolean z;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f9997a == 0 && m64126y(childAt) && m64141j(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f9997a == 0 && m64126y(childAt2) && m64141j(layoutParams2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m64148c(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f9997a = 1;
        if (z && this.f9979i != null) {
            view.setLayoutParams(layoutParams);
            this.f9955E.add(view);
            return;
        }
        addView(view, layoutParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f9971a) != null && actionMenuView.isOverflowReserved()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    public void collapseActionView() {
        MenuItemImpl menuItemImpl;
        C2257f c2257f = this.f9963M;
        if (c2257f == null) {
            menuItemImpl = null;
        } else {
            menuItemImpl = c2257f.f10005b;
        }
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    /* renamed from: d */
    public void m64147d() {
        if (this.f9978h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f9978h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f9976f);
            this.f9978h.setContentDescription(this.f9977g);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.f9984n & 112) | GravityCompat.START;
            generateDefaultLayoutParams.f9997a = 2;
            this.f9978h.setLayoutParams(generateDefaultLayoutParams);
            this.f9978h.setOnClickListener(new View$OnClickListenerC2255d());
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    /* renamed from: e */
    public final void m64146e() {
        if (this.f9990t == null) {
            this.f9990t = new C17898Jy1();
        }
    }

    /* renamed from: f */
    public final void m64145f() {
        if (this.f9975e == null) {
            this.f9975e = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: g */
    public final void m64144g() {
        m64143h();
        if (this.f9971a.peekMenu() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f9971a.getMenu();
            if (this.f9963M == null) {
                this.f9963M = new C2257f();
            }
            this.f9971a.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.f9963M, this.f9980j);
            m64125z();
        }
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f9978h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f9978h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C17898Jy1 c17898Jy1 = this.f9990t;
        if (c17898Jy1 != null) {
            return c17898Jy1.m67662a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f9992v;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C17898Jy1 c17898Jy1 = this.f9990t;
        if (c17898Jy1 != null) {
            return c17898Jy1.m67661b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C17898Jy1 c17898Jy1 = this.f9990t;
        if (c17898Jy1 != null) {
            return c17898Jy1.m67660c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C17898Jy1 c17898Jy1 = this.f9990t;
        if (c17898Jy1 != null) {
            return c17898Jy1.m67659d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f9991u;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder peekMenu;
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null && (peekMenu = actionMenuView.peekMenu()) != null && peekMenu.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f9992v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f9991u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f9975e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f9975e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m64144g();
        return this.f9971a.getMenu();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public View getNavButtonView() {
        return this.f9974d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f9974d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f9974d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C2261a getOuterActionMenuPresenter() {
        return this.f9962L;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        m64144g();
        return this.f9971a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f9980j;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f9981k;
    }

    public CharSequence getSubtitle() {
        return this.f9995y;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f9973c;
    }

    public CharSequence getTitle() {
        return this.f9994x;
    }

    public int getTitleMarginBottom() {
        return this.f9989s;
    }

    public int getTitleMarginEnd() {
        return this.f9987q;
    }

    public int getTitleMarginStart() {
        return this.f9986p;
    }

    public int getTitleMarginTop() {
        return this.f9988r;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.f9972b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DecorToolbar getWrapper() {
        if (this.f9961K == null) {
            this.f9961K = new ToolbarWidgetWrapper(this, true);
        }
        return this.f9961K;
    }

    /* renamed from: h */
    public final void m64143h() {
        if (this.f9971a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f9971a = actionMenuView;
            actionMenuView.setPopupTheme(this.f9981k);
            this.f9971a.setOnMenuItemClickListener(this.f9960J);
            this.f9971a.setMenuCallbacks(this.f9964N, new C2254c());
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.f9984n & 112) | GravityCompat.END;
            this.f9971a.setLayoutParams(generateDefaultLayoutParams);
            m64148c(this.f9971a, false);
        }
    }

    public boolean hasExpandedActionView() {
        C2257f c2257f = this.f9963M;
        if (c2257f != null && c2257f.f10005b != null) {
            return true;
        }
        return false;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null && actionMenuView.hideOverflowMenu()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m64142i() {
        if (this.f9974d == null) {
            this.f9974d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (this.f9984n & 112) | GravityCompat.START;
            this.f9974d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public void inflateMenu(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() {
        Iterator it = this.f9958H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m64130u();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.f9969S;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null && actionMenuView.isOverflowMenuShowPending()) {
            return true;
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null && actionMenuView.isOverflowMenuShowing()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.f9972b;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final int m64141j(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    /* renamed from: k */
    public final int m64140k(View view, int i) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int m64139l = m64139l(layoutParams.gravity);
        if (m64139l != 48) {
            if (m64139l != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: l */
    public final int m64139l(int i) {
        int i2 = i & 112;
        if (i2 != 16 && i2 != 48 && i2 != 80) {
            return this.f9993w & 112;
        }
        return i2;
    }

    /* renamed from: m */
    public final int m64138m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    /* renamed from: n */
    public final int m64137n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: o */
    public final int m64136o(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m64125z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f9970T);
        m64125z();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9953C = false;
        }
        if (!this.f9953C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9953C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9953C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f9956F;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i10 = 0;
        int i11 = !isLayoutRtl ? 1 : 0;
        if (m64126y(this.f9974d)) {
            m64131t(this.f9974d, i, 0, i2, 0, this.f9985o);
            i3 = this.f9974d.getMeasuredWidth() + m64138m(this.f9974d);
            i4 = Math.max(0, this.f9974d.getMeasuredHeight() + m64137n(this.f9974d));
            i5 = View.combineMeasuredStates(0, this.f9974d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m64126y(this.f9978h)) {
            m64131t(this.f9978h, i, 0, i2, 0, this.f9985o);
            i3 = this.f9978h.getMeasuredWidth() + m64138m(this.f9978h);
            i4 = Math.max(i4, this.f9978h.getMeasuredHeight() + m64137n(this.f9978h));
            i5 = View.combineMeasuredStates(i5, this.f9978h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[isLayoutRtl ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (m64126y(this.f9971a)) {
            m64131t(this.f9971a, i, max, i2, 0, this.f9985o);
            i6 = this.f9971a.getMeasuredWidth() + m64138m(this.f9971a);
            i4 = Math.max(i4, this.f9971a.getMeasuredHeight() + m64137n(this.f9971a));
            i5 = View.combineMeasuredStates(i5, this.f9971a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i6);
        if (m64126y(this.f9979i)) {
            max2 += m64132s(this.f9979i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f9979i.getMeasuredHeight() + m64137n(this.f9979i));
            i5 = View.combineMeasuredStates(i5, this.f9979i.getMeasuredState());
        }
        if (m64126y(this.f9975e)) {
            max2 += m64132s(this.f9975e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f9975e.getMeasuredHeight() + m64137n(this.f9975e));
            i5 = View.combineMeasuredStates(i5, this.f9975e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f9997a == 0 && m64126y(childAt)) {
                max2 += m64132s(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m64137n(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.f9988r + this.f9989s;
        int i14 = this.f9986p + this.f9987q;
        if (m64126y(this.f9972b)) {
            m64132s(this.f9972b, i, max2 + i14, i2, i13, iArr);
            int measuredWidth = this.f9972b.getMeasuredWidth() + m64138m(this.f9972b);
            i9 = this.f9972b.getMeasuredHeight() + m64137n(this.f9972b);
            i7 = View.combineMeasuredStates(i5, this.f9972b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m64126y(this.f9973c)) {
            i8 = Math.max(i8, m64132s(this.f9973c, i, max2 + i14, i2, i9 + i13, iArr));
            i9 += this.f9973c.getMeasuredHeight() + m64137n(this.f9973c);
            i7 = View.combineMeasuredStates(i7, this.f9973c.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (!m64127x()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuBuilder menuBuilder;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null) {
            menuBuilder = actionMenuView.peekMenu();
        } else {
            menuBuilder = null;
        }
        int i = savedState.f9998b;
        if (i != 0 && this.f9963M != null && menuBuilder != null && (findItem = menuBuilder.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f9999c) {
            m64129v();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m64146e();
        C17898Jy1 c17898Jy1 = this.f9990t;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c17898Jy1.m67657f(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C2257f c2257f = this.f9963M;
        if (c2257f != null && (menuItemImpl = c2257f.f10005b) != null) {
            savedState.f9998b = menuItemImpl.getItemId();
        }
        savedState.f9999c = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9952B = false;
        }
        if (!this.f9952B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9952B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9952B = false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m64135p(View view) {
        if (view.getParent() != this && !this.f9955E.contains(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final int m64134q(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m64140k = m64140k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m64140k, max + measuredWidth, view.getMeasuredHeight() + m64140k);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    /* renamed from: r */
    public final int m64133r(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m64140k = m64140k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m64140k, max, view.getMeasuredHeight() + m64140k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f9957G.removeMenuProvider(menuProvider);
    }

    /* renamed from: s */
    public final int m64132s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f9969S != z) {
            this.f9969S = z;
            m64125z();
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f9966P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f9992v) {
            this.f9992v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f9991u) {
            this.f9991u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m64146e();
        this.f9990t.m67658e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        m64146e();
        this.f9990t.m67656g(i, i2);
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setMenu(MenuBuilder menuBuilder, C2261a c2261a) {
        if (menuBuilder == null && this.f9971a == null) {
            return;
        }
        m64143h();
        MenuBuilder peekMenu = this.f9971a.peekMenu();
        if (peekMenu == menuBuilder) {
            return;
        }
        if (peekMenu != null) {
            peekMenu.removeMenuPresenter(this.f9962L);
            peekMenu.removeMenuPresenter(this.f9963M);
        }
        if (this.f9963M == null) {
            this.f9963M = new C2257f();
        }
        c2261a.m64093q(true);
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(c2261a, this.f9980j);
            menuBuilder.addMenuPresenter(this.f9963M, this.f9980j);
        } else {
            c2261a.initForMenu(this.f9980j, null);
            this.f9963M.initForMenu(this.f9980j, null);
            c2261a.updateMenuView(true);
            this.f9963M.updateMenuView(true);
        }
        this.f9971a.setPopupTheme(this.f9981k);
        this.f9971a.setPresenter(c2261a);
        this.f9962L = c2261a;
        m64125z();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f9964N = callback;
        this.f9965O = callback2;
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m64142i();
        this.f9974d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f9959I = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        m64144g();
        this.f9971a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f9981k != i) {
            this.f9981k = i;
            if (i == 0) {
                this.f9980j = getContext();
            } else {
                this.f9980j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i) {
        this.f9983m = i;
        TextView textView = this.f9973c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f9986p = i;
        this.f9988r = i2;
        this.f9987q = i3;
        this.f9989s = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f9989s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f9987q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f9986p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f9988r = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i) {
        this.f9982l = i;
        TextView textView = this.f9972b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.f9971a;
        if (actionMenuView != null && actionMenuView.showOverflowMenu()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void m64131t(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: u */
    public final void m64130u() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f9957G.onCreateMenu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f9958H = currentMenuItems2;
    }

    /* renamed from: v */
    public final void m64129v() {
        removeCallbacks(this.f9970T);
        post(this.f9970T);
    }

    /* renamed from: w */
    public void m64128w() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f9997a != 2 && childAt != this.f9971a) {
                removeViewAt(childCount);
                this.f9955E.add(childAt);
            }
        }
    }

    /* renamed from: x */
    public final boolean m64127x() {
        if (!this.f9966P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m64126y(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m64126y(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public void m64125z() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m64120a = C2256e.m64120a(this);
            if (hasExpandedActionView() && m64120a != null && ViewCompat.isAttachedToWindow(this) && this.f9969S) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f9968R == null) {
                if (this.f9967Q == null) {
                    this.f9967Q = C2256e.m64119b(new Runnable() { // from class: zT1
                        {
                            Toolbar.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.collapseActionView();
                        }
                    });
                }
                C2256e.m64118c(m64120a, this.f9967Q);
                this.f9968R = m64120a;
            } else if (!z && (onBackInvokedDispatcher = this.f9968R) != null) {
                C2256e.m64117d(onBackInvokedDispatcher, this.f9967Q);
                this.f9968R = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: a */
        public int f9997a;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9997a = 0;
        }

        /* renamed from: a */
        public void m64124a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f9997a = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f9997a = 0;
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f9997a = 0;
            this.f9997a = layoutParams.f9997a;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9997a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9997a = 0;
            m64124a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9997a = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.f9957G.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m64147d();
        }
        ImageButton imageButton = this.f9978h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m64147d();
            this.f9978h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f9978h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f9976f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m64145f();
            if (!m64135p(this.f9975e)) {
                m64148c(this.f9975e, true);
            }
        } else {
            ImageView imageView = this.f9975e;
            if (imageView != null && m64135p(imageView)) {
                removeView(this.f9975e);
                this.f9955E.remove(this.f9975e);
            }
        }
        ImageView imageView2 = this.f9975e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m64145f();
        }
        ImageView imageView = this.f9975e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m64142i();
        }
        ImageButton imageButton = this.f9974d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.setTooltipText(this.f9974d, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m64142i();
            if (!m64135p(this.f9974d)) {
                m64148c(this.f9974d, true);
            }
        } else {
            ImageButton imageButton = this.f9974d;
            if (imageButton != null && m64135p(imageButton)) {
                removeView(this.f9974d);
                this.f9955E.remove(this.f9974d);
            }
        }
        ImageButton imageButton2 = this.f9974d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f9973c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f9973c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9973c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f9983m;
                if (i != 0) {
                    this.f9973c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f9951A;
                if (colorStateList != null) {
                    this.f9973c.setTextColor(colorStateList);
                }
            }
            if (!m64135p(this.f9973c)) {
                m64148c(this.f9973c, true);
            }
        } else {
            TextView textView = this.f9973c;
            if (textView != null && m64135p(textView)) {
                removeView(this.f9973c);
                this.f9955E.remove(this.f9973c);
            }
        }
        TextView textView2 = this.f9973c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f9995y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f9951A = colorStateList;
        TextView textView = this.f9973c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f9972b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f9972b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9972b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f9982l;
                if (i != 0) {
                    this.f9972b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f9996z;
                if (colorStateList != null) {
                    this.f9972b.setTextColor(colorStateList);
                }
            }
            if (!m64135p(this.f9972b)) {
                m64148c(this.f9972b, true);
            }
        } else {
            TextView textView = this.f9972b;
            if (textView != null && m64135p(textView)) {
                removeView(this.f9972b);
                this.f9955E.remove(this.f9972b);
            }
        }
        TextView textView2 = this.f9972b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f9994x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f9996z = colorStateList;
        TextView textView = this.f9972b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9993w = 8388627;
        this.f9954D = new ArrayList();
        this.f9955E = new ArrayList();
        this.f9956F = new int[2];
        this.f9957G = new MenuHostHelper(new Runnable() { // from class: AT1
            {
                Toolbar.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.f9958H = new ArrayList();
        this.f9960J = new C2252a();
        this.f9970T = new RunnableC2253b();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.Toolbar, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.Toolbar, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        this.f9982l = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f9983m = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f9993w = obtainStyledAttributes.getInteger(R.styleable.Toolbar_android_gravity, this.f9993w);
        this.f9984n = obtainStyledAttributes.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMargin, 0);
        dimensionPixelOffset = obtainStyledAttributes.hasValue(R.styleable.Toolbar_titleMargins) ? obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.f9989s = dimensionPixelOffset;
        this.f9988r = dimensionPixelOffset;
        this.f9987q = dimensionPixelOffset;
        this.f9986p = dimensionPixelOffset;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f9986p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f9987q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f9988r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f9989s = dimensionPixelOffset5;
        }
        this.f9985o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0);
        m64146e();
        this.f9990t.m67658e(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.f9990t.m67656g(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f9991u = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f9992v = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f9976f = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_collapseIcon);
        this.f9977g = obtainStyledAttributes.getText(R.styleable.Toolbar_collapseContentDescription);
        CharSequence text = obtainStyledAttributes.getText(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = obtainStyledAttributes.getText(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f9980j = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(R.styleable.Toolbar_popupTheme, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = obtainStyledAttributes.getText(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = obtainStyledAttributes.getText(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(obtainStyledAttributes.getColorStateList(R.styleable.Toolbar_titleTextColor));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(obtainStyledAttributes.getColorStateList(R.styleable.Toolbar_subtitleTextColor));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Toolbar_menu)) {
            inflateMenu(obtainStyledAttributes.getResourceId(R.styleable.Toolbar_menu, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.f9957G.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
