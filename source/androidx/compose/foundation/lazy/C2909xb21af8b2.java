package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1 */
/* loaded from: classes.dex */
public final class C2909xb21af8b2 extends Lambda implements Function0<LazyListItemProviderImpl> {
    final /* synthetic */ State<LazyListIntervalContent> $intervalContentState;
    final /* synthetic */ LazyItemScopeImpl $scope;
    final /* synthetic */ LazyListState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909xb21af8b2(State<LazyListIntervalContent> state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        super(0);
        this.$intervalContentState = state;
        this.$state = lazyListState;
        this.$scope = lazyItemScopeImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LazyListItemProviderImpl invoke() {
        LazyListIntervalContent value = this.$intervalContentState.getValue();
        return new LazyListItemProviderImpl(this.$state, value, this.$scope, new NearestRangeKeyIndexMap(this.$state.getNearestRange$foundation_release(), value));
    }
}
