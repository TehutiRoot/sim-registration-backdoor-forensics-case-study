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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "", "", HintConstants.AUTOFILL_HINT_PASSWORD, "passwordConfirm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPassword", "setPassword", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPasswordConfirm", "setPasswordConfirm", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord */
/* loaded from: classes7.dex */
public final class OneRegistrationPassWord {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f82509a;

    /* renamed from: b */
    public String f82510b;

    public OneRegistrationPassWord() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneRegistrationPassWord copy$default(OneRegistrationPassWord oneRegistrationPassWord, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneRegistrationPassWord.f82509a;
        }
        if ((i & 2) != 0) {
            str2 = oneRegistrationPassWord.f82510b;
        }
        return oneRegistrationPassWord.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82509a;
    }

    @Nullable
    public final String component2() {
        return this.f82510b;
    }

    @NotNull
    public final OneRegistrationPassWord copy(@Nullable String str, @Nullable String str2) {
        return new OneRegistrationPassWord(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneRegistrationPassWord) {
            OneRegistrationPassWord oneRegistrationPassWord = (OneRegistrationPassWord) obj;
            return Intrinsics.areEqual(this.f82509a, oneRegistrationPassWord.f82509a) && Intrinsics.areEqual(this.f82510b, oneRegistrationPassWord.f82510b);
        }
        return false;
    }

    @Nullable
    public final String getPassword() {
        return this.f82509a;
    }

    @Nullable
    public final String getPasswordConfirm() {
        return this.f82510b;
    }

    public int hashCode() {
        String str = this.f82509a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82510b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPassword(@Nullable String str) {
        this.f82509a = str;
    }

    public final void setPasswordConfirm(@Nullable String str) {
        this.f82510b = str;
    }

    @NotNull
    public String toString() {
        String str = this.f82509a;
        String str2 = this.f82510b;
        return "OneRegistrationPassWord(password=" + str + ", passwordConfirm=" + str2 + ")";
    }

    public OneRegistrationPassWord(@Nullable String str, @Nullable String str2) {
        this.f82509a = str;
        this.f82510b = str2;
    }

    public /* synthetic */ OneRegistrationPassWord(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}