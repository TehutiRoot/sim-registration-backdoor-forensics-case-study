package p000;

import android.widget.AbsListView;
import com.jakewharton.rxbinding3.internal.Preconditions;
import com.jakewharton.rxbinding3.widget.AbsListViewScrollEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p */
/* loaded from: classes5.dex */
public final class C13053p extends Observable {

    /* renamed from: a */
    public final AbsListView f76452a;

    /* renamed from: p$a */
    /* loaded from: classes5.dex */
    public static final class C13054a extends MainThreadDisposable implements AbsListView.OnScrollListener {

        /* renamed from: b */
        public int f76453b;

        /* renamed from: c */
        public final AbsListView f76454c;

        /* renamed from: d */
        public final Observer f76455d;

        public C13054a(AbsListView view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f76454c = view;
            this.f76455d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f76454c.setOnScrollListener(null);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(absListView, "absListView");
            if (!isDisposed()) {
                this.f76455d.onNext(new AbsListViewScrollEvent(this.f76454c, this.f76453b, i, i2, i3));
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            Intrinsics.checkParameterIsNotNull(absListView, "absListView");
            this.f76453b = i;
            if (!isDisposed()) {
                AbsListView absListView2 = this.f76454c;
                this.f76455d.onNext(new AbsListViewScrollEvent(absListView2, i, absListView2.getFirstVisiblePosition(), this.f76454c.getChildCount(), this.f76454c.getCount()));
            }
        }
    }

    public C13053p(AbsListView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f76452a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C13054a c13054a = new C13054a(this.f76452a, observer);
        observer.onSubscribe(c13054a);
        this.f76452a.setOnScrollListener(c13054a);
    }
}
