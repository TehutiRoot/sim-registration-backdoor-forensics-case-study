package th.p047co.dtac.android.dtacone.app_one.repository.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015Jb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010*R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u00104R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u00104R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010<R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00101\u001a\u0004\bC\u0010\u0015\"\u0004\bD\u00104¨\u0006E"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/model/OneRegistrationModel;", "", "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "inputData", "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "registrationType", "", "rtrCodeVerify", "phoneNumberOnline", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "itemSelected", "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "oneRegistrationPassWord", "idCard", "<init>", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;Ljava/lang/String;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "component2", "()Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "component6", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "component7", "copy", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/repository/model/OneRegistrationModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "getInputData", "setInputData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "getRegistrationType", "setRegistrationType", "(Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;)V", OperatorName.CURVE_TO, "Ljava/lang/String;", "getRtrCodeVerify", "setRtrCodeVerify", "(Ljava/lang/String;)V", "d", "getPhoneNumberOnline", "setPhoneNumberOnline", "e", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "getItemSelected", "setItemSelected", "(Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "getOneRegistrationPassWord", "setOneRegistrationPassWord", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;)V", OperatorName.NON_STROKING_GRAY, "getIdCard", "setIdCard", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.model.OneRegistrationModel */
/* loaded from: classes7.dex */
public final class OneRegistrationModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneInputInfoData f82374a;

    /* renamed from: b */
    public RegistrationType f82375b;

    /* renamed from: c */
    public String f82376c;

    /* renamed from: d */
    public String f82377d;

    /* renamed from: e */
    public SimData f82378e;

    /* renamed from: f */
    public OneRegistrationPassWord f82379f;

    /* renamed from: g */
    public String f82380g;

    public OneRegistrationModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneRegistrationModel copy$default(OneRegistrationModel oneRegistrationModel, OneInputInfoData oneInputInfoData, RegistrationType registrationType, String str, String str2, SimData simData, OneRegistrationPassWord oneRegistrationPassWord, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            oneInputInfoData = oneRegistrationModel.f82374a;
        }
        if ((i & 2) != 0) {
            registrationType = oneRegistrationModel.f82375b;
        }
        RegistrationType registrationType2 = registrationType;
        if ((i & 4) != 0) {
            str = oneRegistrationModel.f82376c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = oneRegistrationModel.f82377d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            simData = oneRegistrationModel.f82378e;
        }
        SimData simData2 = simData;
        if ((i & 32) != 0) {
            oneRegistrationPassWord = oneRegistrationModel.f82379f;
        }
        OneRegistrationPassWord oneRegistrationPassWord2 = oneRegistrationPassWord;
        if ((i & 64) != 0) {
            str3 = oneRegistrationModel.f82380g;
        }
        return oneRegistrationModel.copy(oneInputInfoData, registrationType2, str4, str5, simData2, oneRegistrationPassWord2, str3);
    }

    @Nullable
    public final OneInputInfoData component1() {
        return this.f82374a;
    }

    @NotNull
    public final RegistrationType component2() {
        return this.f82375b;
    }

    @Nullable
    public final String component3() {
        return this.f82376c;
    }

    @Nullable
    public final String component4() {
        return this.f82377d;
    }

    @Nullable
    public final SimData component5() {
        return this.f82378e;
    }

    @Nullable
    public final OneRegistrationPassWord component6() {
        return this.f82379f;
    }

    @Nullable
    public final String component7() {
        return this.f82380g;
    }

    @NotNull
    public final OneRegistrationModel copy(@Nullable OneInputInfoData oneInputInfoData, @NotNull RegistrationType registrationType, @Nullable String str, @Nullable String str2, @Nullable SimData simData, @Nullable OneRegistrationPassWord oneRegistrationPassWord, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(registrationType, "registrationType");
        return new OneRegistrationModel(oneInputInfoData, registrationType, str, str2, simData, oneRegistrationPassWord, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneRegistrationModel) {
            OneRegistrationModel oneRegistrationModel = (OneRegistrationModel) obj;
            return Intrinsics.areEqual(this.f82374a, oneRegistrationModel.f82374a) && this.f82375b == oneRegistrationModel.f82375b && Intrinsics.areEqual(this.f82376c, oneRegistrationModel.f82376c) && Intrinsics.areEqual(this.f82377d, oneRegistrationModel.f82377d) && Intrinsics.areEqual(this.f82378e, oneRegistrationModel.f82378e) && Intrinsics.areEqual(this.f82379f, oneRegistrationModel.f82379f) && Intrinsics.areEqual(this.f82380g, oneRegistrationModel.f82380g);
        }
        return false;
    }

    @Nullable
    public final String getIdCard() {
        return this.f82380g;
    }

    @Nullable
    public final OneInputInfoData getInputData() {
        return this.f82374a;
    }

    @Nullable
    public final SimData getItemSelected() {
        return this.f82378e;
    }

    @Nullable
    public final OneRegistrationPassWord getOneRegistrationPassWord() {
        return this.f82379f;
    }

    @Nullable
    public final String getPhoneNumberOnline() {
        return this.f82377d;
    }

    @NotNull
    public final RegistrationType getRegistrationType() {
        return this.f82375b;
    }

    @Nullable
    public final String getRtrCodeVerify() {
        return this.f82376c;
    }

    public int hashCode() {
        OneInputInfoData oneInputInfoData = this.f82374a;
        int hashCode = (((oneInputInfoData == null ? 0 : oneInputInfoData.hashCode()) * 31) + this.f82375b.hashCode()) * 31;
        String str = this.f82376c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82377d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SimData simData = this.f82378e;
        int hashCode4 = (hashCode3 + (simData == null ? 0 : simData.hashCode())) * 31;
        OneRegistrationPassWord oneRegistrationPassWord = this.f82379f;
        int hashCode5 = (hashCode4 + (oneRegistrationPassWord == null ? 0 : oneRegistrationPassWord.hashCode())) * 31;
        String str3 = this.f82380g;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIdCard(@Nullable String str) {
        this.f82380g = str;
    }

    public final void setInputData(@Nullable OneInputInfoData oneInputInfoData) {
        this.f82374a = oneInputInfoData;
    }

    public final void setItemSelected(@Nullable SimData simData) {
        this.f82378e = simData;
    }

    public final void setOneRegistrationPassWord(@Nullable OneRegistrationPassWord oneRegistrationPassWord) {
        this.f82379f = oneRegistrationPassWord;
    }

    public final void setPhoneNumberOnline(@Nullable String str) {
        this.f82377d = str;
    }

    public final void setRegistrationType(@NotNull RegistrationType registrationType) {
        Intrinsics.checkNotNullParameter(registrationType, "<set-?>");
        this.f82375b = registrationType;
    }

    public final void setRtrCodeVerify(@Nullable String str) {
        this.f82376c = str;
    }

    @NotNull
    public String toString() {
        OneInputInfoData oneInputInfoData = this.f82374a;
        RegistrationType registrationType = this.f82375b;
        String str = this.f82376c;
        String str2 = this.f82377d;
        SimData simData = this.f82378e;
        OneRegistrationPassWord oneRegistrationPassWord = this.f82379f;
        String str3 = this.f82380g;
        return "OneRegistrationModel(inputData=" + oneInputInfoData + ", registrationType=" + registrationType + ", rtrCodeVerify=" + str + ", phoneNumberOnline=" + str2 + ", itemSelected=" + simData + ", oneRegistrationPassWord=" + oneRegistrationPassWord + ", idCard=" + str3 + ")";
    }

    public OneRegistrationModel(@Nullable OneInputInfoData oneInputInfoData, @NotNull RegistrationType registrationType, @Nullable String str, @Nullable String str2, @Nullable SimData simData, @Nullable OneRegistrationPassWord oneRegistrationPassWord, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(registrationType, "registrationType");
        this.f82374a = oneInputInfoData;
        this.f82375b = registrationType;
        this.f82376c = str;
        this.f82377d = str2;
        this.f82378e = simData;
        this.f82379f = oneRegistrationPassWord;
        this.f82380g = str3;
    }

    public /* synthetic */ OneRegistrationModel(OneInputInfoData oneInputInfoData, RegistrationType registrationType, String str, String str2, SimData simData, OneRegistrationPassWord oneRegistrationPassWord, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneInputInfoData, (i & 2) != 0 ? RegistrationType.Normal : registrationType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : simData, (i & 32) != 0 ? null : oneRegistrationPassWord, (i & 64) != 0 ? null : str3);
    }
}
