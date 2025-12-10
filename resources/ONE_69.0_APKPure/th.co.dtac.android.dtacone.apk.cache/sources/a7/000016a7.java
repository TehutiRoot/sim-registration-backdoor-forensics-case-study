package p000;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Xl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18813Xl1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f7650a;

    /* renamed from: Xl1$a */
    /* loaded from: classes5.dex */
    public static final class C1690a extends MainThreadDisposable implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: b */
        public final PopupMenu f7651b;

        /* renamed from: c */
        public final Observer f7652c;

        public C1690a(PopupMenu popupMenu, Observer observer) {
            this.f7651b = popupMenu;
            this.f7652c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f7651b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!isDisposed()) {
                this.f7652c.onNext(menuItem);
                return true;
            }
            return false;
        }
    }

    public C18813Xl1(PopupMenu popupMenu) {
        this.f7650a = popupMenu;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1690a c1690a = new C1690a(this.f7650a, observer);
        this.f7650a.setOnMenuItemClickListener(c1690a);
        observer.onSubscribe(c1690a);
    }
}