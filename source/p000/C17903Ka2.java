package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Ka2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17903Ka2 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ Collection f3222a;

    public C17903Ka2(Collection collection) {
        this.f3222a = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3222a);
        return Tasks.forResult(arrayList);
    }
}
