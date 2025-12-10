package p000;

import android.view.MenuItem;
import android.widget.Toolbar;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: AU1 */
/* loaded from: classes5.dex */
public final class AU1 extends Observable {

    /* renamed from: a */
    public final Toolbar f110a;

    /* renamed from: AU1$a */
    /* loaded from: classes5.dex */
    public static final class C0033a extends MainThreadDisposable implements Toolbar.OnMenuItemClickListener {

        /* renamed from: b */
        public final Toolbar f111b;

        /* renamed from: c */
        public final Observer f112c;

        public C0033a(Toolbar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f111b = view;
            this.f112c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f111b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            if (!isDisposed()) {
                this.f112c.onNext(item);
                return true;
            }
            return false;
        }
    }

    public AU1(Toolbar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f110a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0033a c0033a = new C0033a(this.f110a, observer);
        observer.onSubscribe(c0033a);
        this.f110a.setOnMenuItemClickListener(c0033a);
    }
}