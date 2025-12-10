package co.omise.android.p009ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m29142d2 = {"Lco/omise/android/ui/OmiseSDKError;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPEN_DEEP_LINK_FAILED", "THREE_DS2_INITIALIZATION_FAILED", "UNABLE_TO_GET_CONFIGS", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* renamed from: co.omise.android.ui.OmiseSDKError */
/* loaded from: classes3.dex */
public enum OmiseSDKError {
    OPEN_DEEP_LINK_FAILED("Open deep link failed"),
    THREE_DS2_INITIALIZATION_FAILED("3DS2 initialization failed"),
    UNABLE_TO_GET_CONFIGS("Unable to get configs, can't initialize 3DS2 SDK");
    
    @NotNull
    private final String value;

    OmiseSDKError(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}