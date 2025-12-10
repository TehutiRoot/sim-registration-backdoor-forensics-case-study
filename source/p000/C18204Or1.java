package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.RatingBarChangeEvent;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Or1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18204Or1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f4518a;

    /* renamed from: Or1$a */
    /* loaded from: classes5.dex */
    public static final class C1046a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f4519b;

        /* renamed from: c */
        public final Observer f4520c;

        public C1046a(RatingBar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f4519b = view;
            this.f4520c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f4519b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            Intrinsics.checkParameterIsNotNull(ratingBar, "ratingBar");
            if (!isDisposed()) {
                this.f4520c.onNext(new RatingBarChangeEvent(ratingBar, f, z));
            }
        }
    }

    public C18204Or1(RatingBar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f4518a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public RatingBarChangeEvent getInitialValue() {
        RatingBar ratingBar = this.f4518a;
        return new RatingBarChangeEvent(ratingBar, ratingBar.getRating(), false);
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1046a c1046a = new C1046a(this.f4518a, observer);
        this.f4518a.setOnRatingBarChangeListener(c1046a);
        observer.onSubscribe(c1046a);
    }
}
