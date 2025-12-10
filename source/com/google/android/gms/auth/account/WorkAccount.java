package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;

/* loaded from: classes3.dex */
public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final WorkAccountApi WorkAccountApi;

    /* renamed from: a */
    public static final Api.ClientKey f44446a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f44447b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44446a = clientKey;
        Vm2 vm2 = new Vm2();
        f44447b = vm2;
        API = new Api<>("WorkAccount.API", vm2, clientKey);
        WorkAccountApi = new zzh();
    }

    public static WorkAccountClient getClient(@NonNull Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(@NonNull Context context) {
        return new WorkAccountClient(context);
    }
}
