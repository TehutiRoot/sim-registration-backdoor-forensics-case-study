package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20659k22 extends Observable {

    /* renamed from: a */
    public final View f67789a;

    /* renamed from: k22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnClickListenerC11619a extends MainThreadDisposable implements View.OnClickListener {

        /* renamed from: b */
        public final View f67790b;

        /* renamed from: c */
        public final Observer f67791c;

        public View$OnClickListenerC11619a(View view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f67790b = view;
            this.f67791c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                this.f67791c.onNext(Unit.INSTANCE);
            }
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f67790b.setOnClickListener(null);
        }
    }

    public C20659k22(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f67789a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnClickListenerC11619a view$OnClickListenerC11619a = new View$OnClickListenerC11619a(this.f67789a, observer);
        observer.onSubscribe(view$OnClickListenerC11619a);
        this.f67789a.setOnClickListener(view$OnClickListenerC11619a);
    }
}
