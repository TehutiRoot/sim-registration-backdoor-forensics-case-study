package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.unit.IntSize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014ø\u0001\u0000\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m28850d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "animation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,862:1\n76#2:863\n36#3:864\n36#3:871\n36#3:878\n50#3:898\n49#3:899\n25#3:906\n456#3,8:924\n464#3,3:938\n467#3,3:943\n1097#4,6:865\n1097#4,6:872\n1097#4,6:879\n1097#4,6:900\n1097#4,6:907\n350#5,7:885\n1855#5,2:941\n33#6,6:892\n78#7,11:913\n91#7:946\n4144#8,6:932\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n693#1:863\n694#1:864\n699#1:871\n700#1:878\n787#1:898\n787#1:899\n798#1:906\n789#1:924,8\n789#1:938,3\n789#1:943,3\n694#1:865,6\n699#1:872,6\n700#1:879,6\n787#1:900,6\n798#1:907,6\n729#1:885,7\n792#1:941,2\n739#1:892,6\n789#1:913,11\n789#1:946\n789#1:932,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:136:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(S r19, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Alignment r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final SizeTransform SizeTransform(boolean z, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new LJ1(z, sizeAnimationSpec);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z, function2);
    }

    @NotNull
    public static final ContentTransform togetherWith(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0250 A[LOOP:2: B:322:0x024e->B:323:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition<S> r22, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r24, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Alignment r25, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }
}
