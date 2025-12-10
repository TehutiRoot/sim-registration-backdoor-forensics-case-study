package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzd extends zzf {

    /* renamed from: a */
    public final int f46146a;

    /* renamed from: b */
    public Activity f46147b;

    public zzd(int i, Activity activity) {
        this.f46146a = i;
        this.f46147b = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m47421a(zzd zzdVar, Activity activity) {
        zzdVar.f46147b = null;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.f46147b;
            if (activity == null || (createPendingResult = activity.createPendingResult(this.f46146a, intent, 1073741824)) == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException e) {
                Log.w("AddressClientImpl", "Exception settng pending result", e);
                return;
            }
        }
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult((Activity) Preconditions.checkNotNull(this.f46147b), this.f46146a);
                return;
            } catch (IntentSender.SendIntentException e2) {
                Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                return;
            }
        }
        try {
            PendingIntent createPendingResult2 = ((Activity) Preconditions.checkNotNull(this.f46147b)).createPendingResult(this.f46146a, new Intent(), 1073741824);
            if (createPendingResult2 != null) {
                createPendingResult2.send(1);
            }
        } catch (PendingIntent.CanceledException e3) {
            Log.w("AddressClientImpl", "Exception setting pending result", e3);
        }
    }
}