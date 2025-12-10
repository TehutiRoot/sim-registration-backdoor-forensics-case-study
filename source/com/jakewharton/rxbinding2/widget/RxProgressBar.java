package com.jakewharton.rxbinding2.widget;

import android.widget.ProgressBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxProgressBar {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$a */
    /* loaded from: classes5.dex */
    public static class C9089a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58236a;

        public C9089a(ProgressBar progressBar) {
            this.f58236a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58236a.incrementProgressBy(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$b */
    /* loaded from: classes5.dex */
    public static class C9090b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58237a;

        public C9090b(ProgressBar progressBar) {
            this.f58237a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58237a.incrementSecondaryProgressBy(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$c */
    /* loaded from: classes5.dex */
    public static class C9091c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58238a;

        public C9091c(ProgressBar progressBar) {
            this.f58238a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58238a.setIndeterminate(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$d */
    /* loaded from: classes5.dex */
    public static class C9092d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58239a;

        public C9092d(ProgressBar progressBar) {
            this.f58239a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58239a.setMax(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$e */
    /* loaded from: classes5.dex */
    public static class C9093e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58240a;

        public C9093e(ProgressBar progressBar) {
            this.f58240a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58240a.setProgress(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$f */
    /* loaded from: classes5.dex */
    public static class C9094f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58241a;

        public C9094f(ProgressBar progressBar) {
            this.f58241a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58241a.setSecondaryProgress(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> incrementProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9089a(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> incrementSecondaryProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9090b(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> indeterminate(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9091c(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> max(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9092d(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> progress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9093e(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> secondaryProgress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9094f(progressBar);
    }
}
