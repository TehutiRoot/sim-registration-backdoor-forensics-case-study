package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.SeekBarChangeEvent;
import com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent;
import com.jakewharton.rxbinding2.widget.SeekBarStartChangeEvent;
import com.jakewharton.rxbinding2.widget.SeekBarStopChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: oF1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21385oF1 extends InitialValueObservable {

    /* renamed from: a */
    public final SeekBar f72629a;

    /* renamed from: oF1$a */
    /* loaded from: classes5.dex */
    public static final class C12428a extends MainThreadDisposable implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final SeekBar f72630b;

        /* renamed from: c */
        public final Observer f72631c;

        public C12428a(SeekBar seekBar, Observer observer) {
            this.f72630b = seekBar;
            this.f72631c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f72630b.setOnSeekBarChangeListener(null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!isDisposed()) {
                this.f72631c.onNext(SeekBarProgressChangeEvent.create(seekBar, i, z));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            if (!isDisposed()) {
                this.f72631c.onNext(SeekBarStartChangeEvent.create(seekBar));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (!isDisposed()) {
                this.f72631c.onNext(SeekBarStopChangeEvent.create(seekBar));
            }
        }
    }

    public C21385oF1(SeekBar seekBar) {
        this.f72629a = seekBar;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public SeekBarChangeEvent getInitialValue() {
        SeekBar seekBar = this.f72629a;
        return SeekBarProgressChangeEvent.create(seekBar, seekBar.getProgress(), false);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C12428a c12428a = new C12428a(this.f72629a, observer);
        this.f72629a.setOnSeekBarChangeListener(c12428a);
        observer.onSubscribe(c12428a);
    }
}
