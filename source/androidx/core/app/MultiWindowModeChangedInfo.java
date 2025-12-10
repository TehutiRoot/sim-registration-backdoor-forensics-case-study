package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class MultiWindowModeChangedInfo {

    /* renamed from: a */
    public final boolean f33486a;

    /* renamed from: b */
    public final Configuration f33487b;

    public MultiWindowModeChangedInfo(boolean z) {
        this.f33486a = z;
        this.f33487b = null;
    }

    @NonNull
    @RequiresApi(26)
    public Configuration getNewConfig() {
        Configuration configuration = this.f33487b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean isInMultiWindowMode() {
        return this.f33486a;
    }

    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f33486a = z;
        this.f33487b = configuration;
    }
}
