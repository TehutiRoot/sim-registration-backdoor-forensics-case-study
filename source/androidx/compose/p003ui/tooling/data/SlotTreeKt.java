package androidx.compose.p003ui.tooling.data;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.layout.ModifierInfo;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC12026a;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010!\u001a\u00020 *\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'\u001aM\u0010/\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010(*\u00020)2&\u0010,\u001a\"\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00018\u00000*2\b\b\u0002\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100\u001a%\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0015*\u00020\u001e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020 *\u00020)H\u0007¢\u0006\u0004\b4\u00105\u001a\u001b\u00107\u001a\u00020%*\u00020%2\u0006\u00106\u001a\u00020%H\u0000¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u0004\u0018\u00010\u00072\b\u0010:\u001a\u0004\u0018\u000109H\u0003¢\u0006\u0004\b;\u0010<\u001a/\u0010?\u001a\b\u0012\u0004\u0012\u0002010\u00152\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00152\b\u0010>\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b?\u0010@\u001a!\u0010D\u001a\u0004\u0018\u00010C*\u0006\u0012\u0002\b\u00030A2\u0006\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bD\u0010E\u001a#\u0010H\u001a\u00020\u0007*\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010I\"\u001a\u0010M\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010J\u001a\u0004\bK\u0010L\"\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010O\"\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010O\"\u0018\u0010S\u001a\u00020\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u000e\"\u0018\u0010U\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0003\"\u0018\u0010W\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0003\" \u0010\\\u001a\u0004\u0018\u00010\u0007*\u00020 8GX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010Y¨\u0006]"}, m28850d2 = {"Lkotlin/text/MatchResult;", "", OperatorName.LINE_TO, "(Lkotlin/text/MatchResult;)Z", "", "o", "(Lkotlin/text/MatchResult;)I", "", OperatorName.CURVE_TO, "i", "(Lkotlin/text/MatchResult;Ljava/lang/String;)Z", OperatorName.NON_STROKING_CMYK, OperatorName.MOVE_TO, OperatorName.CLOSE_PATH, "(Lkotlin/text/MatchResult;)Ljava/lang/String;", "x", "(Ljava/lang/String;)I", "radix", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Ljava/lang/String;I)I", "parameters", "", "LHh1;", "p", "(Ljava/lang/String;)Ljava/util/List;", "information", "LvK1;", "parent", "A", "(Ljava/lang/String;LvK1;)LvK1;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "parentContext", "Landroidx/compose/ui/tooling/data/Group;", "e", "(Landroidx/compose/runtime/tooling/CompositionGroup;LvK1;)Landroidx/compose/ui/tooling/data/Group;", "Landroidx/compose/ui/layout/LayoutInfo;", "node", "Landroidx/compose/ui/unit/IntRect;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/layout/LayoutInfo;)Landroidx/compose/ui/unit/IntRect;", "T", "Landroidx/compose/runtime/tooling/CompositionData;", "Lkotlin/Function3;", "Landroidx/compose/ui/tooling/data/SourceContext;", "factory", "Landroidx/compose/ui/tooling/data/ContextCache;", "cache", "mapTree", "(Landroidx/compose/runtime/tooling/CompositionData;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/lang/Object;", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "findParameters", "(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/util/List;", "asTree", "(Landroidx/compose/runtime/tooling/CompositionData;)Landroidx/compose/ui/tooling/data/Group;", "other", "union", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "", Action.KEY_ATTRIBUTE, OperatorName.ENDPATH, "(Ljava/lang/Object;)Ljava/lang/String;", "data", CoreConstants.CONTEXT_SCOPE_VALUE, "d", "(Ljava/util/List;LvK1;)Ljava/util/List;", "Ljava/lang/Class;", "name", "Ljava/lang/reflect/Field;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "prefix", "replacement", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/ui/unit/IntRect;", "getEmptyBox", "()Landroidx/compose/ui/unit/IntRect;", "emptyBox", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "tokenizer", "parametersInformationTokenizer", OperatorName.FILL_NON_ZERO, TextBundle.TEXT_ENTRY, OperatorName.NON_STROKING_GRAY, "isANumber", OperatorName.SET_LINE_JOINSTYLE, "isClassName", "getPosition", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "getPosition$annotations", "(Landroidx/compose/ui/tooling/data/Group;)V", "position", "ui-tooling-data_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,875:1\n1#2:876\n1549#3:877\n1620#3,3:878\n2661#3,7:881\n288#3,2:895\n1045#3:900\n361#4,7:888\n3792#5:897\n4307#5,2:898\n1282#5,2:901\n*S KotlinDebug\n*F\n+ 1 SlotTree.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n526#1:877\n526#1:878,3\n526#1:881,7\n794#1:895,2\n815#1:900\n746#1:888,7\n811#1:897\n811#1:898,2\n869#1:901,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.data.SlotTreeKt */
/* loaded from: classes2.dex */
public final class SlotTreeKt {

    /* renamed from: a */
    public static final IntRect f31728a = new IntRect(0, 0, 0, 0);

    /* renamed from: b */
    public static final Regex f31729b = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");

    /* renamed from: c */
    public static final Regex f31730c = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.text.MatchResult, T] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.C22604vK1 m58904A(java.lang.String r14, p000.C22604vK1 r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.data.SlotTreeKt.m58904A(java.lang.String, vK1):vK1");
    }

    /* renamed from: B */
    public static /* synthetic */ C22604vK1 m58903B(String str, C22604vK1 c22604vK1, int i, Object obj) {
        if ((i & 2) != 0) {
            c22604vK1 = null;
        }
        return m58904A(str, c22604vK1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatchResult, T] */
    /* renamed from: C */
    public static final MatchResult m58902C(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return (MatchResult) objectRef.element;
    }

    /* renamed from: D */
    public static final C22776wK1 m58901D(Ref.ObjectRef objectRef) {
        Integer num;
        Integer num2;
        Integer num3;
        try {
            MatchResult matchResult = (MatchResult) objectRef.element;
            if (matchResult != null && m58889l(matchResult)) {
                num = Integer.valueOf(m58886o(matchResult) + 1);
                matchResult = m58902C(objectRef);
            } else {
                num = null;
            }
            if (matchResult != null && m58892i(matchResult, "@")) {
                MatchResult m58902C = m58902C(objectRef);
                if (m58902C != null && m58889l(m58902C)) {
                    num3 = Integer.valueOf(m58886o(m58902C));
                    MatchResult m58902C2 = m58902C(objectRef);
                    if (m58902C2 != null && m58892i(m58902C2, "L")) {
                        MatchResult m58902C3 = m58902C(objectRef);
                        if (m58902C3 != null && m58889l(m58902C3)) {
                            num2 = Integer.valueOf(m58886o(m58902C3));
                        }
                        return null;
                    }
                    num2 = null;
                }
                return null;
            }
            num2 = null;
            num3 = null;
            if (num != null && num3 != null && num2 != null) {
                return new C22776wK1(num, num3, num2);
            }
        } catch (ParseError unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static final Field m58900a(Class cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i < length) {
                field = declaredFields[i];
                if (Intrinsics.areEqual(field.getName(), str)) {
                    break;
                }
                i++;
            } else {
                field = null;
                break;
            }
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @UiToolingDataApi
    @NotNull
    public static final Group asTree(@NotNull CompositionData compositionData) {
        Group m58896e;
        Intrinsics.checkNotNullParameter(compositionData, "<this>");
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt___CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        if (compositionGroup == null || (m58896e = m58896e(compositionGroup, null)) == null) {
            return C3639a.f31736i;
        }
        return m58896e;
    }

    /* renamed from: b */
    public static final IntRect m58899b(LayoutInfo layoutInfo) {
        if (!layoutInfo.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(layoutInfo.getCoordinates());
        long mo72816getSizeYbymL2g = layoutInfo.getCoordinates().mo72816getSizeYbymL2g();
        int roundToInt = AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(positionInWindow));
        int roundToInt2 = AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(positionInWindow));
        return new IntRect(roundToInt, roundToInt2, IntSize.m73818getWidthimpl(mo72816getSizeYbymL2g) + roundToInt, IntSize.m73817getHeightimpl(mo72816getSizeYbymL2g) + roundToInt2);
    }

    /* renamed from: c */
    public static final String m58898c(MatchResult matchResult) {
        return matchResult.getGroupValues().get(8);
    }

    /* renamed from: d */
    public static final List m58897d(List list, C22604vK1 c22604vK1) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        List emptyList;
        C17731Hh1 c17731Hh1;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                i = 2;
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj != null) {
                        String name = obj.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
                        if (AbstractC20204hN1.endsWith$default(name, ".RecomposeScopeImpl", false, 2, null)) {
                            break;
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                try {
                    Field m58900a = m58900a(obj.getClass(), "block");
                    if (m58900a != null && (obj2 = m58900a.get(obj)) != null) {
                        Class<?> cls = obj2.getClass();
                        Field m58900a2 = m58900a(cls, "$$default");
                        Field m58900a3 = m58900a(cls, "$$changed");
                        if (m58900a2 != null) {
                            Object obj3 = m58900a2.get(obj2);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                            i2 = ((Integer) obj3).intValue();
                        } else {
                            i2 = 0;
                        }
                        if (m58900a3 != null) {
                            Object obj4 = m58900a3.get(obj2);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            i3 = ((Integer) obj4).intValue();
                        } else {
                            i3 = 0;
                        }
                        Field[] declaredFields = cls.getDeclaredFields();
                        Intrinsics.checkNotNullExpressionValue(declaredFields, "blockClass.declaredFields");
                        ArrayList arrayList = new ArrayList();
                        for (Field field : declaredFields) {
                            String name2 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                            if (AbstractC20204hN1.startsWith$default(name2, "$", false, 2, null)) {
                                String name3 = field.getName();
                                Intrinsics.checkNotNullExpressionValue(name3, "it.name");
                                if (!AbstractC20204hN1.startsWith$default(name3, "$$", false, 2, null)) {
                                    String name4 = field.getName();
                                    Intrinsics.checkNotNullExpressionValue(name4, "it.name");
                                    if (!AbstractC20204hN1.startsWith$default(name4, "$jacoco", false, 2, null)) {
                                        arrayList.add(field);
                                    }
                                }
                            }
                        }
                        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractParameterInfo$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return AbstractC16857uu.compareValues(((Field) t).getName(), ((Field) t2).getName());
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        if (c22604vK1 == null || (emptyList = c22604vK1.m1055c()) == null) {
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        int size = sortedWith.size();
                        int i4 = 0;
                        while (i4 < size) {
                            if (i4 < emptyList.size()) {
                                c17731Hh1 = (C17731Hh1) emptyList.get(i4);
                            } else {
                                c17731Hh1 = new C17731Hh1(i4, null, i, null);
                            }
                            if (c17731Hh1.m68055b() < sortedWith.size()) {
                                Field field2 = (Field) sortedWith.get(c17731Hh1.m68055b());
                                field2.setAccessible(true);
                                Object obj5 = field2.get(obj2);
                                if (((1 << i4) & i2) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i5 = (i4 * 3) + 1;
                                int i6 = ((7 << i5) & i3) >> i5;
                                int i7 = i6 & 3;
                                if (i7 == 3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (i7 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((i6 & 4) == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String name5 = field2.getName();
                                Intrinsics.checkNotNullExpressionValue(name5, "field.name");
                                String substring = name5.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                                if (z3 && !z) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                arrayList2.add(new ParameterInformation(substring, obj5, z, z2, z5, c17731Hh1.m68056a(), z4));
                            }
                            i4++;
                            i = 2;
                        }
                        return arrayList2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: e */
    public static final Group m58896e(CompositionGroup compositionGroup, C22604vK1 c22604vK1) {
        C22604vK1 c22604vK12;
        List<ModifierInfo> emptyList;
        IntRect intRect;
        SourceLocation sourceLocation;
        String str;
        String str2;
        Object obj;
        boolean z;
        Object key = compositionGroup.getKey();
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            c22604vK12 = m58904A(sourceInfo, c22604vK1);
        } else {
            c22604vK12 = null;
        }
        Object node = compositionGroup.getNode();
        ArrayList arrayList = new ArrayList();
        ArrayList<Group> arrayList2 = new ArrayList();
        AbstractC10410hs.addAll(arrayList, compositionGroup.getData());
        for (CompositionGroup compositionGroup2 : compositionGroup.getCompositionGroups()) {
            arrayList2.add(m58896e(compositionGroup2, c22604vK12));
        }
        boolean z2 = node instanceof LayoutInfo;
        if (z2) {
            emptyList = ((LayoutInfo) node).getModifierInfo();
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (z2) {
            intRect = m58899b((LayoutInfo) node);
        } else if (arrayList2.isEmpty()) {
            intRect = f31728a;
        } else {
            ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList2, 10));
            for (Group group : arrayList2) {
                arrayList3.add(group.getBox());
            }
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = union((IntRect) it.next(), (IntRect) next);
                }
                intRect = (IntRect) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        if (c22604vK12 != null && c22604vK12.m1053e() && c22604vK1 != null) {
            sourceLocation = c22604vK1.m1051g();
        } else {
            sourceLocation = null;
        }
        if (node != null) {
            return new NodeGroup(key, node, intRect, arrayList, emptyList, arrayList2);
        }
        if (c22604vK12 != null) {
            str = c22604vK12.m1057a();
        } else {
            str = null;
        }
        if (c22604vK12 != null) {
            str2 = c22604vK12.m1057a();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0 && (intRect.getBottom() - intRect.getTop() > 0 || intRect.getRight() - intRect.getLeft() > 0)) {
            obj = compositionGroup.getIdentity();
        } else {
            obj = null;
        }
        List m58897d = m58897d(arrayList, c22604vK12);
        if (c22604vK12 != null && c22604vK12.m1052f()) {
            z = true;
        } else {
            z = false;
        }
        return new CallGroup(key, str, intRect, sourceLocation, obj, m58897d, arrayList, arrayList2, z);
    }

    /* renamed from: f */
    public static final String m58895f(MatchResult matchResult) {
        return matchResult.getGroupValues().get(0);
    }

    @UiToolingDataApi
    @NotNull
    public static final List<ParameterInformation> findParameters(@NotNull CompositionGroup compositionGroup, @Nullable ContextCache contextCache) {
        Intrinsics.checkNotNullParameter(compositionGroup, "<this>");
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        C22604vK1 c22604vK1 = null;
        if (contextCache == null) {
            c22604vK1 = m58903B(sourceInfo, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data_release = contextCache.getContexts$ui_tooling_data_release();
            Object obj = contexts$ui_tooling_data_release.get(sourceInfo);
            if (obj == null) {
                obj = m58903B(sourceInfo, null, 2, null);
                contexts$ui_tooling_data_release.put(sourceInfo, obj);
            }
            if (obj instanceof C22604vK1) {
                c22604vK1 = (C22604vK1) obj;
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC10410hs.addAll(arrayList, compositionGroup.getData());
        return m58897d(arrayList, c22604vK1);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup compositionGroup, ContextCache contextCache, int i, Object obj) {
        if ((i & 1) != 0) {
            contextCache = null;
        }
        return findParameters(compositionGroup, contextCache);
    }

    /* renamed from: g */
    public static final boolean m58894g(MatchResult matchResult) {
        if (matchResult.getGroups().get(1) != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final IntRect getEmptyBox() {
        return f31728a;
    }

    @UiToolingDataApi
    @Nullable
    public static final String getPosition(@NotNull Group group) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        return m58887n(group.getKey());
    }

    @UiToolingDataApi
    public static /* synthetic */ void getPosition$annotations(Group group) {
    }

    /* renamed from: h */
    public static final boolean m58893h(MatchResult matchResult) {
        if (matchResult.getGroups().get(6) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m58892i(MatchResult matchResult, String str) {
        return Intrinsics.areEqual(m58895f(matchResult), str);
    }

    /* renamed from: j */
    public static final boolean m58891j(MatchResult matchResult) {
        if (matchResult.getGroups().get(2) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m58890k(MatchResult matchResult) {
        if (matchResult.getGroups().get(4) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m58889l(MatchResult matchResult) {
        if (matchResult.getGroups().get(1) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m58888m(MatchResult matchResult) {
        if (matchResult.getGroups().get(5) != null) {
            return true;
        }
        return false;
    }

    @UiToolingDataApi
    @Nullable
    public static final <T> T mapTree(@NotNull CompositionData compositionData, @NotNull Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> factory, @NotNull ContextCache cache) {
        Intrinsics.checkNotNullParameter(compositionData, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(cache, "cache");
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt___CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        C16858uv c16858uv = new C16858uv(factory, cache.getContexts$ui_tooling_data_release());
        ArrayList arrayList = new ArrayList();
        c16858uv.m1163b(compositionGroup, 0, arrayList);
        return (T) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
    }

    public static /* synthetic */ Object mapTree$default(CompositionData compositionData, Function3 function3, ContextCache contextCache, int i, Object obj) {
        if ((i & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(compositionData, function3, contextCache);
    }

    /* renamed from: n */
    public static final String m58887n(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JoinedKey) {
            JoinedKey joinedKey = (JoinedKey) obj;
            String m58887n = m58887n(joinedKey.getLeft());
            if (m58887n == null) {
                return m58887n(joinedKey.getRight());
            }
            return m58887n;
        }
        return null;
    }

    /* renamed from: o */
    public static final int m58886o(MatchResult matchResult) {
        return m58877x(matchResult.getGroupValues().get(1));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.text.MatchResult, T] */
    /* renamed from: p */
    public static final List m58885p(String str) {
        String str2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(f31730c, str, 0, 2, null);
        List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0, 1, 2, 3);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = mutableListOf.size() - 1;
        ArrayList arrayList = new ArrayList();
        try {
            m58883r(objectRef, "P");
            m58883r(objectRef, "(");
            while (!m58880u(objectRef, ")")) {
                if (m58880u(objectRef, "!")) {
                    m58878w(objectRef);
                    int m58881t = m58881t(objectRef);
                    m58884q(intRef, mutableListOf, arrayList.size() + m58881t);
                    for (int i = 0; i < m58881t; i++) {
                        arrayList.add(new C17731Hh1(((Number) CollectionsKt___CollectionsKt.first((List<? extends Object>) mutableListOf)).intValue(), null, 2, null));
                        mutableListOf.remove(0);
                    }
                } else if (m58880u(objectRef, ",")) {
                    m58878w(objectRef);
                } else {
                    int m58881t2 = m58881t(objectRef);
                    if (m58879v(objectRef)) {
                        str2 = m58882s(objectRef);
                    } else {
                        str2 = null;
                    }
                    arrayList.add(new C17731Hh1(m58881t2, str2));
                    m58884q(intRef, mutableListOf, m58881t2);
                    mutableListOf.remove(Integer.valueOf(m58881t2));
                }
            }
            m58883r(objectRef, ")");
            while (mutableListOf.size() > 0) {
                arrayList.add(new C17731Hh1(((Number) CollectionsKt___CollectionsKt.first((List<? extends Object>) mutableListOf)).intValue(), null, 2, null));
                mutableListOf.remove(0);
            }
            return arrayList;
        } catch (ParseError unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        } catch (NumberFormatException unused2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* renamed from: q */
    public static final void m58884q(Ref.IntRef intRef, List list, int i) {
        int i2 = i - intRef.element;
        if (i2 > 0) {
            if (i2 < 4) {
                i2 = 4;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                list.add(Integer.valueOf(intRef.element + i3 + 1));
            }
            intRef.element += i2;
        }
    }

    /* renamed from: r */
    public static final void m58883r(Ref.ObjectRef objectRef, String str) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null && Intrinsics.areEqual(m58895f(matchResult), str)) {
            m58878w(objectRef);
            return;
        }
        throw new ParseError();
    }

    /* renamed from: s */
    public static final String m58882s(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null && m58891j(matchResult)) {
            m58878w(objectRef);
            String substring = m58895f(matchResult).substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return m58875z(substring, "c#", "androidx.compose.");
        }
        throw new ParseError();
    }

    /* renamed from: t */
    public static final int m58881t(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null && m58894g(matchResult)) {
            m58878w(objectRef);
            return m58877x(m58895f(matchResult));
        }
        throw new ParseError();
    }

    /* renamed from: u */
    public static final boolean m58880u(Ref.ObjectRef objectRef, String str) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null && !Intrinsics.areEqual(m58895f(matchResult), str)) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final IntRect union(@NotNull IntRect intRect, @NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(intRect, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        IntRect intRect2 = f31728a;
        if (Intrinsics.areEqual(intRect, intRect2)) {
            return other;
        }
        if (Intrinsics.areEqual(other, intRect2)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), other.getLeft()), Math.min(intRect.getTop(), other.getTop()), Math.max(intRect.getRight(), other.getRight()), Math.max(intRect.getBottom(), other.getBottom()));
    }

    /* renamed from: v */
    public static final boolean m58879v(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null && m58891j(matchResult)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatchResult, T] */
    /* renamed from: w */
    public static final MatchResult m58878w(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.element;
        if (matchResult != null) {
            objectRef.element = matchResult.next();
        }
        return (MatchResult) objectRef.element;
    }

    /* renamed from: x */
    public static final int m58877x(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    /* renamed from: y */
    public static final int m58876y(String str, int i) {
        try {
            return Integer.parseInt(str, AbstractC12026a.checkRadix(i));
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    /* renamed from: z */
    public static final String m58875z(String str, String str2, String str3) {
        if (AbstractC20204hN1.startsWith$default(str, str2, false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }
}
