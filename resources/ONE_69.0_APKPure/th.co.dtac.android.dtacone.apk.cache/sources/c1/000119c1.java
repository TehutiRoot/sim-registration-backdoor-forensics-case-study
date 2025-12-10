package th.p047co.dtac.android.dtacone.manager.security;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "", "", "pin", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPin", "()Ljava/lang/String;", "setPin", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.security.OneSecurePin */
/* loaded from: classes7.dex */
public final class OneSecurePin {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f85082a;

    public OneSecurePin(@NotNull String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f85082a = pin;
    }

    @NotNull
    public final String getPin() {
        return this.f85082a;
    }

    public final void setPin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85082a = str;
    }
}