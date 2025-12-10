package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import android.widget.CheckBox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$validationFrom$7 */
/* loaded from: classes10.dex */
public final class OneBuyDolCreditCardFragment$validationFrom$7 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneBuyDolCreditCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolCreditCardFragment$validationFrom$7(OneBuyDolCreditCardFragment oneBuyDolCreditCardFragment) {
        super(1);
        this.this$0 = oneBuyDolCreditCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        CheckBox checkBox;
        if (Intrinsics.areEqual(it, Boolean.FALSE)) {
            checkBox = this.this$0.f88402w;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("saveCreditCheckBox");
                checkBox = null;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            checkBox.setChecked(it.booleanValue());
        }
    }
}