package th.p047co.dtac.android.dtacone.view.appOne.eSign.request;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/request/UnifyQrRequest;", "", Action.KEY_ATTRIBUTE, "", "userLan", "simCardNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey$annotations", "()V", "getKey", "()Ljava/lang/String;", "getSimCardNumber$annotations", "getSimCardNumber", "getSubscriberNumber$annotations", "getSubscriberNumber", "getUserLan$annotations", "getUserLan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.request.UnifyQrRequest */
/* loaded from: classes10.dex */
public final class UnifyQrRequest {
    public static final int $stable = 0;
    @Nullable
    private final String key;
    @Nullable
    private final String simCardNumber;
    @Nullable
    private final String subscriberNumber;
    @Nullable
    private final String userLan;

    public UnifyQrRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UnifyQrRequest copy$default(UnifyQrRequest unifyQrRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unifyQrRequest.key;
        }
        if ((i & 2) != 0) {
            str2 = unifyQrRequest.userLan;
        }
        if ((i & 4) != 0) {
            str3 = unifyQrRequest.simCardNumber;
        }
        if ((i & 8) != 0) {
            str4 = unifyQrRequest.subscriberNumber;
        }
        return unifyQrRequest.copy(str, str2, str3, str4);
    }

    @SerialName(Action.KEY_ATTRIBUTE)
    public static /* synthetic */ void getKey$annotations() {
    }

    @SerialName("simCardNumber")
    public static /* synthetic */ void getSimCardNumber$annotations() {
    }

    @SerialName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    public static /* synthetic */ void getSubscriberNumber$annotations() {
    }

    @SerialName("userLan")
    public static /* synthetic */ void getUserLan$annotations() {
    }

    @Nullable
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final String component2() {
        return this.userLan;
    }

    @Nullable
    public final String component3() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final UnifyQrRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new UnifyQrRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnifyQrRequest) {
            UnifyQrRequest unifyQrRequest = (UnifyQrRequest) obj;
            return Intrinsics.areEqual(this.key, unifyQrRequest.key) && Intrinsics.areEqual(this.userLan, unifyQrRequest.userLan) && Intrinsics.areEqual(this.simCardNumber, unifyQrRequest.simCardNumber) && Intrinsics.areEqual(this.subscriberNumber, unifyQrRequest.subscriberNumber);
        }
        return false;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.simCardNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriberNumber;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.userLan;
        String str3 = this.simCardNumber;
        String str4 = this.subscriberNumber;
        return "UnifyQrRequest(key=" + str + ", userLan=" + str2 + ", simCardNumber=" + str3 + ", subscriberNumber=" + str4 + ")";
    }

    public UnifyQrRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.key = str;
        this.userLan = str2;
        this.simCardNumber = str3;
        this.subscriberNumber = str4;
    }

    public /* synthetic */ UnifyQrRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}