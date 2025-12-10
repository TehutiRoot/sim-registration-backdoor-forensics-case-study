package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JU\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0017¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,737:1\n25#2:738\n25#2:745\n36#2:753\n1097#3,6:739\n1097#3,6:746\n1097#3,6:754\n76#4:752\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n249#1:738\n253#1:745\n258#1:753\n249#1:739,6\n253#1:746,6\n258#1:754,6\n254#1:752\n*E\n"})
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {

    /* renamed from: androidx.compose.material.ExposedDropdownMenuBoxScope$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:102:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0128  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m60900a(androidx.compose.material.ExposedDropdownMenuBoxScope r24, boolean r25, kotlin.jvm.functions.Function0 r26, androidx.compose.p003ui.Modifier r27, androidx.compose.foundation.ScrollState r28, kotlin.jvm.functions.Function3 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
            /*
                Method dump skipped, instructions count: 533
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.CC.m60900a(androidx.compose.material.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
        }

        /* renamed from: c */
        public static /* synthetic */ Modifier m60898c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        public static void ExposedDropdownMenu(@NotNull ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, @NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, @Nullable ScrollState scrollState, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            CC.m60900a(exposedDropdownMenuBoxScope, z, onDismissRequest, modifier, scrollState, content, composer, i, i2);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z, @NotNull Function0<Unit> function0, @Nullable Modifier modifier, @Nullable ScrollState scrollState, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i, int i2);

    @NotNull
    Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z);
}
