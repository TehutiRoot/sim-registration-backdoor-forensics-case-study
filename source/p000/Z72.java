package p000;

import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: Z72 */
/* loaded from: classes3.dex */
public final class Z72 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f7960a;

    /* renamed from: b */
    public final /* synthetic */ zaad f7961b;

    public Z72(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f7961b = zaadVar;
        this.f7960a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f7961b.f44837b;
        map.remove(this.f7960a);
    }
}
