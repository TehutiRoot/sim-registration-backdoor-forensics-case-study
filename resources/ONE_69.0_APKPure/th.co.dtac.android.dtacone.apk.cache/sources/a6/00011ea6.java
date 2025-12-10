package th.p047co.dtac.android.dtacone.model.mixpanel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.MixpanelValue;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/TopUpTracker;", "Lth/co/dtac/android/dtacone/model/mixpanel/Tracker;", "featureName", "", "eventName", FirebaseAnalytics.Param.PRICE, "rtrCode", "userId", "offerType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "simR", "latitudeLongitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getPrice", "getProperties", "Lorg/json/JSONObject;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTopUpTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopUpTracker.kt\nth/co/dtac/android/dtacone/model/mixpanel/TopUpTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.TopUpTracker */
/* loaded from: classes8.dex */
public final class TopUpTracker extends Tracker {
    public static final int $stable = 0;
    @NotNull
    private final String eventName;
    @NotNull
    private final String featureName;
    @Nullable
    private final String latitudeLongitude;
    @Nullable
    private final String offerType;
    @NotNull
    private final String price;
    @Nullable
    private final String rtrCode;
    @NotNull
    private final String simR;
    @NotNull
    private final String subscriberNumber;
    @NotNull
    private final String userId;

    public /* synthetic */ TopUpTracker(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? TopUpMixpanel.OFFER_NONE : str6, str7, str8, str9);
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final JSONObject getProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MixpanelValue.SYSTEM_APP, "dtac One");
            jSONObject.put("Feature", this.featureName);
            jSONObject.put("Event", this.eventName);
            jSONObject.put("Offer Type", this.offerType);
            jSONObject.put("Price", this.price);
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

    public TopUpTracker(@NotNull String featureName, @NotNull String eventName, @NotNull String price, @Nullable String str, @NotNull String userId, @Nullable String str2, @NotNull String subscriberNumber, @NotNull String simR, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(simR, "simR");
        this.featureName = featureName;
        this.eventName = eventName;
        this.price = price;
        this.rtrCode = str;
        this.userId = userId;
        this.offerType = str2;
        this.subscriberNumber = subscriberNumber;
        this.simR = simR;
        this.latitudeLongitude = str3;
    }
}