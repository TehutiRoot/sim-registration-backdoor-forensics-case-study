package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.search;

import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Landroid/widget/EditText;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.search.OnePostpaidSearchPackageFragment$setupSearchBox$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidSearchPackageFragment$setupSearchBox$1 extends Lambda implements Function1<EditText, Unit> {
    public static final OnePostpaidSearchPackageFragment$setupSearchBox$1 INSTANCE = new OnePostpaidSearchPackageFragment$setupSearchBox$1();

    public OnePostpaidSearchPackageFragment$setupSearchBox$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EditText editText) {
        invoke2(editText);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull EditText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getText().clear();
    }
}