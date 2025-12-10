package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public class AccountTransferClient extends GoogleApi<zzn> {

    /* renamed from: j */
    public static final Api.ClientKey f44456j;

    /* renamed from: k */
    public static final Api.AbstractClientBuilder f44457k;

    /* renamed from: l */
    public static final Api f44458l;

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$a */
    /* loaded from: classes3.dex */
    public static class BinderC6321a extends com.google.android.gms.internal.auth.zzs {

        /* renamed from: a */
        public AbstractC6322b f44459a;

        public BinderC6321a(AbstractC6322b abstractC6322b) {
            this.f44459a = abstractC6322b;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(Status status) {
            this.f44459a.m48721b(status);
        }
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6322b extends TaskApiCall {

        /* renamed from: d */
        public TaskCompletionSource f44460d;

        public AbstractC6322b() {
        }

        /* renamed from: a */
        public final void m48722a(Object obj) {
            this.f44460d.setResult(obj);
        }

        /* renamed from: b */
        public final void m48721b(Status status) {
            AccountTransferClient.m48724c(this.f44460d, status);
        }

        /* renamed from: c */
        public abstract void mo48720c(zzz zzzVar);

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
            this.f44460d = taskCompletionSource;
            mo48720c((zzz) ((com.google.android.gms.internal.auth.zzu) anyClient).getService());
        }

        public /* synthetic */ AbstractC6322b(C17278Af2 c17278Af2) {
            this();
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44456j = clientKey;
        C17278Af2 c17278Af2 = new C17278Af2();
        f44457k = c17278Af2;
        f44458l = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", c17278Af2, clientKey);
    }

    public AccountTransferClient(Context context) {
        super(context, f44458l, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    /* renamed from: c */
    public static void m48724c(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new C6327d(this, new com.google.android.gms.internal.auth.zzv(str)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new C6330g(this, new zzab(str, i)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new C6325b(this, new zzad(str)));
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new C6324a(this, new zzaf(str, bArr)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new C6329f(this, new zzah(str, pendingIntent)));
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6323c extends AbstractC6322b {

        /* renamed from: e */
        public zzy f44461e;

        public AbstractC6323c() {
            super(null);
            this.f44461e = new BinderC6331h(this);
        }

        public /* synthetic */ AbstractC6323c(C17278Af2 c17278Af2) {
            this();
        }
    }

    public AccountTransferClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions>) f44458l, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }
}
