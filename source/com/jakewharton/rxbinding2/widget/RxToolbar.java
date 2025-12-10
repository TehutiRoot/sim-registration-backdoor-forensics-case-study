package com.jakewharton.rxbinding2.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

@RequiresApi(21)
/* loaded from: classes5.dex */
public final class RxToolbar {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$a */
    /* loaded from: classes5.dex */
    public static class C9108a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58256a;

        public C9108a(Toolbar toolbar) {
            this.f58256a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58256a.setTitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$b */
    /* loaded from: classes5.dex */
    public static class C9109b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58257a;

        public C9109b(Toolbar toolbar) {
            this.f58257a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58257a.setTitle(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$c */
    /* loaded from: classes5.dex */
    public static class C9110c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58258a;

        public C9110c(Toolbar toolbar) {
            this.f58258a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58258a.setSubtitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$d */
    /* loaded from: classes5.dex */
    public static class C9111d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58259a;

        public C9111d(Toolbar toolbar) {
            this.f58259a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58259a.setSubtitle(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItem> itemClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new CT1(toolbar);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> navigationClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new ET1(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> subtitle(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9110c(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> subtitleRes(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9111d(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> title(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9108a(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> titleRes(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9109b(toolbar);
    }
}
