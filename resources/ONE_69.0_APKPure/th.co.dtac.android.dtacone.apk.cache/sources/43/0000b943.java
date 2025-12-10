package com.jakewharton.rxbinding3.widget;

import android.view.View;
import android.widget.Toolbar;
import androidx.annotation.RequiresApi;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(21)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lcom/jakewharton/rxbinding3/widget/ToolbarNavigationClickObservable;", "Lio/reactivex/Observable;", "", "Landroid/widget/Toolbar;", Promotion.ACTION_VIEW, "<init>", "(Landroid/widget/Toolbar;)V", "Lio/reactivex/Observer;", "observer", "subscribeActual", "(Lio/reactivex/Observer;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/Toolbar;", "rxbinding_release"}, m29141k = 1, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class ToolbarNavigationClickObservable extends Observable<Unit> {

    /* renamed from: a */
    public final Toolbar f58344a;

    /* renamed from: com.jakewharton.rxbinding3.widget.ToolbarNavigationClickObservable$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC9103a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final Toolbar f58345b;

        /* renamed from: c */
        public final Observer f58346c;

        public View$OnClickListenerC9103a(Toolbar view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f58345b = view;
            this.f58346c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f58346c.onNext(Unit.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f58345b.setNavigationOnClickListener(null);
        }
    }

    public ToolbarNavigationClickObservable(@NotNull Toolbar view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f58344a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super Unit> observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC9103a view$OnClickListenerC9103a = new View$OnClickListenerC9103a(this.f58344a, observer);
        observer.onSubscribe(view$OnClickListenerC9103a);
        this.f58344a.setNavigationOnClickListener(view$OnClickListenerC9103a);
    }
}