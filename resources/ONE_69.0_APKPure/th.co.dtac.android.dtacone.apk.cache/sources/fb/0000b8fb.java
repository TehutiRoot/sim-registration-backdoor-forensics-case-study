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
    public static class C9090a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58261a;

        public C9090a(TextView textView) {
            this.f58261a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58261a.setText(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$b */
    /* loaded from: classes5.dex */
    public static class C9091b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58262a;

        public C9091b(TextView textView) {
            this.f58262a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58262a.setText(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$c */
    /* loaded from: classes5.dex */
    public static class C9092c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58263a;

        public C9092c(TextView textView) {
            this.f58263a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58263a.setError(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$d */
    /* loaded from: classes5.dex */
    public static class C9093d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58264a;

        public C9093d(TextView textView) {
            this.f58264a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            TextView textView = this.f58264a;
            textView.setError(textView.getContext().getResources().getText(num.intValue()));
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$e */
    /* loaded from: classes5.dex */
    public static class C9094e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58265a;

        public C9094e(TextView textView) {
            this.f58265a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58265a.setHint(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$f */
    /* loaded from: classes5.dex */
    public static class C9095f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58266a;

        public C9095f(TextView textView) {
            this.f58266a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58266a.setHint(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.widget.RxTextView$g */
    /* loaded from: classes5.dex */
    public static class C9096g implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ TextView f58267a;

        public C9096g(TextView textView) {
            this.f58267a = textView;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58267a.setTextColor(num.intValue());
        }
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewAfterTextChangeEvent> afterTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C21308nT1(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewBeforeTextChangeEvent> beforeTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C21654pT1(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> color(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9096g(textView);
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
        return new C9092c(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> errorRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9093d(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> hint(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9094e(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> hintRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9095f(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super CharSequence> text(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9090a(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<TextViewTextChangeEvent> textChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C23038xT1(textView);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> textChanges(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new AT1(textView);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Integer> textRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new C9091b(textView);
    }

    @NonNull
    @CheckResult
    public static Observable<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView, @NonNull Predicate<? super TextViewEditorActionEvent> predicate) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C22346tT1(textView, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Integer> editorActions(@NonNull TextView textView, @NonNull Predicate<? super Integer> predicate) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C22692vT1(textView, predicate);
    }
}