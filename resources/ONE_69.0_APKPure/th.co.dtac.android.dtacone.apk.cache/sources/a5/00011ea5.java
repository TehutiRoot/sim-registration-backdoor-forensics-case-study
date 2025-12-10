package th.p047co.dtac.android.dtacone.model.mixpanel;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.MixpanelValue;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/StvTracker;", "Lth/co/dtac/android/dtacone/model/mixpanel/Tracker;", "featureName", "", "eventName", "pkGroup", "pkDay", "pkPrice", "pkSpeed", "fromStretchRefill", "rtrCode", "userId", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "simR", "latitudeLongitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getProperties", "Lorg/json/JSONObject;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nStvTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StvTracker.kt\nth/co/dtac/android/dtacone/model/mixpanel/StvTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.StvTracker */
/* loaded from: classes8.dex */
public final class StvTracker extends Tracker {
    public static final int $stable = 0;
    @NotNull
    private final String eventName;
    @NotNull
    private final String featureName;
    @NotNull
    private final String fromStretchRefill;
    @Nullable
    private final String latitudeLongitude;
    @NotNull
    private final String pkDay;
    @NotNull
    private final String pkGroup;
    @NotNull
    private final String pkPrice;
    @NotNull
    private final String pkSpeed;
    @Nullable
    private final String rtrCode;
    @NotNull
    private final String simR;
    @NotNull
    private final String subscriberNumber;
    @NotNull
    private final String userId;

    public /* synthetic */ StvTracker(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : str8, str9, str10, str11, str12);
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    @NotNull
    public final JSONObject getProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MixpanelValue.SYSTEM_APP, "dtac One");
            jSONObject.put("Feature", this.featureName);
            jSONObject.put("Event", this.eventName);
            jSONObject.put("PK Group", this.pkGroup);
            jSONObject.put("PK Day", this.pkDay);
            jSONObject.put("PK Price", this.pkPrice);
            jSONObject.put("PK Speed", this.pkSpeed);
            jSONObject.put("From Stretch Refill", this.fromStretchRefill);
            jSONObject.put("RTR Code", this.rtrCode);
            jSONObject.put("SIM-R", this.simR);
            jSONObject.put("Customer No", PhoneNumberExtKt.toPretty(this.subscriberNumber));
            jSONObject.put("User ID", this.userId);
            jSONObject.put("Device Model", getDeviceModel());
            String str = this.latitudeLongitude;
            if (str != null) {
                jSONObject.put("Lat-Long", String.valueOf(str));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public StvTracker(@NotNull String featureName, @NotNull String eventName, @NotNull String pkGroup, @NotNull String pkDay, @NotNull String pkPrice, @NotNull String pkSpeed, @NotNull String fromStretchRefill, @Nullable String str, @NotNull String userId, @NotNull String subscriberNumber, @NotNull String simR, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(pkGroup, "pkGroup");
        Intrinsics.checkNotNullParameter(pkDay, "pkDay");
        Intrinsics.checkNotNullParameter(pkPrice, "pkPrice");
        Intrinsics.checkNotNullParameter(pkSpeed, "pkSpeed");
        Intrinsics.checkNotNullParameter(fromStretchRefill, "fromStretchRefill");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(simR, "simR");
        this.featureName = featureName;
        this.eventName = eventName;
        this.pkGroup = pkGroup;
        this.pkDay = pkDay;
        this.pkPrice = pkPrice;
        this.pkSpeed = pkSpeed;
        this.fromStretchRefill = fromStretchRefill;
        this.rtrCode = str;
        this.userId = userId;
        this.subscriberNumber = subscriberNumber;
        this.simR = simR;
        this.latitudeLongitude = str2;
    }
}