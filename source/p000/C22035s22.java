package p000;

import android.view.DragEvent;
import android.view.View;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: s22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22035s22 extends Observable {

    /* renamed from: a */
    public final View f79546a;

    /* renamed from: b */
    public final Predicate f79547b;

    /* renamed from: s22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnDragListenerC13887a extends MainThreadDisposable implements View.OnDragListener {

        /* renamed from: b */
        public final View f79548b;

        /* renamed from: c */
        public final Predicate f79549c;

        /* renamed from: d */
        public final Observer f79550d;

        public View$OnDragListenerC13887a(View view, Predicate predicate, Observer observer) {
            this.f79548b = view;
            this.f79549c = predicate;
            this.f79550d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f79548b.setOnDragListener(null);
        }

        @Override // android.view.View.OnDragListener
        public boolean onDrag(View view, DragEvent dragEvent) {
            if (!isDisposed()) {
                try {
                    if (this.f79549c.test(dragEvent)) {
                        this.f79550d.onNext(dragEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f79550d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C22035s22(View view, Predicate predicate) {
        this.f79546a = view;
        this.f79547b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnDragListenerC13887a view$OnDragListenerC13887a = new View$OnDragListenerC13887a(this.f79546a, this.f79547b, observer);
        observer.onSubscribe(view$OnDragListenerC13887a);
        this.f79546a.setOnDragListener(view$OnDragListenerC13887a);
    }
}
