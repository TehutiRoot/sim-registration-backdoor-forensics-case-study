package th.p047co.dtac.android.dtacone.extension.view;

import android.app.Dialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.view.ActivityExtKt$buildConfirmDialogWithImage$3$3 */
/* loaded from: classes7.dex */
public final class ActivityExtKt$buildConfirmDialogWithImage$3$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $handlerButtonLeft;
    final /* synthetic */ Dialog $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityExtKt$buildConfirmDialogWithImage$3$3(Dialog dialog, Function0<Unit> function0) {
        super(0);
        this.$this_apply = dialog;
        this.$handlerButtonLeft = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_apply.dismiss();
        this.$handlerButtonLeft.invoke();
    }
}
