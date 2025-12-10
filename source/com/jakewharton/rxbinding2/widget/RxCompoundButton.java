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
    public static class C9087a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton f58234a;

        public C9087a(CompoundButton compoundButton) {
            this.f58234a = compoundButton;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58234a.setChecked(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxCompoundButton$b */
    /* loaded from: classes5.dex */
    public static class C9088b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton f58235a;

        public C9088b(CompoundButton compoundButton) {
            this.f58235a = compoundButton;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f58235a.toggle();
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> checked(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C9087a(compoundButton);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Boolean> checkedChanges(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C17158yv(compoundButton);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Object> toggle(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new C9088b(compoundButton);
    }
}
