package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.internal.gtm.zzfk;

/* loaded from: classes3.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public zzfk f44367a;

    @Override // android.content.BroadcastReceiver
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f44367a == null) {
            this.f44367a = new zzfk();
        }
        this.f44367a.zza(context, intent);
    }
}
