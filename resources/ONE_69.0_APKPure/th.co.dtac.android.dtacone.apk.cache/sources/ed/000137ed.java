package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.search;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.search.OnePostpaidSearchPackageFragment$setupSearchBox$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidSearchPackageFragment$setupSearchBox$3 extends Lambda implements Function1<String, Boolean> {
    public static final OnePostpaidSearchPackageFragment$setupSearchBox$3 INSTANCE = new OnePostpaidSearchPackageFragment$setupSearchBox$3();

    public OnePostpaidSearchPackageFragment$setupSearchBox$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.length() >= 3);
    }
}