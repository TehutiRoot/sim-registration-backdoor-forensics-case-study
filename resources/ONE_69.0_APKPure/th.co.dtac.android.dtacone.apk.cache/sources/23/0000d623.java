package io.realm.kotlin;

import io.realm.DynamicRealm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m29142d2 = {"toflow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/DynamicRealm;", "realm-kotlin-extensions_baseRelease"}, m29141k = 2, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class DynamicRealmExtensionsKt {
    @NotNull
    public static final Flow<DynamicRealm> toflow(@NotNull DynamicRealm dynamicRealm) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "<this>");
        Flow<DynamicRealm> from = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm);
        Intrinsics.checkNotNullExpressionValue(from, "configuration.flowFactory.from(this)");
        return from;
    }
}