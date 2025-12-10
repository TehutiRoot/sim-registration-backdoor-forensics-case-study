package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import es.dmoral.toasty.BuildConfig;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ClientVersion {

    /* renamed from: b */
    public static ClientVersion f11598b = new ClientVersion(BuildConfig.VERSION_NAME);

    /* renamed from: a */
    public final Version f11599a;

    public ClientVersion(@NonNull String str) {
        this.f11599a = Version.parse(str);
    }

    @NonNull
    public static ClientVersion getCurrentVersion() {
        return f11598b;
    }

    public static boolean isMinimumCompatibleVersion(@NonNull Version version) {
        if (getCurrentVersion().f11599a.compareTo(version.getMajor(), version.mo26148c()) >= 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public static void setCurrentVersion(@NonNull ClientVersion clientVersion) {
        f11598b = clientVersion;
    }

    @NonNull
    public Version getVersion() {
        return this.f11599a;
    }

    @NonNull
    public String toVersionString() {
        return this.f11599a.toString();
    }
}