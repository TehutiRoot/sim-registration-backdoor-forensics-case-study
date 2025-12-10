package th.p047co.dtac.android.dtacone.app_one.repository.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/model/OneForgotPasswordModel;", "", "Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "forgotPasswordData", "<init>", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "copy", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;)Lth/co/dtac/android/dtacone/app_one/repository/model/OneForgotPasswordModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "getForgotPasswordData", "setForgotPasswordData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.model.OneForgotPasswordModel */
/* loaded from: classes7.dex */
public final class OneForgotPasswordModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneForgotPassword f82373a;

    public OneForgotPasswordModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneForgotPasswordModel copy$default(OneForgotPasswordModel oneForgotPasswordModel, OneForgotPassword oneForgotPassword, int i, Object obj) {
        if ((i & 1) != 0) {
            oneForgotPassword = oneForgotPasswordModel.f82373a;
        }
        return oneForgotPasswordModel.copy(oneForgotPassword);
    }

    @Nullable
    public final OneForgotPassword component1() {
        return this.f82373a;
    }

    @NotNull
    public final OneForgotPasswordModel copy(@Nullable OneForgotPassword oneForgotPassword) {
        return new OneForgotPasswordModel(oneForgotPassword);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneForgotPasswordModel) && Intrinsics.areEqual(this.f82373a, ((OneForgotPasswordModel) obj).f82373a);
    }

    @Nullable
    public final OneForgotPassword getForgotPasswordData() {
        return this.f82373a;
    }

    public int hashCode() {
        OneForgotPassword oneForgotPassword = this.f82373a;
        if (oneForgotPassword == null) {
            return 0;
        }
        return oneForgotPassword.hashCode();
    }

    public final void setForgotPasswordData(@Nullable OneForgotPassword oneForgotPassword) {
        this.f82373a = oneForgotPassword;
    }

    @NotNull
    public String toString() {
        OneForgotPassword oneForgotPassword = this.f82373a;
        return "OneForgotPasswordModel(forgotPasswordData=" + oneForgotPassword + ")";
    }

    public OneForgotPasswordModel(@Nullable OneForgotPassword oneForgotPassword) {
        this.f82373a = oneForgotPassword;
    }

    public /* synthetic */ OneForgotPasswordModel(OneForgotPassword oneForgotPassword, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneForgotPassword);
    }
}
