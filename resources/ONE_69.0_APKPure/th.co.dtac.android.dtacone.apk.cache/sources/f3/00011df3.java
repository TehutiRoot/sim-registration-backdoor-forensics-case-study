package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/Subscriber;", "", "aouText", "", "firstname", "lastname", NotificationCompat.CATEGORY_STATUS, InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAouText", "()Ljava/lang/String;", "getFirstname", "getLastname", "getStatus", "getSubscriberNumber", "getTelephoneType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.Subscriber */
/* loaded from: classes8.dex */
public final class Subscriber {
    public static final int $stable = 0;
    @SerializedName("aouText")
    @NotNull
    private final String aouText;
    @SerializedName("firstname")
    @NotNull
    private final String firstname;
    @SerializedName("lastname")
    @NotNull
    private final String lastname;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;

    public Subscriber(@NotNull String aouText, @NotNull String firstname, @NotNull String lastname, @NotNull String status, @NotNull String subscriberNumber, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(firstname, "firstname");
        Intrinsics.checkNotNullParameter(lastname, "lastname");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        this.aouText = aouText;
        this.firstname = firstname;
        this.lastname = lastname;
        this.status = status;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
    }

    public static /* synthetic */ Subscriber copy$default(Subscriber subscriber, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriber.aouText;
        }
        if ((i & 2) != 0) {
            str2 = subscriber.firstname;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = subscriber.lastname;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = subscriber.status;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = subscriber.subscriberNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = subscriber.telephoneType;
        }
        return subscriber.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.aouText;
    }

    @NotNull
    public final String component2() {
        return this.firstname;
    }

    @NotNull
    public final String component3() {
        return this.lastname;
    }

    @NotNull
    public final String component4() {
        return this.status;
    }

    @NotNull
    public final String component5() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component6() {
        return this.telephoneType;
    }

    @NotNull
    public final Subscriber copy(@NotNull String aouText, @NotNull String firstname, @NotNull String lastname, @NotNull String status, @NotNull String subscriberNumber, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(aouText, "aouText");
        Intrinsics.checkNotNullParameter(firstname, "firstname");
        Intrinsics.checkNotNullParameter(lastname, "lastname");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        return new Subscriber(aouText, firstname, lastname, status, subscriberNumber, telephoneType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            return Intrinsics.areEqual(this.aouText, subscriber.aouText) && Intrinsics.areEqual(this.firstname, subscriber.firstname) && Intrinsics.areEqual(this.lastname, subscriber.lastname) && Intrinsics.areEqual(this.status, subscriber.status) && Intrinsics.areEqual(this.subscriberNumber, subscriber.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, subscriber.telephoneType);
        }
        return false;
    }

    @NotNull
    public final String getAouText() {
        return this.aouText;
    }

    @NotNull
    public final String getFirstname() {
        return this.firstname;
    }

    @NotNull
    public final String getLastname() {
        return this.lastname;
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
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    public int hashCode() {
        return (((((((((this.aouText.hashCode() * 31) + this.firstname.hashCode()) * 31) + this.lastname.hashCode()) * 31) + this.status.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.aouText;
        String str2 = this.firstname;
        String str3 = this.lastname;
        String str4 = this.status;
        String str5 = this.subscriberNumber;
        String str6 = this.telephoneType;
        return "Subscriber(aouText=" + str + ", firstname=" + str2 + ", lastname=" + str3 + ", status=" + str4 + ", subscriberNumber=" + str5 + ", telephoneType=" + str6 + ")";
    }
}