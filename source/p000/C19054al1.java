package p000;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: al1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19054al1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f8422a;

    /* renamed from: al1$a */
    /* loaded from: classes5.dex */
    public static final class C1915a extends MainThreadDisposable implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: b */
        public final PopupMenu f8423b;

        /* renamed from: c */
        public final Observer f8424c;

        public C1915a(PopupMenu popupMenu, Observer observer) {
            this.f8423b = popupMenu;
            this.f8424c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8423b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!isDisposed()) {
                this.f8424c.onNext(menuItem);
                return true;
            }
            return false;
        }
    }

    public C19054al1(PopupMenu popupMenu) {
        this.f8422a = popupMenu;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1915a c1915a = new C1915a(this.f8422a, observer);
        this.f8422a.setOnMenuItemClickListener(c1915a);
        observer.onSubscribe(c1915a);
    }
}
