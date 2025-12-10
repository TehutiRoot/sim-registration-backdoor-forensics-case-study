package th.p047co.dtac.android.dtacone.view.appOne.eSign.compose;

import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nESignTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ESignTopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/compose/ESignTopAppBarKt$ESignTopAppBar$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n36#2:84\n1097#3,6:85\n*S KotlinDebug\n*F\n+ 1 ESignTopAppBar.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/compose/ESignTopAppBarKt$ESignTopAppBar$2\n*L\n47#1:84\n47#1:85,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.compose.ESignTopAppBarKt$ESignTopAppBar$2 */
/* loaded from: classes10.dex */
public final class ESignTopAppBarKt$ESignTopAppBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $currentRoute;
    final /* synthetic */ Function0<Unit> $onBackPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESignTopAppBarKt$ESignTopAppBar$2(String str, Function0<Unit> function0, int i) {
        super(2);
        this.$currentRoute = str;
        this.$onBackPressed = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288586168, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.compose.ESignTopAppBar.<anonymous> (ESignTopAppBar.kt:43)");
        }
        if (!Intrinsics.areEqual(this.$currentRoute, OneESignScreen.ESign.Success.ROUTE)) {
            Function0<Unit> function0 = this.$onBackPressed;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(function0);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ESignTopAppBarKt$ESignTopAppBar$2$1$1(function0);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconButtonKt.IconButton(rememberedValue, null, false, null, null, ComposableSingletons$ESignTopAppBarKt.INSTANCE.m75165getLambda1$app_prodRelease(), composer, ProfileVerifier.CompilationStatus.f36619xf2722a21, 30);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}