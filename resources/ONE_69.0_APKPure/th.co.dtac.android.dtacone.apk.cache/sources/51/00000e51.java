package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import java.util.concurrent.Callable;

/* renamed from: P32 */
/* loaded from: classes5.dex */
public final class P32 extends Observable {

    /* renamed from: a */
    public final View f4656a;

    /* renamed from: b */
    public final Callable f4657b;

    /* renamed from: P32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLongClickListenerC1059a extends MainThreadDisposable implements View.OnLongClickListener {

        /* renamed from: b */
        public final View f4658b;

        /* renamed from: c */
        public final Observer f4659c;

        /* renamed from: d */
        public final Callable f4660d;

        public View$OnLongClickListenerC1059a(View view, Callable callable, Observer observer) {
            this.f4658b = view;
            this.f4659c = observer;
            this.f4660d = callable;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4658b.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f4660d.call()).booleanValue()) {
                        this.f4659c.onNext(Notification.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f4659c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public P32(View view, Callable callable) {
        this.f4656a = view;
        this.f4657b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLongClickListenerC1059a view$OnLongClickListenerC1059a = new View$OnLongClickListenerC1059a(this.f4656a, this.f4657b, observer);
        observer.onSubscribe(view$OnLongClickListenerC1059a);
        this.f4656a.setOnLongClickListener(view$OnLongClickListenerC1059a);
    }
}