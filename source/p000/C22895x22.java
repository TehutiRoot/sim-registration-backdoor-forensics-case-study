package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewAddEvent;
import com.jakewharton.rxbinding2.view.ViewGroupHierarchyChildViewRemoveEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: x22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22895x22 extends Observable {

    /* renamed from: a */
    public final ViewGroup f108213a;

    /* renamed from: x22$a */
    /* loaded from: classes5.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC17018a extends MainThreadDisposable implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final ViewGroup f108214b;

        /* renamed from: c */
        public final Observer f108215c;

        public ViewGroup$OnHierarchyChangeListenerC17018a(ViewGroup viewGroup, Observer observer) {
            this.f108214b = viewGroup;
            this.f108215c = observer;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (!isDisposed()) {
                this.f108215c.onNext(ViewGroupHierarchyChildViewAddEvent.create(this.f108214b, view2));
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (!isDisposed()) {
                this.f108215c.onNext(ViewGroupHierarchyChildViewRemoveEvent.create(this.f108214b, view2));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108214b.setOnHierarchyChangeListener(null);
        }
    }

    public C22895x22(ViewGroup viewGroup) {
        this.f108213a = viewGroup;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewGroup$OnHierarchyChangeListenerC17018a viewGroup$OnHierarchyChangeListenerC17018a = new ViewGroup$OnHierarchyChangeListenerC17018a(this.f108213a, observer);
        observer.onSubscribe(viewGroup$OnHierarchyChangeListenerC17018a);
        this.f108213a.setOnHierarchyChangeListener(viewGroup$OnHierarchyChangeListenerC17018a);
    }
}
