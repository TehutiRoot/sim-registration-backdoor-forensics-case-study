package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MenuPopupHelper {

    /* renamed from: a */
    public final Context f9404a;

    /* renamed from: b */
    public final MenuBuilder f9405b;

    /* renamed from: c */
    public final boolean f9406c;

    /* renamed from: d */
    public final int f9407d;

    /* renamed from: e */
    public final int f9408e;

    /* renamed from: f */
    public View f9409f;

    /* renamed from: g */
    public int f9410g;

    /* renamed from: h */
    public boolean f9411h;

    /* renamed from: i */
    public MenuPresenter.Callback f9412i;

    /* renamed from: j */
    public AbstractC20111gs0 f9413j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f9414k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f9415l;

    /* renamed from: androidx.appcompat.view.menu.MenuPopupHelper$a */
    /* loaded from: classes.dex */
    public class C2157a implements PopupWindow.OnDismissListener {
        public C2157a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MenuPopupHelper.this.onDismiss();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuPopupHelper$b */
    /* loaded from: classes.dex */
    public static class C2158b {
        @DoNotInline
        /* renamed from: a */
        public static void m64419a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, R.attr.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public final AbstractC20111gs0 m64421a() {
        AbstractC20111gs0 view$OnKeyListenerC2160b;
        Display defaultDisplay = ((WindowManager) this.f9404a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        C2158b.m64419a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f9404a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
            view$OnKeyListenerC2160b = new CascadingMenuPopup(this.f9404a, this.f9409f, this.f9407d, this.f9408e, this.f9406c);
        } else {
            view$OnKeyListenerC2160b = new View$OnKeyListenerC2160b(this.f9404a, this.f9405b, this.f9409f, this.f9407d, this.f9408e, this.f9406c);
        }
        view$OnKeyListenerC2160b.mo30977a(this.f9405b);
        view$OnKeyListenerC2160b.mo30968j(this.f9415l);
        view$OnKeyListenerC2160b.mo30973e(this.f9409f);
        view$OnKeyListenerC2160b.setCallback(this.f9412i);
        view$OnKeyListenerC2160b.mo30971g(this.f9411h);
        view$OnKeyListenerC2160b.mo30970h(this.f9410g);
        return view$OnKeyListenerC2160b;
    }

    /* renamed from: b */
    public final void m64420b(int i, int i2, boolean z, boolean z2) {
        AbstractC20111gs0 popup = getPopup();
        popup.mo30967k(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.f9410g, ViewCompat.getLayoutDirection(this.f9409f)) & 7) == 5) {
                i -= this.f9409f.getWidth();
            }
            popup.mo30969i(i);
            popup.mo30966l(i2);
            int i3 = (int) ((this.f9404a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.m30972f(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.f9413j.dismiss();
        }
    }

    public int getGravity() {
        return this.f9410g;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AbstractC20111gs0 getPopup() {
        if (this.f9413j == null) {
            this.f9413j = m64421a();
        }
        return this.f9413j;
    }

    public boolean isShowing() {
        AbstractC20111gs0 abstractC20111gs0 = this.f9413j;
        if (abstractC20111gs0 != null && abstractC20111gs0.isShowing()) {
            return true;
        }
        return false;
    }

    public void onDismiss() {
        this.f9413j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9414k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(@NonNull View view) {
        this.f9409f = view;
    }

    public void setForceShowIcon(boolean z) {
        this.f9411h = z;
        AbstractC20111gs0 abstractC20111gs0 = this.f9413j;
        if (abstractC20111gs0 != null) {
            abstractC20111gs0.mo30971g(z);
        }
    }

    public void setGravity(int i) {
        this.f9410g = i;
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f9414k = onDismissListener;
    }

    public void setPresenterCallback(@Nullable MenuPresenter.Callback callback) {
        this.f9412i = callback;
        AbstractC20111gs0 abstractC20111gs0 = this.f9413j;
        if (abstractC20111gs0 != null) {
            abstractC20111gs0.setCallback(callback);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.f9409f == null) {
            return false;
        }
        m64420b(0, 0, false, false);
        return true;
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view) {
        this(context, menuBuilder, view, false, R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.f9410g = GravityCompat.START;
        this.f9415l = new C2157a();
        this.f9404a = context;
        this.f9405b = menuBuilder;
        this.f9409f = view;
        this.f9406c = z;
        this.f9407d = i;
        this.f9408e = i2;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.f9409f == null) {
            return false;
        }
        m64420b(i, i2, true, true);
        return true;
    }
}
