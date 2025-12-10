package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20834l32 extends Observable {

    /* renamed from: a */
    public final View f71523a;

    /* renamed from: b */
    public final Function1 f71524b;

    /* renamed from: l32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnTouchListenerC12193a extends MainThreadDisposable implements View.OnTouchListener {

        /* renamed from: b */
        public final View f71525b;

        /* renamed from: c */
        public final Function1 f71526c;

        /* renamed from: d */
        public final Observer f71527d;

        public View$OnTouchListenerC12193a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f71525b = view;
            this.f71526c = handled;
            this.f71527d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f71525b.setOnTouchListener(null);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f71526c.invoke(event)).booleanValue()) {
                        this.f71527d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f71527d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C20834l32(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f71523a = view;
        this.f71524b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnTouchListenerC12193a view$OnTouchListenerC12193a = new View$OnTouchListenerC12193a(this.f71523a, this.f71524b, observer);
        observer.onSubscribe(view$OnTouchListenerC12193a);
        this.f71523a.setOnTouchListener(view$OnTouchListenerC12193a);
    }
}
