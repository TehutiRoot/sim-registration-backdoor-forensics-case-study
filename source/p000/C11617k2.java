package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k2 */
/* loaded from: classes5.dex */
public final class C11617k2 extends InitialValueObservable {

    /* renamed from: a */
    public final AdapterView f67783a;

    /* renamed from: k2$a */
    /* loaded from: classes5.dex */
    public static final class C11618a extends MainThreadDisposable implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final AdapterView f67784b;

        /* renamed from: c */
        public final Observer f67785c;

        public C11618a(AdapterView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f67784b = view;
            this.f67785c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67784b.setOnItemSelectedListener(null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(adapterView, "adapterView");
            if (!isDisposed()) {
                this.f67785c.onNext(Integer.valueOf(i));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
            Intrinsics.checkParameterIsNotNull(adapterView, "adapterView");
            if (!isDisposed()) {
                this.f67785c.onNext(-1);
            }
        }
    }

    public C11617k2(AdapterView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f67783a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f67783a.getSelectedItemPosition());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C11618a c11618a = new C11618a(this.f67783a, observer);
        this.f67783a.setOnItemSelectedListener(c11618a);
        observer.onSubscribe(c11618a);
    }
}
