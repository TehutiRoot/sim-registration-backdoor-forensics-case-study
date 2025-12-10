package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "composition", "Landroidx/compose/runtime/Composition;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,388:1\n137#2,22:389\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n344#1:389,22\n*E\n"})
/* loaded from: classes2.dex */
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements Function1<Composition, Unit> {
    final /* synthetic */ IdentityArrayIntMap $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArrayIntMap identityArrayIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i;
        this.$instances = identityArrayIntMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
        invoke2(composition);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Composition composition) {
        int i;
        IdentityArrayIntMap identityArrayIntMap;
        IdentityArrayMap identityArrayMap;
        Intrinsics.checkNotNullParameter(composition, "composition");
        i = this.this$0.f28469e;
        if (i == this.$token) {
            IdentityArrayIntMap identityArrayIntMap2 = this.$instances;
            identityArrayIntMap = this.this$0.f28470f;
            if (Intrinsics.areEqual(identityArrayIntMap2, identityArrayIntMap) && (composition instanceof CompositionImpl)) {
                IdentityArrayIntMap identityArrayIntMap3 = this.$instances;
                int i2 = this.$token;
                RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                Object[] keys = identityArrayIntMap3.getKeys();
                int[] values = identityArrayIntMap3.getValues();
                int size = identityArrayIntMap3.getSize();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj = keys[i4];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i5 = values[i4];
                    boolean z = i5 != i2;
                    if (z) {
                        CompositionImpl compositionImpl = (CompositionImpl) composition;
                        compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                        DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                        if (derivedState != null) {
                            compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                            identityArrayMap = recomposeScopeImpl.f28471g;
                            if (identityArrayMap != null) {
                                identityArrayMap.remove(derivedState);
                                if (identityArrayMap.getSize() == 0) {
                                    recomposeScopeImpl.f28471g = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i3 != i4) {
                            keys[i3] = obj;
                            values[i3] = i5;
                        }
                        i3++;
                    }
                }
                for (int i6 = i3; i6 < size; i6++) {
                    keys[i6] = null;
                }
                identityArrayIntMap3.f28574a = i3;
                if (this.$instances.getSize() == 0) {
                    this.this$0.f28470f = null;
                }
            }
        }
    }
}