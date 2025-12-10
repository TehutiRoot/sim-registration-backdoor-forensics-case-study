package com.jakewharton.rxbinding2.widget;

import android.widget.TextSwitcher;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class RxTextSwitcher {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextSwitcher$a */
    /* loaded from: classes5.dex */
    public static class C9099a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextSwitcher f58247a;

        public C9099a(TextSwitcher textSwitcher) {
            this.f58247a = textSwitcher;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58247a.setText(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextSwitcher$b */
    /* loaded from: classes5.dex */
    public static class C9100b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextSwitcher f58248a;

        public C9100b(TextSwitcher textSwitcher) {
            this.f58248a = textSwitcher;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58248a.setCurrentText(charSequence);
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> currentText(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new C9100b(textSwitcher);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> text(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new C9099a(textSwitcher);
    }
}
