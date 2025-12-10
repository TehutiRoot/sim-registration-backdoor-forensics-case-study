package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;", "", "", "privilegeCode", "identityNumber", "matCode", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterTCheckPrivilegeRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPrivilegeCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIdentityNumber", OperatorName.CURVE_TO, "getMatCode", "d", "getBirthDate", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterTCheckPrivilegeRequest */
/* loaded from: classes7.dex */
public final class OnePrepaidRegisterTCheckPrivilegeRequest {
    public static final int $stable = 0;
    @SerializedName("privilegeCode")
    @Nullable

    /* renamed from: a */
    private final String f81893a;
    @SerializedName("identityNumber")
    @Nullable

    /* renamed from: b */
    private final String f81894b;
    @SerializedName("matCode")
    @Nullable

    /* renamed from: c */
    private final String f81895c;
    @SerializedName("birthDate")
    @Nullable

    /* renamed from: d */
    private final String f81896d;

    public OnePrepaidRegisterTCheckPrivilegeRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OnePrepaidRegisterTCheckPrivilegeRequest copy$default(OnePrepaidRegisterTCheckPrivilegeRequest onePrepaidRegisterTCheckPrivilegeRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidRegisterTCheckPrivilegeRequest.f81893a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidRegisterTCheckPrivilegeRequest.f81894b;
        }
        if ((i & 4) != 0) {
            str3 = onePrepaidRegisterTCheckPrivilegeRequest.f81895c;
        }
        if ((i & 8) != 0) {
            str4 = onePrepaidRegisterTCheckPrivilegeRequest.f81896d;
        }
        return onePrepaidRegisterTCheckPrivilegeRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.f81893a;
    }

    @Nullable
    public final String component2() {
        return this.f81894b;
    }

    @Nullable
    public final String component3() {
        return this.f81895c;
    }

    @Nullable
    public final String component4() {
        return this.f81896d;
    }

    @NotNull
    public final OnePrepaidRegisterTCheckPrivilegeRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OnePrepaidRegisterTCheckPrivilegeRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidRegisterTCheckPrivilegeRequest) {
            OnePrepaidRegisterTCheckPrivilegeRequest onePrepaidRegisterTCheckPrivilegeRequest = (OnePrepaidRegisterTCheckPrivilegeRequest) obj;
            return Intrinsics.areEqual(this.f81893a, onePrepaidRegisterTCheckPrivilegeRequest.f81893a) && Intrinsics.areEqual(this.f81894b, onePrepaidRegisterTCheckPrivilegeRequest.f81894b) && Intrinsics.areEqual(this.f81895c, onePrepaidRegisterTCheckPrivilegeRequest.f81895c) && Intrinsics.areEqual(this.f81896d, onePrepaidRegisterTCheckPrivilegeRequest.f81896d);
        }
        return false;
    }

    @Nullable
    public final String getBirthDate() {
        return this.f81896d;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.f81894b;
    }

    @Nullable
    public final String getMatCode() {
        return this.f81895c;
    }

    @Nullable
    public final String getPrivilegeCode() {
        return this.f81893a;
    }

    public int hashCode() {
        String str = this.f81893a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81894b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81895c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81896d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81893a;
        String str2 = this.f81894b;
        String str3 = this.f81895c;
        String str4 = this.f81896d;
        return "OnePrepaidRegisterTCheckPrivilegeRequest(privilegeCode=" + str + ", identityNumber=" + str2 + ", matCode=" + str3 + ", birthDate=" + str4 + ")";
    }

    public OnePrepaidRegisterTCheckPrivilegeRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f81893a = str;
        this.f81894b = str2;
        this.f81895c = str3;
        this.f81896d = str4;
    }

    public /* synthetic */ OnePrepaidRegisterTCheckPrivilegeRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
