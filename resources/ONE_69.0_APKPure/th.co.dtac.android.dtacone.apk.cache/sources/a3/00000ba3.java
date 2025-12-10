package p000;

import com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList;
import com.jakewharton.rxrelay2.Relay;
import io.reactivex.Observer;

/* renamed from: MG1 */
/* loaded from: classes5.dex */
public final class MG1 extends Relay {

    /* renamed from: a */
    public final Relay f3849a;

    /* renamed from: b */
    public boolean f3850b;

    /* renamed from: c */
    public AppendOnlyLinkedArrayList f3851c;

    public MG1(Relay relay) {
        this.f3849a = relay;
    }

    /* renamed from: d */
    private void m67437d() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f3851c;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f3850b = false;
                        return;
                    }
                    this.f3851c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.m33721a(this.f3849a);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(Object obj) {
        synchronized (this) {
            try {
                if (this.f3850b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f3851c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f3851c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m33720b(obj);
                    return;
                }
                this.f3850b = true;
                this.f3849a.accept(obj);
                m67437d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.f3849a.hasObservers();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        this.f3849a.subscribe(observer);
    }
}