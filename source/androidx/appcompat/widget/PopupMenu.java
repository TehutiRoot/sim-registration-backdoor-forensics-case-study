package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

/* loaded from: classes.dex */
public class PopupMenu {

    /* renamed from: a */
    public final Context f9757a;

    /* renamed from: b */
    public final MenuBuilder f9758b;

    /* renamed from: c */
    public final View f9759c;

    /* renamed from: d */
    public final MenuPopupHelper f9760d;

    /* renamed from: e */
    public OnMenuItemClickListener f9761e;

    /* renamed from: f */
    public OnDismissListener f9762f;

    /* renamed from: g */
    public View.OnTouchListener f9763g;

    /* loaded from: classes.dex */
    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$a */
    /* loaded from: classes.dex */
    public class C2216a implements MenuBuilder.Callback {
        public C2216a() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.f9761e;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$b */
    /* loaded from: classes.dex */
    public class C2217b implements PopupWindow.OnDismissListener {
        public C2217b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupMenu popupMenu = PopupMenu.this;
            OnDismissListener onDismissListener = popupMenu.f9762f;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(popupMenu);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$c */
    /* loaded from: classes.dex */
    public class C2218c extends ForwardingListener {
        public C2218c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return PopupMenu.this.f9760d.getPopup();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            PopupMenu.this.show();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStopped() {
            PopupMenu.this.dismiss();
            return true;
        }
    }

    public PopupMenu(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.f9760d.dismiss();
    }

    @NonNull
    public View.OnTouchListener getDragToOpenListener() {
        if (this.f9763g == null) {
            this.f9763g = new C2218c(this.f9759c);
        }
        return this.f9763g;
    }

    public int getGravity() {
        return this.f9760d.getGravity();
    }

    @NonNull
    public Menu getMenu() {
        return this.f9758b;
    }

    @NonNull
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.f9757a);
    }

    public void inflate(@MenuRes int i) {
        getMenuInflater().inflate(i, this.f9758b);
    }

    public void setForceShowIcon(boolean z) {
        this.f9760d.setForceShowIcon(z);
    }

    public void setGravity(int i) {
        this.f9760d.setGravity(i);
    }

    public void setOnDismissListener(@Nullable OnDismissListener onDismissListener) {
        this.f9762f = onDismissListener;
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener onMenuItemClickListener) {
        this.f9761e = onMenuItemClickListener;
    }

    public void show() {
        this.f9760d.show();
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i) {
        this(context, view, i, R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i, @AttrRes int i2, @StyleRes int i3) {
        this.f9757a = context;
        this.f9759c = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.f9758b = menuBuilder;
        menuBuilder.setCallback(new C2216a());
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, view, false, i2, i3);
        this.f9760d = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        menuPopupHelper.setOnDismissListener(new C2217b());
    }
}
