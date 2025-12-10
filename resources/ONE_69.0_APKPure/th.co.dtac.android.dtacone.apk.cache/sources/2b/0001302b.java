package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u000f¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualInformation;", "", "", "birthDate", "familyName", "familyNameEn", HintConstants.AUTOFILL_HINT_GENDER, "givenName", "givenNameEn", "middleName", "middleNameEn", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/IndividualInformation;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getBirthDate", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFamilyName", OperatorName.CURVE_TO, "getFamilyNameEn", "d", "getGender", "e", "getGivenName", OperatorName.FILL_NON_ZERO, "getGivenNameEn", OperatorName.NON_STROKING_GRAY, "getMiddleName", OperatorName.CLOSE_PATH, "getMiddleNameEn", "i", "getTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.IndividualInformation */
/* loaded from: classes10.dex */
public final class IndividualInformation {
    public static final int $stable = 0;
    @SerializedName("birthDate")
    @NotNull

    /* renamed from: a */
    private final String f90832a;
    @SerializedName("familyName")
    @NotNull

    /* renamed from: b */
    private final String f90833b;
    @SerializedName("familyNameEn")
    @NotNull

    /* renamed from: c */
    private final String f90834c;
    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    @NotNull

    /* renamed from: d */
    private final String f90835d;
    @SerializedName("givenName")
    @NotNull

    /* renamed from: e */
    private final String f90836e;
    @SerializedName("givenNameEn")
    @NotNull

    /* renamed from: f */
    private final String f90837f;
    @SerializedName("middleName")
    @NotNull

    /* renamed from: g */
    private final String f90838g;
    @SerializedName("middleNameEn")
    @NotNull

    /* renamed from: h */
    private final String f90839h;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull

    /* renamed from: i */
    private final String f90840i;

    public IndividualInformation() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final String component1() {
        return this.f90832a;
    }

    @NotNull
    public final String component2() {
        return this.f90833b;
    }

    @NotNull
    public final String component3() {
        return this.f90834c;
    }

    @NotNull
    public final String component4() {
        return this.f90835d;
    }

    @NotNull
    public final String component5() {
        return this.f90836e;
    }

    @NotNull
    public final String component6() {
        return this.f90837f;
    }

    @NotNull
    public final String component7() {
        return this.f90838g;
    }

    @NotNull
    public final String component8() {
        return this.f90839h;
    }

    @NotNull
    public final String component9() {
        return this.f90840i;
    }

    @NotNull
    public final IndividualInformation copy(@NotNull String birthDate, @NotNull String familyName, @NotNull String familyNameEn, @NotNull String gender, @NotNull String givenName, @NotNull String givenNameEn, @NotNull String middleName, @NotNull String middleNameEn, @NotNull String title) {
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(familyNameEn, "familyNameEn");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(givenNameEn, "givenNameEn");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(middleNameEn, "middleNameEn");
        Intrinsics.checkNotNullParameter(title, "title");
        return new IndividualInformation(birthDate, familyName, familyNameEn, gender, givenName, givenNameEn, middleName, middleNameEn, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndividualInformation) {
            IndividualInformation individualInformation = (IndividualInformation) obj;
            return Intrinsics.areEqual(this.f90832a, individualInformation.f90832a) && Intrinsics.areEqual(this.f90833b, individualInformation.f90833b) && Intrinsics.areEqual(this.f90834c, individualInformation.f90834c) && Intrinsics.areEqual(this.f90835d, individualInformation.f90835d) && Intrinsics.areEqual(this.f90836e, individualInformation.f90836e) && Intrinsics.areEqual(this.f90837f, individualInformation.f90837f) && Intrinsics.areEqual(this.f90838g, individualInformation.f90838g) && Intrinsics.areEqual(this.f90839h, individualInformation.f90839h) && Intrinsics.areEqual(this.f90840i, individualInformation.f90840i);
        }
        return false;
    }

    @NotNull
    public final String getBirthDate() {
        return this.f90832a;
    }

    @NotNull
    public final String getFamilyName() {
        return this.f90833b;
    }

    @NotNull
    public final String getFamilyNameEn() {
        return this.f90834c;
    }

    @NotNull
    public final String getGender() {
        return this.f90835d;
    }

    @NotNull
    public final String getGivenName() {
        return this.f90836e;
    }

    @NotNull
    public final String getGivenNameEn() {
        return this.f90837f;
    }

    @NotNull
    public final String getMiddleName() {
        return this.f90838g;
    }

    @NotNull
    public final String getMiddleNameEn() {
        return this.f90839h;
    }

    @NotNull
    public final String getTitle() {
        return this.f90840i;
    }

    public int hashCode() {
        return (((((((((((((((this.f90832a.hashCode() * 31) + this.f90833b.hashCode()) * 31) + this.f90834c.hashCode()) * 31) + this.f90835d.hashCode()) * 31) + this.f90836e.hashCode()) * 31) + this.f90837f.hashCode()) * 31) + this.f90838g.hashCode()) * 31) + this.f90839h.hashCode()) * 31) + this.f90840i.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90832a;
        String str2 = this.f90833b;
        String str3 = this.f90834c;
        String str4 = this.f90835d;
        String str5 = this.f90836e;
        String str6 = this.f90837f;
        String str7 = this.f90838g;
        String str8 = this.f90839h;
        String str9 = this.f90840i;
        return "IndividualInformation(birthDate=" + str + ", familyName=" + str2 + ", familyNameEn=" + str3 + ", gender=" + str4 + ", givenName=" + str5 + ", givenNameEn=" + str6 + ", middleName=" + str7 + ", middleNameEn=" + str8 + ", title=" + str9 + ")";
    }

    public IndividualInformation(@NotNull String birthDate, @NotNull String familyName, @NotNull String familyNameEn, @NotNull String gender, @NotNull String givenName, @NotNull String givenNameEn, @NotNull String middleName, @NotNull String middleNameEn, @NotNull String title) {
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(familyNameEn, "familyNameEn");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(givenNameEn, "givenNameEn");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(middleNameEn, "middleNameEn");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f90832a = birthDate;
        this.f90833b = familyName;
        this.f90834c = familyNameEn;
        this.f90835d = gender;
        this.f90836e = givenName;
        this.f90837f = givenNameEn;
        this.f90838g = middleName;
        this.f90839h = middleNameEn;
        this.f90840i = title;
    }

    public /* synthetic */ IndividualInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}