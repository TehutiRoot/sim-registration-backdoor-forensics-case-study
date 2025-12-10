package com.jakewharton.rxbinding2.view;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.internal.Functions;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* loaded from: classes5.dex */
public final class RxMenuItem {

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$a */
    /* loaded from: classes5.dex */
    public static class C9070a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58216a;

        public C9070a(MenuItem menuItem) {
            this.f58216a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58216a.setChecked(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$b */
    /* loaded from: classes5.dex */
    public static class C9071b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58217a;

        public C9071b(MenuItem menuItem) {
            this.f58217a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58217a.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$c */
    /* loaded from: classes5.dex */
    public static class C9072c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58218a;

        public C9072c(MenuItem menuItem) {
            this.f58218a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Drawable drawable) {
            this.f58218a.setIcon(drawable);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$d */
    /* loaded from: classes5.dex */
    public static class C9073d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58219a;

        public C9073d(MenuItem menuItem) {
            this.f58219a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58219a.setIcon(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$e */
    /* loaded from: classes5.dex */
    public static class C9074e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58220a;

        public C9074e(MenuItem menuItem) {
            this.f58220a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58220a.setTitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$f */
    /* loaded from: classes5.dex */
    public static class C9075f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58221a;

        public C9075f(MenuItem menuItem) {
            this.f58221a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58221a.setTitle(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$g */
    /* loaded from: classes5.dex */
    public static class C9076g implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58222a;

        public C9076g(MenuItem menuItem) {
            this.f58222a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58222a.setVisible(bool.booleanValue());
        }
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C19423cs0(menuItem, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> checked(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9070a(menuItem);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C19939fs0(menuItem, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> enabled(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9071b(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Drawable> icon(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9072c(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Integer> iconRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9073d(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super CharSequence> title(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9074e(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Integer> titleRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9075f(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> visible(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9076g(menuItem);
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem, @NonNull Predicate<? super MenuItemActionViewEvent> predicate) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C19423cs0(menuItem, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull MenuItem menuItem, @NonNull Predicate<? super MenuItem> predicate) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C19939fs0(menuItem, predicate);
    }
}
