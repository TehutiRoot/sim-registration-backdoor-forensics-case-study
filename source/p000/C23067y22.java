package p000;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.view.ViewGroupHierarchyChildViewAddEvent;
import com.jakewharton.rxbinding3.view.ViewGroupHierarchyChildViewRemoveEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23067y22 extends Observable {

    /* renamed from: a */
    public final ViewGroup f108603a;

    /* renamed from: y22$a */
    /* loaded from: classes5.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC17094a extends MainThreadDisposable implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final ViewGroup f108604b;

        /* renamed from: c */
        public final Observer f108605c;

        public ViewGroup$OnHierarchyChangeListenerC17094a(ViewGroup viewGroup, Observer observer) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f108604b = viewGroup;
            this.f108605c = observer;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            Intrinsics.checkParameterIsNotNull(child, "child");
            if (!isDisposed()) {
                this.f108605c.onNext(new ViewGroupHierarchyChildViewAddEvent(this.f108604b, child));
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            Intrinsics.checkParameterIsNotNull(child, "child");
            if (!isDisposed()) {
                this.f108605c.onNext(new ViewGroupHierarchyChildViewRemoveEvent(this.f108604b, child));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108604b.setOnHierarchyChangeListener(null);
        }
    }

    public C23067y22(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f108603a = viewGroup;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewGroup$OnHierarchyChangeListenerC17094a viewGroup$OnHierarchyChangeListenerC17094a = new ViewGroup$OnHierarchyChangeListenerC17094a(this.f108603a, observer);
        observer.onSubscribe(viewGroup$OnHierarchyChangeListenerC17094a);
        this.f108603a.setOnHierarchyChangeListener(viewGroup$OnHierarchyChangeListenerC17094a);
    }
}
