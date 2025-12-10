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
    public static class C9088a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextSwitcher f58259a;

        public C9088a(TextSwitcher textSwitcher) {
            this.f58259a = textSwitcher;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58259a.setText(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextSwitcher$b */
    /* loaded from: classes5.dex */
    public static class C9089b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextSwitcher f58260a;

        public C9089b(TextSwitcher textSwitcher) {
            this.f58260a = textSwitcher;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58260a.setCurrentText(charSequence);
        }
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> currentText(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new C9089b(textSwitcher);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> text(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new C9088a(textSwitcher);
    }
}