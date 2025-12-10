package coil.compose;

import androidx.compose.runtime.Composer;
import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "", "Lcoil/compose/SubcomposeAsyncImageScope;", "invoke", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSubcomposeAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt$contentOf$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
/* loaded from: classes3.dex */
public final class SubcomposeAsyncImageKt$contentOf$1 extends Lambda implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> $error;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> $loading;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeAsyncImageKt$contentOf$1(Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43) {
        super(3);
        this.$loading = function4;
        this.$success = function42;
        this.$error = function43;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
        invoke(subcomposeAsyncImageScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull coil.compose.SubcomposeAsyncImageScope r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
        /*
            r11 = this;
            r1 = r14 & 14
            if (r1 != 0) goto Lf
            boolean r1 = r13.changed(r12)
            if (r1 == 0) goto Lc
            r1 = 4
            goto Ld
        Lc:
            r1 = 2
        Ld:
            r1 = r1 | r14
            goto L10
        Lf:
            r1 = r14
        L10:
            r2 = r1 & 91
            r3 = 18
            if (r2 != r3) goto L22
            boolean r2 = r13.getSkipping()
            if (r2 != 0) goto L1d
            goto L22
        L1d:
            r13.skipToGroupEnd()
            goto Ld1
        L22:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L31
            r2 = -1
            java.lang.String r3 = "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:227)"
            r4 = -1302781228(0xffffffffb25922d4, float:-1.2638981E-8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L31:
            coil.compose.AsyncImagePainter r2 = r12.getPainter()
            coil.compose.AsyncImagePainter$State r2 = r2.getState()
            boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.State.Loading
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L5d
            r3 = -418307549(0xffffffffe7112223, float:-6.8537285E23)
            r13.startReplaceableGroup(r3)
            kotlin.jvm.functions.Function4<coil.compose.SubcomposeAsyncImageScope, coil.compose.AsyncImagePainter$State$Loading, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r3 = r11.$loading
            if (r3 == 0) goto L57
            r5 = r1 & 14
            r5 = r5 | 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.invoke(r12, r2, r13, r5)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L58
        L57:
            r4 = 1
        L58:
            r13.endReplaceableGroup()
        L5b:
            r5 = r4
            goto Lb6
        L5d:
            boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.State.Success
            if (r3 == 0) goto L7e
            r3 = -418307455(0xffffffffe7112281, float:-6.853796E23)
            r13.startReplaceableGroup(r3)
            kotlin.jvm.functions.Function4<coil.compose.SubcomposeAsyncImageScope, coil.compose.AsyncImagePainter$State$Success, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r3 = r11.$success
            if (r3 == 0) goto L79
            r5 = r1 & 14
            r5 = r5 | 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.invoke(r12, r2, r13, r5)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L7a
        L79:
            r4 = 1
        L7a:
            r13.endReplaceableGroup()
            goto L5b
        L7e:
            boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.State.Error
            if (r3 == 0) goto L9f
            r3 = -418307363(0xffffffffe71122dd, float:-6.8538625E23)
            r13.startReplaceableGroup(r3)
            kotlin.jvm.functions.Function4<coil.compose.SubcomposeAsyncImageScope, coil.compose.AsyncImagePainter$State$Error, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r3 = r11.$error
            if (r3 == 0) goto L9a
            r5 = r1 & 14
            r5 = r5 | 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.invoke(r12, r2, r13, r5)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L9b
        L9a:
            r4 = 1
        L9b:
            r13.endReplaceableGroup()
            goto L5b
        L9f:
            boolean r2 = r2 instanceof coil.compose.AsyncImagePainter.State.Empty
            if (r2 == 0) goto Lad
            r2 = -418307275(0xffffffffe7112335, float:-6.853926E23)
            r13.startReplaceableGroup(r2)
            r13.endReplaceableGroup()
            goto Lb6
        Lad:
            r2 = -418307215(0xffffffffe7112371, float:-6.853969E23)
            r13.startReplaceableGroup(r2)
            r13.endReplaceableGroup()
        Lb6:
            if (r5 == 0) goto Lc8
            r9 = r1 & 14
            r10 = 127(0x7f, float:1.78E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r12
            r8 = r13
            coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Lc8:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Ld1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt$contentOf$1.invoke(coil.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, int):void");
    }
}
