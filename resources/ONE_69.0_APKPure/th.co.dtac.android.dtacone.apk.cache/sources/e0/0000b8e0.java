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
    public static class C9073a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f58243a;

        public C9073a(AutoCompleteTextView autoCompleteTextView) {
            this.f58243a = autoCompleteTextView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58243a.setCompletionHint(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxAutoCompleteTextView$b */
    /* loaded from: classes5.dex */
    public static class C9074b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f58244a;

        public C9074b(AutoCompleteTextView autoCompleteTextView) {
            this.f58244a = autoCompleteTextView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58244a.setThreshold(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> completionHint(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C9073a(autoCompleteTextView);
    }

    @NonNull
    @CheckResult
    public static Observable<AdapterViewItemClickEvent> itemClickEvents(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C1782Z7(autoCompleteTextView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> threshold(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new C9074b(autoCompleteTextView);
    }
}