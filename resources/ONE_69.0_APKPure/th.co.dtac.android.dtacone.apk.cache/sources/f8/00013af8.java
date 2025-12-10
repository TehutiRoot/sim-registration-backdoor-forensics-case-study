package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostChangeIMEIDialogFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostChangeIMEIDialogFragment$setupView$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostChangeIMEIDialogFragment$setupView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePre2PostChangeIMEIDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostChangeIMEIDialogFragment$setupView$2(OnePre2PostChangeIMEIDialogFragment onePre2PostChangeIMEIDialogFragment) {
        super(0);
        this.this$0 = onePre2PostChangeIMEIDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePre2PostChangeIMEIDialogFragment.OnePre2PostChangeIMEIDialogCallback onePre2PostChangeIMEIDialogCallback;
        onePre2PostChangeIMEIDialogCallback = this.this$0.f95240b;
        if (onePre2PostChangeIMEIDialogCallback != null) {
            onePre2PostChangeIMEIDialogCallback.onCancel();
        }
        this.this$0.dismiss();
    }
}