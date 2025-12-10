package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.MenuItemActionViewCollapseEvent;
import com.jakewharton.rxbinding2.view.MenuItemActionViewEvent;
import com.jakewharton.rxbinding2.view.MenuItemActionViewExpandEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: cs0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19423cs0 extends Observable {

    /* renamed from: a */
    public final MenuItem f60989a;

    /* renamed from: b */
    public final Predicate f60990b;

    /* renamed from: cs0$a */
    /* loaded from: classes5.dex */
    public static final class MenuItem$OnActionExpandListenerC10031a extends MainThreadDisposable implements MenuItem.OnActionExpandListener {

        /* renamed from: b */
        public final MenuItem f60991b;

        /* renamed from: c */
        public final Predicate f60992c;

        /* renamed from: d */
        public final Observer f60993d;

        public MenuItem$OnActionExpandListenerC10031a(MenuItem menuItem, Predicate predicate, Observer observer) {
            this.f60991b = menuItem;
            this.f60992c = predicate;
            this.f60993d = observer;
        }

        /* renamed from: a */
        public final boolean m31961a(MenuItemActionViewEvent menuItemActionViewEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f60992c.test(menuItemActionViewEvent)) {
                        this.f60993d.onNext(menuItemActionViewEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f60993d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f60991b.setOnActionExpandListener(null);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return m31961a(MenuItemActionViewCollapseEvent.create(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return m31961a(MenuItemActionViewExpandEvent.create(menuItem));
        }
    }

    public C19423cs0(MenuItem menuItem, Predicate predicate) {
        this.f60989a = menuItem;
        this.f60990b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        MenuItem$OnActionExpandListenerC10031a menuItem$OnActionExpandListenerC10031a = new MenuItem$OnActionExpandListenerC10031a(this.f60989a, this.f60990b, observer);
        observer.onSubscribe(menuItem$OnActionExpandListenerC10031a);
        this.f60989a.setOnActionExpandListener(menuItem$OnActionExpandListenerC10031a);
    }
}
