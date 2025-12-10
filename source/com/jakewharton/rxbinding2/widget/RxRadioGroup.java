package com.jakewharton.rxbinding2.widget;

import android.widget.RadioGroup;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxRadioGroup {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxRadioGroup$a */
    /* loaded from: classes5.dex */
    public static class C9095a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup f58242a;

        public C9095a(RadioGroup radioGroup) {
            this.f58242a = radioGroup;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            if (num.intValue() == -1) {
                this.f58242a.clearCheck();
            } else {
                this.f58242a.check(num.intValue());
            }
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> checked(@NonNull RadioGroup radioGroup) {
        Preconditions.checkNotNull(radioGroup, "view == null");
        return new C9095a(radioGroup);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Integer> checkedChanges(@NonNull RadioGroup radioGroup) {
        Preconditions.checkNotNull(radioGroup, "view == null");
        return new C23205yr1(radioGroup);
    }
}
