package p000;

import android.widget.PopupMenu;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Vl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18683Vl1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f7077a;

    /* renamed from: Vl1$a */
    /* loaded from: classes5.dex */
    public static final class C1550a extends MainThreadDisposable implements PopupMenu.OnDismissListener {

        /* renamed from: b */
        public final PopupMenu f7078b;

        /* renamed from: c */
        public final Observer f7079c;

        public C1550a(PopupMenu popupMenu, Observer observer) {
            this.f7078b = popupMenu;
            this.f7079c = observer;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (!isDisposed()) {
                this.f7079c.onNext(Notification.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f7078b.setOnDismissListener(null);
        }
    }

    public C18683Vl1(PopupMenu popupMenu) {
        this.f7077a = popupMenu;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1550a c1550a = new C1550a(this.f7077a, observer);
        this.f7077a.setOnDismissListener(c1550a);
        observer.onSubscribe(c1550a);
    }
}