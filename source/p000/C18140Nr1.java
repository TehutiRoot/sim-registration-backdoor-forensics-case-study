package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.RatingBarChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: Nr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18140Nr1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f4216a;

    /* renamed from: Nr1$a */
    /* loaded from: classes5.dex */
    public static final class C0973a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f4217b;

        /* renamed from: c */
        public final Observer f4218c;

        public C0973a(RatingBar ratingBar, Observer observer) {
            this.f4217b = ratingBar;
            this.f4218c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4217b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            if (!isDisposed()) {
                this.f4218c.onNext(RatingBarChangeEvent.create(ratingBar, f, z));
            }
        }
    }

    public C18140Nr1(RatingBar ratingBar) {
        this.f4216a = ratingBar;
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    /* renamed from: d */
    public RatingBarChangeEvent getInitialValue() {
        RatingBar ratingBar = this.f4216a;
        return RatingBarChangeEvent.create(ratingBar, ratingBar.getRating(), false);
    }

    @Override // com.jakewharton.rxbinding2.InitialValueObservable
    public void subscribeListener(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C0973a c0973a = new C0973a(this.f4216a, observer);
        this.f4216a.setOnRatingBarChangeListener(c0973a);
        observer.onSubscribe(c0973a);
    }
}
