package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LazyGridItemProviderImpl implements LazyGridItemProvider {

    /* renamed from: a */
    public final LazyGridState f13490a;

    /* renamed from: b */
    public final LazyGridIntervalContent f13491b;

    /* renamed from: c */
    public final LazyLayoutKeyIndexMap f13492c;

    public LazyGridItemProviderImpl(LazyGridState state, LazyGridIntervalContent intervalContent, LazyLayoutKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f13490a = state;
        this.f13491b = intervalContent;
        this.f13492c = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(int i, Object key, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer startRestartGroup = composer.startRestartGroup(1493551140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1493551140, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i, this.f13490a.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 726189336, true, new LazyGridItemProviderImpl$Item$1(this, i)), startRestartGroup, ((i2 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridItemProviderImpl$Item$2(this, i, key, i2));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return Intrinsics.areEqual(this.f13491b, ((LazyGridItemProviderImpl) obj).f13491b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i) {
        return this.f13491b.getContentType(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getKeyIndexMap().getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.f13491b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        if (key == null) {
            return this.f13491b.getKey(i);
        }
        return key;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f13492c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.f13491b.getSpanLayoutProvider$foundation_release();
    }

    public int hashCode() {
        return this.f13491b.hashCode();
    }
}
