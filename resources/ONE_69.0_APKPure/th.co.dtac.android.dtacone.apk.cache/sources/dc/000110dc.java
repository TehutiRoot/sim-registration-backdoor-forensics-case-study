package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00103R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010)¨\u00067"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "packageResp", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "getBalanceResponse", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "simRCollection", "subscriberGroup", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;Ljava/lang/String;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "component2", "()Ljava/lang/String;", "component3", "()Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "component4", "()Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "component5", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/StvProsermOnline;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "getPackageResp", "setPackageResp", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getSubscriberNumber", "setSubscriberNumber", "(Ljava/lang/String;)V", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "getGetBalanceResponse", "setGetBalanceResponse", "(Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;)V", "d", "Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;", "getSimRCollection", "setSimRCollection", "(Lth/co/dtac/android/dtacone/app_one/model/stv/SimRCollectionResponse;)V", "e", "getSubscriberGroup", "setSubscriberGroup", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.StvProsermOnline */
/* loaded from: classes7.dex */
public final class StvProsermOnline {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneStvRecommendPackageResp f82386a;

    /* renamed from: b */
    public String f82387b;

    /* renamed from: c */
    public BalanceResponse f82388c;

    /* renamed from: d */
    public SimRCollectionResponse f82389d;

    /* renamed from: e */
    public String f82390e;

    public StvProsermOnline() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StvProsermOnline copy$default(StvProsermOnline stvProsermOnline, OneStvRecommendPackageResp oneStvRecommendPackageResp, String str, BalanceResponse balanceResponse, SimRCollectionResponse simRCollectionResponse, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            oneStvRecommendPackageResp = stvProsermOnline.f82386a;
        }
        if ((i & 2) != 0) {
            str = stvProsermOnline.f82387b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            balanceResponse = stvProsermOnline.f82388c;
        }
        BalanceResponse balanceResponse2 = balanceResponse;
        if ((i & 8) != 0) {
            simRCollectionResponse = stvProsermOnline.f82389d;
        }
        SimRCollectionResponse simRCollectionResponse2 = simRCollectionResponse;
        if ((i & 16) != 0) {
            str2 = stvProsermOnline.f82390e;
        }
        return stvProsermOnline.copy(oneStvRecommendPackageResp, str3, balanceResponse2, simRCollectionResponse2, str2);
    }

    @Nullable
    public final OneStvRecommendPackageResp component1() {
        return this.f82386a;
    }

    @Nullable
    public final String component2() {
        return this.f82387b;
    }

    @Nullable
    public final BalanceResponse component3() {
        return this.f82388c;
    }

    @Nullable
    public final SimRCollectionResponse component4() {
        return this.f82389d;
    }

    @Nullable
    public final String component5() {
        return this.f82390e;
    }

    @NotNull
    public final StvProsermOnline copy(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp, @Nullable String str, @Nullable BalanceResponse balanceResponse, @Nullable SimRCollectionResponse simRCollectionResponse, @Nullable String str2) {
        return new StvProsermOnline(oneStvRecommendPackageResp, str, balanceResponse, simRCollectionResponse, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StvProsermOnline) {
            StvProsermOnline stvProsermOnline = (StvProsermOnline) obj;
            return Intrinsics.areEqual(this.f82386a, stvProsermOnline.f82386a) && Intrinsics.areEqual(this.f82387b, stvProsermOnline.f82387b) && Intrinsics.areEqual(this.f82388c, stvProsermOnline.f82388c) && Intrinsics.areEqual(this.f82389d, stvProsermOnline.f82389d) && Intrinsics.areEqual(this.f82390e, stvProsermOnline.f82390e);
        }
        return false;
    }

    @Nullable
    public final BalanceResponse getGetBalanceResponse() {
        return this.f82388c;
    }

    @Nullable
    public final OneStvRecommendPackageResp getPackageResp() {
        return this.f82386a;
    }

    @Nullable
    public final SimRCollectionResponse getSimRCollection() {
        return this.f82389d;
    }

    @Nullable
    public final String getSubscriberGroup() {
        return this.f82390e;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82387b;
    }

    public int hashCode() {
        OneStvRecommendPackageResp oneStvRecommendPackageResp = this.f82386a;
        int hashCode = (oneStvRecommendPackageResp == null ? 0 : oneStvRecommendPackageResp.hashCode()) * 31;
        String str = this.f82387b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BalanceResponse balanceResponse = this.f82388c;
        int hashCode3 = (hashCode2 + (balanceResponse == null ? 0 : balanceResponse.hashCode())) * 31;
        SimRCollectionResponse simRCollectionResponse = this.f82389d;
        int hashCode4 = (hashCode3 + (simRCollectionResponse == null ? 0 : simRCollectionResponse.hashCode())) * 31;
        String str2 = this.f82390e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setGetBalanceResponse(@Nullable BalanceResponse balanceResponse) {
        this.f82388c = balanceResponse;
    }

    public final void setPackageResp(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp) {
        this.f82386a = oneStvRecommendPackageResp;
    }

    public final void setSimRCollection(@Nullable SimRCollectionResponse simRCollectionResponse) {
        this.f82389d = simRCollectionResponse;
    }

    public final void setSubscriberGroup(@Nullable String str) {
        this.f82390e = str;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.f82387b = str;
    }

    @NotNull
    public String toString() {
        OneStvRecommendPackageResp oneStvRecommendPackageResp = this.f82386a;
        String str = this.f82387b;
        BalanceResponse balanceResponse = this.f82388c;
        SimRCollectionResponse simRCollectionResponse = this.f82389d;
        String str2 = this.f82390e;
        return "StvProsermOnline(packageResp=" + oneStvRecommendPackageResp + ", subscriberNumber=" + str + ", getBalanceResponse=" + balanceResponse + ", simRCollection=" + simRCollectionResponse + ", subscriberGroup=" + str2 + ")";
    }

    public StvProsermOnline(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp, @Nullable String str, @Nullable BalanceResponse balanceResponse, @Nullable SimRCollectionResponse simRCollectionResponse, @Nullable String str2) {
        this.f82386a = oneStvRecommendPackageResp;
        this.f82387b = str;
        this.f82388c = balanceResponse;
        this.f82389d = simRCollectionResponse;
        this.f82390e = str2;
    }

    public /* synthetic */ StvProsermOnline(OneStvRecommendPackageResp oneStvRecommendPackageResp, String str, BalanceResponse balanceResponse, SimRCollectionResponse simRCollectionResponse, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneStvRecommendPackageResp, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : balanceResponse, (i & 8) != 0 ? null : simRCollectionResponse, (i & 16) != 0 ? null : str2);
    }
}