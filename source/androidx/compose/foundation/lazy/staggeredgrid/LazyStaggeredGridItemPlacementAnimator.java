package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00010%j\b\u0012\u0004\u0012\u00020\u0001`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001c\u00104\u001a\u0004\u0018\u000102*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u00103R\u0018\u00106\u001a\u00020\r*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00105¨\u00067"}, m28850d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "<init>", "()V", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "itemProvider", "", "isVertical", "laneCount", "", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;ZI)V", "reset", "item", "mainAxisOffset", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;I)V", "d", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)V", "", "Ltg0;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "keyToItemInfoMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "e", "Ljava/util/List;", "movingInFromStartBound", OperatorName.FILL_NON_ZERO, "movingInFromEndBound", OperatorName.NON_STROKING_GRAY, "movingAwayToStartBound", OperatorName.CLOSE_PATH, "movingAwayToEndBound", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "node", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Z", "hasAnimations", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n268#1,2:294\n270#1,2:297\n268#1,2:334\n270#1,2:338\n268#1,2:340\n270#1,2:343\n268#1,4:345\n101#2,2:280\n33#2,6:282\n103#2:288\n33#2,4:289\n38#2:299\n33#2,6:302\n33#2,6:310\n33#2,6:320\n33#2,6:328\n1#3:293\n86#4:296\n79#4:336\n86#4:337\n79#4:342\n1011#5,2:300\n1002#5,2:308\n1855#5,2:316\n1011#5,2:318\n1002#5,2:326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n110#1:294,2\n110#1:297,2\n237#1:334,2\n237#1:338,2\n245#1:340,2\n245#1:343,2\n261#1:345,4\n63#1:280,2\n63#1:282,6\n63#1:288\n86#1:289,4\n86#1:299\n129#1:302,6\n139#1:310,6\n183#1:320,6\n196#1:328,6\n112#1:296\n239#1:336\n240#1:337\n251#1:342\n128#1:300,2\n138#1:308,2\n148#1:316,2\n182#1:318,2\n195#1:326,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemPlacementAnimator {

    /* renamed from: c */
    public int f13708c;

    /* renamed from: a */
    public final Map f13706a = new LinkedHashMap();

    /* renamed from: b */
    public LazyLayoutKeyIndexMap f13707b = LazyLayoutKeyIndexMap.Empty;

    /* renamed from: d */
    public final LinkedHashSet f13709d = new LinkedHashSet();

    /* renamed from: e */
    public final List f13710e = new ArrayList();

    /* renamed from: f */
    public final List f13711f = new ArrayList();

    /* renamed from: g */
    public final List f13712g = new ArrayList();

    /* renamed from: h */
    public final List f13713h = new ArrayList();

    public static final /* synthetic */ LazyLayoutKeyIndexMap access$getKeyIndexMap$p(LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator) {
        return lazyStaggeredGridItemPlacementAnimator.f13707b;
    }

    /* renamed from: a */
    public final boolean m61168a(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (m61167b(lazyStaggeredGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final LazyLayoutAnimateItemModifierNode m61167b(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final void m61166c(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i) {
        long m73772copyiSbpLlY$default;
        long mo69650getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo69650getOffsetnOccac();
        if (lazyStaggeredGridMeasuredItem.isVertical()) {
            m73772copyiSbpLlY$default = IntOffset.m73772copyiSbpLlY$default(mo69650getOffsetnOccac, 0, i, 1, null);
        } else {
            m73772copyiSbpLlY$default = IntOffset.m73772copyiSbpLlY$default(mo69650getOffsetnOccac, i, 0, 2, null);
        }
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimateItemModifierNode m61167b = m61167b(lazyStaggeredGridMeasuredItem.getParentData(i2));
            if (m61167b != null) {
                long mo69650getOffsetnOccac2 = lazyStaggeredGridMeasuredItem.mo69650getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69650getOffsetnOccac2) - IntOffset.m73776getXimpl(mo69650getOffsetnOccac), IntOffset.m73777getYimpl(mo69650getOffsetnOccac2) - IntOffset.m73777getYimpl(mo69650getOffsetnOccac));
                m61167b.m69636setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m73772copyiSbpLlY$default) + IntOffset.m73776getXimpl(IntOffset), IntOffset.m73777getYimpl(m73772copyiSbpLlY$default) + IntOffset.m73777getYimpl(IntOffset)));
            }
        }
    }

    /* renamed from: d */
    public final void m61165d(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode m61167b = m61167b(lazyStaggeredGridMeasuredItem.getParentData(i));
            if (m61167b != null) {
                long mo69650getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo69650getOffsetnOccac();
                long m69635getRawOffsetnOccac = m61167b.m69635getRawOffsetnOccac();
                if (!IntOffset.m73775equalsimpl0(m69635getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m69637getNotInitializednOccac()) && !IntOffset.m73775equalsimpl0(m69635getRawOffsetnOccac, mo69650getOffsetnOccac)) {
                    m61167b.m69633animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(mo69650getOffsetnOccac) - IntOffset.m73776getXimpl(m69635getRawOffsetnOccac), IntOffset.m73777getYimpl(mo69650getOffsetnOccac) - IntOffset.m73777getYimpl(m69635getRawOffsetnOccac)));
                }
                m61167b.m69636setRawOffsetgyyYBs(mo69650getOffsetnOccac);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x003a, code lost:
        r5 = r22.f13708c;
        r7 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) kotlin.collections.CollectionsKt___CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0042, code lost:
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0044, code lost:
        r7 = r7.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0049, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x004a, code lost:
        r22.f13708c = r7;
        r7 = r22.f13707b;
        r22.f13707b = r27.getKeyIndexMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0054, code lost:
        if (r28 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0056, code lost:
        r8 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0059, code lost:
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x005b, code lost:
        if (r28 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x005d, code lost:
        r9 = androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0062, code lost:
        r9 = androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(r23, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0066, code lost:
        r22.f13709d.addAll(r22.f13706a.keySet());
        r1 = r26.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0078, code lost:
        if (r11 >= r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x007a, code lost:
        r13 = r2.get(r11);
        r22.f13709d.remove(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x008d, code lost:
        if (m61168a(r13) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x008f, code lost:
        r14 = (p000.C22311tg0) r22.f13706a.get(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x009b, code lost:
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x009d, code lost:
        r24 = r1;
        r22.f13706a.put(r13.getKey(), new p000.C22311tg0(r13.getLane(), r13.getSpan(), r13.getCrossAxisOffset()));
        r1 = r7.getIndex(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00c2, code lost:
        if (r1 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00c8, code lost:
        if (r13.getIndex() == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00ca, code lost:
        if (r1 >= r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00cc, code lost:
        r22.f13710e.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00d1, code lost:
        r12 = r7;
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00d6, code lost:
        r22.f13711f.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00dc, code lost:
        r1 = r13.mo69650getOffsetnOccac();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00e4, code lost:
        if (r13.isVertical() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00e6, code lost:
        r1 = androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00eb, code lost:
        r1 = androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00ef, code lost:
        m61166c(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00f3, code lost:
        r24 = r1;
        r1 = r13.getPlaceablesCount();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00fa, code lost:
        if (r2 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00fc, code lost:
        r6 = m61167b(r13.getParentData(r2));
        r12 = r7;
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0107, code lost:
        if (r6 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0117, code lost:
        if (androidx.compose.p003ui.unit.IntOffset.m73775equalsimpl0(r6.m69635getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode.Companion.m69637getNotInitializednOccac()) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0119, code lost:
        r3 = r6.m69635getRawOffsetnOccac();
        r6.m69636setRawOffsetgyyYBs(androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r3) + androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r9), androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r3) + androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0136, code lost:
        r2 = r2 + 1;
        r8 = r25;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0140, code lost:
        r12 = r7;
        r25 = r8;
        r14.m22374e(r13.getLane());
        r14.m22373f(r13.getSpan());
        r14.m22375d(r13.getCrossAxisOffset());
        m61165d(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x015c, code lost:
        r24 = r1;
        r12 = r7;
        r25 = r8;
        r22.f13706a.remove(r13.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x016a, code lost:
        r11 = r11 + 1;
        r1 = r24;
        r8 = r25;
        r2 = r26;
        r4 = r29;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x017a, code lost:
        r1 = r4;
        r12 = r7;
        r25 = r8;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0181, code lost:
        if (r3 >= r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0183, code lost:
        r2[r3] = 0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0193, code lost:
        if ((!r22.f13710e.isEmpty()) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0195, code lost:
        r1 = r22.f13710e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x019b, code lost:
        if (r1.size() <= 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x019d, code lost:
        r5 = r12;
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.staggeredgrid.C2946x84327521());
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01a7, code lost:
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01a8, code lost:
        r1 = r22.f13710e;
        r4 = r1.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01af, code lost:
        if (r6 >= r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01b1, code lost:
        r7 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1.get(r6);
        r8 = r7.getLane();
        r2[r8] = r2[r8] + r7.getMainAxisSize();
        m61166c(r7, 0 - r2[r7.getLane()]);
        m61165d(r7);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01d6, code lost:
        kotlin.collections.ArraysKt___ArraysJvmKt.fill$default(r2, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01e6, code lost:
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01f0, code lost:
        if ((!r22.f13711f.isEmpty()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01f2, code lost:
        r1 = r22.f13711f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01f8, code lost:
        if (r1.size() <= 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01fa, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.staggeredgrid.C2944x5fe93f09());
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0202, code lost:
        r1 = r22.f13711f;
        r4 = r1.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0209, code lost:
        if (r6 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x020b, code lost:
        r7 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1.get(r6);
        r9 = r7.getLane();
        r2[r9] = r2[r9] + r7.getMainAxisSize();
        m61166c(r7, r25 + r2[r7.getLane()]);
        m61165d(r7);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x022f, code lost:
        kotlin.collections.ArraysKt___ArraysJvmKt.fill$default(r2, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x023e, code lost:
        r1 = r22.f13709d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0248, code lost:
        if (r1.hasNext() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x024a, code lost:
        r4 = r1.next();
        r6 = (p000.C22311tg0) kotlin.collections.AbstractC11687a.getValue(r22.f13706a, r4);
        r7 = r22.f13707b.getIndex(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x025d, code lost:
        if (r7 != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x025f, code lost:
        r22.f13706a.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0267, code lost:
        r9 = r27.m69661getAndMeasurejy6DScQ(r7, androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m69663constructorimpl(r6.m22377b(), r6.m22376c()));
        r10 = r9.getPlaceablesCount();
        r11 = 0;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x027f, code lost:
        if (r11 >= r10) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0281, code lost:
        r13 = m61167b(r9.getParentData(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0289, code lost:
        if (r13 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x028f, code lost:
        if (r13.isAnimationInProgress() != true) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0291, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0292, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0295, code lost:
        if (r12 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x029b, code lost:
        if (r7 != r5.getIndex(r4)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x029d, code lost:
        r22.f13706a.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02a5, code lost:
        if (r7 >= r22.f13708c) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02a7, code lost:
        r22.f13712g.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02ad, code lost:
        r22.f13713h.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02bc, code lost:
        if ((!r22.f13712g.isEmpty()) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02be, code lost:
        r1 = r22.f13712g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02c4, code lost:
        if (r1.size() <= 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02c6, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.staggeredgrid.C2947x84327522());
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02ce, code lost:
        r1 = r22.f13712g;
        r4 = r1.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02d5, code lost:
        if (r5 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02d7, code lost:
        r6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1.get(r5);
        r7 = r6.getLane();
        r2[r7] = r2[r7] + r6.getMainAxisSize();
        r6.position(0 - r2[r6.getLane()], ((p000.C22311tg0) kotlin.collections.AbstractC11687a.getValue(r22.f13706a, r6.getKey())).m22378a(), r25);
        r26.add(r6);
        m61165d(r6);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0313, code lost:
        r10 = r25;
        r7 = r26;
        kotlin.collections.ArraysKt___ArraysJvmKt.fill$default(r2, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0328, code lost:
        r10 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0336, code lost:
        if ((!r22.f13713h.isEmpty()) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0338, code lost:
        r1 = r22.f13713h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x033e, code lost:
        if (r1.size() <= 1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0340, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.staggeredgrid.C2945x5fe93f0a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0348, code lost:
        r1 = r22.f13713h;
        r3 = r1.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x034f, code lost:
        if (r6 >= r3) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0351, code lost:
        r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r1.get(r6);
        r8 = r10 + r2[r4.getLane()];
        r5 = r4.getLane();
        r2[r5] = r2[r5] + r4.getMainAxisSize();
        r4.position(r8, ((p000.C22311tg0) kotlin.collections.AbstractC11687a.getValue(r22.f13706a, r4.getKey())).m22378a(), r10);
        r7.add(r4);
        m61165d(r4);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0388, code lost:
        r22.f13710e.clear();
        r22.f13711f.clear();
        r22.f13712g.clear();
        r22.f13713h.clear();
        r22.f13709d.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03a1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r23, int r24, int r25, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> r26, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider, boolean, int):void");
    }

    public final void reset() {
        this.f13706a.clear();
        this.f13707b = LazyLayoutKeyIndexMap.Empty;
        this.f13708c = -1;
    }
}
