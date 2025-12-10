package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0002\u0010\u0019J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0017HÆ\u0003J\t\u0010B\u001a\u00020\u0017HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jã\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0017HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010 R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d¨\u0006P"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Subscriber;", "", "billingProductCode", "", "brand", "firstname", "imeiNumber", "lastname", "mainPackageCode", "mainPackageGroupCode", "mainPackageDescription", "model", "packageCode", "packageDescription", "packageGroupCode", "packageGroupDescription", "simcardNumber", NotificationCompat.CATEGORY_STATUS, InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberType", ConstsKt.TELEPHONE_TYPE, MessageBundle.TITLE_ENTRY, "packagePrice", "", "advancePayment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAdvancePayment", "()I", "getBillingProductCode", "()Ljava/lang/String;", "getBrand", "setBrand", "(Ljava/lang/String;)V", "getFirstname", "getImeiNumber", "setImeiNumber", "getLastname", "getMainPackageCode", "getMainPackageDescription", "getMainPackageGroupCode", "getModel", "setModel", "getPackageCode", "getPackageDescription", "getPackageGroupCode", "getPackageGroupDescription", "getPackagePrice", "getSimcardNumber", "getStatus", "getSubscriberNumber", "getSubscriberType", "getTelephoneType", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Subscriber */
/* loaded from: classes8.dex */
public final class Subscriber {
    public static final int $stable = 8;
    @SerializedName("advancePayment")
    private final int advancePayment;
    @SerializedName("billingProductCode")
    @NotNull
    private final String billingProductCode;
    @SerializedName("brand")
    @Nullable
    private String brand;
    @SerializedName("firstname")
    @NotNull
    private final String firstname;
    @SerializedName("imeiNumber")
    @Nullable
    private String imeiNumber;
    @SerializedName("lastname")
    @NotNull
    private final String lastname;
    @SerializedName("mainPackageCode")
    @NotNull
    private final String mainPackageCode;
    @SerializedName("mainPackageDescription")
    @NotNull
    private final String mainPackageDescription;
    @SerializedName("mainPackageGroupCode")
    @Nullable
    private final String mainPackageGroupCode;
    @SerializedName("model")
    @Nullable
    private String model;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("packageDescription")
    @NotNull
    private final String packageDescription;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @NotNull
    private final String packageGroupDescription;
    @SerializedName("packagePrice")
    private final int packagePrice;
    @SerializedName("simcardNumber")
    @NotNull
    private final String simcardNumber;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull
    private final String title;

    public Subscriber(@NotNull String billingProductCode, @Nullable String str, @NotNull String firstname, @Nullable String str2, @NotNull String lastname, @NotNull String mainPackageCode, @Nullable String str3, @NotNull String mainPackageDescription, @Nullable String str4, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String simcardNumber, @NotNull String status, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String title, int i, int i2) {
        Intrinsics.checkNotNullParameter(billingProductCode, "billingProductCode");
        Intrinsics.checkNotNullParameter(firstname, "firstname");
        Intrinsics.checkNotNullParameter(lastname, "lastname");
        Intrinsics.checkNotNullParameter(mainPackageCode, "mainPackageCode");
        Intrinsics.checkNotNullParameter(mainPackageDescription, "mainPackageDescription");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(simcardNumber, "simcardNumber");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.billingProductCode = billingProductCode;
        this.brand = str;
        this.firstname = firstname;
        this.imeiNumber = str2;
        this.lastname = lastname;
        this.mainPackageCode = mainPackageCode;
        this.mainPackageGroupCode = str3;
        this.mainPackageDescription = mainPackageDescription;
        this.model = str4;
        this.packageCode = packageCode;
        this.packageDescription = packageDescription;
        this.packageGroupCode = packageGroupCode;
        this.packageGroupDescription = packageGroupDescription;
        this.simcardNumber = simcardNumber;
        this.status = status;
        this.subscriberNumber = subscriberNumber;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
        this.title = title;
        this.packagePrice = i;
        this.advancePayment = i2;
    }

    @NotNull
    public final String component1() {
        return this.billingProductCode;
    }

    @NotNull
    public final String component10() {
        return this.packageCode;
    }

    @NotNull
    public final String component11() {
        return this.packageDescription;
    }

    @NotNull
    public final String component12() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component13() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final String component14() {
        return this.simcardNumber;
    }

    @NotNull
    public final String component15() {
        return this.status;
    }

    @NotNull
    public final String component16() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component17() {
        return this.subscriberType;
    }

    @NotNull
    public final String component18() {
        return this.telephoneType;
    }

    @NotNull
    public final String component19() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.brand;
    }

    public final int component20() {
        return this.packagePrice;
    }

    public final int component21() {
        return this.advancePayment;
    }

    @NotNull
    public final String component3() {
        return this.firstname;
    }

    @Nullable
    public final String component4() {
        return this.imeiNumber;
    }

    @NotNull
    public final String component5() {
        return this.lastname;
    }

    @NotNull
    public final String component6() {
        return this.mainPackageCode;
    }

    @Nullable
    public final String component7() {
        return this.mainPackageGroupCode;
    }

    @NotNull
    public final String component8() {
        return this.mainPackageDescription;
    }

    @Nullable
    public final String component9() {
        return this.model;
    }

    @NotNull
    public final Subscriber copy(@NotNull String billingProductCode, @Nullable String str, @NotNull String firstname, @Nullable String str2, @NotNull String lastname, @NotNull String mainPackageCode, @Nullable String str3, @NotNull String mainPackageDescription, @Nullable String str4, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String simcardNumber, @NotNull String status, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String title, int i, int i2) {
        Intrinsics.checkNotNullParameter(billingProductCode, "billingProductCode");
        Intrinsics.checkNotNullParameter(firstname, "firstname");
        Intrinsics.checkNotNullParameter(lastname, "lastname");
        Intrinsics.checkNotNullParameter(mainPackageCode, "mainPackageCode");
        Intrinsics.checkNotNullParameter(mainPackageDescription, "mainPackageDescription");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(simcardNumber, "simcardNumber");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(title, "title");
        return new Subscriber(billingProductCode, str, firstname, str2, lastname, mainPackageCode, str3, mainPackageDescription, str4, packageCode, packageDescription, packageGroupCode, packageGroupDescription, simcardNumber, status, subscriberNumber, subscriberType, telephoneType, title, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            return Intrinsics.areEqual(this.billingProductCode, subscriber.billingProductCode) && Intrinsics.areEqual(this.brand, subscriber.brand) && Intrinsics.areEqual(this.firstname, subscriber.firstname) && Intrinsics.areEqual(this.imeiNumber, subscriber.imeiNumber) && Intrinsics.areEqual(this.lastname, subscriber.lastname) && Intrinsics.areEqual(this.mainPackageCode, subscriber.mainPackageCode) && Intrinsics.areEqual(this.mainPackageGroupCode, subscriber.mainPackageGroupCode) && Intrinsics.areEqual(this.mainPackageDescription, subscriber.mainPackageDescription) && Intrinsics.areEqual(this.model, subscriber.model) && Intrinsics.areEqual(this.packageCode, subscriber.packageCode) && Intrinsics.areEqual(this.packageDescription, subscriber.packageDescription) && Intrinsics.areEqual(this.packageGroupCode, subscriber.packageGroupCode) && Intrinsics.areEqual(this.packageGroupDescription, subscriber.packageGroupDescription) && Intrinsics.areEqual(this.simcardNumber, subscriber.simcardNumber) && Intrinsics.areEqual(this.status, subscriber.status) && Intrinsics.areEqual(this.subscriberNumber, subscriber.subscriberNumber) && Intrinsics.areEqual(this.subscriberType, subscriber.subscriberType) && Intrinsics.areEqual(this.telephoneType, subscriber.telephoneType) && Intrinsics.areEqual(this.title, subscriber.title) && this.packagePrice == subscriber.packagePrice && this.advancePayment == subscriber.advancePayment;
        }
        return false;
    }

    public final int getAdvancePayment() {
        return this.advancePayment;
    }

    @NotNull
    public final String getBillingProductCode() {
        return this.billingProductCode;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getFirstname() {
        return this.firstname;
    }

    @Nullable
    public final String getImeiNumber() {
        return this.imeiNumber;
    }

    @NotNull
    public final String getLastname() {
        return this.lastname;
    }

    @NotNull
    public final String getMainPackageCode() {
        return this.mainPackageCode;
    }

    @NotNull
    public final String getMainPackageDescription() {
        return this.mainPackageDescription;
    }

    @Nullable
    public final String getMainPackageGroupCode() {
        return this.mainPackageGroupCode;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    public final int getPackagePrice() {
        return this.packagePrice;
    }

    @NotNull
    public final String getSimcardNumber() {
        return this.simcardNumber;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.billingProductCode.hashCode() * 31;
        String str = this.brand;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.firstname.hashCode()) * 31;
        String str2 = this.imeiNumber;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.lastname.hashCode()) * 31) + this.mainPackageCode.hashCode()) * 31;
        String str3 = this.mainPackageGroupCode;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.mainPackageDescription.hashCode()) * 31;
        String str4 = this.model;
        return ((((((((((((((((((((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.packageCode.hashCode()) * 31) + this.packageDescription.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.packageGroupDescription.hashCode()) * 31) + this.simcardNumber.hashCode()) * 31) + this.status.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.packagePrice) * 31) + this.advancePayment;
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public final void setImeiNumber(@Nullable String str) {
        this.imeiNumber = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    @NotNull
    public String toString() {
        String str = this.billingProductCode;
        String str2 = this.brand;
        String str3 = this.firstname;
        String str4 = this.imeiNumber;
        String str5 = this.lastname;
        String str6 = this.mainPackageCode;
        String str7 = this.mainPackageGroupCode;
        String str8 = this.mainPackageDescription;
        String str9 = this.model;
        String str10 = this.packageCode;
        String str11 = this.packageDescription;
        String str12 = this.packageGroupCode;
        String str13 = this.packageGroupDescription;
        String str14 = this.simcardNumber;
        String str15 = this.status;
        String str16 = this.subscriberNumber;
        String str17 = this.subscriberType;
        String str18 = this.telephoneType;
        String str19 = this.title;
        int i = this.packagePrice;
        int i2 = this.advancePayment;
        return "Subscriber(billingProductCode=" + str + ", brand=" + str2 + ", firstname=" + str3 + ", imeiNumber=" + str4 + ", lastname=" + str5 + ", mainPackageCode=" + str6 + ", mainPackageGroupCode=" + str7 + ", mainPackageDescription=" + str8 + ", model=" + str9 + ", packageCode=" + str10 + ", packageDescription=" + str11 + ", packageGroupCode=" + str12 + ", packageGroupDescription=" + str13 + ", simcardNumber=" + str14 + ", status=" + str15 + ", subscriberNumber=" + str16 + ", subscriberType=" + str17 + ", telephoneType=" + str18 + ", title=" + str19 + ", packagePrice=" + i + ", advancePayment=" + i2 + ")";
    }
}