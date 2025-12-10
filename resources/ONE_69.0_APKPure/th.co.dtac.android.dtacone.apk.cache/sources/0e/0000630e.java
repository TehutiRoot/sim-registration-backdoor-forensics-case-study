package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 */
/* loaded from: classes2.dex */
public final class C3538x93be146e extends Lambda implements Function1<LayoutNode, Boolean> {
    public static final C3538x93be146e INSTANCE = new C3538x93be146e();

    public C3538x93be146e() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r3.contains(androidx.compose.p003ui.semantics.SemanticsActions.INSTANCE.getSetText()) != false) goto L7;
     */
    @Override // kotlin.jvm.functions.Function1
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.node.LayoutNode r3) {
        /*
            r2 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getCollapsedSemantics$ui_release()
            if (r3 == 0) goto L1f
            boolean r0 = r3.isMergingSemanticsOfDescendants()
            r1 = 1
            if (r0 != r1) goto L1f
            androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.p003ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getSetText()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.platform.C3538x93be146e.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
    }
}