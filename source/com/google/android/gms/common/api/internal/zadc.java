package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zadc {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    public final Set f44942a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    public final U82 f44943b = new U82(this);

    /* renamed from: a */
    public final void m48461a(BasePendingResult basePendingResult) {
        this.f44942a.add(basePendingResult);
        basePendingResult.zan(this.f44943b);
    }

    public final void zab() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f44942a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f44942a.remove(basePendingResult);
            }
        }
    }
}
