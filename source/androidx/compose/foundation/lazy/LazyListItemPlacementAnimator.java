package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00010#j\b\u0012\u0004\u0012\u00020\u0001`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u001c\u00102\u001a\u0004\u0018\u000100*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00101R\u0018\u00104\u001a\u00020\r*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00103¨\u00065"}, m28850d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "<init>", "()V", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemProvider", "", "isVertical", "", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;Z)V", "reset", "item", "mainAxisOffset", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;I)V", "d", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Set;", "activeKeys", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "e", "Ljava/util/List;", "movingInFromStartBound", OperatorName.FILL_NON_ZERO, "movingInFromEndBound", OperatorName.NON_STROKING_GRAY, "movingAwayToStartBound", OperatorName.CLOSE_PATH, "movingAwayToEndBound", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "node", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;)Z", "hasAnimations", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n246#1,2:266\n248#1,2:270\n246#1,2:307\n248#1,2:312\n246#1,2:314\n248#1,2:318\n246#1,2:320\n248#1,2:323\n101#2,2:252\n33#2,6:254\n103#2:260\n33#2,4:261\n38#2:272\n33#2,6:275\n33#2,6:283\n33#2,6:293\n33#2,6:301\n1#3:265\n1#3:268\n1#3:309\n1#3:316\n1#3:322\n86#4:269\n79#4:310\n86#4:311\n79#4:317\n1011#5,2:273\n1002#5,2:281\n1855#5,2:289\n1011#5,2:291\n1002#5,2:299\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n105#1:266,2\n105#1:270,2\n215#1:307,2\n215#1:312,2\n223#1:314,2\n223#1:318,2\n239#1:320,2\n239#1:323,2\n61#1:252,2\n61#1:254,6\n61#1:260\n84#1:261,4\n84#1:272\n120#1:275,6\n128#1:283,6\n166#1:293,6\n176#1:301,6\n105#1:268\n215#1:309\n223#1:316\n239#1:322\n107#1:269\n217#1:310\n218#1:311\n229#1:317\n119#1:273,2\n127#1:281,2\n135#1:289,2\n165#1:291,2\n175#1:299,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {

    /* renamed from: c */
    public int f13364c;

    /* renamed from: a */
    public final Set f13362a = new LinkedHashSet();

    /* renamed from: b */
    public LazyLayoutKeyIndexMap f13363b = LazyLayoutKeyIndexMap.Empty;

    /* renamed from: d */
    public final LinkedHashSet f13365d = new LinkedHashSet();

    /* renamed from: e */
    public final List f13366e = new ArrayList();

    /* renamed from: f */
    public final List f13367f = new ArrayList();

    /* renamed from: g */
    public final List f13368g = new ArrayList();

    /* renamed from: h */
    public final List f13369h = new ArrayList();

    public static final /* synthetic */ LazyLayoutKeyIndexMap access$getKeyIndexMap$p(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        return lazyListItemPlacementAnimator.f13363b;
    }

    /* renamed from: a */
    public final boolean m61294a(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (m61293b(lazyListMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final LazyLayoutAnimateItemModifierNode m61293b(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final void m61292c(LazyListMeasuredItem lazyListMeasuredItem, int i) {
        long m73772copyiSbpLlY$default;
        long m69603getOffsetBjo55l4 = lazyListMeasuredItem.m69603getOffsetBjo55l4(0);
        if (lazyListMeasuredItem.isVertical()) {
            m73772copyiSbpLlY$default = IntOffset.m73772copyiSbpLlY$default(m69603getOffsetBjo55l4, 0, i, 1, null);
        } else {
            m73772copyiSbpLlY$default = IntOffset.m73772copyiSbpLlY$default(m69603getOffsetBjo55l4, i, 0, 2, null);
        }
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimateItemModifierNode m61293b = m61293b(lazyListMeasuredItem.getParentData(i2));
            if (m61293b != null) {
                long m69603getOffsetBjo55l42 = lazyListMeasuredItem.m69603getOffsetBjo55l4(i2);
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m69603getOffsetBjo55l42) - IntOffset.m73776getXimpl(m69603getOffsetBjo55l4), IntOffset.m73777getYimpl(m69603getOffsetBjo55l42) - IntOffset.m73777getYimpl(m69603getOffsetBjo55l4));
                m61293b.m69636setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m73772copyiSbpLlY$default) + IntOffset.m73776getXimpl(IntOffset), IntOffset.m73777getYimpl(m73772copyiSbpLlY$default) + IntOffset.m73777getYimpl(IntOffset)));
            }
        }
    }

    /* renamed from: d */
    public final void m61291d(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode m61293b = m61293b(lazyListMeasuredItem.getParentData(i));
            if (m61293b != null) {
                long m69603getOffsetBjo55l4 = lazyListMeasuredItem.m69603getOffsetBjo55l4(i);
                long m69635getRawOffsetnOccac = m61293b.m69635getRawOffsetnOccac();
                if (!IntOffset.m73775equalsimpl0(m69635getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m69637getNotInitializednOccac()) && !IntOffset.m73775equalsimpl0(m69635getRawOffsetnOccac, m69603getOffsetBjo55l4)) {
                    m61293b.m69633animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m69603getOffsetBjo55l4) - IntOffset.m73776getXimpl(m69635getRawOffsetnOccac), IntOffset.m73777getYimpl(m69603getOffsetBjo55l4) - IntOffset.m73777getYimpl(m69635getRawOffsetnOccac)));
                }
                m61293b.m69636setRawOffsetgyyYBs(m69603getOffsetBjo55l4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x003c, code lost:
        r6 = r18.f13364c;
        r8 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt___CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0044, code lost:
        if (r8 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0046, code lost:
        r8 = r8.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x004b, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x004c, code lost:
        r18.f13364c = r8;
        r8 = r18.f13363b;
        r18.f13363b = r23.getKeyIndexMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0056, code lost:
        if (r24 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0058, code lost:
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x005a, code lost:
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x005b, code lost:
        if (r24 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x005d, code lost:
        r10 = androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(0, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0062, code lost:
        r10 = androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(r19, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0066, code lost:
        r18.f13365d.addAll(r18.f13362a);
        r1 = r22.size();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0075, code lost:
        if (r12 >= r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0077, code lost:
        r14 = r4.get(r12);
        r18.f13365d.remove(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x008a, code lost:
        if (m61294a(r14) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0096, code lost:
        if (r18.f13362a.contains(r14.getKey()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0098, code lost:
        r18.f13362a.add(r14.getKey());
        r7 = r8.getIndex(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ab, code lost:
        if (r7 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00b1, code lost:
        if (r14.getIndex() == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00b3, code lost:
        if (r7 >= r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00b5, code lost:
        r18.f13366e.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00ba, code lost:
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00be, code lost:
        r18.f13367f.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00c4, code lost:
        r15 = r14.m69603getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00cd, code lost:
        if (r14.isVertical() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00cf, code lost:
        r13 = androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00d4, code lost:
        r13 = androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00d8, code lost:
        m61292c(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00dc, code lost:
        r13 = r14.getPlaceablesCount();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00e2, code lost:
        if (r15 >= r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00e4, code lost:
        r7 = m61293b(r14.getParentData(r15));
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00ee, code lost:
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00fe, code lost:
        if (androidx.compose.p003ui.unit.IntOffset.m73775equalsimpl0(r7.m69635getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode.Companion.m69637getNotInitializednOccac()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0100, code lost:
        r1 = r7.m69635getRawOffsetnOccac();
        r7.m69636setRawOffsetgyyYBs(androidx.compose.p003ui.unit.IntOffsetKt.IntOffset(androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r1) + androidx.compose.p003ui.unit.IntOffset.m73776getXimpl(r10), androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r1) + androidx.compose.p003ui.unit.IntOffset.m73777getYimpl(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x011d, code lost:
        r15 = r15 + 1;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0129, code lost:
        r19 = r1;
        m61291d(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x012f, code lost:
        r19 = r1;
        r18.f13362a.remove(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x013a, code lost:
        r12 = r12 + 1;
        r1 = r19;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0147, code lost:
        r1 = r18.f13366e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x014e, code lost:
        if (r1.size() <= 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0150, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.C2906xd022a35());
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0158, code lost:
        r1 = r18.f13366e;
        r2 = r1.size();
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0160, code lost:
        if (r4 >= r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0162, code lost:
        r7 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1.get(r4);
        r6 = r6 + r7.getSize();
        m61292c(r7, 0 - r6);
        m61291d(r7);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0178, code lost:
        r1 = r18.f13367f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x017e, code lost:
        if (r1.size() <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0180, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0188, code lost:
        r1 = r18.f13367f;
        r2 = r1.size();
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0190, code lost:
        if (r4 >= r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0192, code lost:
        r7 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1.get(r4);
        r10 = r9 + r6;
        r6 = r6 + r7.getSize();
        m61292c(r7, r10);
        m61291d(r7);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01a8, code lost:
        r1 = r18.f13365d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01b2, code lost:
        if (r1.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01b4, code lost:
        r2 = r1.next();
        r4 = r18.f13363b.getIndex(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x01be, code lost:
        if (r4 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01c0, code lost:
        r18.f13362a.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01c6, code lost:
        r6 = r23.getAndMeasure(r4);
        r7 = r6.getPlaceablesCount();
        r10 = 0;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01d0, code lost:
        if (r10 >= r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01d2, code lost:
        r12 = m61293b(r6.getParentData(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01da, code lost:
        if (r12 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01e0, code lost:
        if (r12.isAnimationInProgress() != true) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01e2, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01e3, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01e6, code lost:
        if (r11 != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01ec, code lost:
        if (r4 != r8.getIndex(r2)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01ee, code lost:
        r18.f13362a.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01f6, code lost:
        if (r4 >= r18.f13364c) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01f8, code lost:
        r18.f13368g.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01fe, code lost:
        r18.f13369h.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0204, code lost:
        r1 = r18.f13368g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x020a, code lost:
        if (r1.size() <= 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x020c, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.C2907xd022a36());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0214, code lost:
        r1 = r18.f13368g;
        r2 = r1.size();
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x021c, code lost:
        if (r4 >= r2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x021e, code lost:
        r6 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1.get(r4);
        r5 = r5 + r6.getSize();
        r6.position(0 - r5, r20, r21);
        r22.add(r6);
        m61291d(r6);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x023d, code lost:
        r1 = r18.f13369h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0249, code lost:
        if (r1.size() <= 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x024b, code lost:
        p000.AbstractC10334gs.sortWith(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0253, code lost:
        r1 = r18.f13369h;
        r2 = r1.size();
        r3 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x025c, code lost:
        if (r3 >= r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x025e, code lost:
        r4 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r1.get(r3);
        r5 = r9 + r16;
        r16 = r16 + r4.getSize();
        r4.position(r5, r20, r21);
        r22.add(r4);
        m61291d(r4);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0278, code lost:
        r18.f13366e.clear();
        r18.f13367f.clear();
        r18.f13368g.clear();
        r18.f13369h.clear();
        r18.f13365d.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0291, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r19, int r20, int r21, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> r22, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, boolean):void");
    }

    public final void reset() {
        this.f13362a.clear();
        this.f13363b = LazyLayoutKeyIndexMap.Empty;
        this.f13364c = -1;
    }
}
