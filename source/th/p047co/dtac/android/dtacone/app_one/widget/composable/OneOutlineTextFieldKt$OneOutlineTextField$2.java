package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneOutlineTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOutlineTextField.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextFieldKt$OneOutlineTextField$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,187:1\n36#2:188\n456#2,8:213\n464#2,3:227\n456#2,8:249\n464#2,3:263\n456#2,8:286\n464#2,3:300\n467#2,3:304\n36#2:311\n467#2,3:318\n467#2,3:323\n1097#3,6:189\n1097#3,6:312\n154#4:195\n154#4:196\n154#4:231\n154#4:267\n154#4:268\n154#4:269\n154#4:309\n154#4:310\n67#5,5:197\n72#5:230\n67#5,5:270\n72#5:303\n76#5:308\n76#5:327\n78#6,11:202\n78#6,11:238\n78#6,11:275\n91#6:307\n91#6:321\n91#6:326\n4144#7,6:221\n4144#7,6:257\n4144#7,6:294\n73#8,6:232\n79#8:266\n83#8:322\n*S KotlinDebug\n*F\n+ 1 OneOutlineTextField.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextFieldKt$OneOutlineTextField$2\n*L\n90#1:188\n86#1:213,8\n86#1:227,3\n101#1:249,8\n101#1:263,3\n115#1:286,8\n115#1:300,3\n115#1:304,3\n137#1:311\n101#1:318,3\n86#1:323,3\n90#1:189,6\n137#1:312,6\n98#1:195\n99#1:196\n103#1:231\n105#1:267\n113#1:268\n119#1:269\n131#1:309\n136#1:310\n86#1:197,5\n86#1:230\n115#1:270,5\n115#1:303\n115#1:308\n86#1:327\n86#1:202,11\n101#1:238,11\n115#1:275,11\n115#1:307\n101#1:321\n86#1:326\n86#1:221,6\n101#1:257,6\n115#1:294,6\n101#1:232,6\n101#1:266\n101#1:322\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt$OneOutlineTextField$2 */
/* loaded from: classes7.dex */
public final class OneOutlineTextFieldKt$OneOutlineTextField$2 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ MutableState<FocusState> $focusState$delegate;
    final /* synthetic */ Painter $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ Modifier $iconModifier;
    final /* synthetic */ boolean $isClearable;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneOutlineTextFieldKt$OneOutlineTextField$2(long j, long j2, Painter painter, boolean z, String str, Function1<? super String, Unit> function1, int i, Modifier modifier, long j3, String str2, MutableState<FocusState> mutableState) {
        super(3);
        this.$backgroundColor = j;
        this.$borderColor = j2;
        this.$icon = painter;
        this.$isClearable = z;
        this.$value = str;
        this.$onValueChange = function1;
        this.$$dirty = i;
        this.$iconModifier = modifier;
        this.$iconColor = j3;
        this.$placeholder = str2;
        this.$focusState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0389, code lost:
        r1 = th.p047co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt.m19823a(r31);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r41v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt$OneOutlineTextField$2.invoke(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }
}
