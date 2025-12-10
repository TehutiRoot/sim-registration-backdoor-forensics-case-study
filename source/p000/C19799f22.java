package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewAttachAttachedEvent;
import com.jakewharton.rxbinding2.view.ViewAttachDetachedEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: f22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19799f22 extends Observable {

    /* renamed from: a */
    public final View f61700a;

    /* renamed from: f22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10198a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f61701b;

        /* renamed from: c */
        public final Observer f61702c;

        public View$OnAttachStateChangeListenerC10198a(View view, Observer observer) {
            this.f61701b = view;
            this.f61702c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61701b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!isDisposed()) {
                this.f61702c.onNext(ViewAttachAttachedEvent.create(this.f61701b));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f61702c.onNext(ViewAttachDetachedEvent.create(this.f61701b));
            }
        }
    }

    public C19799f22(View view) {
        this.f61700a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10198a view$OnAttachStateChangeListenerC10198a = new View$OnAttachStateChangeListenerC10198a(this.f61700a, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10198a);
        this.f61700a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10198a);
    }
}
