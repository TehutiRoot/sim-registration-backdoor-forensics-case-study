package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AdapterViewItemClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2 */
/* loaded from: classes5.dex */
public final class C5417c2 extends Observable {

    /* renamed from: a */
    public final AdapterView f39310a;

    /* renamed from: c2$a */
    /* loaded from: classes5.dex */
    public static final class C5418a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AdapterView f39311b;

        /* renamed from: c */
        public final Observer f39312c;

        public C5418a(AdapterView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f39311b = view;
            this.f39312c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f39311b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView parent, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                this.f39312c.onNext(new AdapterViewItemClickEvent(parent, view, i, j));
            }
        }
    }

    public C5417c2(AdapterView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f39310a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C5418a c5418a = new C5418a(this.f39310a, observer);
        observer.onSubscribe(c5418a);
        this.f39310a.setOnItemClickListener(c5418a);
    }
}
