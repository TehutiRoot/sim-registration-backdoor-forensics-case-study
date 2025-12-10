package p000;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;
import java.util.Map;

/* renamed from: Y72 */
/* loaded from: classes3.dex */
public final class Y72 implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f7688a;

    /* renamed from: b */
    public final /* synthetic */ zaad f7689b;

    public Y72(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f7689b = zaadVar;
        this.f7688a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Map map;
        map = this.f7689b.f44836a;
        map.remove(this.f7688a);
    }
}
