package p000;

import android.view.View;
import android.widget.Toolbar;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: ET1 */
/* loaded from: classes5.dex */
public final class ET1 extends Observable {

    /* renamed from: a */
    public final Toolbar f1308a;

    /* renamed from: ET1$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC0324a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final Toolbar f1309b;

        /* renamed from: c */
        public final Observer f1310c;

        public View$OnClickListenerC0324a(Toolbar toolbar, Observer observer) {
            this.f1309b = toolbar;
            this.f1310c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!isDisposed()) {
                this.f1310c.onNext(Notification.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1309b.setNavigationOnClickListener(null);
        }
    }

    public ET1(Toolbar toolbar) {
        this.f1308a = toolbar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC0324a view$OnClickListenerC0324a = new View$OnClickListenerC0324a(this.f1308a, observer);
        observer.onSubscribe(view$OnClickListenerC0324a);
        this.f1308a.setNavigationOnClickListener(view$OnClickListenerC0324a);
    }
}
