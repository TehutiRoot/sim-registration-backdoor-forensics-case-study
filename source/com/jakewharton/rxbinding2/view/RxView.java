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
    public static class C9077a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58223a;

        public C9077a(View view) {
            this.f58223a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58223a.setActivated(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$b */
    /* loaded from: classes5.dex */
    public static class C9078b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58224a;

        public C9078b(View view) {
            this.f58224a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58224a.setClickable(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$c */
    /* loaded from: classes5.dex */
    public static class C9079c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58225a;

        public C9079c(View view) {
            this.f58225a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58225a.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$d */
    /* loaded from: classes5.dex */
    public static class C9080d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58226a;

        public C9080d(View view) {
            this.f58226a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58226a.setPressed(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$e */
    /* loaded from: classes5.dex */
    public static class C9081e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58227a;

        public C9081e(View view) {
            this.f58227a = view;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58227a.setSelected(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxView$f */
    /* loaded from: classes5.dex */
    public static class C9082f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f58228a;

        /* renamed from: b */
        public final /* synthetic */ int f58229b;

        public C9082f(View view, int i) {
            this.f58228a = view;
            this.f58229b = i;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            int i;
            View view = this.f58228a;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = this.f58229b;
            }
            view.setVisibility(i);
        }
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> activated(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9077a(view);
    }

    @NonNull
    @CheckResult
    public static Observable<ViewAttachEvent> attachEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19799f22(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> attaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20143h22(view, true);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> clickable(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9078b(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20487j22(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> detaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20143h22(view, false);
    }

    @NonNull
    @CheckResult
    public static Observable<DragEvent> drags(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C22035s22(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @RequiresApi(16)
    public static Observable<Object> draws(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C21178n32(view);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> enabled(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9079c(view);
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Boolean> focusChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C22551v22(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> globalLayouts(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C21522p32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> hovers(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new E22(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<KeyEvent> keys(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new G22(view, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<ViewLayoutChangeEvent> layoutChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new O22(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> layoutChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new Q22(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> longClicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new S22(view, Functions.CALLABLE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> preDraws(@NonNull View view, @NonNull Callable<Boolean> callable) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(callable, "proceedDrawingPass == null");
        return new C21866r32(view, callable);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> pressed(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9080d(view);
    }

    @NonNull
    @CheckResult
    @RequiresApi(23)
    public static Observable<ViewScrollChangeEvent> scrollChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C19630e32(view);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> selected(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C9081e(view);
    }

    @NonNull
    @CheckResult
    public static Observable<Integer> systemUiVisibilityChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20146h32(view);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> touches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new C20662k32(view, Functions.PREDICATE_ALWAYS_TRUE);
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
        return new C22035s22(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> hovers(@NonNull View view, @NonNull Predicate<? super MotionEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new E22(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<KeyEvent> keys(@NonNull View view, @NonNull Predicate<? super KeyEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new G22(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> longClicks(@NonNull View view, @NonNull Callable<Boolean> callable) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(callable, "handled == null");
        return new S22(view, callable);
    }

    @NonNull
    @CheckResult
    public static Observable<MotionEvent> touches(@NonNull View view, @NonNull Predicate<? super MotionEvent> predicate) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C20662k32(view, predicate);
    }

    @NonNull
    @CheckResult
    public static Consumer<? super Boolean> visibility(@NonNull View view, int i) {
        Preconditions.checkNotNull(view, "view == null");
        if (i != 0) {
            if (i != 4 && i != 8) {
                throw new IllegalArgumentException("Must set visibility to INVISIBLE or GONE when false.");
            }
            return new C9082f(view, i);
        }
        throw new IllegalArgumentException("Setting visibility to VISIBLE when false would have no effect.");
    }
}
