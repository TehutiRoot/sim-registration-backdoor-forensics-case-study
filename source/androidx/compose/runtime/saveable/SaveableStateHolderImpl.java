package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {

    /* renamed from: d */
    public static final Companion f28683d = new Companion(null);

    /* renamed from: e */
    public static final Saver f28684e = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final Map f28685a;

    /* renamed from: b */
    public final Map f28686b;

    /* renamed from: c */
    public SaveableStateRegistry f28687c;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.f28684e;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", Action.KEY_ATTRIBUTE, "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "", "", "", "", "map", "", "saveTo", "(Ljava/util/Map;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "shouldSave", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "registry", "runtime-saveable_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public final class RegistryHolder {

        /* renamed from: a */
        public final Object f28688a;

        /* renamed from: b */
        public boolean f28689b;

        /* renamed from: c */
        public final SaveableStateRegistry f28690c;

        /* renamed from: d */
        public final /* synthetic */ SaveableStateHolderImpl f28691d;

        public RegistryHolder(@NotNull SaveableStateHolderImpl saveableStateHolderImpl, Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f28691d = saveableStateHolderImpl;
            this.f28688a = key;
            this.f28689b = true;
            this.f28690c = SaveableStateRegistryKt.SaveableStateRegistry((Map) saveableStateHolderImpl.f28685a.get(key), new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl));
        }

        @NotNull
        public final Object getKey() {
            return this.f28688a;
        }

        @NotNull
        public final SaveableStateRegistry getRegistry() {
            return this.f28690c;
        }

        public final boolean getShouldSave() {
            return this.f28689b;
        }

        public final void saveTo(@NotNull Map<Object, Map<String, List<Object>>> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (this.f28689b) {
                Map<String, List<Object>> performSave = this.f28690c.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.f28688a);
                } else {
                    map.put(this.f28688a, performSave);
                }
            }
        }

        public final void setShouldSave(boolean z) {
            this.f28689b = z;
        }
    }

    public SaveableStateHolderImpl(Map savedStates) {
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        this.f28685a = savedStates;
        this.f28686b = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(Object key, Function2 content, Composer composer, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(207, key);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry m59939e = m59939e();
            if (m59939e != null) {
                z = m59939e.canBeSaved(key);
            } else {
                z = true;
            }
            if (z) {
                rememberedValue = new RegistryHolder(this, key);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        startRestartGroup.endReplaceableGroup();
        RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry())}, content, startRestartGroup, (i & 112) | 8);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, key, registryHolder), startRestartGroup, 6);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SaveableStateHolderImpl$SaveableStateProvider$2(this, key, content, i));
        }
    }

    /* renamed from: e */
    public final SaveableStateRegistry m59939e() {
        return this.f28687c;
    }

    /* renamed from: f */
    public final Map m59938f() {
        Map<Object, Map<String, List<Object>>> mutableMap = AbstractC11687a.toMutableMap(this.f28685a);
        for (RegistryHolder registryHolder : this.f28686b.values()) {
            registryHolder.saveTo(mutableMap);
        }
        if (mutableMap.isEmpty()) {
            return null;
        }
        return mutableMap;
    }

    /* renamed from: g */
    public final void m59937g(SaveableStateRegistry saveableStateRegistry) {
        this.f28687c = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        RegistryHolder registryHolder = (RegistryHolder) this.f28686b.get(key);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.f28685a.remove(key);
        }
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
