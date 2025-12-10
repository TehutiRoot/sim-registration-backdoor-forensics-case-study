package p000;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i42  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C20375i42 extends Observable {

    /* renamed from: a */
    public final View f62749a;

    /* renamed from: b */
    public final Function1 f62750b;

    /* renamed from: i42$a */
    /* loaded from: classes5.dex */
    public static final class View$OnTouchListenerC10426a extends MainThreadDisposable implements View.OnTouchListener {

        /* renamed from: b */
        public final View f62751b;

        /* renamed from: c */
        public final Function1 f62752c;

        /* renamed from: d */
        public final Observer f62753d;

        public View$OnTouchListenerC10426a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f62751b = view;
            this.f62752c = handled;
            this.f62753d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62751b.setOnTouchListener(null);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f62752c.invoke(event)).booleanValue()) {
                        this.f62753d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f62753d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C20375i42(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f62749a = view;
        this.f62750b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnTouchListenerC10426a view$OnTouchListenerC10426a = new View$OnTouchListenerC10426a(this.f62749a, this.f62750b, observer);
        observer.onSubscribe(view$OnTouchListenerC10426a);
        this.f62749a.setOnTouchListener(view$OnTouchListenerC10426a);
    }
}