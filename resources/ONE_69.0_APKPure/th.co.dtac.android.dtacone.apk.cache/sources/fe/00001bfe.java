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
    public final Context f9492a;

    /* renamed from: b */
    public final MenuBuilder f9493b;

    /* renamed from: c */
    public final boolean f9494c;

    /* renamed from: d */
    public final int f9495d;

    /* renamed from: e */
    public final int f9496e;

    /* renamed from: f */
    public View f9497f;

    /* renamed from: g */
    public int f9498g;

    /* renamed from: h */
    public boolean f9499h;

    /* renamed from: i */
    public MenuPresenter.Callback f9500i;

    /* renamed from: j */
    public AbstractC21202ms0 f9501j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f9502k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f9503l;

    /* renamed from: androidx.appcompat.view.menu.MenuPopupHelper$a */
    /* loaded from: classes.dex */
    public class C2139a implements PopupWindow.OnDismissListener {
        public C2139a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MenuPopupHelper.this.onDismiss();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuPopupHelper$b */
    /* loaded from: classes.dex */
    public static class C2140b {
        @DoNotInline
        /* renamed from: a */
        public static void m64370a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, R.attr.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public final AbstractC21202ms0 m64372a() {
        AbstractC21202ms0 view$OnKeyListenerC2142b;
        Display defaultDisplay = ((WindowManager) this.f9492a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        C2140b.m64370a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f9492a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
            view$OnKeyListenerC2142b = new CascadingMenuPopup(this.f9492a, this.f9497f, this.f9495d, this.f9496e, this.f9494c);
        } else {
            view$OnKeyListenerC2142b = new View$OnKeyListenerC2142b(this.f9492a, this.f9493b, this.f9497f, this.f9495d, this.f9496e, this.f9494c);
        }
        view$OnKeyListenerC2142b.mo26504a(this.f9493b);
        view$OnKeyListenerC2142b.mo26495j(this.f9503l);
        view$OnKeyListenerC2142b.mo26500e(this.f9497f);
        view$OnKeyListenerC2142b.setCallback(this.f9500i);
        view$OnKeyListenerC2142b.mo26498g(this.f9499h);
        view$OnKeyListenerC2142b.mo26497h(this.f9498g);
        return view$OnKeyListenerC2142b;
    }

    /* renamed from: b */
    public final void m64371b(int i, int i2, boolean z, boolean z2) {
        AbstractC21202ms0 popup = getPopup();
        popup.mo26494k(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.f9498g, ViewCompat.getLayoutDirection(this.f9497f)) & 7) == 5) {
                i -= this.f9497f.getWidth();
            }
            popup.mo26496i(i);
            popup.mo26493l(i2);
            int i3 = (int) ((this.f9492a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.m26499f(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.f9501j.dismiss();
        }
    }

    public int getGravity() {
        return this.f9498g;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AbstractC21202ms0 getPopup() {
        if (this.f9501j == null) {
            this.f9501j = m64372a();
        }
        return this.f9501j;
    }

    public boolean isShowing() {
        AbstractC21202ms0 abstractC21202ms0 = this.f9501j;
        if (abstractC21202ms0 != null && abstractC21202ms0.isShowing()) {
            return true;
        }
        return false;
    }

    public void onDismiss() {
        this.f9501j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9502k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(@NonNull View view) {
        this.f9497f = view;
    }

    public void setForceShowIcon(boolean z) {
        this.f9499h = z;
        AbstractC21202ms0 abstractC21202ms0 = this.f9501j;
        if (abstractC21202ms0 != null) {
            abstractC21202ms0.mo26498g(z);
        }
    }

    public void setGravity(int i) {
        this.f9498g = i;
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f9502k = onDismissListener;
    }

    public void setPresenterCallback(@Nullable MenuPresenter.Callback callback) {
        this.f9500i = callback;
        AbstractC21202ms0 abstractC21202ms0 = this.f9501j;
        if (abstractC21202ms0 != null) {
            abstractC21202ms0.setCallback(callback);
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
        if (this.f9497f == null) {
            return false;
        }
        m64371b(0, 0, false, false);
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
        this.f9498g = GravityCompat.START;
        this.f9503l = new C2139a();
        this.f9492a = context;
        this.f9493b = menuBuilder;
        this.f9497f = view;
        this.f9494c = z;
        this.f9495d = i;
        this.f9496e = i2;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.f9497f == null) {
            return false;
        }
        m64371b(i, i2, true, true);
        return true;
    }
}