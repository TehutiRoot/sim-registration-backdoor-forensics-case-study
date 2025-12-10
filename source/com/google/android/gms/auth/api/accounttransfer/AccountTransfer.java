package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";

    /* renamed from: a */
    public static final Api.ClientKey f44451a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f44452b;

    /* renamed from: c */
    public static final Api f44453c;

    /* renamed from: d */
    public static final zzb f44454d;

    /* renamed from: e */
    public static final zzq f44455e;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.auth.zzt, com.google.android.gms.auth.api.accounttransfer.zzq] */
    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f44451a = clientKey;
        O92 o92 = new O92();
        f44452b = o92;
        f44453c = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", o92, clientKey);
        f44454d = new com.google.android.gms.internal.auth.zzt();
        f44455e = new com.google.android.gms.internal.auth.zzt();
    }

    public static AccountTransferClient getAccountTransferClient(@NonNull Activity activity) {
        return new AccountTransferClient(activity);
    }

    public static AccountTransferClient getAccountTransferClient(@NonNull Context context) {
        return new AccountTransferClient(context);
    }
}
