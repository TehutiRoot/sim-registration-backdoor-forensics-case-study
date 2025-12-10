package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* renamed from: p92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21601p92 implements ResultCallback {

    /* renamed from: a */
    public final /* synthetic */ StatusPendingResult f76602a;

    /* renamed from: b */
    public final /* synthetic */ boolean f76603b;

    /* renamed from: c */
    public final /* synthetic */ GoogleApiClient f76604c;

    /* renamed from: d */
    public final /* synthetic */ zabe f76605d;

    public C21601p92(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f76605d = zabeVar;
        this.f76602a = statusPendingResult;
        this.f76603b = z;
        this.f76604c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        Context context;
        Status status = (Status) result;
        context = this.f76605d.f44882f;
        Storage.getInstance(context).zac();
        if (status.isSuccess() && this.f76605d.isConnected()) {
            zabe zabeVar = this.f76605d;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.f76602a.setResult(status);
        if (this.f76603b) {
            this.f76604c.disconnect();
        }
    }
}