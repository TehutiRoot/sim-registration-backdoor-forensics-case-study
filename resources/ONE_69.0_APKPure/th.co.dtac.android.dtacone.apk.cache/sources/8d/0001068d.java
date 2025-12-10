package p000;

import android.view.DragEvent;
import android.view.View;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21756q32 extends Observable {

    /* renamed from: a */
    public final View f77060a;

    /* renamed from: b */
    public final Function1 f77061b;

    /* renamed from: q32$a */
    /* loaded from: classes5.dex */
    public static final class View$OnDragListenerC13157a extends MainThreadDisposable implements View.OnDragListener {

        /* renamed from: b */
        public final View f77062b;

        /* renamed from: c */
        public final Function1 f77063c;

        /* renamed from: d */
        public final Observer f77064d;

        public View$OnDragListenerC13157a(View view, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f77062b = view;
            this.f77063c = handled;
            this.f77064d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f77062b.setOnDragListener(null);
        }

        @Override // android.view.View.OnDragListener
        public boolean onDrag(View v, DragEvent event) {
            Intrinsics.checkParameterIsNotNull(v, "v");
            Intrinsics.checkParameterIsNotNull(event, "event");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f77063c.invoke(event)).booleanValue()) {
                        this.f77064d.onNext(event);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f77064d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C21756q32(View view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f77060a = view;
        this.f77061b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        View$OnDragListenerC13157a view$OnDragListenerC13157a = new View$OnDragListenerC13157a(this.f77060a, this.f77061b, observer);
        observer.onSubscribe(view$OnDragListenerC13157a);
        this.f77060a.setOnDragListener(view$OnDragListenerC13157a);
    }
}