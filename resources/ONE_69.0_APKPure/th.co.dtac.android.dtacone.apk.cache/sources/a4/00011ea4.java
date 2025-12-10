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
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/RegisterTracker;", "Lth/co/dtac/android/dtacone/model/mixpanel/Tracker;", "featureName", "", "eventName", "rtrCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "simR", "latitudeLongitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProperties", "Lorg/json/JSONObject;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRegisterTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTracker.kt\nth/co/dtac/android/dtacone/model/mixpanel/RegisterTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.RegisterTracker */
/* loaded from: classes8.dex */
public final class RegisterTracker extends Tracker {
    public static final int $stable = 0;
    @NotNull
    private final String eventName;
    @NotNull
    private final String featureName;
    @Nullable
    private final String latitudeLongitude;
    @Nullable
    private final String rtrCode;
    @Nullable
    private final String simR;
    @NotNull
    private final String subscriberNumber;

    public /* synthetic */ RegisterTracker(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    @NotNull
    public final JSONObject getProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MixpanelValue.SYSTEM_APP, "dtac One");
            jSONObject.put("Feature", this.featureName);
            jSONObject.put("Event", this.eventName);
            jSONObject.put("Customer No", PhoneNumberExtKt.toPretty(this.subscriberNumber));
            jSONObject.put("Device Model", getDeviceModel());
            String str = this.rtrCode;
            if (str != null) {
                jSONObject.put("RTR Code", str);
            }
            String str2 = this.simR;
            if (str2 != null) {
                jSONObject.put("SIM-R", str2);
            }
            String str3 = this.latitudeLongitude;
            if (str3 != null) {
                jSONObject.put("Lat-Long", String.valueOf(str3));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public RegisterTracker(@NotNull String featureName, @NotNull String eventName, @Nullable String str, @NotNull String subscriberNumber, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.featureName = featureName;
        this.eventName = eventName;
        this.rtrCode = str;
        this.subscriberNumber = subscriberNumber;
        this.simR = str2;
        this.latitudeLongitude = str3;
    }
}