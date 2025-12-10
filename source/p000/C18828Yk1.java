package p000;

import android.widget.PopupMenu;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Yk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18828Yk1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f7840a;

    /* renamed from: Yk1$a */
    /* loaded from: classes5.dex */
    public static final class C1777a extends MainThreadDisposable implements PopupMenu.OnDismissListener {

        /* renamed from: b */
        public final PopupMenu f7841b;

        /* renamed from: c */
        public final Observer f7842c;

        public C1777a(PopupMenu popupMenu, Observer observer) {
            this.f7841b = popupMenu;
            this.f7842c = observer;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (!isDisposed()) {
                this.f7842c.onNext(Notification.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f7841b.setOnDismissListener(null);
        }
    }

    public C18828Yk1(PopupMenu popupMenu) {
        this.f7840a = popupMenu;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1777a c1777a = new C1777a(this.f7840a, observer);
        this.f7840a.setOnDismissListener(c1777a);
        observer.onSubscribe(c1777a);
    }
}
