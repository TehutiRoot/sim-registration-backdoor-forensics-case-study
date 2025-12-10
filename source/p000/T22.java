package p000;

import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T22 */
/* loaded from: classes5.dex */
public final class T22 extends Observable {

    /* renamed from: a */
    public final View f5903a;

    /* renamed from: b */
    public final Function0 f5904b;

    /* renamed from: T22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnLongClickListenerC1360a extends MainThreadDisposable implements View.OnLongClickListener {

        /* renamed from: b */
        public final View f5905b;

        /* renamed from: c */
        public final Function0 f5906c;

        /* renamed from: d */
        public final Observer f5907d;

        public View$OnLongClickListenerC1360a(View view, Function0 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f5905b = view;
            this.f5906c = handled;
            this.f5907d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f5905b.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f5906c.invoke()).booleanValue()) {
                        this.f5907d.onNext(Unit.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f5907d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public T22(View view, Function0 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f5903a = view;
        this.f5904b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnLongClickListenerC1360a view$OnLongClickListenerC1360a = new View$OnLongClickListenerC1360a(this.f5903a, this.f5904b, observer);
        observer.onSubscribe(view$OnLongClickListenerC1360a);
        this.f5903a.setOnLongClickListener(view$OnLongClickListenerC1360a);
    }
}
