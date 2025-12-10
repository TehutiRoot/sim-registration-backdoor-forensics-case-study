package p000;

import com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList;
import com.jakewharton.rxrelay2.Relay;
import io.reactivex.Observer;

/* renamed from: PF1 */
/* loaded from: classes5.dex */
public final class PF1 extends Relay {

    /* renamed from: a */
    public final Relay f4691a;

    /* renamed from: b */
    public boolean f4692b;

    /* renamed from: c */
    public AppendOnlyLinkedArrayList f4693c;

    public PF1(Relay relay) {
        this.f4691a = relay;
    }

    /* renamed from: d */
    private void m66867d() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f4693c;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f4692b = false;
                        return;
                    }
                    this.f4693c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.m33729a(this.f4691a);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(Object obj) {
        synchronized (this) {
            try {
                if (this.f4692b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4693c;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f4693c = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m33728b(obj);
                    return;
                }
                this.f4692b = true;
                this.f4691a.accept(obj);
                m66867d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.f4691a.hasObservers();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        this.f4691a.subscribe(observer);
    }
}
