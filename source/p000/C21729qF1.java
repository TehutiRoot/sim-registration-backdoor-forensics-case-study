package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: qF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21729qF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SeekBar f76932a;

    /* renamed from: b */
    public final Boolean f76933b;

    public C21729qF1(SeekBar seekBar, Boolean bool) {
        this.f76932a = seekBar;
        this.f76933b = bool;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Integer getInitialValue() {
        return Integer.valueOf(this.f76932a.getProgress());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C13170a c13170a = new C13170a(this.f76932a, this.f76933b, observer);
        this.f76932a.setOnSeekBarChangeListener(c13170a);
        observer.onSubscribe(c13170a);
    }

    /* renamed from: qF1$a */
    /* loaded from: classes5.dex */
    public static final class C13170a extends MainThreadDisposable implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final SeekBar f76934b;

        /* renamed from: c */
        public final Boolean f76935c;

        /* renamed from: d */
        public final Observer f76936d;

        public C13170a(SeekBar seekBar, Boolean bool, Observer observer) {
            this.f76934b = seekBar;
            this.f76935c = bool;
            this.f76936d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76934b.setOnSeekBarChangeListener(null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!isDisposed()) {
                Boolean bool = this.f76935c;
                if (bool == null || bool.booleanValue() == z) {
                    this.f76936d.onNext(Integer.valueOf(i));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
