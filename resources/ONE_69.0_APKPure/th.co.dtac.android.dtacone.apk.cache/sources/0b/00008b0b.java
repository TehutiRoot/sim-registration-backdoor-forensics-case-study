package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzw {

    /* renamed from: a */
    public final Context f44633a;

    /* renamed from: b */
    public int f44634b;

    /* renamed from: c */
    public int f44635c = 0;

    public zzw(Context context) {
        this.f44633a = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.f44634b == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f44633a).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f44634b = packageInfo.versionCode;
            }
        }
        return this.f44634b;
    }

    public final synchronized int zzb() {
        try {
            int i = this.f44635c;
            if (i != 0) {
                return i;
            }
            Context context = this.f44633a;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i2 = 1;
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    this.f44635c = i2;
                    return i2;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i2 = 2;
                this.f44635c = i2;
                return i2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == PlatformVersion.isAtLeastO()) {
                i2 = 2;
            }
            this.f44635c = i2;
            return i2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}