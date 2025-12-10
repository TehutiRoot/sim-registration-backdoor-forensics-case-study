package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: b */
    public static RootTelemetryConfigManager f45116b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f45117c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    public RootTelemetryConfiguration f45118a;

    @NonNull
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (f45116b == null) {
                    f45116b = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = f45116b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rootTelemetryConfigManager;
    }

    @Nullable
    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.f45118a;
    }

    @VisibleForTesting
    public final synchronized void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f45118a = f45117c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f45118a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.getVersion() >= rootTelemetryConfiguration.getVersion()) {
            return;
        }
        this.f45118a = rootTelemetryConfiguration;
    }
}
