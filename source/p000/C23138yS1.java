package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: yS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23138yS1 extends Observable {

    /* renamed from: a */
    public final TextView f108756a;

    /* renamed from: b */
    public final Predicate f108757b;

    /* renamed from: yS1$a */
    /* loaded from: classes5.dex */
    public static final class C17127a extends MainThreadDisposable implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final TextView f108758b;

        /* renamed from: c */
        public final Observer f108759c;

        /* renamed from: d */
        public final Predicate f108760d;

        public C17127a(TextView textView, Observer observer, Predicate predicate) {
            this.f108758b = textView;
            this.f108759c = observer;
            this.f108760d = predicate;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108758b.setOnEditorActionListener(null);
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            try {
                if (!isDisposed() && this.f108760d.test(Integer.valueOf(i))) {
                    this.f108759c.onNext(Integer.valueOf(i));
                    return true;
                }
                return false;
            } catch (Exception e) {
                this.f108759c.onError(e);
                dispose();
                return false;
            }
        }
    }

    public C23138yS1(TextView textView, Predicate predicate) {
        this.f108756a = textView;
        this.f108757b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17127a c17127a = new C17127a(this.f108756a, observer, this.f108757b);
        observer.onSubscribe(c17127a);
        this.f108756a.setOnEditorActionListener(c17127a);
    }
}
