package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.MenuItemActionViewCollapseEvent;
import com.jakewharton.rxbinding3.view.MenuItemActionViewEvent;
import com.jakewharton.rxbinding3.view.MenuItemActionViewExpandEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ds0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19595ds0 extends Observable {

    /* renamed from: a */
    public final MenuItem f61337a;

    /* renamed from: b */
    public final Function1 f61338b;

    /* renamed from: ds0$a */
    /* loaded from: classes5.dex */
    public static final class MenuItem$OnActionExpandListenerC10109a extends MainThreadDisposable implements MenuItem.OnActionExpandListener {

        /* renamed from: b */
        public final MenuItem f61339b;

        /* renamed from: c */
        public final Function1 f61340c;

        /* renamed from: d */
        public final Observer f61341d;

        public MenuItem$OnActionExpandListenerC10109a(MenuItem menuItem, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61339b = menuItem;
            this.f61340c = handled;
            this.f61341d = observer;
        }

        /* renamed from: a */
        public final boolean m31630a(MenuItemActionViewEvent menuItemActionViewEvent) {
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f61340c.invoke(menuItemActionViewEvent)).booleanValue()) {
                        this.f61341d.onNext(menuItemActionViewEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f61341d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61339b.setOnActionExpandListener(null);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            return m31630a(new MenuItemActionViewCollapseEvent(item));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            return m31630a(new MenuItemActionViewExpandEvent(item));
        }
    }

    public C19595ds0(MenuItem menuItem, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f61337a = menuItem;
        this.f61338b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        MenuItem$OnActionExpandListenerC10109a menuItem$OnActionExpandListenerC10109a = new MenuItem$OnActionExpandListenerC10109a(this.f61337a, this.f61338b, observer);
        observer.onSubscribe(menuItem$OnActionExpandListenerC10109a);
        this.f61337a.setOnActionExpandListener(menuItem$OnActionExpandListenerC10109a);
    }
}
