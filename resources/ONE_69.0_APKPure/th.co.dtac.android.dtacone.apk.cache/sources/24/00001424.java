package p000;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;
import java.util.Map;

/* renamed from: V82 */
/* loaded from: classes3.dex */
public final class V82 implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f6835a;

    /* renamed from: b */
    public final /* synthetic */ zaad f6836b;

    public V82(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f6836b = zaadVar;
        this.f6835a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Map map;
        map = this.f6836b.f44848a;
        map.remove(this.f6835a);
    }
}