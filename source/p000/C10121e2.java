package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e2 */
/* loaded from: classes5.dex */
public final class C10121e2 extends Observable {

    /* renamed from: a */
    public final AdapterView f61391a;

    /* renamed from: e2$a */
    /* loaded from: classes5.dex */
    public static final class C10122a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AdapterView f61392b;

        /* renamed from: c */
        public final Observer f61393c;

        public C10122a(AdapterView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61392b = view;
            this.f61393c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61392b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(adapterView, "adapterView");
            if (!isDisposed()) {
                this.f61393c.onNext(Integer.valueOf(i));
            }
        }
    }

    public C10121e2(AdapterView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f61391a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10122a c10122a = new C10122a(this.f61391a, observer);
        observer.onSubscribe(c10122a);
        this.f61391a.setOnItemClickListener(c10122a);
    }
}
