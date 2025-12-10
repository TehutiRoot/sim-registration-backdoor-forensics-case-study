package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.unit.IntRect;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28850d2 = {"", "Landroidx/compose/ui/tooling/ViewInfo;", "Lkotlin/Function1;", "", "filter", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "indentation", "", "toDebugString", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;", "ui-tooling_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfoUtil.kt\nandroidx/compose/ui/tooling/ViewInfoUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1360#2:79\n1446#2,2:80\n1360#2:82\n1446#2,5:83\n1448#2,3:88\n1855#2,2:91\n*S KotlinDebug\n*F\n+ 1 ViewInfoUtil.kt\nandroidx/compose/ui/tooling/ViewInfoUtilKt\n*L\n26#1:79\n26#1:80,2\n28#1:82\n28#1:83,5\n26#1:88,3\n66#1:91,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ViewInfoUtilKt */
/* loaded from: classes2.dex */
public final class ViewInfoUtilKt {
    /* renamed from: a */
    public static final List m58932a(List list, Function1 function1) {
        List listOf;
        List<ViewInfo> listOf2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewInfo viewInfo = (ViewInfo) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : m58932a(viewInfo.getChildren(), function1)) {
                if (viewInfo2.getLocation() == null) {
                    listOf2 = viewInfo2.getChildren();
                } else {
                    listOf2 = AbstractC10108ds.listOf(viewInfo2);
                }
                AbstractC10410hs.addAll(arrayList2, listOf2);
            }
            if (((Boolean) function1.invoke(viewInfo)).booleanValue()) {
                listOf = AbstractC10108ds.listOf(new ViewInfo(viewInfo.getFileName(), viewInfo.getLineNumber(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList2, viewInfo.getLayoutInfo()));
            } else {
                listOf = AbstractC10108ds.listOf(new ViewInfo("<root>", -1, IntRect.Companion.getZero(), null, arrayList2, null));
            }
            AbstractC10410hs.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    @NotNull
    public static final String toDebugString(@NotNull List<ViewInfo> list, int i, @NotNull Function1<? super ViewInfo, Boolean> filter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        String repeat = AbstractC20204hN1.repeat(".", i);
        StringBuilder sb = new StringBuilder();
        for (ViewInfo viewInfo : CollectionsKt___CollectionsKt.sortedWith(m58932a(list, filter), AbstractC16857uu.compareBy(ViewInfoUtilKt$toDebugString$2.INSTANCE, ViewInfoUtilKt$toDebugString$3.INSTANCE, ViewInfoUtilKt$toDebugString$4.INSTANCE))) {
            if (viewInfo.getLocation() != null) {
                sb.append(repeat + '|' + viewInfo.getFileName() + ':' + viewInfo.getLineNumber());
                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            } else {
                sb.append(repeat + "|<root>");
                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            }
            String obj = StringsKt__StringsKt.trim(toDebugString(viewInfo.getChildren(), i + 1, filter)).toString();
            if (obj.length() > 0) {
                sb.append(obj);
                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    public static /* synthetic */ String toDebugString$default(List list, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            function1 = ViewInfoUtilKt$toDebugString$1.INSTANCE;
        }
        return toDebugString(list, i, function1);
    }
}
