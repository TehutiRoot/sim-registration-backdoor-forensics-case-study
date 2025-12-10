package th.p047co.dtac.android.dtacone.model.mixpanel.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.mixpanel.Tracker;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.MixpanelValue;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0094\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/buy_dol/BuyDolTracker;", "Lth/co/dtac/android/dtacone/model/mixpanel/Tracker;", "", "function", "", "amount", "fee", "total", "action", "paymentType", "bank", "usedLocation", "system", "channel", "rtrCode", "simr", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "properties", "getProperties", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mixpanel/buy_dol/BuyDolTracker;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "I", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.buy_dol.BuyDolTracker */
/* loaded from: classes8.dex */
public final class BuyDolTracker extends Tracker {
    public static final int $stable = 0;
    @NotNull
    private final String action;
    private final int amount;
    @Nullable
    private final String bank;
    @Nullable
    private final String channel;
    private final int fee;
    @NotNull
    private final String function;
    @Nullable
    private final String paymentType;
    @Nullable
    private final String rtrCode;
    @Nullable
    private final String simr;
    @NotNull
    private final String system;
    private final int total;
    @Nullable
    private final String usedLocation;

    public /* synthetic */ BuyDolTracker(String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, str2, str3, str4, str5, (i4 & 256) != 0 ? MixpanelValue.SYSTEM_APP : str6, str7, str8, str9);
    }

    @NotNull
    public final BuyDolTracker copy(@NotNull String function, int i, int i2, int i3, @NotNull String action, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String system, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(system, "system");
        return new BuyDolTracker(function, i, i2, i3, action, str, str2, str3, system, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyDolTracker) {
            BuyDolTracker buyDolTracker = (BuyDolTracker) obj;
            return Intrinsics.areEqual(this.function, buyDolTracker.function) && this.amount == buyDolTracker.amount && this.fee == buyDolTracker.fee && this.total == buyDolTracker.total && Intrinsics.areEqual(this.action, buyDolTracker.action) && Intrinsics.areEqual(this.paymentType, buyDolTracker.paymentType) && Intrinsics.areEqual(this.bank, buyDolTracker.bank) && Intrinsics.areEqual(this.usedLocation, buyDolTracker.usedLocation) && Intrinsics.areEqual(this.system, buyDolTracker.system) && Intrinsics.areEqual(this.channel, buyDolTracker.channel) && Intrinsics.areEqual(this.rtrCode, buyDolTracker.rtrCode) && Intrinsics.areEqual(this.simr, buyDolTracker.simr);
        }
        return false;
    }

    @NotNull
    public final JSONObject getProperties(@NotNull JSONObject properties) {
        String str;
        Intrinsics.checkNotNullParameter(properties, "properties");
        try {
            properties.put(MixpanelValue.SYSTEM_APP, "dtac One");
            properties.put("Function", this.function);
            properties.put("Amount ", this.amount);
            properties.put("Fee", this.fee);
            properties.put("Total", this.total);
            properties.put(PDAction.TYPE, this.action);
            properties.put("Payment Type", this.paymentType);
            properties.put("Bank", this.bank);
            properties.put("Device Model", getDeviceModel());
            properties.put("Used Location", this.usedLocation);
            properties.put("System", this.system);
            properties.put("Channel", this.channel);
            properties.put("Retailer Code", this.rtrCode);
            String str2 = this.simr;
            if (str2 != null) {
                str = PhoneNumberExtKt.toPretty(str2);
            } else {
                str = null;
            }
            properties.put("SIM-R", str);
        } catch (Exception e) {
            e.getMessage();
        }
        return properties;
    }

    public int hashCode() {
        int hashCode = ((((((((this.function.hashCode() * 31) + this.amount) * 31) + this.fee) * 31) + this.total) * 31) + this.action.hashCode()) * 31;
        String str = this.paymentType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bank;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.usedLocation;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.system.hashCode()) * 31;
        String str4 = this.channel;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rtrCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.simr;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.function;
        int i = this.amount;
        int i2 = this.fee;
        int i3 = this.total;
        String str2 = this.action;
        String str3 = this.paymentType;
        String str4 = this.bank;
        String str5 = this.usedLocation;
        String str6 = this.system;
        String str7 = this.channel;
        String str8 = this.rtrCode;
        String str9 = this.simr;
        return "BuyDolTracker(function=" + str + ", amount=" + i + ", fee=" + i2 + ", total=" + i3 + ", action=" + str2 + ", paymentType=" + str3 + ", bank=" + str4 + ", usedLocation=" + str5 + ", system=" + str6 + ", channel=" + str7 + ", rtrCode=" + str8 + ", simr=" + str9 + ")";
    }

    public BuyDolTracker(@NotNull String function, int i, int i2, int i3, @NotNull String action, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String system, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(system, "system");
        this.function = function;
        this.amount = i;
        this.fee = i2;
        this.total = i3;
        this.action = action;
        this.paymentType = str;
        this.bank = str2;
        this.usedLocation = str3;
        this.system = system;
        this.channel = str4;
        this.rtrCode = str5;
        this.simr = str6;
    }
}