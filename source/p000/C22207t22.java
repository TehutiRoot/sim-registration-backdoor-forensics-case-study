package p000;

import android.view.DragEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t22  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22207t22 extends Observable {

    /* renamed from: a */
    public final View f79975a;

    /* renamed from: b */
    public final Function1 f79976b;

    /* renamed from: t22$a */
    /* loaded from: classes5.dex */
    public static final class View$OnDragListenerC13968a extends MainThreadDisposable implements View.OnDragListener {

        /* renamed from: b */
        public final View f79977b;

        /* renamed from: c */
        public final Function1 f79978c;

        /* renamed from: d */
        public final Observer f79979d;

        public View$OnDragListenerC13968a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f79977b = view;
            this.f79978c = handled;
            this.f79979d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f79977b.setOnDragListener(null);
        }

        @Override // android.view.View.OnDragListener
        public boolean onDrag(View v, DragEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f79978c.invoke(event)).booleanValue()) {
                        this.f79979d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f79979d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C22207t22(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f79975a = view;
        this.f79976b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnDragListenerC13968a view$OnDragListenerC13968a = new View$OnDragListenerC13968a(this.f79975a, this.f79976b, observer);
        observer.onSubscribe(view$OnDragListenerC13968a);
        this.f79975a.setOnDragListener(view$OnDragListenerC13968a);
    }
}
