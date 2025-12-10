package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0003J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00010&j\b\u0012\u0004\u0012\u00020\u0001`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u001c\u00105\u001a\u0004\u0018\u000103*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u00104R\u0018\u00107\u001a\u00020\u000f*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u00106¨\u00068"}, m29142d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "<init>", "()V", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "isVertical", "", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Z)V", "reset", "item", "mainAxisOffset", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;I)V", "d", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;)V", "", "LAg0;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "keyToItemInfoMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "e", "Ljava/util/List;", "movingInFromStartBound", OperatorName.FILL_NON_ZERO, "movingInFromEndBound", OperatorName.NON_STROKING_GRAY, "movingAwayToStartBound", OperatorName.CLOSE_PATH, "movingAwayToEndBound", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "node", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;)Z", "hasAnimations", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n311#1,2:336\n313#1,2:339\n311#1,2:376\n313#1,2:380\n311#1,2:382\n313#1,2:385\n311#1,4:387\n101#2,2:322\n33#2,6:324\n103#2:330\n33#2,4:331\n38#2:341\n33#2,6:344\n33#2,6:352\n33#2,6:362\n33#2,6:370\n1#3:335\n86#4:338\n79#4:378\n86#4:379\n79#4:384\n1011#5,2:342\n1002#5,2:350\n1855#5,2:358\n1011#5,2:360\n1002#5,2:368\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n110#1:336,2\n110#1:339,2\n280#1:376,2\n280#1:380,2\n288#1:382,2\n288#1:385,2\n304#1:387,4\n63#1:322,2\n63#1:324,6\n63#1:330\n86#1:331,4\n86#1:341\n129#1:344,6\n146#1:352,6\n201#1:362,6\n227#1:370,6\n112#1:338\n282#1:378\n283#1:379\n294#1:384\n128#1:342,2\n145#1:350,2\n160#1:358,2\n200#1:360,2\n226#1:368,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {

    /* renamed from: c */
    public int f13568c;

    /* renamed from: a */
    public final Map f13566a = new LinkedHashMap();

    /* renamed from: b */
    public LazyLayoutKeyIndexMap f13567b = LazyLayoutKeyIndexMap.Empty;

    /* renamed from: d */
    public final LinkedHashSet f13569d = new LinkedHashSet();

    /* renamed from: e */
    public final List f13570e = new ArrayList();

    /* renamed from: f */
    public final List f13571f = new ArrayList();

    /* renamed from: g */
    public final List f13572g = new ArrayList();

    /* renamed from: h */
    public final List f13573h = new ArrayList();

    /* renamed from: a */
    public final boolean m61197a(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (m61196b(lazyGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final LazyLayoutAnimateItemModifierNode m61196b(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final void m61195c(LazyGridMeasuredItem lazyGridMeasuredItem, int i) {
        long m73956copyiSbpLlY$default;
        long mo69807getOffsetnOccac = lazyGridMeasuredItem.mo69807getOffsetnOccac();
        if (lazyGridMeasuredItem.isVertical()) {
            m73956copyiSbpLlY$default = IntOffset.m73956copyiSbpLlY$default(mo69807getOffsetnOccac, 0, i, 1, null);
        } else {
            m73956copyiSbpLlY$default = IntOffset.m73956copyiSbpLlY$default(mo69807getOffsetnOccac, i, 0, 2, null);
        }
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimateItemModifierNode m61196b = m61196b(lazyGridMeasuredItem.getParentData(i2));
            if (m61196b != null) {
                long mo69807getOffsetnOccac2 = lazyGridMeasuredItem.mo69807getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(mo69807getOffsetnOccac2) - IntOffset.m73960getXimpl(mo69807getOffsetnOccac), IntOffset.m73961getYimpl(mo69807getOffsetnOccac2) - IntOffset.m73961getYimpl(mo69807getOffsetnOccac));
                m61196b.m69820setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(m73956copyiSbpLlY$default) + IntOffset.m73960getXimpl(IntOffset), IntOffset.m73961getYimpl(m73956copyiSbpLlY$default) + IntOffset.m73961getYimpl(IntOffset)));
            }
        }
    }

    /* renamed from: d */
    public final void m61194d(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode m61196b = m61196b(lazyGridMeasuredItem.getParentData(i));
            if (m61196b != null) {
                long mo69807getOffsetnOccac = lazyGridMeasuredItem.mo69807getOffsetnOccac();
                long m69819getRawOffsetnOccac = m61196b.m69819getRawOffsetnOccac();
                if (!IntOffset.m73959equalsimpl0(m69819getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m69821getNotInitializednOccac()) && !IntOffset.m73959equalsimpl0(m69819getRawOffsetnOccac, mo69807getOffsetnOccac)) {
                    m61196b.m69817animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(mo69807getOffsetnOccac) - IntOffset.m73960getXimpl(m69819getRawOffsetnOccac), IntOffset.m73961getYimpl(mo69807getOffsetnOccac) - IntOffset.m73961getYimpl(m69819getRawOffsetnOccac)));
                }
                m61196b.m69820setRawOffsetgyyYBs(mo69807getOffsetnOccac);
            }
        }
    }

    public final void onMeasured(int i, int i2, int i3, @NotNull List<LazyGridMeasuredItem> list, @NotNull LazyGridMeasuredItemProvider itemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, boolean z) {
        int i4;
        int i5;
        long IntOffset;
        long m73819fixedHeightOenEA2s;
        int column;
        int column2;
        int i6;
        int i7;
        int m73960getXimpl;
        List<LazyGridMeasuredItem> positionedItems = list;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (m61197a(positionedItems.get(i8))) {
                    break;
                }
                i8++;
            } else if (this.f13566a.isEmpty()) {
                reset();
                return;
            }
        }
        int i9 = this.f13568c;
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (lazyGridMeasuredItem != null) {
            i4 = lazyGridMeasuredItem.getIndex();
        } else {
            i4 = 0;
        }
        this.f13568c = i4;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.f13567b;
        this.f13567b = itemProvider.getKeyIndexMap();
        if (z) {
            i5 = i3;
        } else {
            i5 = i2;
        }
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(0, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, 0);
        }
        this.f13569d.addAll(this.f13566a.keySet());
        int size2 = list.size();
        int i10 = 0;
        while (i10 < size2) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = positionedItems.get(i10);
            this.f13569d.remove(lazyGridMeasuredItem2.getKey());
            if (m61197a(lazyGridMeasuredItem2)) {
                C17302Ag0 c17302Ag0 = (C17302Ag0) this.f13566a.get(lazyGridMeasuredItem2.getKey());
                if (c17302Ag0 == null) {
                    i6 = size2;
                    this.f13566a.put(lazyGridMeasuredItem2.getKey(), new C17302Ag0(lazyGridMeasuredItem2.getCrossAxisSize(), lazyGridMeasuredItem2.getCrossAxisOffset()));
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyGridMeasuredItem2.getKey());
                    if (index != -1 && lazyGridMeasuredItem2.getIndex() != index) {
                        if (index < i9) {
                            this.f13570e.add(lazyGridMeasuredItem2);
                        } else {
                            this.f13571f.add(lazyGridMeasuredItem2);
                        }
                    } else {
                        long mo69807getOffsetnOccac = lazyGridMeasuredItem2.mo69807getOffsetnOccac();
                        if (lazyGridMeasuredItem2.isVertical()) {
                            m73960getXimpl = IntOffset.m73961getYimpl(mo69807getOffsetnOccac);
                        } else {
                            m73960getXimpl = IntOffset.m73960getXimpl(mo69807getOffsetnOccac);
                        }
                        m61195c(lazyGridMeasuredItem2, m73960getXimpl);
                    }
                } else {
                    i6 = size2;
                    int placeablesCount = lazyGridMeasuredItem2.getPlaceablesCount();
                    int i11 = 0;
                    while (i11 < placeablesCount) {
                        LazyLayoutAnimateItemModifierNode m61196b = m61196b(lazyGridMeasuredItem2.getParentData(i11));
                        if (m61196b != null) {
                            i7 = placeablesCount;
                            if (!IntOffset.m73959equalsimpl0(m61196b.m69819getRawOffsetnOccac(), LazyLayoutAnimateItemModifierNode.Companion.m69821getNotInitializednOccac())) {
                                long m69819getRawOffsetnOccac = m61196b.m69819getRawOffsetnOccac();
                                m61196b.m69820setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(m69819getRawOffsetnOccac) + IntOffset.m73960getXimpl(IntOffset), IntOffset.m73961getYimpl(m69819getRawOffsetnOccac) + IntOffset.m73961getYimpl(IntOffset)));
                            }
                        } else {
                            i7 = placeablesCount;
                        }
                        i11++;
                        placeablesCount = i7;
                    }
                    c17302Ag0.m69207d(lazyGridMeasuredItem2.getCrossAxisSize());
                    c17302Ag0.m69208c(lazyGridMeasuredItem2.getCrossAxisOffset());
                    m61194d(lazyGridMeasuredItem2);
                }
            } else {
                i6 = size2;
                this.f13566a.remove(lazyGridMeasuredItem2.getKey());
            }
            i10++;
            positionedItems = list;
            size2 = i6;
        }
        List list2 = this.f13570e;
        if (list2.size() > 1) {
            AbstractC10320gs.sortWith(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16870uu.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyGridMeasuredItem) t2).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List list3 = this.f13570e;
        int size3 = list3.size();
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size3; i15++) {
            LazyGridMeasuredItem lazyGridMeasuredItem3 = (LazyGridMeasuredItem) list3.get(i15);
            if (z) {
                column2 = lazyGridMeasuredItem3.getRow();
            } else {
                column2 = lazyGridMeasuredItem3.getColumn();
            }
            if (column2 != -1 && column2 == i12) {
                i14 = Math.max(i14, lazyGridMeasuredItem3.getMainAxisSize());
            } else {
                i13 += i14;
                i14 = lazyGridMeasuredItem3.getMainAxisSize();
                i12 = column2;
            }
            m61195c(lazyGridMeasuredItem3, (0 - i13) - lazyGridMeasuredItem3.getMainAxisSize());
            m61194d(lazyGridMeasuredItem3);
        }
        List list4 = this.f13571f;
        if (list4.size() > 1) {
            AbstractC10320gs.sortWith(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16870uu.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyGridMeasuredItem) t).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List list5 = this.f13571f;
        int size4 = list5.size();
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        for (int i19 = 0; i19 < size4; i19++) {
            LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem) list5.get(i19);
            if (z) {
                column = lazyGridMeasuredItem4.getRow();
            } else {
                column = lazyGridMeasuredItem4.getColumn();
            }
            if (column != -1 && column == i18) {
                i17 = Math.max(i17, lazyGridMeasuredItem4.getMainAxisSize());
            } else {
                i16 += i17;
                i17 = lazyGridMeasuredItem4.getMainAxisSize();
                i18 = column;
            }
            m61195c(lazyGridMeasuredItem4, i5 + i16);
            m61194d(lazyGridMeasuredItem4);
        }
        for (Object obj : this.f13569d) {
            C17302Ag0 c17302Ag02 = (C17302Ag0) AbstractC11663a.getValue(this.f13566a, obj);
            int index2 = this.f13567b.getIndex(obj);
            if (index2 == -1) {
                this.f13566a.remove(obj);
            } else {
                if (z) {
                    m73819fixedHeightOenEA2s = Constraints.Companion.m73820fixedWidthOenEA2s(c17302Ag02.m69209b());
                } else {
                    m73819fixedHeightOenEA2s = Constraints.Companion.m73819fixedHeightOenEA2s(c17302Ag02.m69209b());
                }
                LazyGridMeasuredItem m69812getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m69812getAndMeasure3p2s80s$default(itemProvider, index2, 0, m73819fixedHeightOenEA2s, 2, null);
                int placeablesCount2 = m69812getAndMeasure3p2s80s$default.getPlaceablesCount();
                boolean z2 = false;
                for (int i20 = 0; i20 < placeablesCount2; i20++) {
                    LazyLayoutAnimateItemModifierNode m61196b2 = m61196b(m69812getAndMeasure3p2s80s$default.getParentData(i20));
                    if (m61196b2 != null && m61196b2.isAnimationInProgress()) {
                        z2 = true;
                    }
                }
                if (!z2 && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                    this.f13566a.remove(obj);
                } else if (index2 < this.f13568c) {
                    this.f13572g.add(m69812getAndMeasure3p2s80s$default);
                } else {
                    this.f13573h.add(m69812getAndMeasure3p2s80s$default);
                }
            }
        }
        List list6 = this.f13572g;
        if (list6.size() > 1) {
            AbstractC10320gs.sortWith(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                    lazyLayoutKeyIndexMap2 = LazyGridItemPlacementAnimator.this.f13567b;
                    Integer valueOf = Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyGridMeasuredItem) t2).getKey()));
                    lazyLayoutKeyIndexMap3 = LazyGridItemPlacementAnimator.this.f13567b;
                    return AbstractC16870uu.compareValues(valueOf, Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List list7 = this.f13572g;
        int size5 = list7.size();
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        for (int i24 = 0; i24 < size5; i24++) {
            LazyGridMeasuredItem lazyGridMeasuredItem5 = (LazyGridMeasuredItem) list7.get(i24);
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem5.getIndex());
            if (lineIndexOfItem != -1 && lineIndexOfItem == i23) {
                i22 = Math.max(i22, lazyGridMeasuredItem5.getMainAxisSize());
            } else {
                i21 += i22;
                i22 = lazyGridMeasuredItem5.getMainAxisSize();
                i23 = lineIndexOfItem;
            }
            LazyGridMeasuredItem.position$default(lazyGridMeasuredItem5, (0 - i21) - lazyGridMeasuredItem5.getMainAxisSize(), ((C17302Ag0) AbstractC11663a.getValue(this.f13566a, lazyGridMeasuredItem5.getKey())).m69210a(), i2, i3, 0, 0, 48, null);
            list.add(lazyGridMeasuredItem5);
            m61194d(lazyGridMeasuredItem5);
        }
        List list8 = this.f13573h;
        if (list8.size() > 1) {
            AbstractC10320gs.sortWith(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                    lazyLayoutKeyIndexMap2 = LazyGridItemPlacementAnimator.this.f13567b;
                    Integer valueOf = Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyGridMeasuredItem) t).getKey()));
                    lazyLayoutKeyIndexMap3 = LazyGridItemPlacementAnimator.this.f13567b;
                    return AbstractC16870uu.compareValues(valueOf, Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List list9 = this.f13573h;
        int size6 = list9.size();
        int i25 = 0;
        int i26 = -1;
        int i27 = 0;
        for (int i28 = 0; i28 < size6; i28++) {
            LazyGridMeasuredItem lazyGridMeasuredItem6 = (LazyGridMeasuredItem) list9.get(i28);
            int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem6.getIndex());
            if (lineIndexOfItem2 != -1 && lineIndexOfItem2 == i26) {
                i25 = Math.max(i25, lazyGridMeasuredItem6.getMainAxisSize());
            } else {
                i27 += i25;
                i25 = lazyGridMeasuredItem6.getMainAxisSize();
                i26 = lineIndexOfItem2;
            }
            LazyGridMeasuredItem.position$default(lazyGridMeasuredItem6, i5 + i27, ((C17302Ag0) AbstractC11663a.getValue(this.f13566a, lazyGridMeasuredItem6.getKey())).m69210a(), i2, i3, 0, 0, 48, null);
            list.add(lazyGridMeasuredItem6);
            m61194d(lazyGridMeasuredItem6);
        }
        this.f13570e.clear();
        this.f13571f.clear();
        this.f13572g.clear();
        this.f13573h.clear();
        this.f13569d.clear();
    }

    public final void reset() {
        this.f13566a.clear();
        this.f13567b = LazyLayoutKeyIndexMap.Empty;
        this.f13568c = -1;
    }
}