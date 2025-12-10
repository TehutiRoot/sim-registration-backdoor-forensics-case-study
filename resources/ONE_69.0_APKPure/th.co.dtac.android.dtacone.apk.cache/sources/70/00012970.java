package th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.model.response.OneActivateSimLegalAddressResponse;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0001dBÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"JÜ\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b7\u0010 J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bK\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010+R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010TR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010>\u001a\u0004\bX\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b\\\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u0010\"R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010>\u001a\u0004\b`\u0010\"\"\u0004\ba\u0010TR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\bc\u0010\"¨\u0006e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;", "Landroid/os/Parcelable;", "", "companyCode", "lastName", HintConstants.AUTOFILL_HINT_GENDER, "lastChangeDatetime", "channel", MessageBundle.TITLE_ENTRY, "birthDate", "identityNumberShow", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimLegalAddressResponse;", "legalAddress", "simCardNumber", "simType", "firstName", "identityType", "identityNumber", "billingProductCode", "subscriberNumberShow", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimLegalAddressResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimLegalAddressResponse;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimLegalAddressResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCompanyCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLastName", OperatorName.CURVE_TO, "getGender", "d", "getLastChangeDatetime", "e", "getChannel", OperatorName.FILL_NON_ZERO, "getTitle", OperatorName.NON_STROKING_GRAY, "getBirthDate", OperatorName.CLOSE_PATH, "getIdentityNumberShow", "i", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/response/OneActivateSimLegalAddressResponse;", "getLegalAddress", OperatorName.SET_LINE_JOINSTYLE, "getSimCardNumber", "setSimCardNumber", "(Ljava/lang/String;)V", OperatorName.NON_STROKING_CMYK, "getSimType", OperatorName.LINE_TO, "getFirstName", OperatorName.MOVE_TO, "getIdentityType", OperatorName.ENDPATH, "getIdentityNumber", "o", "getBillingProductCode", "p", "getSubscriberNumberShow", "setSubscriberNumberShow", OperatorName.SAVE, "getSubscriberNumber", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckActivateSimRequest */
/* loaded from: classes10.dex */
public final class OneCheckActivateSimRequest implements Parcelable {
    @SerializedName("companyCode")
    @Nullable

    /* renamed from: a */
    private final String f88178a;
    @SerializedName("lastName")
    @Nullable

    /* renamed from: b */
    private final String f88179b;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @Nullable

    /* renamed from: c */
    private final String f88180c;
    @SerializedName("lastChangeDatetime")
    @Nullable

    /* renamed from: d */
    private final String f88181d;
    @SerializedName("channel")
    @Nullable

    /* renamed from: e */
    private final String f88182e;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable

    /* renamed from: f */
    private final String f88183f;
    @SerializedName("birthDate")
    @Nullable

    /* renamed from: g */
    private final String f88184g;
    @SerializedName("identityNumberShow")
    @Nullable

    /* renamed from: h */
    private final String f88185h;
    @SerializedName("legalAddress")
    @Nullable

    /* renamed from: i */
    private final OneActivateSimLegalAddressResponse f88186i;
    @SerializedName("simcardNumber")
    @Nullable

    /* renamed from: j */
    private String f88187j;
    @SerializedName("simType")
    @Nullable

    /* renamed from: k */
    private final String f88188k;
    @SerializedName("firstName")
    @Nullable

    /* renamed from: l */
    private final String f88189l;
    @SerializedName("identityType")
    @Nullable

    /* renamed from: m */
    private final String f88190m;
    @SerializedName("identityNumber")
    @Nullable

    /* renamed from: n */
    private final String f88191n;
    @SerializedName("billingProductCode")
    @Nullable

    /* renamed from: o */
    private final String f88192o;
    @SerializedName("subscriberNumberShow")
    @Nullable

    /* renamed from: p */
    private String f88193p;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable

    /* renamed from: q */
    private final String f88194q;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/activateSim/model/request/OneCheckActivateSimRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.model.request.OneCheckActivateSimRequest$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneCheckActivateSimRequest> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCheckActivateSimRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneCheckActivateSimRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCheckActivateSimRequest[] newArray(int i) {
            return new OneCheckActivateSimRequest[i];
        }
    }

    public OneCheckActivateSimRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Nullable
    public final String component1() {
        return this.f88178a;
    }

    @Nullable
    public final String component10() {
        return this.f88187j;
    }

    @Nullable
    public final String component11() {
        return this.f88188k;
    }

    @Nullable
    public final String component12() {
        return this.f88189l;
    }

    @Nullable
    public final String component13() {
        return this.f88190m;
    }

    @Nullable
    public final String component14() {
        return this.f88191n;
    }

    @Nullable
    public final String component15() {
        return this.f88192o;
    }

    @Nullable
    public final String component16() {
        return this.f88193p;
    }

    @Nullable
    public final String component17() {
        return this.f88194q;
    }

    @Nullable
    public final String component2() {
        return this.f88179b;
    }

    @Nullable
    public final String component3() {
        return this.f88180c;
    }

    @Nullable
    public final String component4() {
        return this.f88181d;
    }

    @Nullable
    public final String component5() {
        return this.f88182e;
    }

    @Nullable
    public final String component6() {
        return this.f88183f;
    }

    @Nullable
    public final String component7() {
        return this.f88184g;
    }

    @Nullable
    public final String component8() {
        return this.f88185h;
    }

    @Nullable
    public final OneActivateSimLegalAddressResponse component9() {
        return this.f88186i;
    }

    @NotNull
    public final OneCheckActivateSimRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable OneActivateSimLegalAddressResponse oneActivateSimLegalAddressResponse, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        return new OneCheckActivateSimRequest(str, str2, str3, str4, str5, str6, str7, str8, oneActivateSimLegalAddressResponse, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCheckActivateSimRequest) {
            OneCheckActivateSimRequest oneCheckActivateSimRequest = (OneCheckActivateSimRequest) obj;
            return Intrinsics.areEqual(this.f88178a, oneCheckActivateSimRequest.f88178a) && Intrinsics.areEqual(this.f88179b, oneCheckActivateSimRequest.f88179b) && Intrinsics.areEqual(this.f88180c, oneCheckActivateSimRequest.f88180c) && Intrinsics.areEqual(this.f88181d, oneCheckActivateSimRequest.f88181d) && Intrinsics.areEqual(this.f88182e, oneCheckActivateSimRequest.f88182e) && Intrinsics.areEqual(this.f88183f, oneCheckActivateSimRequest.f88183f) && Intrinsics.areEqual(this.f88184g, oneCheckActivateSimRequest.f88184g) && Intrinsics.areEqual(this.f88185h, oneCheckActivateSimRequest.f88185h) && Intrinsics.areEqual(this.f88186i, oneCheckActivateSimRequest.f88186i) && Intrinsics.areEqual(this.f88187j, oneCheckActivateSimRequest.f88187j) && Intrinsics.areEqual(this.f88188k, oneCheckActivateSimRequest.f88188k) && Intrinsics.areEqual(this.f88189l, oneCheckActivateSimRequest.f88189l) && Intrinsics.areEqual(this.f88190m, oneCheckActivateSimRequest.f88190m) && Intrinsics.areEqual(this.f88191n, oneCheckActivateSimRequest.f88191n) && Intrinsics.areEqual(this.f88192o, oneCheckActivateSimRequest.f88192o) && Intrinsics.areEqual(this.f88193p, oneCheckActivateSimRequest.f88193p) && Intrinsics.areEqual(this.f88194q, oneCheckActivateSimRequest.f88194q);
        }
        return false;
    }

    @Nullable
    public final String getBillingProductCode() {
        return this.f88192o;
    }

    @Nullable
    public final String getBirthDate() {
        return this.f88184g;
    }

    @Nullable
    public final String getChannel() {
        return this.f88182e;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.f88178a;
    }

    @Nullable
    public final String getFirstName() {
        return this.f88189l;
    }

    @Nullable
    public final String getGender() {
        return this.f88180c;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.f88191n;
    }

    @Nullable
    public final String getIdentityNumberShow() {
        return this.f88185h;
    }

    @Nullable
    public final String getIdentityType() {
        return this.f88190m;
    }

    @Nullable
    public final String getLastChangeDatetime() {
        return this.f88181d;
    }

    @Nullable
    public final String getLastName() {
        return this.f88179b;
    }

    @Nullable
    public final OneActivateSimLegalAddressResponse getLegalAddress() {
        return this.f88186i;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.f88187j;
    }

    @Nullable
    public final String getSimType() {
        return this.f88188k;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f88194q;
    }

    @Nullable
    public final String getSubscriberNumberShow() {
        return this.f88193p;
    }

    @Nullable
    public final String getTitle() {
        return this.f88183f;
    }

    public int hashCode() {
        String str = this.f88178a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88179b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88180c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88181d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f88182e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f88183f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f88184g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f88185h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        OneActivateSimLegalAddressResponse oneActivateSimLegalAddressResponse = this.f88186i;
        int hashCode9 = (hashCode8 + (oneActivateSimLegalAddressResponse == null ? 0 : oneActivateSimLegalAddressResponse.hashCode())) * 31;
        String str9 = this.f88187j;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f88188k;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f88189l;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f88190m;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f88191n;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f88192o;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f88193p;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f88194q;
        return hashCode16 + (str16 != null ? str16.hashCode() : 0);
    }

    public final void setSimCardNumber(@Nullable String str) {
        this.f88187j = str;
    }

    public final void setSubscriberNumberShow(@Nullable String str) {
        this.f88193p = str;
    }

    @NotNull
    public String toString() {
        String str = this.f88178a;
        String str2 = this.f88179b;
        String str3 = this.f88180c;
        String str4 = this.f88181d;
        String str5 = this.f88182e;
        String str6 = this.f88183f;
        String str7 = this.f88184g;
        String str8 = this.f88185h;
        OneActivateSimLegalAddressResponse oneActivateSimLegalAddressResponse = this.f88186i;
        String str9 = this.f88187j;
        String str10 = this.f88188k;
        String str11 = this.f88189l;
        String str12 = this.f88190m;
        String str13 = this.f88191n;
        String str14 = this.f88192o;
        String str15 = this.f88193p;
        String str16 = this.f88194q;
        return "OneCheckActivateSimRequest(companyCode=" + str + ", lastName=" + str2 + ", gender=" + str3 + ", lastChangeDatetime=" + str4 + ", channel=" + str5 + ", title=" + str6 + ", birthDate=" + str7 + ", identityNumberShow=" + str8 + ", legalAddress=" + oneActivateSimLegalAddressResponse + ", simCardNumber=" + str9 + ", simType=" + str10 + ", firstName=" + str11 + ", identityType=" + str12 + ", identityNumber=" + str13 + ", billingProductCode=" + str14 + ", subscriberNumberShow=" + str15 + ", subscriberNumber=" + str16 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f88178a);
        parcel.writeString(this.f88179b);
        parcel.writeString(this.f88180c);
        parcel.writeString(this.f88181d);
        parcel.writeString(this.f88182e);
        parcel.writeString(this.f88183f);
        parcel.writeString(this.f88184g);
        parcel.writeString(this.f88185h);
        parcel.writeParcelable(this.f88186i, i);
        parcel.writeString(this.f88187j);
        parcel.writeString(this.f88188k);
        parcel.writeString(this.f88189l);
        parcel.writeString(this.f88190m);
        parcel.writeString(this.f88191n);
        parcel.writeString(this.f88192o);
        parcel.writeString(this.f88193p);
        parcel.writeString(this.f88194q);
    }

    public OneCheckActivateSimRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable OneActivateSimLegalAddressResponse oneActivateSimLegalAddressResponse, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        this.f88178a = str;
        this.f88179b = str2;
        this.f88180c = str3;
        this.f88181d = str4;
        this.f88182e = str5;
        this.f88183f = str6;
        this.f88184g = str7;
        this.f88185h = str8;
        this.f88186i = oneActivateSimLegalAddressResponse;
        this.f88187j = str9;
        this.f88188k = str10;
        this.f88189l = str11;
        this.f88190m = str12;
        this.f88191n = str13;
        this.f88192o = str14;
        this.f88193p = str15;
        this.f88194q = str16;
    }

    public /* synthetic */ OneCheckActivateSimRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, OneActivateSimLegalAddressResponse oneActivateSimLegalAddressResponse, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : oneActivateSimLegalAddressResponse, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneCheckActivateSimRequest(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (OneActivateSimLegalAddressResponse) parcel.readParcelable(OneActivateSimLegalAddressResponse.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}