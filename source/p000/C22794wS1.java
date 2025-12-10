package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.TextViewEditorActionEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;

/* renamed from: wS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22794wS1 extends Observable {

    /* renamed from: a */
    public final TextView f108000a;

    /* renamed from: b */
    public final Predicate f108001b;

    /* renamed from: wS1$a */
    /* loaded from: classes5.dex */
    public static final class C16969a extends MainThreadDisposable implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final TextView f108002b;

        /* renamed from: c */
        public final Observer f108003c;

        /* renamed from: d */
        public final Predicate f108004d;

        public C16969a(TextView textView, Observer observer, Predicate predicate) {
            this.f108002b = textView;
            this.f108003c = observer;
            this.f108004d = predicate;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108002b.setOnEditorActionListener(null);
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            TextViewEditorActionEvent create = TextViewEditorActionEvent.create(this.f108002b, i, keyEvent);
            try {
                if (!isDisposed() && this.f108004d.test(create)) {
                    this.f108003c.onNext(create);
                    return true;
                }
                return false;
            } catch (Exception e) {
                this.f108003c.onError(e);
                dispose();
                return false;
            }
        }
    }

    public C22794wS1(TextView textView, Predicate predicate) {
        this.f108000a = textView;
        this.f108001b = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C16969a c16969a = new C16969a(this.f108000a, observer, this.f108001b);
        observer.onSubscribe(c16969a);
        this.f108000a.setOnEditorActionListener(c16969a);
    }
}
