package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class PictureInPictureModeChangedInfo {

    /* renamed from: a */
    public final boolean f33779a;

    /* renamed from: b */
    public final Configuration f33780b;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.f33779a = z;
        this.f33780b = null;
    }

    @NonNull
    @RequiresApi(26)
    public Configuration getNewConfig() {
        Configuration configuration = this.f33780b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean isInPictureInPictureMode() {
        return this.f33779a;
    }

    @RequiresApi(26)
    public PictureInPictureModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f33779a = z;
        this.f33780b = configuration;
    }
}