package com.jakewharton.rxbinding2.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxRatingBar {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxRatingBar$a */
    /* loaded from: classes5.dex */
    public static class C9096a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RatingBar f58243a;

        public C9096a(RatingBar ratingBar) {
            this.f58243a = ratingBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Float f) {
            this.f58243a.setRating(f.floatValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxRatingBar$b */
    /* loaded from: classes5.dex */
    public static class C9097b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RatingBar f58244a;

        public C9097b(RatingBar ratingBar) {
            this.f58244a = ratingBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58244a.setIsIndicator(bool.booleanValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> isIndicator(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C9097b(ratingBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Float> rating(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C9096a(ratingBar);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<RatingBarChangeEvent> ratingChangeEvents(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C18140Nr1(ratingBar);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Float> ratingChanges(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C18268Pr1(ratingBar);
    }
}
