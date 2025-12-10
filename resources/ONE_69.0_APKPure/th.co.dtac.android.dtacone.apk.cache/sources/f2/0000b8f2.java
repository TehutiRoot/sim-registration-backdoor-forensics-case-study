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
    public static class C9085a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RatingBar f58255a;

        public C9085a(RatingBar ratingBar) {
            this.f58255a = ratingBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Float f) {
            this.f58255a.setRating(f.floatValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxRatingBar$b */
    /* loaded from: classes5.dex */
    public static class C9086b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RatingBar f58256a;

        public C9086b(RatingBar ratingBar) {
            this.f58256a = ratingBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58256a.setIsIndicator(bool.booleanValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> isIndicator(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C9086b(ratingBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Float> rating(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C9085a(ratingBar);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<RatingBarChangeEvent> ratingChangeEvents(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C17984Ks1(ratingBar);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Float> ratingChanges(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new C18114Ms1(ratingBar);
    }
}