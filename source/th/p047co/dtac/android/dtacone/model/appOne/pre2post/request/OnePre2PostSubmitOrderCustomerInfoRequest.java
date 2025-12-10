package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bZ\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jå\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\"¨\u0006c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitOrderCustomerInfoRequest;", "", "birthDate", "", "firstName", "idExpireDate", "idNumber", "idType", "issueDate", "lastName", "originalFirstName", "originalLastName", "originalPricePlan", "readCardAddressNumber", "readCardBirthDate", "readCardBp1Number", "readCardChipId", "readCardDistrict", "readCardFirstNameEn", "readCardFirstNameTh", "readCardGender", "readCardIdExpireDate", "readCardIssueDate", "readCardLastNameEn", "readCardLastNameTh", "readCardPhoto", "readCardProvince", "readCardStreet", "readCardSubDistrict", "readCardTitleEn", "readCardTitleTh", "readCardZip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()Ljava/lang/String;", "getFirstName", "getIdExpireDate", "getIdNumber", "getIdType", "getIssueDate", "getLastName", "getOriginalFirstName", "getOriginalLastName", "getOriginalPricePlan", "getReadCardAddressNumber", "getReadCardBirthDate", "getReadCardBp1Number", "getReadCardChipId", "getReadCardDistrict", "getReadCardFirstNameEn", "getReadCardFirstNameTh", "getReadCardGender", "getReadCardIdExpireDate", "getReadCardIssueDate", "getReadCardLastNameEn", "getReadCardLastNameTh", "getReadCardPhoto", "getReadCardProvince", "getReadCardStreet", "getReadCardSubDistrict", "getReadCardTitleEn", "getReadCardTitleTh", "getReadCardZip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitOrderCustomerInfoRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostSubmitOrderCustomerInfoRequest {
    public static final int $stable = 0;
    @SerializedName("birthDate")
    @Nullable
    private final String birthDate;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("idExpireDate")
    @Nullable
    private final String idExpireDate;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("idType")
    @Nullable
    private final String idType;
    @SerializedName("issueDate")
    @Nullable
    private final String issueDate;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("originalFirstName")
    @Nullable
    private final String originalFirstName;
    @SerializedName("originalLastName")
    @Nullable
    private final String originalLastName;
    @SerializedName("originalPricePlan")
    @Nullable
    private final String originalPricePlan;
    @SerializedName("readCardAddressNumber")
    @Nullable
    private final String readCardAddressNumber;
    @SerializedName("readCardBirthDate")
    @Nullable
    private final String readCardBirthDate;
    @SerializedName("readCardBp1Number")
    @Nullable
    private final String readCardBp1Number;
    @SerializedName("readCardChipId")
    @Nullable
    private final String readCardChipId;
    @SerializedName("readCardDistrict")
    @Nullable
    private final String readCardDistrict;
    @SerializedName("readCardFirstNameEn")
    @Nullable
    private final String readCardFirstNameEn;
    @SerializedName("readCardFirstNameTh")
    @Nullable
    private final String readCardFirstNameTh;
    @SerializedName("readCardGender")
    @Nullable
    private final String readCardGender;
    @SerializedName("readCardIdExpireDate")
    @Nullable
    private final String readCardIdExpireDate;
    @SerializedName("readCardIssueDate")
    @Nullable
    private final String readCardIssueDate;
    @SerializedName("readCardLastNameEn")
    @Nullable
    private final String readCardLastNameEn;
    @SerializedName("readCardLastNameTh")
    @Nullable
    private final String readCardLastNameTh;
    @SerializedName("readCardPhoto")
    @Nullable
    private final String readCardPhoto;
    @SerializedName("readCardProvince")
    @Nullable
    private final String readCardProvince;
    @SerializedName("readCardStreet")
    @Nullable
    private final String readCardStreet;
    @SerializedName("readCardSubDistrict")
    @Nullable
    private final String readCardSubDistrict;
    @SerializedName("readCardTitleEn")
    @Nullable
    private final String readCardTitleEn;
    @SerializedName("readCardTitleTh")
    @Nullable
    private final String readCardTitleTh;
    @SerializedName("readCardZip")
    @Nullable
    private final String readCardZip;

    public OnePre2PostSubmitOrderCustomerInfoRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    @Nullable
    public final String component1() {
        return this.birthDate;
    }

    @Nullable
    public final String component10() {
        return this.originalPricePlan;
    }

    @Nullable
    public final String component11() {
        return this.readCardAddressNumber;
    }

    @Nullable
    public final String component12() {
        return this.readCardBirthDate;
    }

    @Nullable
    public final String component13() {
        return this.readCardBp1Number;
    }

    @Nullable
    public final String component14() {
        return this.readCardChipId;
    }

    @Nullable
    public final String component15() {
        return this.readCardDistrict;
    }

    @Nullable
    public final String component16() {
        return this.readCardFirstNameEn;
    }

    @Nullable
    public final String component17() {
        return this.readCardFirstNameTh;
    }

    @Nullable
    public final String component18() {
        return this.readCardGender;
    }

    @Nullable
    public final String component19() {
        return this.readCardIdExpireDate;
    }

    @Nullable
    public final String component2() {
        return this.firstName;
    }

    @Nullable
    public final String component20() {
        return this.readCardIssueDate;
    }

    @Nullable
    public final String component21() {
        return this.readCardLastNameEn;
    }

    @Nullable
    public final String component22() {
        return this.readCardLastNameTh;
    }

    @Nullable
    public final String component23() {
        return this.readCardPhoto;
    }

    @Nullable
    public final String component24() {
        return this.readCardProvince;
    }

    @Nullable
    public final String component25() {
        return this.readCardStreet;
    }

    @Nullable
    public final String component26() {
        return this.readCardSubDistrict;
    }

    @Nullable
    public final String component27() {
        return this.readCardTitleEn;
    }

    @Nullable
    public final String component28() {
        return this.readCardTitleTh;
    }

    @Nullable
    public final String component29() {
        return this.readCardZip;
    }

    @Nullable
    public final String component3() {
        return this.idExpireDate;
    }

    @Nullable
    public final String component4() {
        return this.idNumber;
    }

    @Nullable
    public final String component5() {
        return this.idType;
    }

    @Nullable
    public final String component6() {
        return this.issueDate;
    }

    @Nullable
    public final String component7() {
        return this.lastName;
    }

    @Nullable
    public final String component8() {
        return this.originalFirstName;
    }

    @Nullable
    public final String component9() {
        return this.originalLastName;
    }

    @NotNull
    public final OnePre2PostSubmitOrderCustomerInfoRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29) {
        return new OnePre2PostSubmitOrderCustomerInfoRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostSubmitOrderCustomerInfoRequest) {
            OnePre2PostSubmitOrderCustomerInfoRequest onePre2PostSubmitOrderCustomerInfoRequest = (OnePre2PostSubmitOrderCustomerInfoRequest) obj;
            return Intrinsics.areEqual(this.birthDate, onePre2PostSubmitOrderCustomerInfoRequest.birthDate) && Intrinsics.areEqual(this.firstName, onePre2PostSubmitOrderCustomerInfoRequest.firstName) && Intrinsics.areEqual(this.idExpireDate, onePre2PostSubmitOrderCustomerInfoRequest.idExpireDate) && Intrinsics.areEqual(this.idNumber, onePre2PostSubmitOrderCustomerInfoRequest.idNumber) && Intrinsics.areEqual(this.idType, onePre2PostSubmitOrderCustomerInfoRequest.idType) && Intrinsics.areEqual(this.issueDate, onePre2PostSubmitOrderCustomerInfoRequest.issueDate) && Intrinsics.areEqual(this.lastName, onePre2PostSubmitOrderCustomerInfoRequest.lastName) && Intrinsics.areEqual(this.originalFirstName, onePre2PostSubmitOrderCustomerInfoRequest.originalFirstName) && Intrinsics.areEqual(this.originalLastName, onePre2PostSubmitOrderCustomerInfoRequest.originalLastName) && Intrinsics.areEqual(this.originalPricePlan, onePre2PostSubmitOrderCustomerInfoRequest.originalPricePlan) && Intrinsics.areEqual(this.readCardAddressNumber, onePre2PostSubmitOrderCustomerInfoRequest.readCardAddressNumber) && Intrinsics.areEqual(this.readCardBirthDate, onePre2PostSubmitOrderCustomerInfoRequest.readCardBirthDate) && Intrinsics.areEqual(this.readCardBp1Number, onePre2PostSubmitOrderCustomerInfoRequest.readCardBp1Number) && Intrinsics.areEqual(this.readCardChipId, onePre2PostSubmitOrderCustomerInfoRequest.readCardChipId) && Intrinsics.areEqual(this.readCardDistrict, onePre2PostSubmitOrderCustomerInfoRequest.readCardDistrict) && Intrinsics.areEqual(this.readCardFirstNameEn, onePre2PostSubmitOrderCustomerInfoRequest.readCardFirstNameEn) && Intrinsics.areEqual(this.readCardFirstNameTh, onePre2PostSubmitOrderCustomerInfoRequest.readCardFirstNameTh) && Intrinsics.areEqual(this.readCardGender, onePre2PostSubmitOrderCustomerInfoRequest.readCardGender) && Intrinsics.areEqual(this.readCardIdExpireDate, onePre2PostSubmitOrderCustomerInfoRequest.readCardIdExpireDate) && Intrinsics.areEqual(this.readCardIssueDate, onePre2PostSubmitOrderCustomerInfoRequest.readCardIssueDate) && Intrinsics.areEqual(this.readCardLastNameEn, onePre2PostSubmitOrderCustomerInfoRequest.readCardLastNameEn) && Intrinsics.areEqual(this.readCardLastNameTh, onePre2PostSubmitOrderCustomerInfoRequest.readCardLastNameTh) && Intrinsics.areEqual(this.readCardPhoto, onePre2PostSubmitOrderCustomerInfoRequest.readCardPhoto) && Intrinsics.areEqual(this.readCardProvince, onePre2PostSubmitOrderCustomerInfoRequest.readCardProvince) && Intrinsics.areEqual(this.readCardStreet, onePre2PostSubmitOrderCustomerInfoRequest.readCardStreet) && Intrinsics.areEqual(this.readCardSubDistrict, onePre2PostSubmitOrderCustomerInfoRequest.readCardSubDistrict) && Intrinsics.areEqual(this.readCardTitleEn, onePre2PostSubmitOrderCustomerInfoRequest.readCardTitleEn) && Intrinsics.areEqual(this.readCardTitleTh, onePre2PostSubmitOrderCustomerInfoRequest.readCardTitleTh) && Intrinsics.areEqual(this.readCardZip, onePre2PostSubmitOrderCustomerInfoRequest.readCardZip);
        }
        return false;
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIdExpireDate() {
        return this.idExpireDate;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getIssueDate() {
        return this.issueDate;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getOriginalFirstName() {
        return this.originalFirstName;
    }

    @Nullable
    public final String getOriginalLastName() {
        return this.originalLastName;
    }

    @Nullable
    public final String getOriginalPricePlan() {
        return this.originalPricePlan;
    }

    @Nullable
    public final String getReadCardAddressNumber() {
        return this.readCardAddressNumber;
    }

    @Nullable
    public final String getReadCardBirthDate() {
        return this.readCardBirthDate;
    }

    @Nullable
    public final String getReadCardBp1Number() {
        return this.readCardBp1Number;
    }

    @Nullable
    public final String getReadCardChipId() {
        return this.readCardChipId;
    }

    @Nullable
    public final String getReadCardDistrict() {
        return this.readCardDistrict;
    }

    @Nullable
    public final String getReadCardFirstNameEn() {
        return this.readCardFirstNameEn;
    }

    @Nullable
    public final String getReadCardFirstNameTh() {
        return this.readCardFirstNameTh;
    }

    @Nullable
    public final String getReadCardGender() {
        return this.readCardGender;
    }

    @Nullable
    public final String getReadCardIdExpireDate() {
        return this.readCardIdExpireDate;
    }

    @Nullable
    public final String getReadCardIssueDate() {
        return this.readCardIssueDate;
    }

    @Nullable
    public final String getReadCardLastNameEn() {
        return this.readCardLastNameEn;
    }

    @Nullable
    public final String getReadCardLastNameTh() {
        return this.readCardLastNameTh;
    }

    @Nullable
    public final String getReadCardPhoto() {
        return this.readCardPhoto;
    }

    @Nullable
    public final String getReadCardProvince() {
        return this.readCardProvince;
    }

    @Nullable
    public final String getReadCardStreet() {
        return this.readCardStreet;
    }

    @Nullable
    public final String getReadCardSubDistrict() {
        return this.readCardSubDistrict;
    }

    @Nullable
    public final String getReadCardTitleEn() {
        return this.readCardTitleEn;
    }

    @Nullable
    public final String getReadCardTitleTh() {
        return this.readCardTitleTh;
    }

    @Nullable
    public final String getReadCardZip() {
        return this.readCardZip;
    }

    public int hashCode() {
        String str = this.birthDate;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idExpireDate;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.idNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issueDate;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.originalFirstName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.originalLastName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.originalPricePlan;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.readCardAddressNumber;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.readCardBirthDate;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.readCardBp1Number;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.readCardChipId;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.readCardDistrict;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.readCardFirstNameEn;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.readCardFirstNameTh;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.readCardGender;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.readCardIdExpireDate;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.readCardIssueDate;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.readCardLastNameEn;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.readCardLastNameTh;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.readCardPhoto;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.readCardProvince;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.readCardStreet;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.readCardSubDistrict;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.readCardTitleEn;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.readCardTitleTh;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.readCardZip;
        return hashCode28 + (str29 != null ? str29.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.birthDate;
        String str2 = this.firstName;
        String str3 = this.idExpireDate;
        String str4 = this.idNumber;
        String str5 = this.idType;
        String str6 = this.issueDate;
        String str7 = this.lastName;
        String str8 = this.originalFirstName;
        String str9 = this.originalLastName;
        String str10 = this.originalPricePlan;
        String str11 = this.readCardAddressNumber;
        String str12 = this.readCardBirthDate;
        String str13 = this.readCardBp1Number;
        String str14 = this.readCardChipId;
        String str15 = this.readCardDistrict;
        String str16 = this.readCardFirstNameEn;
        String str17 = this.readCardFirstNameTh;
        String str18 = this.readCardGender;
        String str19 = this.readCardIdExpireDate;
        String str20 = this.readCardIssueDate;
        String str21 = this.readCardLastNameEn;
        String str22 = this.readCardLastNameTh;
        String str23 = this.readCardPhoto;
        String str24 = this.readCardProvince;
        String str25 = this.readCardStreet;
        String str26 = this.readCardSubDistrict;
        String str27 = this.readCardTitleEn;
        String str28 = this.readCardTitleTh;
        String str29 = this.readCardZip;
        return "OnePre2PostSubmitOrderCustomerInfoRequest(birthDate=" + str + ", firstName=" + str2 + ", idExpireDate=" + str3 + ", idNumber=" + str4 + ", idType=" + str5 + ", issueDate=" + str6 + ", lastName=" + str7 + ", originalFirstName=" + str8 + ", originalLastName=" + str9 + ", originalPricePlan=" + str10 + ", readCardAddressNumber=" + str11 + ", readCardBirthDate=" + str12 + ", readCardBp1Number=" + str13 + ", readCardChipId=" + str14 + ", readCardDistrict=" + str15 + ", readCardFirstNameEn=" + str16 + ", readCardFirstNameTh=" + str17 + ", readCardGender=" + str18 + ", readCardIdExpireDate=" + str19 + ", readCardIssueDate=" + str20 + ", readCardLastNameEn=" + str21 + ", readCardLastNameTh=" + str22 + ", readCardPhoto=" + str23 + ", readCardProvince=" + str24 + ", readCardStreet=" + str25 + ", readCardSubDistrict=" + str26 + ", readCardTitleEn=" + str27 + ", readCardTitleTh=" + str28 + ", readCardZip=" + str29 + ")";
    }

    public OnePre2PostSubmitOrderCustomerInfoRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29) {
        this.birthDate = str;
        this.firstName = str2;
        this.idExpireDate = str3;
        this.idNumber = str4;
        this.idType = str5;
        this.issueDate = str6;
        this.lastName = str7;
        this.originalFirstName = str8;
        this.originalLastName = str9;
        this.originalPricePlan = str10;
        this.readCardAddressNumber = str11;
        this.readCardBirthDate = str12;
        this.readCardBp1Number = str13;
        this.readCardChipId = str14;
        this.readCardDistrict = str15;
        this.readCardFirstNameEn = str16;
        this.readCardFirstNameTh = str17;
        this.readCardGender = str18;
        this.readCardIdExpireDate = str19;
        this.readCardIssueDate = str20;
        this.readCardLastNameEn = str21;
        this.readCardLastNameTh = str22;
        this.readCardPhoto = str23;
        this.readCardProvince = str24;
        this.readCardStreet = str25;
        this.readCardSubDistrict = str26;
        this.readCardTitleEn = str27;
        this.readCardTitleTh = str28;
        this.readCardZip = str29;
    }

    public /* synthetic */ OnePre2PostSubmitOrderCustomerInfoRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29);
    }
}
