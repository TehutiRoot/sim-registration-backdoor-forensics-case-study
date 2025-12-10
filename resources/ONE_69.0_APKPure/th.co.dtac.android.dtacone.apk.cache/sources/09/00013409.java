package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "it", "invoke", "(C)Ljava/lang/Character;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSearchAdapter$highlightText$q$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundSearchAdapter$highlightText$q$1 extends Lambda implements Function1<Character, Character> {
    final /* synthetic */ OneNadOutboundSearchAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundSearchAdapter$highlightText$q$1(OneNadOutboundSearchAdapter oneNadOutboundSearchAdapter) {
        super(1);
        this.this$0 = oneNadOutboundSearchAdapter;
    }

    @Nullable
    public final Character invoke(char c) {
        Character m13379c;
        m13379c = this.this$0.m13379c(c);
        return m13379c;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Character invoke(Character ch2) {
        return invoke(ch2.charValue());
    }
}