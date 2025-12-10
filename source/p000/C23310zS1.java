package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23310zS1 extends Observable {

    /* renamed from: a */
    public final TextView f109074a;

    /* renamed from: b */
    public final Function1 f109075b;

    /* renamed from: zS1$a */
    /* loaded from: classes5.dex */
    public static final class C17196a extends MainThreadDisposable implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final TextView f109076b;

        /* renamed from: c */
        public final Observer f109077c;

        /* renamed from: d */
        public final Function1 f109078d;

        public C17196a(TextView view, Observer observer, Function1 handled) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            this.f109076b = view;
            this.f109077c = observer;
            this.f109078d = handled;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f109076b.setOnEditorActionListener(null);
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            try {
                if (!isDisposed() && ((Boolean) this.f109078d.invoke(Integer.valueOf(i))).booleanValue()) {
                    this.f109077c.onNext(Integer.valueOf(i));
                    return true;
                }
                return false;
            } catch (Exception e) {
                this.f109077c.onError(e);
                dispose();
                return false;
            }
        }
    }

    public C23310zS1(TextView view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f109074a = view;
        this.f109075b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17196a c17196a = new C17196a(this.f109074a, observer, this.f109075b);
        observer.onSubscribe(c17196a);
        this.f109074a.setOnEditorActionListener(c17196a);
    }
}
