package androidx.compose.runtime;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b/\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u000eJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0014J\u001f\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020'¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020'¢\u0006\u0004\b+\u0010)J\r\u0010,\u001a\u00020'¢\u0006\u0004\b,\u0010)J\r\u0010-\u001a\u00020'¢\u0006\u0004\b-\u0010)J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020'¢\u0006\u0004\b0\u0010)J\u0015\u00101\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020'¢\u0006\u0004\b4\u0010)J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020605¢\u0006\u0004\b7\u00108JQ\u0010@\u001a\u00020'2\u0006\u0010#\u001a\u00020\u000728\u0010=\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020'09H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010K\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010JR$\u0010W\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010Z\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010/R$\u0010]\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010J\u001a\u0004\b\\\u0010/R$\u0010\r\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010J\u001a\u0004\b_\u0010/R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010JR\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010JR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010JR\u0011\u0010g\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bf\u0010/R\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010/R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010VR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bj\u0010/R\u0011\u0010k\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bk\u0010VR\u0011\u0010m\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bl\u0010VR\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bn\u0010/R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bo\u0010/R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bp\u0010/R\u0011\u0010r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bq\u0010/R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bs\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bt\u0010&R\u0013\u0010v\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bu\u0010&R\u0011\u0010x\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bw\u0010/R\u0011\u0010z\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\by\u0010/¨\u0006{"}, m28850d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "", FirebaseAnalytics.Param.INDEX, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "([II)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CURVE_TO, "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "block", "forEachData$runtime_release", "(ILkotlin/jvm/functions/Function2;)V", "forEachData", "", "toString", "()Ljava/lang/String;", "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "[I", "groups", "I", "groupsSize", "", "d", "[Ljava/lang/Object;", "slots", "e", "slotsSize", "<set-?>", OperatorName.FILL_NON_ZERO, "Z", "getClosed", "()Z", "closed", OperatorName.NON_STROKING_GRAY, "getCurrentGroup", "currentGroup", OperatorName.CLOSE_PATH, "getCurrentEnd", "currentEnd", "i", "getParent", OperatorName.SET_LINE_JOINSTYLE, "emptyCount", OperatorName.NON_STROKING_CMYK, "currentSlot", OperatorName.LINE_TO, "currentSlotEnd", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getGroupSlotCount", "groupSlotCount", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3471:1\n1#2:3472\n4548#3,5:3473\n4548#3,5:3478\n4548#3,5:3483\n4548#3,5:3488\n4548#3,5:3493\n3351#4,6:3498\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n963#1:3473,5\n973#1:3478,5\n981#1:3483,5\n1000#1:3488,5\n1014#1:3493,5\n1065#1:3498,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotReader {

    /* renamed from: a */
    public final SlotTable f28418a;

    /* renamed from: b */
    public final int[] f28419b;

    /* renamed from: c */
    public final int f28420c;

    /* renamed from: d */
    public final Object[] f28421d;

    /* renamed from: e */
    public final int f28422e;

    /* renamed from: f */
    public boolean f28423f;

    /* renamed from: g */
    public int f28424g;

    /* renamed from: h */
    public int f28425h;

    /* renamed from: i */
    public int f28426i;

    /* renamed from: j */
    public int f28427j;

    /* renamed from: k */
    public int f28428k;

    /* renamed from: l */
    public int f28429l;

    public SlotReader(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f28418a = table;
        this.f28419b = table.getGroups();
        int groupsSize = table.getGroupsSize();
        this.f28420c = groupsSize;
        this.f28421d = table.getSlots();
        this.f28422e = table.getSlotsSize();
        this.f28425h = groupsSize;
        this.f28426i = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.f28424g;
        }
        return slotReader.anchor(i);
    }

    /* renamed from: a */
    public final Object m60211a(int[] iArr, int i) {
        boolean m60186k;
        int m60195b;
        m60186k = SlotTableKt.m60186k(iArr, i);
        if (m60186k) {
            Object[] objArr = this.f28421d;
            m60195b = SlotTableKt.m60195b(iArr, i);
            return objArr[m60195b];
        }
        return Composer.Companion.getEmpty();
    }

    @NotNull
    public final Anchor anchor(int i) {
        int m60172y;
        ArrayList<Anchor> anchors$runtime_release = this.f28418a.getAnchors$runtime_release();
        m60172y = SlotTableKt.m60172y(anchors$runtime_release, i, this.f28420c);
        if (m60172y < 0) {
            Anchor anchor = new Anchor(i);
            anchors$runtime_release.add(-(m60172y + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(m60172y);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    /* renamed from: b */
    public final Object m60210b(int[] iArr, int i) {
        boolean m60182o;
        int m60176u;
        m60182o = SlotTableKt.m60182o(iArr, i);
        if (m60182o) {
            Object[] objArr = this.f28421d;
            m60176u = SlotTableKt.m60176u(iArr, i);
            return objArr[m60176u];
        }
        return Composer.Companion.getEmpty();
    }

    public final void beginEmpty() {
        this.f28427j++;
    }

    /* renamed from: c */
    public final Object m60209c(int[] iArr, int i) {
        boolean m60184m;
        int m60175v;
        m60184m = SlotTableKt.m60184m(iArr, i);
        if (m60184m) {
            Object[] objArr = this.f28421d;
            m60175v = SlotTableKt.m60175v(iArr, i);
            return objArr[m60175v];
        }
        return null;
    }

    public final void close() {
        this.f28423f = true;
        this.f28418a.close$runtime_release(this);
    }

    public final boolean containsMark(int i) {
        boolean m60193d;
        m60193d = SlotTableKt.m60193d(this.f28419b, i);
        return m60193d;
    }

    public final void endEmpty() {
        int i = this.f28427j;
        if (i > 0) {
            this.f28427j = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void endGroup() {
        boolean z;
        int m60174w;
        int m60188i;
        int i;
        if (this.f28427j == 0) {
            if (this.f28424g == this.f28425h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m60174w = SlotTableKt.m60174w(this.f28419b, this.f28426i);
                this.f28426i = m60174w;
                if (m60174w >= 0) {
                    m60188i = SlotTableKt.m60188i(this.f28419b, m60174w);
                    i = m60174w + m60188i;
                } else {
                    i = this.f28420c;
                }
                this.f28425h = i;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        int m60181p;
        boolean m60182o;
        int m60178s;
        int i;
        int m60188i;
        ArrayList arrayList = new ArrayList();
        if (this.f28427j > 0) {
            return arrayList;
        }
        int i2 = this.f28424g;
        int i3 = 0;
        while (i2 < this.f28425h) {
            m60181p = SlotTableKt.m60181p(this.f28419b, i2);
            Object m60209c = m60209c(this.f28419b, i2);
            m60182o = SlotTableKt.m60182o(this.f28419b, i2);
            if (!m60182o) {
                m60178s = SlotTableKt.m60178s(this.f28419b, i2);
                i = m60178s;
            } else {
                i = 1;
            }
            arrayList.add(new KeyInfo(m60181p, m60209c, i2, i, i3));
            m60188i = SlotTableKt.m60188i(this.f28419b, i2);
            i2 += m60188i;
            i3++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int i, @NotNull Function2<? super Integer, Object, Unit> block) {
        int m60203A;
        int slotsSize;
        Intrinsics.checkNotNullParameter(block, "block");
        m60203A = SlotTableKt.m60203A(this.f28419b, i);
        int i2 = i + 1;
        if (i2 < this.f28418a.getGroupsSize()) {
            slotsSize = SlotTableKt.m60191f(this.f28418a.getGroups(), i2);
        } else {
            slotsSize = this.f28418a.getSlotsSize();
        }
        for (int i3 = m60203A; i3 < slotsSize; i3++) {
            block.invoke(Integer.valueOf(i3 - m60203A), this.f28421d[i3]);
        }
    }

    @Nullable
    public final Object get(int i) {
        int i2 = this.f28428k + i;
        if (i2 < this.f28429l) {
            return this.f28421d[i2];
        }
        return Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.f28423f;
    }

    public final int getCurrentEnd() {
        return this.f28425h;
    }

    public final int getCurrentGroup() {
        return this.f28424g;
    }

    @Nullable
    public final Object getGroupAux() {
        int i = this.f28424g;
        if (i < this.f28425h) {
            return m60211a(this.f28419b, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.f28425h;
    }

    public final int getGroupKey() {
        int m60181p;
        int i = this.f28424g;
        if (i < this.f28425h) {
            m60181p = SlotTableKt.m60181p(this.f28419b, i);
            return m60181p;
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i = this.f28424g;
        if (i < this.f28425h) {
            return m60210b(this.f28419b, i);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i = this.f28424g;
        if (i < this.f28425h) {
            return m60209c(this.f28419b, i);
        }
        return null;
    }

    public final int getGroupSize() {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f28419b, this.f28424g);
        return m60188i;
    }

    public final int getGroupSlotCount() {
        int m60203A;
        int i;
        int i2 = this.f28424g;
        m60203A = SlotTableKt.m60203A(this.f28419b, i2);
        int i3 = i2 + 1;
        if (i3 < this.f28420c) {
            i = SlotTableKt.m60191f(this.f28419b, i3);
        } else {
            i = this.f28422e;
        }
        return i - m60203A;
    }

    public final int getGroupSlotIndex() {
        int m60203A;
        int i = this.f28428k;
        m60203A = SlotTableKt.m60203A(this.f28419b, this.f28426i);
        return i - m60203A;
    }

    public final boolean getInEmpty() {
        if (this.f28427j > 0) {
            return true;
        }
        return false;
    }

    public final int getNodeCount() {
        int m60178s;
        m60178s = SlotTableKt.m60178s(this.f28419b, this.f28424g);
        return m60178s;
    }

    public final int getParent() {
        return this.f28426i;
    }

    public final int getParentNodes() {
        int m60178s;
        int i = this.f28426i;
        if (i >= 0) {
            m60178s = SlotTableKt.m60178s(this.f28419b, i);
            return m60178s;
        }
        return 0;
    }

    public final int getSize() {
        return this.f28420c;
    }

    public final int getSlot() {
        int m60203A;
        int i = this.f28428k;
        m60203A = SlotTableKt.m60203A(this.f28419b, this.f28426i);
        return i - m60203A;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.f28418a;
    }

    @Nullable
    public final Object groupAux(int i) {
        return m60211a(this.f28419b, i);
    }

    public final int groupEnd(int i) {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f28419b, i);
        return i + m60188i;
    }

    @Nullable
    public final Object groupGet(int i) {
        return groupGet(this.f28424g, i);
    }

    public final int groupKey(int i) {
        int m60181p;
        m60181p = SlotTableKt.m60181p(this.f28419b, i);
        return m60181p;
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        return m60209c(this.f28419b, i);
    }

    public final int groupSize(int i) {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f28419b, i);
        return m60188i;
    }

    public final boolean hasMark(int i) {
        boolean m60185l;
        m60185l = SlotTableKt.m60185l(this.f28419b, i);
        return m60185l;
    }

    public final boolean hasObjectKey(int i) {
        boolean m60184m;
        m60184m = SlotTableKt.m60184m(this.f28419b, i);
        return m60184m;
    }

    public final boolean isGroupEnd() {
        if (!getInEmpty() && this.f28424g != this.f28425h) {
            return false;
        }
        return true;
    }

    public final boolean isNode() {
        boolean m60182o;
        m60182o = SlotTableKt.m60182o(this.f28419b, this.f28424g);
        return m60182o;
    }

    @Nullable
    public final Object next() {
        int i;
        if (this.f28427j <= 0 && (i = this.f28428k) < this.f28429l) {
            Object[] objArr = this.f28421d;
            this.f28428k = i + 1;
            return objArr[i];
        }
        return Composer.Companion.getEmpty();
    }

    @Nullable
    public final Object node(int i) {
        boolean m60182o;
        m60182o = SlotTableKt.m60182o(this.f28419b, i);
        if (m60182o) {
            return m60210b(this.f28419b, i);
        }
        return null;
    }

    public final int nodeCount(int i) {
        int m60178s;
        m60178s = SlotTableKt.m60178s(this.f28419b, i);
        return m60178s;
    }

    public final int parent(int i) {
        int m60174w;
        m60174w = SlotTableKt.m60174w(this.f28419b, i);
        return m60174w;
    }

    public final int parentOf(int i) {
        int m60174w;
        if (i >= 0 && i < this.f28420c) {
            m60174w = SlotTableKt.m60174w(this.f28419b, i);
            return m60174w;
        }
        throw new IllegalArgumentException(("Invalid group index " + i).toString());
    }

    public final void reposition(int i) {
        boolean z;
        int i2;
        int m60188i;
        if (this.f28427j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28424g = i;
            if (i < this.f28420c) {
                i2 = SlotTableKt.m60174w(this.f28419b, i);
            } else {
                i2 = -1;
            }
            this.f28426i = i2;
            if (i2 >= 0) {
                m60188i = SlotTableKt.m60188i(this.f28419b, i2);
                this.f28425h = i2 + m60188i;
            } else {
                this.f28425h = this.f28420c;
            }
            this.f28428k = 0;
            this.f28429l = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void restoreParent(int i) {
        int m60188i;
        boolean z;
        m60188i = SlotTableKt.m60188i(this.f28419b, i);
        int i2 = m60188i + i;
        int i3 = this.f28424g;
        if (i3 >= i && i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28426i = i;
            this.f28425h = i2;
            this.f28428k = 0;
            this.f28429l = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    public final int skipGroup() {
        boolean z;
        boolean m60182o;
        int m60188i;
        int i = 1;
        if (this.f28427j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m60182o = SlotTableKt.m60182o(this.f28419b, this.f28424g);
            if (!m60182o) {
                i = SlotTableKt.m60178s(this.f28419b, this.f28424g);
            }
            int i2 = this.f28424g;
            m60188i = SlotTableKt.m60188i(this.f28419b, i2);
            this.f28424g = i2 + m60188i;
            return i;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void skipToGroupEnd() {
        boolean z;
        if (this.f28427j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28424g = this.f28425h;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void startGroup() {
        int m60174w;
        int m60188i;
        int m60203A;
        int m60191f;
        if (this.f28427j <= 0) {
            m60174w = SlotTableKt.m60174w(this.f28419b, this.f28424g);
            if (m60174w == this.f28426i) {
                int i = this.f28424g;
                this.f28426i = i;
                m60188i = SlotTableKt.m60188i(this.f28419b, i);
                this.f28425h = i + m60188i;
                int i2 = this.f28424g;
                int i3 = i2 + 1;
                this.f28424g = i3;
                m60203A = SlotTableKt.m60203A(this.f28419b, i2);
                this.f28428k = m60203A;
                if (i2 < this.f28420c - 1) {
                    m60191f = SlotTableKt.m60191f(this.f28419b, i3);
                } else {
                    m60191f = this.f28422e;
                }
                this.f28429l = m60191f;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        boolean m60182o;
        if (this.f28427j <= 0) {
            m60182o = SlotTableKt.m60182o(this.f28419b, this.f28424g);
            if (m60182o) {
                startGroup();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.f28424g + ", key=" + getGroupKey() + ", parent=" + this.f28426i + ", end=" + this.f28425h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Nullable
    public final Object groupGet(int i, int i2) {
        int m60203A;
        m60203A = SlotTableKt.m60203A(this.f28419b, i);
        int i3 = i + 1;
        int i4 = m60203A + i2;
        return i4 < (i3 < this.f28420c ? SlotTableKt.m60191f(this.f28419b, i3) : this.f28422e) ? this.f28421d[i4] : Composer.Companion.getEmpty();
    }

    public final int groupKey(@NotNull Anchor anchor) {
        int m60181p;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            m60181p = SlotTableKt.m60181p(this.f28419b, this.f28418a.anchorIndex(anchor));
            return m60181p;
        }
        return 0;
    }

    public final boolean isNode(int i) {
        boolean m60182o;
        m60182o = SlotTableKt.m60182o(this.f28419b, i);
        return m60182o;
    }
}
