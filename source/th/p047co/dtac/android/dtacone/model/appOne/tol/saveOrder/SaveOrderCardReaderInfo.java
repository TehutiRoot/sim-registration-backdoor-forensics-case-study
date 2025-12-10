package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bT\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 ¨\u0006]"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderCardReaderInfo;", "", "readcardFlag", "", "readcardAddressDistrict", "readcardAddressMoo", "readcardAddressNumber", "readcardAddressProvince", "readcardAddressSoi", "readcardAddressStreet", "readcardAddressSubDistrict", "readcardAddressTrok", "readcardBirthday", "readcardBP1Number", "readcardChipid", "readcardExpireDate", "readcardFirstnameEN", "readcardFirstnameTH", "readcardGender", "readcardIdNumber", "readcardIssueDate", "readcardLastnameEN", "readcardLastnameTH", "readcardMiddlenameEN", "readcardMiddlenameTH", "readcardPhotoId", "readcardTitleEN", "readcardTitleTH", "readcardType", "readcardPhoto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReadcardAddressDistrict", "()Ljava/lang/String;", "getReadcardAddressMoo", "getReadcardAddressNumber", "getReadcardAddressProvince", "getReadcardAddressSoi", "getReadcardAddressStreet", "getReadcardAddressSubDistrict", "getReadcardAddressTrok", "getReadcardBP1Number", "getReadcardBirthday", "getReadcardChipid", "getReadcardExpireDate", "getReadcardFirstnameEN", "getReadcardFirstnameTH", "getReadcardFlag", "getReadcardGender", "getReadcardIdNumber", "getReadcardIssueDate", "getReadcardLastnameEN", "getReadcardLastnameTH", "getReadcardMiddlenameEN", "getReadcardMiddlenameTH", "getReadcardPhoto", "getReadcardPhotoId", "getReadcardTitleEN", "getReadcardTitleTH", "getReadcardType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderCardReaderInfo */
/* loaded from: classes8.dex */
public final class SaveOrderCardReaderInfo {
    public static final int $stable = 0;
    @SerializedName("readcardAddressDistrict")
    @NotNull
    private final String readcardAddressDistrict;
    @SerializedName("readcardAddressMoo")
    @Nullable
    private final String readcardAddressMoo;
    @SerializedName("readcardAddressNumber")
    @NotNull
    private final String readcardAddressNumber;
    @SerializedName("readcardAddressProvince")
    @NotNull
    private final String readcardAddressProvince;
    @SerializedName("readcardAddressSoi")
    @Nullable
    private final String readcardAddressSoi;
    @SerializedName("readcardAddressStreet")
    @Nullable
    private final String readcardAddressStreet;
    @SerializedName("readcardAddressSubDistrict")
    @NotNull
    private final String readcardAddressSubDistrict;
    @SerializedName("readcardAddressTrok")
    @Nullable
    private final String readcardAddressTrok;
    @SerializedName("readcardBP1Number")
    @NotNull
    private final String readcardBP1Number;
    @SerializedName("readcardBirthday")
    @NotNull
    private final String readcardBirthday;
    @SerializedName("readcardChipid")
    @NotNull
    private final String readcardChipid;
    @SerializedName("readcardExpireDate")
    @NotNull
    private final String readcardExpireDate;
    @SerializedName("readcardFirstnameEN")
    @NotNull
    private final String readcardFirstnameEN;
    @SerializedName("readcardFirstnameTH")
    @NotNull
    private final String readcardFirstnameTH;
    @SerializedName("readcardFlag")
    @NotNull
    private final String readcardFlag;
    @SerializedName("readcardGender")
    @NotNull
    private final String readcardGender;
    @SerializedName("readcardIdNumber")
    @NotNull
    private final String readcardIdNumber;
    @SerializedName("readcardIssueDate")
    @NotNull
    private final String readcardIssueDate;
    @SerializedName("readcardLastnameEN")
    @NotNull
    private final String readcardLastnameEN;
    @SerializedName("readcardLastnameTH")
    @NotNull
    private final String readcardLastnameTH;
    @SerializedName("readcardMiddlenameEN")
    @Nullable
    private final String readcardMiddlenameEN;
    @SerializedName("readcardMiddlenameTH")
    @Nullable
    private final String readcardMiddlenameTH;
    @SerializedName("readcardPhoto")
    @NotNull
    private final String readcardPhoto;
    @SerializedName("readcardPhotoId")
    @Nullable
    private final String readcardPhotoId;
    @SerializedName("readcardTitleEN")
    @NotNull
    private final String readcardTitleEN;
    @SerializedName("readcardTitleTH")
    @NotNull
    private final String readcardTitleTH;
    @SerializedName("readcardType")
    @NotNull
    private final String readcardType;

    public SaveOrderCardReaderInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }

    @NotNull
    public final String component1() {
        return this.readcardFlag;
    }

    @NotNull
    public final String component10() {
        return this.readcardBirthday;
    }

    @NotNull
    public final String component11() {
        return this.readcardBP1Number;
    }

    @NotNull
    public final String component12() {
        return this.readcardChipid;
    }

    @NotNull
    public final String component13() {
        return this.readcardExpireDate;
    }

    @NotNull
    public final String component14() {
        return this.readcardFirstnameEN;
    }

    @NotNull
    public final String component15() {
        return this.readcardFirstnameTH;
    }

    @NotNull
    public final String component16() {
        return this.readcardGender;
    }

    @NotNull
    public final String component17() {
        return this.readcardIdNumber;
    }

    @NotNull
    public final String component18() {
        return this.readcardIssueDate;
    }

    @NotNull
    public final String component19() {
        return this.readcardLastnameEN;
    }

    @NotNull
    public final String component2() {
        return this.readcardAddressDistrict;
    }

    @NotNull
    public final String component20() {
        return this.readcardLastnameTH;
    }

    @Nullable
    public final String component21() {
        return this.readcardMiddlenameEN;
    }

    @Nullable
    public final String component22() {
        return this.readcardMiddlenameTH;
    }

    @Nullable
    public final String component23() {
        return this.readcardPhotoId;
    }

    @NotNull
    public final String component24() {
        return this.readcardTitleEN;
    }

    @NotNull
    public final String component25() {
        return this.readcardTitleTH;
    }

    @NotNull
    public final String component26() {
        return this.readcardType;
    }

    @NotNull
    public final String component27() {
        return this.readcardPhoto;
    }

    @Nullable
    public final String component3() {
        return this.readcardAddressMoo;
    }

    @NotNull
    public final String component4() {
        return this.readcardAddressNumber;
    }

    @NotNull
    public final String component5() {
        return this.readcardAddressProvince;
    }

    @Nullable
    public final String component6() {
        return this.readcardAddressSoi;
    }

    @Nullable
    public final String component7() {
        return this.readcardAddressStreet;
    }

    @NotNull
    public final String component8() {
        return this.readcardAddressSubDistrict;
    }

    @Nullable
    public final String component9() {
        return this.readcardAddressTrok;
    }

    @NotNull
    public final SaveOrderCardReaderInfo copy(@NotNull String readcardFlag, @NotNull String readcardAddressDistrict, @Nullable String str, @NotNull String readcardAddressNumber, @NotNull String readcardAddressProvince, @Nullable String str2, @Nullable String str3, @NotNull String readcardAddressSubDistrict, @Nullable String str4, @NotNull String readcardBirthday, @NotNull String readcardBP1Number, @NotNull String readcardChipid, @NotNull String readcardExpireDate, @NotNull String readcardFirstnameEN, @NotNull String readcardFirstnameTH, @NotNull String readcardGender, @NotNull String readcardIdNumber, @NotNull String readcardIssueDate, @NotNull String readcardLastnameEN, @NotNull String readcardLastnameTH, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String readcardTitleEN, @NotNull String readcardTitleTH, @NotNull String readcardType, @NotNull String readcardPhoto) {
        Intrinsics.checkNotNullParameter(readcardFlag, "readcardFlag");
        Intrinsics.checkNotNullParameter(readcardAddressDistrict, "readcardAddressDistrict");
        Intrinsics.checkNotNullParameter(readcardAddressNumber, "readcardAddressNumber");
        Intrinsics.checkNotNullParameter(readcardAddressProvince, "readcardAddressProvince");
        Intrinsics.checkNotNullParameter(readcardAddressSubDistrict, "readcardAddressSubDistrict");
        Intrinsics.checkNotNullParameter(readcardBirthday, "readcardBirthday");
        Intrinsics.checkNotNullParameter(readcardBP1Number, "readcardBP1Number");
        Intrinsics.checkNotNullParameter(readcardChipid, "readcardChipid");
        Intrinsics.checkNotNullParameter(readcardExpireDate, "readcardExpireDate");
        Intrinsics.checkNotNullParameter(readcardFirstnameEN, "readcardFirstnameEN");
        Intrinsics.checkNotNullParameter(readcardFirstnameTH, "readcardFirstnameTH");
        Intrinsics.checkNotNullParameter(readcardGender, "readcardGender");
        Intrinsics.checkNotNullParameter(readcardIdNumber, "readcardIdNumber");
        Intrinsics.checkNotNullParameter(readcardIssueDate, "readcardIssueDate");
        Intrinsics.checkNotNullParameter(readcardLastnameEN, "readcardLastnameEN");
        Intrinsics.checkNotNullParameter(readcardLastnameTH, "readcardLastnameTH");
        Intrinsics.checkNotNullParameter(readcardTitleEN, "readcardTitleEN");
        Intrinsics.checkNotNullParameter(readcardTitleTH, "readcardTitleTH");
        Intrinsics.checkNotNullParameter(readcardType, "readcardType");
        Intrinsics.checkNotNullParameter(readcardPhoto, "readcardPhoto");
        return new SaveOrderCardReaderInfo(readcardFlag, readcardAddressDistrict, str, readcardAddressNumber, readcardAddressProvince, str2, str3, readcardAddressSubDistrict, str4, readcardBirthday, readcardBP1Number, readcardChipid, readcardExpireDate, readcardFirstnameEN, readcardFirstnameTH, readcardGender, readcardIdNumber, readcardIssueDate, readcardLastnameEN, readcardLastnameTH, str5, str6, str7, readcardTitleEN, readcardTitleTH, readcardType, readcardPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderCardReaderInfo) {
            SaveOrderCardReaderInfo saveOrderCardReaderInfo = (SaveOrderCardReaderInfo) obj;
            return Intrinsics.areEqual(this.readcardFlag, saveOrderCardReaderInfo.readcardFlag) && Intrinsics.areEqual(this.readcardAddressDistrict, saveOrderCardReaderInfo.readcardAddressDistrict) && Intrinsics.areEqual(this.readcardAddressMoo, saveOrderCardReaderInfo.readcardAddressMoo) && Intrinsics.areEqual(this.readcardAddressNumber, saveOrderCardReaderInfo.readcardAddressNumber) && Intrinsics.areEqual(this.readcardAddressProvince, saveOrderCardReaderInfo.readcardAddressProvince) && Intrinsics.areEqual(this.readcardAddressSoi, saveOrderCardReaderInfo.readcardAddressSoi) && Intrinsics.areEqual(this.readcardAddressStreet, saveOrderCardReaderInfo.readcardAddressStreet) && Intrinsics.areEqual(this.readcardAddressSubDistrict, saveOrderCardReaderInfo.readcardAddressSubDistrict) && Intrinsics.areEqual(this.readcardAddressTrok, saveOrderCardReaderInfo.readcardAddressTrok) && Intrinsics.areEqual(this.readcardBirthday, saveOrderCardReaderInfo.readcardBirthday) && Intrinsics.areEqual(this.readcardBP1Number, saveOrderCardReaderInfo.readcardBP1Number) && Intrinsics.areEqual(this.readcardChipid, saveOrderCardReaderInfo.readcardChipid) && Intrinsics.areEqual(this.readcardExpireDate, saveOrderCardReaderInfo.readcardExpireDate) && Intrinsics.areEqual(this.readcardFirstnameEN, saveOrderCardReaderInfo.readcardFirstnameEN) && Intrinsics.areEqual(this.readcardFirstnameTH, saveOrderCardReaderInfo.readcardFirstnameTH) && Intrinsics.areEqual(this.readcardGender, saveOrderCardReaderInfo.readcardGender) && Intrinsics.areEqual(this.readcardIdNumber, saveOrderCardReaderInfo.readcardIdNumber) && Intrinsics.areEqual(this.readcardIssueDate, saveOrderCardReaderInfo.readcardIssueDate) && Intrinsics.areEqual(this.readcardLastnameEN, saveOrderCardReaderInfo.readcardLastnameEN) && Intrinsics.areEqual(this.readcardLastnameTH, saveOrderCardReaderInfo.readcardLastnameTH) && Intrinsics.areEqual(this.readcardMiddlenameEN, saveOrderCardReaderInfo.readcardMiddlenameEN) && Intrinsics.areEqual(this.readcardMiddlenameTH, saveOrderCardReaderInfo.readcardMiddlenameTH) && Intrinsics.areEqual(this.readcardPhotoId, saveOrderCardReaderInfo.readcardPhotoId) && Intrinsics.areEqual(this.readcardTitleEN, saveOrderCardReaderInfo.readcardTitleEN) && Intrinsics.areEqual(this.readcardTitleTH, saveOrderCardReaderInfo.readcardTitleTH) && Intrinsics.areEqual(this.readcardType, saveOrderCardReaderInfo.readcardType) && Intrinsics.areEqual(this.readcardPhoto, saveOrderCardReaderInfo.readcardPhoto);
        }
        return false;
    }

    @NotNull
    public final String getReadcardAddressDistrict() {
        return this.readcardAddressDistrict;
    }

    @Nullable
    public final String getReadcardAddressMoo() {
        return this.readcardAddressMoo;
    }

    @NotNull
    public final String getReadcardAddressNumber() {
        return this.readcardAddressNumber;
    }

    @NotNull
    public final String getReadcardAddressProvince() {
        return this.readcardAddressProvince;
    }

    @Nullable
    public final String getReadcardAddressSoi() {
        return this.readcardAddressSoi;
    }

    @Nullable
    public final String getReadcardAddressStreet() {
        return this.readcardAddressStreet;
    }

    @NotNull
    public final String getReadcardAddressSubDistrict() {
        return this.readcardAddressSubDistrict;
    }

    @Nullable
    public final String getReadcardAddressTrok() {
        return this.readcardAddressTrok;
    }

    @NotNull
    public final String getReadcardBP1Number() {
        return this.readcardBP1Number;
    }

    @NotNull
    public final String getReadcardBirthday() {
        return this.readcardBirthday;
    }

    @NotNull
    public final String getReadcardChipid() {
        return this.readcardChipid;
    }

    @NotNull
    public final String getReadcardExpireDate() {
        return this.readcardExpireDate;
    }

    @NotNull
    public final String getReadcardFirstnameEN() {
        return this.readcardFirstnameEN;
    }

    @NotNull
    public final String getReadcardFirstnameTH() {
        return this.readcardFirstnameTH;
    }

    @NotNull
    public final String getReadcardFlag() {
        return this.readcardFlag;
    }

    @NotNull
    public final String getReadcardGender() {
        return this.readcardGender;
    }

    @NotNull
    public final String getReadcardIdNumber() {
        return this.readcardIdNumber;
    }

    @NotNull
    public final String getReadcardIssueDate() {
        return this.readcardIssueDate;
    }

    @NotNull
    public final String getReadcardLastnameEN() {
        return this.readcardLastnameEN;
    }

    @NotNull
    public final String getReadcardLastnameTH() {
        return this.readcardLastnameTH;
    }

    @Nullable
    public final String getReadcardMiddlenameEN() {
        return this.readcardMiddlenameEN;
    }

    @Nullable
    public final String getReadcardMiddlenameTH() {
        return this.readcardMiddlenameTH;
    }

    @NotNull
    public final String getReadcardPhoto() {
        return this.readcardPhoto;
    }

    @Nullable
    public final String getReadcardPhotoId() {
        return this.readcardPhotoId;
    }

    @NotNull
    public final String getReadcardTitleEN() {
        return this.readcardTitleEN;
    }

    @NotNull
    public final String getReadcardTitleTH() {
        return this.readcardTitleTH;
    }

    @NotNull
    public final String getReadcardType() {
        return this.readcardType;
    }

    public int hashCode() {
        int hashCode = ((this.readcardFlag.hashCode() * 31) + this.readcardAddressDistrict.hashCode()) * 31;
        String str = this.readcardAddressMoo;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.readcardAddressNumber.hashCode()) * 31) + this.readcardAddressProvince.hashCode()) * 31;
        String str2 = this.readcardAddressSoi;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.readcardAddressStreet;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.readcardAddressSubDistrict.hashCode()) * 31;
        String str4 = this.readcardAddressTrok;
        int hashCode5 = (((((((((((((((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.readcardBirthday.hashCode()) * 31) + this.readcardBP1Number.hashCode()) * 31) + this.readcardChipid.hashCode()) * 31) + this.readcardExpireDate.hashCode()) * 31) + this.readcardFirstnameEN.hashCode()) * 31) + this.readcardFirstnameTH.hashCode()) * 31) + this.readcardGender.hashCode()) * 31) + this.readcardIdNumber.hashCode()) * 31) + this.readcardIssueDate.hashCode()) * 31) + this.readcardLastnameEN.hashCode()) * 31) + this.readcardLastnameTH.hashCode()) * 31;
        String str5 = this.readcardMiddlenameEN;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.readcardMiddlenameTH;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.readcardPhotoId;
        return ((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.readcardTitleEN.hashCode()) * 31) + this.readcardTitleTH.hashCode()) * 31) + this.readcardType.hashCode()) * 31) + this.readcardPhoto.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.readcardFlag;
        String str2 = this.readcardAddressDistrict;
        String str3 = this.readcardAddressMoo;
        String str4 = this.readcardAddressNumber;
        String str5 = this.readcardAddressProvince;
        String str6 = this.readcardAddressSoi;
        String str7 = this.readcardAddressStreet;
        String str8 = this.readcardAddressSubDistrict;
        String str9 = this.readcardAddressTrok;
        String str10 = this.readcardBirthday;
        String str11 = this.readcardBP1Number;
        String str12 = this.readcardChipid;
        String str13 = this.readcardExpireDate;
        String str14 = this.readcardFirstnameEN;
        String str15 = this.readcardFirstnameTH;
        String str16 = this.readcardGender;
        String str17 = this.readcardIdNumber;
        String str18 = this.readcardIssueDate;
        String str19 = this.readcardLastnameEN;
        String str20 = this.readcardLastnameTH;
        String str21 = this.readcardMiddlenameEN;
        String str22 = this.readcardMiddlenameTH;
        String str23 = this.readcardPhotoId;
        String str24 = this.readcardTitleEN;
        String str25 = this.readcardTitleTH;
        String str26 = this.readcardType;
        String str27 = this.readcardPhoto;
        return "SaveOrderCardReaderInfo(readcardFlag=" + str + ", readcardAddressDistrict=" + str2 + ", readcardAddressMoo=" + str3 + ", readcardAddressNumber=" + str4 + ", readcardAddressProvince=" + str5 + ", readcardAddressSoi=" + str6 + ", readcardAddressStreet=" + str7 + ", readcardAddressSubDistrict=" + str8 + ", readcardAddressTrok=" + str9 + ", readcardBirthday=" + str10 + ", readcardBP1Number=" + str11 + ", readcardChipid=" + str12 + ", readcardExpireDate=" + str13 + ", readcardFirstnameEN=" + str14 + ", readcardFirstnameTH=" + str15 + ", readcardGender=" + str16 + ", readcardIdNumber=" + str17 + ", readcardIssueDate=" + str18 + ", readcardLastnameEN=" + str19 + ", readcardLastnameTH=" + str20 + ", readcardMiddlenameEN=" + str21 + ", readcardMiddlenameTH=" + str22 + ", readcardPhotoId=" + str23 + ", readcardTitleEN=" + str24 + ", readcardTitleTH=" + str25 + ", readcardType=" + str26 + ", readcardPhoto=" + str27 + ")";
    }

    public SaveOrderCardReaderInfo(@NotNull String readcardFlag, @NotNull String readcardAddressDistrict, @Nullable String str, @NotNull String readcardAddressNumber, @NotNull String readcardAddressProvince, @Nullable String str2, @Nullable String str3, @NotNull String readcardAddressSubDistrict, @Nullable String str4, @NotNull String readcardBirthday, @NotNull String readcardBP1Number, @NotNull String readcardChipid, @NotNull String readcardExpireDate, @NotNull String readcardFirstnameEN, @NotNull String readcardFirstnameTH, @NotNull String readcardGender, @NotNull String readcardIdNumber, @NotNull String readcardIssueDate, @NotNull String readcardLastnameEN, @NotNull String readcardLastnameTH, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String readcardTitleEN, @NotNull String readcardTitleTH, @NotNull String readcardType, @NotNull String readcardPhoto) {
        Intrinsics.checkNotNullParameter(readcardFlag, "readcardFlag");
        Intrinsics.checkNotNullParameter(readcardAddressDistrict, "readcardAddressDistrict");
        Intrinsics.checkNotNullParameter(readcardAddressNumber, "readcardAddressNumber");
        Intrinsics.checkNotNullParameter(readcardAddressProvince, "readcardAddressProvince");
        Intrinsics.checkNotNullParameter(readcardAddressSubDistrict, "readcardAddressSubDistrict");
        Intrinsics.checkNotNullParameter(readcardBirthday, "readcardBirthday");
        Intrinsics.checkNotNullParameter(readcardBP1Number, "readcardBP1Number");
        Intrinsics.checkNotNullParameter(readcardChipid, "readcardChipid");
        Intrinsics.checkNotNullParameter(readcardExpireDate, "readcardExpireDate");
        Intrinsics.checkNotNullParameter(readcardFirstnameEN, "readcardFirstnameEN");
        Intrinsics.checkNotNullParameter(readcardFirstnameTH, "readcardFirstnameTH");
        Intrinsics.checkNotNullParameter(readcardGender, "readcardGender");
        Intrinsics.checkNotNullParameter(readcardIdNumber, "readcardIdNumber");
        Intrinsics.checkNotNullParameter(readcardIssueDate, "readcardIssueDate");
        Intrinsics.checkNotNullParameter(readcardLastnameEN, "readcardLastnameEN");
        Intrinsics.checkNotNullParameter(readcardLastnameTH, "readcardLastnameTH");
        Intrinsics.checkNotNullParameter(readcardTitleEN, "readcardTitleEN");
        Intrinsics.checkNotNullParameter(readcardTitleTH, "readcardTitleTH");
        Intrinsics.checkNotNullParameter(readcardType, "readcardType");
        Intrinsics.checkNotNullParameter(readcardPhoto, "readcardPhoto");
        this.readcardFlag = readcardFlag;
        this.readcardAddressDistrict = readcardAddressDistrict;
        this.readcardAddressMoo = str;
        this.readcardAddressNumber = readcardAddressNumber;
        this.readcardAddressProvince = readcardAddressProvince;
        this.readcardAddressSoi = str2;
        this.readcardAddressStreet = str3;
        this.readcardAddressSubDistrict = readcardAddressSubDistrict;
        this.readcardAddressTrok = str4;
        this.readcardBirthday = readcardBirthday;
        this.readcardBP1Number = readcardBP1Number;
        this.readcardChipid = readcardChipid;
        this.readcardExpireDate = readcardExpireDate;
        this.readcardFirstnameEN = readcardFirstnameEN;
        this.readcardFirstnameTH = readcardFirstnameTH;
        this.readcardGender = readcardGender;
        this.readcardIdNumber = readcardIdNumber;
        this.readcardIssueDate = readcardIssueDate;
        this.readcardLastnameEN = readcardLastnameEN;
        this.readcardLastnameTH = readcardLastnameTH;
        this.readcardMiddlenameEN = str5;
        this.readcardMiddlenameTH = str6;
        this.readcardPhotoId = str7;
        this.readcardTitleEN = readcardTitleEN;
        this.readcardTitleTH = readcardTitleTH;
        this.readcardType = readcardType;
        this.readcardPhoto = readcardPhoto;
    }

    public /* synthetic */ SaveOrderCardReaderInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27);
    }
}
