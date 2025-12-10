package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: j22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20487j22 extends Observable {

    /* renamed from: a */
    public final View f67149a;

    /* renamed from: j22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC11506a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final View f67150b;

        /* renamed from: c */
        public final Observer f67151c;

        public View$OnClickListenerC11506a(View view, Observer observer) {
            this.f67150b = view;
            this.f67151c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!isDisposed()) {
                this.f67151c.onNext(Notification.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67150b.setOnClickListener(null);
        }
    }

    public C20487j22(View view) {
        this.f67149a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC11506a view$OnClickListenerC11506a = new View$OnClickListenerC11506a(this.f67149a, observer);
        observer.onSubscribe(view$OnClickListenerC11506a);
        this.f67149a.setOnClickListener(view$OnClickListenerC11506a);
    }
}
