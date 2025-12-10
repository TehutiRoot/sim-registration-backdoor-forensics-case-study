package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18332Qr1 extends InitialValueObservable {

    /* renamed from: a */
    public final RatingBar f5180a;

    /* renamed from: Qr1$a */
    /* loaded from: classes5.dex */
    public static final class C1205a extends MainThreadDisposable implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: b */
        public final RatingBar f5181b;

        /* renamed from: c */
        public final Observer f5182c;

        public C1205a(RatingBar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f5181b = view;
            this.f5182c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f5181b.setOnRatingBarChangeListener(null);
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            Intrinsics.checkParameterIsNotNull(ratingBar, "ratingBar");
            if (!isDisposed()) {
                this.f5182c.onNext(Float.valueOf(f));
            }
        }
    }

    public C18332Qr1(RatingBar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f5180a = view;
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    /* renamed from: d */
    public Float getInitialValue() {
        return Float.valueOf(this.f5180a.getRating());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public void subscribeListener(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C1205a c1205a = new C1205a(this.f5180a, observer);
        this.f5180a.setOnRatingBarChangeListener(c1205a);
        observer.onSubscribe(c1205a);
    }
}
