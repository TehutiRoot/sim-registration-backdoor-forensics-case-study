package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewAttachAttachedEvent;
import com.jakewharton.rxbinding2.view.ViewAttachDetachedEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: c32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19334c32 extends Observable {

    /* renamed from: a */
    public final View f39297a;

    /* renamed from: c32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC5397a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f39298b;

        /* renamed from: c */
        public final Observer f39299c;

        public View$OnAttachStateChangeListenerC5397a(View view, Observer observer) {
            this.f39298b = view;
            this.f39299c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f39298b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!isDisposed()) {
                this.f39299c.onNext(ViewAttachAttachedEvent.create(this.f39298b));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f39299c.onNext(ViewAttachDetachedEvent.create(this.f39298b));
            }
        }
    }

    public C19334c32(View view) {
        this.f39297a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC5397a view$OnAttachStateChangeListenerC5397a = new View$OnAttachStateChangeListenerC5397a(this.f39297a, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC5397a);
        this.f39297a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC5397a);
    }
}