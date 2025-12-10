package androidx.compose.p003ui.viewinterop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.viewbinding.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aÃ\u0001\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m29142d2 = {"Landroidx/viewbinding/ViewBinding;", "T", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "update", "AndroidViewBinding", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "binding", OperatorName.CURVE_TO, "(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "viewGroup", "Landroidx/fragment/app/FragmentContainerView;", "action", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "ui-viewbinding_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,230:1\n76#2:231\n76#2:239\n36#3:232\n36#3:241\n36#3:248\n1097#4,6:233\n1097#4,6:242\n1097#4,6:249\n1#5:240\n55#6,4:255\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n158#1:231\n171#1:239\n162#1:232\n183#1:241\n205#1:248\n162#1:233,6\n183#1:242,6\n205#1:249,6\n223#1:255,4\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(@NotNull Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> factory, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer startRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                function1 = AndroidViewBindingKt$AndroidViewBinding$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:75)");
            }
            AndroidViewBinding(factory, modifier, null, null, function1, startRestartGroup, (i3 & 14) | 384 | (i3 & 112) | ((i3 << 6) & 57344), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function1<? super T, Unit> function12 = function1;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AndroidViewBindingKt$AndroidViewBinding$2(factory, modifier2, function12, i, i2));
    }

    /* renamed from: a */
    public static final void m58820a(ViewGroup viewGroup, Function1 function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                m58820a((ViewGroup) childAt, function1);
            }
        }
    }

    /* renamed from: b */
    public static final ViewBinding m58819b(View view) {
        Object tag = view.getTag(R.id.binding_reference);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (ViewBinding) tag;
    }

    /* renamed from: c */
    public static final void m58818c(View view, ViewBinding viewBinding) {
        view.setTag(R.id.binding_reference, viewBinding);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:1|(1:3)(2:103|(3:105|(1:107)(1:109)|108)(1:110))|4|(1:6)(2:96|(37:98|(1:100)(1:102)|101|8|(1:10)(2:89|(34:91|(1:93)(1:95)|94|12|(1:14)(2:82|(31:84|(1:86)(1:88)|87|16|(1:18)(2:75|(7:77|(1:79)(1:81)|80|20|(16:(1:32)(1:74)|33|(1:35)(1:73)|(1:37)(1:72)|(1:39)(1:71)|40|(1:42)|43|(4:65|66|67|68)|47|(1:49)(3:59|(1:64)|63)|50|(1:58)|54|(1:56)|57)(1:24)|25|(1:30)(2:27|28)))|19|20|(1:22)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(1:45)|65|66|67|68|47|(0)(0)|50|(1:52)|58|54|(0)|57|25|(0)(0)))|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|50|(0)|58|54|(0)|57|25|(0)(0)))|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|50|(0)|58|54|(0)|57|25|(0)(0)))|7|8|(0)(0)|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|50|(0)|58|54|(0)|57|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fc, code lost:
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155  */
    /* JADX WARN: Type inference failed for: r7v9 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r16, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r18, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r19, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}