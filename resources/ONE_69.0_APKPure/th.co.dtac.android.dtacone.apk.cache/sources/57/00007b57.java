package co.omise.android.api;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lco/omise/android/api/Config;", "", "apiVersion", "", "publicKey", "(Ljava/lang/String;Ljava/lang/String;)V", "userAgent", "buildUserAgent", "Companion", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class Config {
    @NotNull
    public static final String API_VERSION = "2019-05-29";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String apiVersion;
    @NotNull
    private final String publicKey;
    @NotNull
    private final String userAgent;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lco/omise/android/api/Config$Companion;", "", "()V", "API_VERSION", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Config(@NotNull String apiVersion, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.apiVersion = apiVersion;
        this.publicKey = publicKey;
        this.userAgent = buildUserAgent();
    }

    private final String buildUserAgent() {
        return "OmiseAndroid/5.4.0 Android/" + Build.VERSION.SDK_INT + " Model/" + Build.MODEL;
    }

    @NotNull
    public final String apiVersion() {
        return this.apiVersion;
    }

    @NotNull
    public final String publicKey() {
        return this.publicKey;
    }

    @NotNull
    public final String userAgent() {
        return this.userAgent;
    }

    public /* synthetic */ Config(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? API_VERSION : str, str2);
    }
}