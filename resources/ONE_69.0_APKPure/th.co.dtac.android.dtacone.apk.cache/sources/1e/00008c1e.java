package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: b */
    public static RootTelemetryConfigManager f45128b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f45129c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    public RootTelemetryConfiguration f45130a;

    @NonNull
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            try {
                if (f45128b == null) {
                    f45128b = new RootTelemetryConfigManager();
                }
                rootTelemetryConfigManager = f45128b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rootTelemetryConfigManager;
    }

    @Nullable
    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.f45130a;
    }

    @VisibleForTesting
    public final synchronized void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f45130a = f45129c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f45130a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.getVersion() >= rootTelemetryConfiguration.getVersion()) {
            return;
        }
        this.f45130a = rootTelemetryConfiguration;
    }
}