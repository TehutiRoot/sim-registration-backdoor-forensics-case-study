package p000;

import android.widget.CompoundButton;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zv */
/* loaded from: classes5.dex */
public final class C17250zv extends InitialValueObservable {

    /* renamed from: a */
    public final CompoundButton f109530a;

    /* renamed from: zv$a */
    /* loaded from: classes5.dex */
    public static final class C17251a extends MainThreadDisposable implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final CompoundButton f109531b;

        /* renamed from: c */
        public final Observer f109532c;

        public C17251a(CompoundButton view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f109531b = view;
            this.f109532c = observer;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkParameterIsNotNull(compoundButton, "compoundButton");
            if (!isDisposed()) {
                this.f109532c.onNext(Boolean.valueOf(z));
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f109531b.setOnCheckedChangeListener(null);
        }
    }

    public C17250zv(CompoundButton view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f109530a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Boolean getInitialValue() {
        return Boolean.valueOf(this.f109530a.isChecked());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17251a c17251a = new C17251a(this.f109530a, observer);
        observer.onSubscribe(c17251a);
        this.f109530a.setOnCheckedChangeListener(c17251a);
    }
}