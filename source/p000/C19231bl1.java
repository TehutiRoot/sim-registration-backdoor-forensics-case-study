package p000;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19231bl1 extends Observable {

    /* renamed from: a */
    public final PopupMenu f39202a;

    /* renamed from: bl1$a */
    /* loaded from: classes5.dex */
    public static final class C5399a extends MainThreadDisposable implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: b */
        public final PopupMenu f39203b;

        /* renamed from: c */
        public final Observer f39204c;

        public C5399a(PopupMenu view, Observer observer) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f39203b = view;
            this.f39204c = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f39203b.setOnMenuItemClickListener(null);
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
            if (!isDisposed()) {
                this.f39204c.onNext(menuItem);
                return true;
            }
            return false;
        }
    }

    public C19231bl1(PopupMenu view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f39202a = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        C5399a c5399a = new C5399a(this.f39202a, observer);
        this.f39202a.setOnMenuItemClickListener(c5399a);
        observer.onSubscribe(c5399a);
    }
}
