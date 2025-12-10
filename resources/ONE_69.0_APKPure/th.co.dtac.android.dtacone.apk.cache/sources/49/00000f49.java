package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q32 */
/* loaded from: classes5.dex */
public final class Q32 extends Observable {

    /* renamed from: a */
    public final View f5102a;

    /* renamed from: b */
    public final Function0 f5103b;

    /* renamed from: Q32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLongClickListenerC1134a extends MainThreadDisposable implements View.OnLongClickListener {

        /* renamed from: b */
        public final View f5104b;

        /* renamed from: c */
        public final Function0 f5105c;

        /* renamed from: d */
        public final Observer f5106d;

        public View$OnLongClickListenerC1134a(View view, Function0 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f5104b = view;
            this.f5105c = handled;
            this.f5106d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f5104b.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f5105c.invoke()).booleanValue()) {
                        this.f5106d.onNext(Unit.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f5106d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public Q32(View view, Function0 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f5102a = view;
        this.f5103b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLongClickListenerC1134a view$OnLongClickListenerC1134a = new View$OnLongClickListenerC1134a(this.f5102a, this.f5103b, observer);
        observer.onSubscribe(view$OnLongClickListenerC1134a);
        this.f5102a.setOnLongClickListener(view$OnLongClickListenerC1134a);
    }
}