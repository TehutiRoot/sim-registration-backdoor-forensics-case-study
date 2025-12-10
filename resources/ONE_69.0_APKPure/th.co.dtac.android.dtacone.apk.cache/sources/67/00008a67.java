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
    public zzfk f44379a;

    @Override // android.content.BroadcastReceiver
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f44379a == null) {
            this.f44379a = new zzfk();
        }
        this.f44379a.zza(context, intent);
    }
}