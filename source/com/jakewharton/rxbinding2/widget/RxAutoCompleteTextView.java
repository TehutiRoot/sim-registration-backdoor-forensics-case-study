package com.jakewharton.rxbinding2.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxAutoCompleteTextView {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxAutoCompleteTextView$a */
    /* loaded from: classes5.dex */
    public static class C9084a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f58231a;

        public C9084a(AutoCompleteTextView autoCompleteTextView) {
            this.f58231a = autoCompleteTextView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58231a.setCompletionHint(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxAutoCompleteTextView$b */
    /* loaded from: classes5.dex */
    public static class C9085b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f58232a;

        public C9085b(AutoCompleteTextView autoCompleteTextView) {
            this.f58232a = autoCompleteTextView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58232a.setThreshold(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> completionHint(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C9084a(autoCompleteTextView);
    }

    @NonNull
    @CheckResult
    public static Observable<AdapterViewItemClickEvent> itemClickEvents(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C1802Z7(autoCompleteTextView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> threshold(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C9085b(autoCompleteTextView);
    }
}
