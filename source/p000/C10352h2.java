package p000;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import java.util.concurrent.Callable;

/* renamed from: h2 */
/* loaded from: classes5.dex */
public final class C10352h2 extends Observable {

    /* renamed from: a */
    public final AdapterView f62375a;

    /* renamed from: b */
    public final Callable f62376b;

    /* renamed from: h2$a */
    /* loaded from: classes5.dex */
    public static final class C10353a extends MainThreadDisposable implements AdapterView.OnItemLongClickListener {

        /* renamed from: b */
        public final AdapterView f62377b;

        /* renamed from: c */
        public final Observer f62378c;

        /* renamed from: d */
        public final Callable f62379d;

        public C10353a(AdapterView adapterView, Observer observer, Callable callable) {
            this.f62377b = adapterView;
            this.f62378c = observer;
            this.f62379d = callable;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f62377b.setOnItemLongClickListener(null);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f62379d.call()).booleanValue()) {
                        this.f62378c.onNext(Integer.valueOf(i));
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f62378c.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C10352h2(AdapterView adapterView, Callable callable) {
        this.f62375a = adapterView;
        this.f62376b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C10353a c10353a = new C10353a(this.f62375a, observer, this.f62376b);
        observer.onSubscribe(c10353a);
        this.f62375a.setOnItemLongClickListener(c10353a);
    }
}
