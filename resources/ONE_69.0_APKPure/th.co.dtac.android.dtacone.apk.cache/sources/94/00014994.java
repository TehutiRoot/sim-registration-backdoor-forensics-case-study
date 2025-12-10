package th.p047co.dtac.android.dtacone.view.fragment.change_pack;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageGroupModel;
import th.p047co.dtac.android.dtacone.util.p052enum.TelephoneType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSearchFragment$showPackage$packageAdapter$1 */
/* loaded from: classes9.dex */
public final class ChangePackSearchFragment$showPackage$packageAdapter$1 extends Lambda implements Function1<PackageGroupModel, Unit> {
    final /* synthetic */ ChangePackSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackSearchFragment$showPackage$packageAdapter$1(ChangePackSearchFragment changePackSearchFragment) {
        super(1);
        this.this$0 = changePackSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PackageGroupModel packageGroupModel) {
        invoke2(packageGroupModel);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PackageGroupModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.hideKeyboard();
        if (Intrinsics.areEqual(this.this$0.getViewModel().getTelephoneType(), TelephoneType.PREPAID.getType())) {
            this.this$0.m8684v(it, true);
        } else {
            this.this$0.getViewModel().selectPackage(it);
        }
    }
}