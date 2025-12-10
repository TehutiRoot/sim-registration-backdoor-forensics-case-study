package p000;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: T72 */
/* loaded from: classes3.dex */
public final class T72 implements OnDelegateCreatedListener {

    /* renamed from: a */
    public final /* synthetic */ DeferredLifecycleHelper f5931a;

    public T72(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f5931a = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LifecycleDelegate lifecycleDelegate2;
        this.f5931a.f45359a = lifecycleDelegate;
        linkedList = this.f5931a.f45361c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            lifecycleDelegate2 = this.f5931a.f45359a;
            ((InterfaceC19648e92) it.next()).mo25959a(lifecycleDelegate2);
        }
        linkedList2 = this.f5931a.f45361c;
        linkedList2.clear();
        this.f5931a.f45360b = null;
    }
}
