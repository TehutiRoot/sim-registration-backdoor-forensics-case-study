package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.SeekBarProgressChangeEvent;
import com.jakewharton.rxbinding3.widget.SeekBarStartChangeEvent;
import com.jakewharton.rxbinding3.widget.SeekBarStopChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21557pF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SeekBar f76540a;

    /* renamed from: pF1$a */
    /* loaded from: classes5.dex */
    public static final class C13072a extends MainThreadDisposable implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final SeekBar f76541b;

        /* renamed from: c */
        public final Observer f76542c;

        public C13072a(SeekBar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f76541b = view;
            this.f76542c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76541b.setOnSeekBarChangeListener(null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            if (!isDisposed()) {
                this.f76542c.onNext(new SeekBarProgressChangeEvent(seekBar, i, z));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            if (!isDisposed()) {
                this.f76542c.onNext(new SeekBarStartChangeEvent(seekBar));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            if (!isDisposed()) {
                this.f76542c.onNext(new SeekBarStopChangeEvent(seekBar));
            }
        }
    }

    public C21557pF1(SeekBar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f76540a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public SeekBarProgressChangeEvent getInitialValue() {
        SeekBar seekBar = this.f76540a;
        return new SeekBarProgressChangeEvent(seekBar, seekBar.getProgress(), false);
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C13072a c13072a = new C13072a(this.f76540a, observer);
        this.f76540a.setOnSeekBarChangeListener(c13072a);
        observer.onSubscribe(c13072a);
    }
}
