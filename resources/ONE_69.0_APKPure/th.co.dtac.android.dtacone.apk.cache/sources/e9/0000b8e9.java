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
    public static class C9078a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58248a;

        public C9078a(ProgressBar progressBar) {
            this.f58248a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58248a.incrementProgressBy(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$b */
    /* loaded from: classes5.dex */
    public static class C9079b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58249a;

        public C9079b(ProgressBar progressBar) {
            this.f58249a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58249a.incrementSecondaryProgressBy(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$c */
    /* loaded from: classes5.dex */
    public static class C9080c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58250a;

        public C9080c(ProgressBar progressBar) {
            this.f58250a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58250a.setIndeterminate(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$d */
    /* loaded from: classes5.dex */
    public static class C9081d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58251a;

        public C9081d(ProgressBar progressBar) {
            this.f58251a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58251a.setMax(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$e */
    /* loaded from: classes5.dex */
    public static class C9082e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58252a;

        public C9082e(ProgressBar progressBar) {
            this.f58252a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58252a.setProgress(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxProgressBar$f */
    /* loaded from: classes5.dex */
    public static class C9083f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f58253a;

        public C9083f(ProgressBar progressBar) {
            this.f58253a = progressBar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58253a.setSecondaryProgress(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> incrementProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9078a(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> incrementSecondaryProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9079b(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> indeterminate(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9080c(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> max(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9081d(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> progress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9082e(progressBar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> secondaryProgress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new C9083f(progressBar);
    }
}