package p000;

import android.view.MenuItem;
import android.widget.Toolbar;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: CT1 */
/* loaded from: classes5.dex */
public final class CT1 extends Observable {

    /* renamed from: a */
    public final Toolbar f746a;

    /* renamed from: CT1$a */
    /* loaded from: classes5.dex */
    public static final class C0183a extends MainThreadDisposable implements Toolbar.OnMenuItemClickListener {

        /* renamed from: b */
        public final Toolbar f747b;

        /* renamed from: c */
        public final Observer f748c;

        public C0183a(Toolbar toolbar, Observer observer) {
            this.f747b = toolbar;
            this.f748c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f747b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!isDisposed()) {
                this.f748c.onNext(menuItem);
                return true;
            }
            return false;
        }
    }

    public CT1(Toolbar toolbar) {
        this.f746a = toolbar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0183a c0183a = new C0183a(this.f746a, observer);
        observer.onSubscribe(c0183a);
        this.f746a.setOnMenuItemClickListener(c0183a);
    }
}
