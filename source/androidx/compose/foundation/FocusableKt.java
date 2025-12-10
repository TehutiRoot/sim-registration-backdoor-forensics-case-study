package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusModifierKt;
import androidx.compose.p003ui.focus.FocusPropertiesKt;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectableModifier;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u000e\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "focusGroup", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "focusableInNonTouchMode", "Landroidx/compose/ui/platform/InspectableModifier;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroupInspectorInfo", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,372:1\n146#2:373\n135#2:374\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n125#1:373\n113#1:374\n*E\n"})
/* loaded from: classes.dex */
public final class FocusableKt {

    /* renamed from: a */
    public static final InspectableModifier f12843a;

    /* renamed from: b */
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f12844b;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new FocusableKt$special$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        f12843a = new InspectableModifier(noInspectorInfo);
        f12844b = new ModifierNodeElement<T30>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object obj) {
                return this == obj;
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("focusableInNonTouchMode");
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void update(@NotNull T30 node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            @NotNull
            public T30 create() {
                return new T30();
            }
        };
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier focusGroup(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(f12843a), FocusableKt$focusGroup$1.INSTANCE));
    }

    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource) {
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (z) {
            modifier2 = FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource));
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return InspectableValueKt.inspectableWrapper(modifier, new FocusableKt$focusableInNonTouchMode$1(z, mutableInteractionSource), focusable(Modifier.Companion.then(f12844b), z, mutableInteractionSource));
    }
}
