package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0098\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b>\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b@\u0010\u0013¨\u0006A"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "", "", "transactionIdSift", "subscriberGroup", MessageBundle.TITLE_ENTRY, "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackage;", "packages", "requesterChannel", "requesterApplication", "requesterZone", "requesterId", "packageEndDateTime", "remainingDayDisplay", "ipkCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTransactionIdSift", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSubscriberGroup", OperatorName.CURVE_TO, "getTitle", "d", "Ljava/util/List;", "getPackages", "e", "getRequesterChannel", OperatorName.FILL_NON_ZERO, "getRequesterApplication", OperatorName.NON_STROKING_GRAY, "getRequesterZone", OperatorName.CLOSE_PATH, "getRequesterId", "i", "getPackageEndDateTime", OperatorName.SET_LINE_JOINSTYLE, "getRemainingDayDisplay", OperatorName.NON_STROKING_CMYK, "getIpkCode", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResp */
/* loaded from: classes7.dex */
public final class OneStvRecommendPackageResp {
    public static final int $stable = 8;
    @SerializedName("transactionIdSift")
    @Nullable

    /* renamed from: a */
    private final String f82190a;
    @SerializedName("subscriberGroup")
    @Nullable

    /* renamed from: b */
    private final String f82191b;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable

    /* renamed from: c */
    private final String f82192c;
    @SerializedName("packages")
    @NotNull

    /* renamed from: d */
    private final List<OneStvRecommendPackage> f82193d;
    @SerializedName("requesterChannel")
    @Nullable

    /* renamed from: e */
    private final String f82194e;
    @SerializedName("requesterApplication")
    @Nullable

    /* renamed from: f */
    private final String f82195f;
    @SerializedName("requesterZone")
    @Nullable

    /* renamed from: g */
    private final String f82196g;
    @SerializedName("requesterId")
    @Nullable

    /* renamed from: h */
    private final String f82197h;
    @SerializedName("packageEndDateTime")
    @Nullable

    /* renamed from: i */
    private final String f82198i;
    @SerializedName("remainingDayDisplay")
    @Nullable

    /* renamed from: j */
    private final String f82199j;
    @SerializedName("ipkCode")
    @Nullable

    /* renamed from: k */
    private final String f82200k;

    public OneStvRecommendPackageResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.f82190a;
    }

    @Nullable
    public final String component10() {
        return this.f82199j;
    }

    @Nullable
    public final String component11() {
        return this.f82200k;
    }

    @Nullable
    public final String component2() {
        return this.f82191b;
    }

    @Nullable
    public final String component3() {
        return this.f82192c;
    }

    @NotNull
    public final List<OneStvRecommendPackage> component4() {
        return this.f82193d;
    }

    @Nullable
    public final String component5() {
        return this.f82194e;
    }

    @Nullable
    public final String component6() {
        return this.f82195f;
    }

    @Nullable
    public final String component7() {
        return this.f82196g;
    }

    @Nullable
    public final String component8() {
        return this.f82197h;
    }

    @Nullable
    public final String component9() {
        return this.f82198i;
    }

    @NotNull
    public final OneStvRecommendPackageResp copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<OneStvRecommendPackage> packages, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        return new OneStvRecommendPackageResp(str, str2, str3, packages, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneStvRecommendPackageResp) {
            OneStvRecommendPackageResp oneStvRecommendPackageResp = (OneStvRecommendPackageResp) obj;
            return Intrinsics.areEqual(this.f82190a, oneStvRecommendPackageResp.f82190a) && Intrinsics.areEqual(this.f82191b, oneStvRecommendPackageResp.f82191b) && Intrinsics.areEqual(this.f82192c, oneStvRecommendPackageResp.f82192c) && Intrinsics.areEqual(this.f82193d, oneStvRecommendPackageResp.f82193d) && Intrinsics.areEqual(this.f82194e, oneStvRecommendPackageResp.f82194e) && Intrinsics.areEqual(this.f82195f, oneStvRecommendPackageResp.f82195f) && Intrinsics.areEqual(this.f82196g, oneStvRecommendPackageResp.f82196g) && Intrinsics.areEqual(this.f82197h, oneStvRecommendPackageResp.f82197h) && Intrinsics.areEqual(this.f82198i, oneStvRecommendPackageResp.f82198i) && Intrinsics.areEqual(this.f82199j, oneStvRecommendPackageResp.f82199j) && Intrinsics.areEqual(this.f82200k, oneStvRecommendPackageResp.f82200k);
        }
        return false;
    }

    @Nullable
    public final String getIpkCode() {
        return this.f82200k;
    }

    @Nullable
    public final String getPackageEndDateTime() {
        return this.f82198i;
    }

    @NotNull
    public final List<OneStvRecommendPackage> getPackages() {
        return this.f82193d;
    }

    @Nullable
    public final String getRemainingDayDisplay() {
        return this.f82199j;
    }

    @Nullable
    public final String getRequesterApplication() {
        return this.f82195f;
    }

    @Nullable
    public final String getRequesterChannel() {
        return this.f82194e;
    }

    @Nullable
    public final String getRequesterId() {
        return this.f82197h;
    }

    @Nullable
    public final String getRequesterZone() {
        return this.f82196g;
    }

    @Nullable
    public final String getSubscriberGroup() {
        return this.f82191b;
    }

    @Nullable
    public final String getTitle() {
        return this.f82192c;
    }

    @Nullable
    public final String getTransactionIdSift() {
        return this.f82190a;
    }

    public int hashCode() {
        String str = this.f82190a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82191b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82192c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f82193d.hashCode()) * 31;
        String str4 = this.f82194e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82195f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82196g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82197h;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82198i;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82199j;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82200k;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82190a;
        String str2 = this.f82191b;
        String str3 = this.f82192c;
        List<OneStvRecommendPackage> list = this.f82193d;
        String str4 = this.f82194e;
        String str5 = this.f82195f;
        String str6 = this.f82196g;
        String str7 = this.f82197h;
        String str8 = this.f82198i;
        String str9 = this.f82199j;
        String str10 = this.f82200k;
        return "OneStvRecommendPackageResp(transactionIdSift=" + str + ", subscriberGroup=" + str2 + ", title=" + str3 + ", packages=" + list + ", requesterChannel=" + str4 + ", requesterApplication=" + str5 + ", requesterZone=" + str6 + ", requesterId=" + str7 + ", packageEndDateTime=" + str8 + ", remainingDayDisplay=" + str9 + ", ipkCode=" + str10 + ")";
    }

    public OneStvRecommendPackageResp(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<OneStvRecommendPackage> packages, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f82190a = str;
        this.f82191b = str2;
        this.f82192c = str3;
        this.f82193d = packages;
        this.f82194e = str4;
        this.f82195f = str5;
        this.f82196g = str6;
        this.f82197h = str7;
        this.f82198i = str8;
        this.f82199j = str9;
        this.f82200k = str10;
    }

    public /* synthetic */ OneStvRecommendPackageResp(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
    }
}
