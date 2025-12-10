package th.p047co.dtac.android.dtacone.view.fragment.rectify;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogRectifyConfirm;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRectifyConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectifyConfirmFragment.kt\nth/co/dtac/android/dtacone/view/fragment/rectify/RectifyConfirmFragment$autoPin4Digit$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.rectify.RectifyConfirmFragment$autoPin4Digit$1 */
/* loaded from: classes9.dex */
public final class RectifyConfirmFragment$autoPin4Digit$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ RectifyConfirmFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectifyConfirmFragment$autoPin4Digit$1(RectifyConfirmFragment rectifyConfirmFragment) {
        super(1);
        this.this$0 = rectifyConfirmFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        this.this$0.f104311i = str;
        CustomDialogRectifyConfirm newInstance = CustomDialogRectifyConfirm.newInstance(this.this$0.getRectify());
        newInstance.setTargetFragment(this.this$0, 0);
        FragmentManager fragmentManager = this.this$0.getFragmentManager();
        if (fragmentManager != null) {
            newInstance.show(fragmentManager, (String) null);
        }
    }
}