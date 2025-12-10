package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AdapterViewItemLongClickEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g2 */
/* loaded from: classes5.dex */
public final class C10267g2 extends Observable {

    /* renamed from: a */
    public final AdapterView f62018a;

    /* renamed from: b */
    public final Function1 f62019b;

    /* renamed from: g2$a */
    /* loaded from: classes5.dex */
    public static final class C10268a extends MainThreadDisposable implements AdapterView.OnItemLongClickListener {

        /* renamed from: b */
        public final AdapterView f62020b;

        /* renamed from: c */
        public final Observer f62021c;

        /* renamed from: d */
        public final Function1 f62022d;

        public C10268a(AdapterView view, Observer observer, Function1 handled) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            this.f62020b = view;
            this.f62021c = observer;
            this.f62022d = handled;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62020b.setOnItemLongClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView parent, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                AdapterViewItemLongClickEvent adapterViewItemLongClickEvent = new AdapterViewItemLongClickEvent(parent, view, i, j);
                try {
                    if (((Boolean) this.f62022d.invoke(adapterViewItemLongClickEvent)).booleanValue()) {
                        this.f62021c.onNext(adapterViewItemLongClickEvent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f62021c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C10267g2(AdapterView view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f62018a = view;
        this.f62019b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10268a c10268a = new C10268a(this.f62018a, observer, this.f62019b);
        observer.onSubscribe(c10268a);
        this.f62018a.setOnItemLongClickListener(c10268a);
    }
}
