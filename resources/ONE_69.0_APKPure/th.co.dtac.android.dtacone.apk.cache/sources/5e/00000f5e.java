package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: Q82 */
/* loaded from: classes3.dex */
public final class Q82 implements OnDelegateCreatedListener {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f5134a;

    public Q82(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f5134a = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LifecycleDelegate lifecycleDelegate2;
        this.f5134a.f45371a = lifecycleDelegate;
        linkedList = this.f5134a.f45373c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            lifecycleDelegate2 = this.f5134a.f45371a;
            ((InterfaceC19247ba2) it.next()).mo26854a(lifecycleDelegate2);
        }
        linkedList2 = this.f5134a.f45373c;
        linkedList2.clear();
        this.f5134a.f45372b = null;
    }
}