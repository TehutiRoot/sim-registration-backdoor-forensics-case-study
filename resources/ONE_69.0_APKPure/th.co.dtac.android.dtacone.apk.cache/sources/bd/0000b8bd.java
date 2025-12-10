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
    public static class C9059a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58228a;

        public C9059a(MenuItem menuItem) {
            this.f58228a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58228a.setChecked(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$b */
    /* loaded from: classes5.dex */
    public static class C9060b implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58229a;

        public C9060b(MenuItem menuItem) {
            this.f58229a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58229a.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$c */
    /* loaded from: classes5.dex */
    public static class C9061c implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58230a;

        public C9061c(MenuItem menuItem) {
            this.f58230a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Drawable drawable) {
            this.f58230a.setIcon(drawable);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$d */
    /* loaded from: classes5.dex */
    public static class C9062d implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58231a;

        public C9062d(MenuItem menuItem) {
            this.f58231a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58231a.setIcon(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$e */
    /* loaded from: classes5.dex */
    public static class C9063e implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58232a;

        public C9063e(MenuItem menuItem) {
            this.f58232a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(CharSequence charSequence) {
            this.f58232a.setTitle(charSequence);
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$f */
    /* loaded from: classes5.dex */
    public static class C9064f implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58233a;

        public C9064f(MenuItem menuItem) {
            this.f58233a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Integer num) {
            this.f58233a.setTitle(num.intValue());
        }
    }

    /* renamed from: com.jakewharton.rxbinding2.view.RxMenuItem$g */
    /* loaded from: classes5.dex */
    public static class C9065g implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ MenuItem f58234a;

        public C9065g(MenuItem menuItem) {
            this.f58234a = menuItem;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Boolean bool) {
            this.f58234a.setVisible(bool.booleanValue());
        }
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C20510is0(menuItem, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> checked(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9059a(menuItem);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C21029ls0(menuItem, Functions.PREDICATE_ALWAYS_TRUE);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> enabled(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9060b(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Drawable> icon(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9061c(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Integer> iconRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9062d(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super CharSequence> title(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9063e(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Integer> titleRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9064f(menuItem);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static Consumer<? super Boolean> visible(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new C9065g(menuItem);
    }

    @NonNull
    @CheckResult
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem, @NonNull Predicate<? super MenuItemActionViewEvent> predicate) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C20510is0(menuItem, predicate);
    }

    @NonNull
    @CheckResult
    public static Observable<Object> clicks(@NonNull MenuItem menuItem, @NonNull Predicate<? super MenuItem> predicate) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(predicate, "handled == null");
        return new C21029ls0(menuItem, predicate);
    }
}