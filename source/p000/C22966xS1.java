package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xS1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22966xS1 extends Observable {

    /* renamed from: a */
    public final TextView f108373a;

    /* renamed from: b */
    public final Function1 f108374b;

    /* renamed from: xS1$a */
    /* loaded from: classes5.dex */
    public static final class C17049a extends MainThreadDisposable implements TextView.OnEditorActionListener {

        /* renamed from: b */
        public final TextView f108375b;

        /* renamed from: c */
        public final Observer f108376c;

        /* renamed from: d */
        public final Function1 f108377d;

        public C17049a(TextView view, Observer observer, Function1 handled) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            this.f108375b = view;
            this.f108376c = observer;
            this.f108377d = handled;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f108375b.setOnEditorActionListener(null);
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            TextViewEditorActionEvent textViewEditorActionEvent = new TextViewEditorActionEvent(this.f108375b, i, keyEvent);
            try {
                if (!isDisposed() && ((Boolean) this.f108377d.invoke(textViewEditorActionEvent)).booleanValue()) {
                    this.f108376c.onNext(textViewEditorActionEvent);
                    return true;
                }
                return false;
            } catch (Exception e) {
                this.f108376c.onError(e);
                dispose();
                return false;
            }
        }
    }

    public C22966xS1(TextView view, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f108373a = view;
        this.f108374b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C17049a c17049a = new C17049a(this.f108373a, observer, this.f108374b);
        observer.onSubscribe(c17049a);
        this.f108373a.setOnEditorActionListener(c17049a);
    }
}
