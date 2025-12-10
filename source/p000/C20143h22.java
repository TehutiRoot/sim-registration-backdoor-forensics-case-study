package p000;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: h22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20143h22 extends Observable {

    /* renamed from: a */
    public final boolean f62381a;

    /* renamed from: b */
    public final View f62382b;

    /* renamed from: h22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnAttachStateChangeListenerC10354a extends MainThreadDisposable implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f62383b;

        /* renamed from: c */
        public final boolean f62384c;

        /* renamed from: d */
        public final Observer f62385d;

        public View$OnAttachStateChangeListenerC10354a(View view, boolean z, Observer observer) {
            this.f62383b = view;
            this.f62384c = z;
            this.f62385d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62383b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (this.f62384c && !isDisposed()) {
                this.f62385d.onNext(Notification.INSTANCE);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (!this.f62384c && !isDisposed()) {
                this.f62385d.onNext(Notification.INSTANCE);
            }
        }
    }

    public C20143h22(View view, boolean z) {
        this.f62382b = view;
        this.f62381a = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnAttachStateChangeListenerC10354a view$OnAttachStateChangeListenerC10354a = new View$OnAttachStateChangeListenerC10354a(this.f62382b, this.f62381a, observer);
        observer.onSubscribe(view$OnAttachStateChangeListenerC10354a);
        this.f62382b.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC10354a);
    }
}
