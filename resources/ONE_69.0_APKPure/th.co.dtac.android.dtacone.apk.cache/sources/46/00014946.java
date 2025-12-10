package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolScbWebViewFragment$convertToPostParam$1 */
/* loaded from: classes9.dex */
final class BuyDolScbWebViewFragment$convertToPostParam$1 extends Lambda implements Function1<String, CharSequence> {
    final /* synthetic */ Ref.ObjectRef<HashMap<String, Object>> $postParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolScbWebViewFragment$convertToPostParam$1(Ref.ObjectRef<HashMap<String, Object>> objectRef) {
        super(1);
        this.$postParams = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = this.$postParams.element.get(it);
        return it + "=" + obj;
    }
}