package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest$VerificationItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository$mapVerificationListToString$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidRepository$mapVerificationListToString$1 extends Lambda implements Function1<OneCheckPrivilegeRequest.VerificationItem, CharSequence> {
    public static final OnePostpaidRepository$mapVerificationListToString$1 INSTANCE = new OnePostpaidRepository$mapVerificationListToString$1();

    public OnePostpaidRepository$mapVerificationListToString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull OneCheckPrivilegeRequest.VerificationItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        String value = it.getValue();
        return name + "=" + value;
    }
}