package th.p047co.dtac.android.dtacone.app_one.repository.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/model/OneChangePasswordModel;", "", "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "changePasswordData", "<init>", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "copy", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;)Lth/co/dtac/android/dtacone/app_one/repository/model/OneChangePasswordModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "getChangePasswordData", "setChangePasswordData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.model.OneChangePasswordModel */
/* loaded from: classes7.dex */
public final class OneChangePasswordModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneChangePassword f82372a;

    public OneChangePasswordModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneChangePasswordModel copy$default(OneChangePasswordModel oneChangePasswordModel, OneChangePassword oneChangePassword, int i, Object obj) {
        if ((i & 1) != 0) {
            oneChangePassword = oneChangePasswordModel.f82372a;
        }
        return oneChangePasswordModel.copy(oneChangePassword);
    }

    @Nullable
    public final OneChangePassword component1() {
        return this.f82372a;
    }

    @NotNull
    public final OneChangePasswordModel copy(@Nullable OneChangePassword oneChangePassword) {
        return new OneChangePasswordModel(oneChangePassword);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneChangePasswordModel) && Intrinsics.areEqual(this.f82372a, ((OneChangePasswordModel) obj).f82372a);
    }

    @Nullable
    public final OneChangePassword getChangePasswordData() {
        return this.f82372a;
    }

    public int hashCode() {
        OneChangePassword oneChangePassword = this.f82372a;
        if (oneChangePassword == null) {
            return 0;
        }
        return oneChangePassword.hashCode();
    }

    public final void setChangePasswordData(@Nullable OneChangePassword oneChangePassword) {
        this.f82372a = oneChangePassword;
    }

    @NotNull
    public String toString() {
        OneChangePassword oneChangePassword = this.f82372a;
        return "OneChangePasswordModel(changePasswordData=" + oneChangePassword + ")";
    }

    public OneChangePasswordModel(@Nullable OneChangePassword oneChangePassword) {
        this.f82372a = oneChangePassword;
    }

    public /* synthetic */ OneChangePasswordModel(OneChangePassword oneChangePassword, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneChangePassword);
    }
}
