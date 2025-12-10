package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class DevelopmentPlatformProvider {

    /* renamed from: a */
    public final Context f54769a;

    /* renamed from: b */
    public C8344b f54770b = null;

    /* renamed from: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$b */
    /* loaded from: classes4.dex */
    public class C8344b {

        /* renamed from: a */
        public final String f54771a;

        /* renamed from: b */
        public final String f54772b;

        public C8344b() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.f54769a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.m39137c("flutter_assets/NOTICES.Z")) {
                    this.f54771a = "Flutter";
                    this.f54772b = null;
                    Logger.getLogger().m39126v("Development platform is: Flutter");
                    return;
                }
                this.f54771a = null;
                this.f54772b = null;
                return;
            }
            this.f54771a = "Unity";
            String string = DevelopmentPlatformProvider.this.f54769a.getResources().getString(resourcesIdentifier);
            this.f54772b = string;
            Logger logger = Logger.getLogger();
            logger.m39126v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f54769a = context;
    }

    public static boolean isUnity(Context context) {
        if (CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m39137c(String str) {
        if (this.f54769a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f54769a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final C8344b m39136d() {
        if (this.f54770b == null) {
            this.f54770b = new C8344b();
        }
        return this.f54770b;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return m39136d().f54771a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return m39136d().f54772b;
    }
}