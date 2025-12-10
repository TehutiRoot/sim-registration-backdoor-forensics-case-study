package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.RatingBarChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Ks1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17984Ks1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f3430a;

    /* renamed from: Ks1$a */
    /* loaded from: classes5.dex */
    public static final class C0758a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f3431b;

        /* renamed from: c */
        public final Observer f3432c;

        public C0758a(RatingBar ratingBar, Observer observer) {
            this.f3431b = ratingBar;
            this.f3432c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f3431b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            if (!isDisposed()) {
                this.f3432c.onNext(RatingBarChangeEvent.create(ratingBar, f, z));
            }
        }
    }

    public C17984Ks1(RatingBar ratingBar) {
        this.f3430a = ratingBar;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public RatingBarChangeEvent getInitialValue() {
        RatingBar ratingBar = this.f3430a;
        return RatingBarChangeEvent.create(ratingBar, ratingBar.getRating(), false);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0758a c0758a = new C0758a(this.f3430a, observer);
        this.f3430a.setOnRatingBarChangeListener(c0758a);
        observer.onSubscribe(c0758a);
    }
}