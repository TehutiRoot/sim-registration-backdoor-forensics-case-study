package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* renamed from: s82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22053s82 implements ResultCallback {

    /* renamed from: a */
    public final /* synthetic */ StatusPendingResult f79595a;

    /* renamed from: b */
    public final /* synthetic */ boolean f79596b;

    /* renamed from: c */
    public final /* synthetic */ GoogleApiClient f79597c;

    /* renamed from: d */
    public final /* synthetic */ zabe f79598d;

    public C22053s82(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f79598d = zabeVar;
        this.f79595a = statusPendingResult;
        this.f79596b = z;
        this.f79597c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        Context context;
        Status status = (Status) result;
        context = this.f79598d.f44870f;
        Storage.getInstance(context).zac();
        if (status.isSuccess() && this.f79598d.isConnected()) {
            zabe zabeVar = this.f79598d;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.f79595a.setResult(status);
        if (this.f79596b) {
            this.f79597c.disconnect();
        }
    }
}
