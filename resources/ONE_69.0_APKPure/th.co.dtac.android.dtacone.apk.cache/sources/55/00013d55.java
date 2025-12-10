package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", HintConstants.AUTOFILL_HINT_PHONE, "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$obs$2 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$obs$2 extends Lambda implements Function1<String, Boolean> {
    public static final OneRectifyViewModel$getRectifyList$obs$2 INSTANCE = new OneRectifyViewModel$getRectifyList$obs$2();

    public OneRectifyViewModel$getRectifyList$obs$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@Nullable String str) {
        return Boolean.valueOf(new PhoneNumberValidator().validate(str));
    }
}