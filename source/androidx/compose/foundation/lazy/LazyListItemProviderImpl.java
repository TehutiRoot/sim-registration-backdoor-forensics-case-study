package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {

    /* renamed from: a */
    public final LazyListState f13374a;

    /* renamed from: b */
    public final LazyListIntervalContent f13375b;

    /* renamed from: c */
    public final LazyItemScopeImpl f13376c;

    /* renamed from: d */
    public final LazyLayoutKeyIndexMap f13377d;

    public LazyListItemProviderImpl(LazyListState state, LazyListIntervalContent intervalContent, LazyItemScopeImpl itemScope, LazyLayoutKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f13374a = state;
        this.f13375b = intervalContent;
        this.f13376c = itemScope;
        this.f13377d = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(int i, Object key, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer startRestartGroup = composer.startRestartGroup(-462424778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-462424778, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i, this.f13374a.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, -824725566, true, new LazyListItemProviderImpl$Item$1(this, i)), startRestartGroup, ((i2 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyListItemProviderImpl$Item$2(this, i, key, i2));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return Intrinsics.areEqual(this.f13375b, ((LazyListItemProviderImpl) obj).f13375b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i) {
        return this.f13375b.getContentType(i);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List getHeaderIndexes() {
        return this.f13375b.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKeyIndexMap().getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.f13375b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.f13376c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        if (key == null) {
            return this.f13375b.getKey(i);
        }
        return key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f13377d;
    }

    public int hashCode() {
        return this.f13375b.hashCode();
    }
}
