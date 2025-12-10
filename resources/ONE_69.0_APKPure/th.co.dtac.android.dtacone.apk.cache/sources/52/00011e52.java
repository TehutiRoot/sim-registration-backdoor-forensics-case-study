package th.p047co.dtac.android.dtacone.model.error;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/error/OneValidatedRuleException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "resId", "", "(I)V", "value", "", "(ILjava/lang/String;)V", "<set-?>", "getResId", "()I", "getValue", "()Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.error.OneValidatedRuleException */
/* loaded from: classes8.dex */
public final class OneValidatedRuleException extends IllegalArgumentException {
    public static final int $stable = 8;
    private int resId;
    @Nullable
    private String value;

    public OneValidatedRuleException(@StringRes int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public OneValidatedRuleException(@StringRes int i, @Nullable String str) {
        this.resId = i;
        this.value = str;
    }
}