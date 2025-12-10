package com.jakewharton.rxbinding2.view;

import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Functions;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class RxView {

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$a */
    /* loaded from: classes5.dex */
    public static class C9066a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58235a;

        public C9066a(View view) {
            this.f58235a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58235a.setActivated(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$b */
    /* loaded from: classes5.dex */
    public static class C9067b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58236a;

        public C9067b(View view) {
            this.f58236a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58236a.setClickable(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$c */
    /* loaded from: classes5.dex */
    public static class C9068c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58237a;

        public C9068c(View view) {
            this.f58237a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58237a.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$d */
    /* loaded from: classes5.dex */
    public static class C9069d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58238a;

        public C9069d(View view) {
            this.f58238a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58238a.setPressed(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$e */
    /* loaded from: classes5.dex */
    public static class C9070e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58239a;

        public C9070e(View view) {
            this.f58239a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58239a.setSelected(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$f */
    /* loaded from: classes5.dex */
    public static class C9071f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58240a;

        /* renamed from: b */
        public final /* synthetic */ int f58241b;

        public C9071f(View view, int i) {
            this.f58240a = view;
            this.f58241b = i;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            int i;
            View view = this.f58240a;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = this.f58241b;
            }
            view.setVisibility(i);
        }
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> activated(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9066a(view);
    }

    @NonNull
    @CheckResult
    public static Observable<ViewAttachEvent> attachEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19334c32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> attaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19680e32(view, true);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> clickable(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9067b(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20026g32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> detaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19680e32(view, false);
    }

    @NonNull
    @CheckResult
    public static Observable<DragEvent> drags(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C21583p32(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @RequiresApi(16)
    public static Observable<Object> draws(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20721k42(view);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> enabled(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9068c(view);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Boolean> focusChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C22102s32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> globalLayouts(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C21067m42(view);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> hovers(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new B32(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<KeyEvent> keys(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new D32(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<ViewLayoutChangeEvent> layoutChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new L32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> layoutChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new N32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> longClicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new P32(view, Functions.CALLABLE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> preDraws(@NonNull View view, @NonNull Callable<Boolean> callable) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(callable, "proceedDrawingPass == null");
        return new C21413o42(view, callable);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> pressed(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9069d(view);
    }

    @NonNull
    @CheckResult
    @RequiresApi(23)
    public static Observable<ViewScrollChangeEvent> scrollChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19164b42(view);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> selected(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9070e(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Integer> systemUiVisibilityChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19683e42(view);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> touches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20202h42(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> visibility(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return visibility(view, 8);
    }

    @NonNull
    @CheckResult
    public static Observable<DragEvent> drags(@NonNull View view, @NonNull Predicate<? super DragEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C21583p32(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> hovers(@NonNull View view, @NonNull Predicate<? super MotionEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new B32(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<KeyEvent> keys(@NonNull View view, @NonNull Predicate<? super KeyEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new D32(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> longClicks(@NonNull View view, @NonNull Callable<Boolean> callable) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(callable, "handled == null");
        return new P32(view, callable);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> touches(@NonNull View view, @NonNull Predicate<? super MotionEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C20202h42(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> visibility(@NonNull View view, int i) {
        Preconditions.checkNotNull(view, "view == null");
        if (i != 0) {
            if (i != 4 && i != 8) {
                throw new IllegalArgumentException("Must set visibility to INVISIBLE or GONE when false.");
            }
            return new C9071f(view, i);
        }
        throw new IllegalArgumentException("Setting visibility to VISIBLE when false would have no effect.");
    }
}