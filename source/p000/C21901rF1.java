package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21901rF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SeekBar f77211a;

    /* renamed from: b */
    public final Boolean f77212b;

    /* renamed from: rF1$a */
    /* loaded from: classes5.dex */
    public static final class C13241a extends MainThreadDisposable implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final SeekBar f77213b;

        /* renamed from: c */
        public final Boolean f77214c;

        /* renamed from: d */
        public final Observer f77215d;

        public C13241a(SeekBar view, Boolean bool, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f77213b = view;
            this.f77214c = bool;
            this.f77215d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f77213b.setOnSeekBarChangeListener(null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            if (!isDisposed()) {
                Boolean bool = this.f77214c;
                if (bool == null || Intrinsics.areEqual(bool, Boolean.valueOf(z))) {
                    this.f77215d.onNext(Integer.valueOf(i));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
        }
    }

    public C21901rF1(SeekBar view, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f77211a = view;
        this.f77212b = bool;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f77211a.getProgress());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C13241a c13241a = new C13241a(this.f77211a, this.f77212b, observer);
        this.f77211a.setOnSeekBarChangeListener(c13241a);
        observer.onSubscribe(c13241a);
    }
}
