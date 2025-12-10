package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes3.dex */
public final class zzac extends GmsClient {

    /* renamed from: F */
    public final Context f47690F;

    /* renamed from: G */
    public final int f47691G;

    /* renamed from: H */
    public final String f47692H;

    /* renamed from: I */
    public final int f47693I;

    /* renamed from: J */
    public final boolean f47694J;

    public zzac(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String str;
        this.f47690F = context;
        this.f47691G = i;
        Account account = clientSettings.getAccount();
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.f47692H = str;
        this.f47693I = i2;
        this.f47694J = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof zzs) {
            return (zzs) queryLocalInterface;
        }
        return new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wallet.zzk.zzh;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* renamed from: p */
    public final Bundle m46391p() {
        int i = this.f47691G;
        String packageName = this.f47690F.getPackageName();
        String str = this.f47692H;
        int i2 = this.f47693I;
        boolean z = this.f47694J;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        BinderC22502uL2 binderC22502uL2 = new BinderC22502uL2((Activity) this.f47690F, i);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, m46391p(), binderC22502uL2);
        } catch (RemoteException unused) {
            binderC22502uL2.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle m46391p = m46391p();
        m46391p.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BM2 bm2 = new BM2(taskCompletionSource);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, m46391p, bm2);
        } catch (RemoteException unused) {
            bm2.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzs) getService()).zzd(paymentCardRecognitionIntentRequest, m46391p(), new BinderC21845qb2(taskCompletionSource));
        } catch (RemoteException unused) {
            Status status = Status.RESULT_SUCCESS_CACHE;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        BinderC19564dM2 binderC19564dM2 = new BinderC19564dM2(taskCompletionSource);
        try {
            ((zzs) getService()).zze(isReadyToPayRequest, m46391p(), binderC19564dM2);
        } catch (RemoteException unused) {
            binderC19564dM2.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle m46391p = m46391p();
        m46391p.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BinderC17679Gb2 binderC17679Gb2 = new BinderC17679Gb2(taskCompletionSource);
        try {
            ((zzs) getService()).zzf(paymentDataRequest, m46391p, binderC17679Gb2);
        } catch (RemoteException unused) {
            binderC17679Gb2.zzf(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }
}