package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.InternalTextApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003$\u0011\u0014B%\u0012\u001c\u0010\u0006\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\f\u0012\u0004\u0012\u00028\u00000\u0013R\u00020\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0006\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R,\u0010\u0019\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0002\b\u00030\u0013R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, m28850d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "factory", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "T", "plugin", "rememberAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "getOrCreateAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;)Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$b;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;)Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$b;", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "adaptersByPlugin", "", OperatorName.CURVE_TO, "Z", "adaptersMayNeedDisposal", "d", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "focusedPlugin", "getFocusedAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "focusedAdapter", "AdapterHandle", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@InternalTextApi
@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,341:1\n1#2:342\n36#3:343\n25#3:354\n1097#4,6:344\n1097#4,3:355\n1100#4,3:361\n486#5,4:350\n490#5,2:358\n494#5:364\n486#6:360\n766#7:365\n857#7,2:366\n33#8,6:368\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n173#1:343\n178#1:354\n173#1:344,6\n178#1:355,3\n178#1:361,3\n178#1:350,4\n178#1:358,2\n178#1:364\n178#1:360\n247#1:365\n247#1:366,2\n248#1:368,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl */
/* loaded from: classes2.dex */
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;

    /* renamed from: a */
    public final Function2 f31410a;

    /* renamed from: b */
    public final SnapshotStateMap f31411b;

    /* renamed from: c */
    public boolean f31412c;

    /* renamed from: d */
    public PlatformTextInputPlugin f31413d;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "T", "", "adapter", "Lkotlin/Function0;", "", "onDispose", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputAdapter;Lkotlin/jvm/functions/Function0;)V", "dispose", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Z", "disposed", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @InternalTextApi
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1#2:342\n*E\n"})
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle */
    /* loaded from: classes2.dex */
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;

        /* renamed from: a */
        public final PlatformTextInputAdapter f31414a;

        /* renamed from: b */
        public final Function0 f31415b;

        /* renamed from: c */
        public boolean f31416c;

        public AdapterHandle(@NotNull T adapter, @NotNull Function0<Boolean> onDispose) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(onDispose, "onDispose");
            this.f31414a = adapter;
            this.f31415b = onDispose;
        }

        public final boolean dispose() {
            if (!this.f31416c) {
                this.f31416c = true;
                return ((Boolean) this.f31415b.invoke()).booleanValue();
            }
            throw new IllegalStateException("AdapterHandle already disposed".toString());
        }

        @NotNull
        public final T getAdapter() {
            return (T) this.f31414a;
        }
    }

    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$a */
    /* loaded from: classes2.dex */
    public final class C3622a implements PlatformTextInput {

        /* renamed from: a */
        public final PlatformTextInputPlugin f31417a;

        /* renamed from: b */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f31418b;

        public C3622a(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin plugin) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            this.f31418b = platformTextInputPluginRegistryImpl;
            this.f31417a = plugin;
        }

        @Override // androidx.compose.p003ui.text.input.PlatformTextInput
        public void releaseInputFocus() {
            if (Intrinsics.areEqual(this.f31418b.f31413d, this.f31417a)) {
                this.f31418b.f31413d = null;
            }
        }

        @Override // androidx.compose.p003ui.text.input.PlatformTextInput
        public void requestInputFocus() {
            this.f31418b.f31413d = this.f31417a;
        }
    }

    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$b */
    /* loaded from: classes2.dex */
    public final class C3623b {

        /* renamed from: a */
        public final PlatformTextInputAdapter f31419a;

        /* renamed from: b */
        public final MutableIntState f31420b;

        /* renamed from: c */
        public final /* synthetic */ PlatformTextInputPluginRegistryImpl f31421c;

        public C3623b(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputAdapter adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f31421c = platformTextInputPluginRegistryImpl;
            this.f31419a = adapter;
            this.f31420b = SnapshotIntStateKt.mutableIntStateOf(0);
        }

        /* renamed from: a */
        public final boolean m59025a() {
            m59020f(m59023c() - 1);
            if (m59023c() >= 0) {
                if (m59023c() == 0) {
                    this.f31421c.f31412c = true;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + m59023c() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }

        /* renamed from: b */
        public final PlatformTextInputAdapter m59024b() {
            return this.f31419a;
        }

        /* renamed from: c */
        public final int m59023c() {
            return this.f31420b.getIntValue();
        }

        /* renamed from: d */
        public final void m59022d() {
            m59020f(m59023c() + 1);
        }

        /* renamed from: e */
        public final boolean m59021e() {
            if (m59023c() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final void m59020f(int i) {
            this.f31420b.setIntValue(i);
        }
    }

    public PlatformTextInputPluginRegistryImpl(@NotNull Function2<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f31410a = factory;
        this.f31411b = SnapshotStateKt.mutableStateMapOf();
    }

    /* renamed from: a */
    public final void m59027a() {
        if (this.f31412c) {
            this.f31412c = false;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f31411b.entrySet()) {
                if (((C3623b) ((Map.Entry) obj).getValue()).m59021e()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                C3623b c3623b = (C3623b) entry.getValue();
                if (Intrinsics.areEqual(this.f31413d, platformTextInputPlugin)) {
                    this.f31413d = null;
                }
                this.f31411b.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(c3623b.m59024b());
            }
        }
    }

    /* renamed from: b */
    public final C3623b m59026b(PlatformTextInputPlugin platformTextInputPlugin) {
        Object invoke = this.f31410a.invoke(platformTextInputPlugin, new C3622a(this, platformTextInputPlugin));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        C3623b c3623b = new C3623b(this, (PlatformTextInputAdapter) invoke);
        this.f31411b.put(platformTextInputPlugin, c3623b);
        return c3623b;
    }

    @Nullable
    public final PlatformTextInputAdapter getFocusedAdapter() {
        C3623b c3623b = (C3623b) this.f31411b.get(this.f31413d);
        if (c3623b != null) {
            return c3623b.m59024b();
        }
        return null;
    }

    @InternalTextApi
    @NotNull
    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(@NotNull PlatformTextInputPlugin<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        C3623b c3623b = (C3623b) this.f31411b.get(plugin);
        if (c3623b == null) {
            c3623b = m59026b(plugin);
        }
        c3623b.m59022d();
        return new AdapterHandle<>(c3623b.m59024b(), new PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(c3623b));
    }

    @Override // androidx.compose.p003ui.text.input.PlatformTextInputPluginRegistry
    @Composable
    @NotNull
    public <T extends PlatformTextInputAdapter> T rememberAdapter(@NotNull PlatformTextInputPlugin<T> plugin, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        composer.startReplaceableGroup(-845039128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845039128, i, -1, "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:167)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(plugin);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = getOrCreateAdapter(plugin);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AdapterHandle adapterHandle = (AdapterHandle) rememberedValue;
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(adapterHandle, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1(adapterHandle, coroutineScope, this), composer, 8);
        T t = (T) adapterHandle.getAdapter();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t;
    }
}
