package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment$navigateNextToCommon$onSuccessCallback$1 */
/* loaded from: classes10.dex */
public final class C14513x7b7ff3b extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ OneChangeOwnerVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14513x7b7ff3b(OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment) {
        super(1);
        this.this$0 = oneChangeOwnerVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            OneChangeOwnerVerifyOtpFragment.m15602O(this.this$0, result);
        } else {
            OneChangeOwnerVerifyOtpFragment.m15604M(this.this$0, result);
        }
    }
}