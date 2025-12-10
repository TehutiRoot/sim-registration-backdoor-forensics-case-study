package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class PictureInPictureModeChangedInfo {

    /* renamed from: a */
    public final boolean f33691a;

    /* renamed from: b */
    public final Configuration f33692b;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.f33691a = z;
        this.f33692b = null;
    }

    @NonNull
    @RequiresApi(26)
    public Configuration getNewConfig() {
        Configuration configuration = this.f33692b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean isInPictureInPictureMode() {
        return this.f33691a;
    }

    @RequiresApi(26)
    public PictureInPictureModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f33691a = z;
        this.f33692b = configuration;
    }
}
