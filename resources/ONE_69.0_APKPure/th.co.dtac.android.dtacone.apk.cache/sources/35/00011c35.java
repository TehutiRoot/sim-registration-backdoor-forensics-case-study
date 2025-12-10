package th.p047co.dtac.android.dtacone.model.appOne.tol.device;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceResponse;", "", "codeType", "", "code", "desc", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceResponse */
/* loaded from: classes8.dex */
public final class DeviceResponse {
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("codeType")
    @NotNull
    private final String codeType;
    @SerializedName("data")
    @NotNull
    private final DeviceData data;
    @SerializedName("desc")
    @NotNull
    private final String desc;
    @SerializedName("replaceMessage")
    @NotNull
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @NotNull
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @NotNull
    private final String systemMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceResponse$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.device.DeviceResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceResponse mock() {
            return new DeviceResponse("S", null, "", "", CollectionsKt__CollectionsKt.emptyList(), "2021-09-01T00:00:00", DeviceData.Companion.mock(), 2, null);
        }

        private Companion() {
        }
    }

    public DeviceResponse(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull DeviceData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        this.codeType = codeType;
        this.code = code;
        this.desc = desc;
        this.systemMessage = systemMessage;
        this.replaceMessage = replaceMessage;
        this.responseDateTime = responseDateTime;
        this.data = data;
    }

    public static /* synthetic */ DeviceResponse copy$default(DeviceResponse deviceResponse, String str, String str2, String str3, String str4, List list, String str5, DeviceData deviceData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceResponse.codeType;
        }
        if ((i & 2) != 0) {
            str2 = deviceResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = deviceResponse.desc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = deviceResponse.systemMessage;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = deviceResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = deviceResponse.responseDateTime;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            deviceData = deviceResponse.data;
        }
        return deviceResponse.copy(str, str6, str7, str8, list3, str9, deviceData);
    }

    @NotNull
    public final String component1() {
        return this.codeType;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component4() {
        return this.systemMessage;
    }

    @NotNull
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @NotNull
    public final String component6() {
        return this.responseDateTime;
    }

    @NotNull
    public final DeviceData component7() {
        return this.data;
    }

    @NotNull
    public final DeviceResponse copy(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull DeviceData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DeviceResponse(codeType, code, desc, systemMessage, replaceMessage, responseDateTime, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceResponse) {
            DeviceResponse deviceResponse = (DeviceResponse) obj;
            return Intrinsics.areEqual(this.codeType, deviceResponse.codeType) && Intrinsics.areEqual(this.code, deviceResponse.code) && Intrinsics.areEqual(this.desc, deviceResponse.desc) && Intrinsics.areEqual(this.systemMessage, deviceResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, deviceResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, deviceResponse.responseDateTime) && Intrinsics.areEqual(this.data, deviceResponse.data);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final DeviceData getData() {
        return this.data;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @NotNull
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @NotNull
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        return (((((((((((this.codeType.hashCode() * 31) + this.code.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.systemMessage.hashCode()) * 31) + this.replaceMessage.hashCode()) * 31) + this.responseDateTime.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.codeType;
        String str2 = this.code;
        String str3 = this.desc;
        String str4 = this.systemMessage;
        List<String> list = this.replaceMessage;
        String str5 = this.responseDateTime;
        DeviceData deviceData = this.data;
        return "DeviceResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + deviceData + ")";
    }

    public /* synthetic */ DeviceResponse(String str, String str2, String str3, String str4, List list, String str5, DeviceData deviceData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str5, deviceData);
    }
}