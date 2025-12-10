package th.p047co.dtac.android.dtacone.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackageResp;", "", "transactionIdSift", "", "subscriberGroup", MessageBundle.TITLE_ENTRY, "packages", "", "Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackage;", "requesterChannel", "requesterApplication", "requesterZone", "requesterId", "packageEndDateTime", "remainingDayDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageEndDateTime", "()Ljava/lang/String;", "getPackages", "()Ljava/util/List;", "getRemainingDayDisplay", "getRequesterApplication", "getRequesterChannel", "getRequesterId", "getRequesterZone", "getSubscriberGroup", "getTitle", "getTransactionIdSift", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvRecommendPackageResp */
/* loaded from: classes8.dex */
public final class StvRecommendPackageResp {
    public static final int $stable = 8;
    @SerializedName("packageEndDateTime")
    @NotNull
    private final String packageEndDateTime;
    @SerializedName("packages")
    @NotNull
    private final List<StvRecommendPackage> packages;
    @SerializedName("remainingDayDisplay")
    @NotNull
    private final String remainingDayDisplay;
    @SerializedName("requesterApplication")
    @NotNull
    private final String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private final String requesterChannel;
    @SerializedName("requesterId")
    @NotNull
    private final String requesterId;
    @SerializedName("requesterZone")
    @NotNull
    private final String requesterZone;
    @SerializedName("subscriberGroup")
    @NotNull
    private final String subscriberGroup;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull
    private final String title;
    @SerializedName("transactionIdSift")
    @NotNull
    private final String transactionIdSift;

    public StvRecommendPackageResp() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final String component1() {
        return this.transactionIdSift;
    }

    @NotNull
    public final String component10() {
        return this.remainingDayDisplay;
    }

    @NotNull
    public final String component2() {
        return this.subscriberGroup;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final List<StvRecommendPackage> component4() {
        return this.packages;
    }

    @NotNull
    public final String component5() {
        return this.requesterChannel;
    }

    @NotNull
    public final String component6() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component7() {
        return this.requesterZone;
    }

    @NotNull
    public final String component8() {
        return this.requesterId;
    }

    @NotNull
    public final String component9() {
        return this.packageEndDateTime;
    }

    @NotNull
    public final StvRecommendPackageResp copy(@NotNull String transactionIdSift, @NotNull String subscriberGroup, @NotNull String title, @NotNull List<StvRecommendPackage> packages, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String requesterId, @NotNull String packageEndDateTime, @NotNull String remainingDayDisplay) {
        Intrinsics.checkNotNullParameter(transactionIdSift, "transactionIdSift");
        Intrinsics.checkNotNullParameter(subscriberGroup, "subscriberGroup");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(packageEndDateTime, "packageEndDateTime");
        Intrinsics.checkNotNullParameter(remainingDayDisplay, "remainingDayDisplay");
        return new StvRecommendPackageResp(transactionIdSift, subscriberGroup, title, packages, requesterChannel, requesterApplication, requesterZone, requesterId, packageEndDateTime, remainingDayDisplay);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StvRecommendPackageResp) {
            StvRecommendPackageResp stvRecommendPackageResp = (StvRecommendPackageResp) obj;
            return Intrinsics.areEqual(this.transactionIdSift, stvRecommendPackageResp.transactionIdSift) && Intrinsics.areEqual(this.subscriberGroup, stvRecommendPackageResp.subscriberGroup) && Intrinsics.areEqual(this.title, stvRecommendPackageResp.title) && Intrinsics.areEqual(this.packages, stvRecommendPackageResp.packages) && Intrinsics.areEqual(this.requesterChannel, stvRecommendPackageResp.requesterChannel) && Intrinsics.areEqual(this.requesterApplication, stvRecommendPackageResp.requesterApplication) && Intrinsics.areEqual(this.requesterZone, stvRecommendPackageResp.requesterZone) && Intrinsics.areEqual(this.requesterId, stvRecommendPackageResp.requesterId) && Intrinsics.areEqual(this.packageEndDateTime, stvRecommendPackageResp.packageEndDateTime) && Intrinsics.areEqual(this.remainingDayDisplay, stvRecommendPackageResp.remainingDayDisplay);
        }
        return false;
    }

    @NotNull
    public final String getPackageEndDateTime() {
        return this.packageEndDateTime;
    }

    @NotNull
    public final List<StvRecommendPackage> getPackages() {
        return this.packages;
    }

    @NotNull
    public final String getRemainingDayDisplay() {
        return this.remainingDayDisplay;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @NotNull
    public final String getSubscriberGroup() {
        return this.subscriberGroup;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTransactionIdSift() {
        return this.transactionIdSift;
    }

    public int hashCode() {
        return (((((((((((((((((this.transactionIdSift.hashCode() * 31) + this.subscriberGroup.hashCode()) * 31) + this.title.hashCode()) * 31) + this.packages.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31) + this.requesterId.hashCode()) * 31) + this.packageEndDateTime.hashCode()) * 31) + this.remainingDayDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.transactionIdSift;
        String str2 = this.subscriberGroup;
        String str3 = this.title;
        List<StvRecommendPackage> list = this.packages;
        String str4 = this.requesterChannel;
        String str5 = this.requesterApplication;
        String str6 = this.requesterZone;
        String str7 = this.requesterId;
        String str8 = this.packageEndDateTime;
        String str9 = this.remainingDayDisplay;
        return "StvRecommendPackageResp(transactionIdSift=" + str + ", subscriberGroup=" + str2 + ", title=" + str3 + ", packages=" + list + ", requesterChannel=" + str4 + ", requesterApplication=" + str5 + ", requesterZone=" + str6 + ", requesterId=" + str7 + ", packageEndDateTime=" + str8 + ", remainingDayDisplay=" + str9 + ")";
    }

    public StvRecommendPackageResp(@NotNull String transactionIdSift, @NotNull String subscriberGroup, @NotNull String title, @NotNull List<StvRecommendPackage> packages, @NotNull String requesterChannel, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String requesterId, @NotNull String packageEndDateTime, @NotNull String remainingDayDisplay) {
        Intrinsics.checkNotNullParameter(transactionIdSift, "transactionIdSift");
        Intrinsics.checkNotNullParameter(subscriberGroup, "subscriberGroup");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(packageEndDateTime, "packageEndDateTime");
        Intrinsics.checkNotNullParameter(remainingDayDisplay, "remainingDayDisplay");
        this.transactionIdSift = transactionIdSift;
        this.subscriberGroup = subscriberGroup;
        this.title = title;
        this.packages = packages;
        this.requesterChannel = requesterChannel;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.requesterId = requesterId;
        this.packageEndDateTime = packageEndDateTime;
        this.remainingDayDisplay = remainingDayDisplay;
    }

    public /* synthetic */ StvRecommendPackageResp(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "");
    }
}