package com.jakewharton.rxbinding2.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Functions;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* loaded from: classes5.dex */
public final class RxTextView {

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$a */
    /* loaded from: classes5.dex */
    public static class C9101a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58249a;

        public C9101a(TextView textView) {
            this.f58249a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58249a.setText(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$b */
    /* loaded from: classes5.dex */
    public static class C9102b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58250a;

        public C9102b(TextView textView) {
            this.f58250a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58250a.setText(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$c */
    /* loaded from: classes5.dex */
    public static class C9103c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58251a;

        public C9103c(TextView textView) {
            this.f58251a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58251a.setError(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$d */
    /* loaded from: classes5.dex */
    public static class C9104d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58252a;

        public C9104d(TextView textView) {
            this.f58252a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            TextView textView = this.f58252a;
            textView.setError(textView.getContext().getResources().getText(num.intValue()));
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$e */
    /* loaded from: classes5.dex */
    public static class C9105e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58253a;

        public C9105e(TextView textView) {
            this.f58253a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58253a.setHint(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$f */
    /* loaded from: classes5.dex */
    public static class C9106f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58254a;

        public C9106f(TextView textView) {
            this.f58254a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58254a.setHint(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$g */
    /* loaded from: classes5.dex */
    public static class C9107g implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58255a;

        public C9107g(TextView textView) {
            this.f58255a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58255a.setTextColor(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewAfterTextChangeEvent> afterTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C21762qS1(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewBeforeTextChangeEvent> beforeTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C22106sS1(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> color(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9107g(textView);
    }

    @NonNull
    @CheckResult
    public static Observable<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return editorActionEvents(textView, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<Integer> editorActions(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return editorActions(textView, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> error(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9103c(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> errorRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9104d(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> hint(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9105e(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> hintRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9106f(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> text(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9101a(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewTextChangeEvent> textChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new AS1(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> textChanges(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new DS1(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> textRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9102b(textView);
    }

    @NonNull
    @CheckResult
    public static Observable<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView, @NonNull Predicate<? super TextViewEditorActionEvent> predicate) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C22794wS1(textView, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Integer> editorActions(@NonNull TextView textView, @NonNull Predicate<? super Integer> predicate) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C23138yS1(textView, predicate);
    }
}
