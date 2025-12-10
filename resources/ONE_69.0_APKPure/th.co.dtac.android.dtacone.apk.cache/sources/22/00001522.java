package p000;

import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: W82 */
/* loaded from: classes3.dex */
public final class W82 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f7197a;

    /* renamed from: b */
    public final /* synthetic */ zaad f7198b;

    public W82(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f7198b = zaadVar;
        this.f7197a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f7198b.f44849b;
        map.remove(this.f7197a);
    }
}