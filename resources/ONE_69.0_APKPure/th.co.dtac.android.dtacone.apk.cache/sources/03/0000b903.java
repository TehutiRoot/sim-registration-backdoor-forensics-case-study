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
    public static class C9097a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58268a;

        public C9097a(Toolbar toolbar) {
            this.f58268a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58268a.setTitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$b */
    /* loaded from: classes5.dex */
    public static class C9098b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58269a;

        public C9098b(Toolbar toolbar) {
            this.f58269a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58269a.setTitle(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$c */
    /* loaded from: classes5.dex */
    public static class C9099c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58270a;

        public C9099c(Toolbar toolbar) {
            this.f58270a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58270a.setSubtitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxToolbar$d */
    /* loaded from: classes5.dex */
    public static class C9100d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f58271a;

        public C9100d(Toolbar toolbar) {
            this.f58271a = toolbar;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58271a.setSubtitle(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItem> itemClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C23386zU1(toolbar);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> navigationClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new BU1(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> subtitle(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9099c(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> subtitleRes(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9100d(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> title(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9097a(toolbar);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> titleRes(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return new C9098b(toolbar);
    }
}