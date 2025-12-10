package p000;

import android.view.View;
import android.widget.Toolbar;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: BU1 */
/* loaded from: classes5.dex */
public final class BU1 extends Observable {

    /* renamed from: a */
    public final Toolbar f411a;

    /* renamed from: BU1$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC0106a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final Toolbar f412b;

        /* renamed from: c */
        public final Observer f413c;

        public View$OnClickListenerC0106a(Toolbar toolbar, Observer observer) {
            this.f412b = toolbar;
            this.f413c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!isDisposed()) {
                this.f413c.onNext(Notification.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f412b.setNavigationOnClickListener(null);
        }
    }

    public BU1(Toolbar toolbar) {
        this.f411a = toolbar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC0106a view$OnClickListenerC0106a = new View$OnClickListenerC0106a(this.f411a, observer);
        observer.onSubscribe(view$OnClickListenerC0106a);
        this.f411a.setNavigationOnClickListener(view$OnClickListenerC0106a);
    }
}