package androidx.compose.p003ui.tooling.preview.datasource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1 */
/* loaded from: classes2.dex */
public final class LoremIpsum$generateLoremIpsum$1 extends Lambda implements Function0<String> {
    final /* synthetic */ int $loremIpsumMaxSize;
    final /* synthetic */ Ref.IntRef $wordsUsed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(Ref.IntRef intRef, int i) {
        super(0);
        this.$wordsUsed = intRef;
        this.$loremIpsumMaxSize = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        List list;
        list = LoremIpsumKt.f31739a;
        Ref.IntRef intRef = this.$wordsUsed;
        int i = intRef.element;
        intRef.element = i + 1;
        return (String) list.get(i % this.$loremIpsumMaxSize);
    }
}
