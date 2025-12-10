package p000;

import android.widget.AbsListView;
import com.jakewharton.rxbinding2.internal.Preconditions;
import com.jakewharton.rxbinding2.widget.AbsListViewScrollEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o */
/* loaded from: classes5.dex */
public final class C12409o extends Observable {

    /* renamed from: a */
    public final AbsListView f72536a;

    /* renamed from: o$a */
    /* loaded from: classes5.dex */
    public static final class C12410a extends MainThreadDisposable implements AbsListView.OnScrollListener {

        /* renamed from: b */
        public final AbsListView f72537b;

        /* renamed from: c */
        public final Observer f72538c;

        /* renamed from: d */
        public int f72539d = 0;

        public C12410a(AbsListView absListView, Observer observer) {
            this.f72537b = absListView;
            this.f72538c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f72537b.setOnScrollListener(null);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f72538c.onNext(AbsListViewScrollEvent.create(this.f72537b, this.f72539d, i, i2, i3));
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            this.f72539d = i;
            if (!isDisposed()) {
                AbsListView absListView2 = this.f72537b;
                this.f72538c.onNext(AbsListViewScrollEvent.create(absListView2, i, absListView2.getFirstVisiblePosition(), this.f72537b.getChildCount(), this.f72537b.getCount()));
            }
        }
    }

    public C12409o(AbsListView absListView) {
        this.f72536a = absListView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C12410a c12410a = new C12410a(this.f72536a, observer);
        observer.onSubscribe(c12410a);
        this.f72536a.setOnScrollListener(c12410a);
    }
}
