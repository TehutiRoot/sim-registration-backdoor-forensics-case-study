package com.jakewharton.rxbinding2.widget;

import android.widget.CheckedTextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxCheckedTextView {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxCheckedTextView$a */
    /* loaded from: classes5.dex */
    public static class C9075a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ CheckedTextView f58245a;

        public C9075a(CheckedTextView checkedTextView) {
            this.f58245a = checkedTextView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58245a.setChecked(bool.booleanValue());
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> check(@NonNull CheckedTextView checkedTextView) {
        Preconditions.checkNotNull(checkedTextView, "view == null");
        return new C9075a(checkedTextView);
    }
}