package th.p047co.dtac.android.dtacone.model.mixpanel.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.model.mixpanel.Tracker;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.MixpanelValue;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0090\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidTracker;", "Lth/co/dtac/android/dtacone/model/mixpanel/Tracker;", "", "action", "simType", "faceRecognitionState", "system", "channel", "rtrCode", "subChannel", "usedLocation", "retailerType", "idCaptureType", "", "msisdnSum", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Lorg/json/JSONObject;", "properties", "getProperties", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidTracker;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Ljava/lang/Integer;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.prepaid.PrepaidTracker */
/* loaded from: classes8.dex */
public final class PrepaidTracker extends Tracker {
    public static final int $stable = 0;
    @NotNull
    private final String action;
    @Nullable
    private final String channel;
    @Nullable
    private final String faceRecognitionState;
    @Nullable
    private final String idCaptureType;
    @Nullable
    private final Integer msisdnSum;
    @Nullable
    private final String retailerType;
    @Nullable
    private final String rtrCode;
    @Nullable
    private final String simType;
    @Nullable
    private final String subChannel;
    @NotNull
    private final String system;
    @Nullable
    private final String usedLocation;

    public /* synthetic */ PrepaidTracker(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? MixpanelValue.SYSTEM_APP : str4, str5, str6, str7, str8, str9, str10, num);
    }

    @NotNull
    public final PrepaidTracker copy(@NotNull String action, @Nullable String str, @Nullable String str2, @NotNull String system, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(system, "system");
        return new PrepaidTracker(action, str, str2, system, str3, str4, str5, str6, str7, str8, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrepaidTracker) {
            PrepaidTracker prepaidTracker = (PrepaidTracker) obj;
            return Intrinsics.areEqual(this.action, prepaidTracker.action) && Intrinsics.areEqual(this.simType, prepaidTracker.simType) && Intrinsics.areEqual(this.faceRecognitionState, prepaidTracker.faceRecognitionState) && Intrinsics.areEqual(this.system, prepaidTracker.system) && Intrinsics.areEqual(this.channel, prepaidTracker.channel) && Intrinsics.areEqual(this.rtrCode, prepaidTracker.rtrCode) && Intrinsics.areEqual(this.subChannel, prepaidTracker.subChannel) && Intrinsics.areEqual(this.usedLocation, prepaidTracker.usedLocation) && Intrinsics.areEqual(this.retailerType, prepaidTracker.retailerType) && Intrinsics.areEqual(this.idCaptureType, prepaidTracker.idCaptureType) && Intrinsics.areEqual(this.msisdnSum, prepaidTracker.msisdnSum);
        }
        return false;
    }

    @NotNull
    public final JSONObject getProperties(@NotNull JSONObject properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        try {
            properties.put(MixpanelValue.SYSTEM_APP, "dtac One");
            properties.put("Function", "Prepaid Registration");
            properties.put(PDAction.TYPE, this.action);
            properties.put("Device Model", getDeviceModel());
            properties.put("Used Location", this.usedLocation);
            properties.put("System", this.system);
            properties.put("Channel", this.channel);
            properties.put("Retailer Code", this.rtrCode);
            properties.put("Retailer Type", this.retailerType);
            properties.put("Sub Channel", this.subChannel);
            properties.put("ID Capture Type", this.idCaptureType);
            properties.put("Face Recognition", this.faceRecognitionState);
            properties.put("MSISDN Sum", this.msisdnSum);
            properties.put("SIM Type", this.simType);
        } catch (Exception e) {
            e.getMessage();
        }
        return properties;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.simType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.faceRecognitionState;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.system.hashCode()) * 31;
        String str3 = this.channel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rtrCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subChannel;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.usedLocation;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.retailerType;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idCaptureType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.msisdnSum;
        return hashCode9 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.simType;
        String str3 = this.faceRecognitionState;
        String str4 = this.system;
        String str5 = this.channel;
        String str6 = this.rtrCode;
        String str7 = this.subChannel;
        String str8 = this.usedLocation;
        String str9 = this.retailerType;
        String str10 = this.idCaptureType;
        Integer num = this.msisdnSum;
        return "PrepaidTracker(action=" + str + ", simType=" + str2 + ", faceRecognitionState=" + str3 + ", system=" + str4 + ", channel=" + str5 + ", rtrCode=" + str6 + ", subChannel=" + str7 + ", usedLocation=" + str8 + ", retailerType=" + str9 + ", idCaptureType=" + str10 + ", msisdnSum=" + num + ")";
    }

    public PrepaidTracker(@NotNull String action, @Nullable String str, @Nullable String str2, @NotNull String system, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(system, "system");
        this.action = action;
        this.simType = str;
        this.faceRecognitionState = str2;
        this.system = system;
        this.channel = str3;
        this.rtrCode = str4;
        this.subChannel = str5;
        this.usedLocation = str6;
        this.retailerType = str7;
        this.idCaptureType = str8;
        this.msisdnSum = num;
    }
}