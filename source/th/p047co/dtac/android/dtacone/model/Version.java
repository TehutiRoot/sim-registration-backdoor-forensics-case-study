package th.p047co.dtac.android.dtacone.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/Version;", "", "deviceModel", "", "platform", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "osVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getDeviceModel", "getOsVersion", "getPlatform", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.Version */
/* loaded from: classes8.dex */
public final class Version {
    public static final int $stable = 0;
    @NotNull
    private final String appVersion;
    @NotNull
    private final String deviceModel;
    @NotNull
    private final String osVersion;
    @NotNull
    private final String platform;

    public Version() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public Version(@NotNull String deviceModel, @NotNull String platform, @NotNull String appVersion, @NotNull String osVersion) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.deviceModel = deviceModel;
        this.platform = platform;
        this.appVersion = appVersion;
        this.osVersion = osVersion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Version(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto Lb
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r6 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
        Lb:
            r6 = r5 & 2
            if (r6 == 0) goto L11
            java.lang.String r2 = "android"
        L11:
            r6 = r5 & 4
            if (r6 == 0) goto L17
            java.lang.String r3 = "68.3"
        L17:
            r5 = r5 & 8
            if (r5 == 0) goto L22
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L22:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.Version.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
