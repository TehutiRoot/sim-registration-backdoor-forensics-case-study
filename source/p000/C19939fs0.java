package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: fs0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19939fs0 extends Observable {

    /* renamed from: a */
    public final MenuItem f61954a;

    /* renamed from: b */
    public final Predicate f61955b;

    /* renamed from: fs0$a */
    /* loaded from: classes5.dex */
    public static final class MenuItem$OnMenuItemClickListenerC10256a extends MainThreadDisposable implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem f61956b;

        /* renamed from: c */
        public final Predicate f61957c;

        /* renamed from: d */
        public final Observer f61958d;

        public MenuItem$OnMenuItemClickListenerC10256a(MenuItem menuItem, Predicate predicate, Observer observer) {
            this.f61956b = menuItem;
            this.f61957c = predicate;
            this.f61958d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61956b.setOnMenuItemClickListener(null);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!isDisposed()) {
                try {
                    if (this.f61957c.test(this.f61956b)) {
                        this.f61958d.onNext(Notification.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f61958d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C19939fs0(MenuItem menuItem, Predicate predicate) {
        this.f61954a = menuItem;
        this.f61955b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        MenuItem$OnMenuItemClickListenerC10256a menuItem$OnMenuItemClickListenerC10256a = new MenuItem$OnMenuItemClickListenerC10256a(this.f61954a, this.f61955b, observer);
        observer.onSubscribe(menuItem$OnMenuItemClickListenerC10256a);
        this.f61954a.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC10256a);
    }
}
