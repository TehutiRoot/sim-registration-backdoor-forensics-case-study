package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Pr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18268Pr1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f4870a;

    /* renamed from: Pr1$a */
    /* loaded from: classes5.dex */
    public static final class C1129a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f4871b;

        /* renamed from: c */
        public final Observer f4872c;

        public C1129a(RatingBar ratingBar, Observer observer) {
            this.f4871b = ratingBar;
            this.f4872c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4871b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            if (!isDisposed()) {
                this.f4872c.onNext(Float.valueOf(f));
            }
        }
    }

    public C18268Pr1(RatingBar ratingBar) {
        this.f4870a = ratingBar;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public Float getInitialValue() {
        return Float.valueOf(this.f4870a.getRating());
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1129a c1129a = new C1129a(this.f4870a, observer);
        this.f4870a.setOnRatingBarChangeListener(c1129a);
        observer.onSubscribe(c1129a);
    }
}
