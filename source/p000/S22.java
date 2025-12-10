package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import java.util.concurrent.Callable;

/* renamed from: S22 */
/* loaded from: classes5.dex */
public final class S22 extends Observable {

    /* renamed from: a */
    public final View f5497a;

    /* renamed from: b */
    public final Callable f5498b;

    /* renamed from: S22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLongClickListenerC1286a extends MainThreadDisposable implements View.OnLongClickListener {

        /* renamed from: b */
        public final View f5499b;

        /* renamed from: c */
        public final Observer f5500c;

        /* renamed from: d */
        public final Callable f5501d;

        public View$OnLongClickListenerC1286a(View view, Callable callable, Observer observer) {
            this.f5499b = view;
            this.f5500c = observer;
            this.f5501d = callable;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f5499b.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f5501d.call()).booleanValue()) {
                        this.f5500c.onNext(Notification.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f5500c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public S22(View view, Callable callable) {
        this.f5497a = view;
        this.f5498b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLongClickListenerC1286a view$OnLongClickListenerC1286a = new View$OnLongClickListenerC1286a(this.f5497a, this.f5498b, observer);
        observer.onSubscribe(view$OnLongClickListenerC1286a);
        this.f5497a.setOnLongClickListener(view$OnLongClickListenerC1286a);
    }
}
