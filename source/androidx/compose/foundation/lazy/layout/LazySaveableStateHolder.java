package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    /* renamed from: d */
    public static final Companion f13669d = new Companion(null);

    /* renamed from: a */
    public final SaveableStateRegistry f13670a;

    /* renamed from: b */
    public final MutableState f13671b;

    /* renamed from: c */
    public final Set f13672c;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$1 */
    /* loaded from: classes.dex */
    public static final class C29391 extends Lambda implements Function1<Object, Boolean> {
        final /* synthetic */ SaveableStateRegistry $parentRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29391(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.$parentRegistry = saveableStateRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SaveableStateRegistry saveableStateRegistry = this.$parentRegistry;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(it) : true);
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(@Nullable SaveableStateRegistry saveableStateRegistry) {
            return SaverKt.Saver(LazySaveableStateHolder$Companion$saver$1.INSTANCE, new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry));
        }

        public Companion() {
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry wrappedRegistry) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(wrappedRegistry, "wrappedRegistry");
        this.f13670a = wrappedRegistry;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f13671b = m31891g;
        this.f13672c = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(Object key, Function2 content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder m61188b = m61188b();
        if (m61188b != null) {
            m61188b.SaveableStateProvider(key, content, startRestartGroup, (i & 112) | 520);
            EffectsKt.DisposableEffect(key, new LazySaveableStateHolder$SaveableStateProvider$1(this, key), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new LazySaveableStateHolder$SaveableStateProvider$2(this, key, content, i));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final SaveableStateHolder m61188b() {
        return (SaveableStateHolder) this.f13671b.getValue();
    }

    /* renamed from: c */
    public final void m61187c(SaveableStateHolder saveableStateHolder) {
        this.f13671b.setValue(saveableStateHolder);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f13670a.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f13670a.consumeRestored(key);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map performSave() {
        SaveableStateHolder m61188b = m61188b();
        if (m61188b != null) {
            for (Object obj : this.f13672c) {
                m61188b.removeState(obj);
            }
        }
        return this.f13670a.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String key, Function0 valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f13670a.registerProvider(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SaveableStateHolder m61188b = m61188b();
        if (m61188b != null) {
            m61188b.removeState(key);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map map) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new C29391(saveableStateRegistry)));
    }
}
