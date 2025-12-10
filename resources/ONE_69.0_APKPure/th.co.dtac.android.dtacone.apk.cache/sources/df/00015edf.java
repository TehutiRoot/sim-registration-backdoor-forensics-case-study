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

/* renamed from: v32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22621v32 extends Observable {

    /* renamed from: a */
    public final ViewGroup f107976a;

    /* renamed from: v32$a */
    /* loaded from: classes5.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC16881a extends MainThreadDisposable implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final ViewGroup f107977b;

        /* renamed from: c */
        public final Observer f107978c;

        public ViewGroup$OnHierarchyChangeListenerC16881a(ViewGroup viewGroup, Observer observer) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f107977b = viewGroup;
            this.f107978c = observer;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            Intrinsics.checkParameterIsNotNull(child, "child");
            if (!isDisposed()) {
                this.f107978c.onNext(new ViewGroupHierarchyChildViewAddEvent(this.f107977b, child));
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            Intrinsics.checkParameterIsNotNull(child, "child");
            if (!isDisposed()) {
                this.f107978c.onNext(new ViewGroupHierarchyChildViewRemoveEvent(this.f107977b, child));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f107977b.setOnHierarchyChangeListener(null);
        }
    }

    public C22621v32(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f107976a = viewGroup;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        ViewGroup$OnHierarchyChangeListenerC16881a viewGroup$OnHierarchyChangeListenerC16881a = new ViewGroup$OnHierarchyChangeListenerC16881a(this.f107976a, observer);
        observer.onSubscribe(viewGroup$OnHierarchyChangeListenerC16881a);
        this.f107976a.setOnHierarchyChangeListener(viewGroup$OnHierarchyChangeListenerC16881a);
    }
}