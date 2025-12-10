package th.p047co.dtac.android.dtacone.app_one.util.model;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010#R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u00107¨\u00068"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "", "", "firstName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, HintConstants.AUTOFILL_HINT_PASSWORD, "passwordConfirm", "userId", "creditLimit", "", "radioCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFirstName", "setFirstName", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPhoneNumber", "setPhoneNumber", OperatorName.CURVE_TO, "getPassword", "setPassword", "d", "getPasswordConfirm", "setPasswordConfirm", "e", "getUserId", "setUserId", OperatorName.FILL_NON_ZERO, "getCreditLimit", "setCreditLimit", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Boolean;", "getRadioCheck", "setRadioCheck", "(Ljava/lang/Boolean;)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff */
/* loaded from: classes7.dex */
public final class OneAddNewStaff {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f82399a;

    /* renamed from: b */
    public String f82400b;

    /* renamed from: c */
    public String f82401c;

    /* renamed from: d */
    public String f82402d;

    /* renamed from: e */
    public String f82403e;

    /* renamed from: f */
    public String f82404f;

    /* renamed from: g */
    public Boolean f82405g;

    public OneAddNewStaff() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneAddNewStaff copy$default(OneAddNewStaff oneAddNewStaff, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneAddNewStaff.f82399a;
        }
        if ((i & 2) != 0) {
            str2 = oneAddNewStaff.f82400b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneAddNewStaff.f82401c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneAddNewStaff.f82402d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneAddNewStaff.f82403e;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneAddNewStaff.f82404f;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            bool = oneAddNewStaff.f82405g;
        }
        return oneAddNewStaff.copy(str, str7, str8, str9, str10, str11, bool);
    }

    @Nullable
    public final String component1() {
        return this.f82399a;
    }

    @Nullable
    public final String component2() {
        return this.f82400b;
    }

    @Nullable
    public final String component3() {
        return this.f82401c;
    }

    @Nullable
    public final String component4() {
        return this.f82402d;
    }

    @Nullable
    public final String component5() {
        return this.f82403e;
    }

    @Nullable
    public final String component6() {
        return this.f82404f;
    }

    @Nullable
    public final Boolean component7() {
        return this.f82405g;
    }

    @NotNull
    public final OneAddNewStaff copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
        return new OneAddNewStaff(str, str2, str3, str4, str5, str6, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneAddNewStaff) {
            OneAddNewStaff oneAddNewStaff = (OneAddNewStaff) obj;
            return Intrinsics.areEqual(this.f82399a, oneAddNewStaff.f82399a) && Intrinsics.areEqual(this.f82400b, oneAddNewStaff.f82400b) && Intrinsics.areEqual(this.f82401c, oneAddNewStaff.f82401c) && Intrinsics.areEqual(this.f82402d, oneAddNewStaff.f82402d) && Intrinsics.areEqual(this.f82403e, oneAddNewStaff.f82403e) && Intrinsics.areEqual(this.f82404f, oneAddNewStaff.f82404f) && Intrinsics.areEqual(this.f82405g, oneAddNewStaff.f82405g);
        }
        return false;
    }

    @Nullable
    public final String getCreditLimit() {
        return this.f82404f;
    }

    @Nullable
    public final String getFirstName() {
        return this.f82399a;
    }

    @Nullable
    public final String getPassword() {
        return this.f82401c;
    }

    @Nullable
    public final String getPasswordConfirm() {
        return this.f82402d;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.f82400b;
    }

    @Nullable
    public final Boolean getRadioCheck() {
        return this.f82405g;
    }

    @Nullable
    public final String getUserId() {
        return this.f82403e;
    }

    public int hashCode() {
        String str = this.f82399a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82400b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82401c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82402d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82403e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82404f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f82405g;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setCreditLimit(@Nullable String str) {
        this.f82404f = str;
    }

    public final void setFirstName(@Nullable String str) {
        this.f82399a = str;
    }

    public final void setPassword(@Nullable String str) {
        this.f82401c = str;
    }

    public final void setPasswordConfirm(@Nullable String str) {
        this.f82402d = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.f82400b = str;
    }

    public final void setRadioCheck(@Nullable Boolean bool) {
        this.f82405g = bool;
    }

    public final void setUserId(@Nullable String str) {
        this.f82403e = str;
    }

    @NotNull
    public String toString() {
        String str = this.f82399a;
        String str2 = this.f82400b;
        String str3 = this.f82401c;
        String str4 = this.f82402d;
        String str5 = this.f82403e;
        String str6 = this.f82404f;
        Boolean bool = this.f82405g;
        return "OneAddNewStaff(firstName=" + str + ", phoneNumber=" + str2 + ", password=" + str3 + ", passwordConfirm=" + str4 + ", userId=" + str5 + ", creditLimit=" + str6 + ", radioCheck=" + bool + ")";
    }

    public OneAddNewStaff(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
        this.f82399a = str;
        this.f82400b = str2;
        this.f82401c = str3;
        this.f82402d = str4;
        this.f82403e = str5;
        this.f82404f = str6;
        this.f82405g = bool;
    }

    public /* synthetic */ OneAddNewStaff(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : bool);
    }
}
