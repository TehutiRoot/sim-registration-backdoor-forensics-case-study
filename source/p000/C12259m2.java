package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AdapterViewItemSelectionEvent;
import com.jakewharton.rxbinding3.widget.AdapterViewNothingSelectionEvent;
import com.jakewharton.rxbinding3.widget.AdapterViewSelectionEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m2 */
/* loaded from: classes5.dex */
public final class C12259m2 extends InitialValueObservable {

    /* renamed from: a */
    public final AdapterView f71803a;

    /* renamed from: m2$a */
    /* loaded from: classes5.dex */
    public static final class C12260a extends MainThreadDisposable implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final AdapterView f71804b;

        /* renamed from: c */
        public final Observer f71805c;

        public C12260a(AdapterView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f71804b = view;
            this.f71805c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f71804b.setOnItemSelectedListener(null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView parent, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                this.f71805c.onNext(new AdapterViewItemSelectionEvent(parent, view, i, j));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView parent) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                this.f71805c.onNext(new AdapterViewNothingSelectionEvent(parent));
            }
        }
    }

    public C12259m2(AdapterView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f71803a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public AdapterViewSelectionEvent getInitialValue() {
        int selectedItemPosition = this.f71803a.getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return new AdapterViewNothingSelectionEvent(this.f71803a);
        }
        return new AdapterViewItemSelectionEvent(this.f71803a, this.f71803a.getSelectedView(), selectedItemPosition, this.f71803a.getSelectedItemId());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C12260a c12260a = new C12260a(this.f71803a, observer);
        this.f71803a.setOnItemSelectedListener(c12260a);
        observer.onSubscribe(c12260a);
    }
}
