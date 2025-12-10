package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zal {

    /* renamed from: d */
    public int f44951d;

    /* renamed from: b */
    public final ArrayMap f44949b = new ArrayMap();

    /* renamed from: c */
    public final TaskCompletionSource f44950c = new TaskCompletionSource();

    /* renamed from: e */
    public boolean f44952e = false;

    /* renamed from: a */
    public final ArrayMap f44948a = new ArrayMap();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f44948a.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.f44951d = this.f44948a.keySet().size();
    }

    public final Task zaa() {
        return this.f44950c.getTask();
    }

    public final Set zab() {
        return this.f44948a.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.f44948a.put(apiKey, connectionResult);
        this.f44949b.put(apiKey, str);
        this.f44951d--;
        if (!connectionResult.isSuccess()) {
            this.f44952e = true;
        }
        if (this.f44951d == 0) {
            if (this.f44952e) {
                this.f44950c.setException(new AvailabilityException(this.f44948a));
                return;
            }
            this.f44950c.setResult(this.f44949b);
        }
    }
}
