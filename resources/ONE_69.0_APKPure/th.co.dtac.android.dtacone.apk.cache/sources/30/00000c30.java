package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Ms1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18114Ms1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f3990a;

    /* renamed from: Ms1$a */
    /* loaded from: classes5.dex */
    public static final class C0894a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f3991b;

        /* renamed from: c */
        public final Observer f3992c;

        public C0894a(RatingBar ratingBar, Observer observer) {
            this.f3991b = ratingBar;
            this.f3992c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f3991b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            if (!isDisposed()) {
                this.f3992c.onNext(Float.valueOf(f));
            }
        }
    }

    public C18114Ms1(RatingBar ratingBar) {
        this.f3990a = ratingBar;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Float getInitialValue() {
        return Float.valueOf(this.f3990a.getRating());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0894a c0894a = new C0894a(this.f3990a, observer);
        this.f3990a.setOnRatingBarChangeListener(c0894a);
        observer.onSubscribe(c0894a);
    }
}