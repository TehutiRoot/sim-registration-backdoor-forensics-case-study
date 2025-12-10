package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i2 */
/* loaded from: classes5.dex */
public final class C10436i2 extends Observable {

    /* renamed from: a */
    public final AdapterView f62690a;

    /* renamed from: b */
    public final Function0 f62691b;

    /* renamed from: i2$a */
    /* loaded from: classes5.dex */
    public static final class C10437a extends MainThreadDisposable implements AdapterView.OnItemLongClickListener {

        /* renamed from: b */
        public final AdapterView f62692b;

        /* renamed from: c */
        public final Observer f62693c;

        /* renamed from: d */
        public final Function0 f62694d;

        public C10437a(AdapterView view, Observer observer, Function0 handled) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            this.f62692b = view;
            this.f62693c = observer;
            this.f62694d = handled;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62692b.setOnItemLongClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView parent, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(parent, "parent");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f62694d.invoke()).booleanValue()) {
                        this.f62693c.onNext(Integer.valueOf(i));
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f62693c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C10436i2(AdapterView view, Function0 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f62690a = view;
        this.f62691b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10437a c10437a = new C10437a(this.f62690a, observer, this.f62691b);
        observer.onSubscribe(c10437a);
        this.f62690a.setOnItemLongClickListener(c10437a);
    }
}
