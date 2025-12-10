package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.tooling.data.Group;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "group", "Landroidx/compose/ui/tooling/data/Group;", "invoke", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$findDesignInfoProviders$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,675:1\n1747#2,3:676\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$findDesignInfoProviders$1$1\n*L\n338#1:676,3\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1 */
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$findDesignInfoProviders$1$1 extends Lambda implements Function1<Group, Boolean> {
    final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$findDesignInfoProviders$1$1(ComposeViewAdapter composeViewAdapter) {
        super(1);
        this.this$0 = composeViewAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 == false) goto L9;
     */
    @Override // kotlin.jvm.functions.Function1
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.tooling.data.Group r5) {
        /*
            r4 = this;
            java.lang.String r0 = "group"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "remember"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L19
            androidx.compose.ui.tooling.ComposeViewAdapter r0 = r4.this$0
            boolean r0 = androidx.compose.p003ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r5)
            if (r0 != 0) goto L4f
        L19:
            java.util.Collection r5 = r5.getChildren()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            androidx.compose.ui.tooling.ComposeViewAdapter r0 = r4.this$0
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L2f
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2f
            goto L51
        L2f:
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r5.next()
            androidx.compose.ui.tooling.data.Group r2 = (androidx.compose.p003ui.tooling.data.Group) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r3 == 0) goto L33
            boolean r2 = androidx.compose.p003ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r2)
            if (r2 == 0) goto L33
        L4f:
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1.invoke(androidx.compose.ui.tooling.data.Group):java.lang.Boolean");
    }
}
