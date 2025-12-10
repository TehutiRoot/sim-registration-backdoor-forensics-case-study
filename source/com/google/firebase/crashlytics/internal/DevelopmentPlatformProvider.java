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
    public final Context f54757a;

    /* renamed from: b */
    public C8355b f54758b = null;

    /* renamed from: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$b */
    /* loaded from: classes4.dex */
    public class C8355b {

        /* renamed from: a */
        public final String f54759a;

        /* renamed from: b */
        public final String f54760b;

        public C8355b() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.f54757a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.m39145c("flutter_assets/NOTICES.Z")) {
                    this.f54759a = "Flutter";
                    this.f54760b = null;
                    Logger.getLogger().m39134v("Development platform is: Flutter");
                    return;
                }
                this.f54759a = null;
                this.f54760b = null;
                return;
            }
            this.f54759a = "Unity";
            String string = DevelopmentPlatformProvider.this.f54757a.getResources().getString(resourcesIdentifier);
            this.f54760b = string;
            Logger logger = Logger.getLogger();
            logger.m39134v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f54757a = context;
    }

    public static boolean isUnity(Context context) {
        if (CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m39145c(String str) {
        if (this.f54757a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f54757a.getAssets().open(str);
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
    public final C8355b m39144d() {
        if (this.f54758b == null) {
            this.f54758b = new C8355b();
        }
        return this.f54758b;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return m39144d().f54759a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return m39144d().f54760b;
    }
}
