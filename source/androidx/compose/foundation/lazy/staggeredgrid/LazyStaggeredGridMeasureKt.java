package androidx.compose.foundation.lazy.staggeredgrid;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u007f\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001f\u001a\u00020\u0015*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u0003*\u00020\u00192\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020**\u00020\u001b2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u0010/\u001a\u00020\u0004*\u00020\u001b2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u001d\u00102\u001a\u00020\u0004*\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u0004H\u0000¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0004*\u00020\u001bH\u0002¢\u0006\u0004\b4\u00105\u001a#\u00108\u001a\u00020**\u00020\u00192\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010<\u001a\u00020\u0004*\u00020\u00192\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-dSVRQoE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "delta", "", "i", "([II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "indexRange", "e", "([IJ)I", "minBound", "indexOfMinValue", "([II)I", "d", "([I)I", "indices", "itemCount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", "item", "lane", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1158:1\n50#1,9:1169\n72#1,4:1178\n912#1:1195\n913#1,3:1200\n72#1,4:1203\n72#1,4:1207\n72#1,4:1211\n912#1:1222\n913#1,3:1227\n72#1,4:1238\n72#1,4:1242\n912#1:1263\n913#1,3:1268\n72#1,4:1273\n72#1,4:1279\n72#1,4:1283\n912#1:1304\n913#1,3:1309\n72#1,4:1312\n72#1,4:1316\n972#1,4:1320\n72#1,4:1324\n72#1,4:1328\n885#1,3:1332\n888#1:1339\n889#1,9:1342\n899#1:1352\n885#1,3:1353\n888#1:1360\n889#1,9:1363\n899#1:1373\n72#1,4:1374\n60#1:1382\n945#1,11:1386\n912#1:1397\n913#1,3:1402\n912#1:1415\n913#1,3:1420\n495#2,4:1159\n500#2:1168\n129#3,5:1163\n234#4:1182\n231#4:1183\n231#4:1189\n234#4:1215\n231#4:1216\n231#4:1232\n234#4:1250\n231#4:1251\n231#4:1257\n234#4:1291\n231#4:1292\n231#4:1298\n908#5:1184\n907#5:1185\n906#5:1187\n908#5:1190\n907#5:1191\n906#5:1193\n906#5:1196\n907#5:1198\n908#5:1217\n907#5:1218\n906#5:1220\n906#5:1223\n907#5:1225\n906#5:1230\n908#5:1233\n907#5:1234\n906#5:1236\n908#5:1252\n907#5:1253\n906#5:1255\n908#5:1258\n907#5:1259\n906#5:1261\n906#5:1264\n907#5:1266\n906#5:1271\n908#5:1293\n907#5:1294\n906#5:1296\n908#5:1299\n907#5:1300\n906#5:1302\n906#5:1305\n907#5:1307\n906#5:1398\n907#5:1400\n906#5:1411\n907#5:1413\n906#5:1416\n907#5:1418\n62#6:1186\n55#6:1188\n62#6:1192\n55#6:1194\n55#6:1197\n62#6:1199\n62#6:1219\n55#6:1221\n55#6:1224\n62#6:1226\n55#6:1231\n62#6:1235\n55#6:1237\n62#6:1254\n55#6:1256\n62#6:1260\n55#6:1262\n55#6:1265\n62#6:1267\n55#6:1272\n62#6:1295\n55#6:1297\n62#6:1301\n55#6:1303\n55#6:1306\n62#6:1308\n55#6:1399\n62#6:1401\n55#6:1412\n62#6:1414\n55#6:1417\n62#6:1419\n12774#7,2:1246\n12541#7,2:1248\n12774#7,2:1277\n12583#7,2:1287\n12774#7,2:1289\n12583#7,2:1340\n12583#7,2:1361\n12774#7,2:1378\n12583#7,2:1380\n12744#7,2:1384\n33#8,4:1335\n38#8:1351\n33#8,4:1356\n38#8:1372\n33#8,6:1405\n1#9:1383\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n244#1:1169,9\n302#1:1178,4\n347#1:1195\n347#1:1200,3\n353#1:1203,4\n395#1:1207,4\n433#1:1211,4\n461#1:1222\n461#1:1227,3\n478#1:1238,4\n481#1:1242,4\n514#1:1263\n514#1:1268,3\n532#1:1273,4\n554#1:1279,4\n557#1:1283,4\n621#1:1304\n621#1:1309,3\n659#1:1312,4\n662#1:1316,4\n679#1:1320,4\n683#1:1324,4\n705#1:1328,4\n735#1:1332,3\n735#1:1339\n735#1:1342,9\n735#1:1352\n764#1:1353,3\n764#1:1360\n764#1:1363,9\n764#1:1373\n794#1:1374,4\n244#1:1382\n850#1:1386,11\n873#1:1397\n873#1:1402,3\n925#1:1415\n925#1:1420,3\n111#1:1159,4\n111#1:1168\n111#1:1163,5\n339#1:1182\n339#1:1183\n346#1:1189\n459#1:1215\n459#1:1216\n471#1:1232\n505#1:1250\n505#1:1251\n509#1:1257\n613#1:1291\n613#1:1292\n620#1:1298\n339#1:1184\n339#1:1185\n339#1:1187\n346#1:1190\n346#1:1191\n346#1:1193\n347#1:1196\n347#1:1198\n459#1:1217\n459#1:1218\n459#1:1220\n461#1:1223\n461#1:1225\n467#1:1230\n471#1:1233\n471#1:1234\n471#1:1236\n505#1:1252\n505#1:1253\n505#1:1255\n509#1:1258\n509#1:1259\n509#1:1261\n514#1:1264\n514#1:1266\n524#1:1271\n613#1:1293\n613#1:1294\n613#1:1296\n620#1:1299\n620#1:1300\n620#1:1302\n621#1:1305\n621#1:1307\n873#1:1398\n873#1:1400\n912#1:1411\n912#1:1413\n925#1:1416\n925#1:1418\n339#1:1186\n339#1:1188\n346#1:1192\n346#1:1194\n347#1:1197\n347#1:1199\n459#1:1219\n459#1:1221\n461#1:1224\n461#1:1226\n467#1:1231\n471#1:1235\n471#1:1237\n505#1:1254\n505#1:1256\n509#1:1260\n509#1:1262\n514#1:1265\n514#1:1267\n524#1:1272\n613#1:1295\n613#1:1297\n620#1:1301\n620#1:1303\n621#1:1306\n621#1:1308\n873#1:1399\n873#1:1401\n912#1:1412\n912#1:1414\n925#1:1417\n925#1:1419\n490#1:1246,2\n493#1:1248,2\n550#1:1277,2\n564#1:1287,2\n572#1:1289,2\n748#1:1340,2\n780#1:1361,2\n813#1:1378,2\n814#1:1380,2\n848#1:1384,2\n735#1:1335,4\n735#1:1351\n764#1:1356,4\n764#1:1372\n887#1:1405,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    /* renamed from: a */
    public static final List m61157a(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque[] arrayDequeArr, int[] iArr, int i) {
        int i2;
        int i3 = 0;
        for (ArrayDeque arrayDeque : arrayDequeArr) {
            i3 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i3);
        while (true) {
            for (ArrayDeque arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i4 = -1;
                    int i5 = Integer.MAX_VALUE;
                    for (int i6 = 0; i6 < length; i6++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i6].firstOrNull();
                        if (lazyStaggeredGridMeasuredItem != null) {
                            i2 = lazyStaggeredGridMeasuredItem.getIndex();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i5 > i2) {
                            i4 = i6;
                            i5 = i2;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i4].removeFirst();
                    if (lazyStaggeredGridMeasuredItem2.getLane() == i4) {
                        long m69663constructorimpl = SpanRange.m69663constructorimpl(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan());
                        int m61153e = m61153e(iArr, m69663constructorimpl);
                        int i7 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i4];
                        if (lazyStaggeredGridMeasuredItem2.getPlaceablesCount() != 0) {
                            lazyStaggeredGridMeasuredItem2.position(m61153e, i7, i);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                            int i8 = (int) (m69663constructorimpl & BodyPartID.bodyIdMax);
                            for (int i9 = (int) (m69663constructorimpl >> 32); i9 < i8; i9++) {
                                iArr[i9] = lazyStaggeredGridMeasuredItem2.getSizeWithSpacings() + m61153e;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static final void m61156b(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                }
                iArr[length] = m61155c(lazyStaggeredGridMeasureContext, iArr[length], length);
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 >= 0) {
                length = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static final int m61155c(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* renamed from: d */
    public static final int m61154d(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static final int m61153e(int[] iArr, long j) {
        int i = (int) (j & BodyPartID.bodyIdMax);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d9, code lost:
        r2 = indexOfMinValue$default(r8, 0, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
        if (r2 == m61154d(r28)) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e6, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e7, code lost:
        r4 = r28[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ea, code lost:
        if (r4 != (-1)) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ec, code lost:
        r9 = r37;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f0, code lost:
        r9 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f2, code lost:
        r4 = m61155c(r9, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f6, code lost:
        if (r4 >= 0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f8, code lost:
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fa, code lost:
        if (r0 != false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0300, code lost:
        if (m61150h(r13, r9, r8, r2) == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0303, code lost:
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0306, code lost:
        if (r41 == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0308, code lost:
        r37.getLaneInfo().reset();
        r0 = r13.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0313, code lost:
        if (r3 >= r0) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0315, code lost:
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031b, code lost:
        r0 = r8.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
        if (r4 >= r0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0321, code lost:
        r3[r4] = r8[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032f, code lost:
        return m61152f(r9, r27, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0330, code lost:
        r23 = r3;
        r27 = r10;
        r28 = r11;
        r40 = r14;
        r24 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033c, code lost:
        r38 = r0;
        r5 = r27;
        r13 = r28;
        r40 = r14;
        r24 = r15;
        r14 = r9.m69656getSpanRangelOCCd4c(r37.getItemProvider(), r4, r2);
        r0 = r37.getLaneInfo();
        r23 = r3;
        r3 = (int) (r14 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax);
        r27 = r10;
        r28 = r11;
        r2 = (int) (r14 >> 32);
        r10 = r3 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0368, code lost:
        if (r10 == 1) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036a, code lost:
        r11 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x036c, code lost:
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x036d, code lost:
        r0.setLane(r4, r11);
        r0 = r37.getMeasuredItemProvider().m69661getAndMeasurejy6DScQ(r4, r14);
        r11 = m61153e(r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x037d, code lost:
        if (r10 == 1) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x037f, code lost:
        r10 = r37.getLaneInfo().getGaps(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0388, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0389, code lost:
        r14 = r2;
        r2 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x038c, code lost:
        if (r14 >= r3) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0390, code lost:
        if (r8[r14] == r11) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0392, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0393, code lost:
        r7[r14].addFirst(r0);
        r13[r14] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039a, code lost:
        if (r10 != null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039c, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x039e, code lost:
        r15 = r10[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03a0, code lost:
        r8[r14] = (r11 + r0.getSizeWithSpacings()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0542, code lost:
        if (r13[r6] > r4) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x062a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m61152f(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r37, int r38, int[] r39, int[] r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m61152f(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    /* renamed from: g */
    public static final boolean m61151g(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m61150h(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m61155c(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (m61155c(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        if (lane == 0 || lane == -1 || lane == -2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final void m61149i(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static final int indexOfMinValue(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
        if (r11 != (-1)) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @org.jetbrains.annotations.NotNull
    /* renamed from: measureStaggeredGrid-dSVRQoE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m69658measureStaggeredGriddSVRQoE(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r20, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r21, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r22, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r24, long r25, boolean r27, boolean r28, long r29, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.m69658measureStaggeredGriddSVRQoE(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.util.List, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots, long, boolean, boolean, long, int, int, int, int):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }
}
