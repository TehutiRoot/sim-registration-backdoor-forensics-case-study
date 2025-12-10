package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b$\u0010%JW\u0010&\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00162\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00162\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00180.j\b\u0012\u0004\u0012\u00020\u0018`/H\u0000¢\u0006\u0004\b$\u00101JO\u00104\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00162\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00162\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00180.j\b\u0012\u0004\u0012\u00020\u0018`/H\u0000¢\u0006\u0004\b2\u00103J\u001f\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001062\u0006\u00105\u001a\u00020\u0016H\u0000¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020\u001d¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020#¢\u0006\u0004\b=\u0010\u0005J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+062\u0006\u0010A\u001a\u00020\u0016H\u0000¢\u0006\u0004\bB\u00109J!\u0010G\u001a\u0004\u0018\u00010+2\u0006\u0010A\u001a\u00020\u00162\u0006\u0010D\u001a\u00020\u0016H\u0000¢\u0006\u0004\bE\u0010FJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030HH\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010L\u001a\u0004\u0018\u00010\u00032\u0006\u0010K\u001a\u00020+H\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u0004\u0018\u0001072\u0006\u0010A\u001a\u00020\u0016H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010S\u001a\u00020\u0016*\u00060Pj\u0002`Q2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010TR$\u0010(\u001a\u00020'2\u0006\u0010U\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010V\u001a\u0004\bW\u0010XR$\u0010)\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R4\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u000e\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010]\u001a\u0004\b^\u0010_R$\u0010-\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010\\R\u0016\u0010c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ZR$\u0010\u0010\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010<R\"\u0010k\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010Z\u001a\u0004\bh\u0010\\\"\u0004\bi\u0010jR2\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00180.j\b\u0012\u0004\u0012\u00020\u0018`/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010<R\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006v"}, m28850d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "name", "reader", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "close", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo", TypedValues.AttributesType.S_TARGET, "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "()Z", "verifyWellFormed", "", "asString", "()Ljava/lang/String;", "group", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", OperatorName.CURVE_TO, "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/StringBuilder;II)I", "<set-?>", "[I", "getGroups", "()[I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "d", "getSlotsSize", "e", "readers", OperatorName.FILL_NON_ZERO, "Z", "getWriter$runtime_release", OperatorName.NON_STROKING_GRAY, "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", ClientCookie.VERSION_ATTR, OperatorName.CLOSE_PATH, "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3471:1\n146#1,8:3514\n162#1,4:3522\n167#1,3:3532\n4548#2,5:3472\n4548#2,5:3477\n4548#2,5:3482\n4548#2,5:3494\n4548#2,5:3499\n4548#2,5:3504\n4548#2,5:3509\n1#3:3487\n3351#4,6:3488\n33#5,6:3526\n33#5,6:3535\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3514,8\n338#1:3522,4\n338#1:3532,3\n190#1:3472,5\n191#1:3477,5\n207#1:3482,5\n221#1:3494,5\n241#1:3499,5\n242#1:3504,5\n251#1:3509,5\n209#1:3488,6\n340#1:3526,6\n484#1:3535,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {

    /* renamed from: b */
    public int f28431b;

    /* renamed from: d */
    public int f28433d;

    /* renamed from: e */
    public int f28434e;

    /* renamed from: f */
    public boolean f28435f;

    /* renamed from: g */
    public int f28436g;

    /* renamed from: a */
    public int[] f28430a = new int[0];

    /* renamed from: c */
    public Object[] f28432c = new Object[0];

    /* renamed from: h */
    public ArrayList f28437h = new ArrayList();

    /* renamed from: b */
    public static final int m60207b(SlotTable slotTable, int i) {
        if (i >= slotTable.f28431b) {
            return slotTable.f28433d;
        }
        return SlotTableKt.access$dataAnchor(slotTable.f28430a, i);
    }

    /* renamed from: e */
    public static final void m60205e(SlotReader slotReader, int i, List list, Ref.BooleanRef booleanRef, SlotTable slotTable, List list2) {
        if (slotReader.getGroupKey() == i) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            if (booleanRef.element) {
                RecomposeScopeImpl m60206c = slotTable.m60206c(slotReader.getCurrentGroup());
                if (m60206c != null) {
                    list2.add(m60206c);
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            m60205e(slotReader, i, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    /* renamed from: f */
    public static final int m60204f(Ref.IntRef intRef, SlotTable slotTable, int i, int i2) {
        int access$dataAnchor;
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.f28430a, i3);
        if (access$parentAnchor == i) {
            int access$groupSize = SlotTableKt.access$groupSize(slotTable.f28430a, i3) + i3;
            if (access$groupSize <= slotTable.f28431b) {
                if (access$groupSize <= i2) {
                    int access$dataAnchor2 = SlotTableKt.access$dataAnchor(slotTable.f28430a, i3);
                    if (i3 >= slotTable.f28431b - 1) {
                        access$dataAnchor = slotTable.f28433d;
                    } else {
                        access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.f28430a, i4);
                    }
                    if (access$dataAnchor <= slotTable.f28432c.length) {
                        if (access$dataAnchor2 <= access$dataAnchor) {
                            if (SlotTableKt.access$slotAnchor(slotTable.f28430a, i3) <= access$dataAnchor) {
                                if (access$dataAnchor - access$dataAnchor2 >= (SlotTableKt.access$isNode(slotTable.f28430a, i3) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.f28430a, i3) ? 1 : 0) + (SlotTableKt.access$hasAux(slotTable.f28430a, i3) ? 1 : 0)) {
                                    boolean access$isNode = SlotTableKt.access$isNode(slotTable.f28430a, i3);
                                    if (access$isNode && slotTable.f28432c[SlotTableKt.access$nodeIndex(slotTable.f28430a, i3)] == null) {
                                        throw new IllegalStateException(("No node recorded for a node group at " + i3).toString());
                                    }
                                    int i5 = 0;
                                    while (intRef.element < access$groupSize) {
                                        i5 += m60204f(intRef, slotTable, i3, access$groupSize);
                                    }
                                    int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.f28430a, i3);
                                    int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.f28430a, i3);
                                    if (access$nodeCount == i5) {
                                        int i6 = intRef.element - i3;
                                        if (access$groupSize2 == i6) {
                                            if (SlotTableKt.access$containsAnyMark(slotTable.f28430a, i3) && i3 > 0 && !SlotTableKt.access$containsMark(slotTable.f28430a, i)) {
                                                throw new IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i3 + " does").toString());
                                            } else if (access$isNode) {
                                                return 1;
                                            } else {
                                                return i5;
                                            }
                                        }
                                        throw new IllegalStateException(("Incorrect slot count detected at " + i3 + ", expected " + access$groupSize2 + ", received " + i6).toString());
                                    }
                                    throw new IllegalStateException(("Incorrect node count detected at " + i3 + ", expected " + access$nodeCount + ", received " + i5).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i3).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i3).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i3).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i3 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i3).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i3).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + access$parentAnchor).toString());
    }

    /* renamed from: a */
    public final int m60208a(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(TokenParser.f74560SP);
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(") key=");
        sb.append(SlotTableKt.access$key(this.f28430a, i));
        int access$groupSize = SlotTableKt.access$groupSize(this.f28430a, i);
        sb.append(", nodes=");
        sb.append(SlotTableKt.access$nodeCount(this.f28430a, i));
        sb.append(", size=");
        sb.append(access$groupSize);
        if (SlotTableKt.access$hasMark(this.f28430a, i)) {
            sb.append(", mark");
        }
        if (SlotTableKt.access$containsMark(this.f28430a, i)) {
            sb.append(", contains mark");
        }
        int m60207b = m60207b(this, i);
        int i4 = i + 1;
        int m60207b2 = m60207b(this, i4);
        if (m60207b >= 0 && m60207b <= m60207b2 && m60207b2 <= this.f28433d) {
            if (SlotTableKt.access$hasObjectKey(this.f28430a, i)) {
                sb.append(" objectKey=" + this.f28432c[SlotTableKt.access$objectKeyIndex(this.f28430a, i)]);
            }
            if (SlotTableKt.access$isNode(this.f28430a, i)) {
                sb.append(" node=" + this.f28432c[SlotTableKt.access$nodeIndex(this.f28430a, i)]);
            }
            if (SlotTableKt.access$hasAux(this.f28430a, i)) {
                sb.append(" aux=" + this.f28432c[SlotTableKt.access$auxIndex(this.f28430a, i)]);
            }
            int access$slotAnchor = SlotTableKt.access$slotAnchor(this.f28430a, i);
            if (access$slotAnchor < m60207b2) {
                sb.append(", slots=[");
                sb.append(access$slotAnchor);
                sb.append(": ");
                for (int i5 = access$slotAnchor; i5 < m60207b2; i5++) {
                    if (i5 != access$slotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.f28432c[i5]));
                }
                sb.append("]");
            }
        } else {
            sb.append(", *invalid data offsets " + m60207b + '-' + m60207b2 + '*');
        }
        sb.append('\n');
        int i6 = i + access$groupSize;
        while (i4 < i6) {
            i4 += m60208a(sb, i4, i2 + 1);
        }
        return access$groupSize;
    }

    @NotNull
    public final Anchor anchor(int i) {
        int i2;
        if (!this.f28435f) {
            if (i >= 0 && i < (i2 = this.f28431b)) {
                ArrayList arrayList = this.f28437h;
                int access$search = SlotTableKt.access$search(arrayList, i, i2);
                if (access$search < 0) {
                    Anchor anchor = new Anchor(i);
                    arrayList.add(-(access$search + 1), anchor);
                    return anchor;
                }
                Object obj = arrayList.get(access$search);
                Intrinsics.checkNotNullExpressionValue(obj, "get(location)");
                return (Anchor) obj;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.f28435f) {
            if (anchor.getValid()) {
                return anchor.getLocation$runtime_release();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String asString() {
        if (this.f28435f) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.f28431b;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += m60208a(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public final RecomposeScopeImpl m60206c(int i) {
        while (i > 0) {
            Iterator it = new C0510HD(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) next;
                }
            }
            i = SlotTableKt.access$parentAnchor(this.f28430a, i);
        }
        return null;
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.getTable$runtime_release() == this && this.f28434e > 0) {
            this.f28434e--;
        } else {
            ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final boolean containsMark() {
        if (this.f28431b <= 0 || !SlotTableKt.access$containsMark(this.f28430a, 0)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
        return new RJ1(this, 0, 0, 4, null).find(identityToFind);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.f28437h;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.f28430a;
    }

    public final int getGroupsSize() {
        return this.f28431b;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.f28432c;
    }

    public final int getSlotsSize() {
        return this.f28433d;
    }

    public final int getVersion$runtime_release() {
        return this.f28436g;
    }

    public final boolean getWriter$runtime_release() {
        return this.f28435f;
    }

    public final boolean groupContainsAnchor(int i, @NotNull Anchor anchor) {
        boolean z;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.f28435f) {
            if (i >= 0 && i < this.f28431b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (ownsAnchor(anchor)) {
                    int access$groupSize = SlotTableKt.access$groupSize(this.f28430a, i) + i;
                    int location$runtime_release = anchor.getLocation$runtime_release();
                    if (i <= location$runtime_release && location$runtime_release < access$groupSize) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        SlotReader openReader = openReader();
        try {
            m60205e(openReader, i, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Anchor anchor = (Anchor) arrayList.get(i2);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashGroup$runtime_release();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close();
                if (!booleanRef.element) {
                    return null;
                }
                return arrayList2;
            } catch (Throwable th2) {
                openWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            openReader.close();
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        if (this.f28431b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new C19296c70(this, 0, this.f28431b);
    }

    @NotNull
    public final SlotReader openReader() {
        if (!this.f28435f) {
            this.f28434e++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @NotNull
    public final SlotWriter openWriter() {
        boolean z;
        if (!this.f28435f) {
            if (this.f28434e <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f28435f = true;
                this.f28436g++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        int access$search;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid() && (access$search = SlotTableKt.access$search(this.f28437h, anchor.getLocation$runtime_release(), this.f28431b)) >= 0 && Intrinsics.areEqual(this.f28437h.get(access$search), anchor)) {
            return true;
        }
        return false;
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotReader openReader = openReader();
        try {
            return block.invoke(openReader);
        } finally {
            InlineMarker.finallyStart(1);
            openReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f28437h = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int i, @NotNull Object[] slots, int i2, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.f28430a = groups;
        this.f28431b = i;
        this.f28432c = slots;
        this.f28433d = i2;
        this.f28437h = anchors;
    }

    public final void setVersion$runtime_release(int i) {
        this.f28436g = i;
    }

    @Nullable
    public final Object slot$runtime_release(int i, int i2) {
        int length;
        int access$slotAnchor = SlotTableKt.access$slotAnchor(this.f28430a, i);
        int i3 = i + 1;
        if (i3 < this.f28431b) {
            length = SlotTableKt.access$dataAnchor(this.f28430a, i3);
        } else {
            length = this.f28432c.length;
        }
        int i4 = length - access$slotAnchor;
        if (i2 >= 0 && i2 < i4) {
            return this.f28432c[access$slotAnchor + i2];
        }
        return Composer.Companion.getEmpty();
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int i) {
        int length;
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.f28430a, i);
        int i2 = i + 1;
        if (i2 < this.f28431b) {
            length = SlotTableKt.access$dataAnchor(this.f28430a, i2);
        } else {
            length = this.f28432c.length;
        }
        return ArraysKt___ArraysKt.toList(this.f28432c).subList(access$dataAnchor, length);
    }

    public final void verifyWellFormed() {
        int i;
        int i2;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = -1;
        if (this.f28431b > 0) {
            while (true) {
                i = intRef.element;
                i2 = this.f28431b;
                if (i >= i2) {
                    break;
                }
                m60204f(intRef, this, -1, i + SlotTableKt.access$groupSize(this.f28430a, i));
            }
            if (i != i2) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + this.f28431b).toString());
            }
        }
        int length = this.f28432c.length;
        for (int i4 = this.f28433d; i4 < length; i4++) {
            if (this.f28432c[i4] != null) {
                throw new IllegalStateException(("Non null value in the slot gap at index " + i4).toString());
            }
        }
        ArrayList arrayList = this.f28437h;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int indexFor = ((Anchor) arrayList.get(i5)).toIndexFor(this);
            if (indexFor >= 0 && indexFor <= this.f28431b) {
                if (i3 < indexFor) {
                    i5++;
                    i3 = indexFor;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotWriter openWriter = openWriter();
        try {
            return block.invoke(openWriter);
        } finally {
            InlineMarker.finallyStart(1);
            openWriter.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int i, @NotNull Object[] slots, int i2, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (writer.getTable$runtime_release() == this && this.f28435f) {
            this.f28435f = false;
            setTo$runtime_release(groups, i, slots, i2, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
}
