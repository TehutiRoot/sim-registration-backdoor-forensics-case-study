package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class AbstractLongTimeSource$zero$2 extends Lambda implements Function0<Long> {
    final /* synthetic */ AbstractLongTimeSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLongTimeSource$zero$2(AbstractLongTimeSource abstractLongTimeSource) {
        super(0);
        this.this$0 = abstractLongTimeSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        return Long.valueOf(this.this$0.read());
    }
}
