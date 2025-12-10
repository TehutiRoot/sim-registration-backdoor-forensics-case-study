package p000;

import android.widget.PopupMenu;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Zk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18892Zk1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f8121a;

    /* renamed from: Zk1$a */
    /* loaded from: classes5.dex */
    public static final class C1845a extends MainThreadDisposable implements PopupMenu.OnDismissListener {

        /* renamed from: b */
        public final PopupMenu f8122b;

        /* renamed from: c */
        public final Observer f8123c;

        public C1845a(PopupMenu view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f8122b = view;
            this.f8123c = observer;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            Intrinsics.checkParameterIsNotNull(popupMenu, "popupMenu");
            if (!isDisposed()) {
                this.f8123c.onNext(Unit.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8122b.setOnDismissListener(null);
        }
    }

    public C18892Zk1(PopupMenu view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f8121a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1845a c1845a = new C1845a(this.f8121a, observer);
        this.f8121a.setOnDismissListener(c1845a);
        observer.onSubscribe(c1845a);
    }
}
