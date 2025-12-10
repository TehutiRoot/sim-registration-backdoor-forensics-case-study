package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.A */
/* loaded from: classes3.dex */
public final class C6693A implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ zzid f48058a;

    public /* synthetic */ C6693A(zzid zzidVar, zzib zzibVar) {
        this.f48058a = zzidVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfy zzfyVar;
        String str;
        boolean z;
        try {
            try {
                this.f48058a.zzs.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzfyVar = this.f48058a.zzs;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f48058a.zzs.zzv();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                        } else {
                            str = OperatorName.SET_GRAPHICS_STATE_PARAMS;
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f48058a.zzs.zzaz().zzp(new RunnableC6756z(this, z, data, str2, queryParameter));
                        zzfyVar = this.f48058a.zzs;
                    }
                    zzfyVar = this.f48058a.zzs;
                }
            } catch (RuntimeException e) {
                this.f48058a.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzfyVar = this.f48058a.zzs;
            }
            zzfyVar.zzs().zzr(activity, bundle);
        } catch (Throwable th2) {
            this.f48058a.zzs.zzs().zzr(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f48058a.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f48058a.zzs.zzs().zzt(activity);
        zzki zzu = this.f48058a.zzs.zzu();
        zzu.zzs.zzaz().zzp(new XB2(zzu, zzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzki zzu = this.f48058a.zzs.zzu();
        zzu.zzs.zzaz().zzp(new QB2(zzu, zzu.zzs.zzav().elapsedRealtime()));
        this.f48058a.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f48058a.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
