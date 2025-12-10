package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
@Deprecated
/* loaded from: classes3.dex */
public class CampaignTrackingService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return null;
    }
}
