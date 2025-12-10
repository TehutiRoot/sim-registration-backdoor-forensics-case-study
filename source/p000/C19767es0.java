package p000;

import android.view.MenuItem;
import com.jakewharton.rxbinding3.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: es0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19767es0 extends Observable {

    /* renamed from: a */
    public final MenuItem f61636a;

    /* renamed from: b */
    public final Function1 f61637b;

    /* renamed from: es0$a */
    /* loaded from: classes5.dex */
    public static final class MenuItem$OnMenuItemClickListenerC10185a extends MainThreadDisposable implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem f61638b;

        /* renamed from: c */
        public final Function1 f61639c;

        /* renamed from: d */
        public final Observer f61640d;

        public MenuItem$OnMenuItemClickListenerC10185a(MenuItem menuItem, Function1 handled, Observer observer) {
            Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
            Intrinsics.checkParameterIsNotNull(handled, "handled");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.f61638b = menuItem;
            this.f61639c = handled;
            this.f61640d = observer;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f61638b.setOnMenuItemClickListener(null);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            if (!isDisposed()) {
                try {
                    if (((Boolean) this.f61639c.invoke(this.f61638b)).booleanValue()) {
                        this.f61640d.onNext(Unit.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f61640d.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C19767es0(MenuItem menuItem, Function1 handled) {
        Intrinsics.checkParameterIsNotNull(menuItem, "menuItem");
        Intrinsics.checkParameterIsNotNull(handled, "handled");
        this.f61636a = menuItem;
        this.f61637b = handled;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (!Preconditions.checkMainThread(observer)) {
            return;
        }
        MenuItem$OnMenuItemClickListenerC10185a menuItem$OnMenuItemClickListenerC10185a = new MenuItem$OnMenuItemClickListenerC10185a(this.f61636a, this.f61637b, observer);
        observer.onSubscribe(menuItem$OnMenuItemClickListenerC10185a);
        this.f61636a.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC10185a);
    }
}
