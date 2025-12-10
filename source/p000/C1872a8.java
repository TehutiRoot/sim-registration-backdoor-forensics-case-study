package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AdapterViewItemClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a8 */
/* loaded from: classes5.dex */
public final class C1872a8 extends Observable {

    /* renamed from: a */
    public final AutoCompleteTextView f8239a;

    /* renamed from: a8$a */
    /* loaded from: classes5.dex */
    public static final class C1873a extends MainThreadDisposable implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final AutoCompleteTextView f8240b;

        /* renamed from: c */
        public final Observer f8241c;

        public C1873a(AutoCompleteTextView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f8240b = view;
            this.f8241c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f8240b.setOnItemClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView parent, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                this.f8241c.onNext(new AdapterViewItemClickEvent(parent, view, i, j));
            }
        }
    }

    public C1872a8(AutoCompleteTextView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f8239a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1873a c1873a = new C1873a(this.f8239a, observer);
        observer.onSubscribe(c1873a);
        this.f8239a.setOnItemClickListener(c1873a);
    }
}
