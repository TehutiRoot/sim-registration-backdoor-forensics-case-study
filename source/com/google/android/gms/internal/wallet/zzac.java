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
    public final Context f47678F;

    /* renamed from: G */
    public final int f47679G;

    /* renamed from: H */
    public final String f47680H;

    /* renamed from: I */
    public final int f47681I;

    /* renamed from: J */
    public final boolean f47682J;

    public zzac(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String str;
        this.f47678F = context;
        this.f47679G = i;
        Account account = clientSettings.getAccount();
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.f47680H = str;
        this.f47681I = i2;
        this.f47682J = z;
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
    public final Bundle m46406p() {
        int i = this.f47679G;
        String packageName = this.f47678F.getPackageName();
        String str = this.f47680H;
        int i2 = this.f47681I;
        boolean z = this.f47682J;
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
        BinderC22949xK2 binderC22949xK2 = new BinderC22949xK2((Activity) this.f47678F, i);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, m46406p(), binderC22949xK2);
        } catch (RemoteException unused) {
            binderC22949xK2.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle m46406p = m46406p();
        m46406p.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        EL2 el2 = new EL2(taskCompletionSource);
        try {
            ((zzs) getService()).zzc(createWalletObjectsRequest, m46406p, el2);
        } catch (RemoteException unused) {
            el2.zzh(8, Bundle.EMPTY);
        }
    }

    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzs) getService()).zzd(paymentCardRecognitionIntentRequest, m46406p(), new BinderC22295ta2(taskCompletionSource));
        } catch (RemoteException unused) {
            Status status = Status.RESULT_SUCCESS_CACHE;
        }
    }

    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        BinderC20028gL2 binderC20028gL2 = new BinderC20028gL2(taskCompletionSource);
        try {
            ((zzs) getService()).zze(isReadyToPayRequest, m46406p(), binderC20028gL2);
        } catch (RemoteException unused) {
            binderC20028gL2.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle m46406p = m46406p();
        m46406p.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BinderC17839Ja2 binderC17839Ja2 = new BinderC17839Ja2(taskCompletionSource);
        try {
            ((zzs) getService()).zzf(paymentDataRequest, m46406p, binderC17839Ja2);
        } catch (RemoteException unused) {
            binderC17839Ja2.zzf(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }
}
