package com.jakewharton.rxbinding2.widget;

import android.widget.CompoundButton;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxCompoundButton {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxCompoundButton$a */
    /* loaded from: classes5.dex */
    public static class C9076a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton f58246a;

        public C9076a(CompoundButton compoundButton) {
            this.f58246a = compoundButton;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58246a.setChecked(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxCompoundButton$b */
    /* loaded from: classes5.dex */
    public static class C9077b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton f58247a;

        public C9077b(CompoundButton compoundButton) {
            this.f58247a = compoundButton;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f58247a.toggle();
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> checked(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C9076a(compoundButton);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Boolean> checkedChanges(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C17171yv(compoundButton);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Object> toggle(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C9077b(compoundButton);
    }
}