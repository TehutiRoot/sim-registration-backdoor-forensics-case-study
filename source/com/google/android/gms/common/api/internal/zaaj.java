package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zaaj implements zabf {

    /* renamed from: a */
    public final zabi f44841a;

    /* renamed from: b */
    public boolean f44842b = false;

    public zaaj(zabi zabiVar) {
        this.f44841a = zabiVar;
    }

    /* renamed from: b */
    public final void m48548b() {
        if (this.f44842b) {
            this.f44842b = false;
            this.f44841a.f44903n.f44888x.zab();
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.f44841a.f44903n.f44888x.m48461a(apiMethodImpl);
            zabe zabeVar = this.f44841a.f44903n;
            Api.Client client = (Api.Client) zabeVar.f44879o.get(apiMethodImpl.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.f44841a.f44896g.containsKey(apiMethodImpl.getClientKey())) {
                apiMethodImpl.setFailedResult(new Status(17));
            } else {
                apiMethodImpl.run(client);
            }
        } catch (DeadObjectException unused) {
            this.f44841a.m48504f(new C6343b(this, this));
        }
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.f44842b) {
            this.f44842b = false;
            this.f44841a.m48504f(new C19129b82(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        this.f44841a.m48505e(null);
        this.f44841a.f44904o.zac(i, this.f44842b);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (!this.f44842b) {
            Set<zada> set = this.f44841a.f44903n.f44887w;
            if (set != null && !set.isEmpty()) {
                this.f44842b = true;
                for (zada zadaVar : set) {
                    zadaVar.m48467h();
                }
                return false;
            }
            this.f44841a.m48505e(null);
            return true;
        }
        return false;
    }
}
