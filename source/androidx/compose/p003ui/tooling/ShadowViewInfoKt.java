package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, m28850d2 = {"stitchTrees", "", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", "ui-tooling_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nShadowViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.kt\nandroidx/compose/ui/tooling/ShadowViewInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,120:1\n1549#2:121\n1620#2,3:122\n1373#2:125\n1461#2,5:126\n1549#2:131\n1620#2,3:132\n766#2:135\n857#2,2:136\n1477#2:138\n1502#2,3:139\n1505#2,3:149\n1855#2,2:152\n1549#2:154\n1620#2,3:155\n361#3,7:142\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.kt\nandroidx/compose/ui/tooling/ShadowViewInfoKt\n*L\n80#1:121\n80#1:122,3\n85#1:125\n85#1:126,5\n86#1:131\n86#1:132,3\n87#1:135\n87#1:136,2\n88#1:138\n88#1:139,3\n88#1:149,3\n94#1:152,2\n115#1:154\n115#1:155,3\n88#1:142,7\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ShadowViewInfoKt */
/* loaded from: classes2.dex */
public final class ShadowViewInfoKt {
    @NotNull
    public static final List<ViewInfo> stitchTrees(@NotNull List<ViewInfo> allViewInfoRoots) {
        Intrinsics.checkNotNullParameter(allViewInfoRoots, "allViewInfoRoots");
        if (allViewInfoRoots.size() < 2) {
            return allViewInfoRoots;
        }
        List<ViewInfo> list = allViewInfoRoots;
        ArrayList<ShadowViewInfo> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (ViewInfo viewInfo : list) {
            arrayList.add(new ShadowViewInfo(viewInfo));
        }
        ArrayList<ShadowViewInfo> arrayList2 = new ArrayList();
        for (ShadowViewInfo shadowViewInfo : arrayList) {
            AbstractC10410hs.addAll(arrayList2, shadowViewInfo.m58937b());
        }
        ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList2, 10));
        for (ShadowViewInfo shadowViewInfo2 : arrayList2) {
            arrayList3.add(TuplesKt.m28844to(shadowViewInfo2.m58935d(), shadowViewInfo2));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Pair) obj).getFirst() != null) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            LayoutInfo layoutInfo = (LayoutInfo) ((Pair) obj2).getFirst();
            Object obj3 = linkedHashMap.get(layoutInfo);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(layoutInfo, obj3);
            }
            ((List) obj3).add(obj2);
        }
        LinkedHashSet<ShadowViewInfo> linkedHashSet = new LinkedHashSet(arrayList);
        for (ShadowViewInfo shadowViewInfo3 : arrayList) {
            ShadowViewInfo shadowViewInfo4 = (ShadowViewInfo) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.flatMapIterable(shadowViewInfo3.m58937b(), new ShadowViewInfoKt$stitchTrees$1$1(linkedHashMap)), new ShadowViewInfoKt$stitchTrees$1$2(shadowViewInfo3)), ShadowViewInfoKt$stitchTrees$1$3.INSTANCE));
            if (shadowViewInfo4 != null) {
                shadowViewInfo3.m58934e(shadowViewInfo4);
                linkedHashSet.remove(shadowViewInfo3);
            }
        }
        ArrayList arrayList5 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(linkedHashSet, 10));
        for (ShadowViewInfo shadowViewInfo5 : linkedHashSet) {
            arrayList5.add(shadowViewInfo5.m58933f());
        }
        return arrayList5;
    }
}
