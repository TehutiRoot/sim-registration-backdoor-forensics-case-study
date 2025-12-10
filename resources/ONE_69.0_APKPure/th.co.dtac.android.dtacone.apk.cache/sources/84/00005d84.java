package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m29142d2 = {"", "flags", "updateChangedFlags", "(I)I", "runtime_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RecomposeScopeImplKt {
    @PublishedApi
    public static final int updateChangedFlags(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}