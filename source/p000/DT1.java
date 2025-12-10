package p000;

import android.view.MenuItem;
import android.widget.Toolbar;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: DT1 */
/* loaded from: classes5.dex */
public final class DT1 extends Observable {

    /* renamed from: a */
    public final Toolbar f1005a;

    /* renamed from: DT1$a */
    /* loaded from: classes5.dex */
    public static final class C0253a extends MainThreadDisposable implements Toolbar.OnMenuItemClickListener {

        /* renamed from: b */
        public final Toolbar f1006b;

        /* renamed from: c */
        public final Observer f1007c;

        public C0253a(Toolbar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f1006b = view;
            this.f1007c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f1006b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            if (!isDisposed()) {
                this.f1007c.onNext(item);
                return true;
            }
            return false;
        }
    }

    public DT1(Toolbar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f1005a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0253a c0253a = new C0253a(this.f1005a, observer);
        observer.onSubscribe(c0253a);
        this.f1005a.setOnMenuItemClickListener(c0253a);
    }
}
