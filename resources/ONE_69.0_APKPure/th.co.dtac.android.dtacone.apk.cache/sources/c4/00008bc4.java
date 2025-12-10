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
    public int f44963d;

    /* renamed from: b */
    public final ArrayMap f44961b = new ArrayMap();

    /* renamed from: c */
    public final TaskCompletionSource f44962c = new TaskCompletionSource();

    /* renamed from: e */
    public boolean f44964e = false;

    /* renamed from: a */
    public final ArrayMap f44960a = new ArrayMap();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f44960a.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.f44963d = this.f44960a.keySet().size();
    }

    public final Task zaa() {
        return this.f44962c.getTask();
    }

    public final Set zab() {
        return this.f44960a.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.f44960a.put(apiKey, connectionResult);
        this.f44961b.put(apiKey, str);
        this.f44963d--;
        if (!connectionResult.isSuccess()) {
            this.f44964e = true;
        }
        if (this.f44963d == 0) {
            if (this.f44964e) {
                this.f44962c.setException(new AvailabilityException(this.f44960a));
                return;
            }
            this.f44962c.setResult(this.f44961b);
        }
    }
}