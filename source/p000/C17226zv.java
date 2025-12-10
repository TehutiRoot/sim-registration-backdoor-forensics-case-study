package p000;

import android.widget.CompoundButton;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zv */
/* loaded from: classes5.dex */
public final class C17226zv extends InitialValueObservable {

    /* renamed from: a */
    public final CompoundButton f109222a;

    /* renamed from: zv$a */
    /* loaded from: classes5.dex */
    public static final class C17227a extends MainThreadDisposable implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final CompoundButton f109223b;

        /* renamed from: c */
        public final Observer f109224c;

        public C17227a(CompoundButton view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f109223b = view;
            this.f109224c = observer;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkParameterIsNotNull(compoundButton, "compoundButton");
            if (!isDisposed()) {
                this.f109224c.onNext(Boolean.valueOf(z));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f109223b.setOnCheckedChangeListener(null);
        }
    }

    public C17226zv(CompoundButton view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f109222a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f109222a.isChecked());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17227a c17227a = new C17227a(this.f109222a, observer);
        observer.onSubscribe(c17227a);
        this.f109222a.setOnCheckedChangeListener(c17227a);
    }
}
