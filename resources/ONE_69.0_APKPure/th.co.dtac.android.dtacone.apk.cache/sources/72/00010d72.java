package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: sb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22191sb2 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ Collection f79927a;

    public C22191sb2(Collection collection) {
        this.f79927a = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.f79927a) {
            arrayList.add(task2.getResult());
        }
        return arrayList;
    }
}