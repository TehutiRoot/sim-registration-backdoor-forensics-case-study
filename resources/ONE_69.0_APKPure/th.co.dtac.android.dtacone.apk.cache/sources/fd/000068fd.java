package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class MultiWindowModeChangedInfo {

    /* renamed from: a */
    public final boolean f33574a;

    /* renamed from: b */
    public final Configuration f33575b;

    public MultiWindowModeChangedInfo(boolean z) {
        this.f33574a = z;
        this.f33575b = null;
    }

    @NonNull
    @RequiresApi(26)
    public Configuration getNewConfig() {
        Configuration configuration = this.f33575b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean isInMultiWindowMode() {
        return this.f33574a;
    }

    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f33574a = z;
        this.f33575b = configuration;
    }
}