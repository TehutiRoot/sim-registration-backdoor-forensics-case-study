package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0007\u001a#\u0010\u0011\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0007\u001a#\u0010\u0014\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001b\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0004\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u0004\u001a#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001f\u0010\u0004\u001a#\u0010 \u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010\u001e\u001a\u001b\u0010#\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010\u0004\u001a#\u0010$\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b$\u0010!\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b%\u0010\u001e\u001a\u001b\u0010&\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b&\u0010\u0004\u001a#\u0010'\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b'\u0010!\u001a'\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0002¢\u0006\u0004\b*\u0010+\u001a#\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b,\u0010\u001e\u001a\u001b\u0010-\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b-\u0010\u0004\u001a#\u0010/\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0004\b/\u0010!\u001a#\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b0\u0010\u001e\u001aK\u00107\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0001H\u0002¢\u0006\u0004\b7\u00108\u001a3\u0010>\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0001H\u0002¢\u0006\u0004\b>\u0010?\u001a3\u0010A\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0001H\u0002¢\u0006\u0004\bA\u0010?¨\u0006B"}, m28850d2 = {"", "", "address", OperatorName.CLOSE_PATH, "([II)I", "", "o", "([II)Z", "u", OperatorName.MOVE_TO, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.NON_STROKING_CMYK, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "([II)V", OperatorName.LINE_TO, "value", ExifInterface.LONGITUDE_EAST, "([IIZ)V", "d", "B", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "A", "e", "(I)I", "p", "len", "", OperatorName.SAVE, "([II)Ljava/util/List;", OperatorName.CLOSE_AND_STROKE, "F", "([III)V", "t", OperatorName.SET_LINE_WIDTH, OperatorName.STROKING_COLOR_GRAY, "x", "i", "D", "", "indices", "z", "([ILjava/lang/Iterable;)Ljava/util/List;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.FILL_NON_ZERO, "anchor", "C", OperatorName.NON_STROKING_GRAY, Action.KEY_ATTRIBUTE, "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", OperatorName.ENDPATH, "([IIIZZZII)V", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.LOCATION, "effectiveSize", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Ljava/util/ArrayList;II)I", FirebaseAnalytics.Param.INDEX, PDPageLabelRange.STYLE_ROMAN_LOWER, "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3471:1\n82#2,3:3472\n33#2,4:3475\n85#2,2:3479\n38#2:3481\n87#2:3482\n1#3:3483\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3274#1:3472,3\n3274#1:3475,4\n3274#1:3479,2\n3274#1:3481\n3274#1:3482\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTableKt {
    /* renamed from: A */
    public static final int m60203A(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m60192e(iArr[i2 + 1] >> 28);
    }

    /* renamed from: B */
    public static final void m60202B(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    /* renamed from: C */
    public static final void m60201C(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* renamed from: D */
    public static final void m60200D(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* renamed from: E */
    public static final void m60199E(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    /* renamed from: F */
    public static final void m60198F(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* renamed from: G */
    public static final void m60197G(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    /* renamed from: a */
    public static final void m60196a(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | 268435456;
    }

    public static final /* synthetic */ int access$auxIndex(int[] iArr, int i) {
        return m60195b(iArr, i);
    }

    public static final /* synthetic */ boolean access$containsAnyMark(int[] iArr, int i) {
        return m60194c(iArr, i);
    }

    public static final /* synthetic */ boolean access$containsMark(int[] iArr, int i) {
        return m60193d(iArr, i);
    }

    public static final /* synthetic */ int access$dataAnchor(int[] iArr, int i) {
        return m60191f(iArr, i);
    }

    public static final /* synthetic */ int access$groupSize(int[] iArr, int i) {
        return m60188i(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasAux(int[] iArr, int i) {
        return m60186k(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasMark(int[] iArr, int i) {
        return m60185l(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasObjectKey(int[] iArr, int i) {
        return m60184m(iArr, i);
    }

    public static final /* synthetic */ boolean access$isNode(int[] iArr, int i) {
        return m60182o(iArr, i);
    }

    public static final /* synthetic */ int access$key(int[] iArr, int i) {
        return m60181p(iArr, i);
    }

    public static final /* synthetic */ int access$nodeCount(int[] iArr, int i) {
        return m60178s(iArr, i);
    }

    public static final /* synthetic */ int access$nodeIndex(int[] iArr, int i) {
        return m60176u(iArr, i);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] iArr, int i) {
        return m60175v(iArr, i);
    }

    public static final /* synthetic */ int access$parentAnchor(int[] iArr, int i) {
        return m60174w(iArr, i);
    }

    public static final /* synthetic */ int access$search(ArrayList arrayList, int i, int i2) {
        return m60172y(arrayList, i, i2);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] iArr, int i) {
        return m60203A(iArr, i);
    }

    /* renamed from: b */
    public static final int m60195b(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m60192e(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* renamed from: c */
    public static final boolean m60194c(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m60193d(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final int m60192e(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: f */
    public static final int m60191f(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: g */
    public static final List m60190g(int[] iArr, int i) {
        return m60171z(iArr, AbstractC11719c.step(AbstractC11719c.until(4, i), 5));
    }

    /* renamed from: h */
    public static final int m60189h(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* renamed from: i */
    public static final int m60188i(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: j */
    public static final List m60187j(int[] iArr, int i) {
        return m60171z(iArr, AbstractC11719c.step(AbstractC11719c.until(3, i), 5));
    }

    /* renamed from: k */
    public static final boolean m60186k(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m60185l(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m60184m(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final void m60183n(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = PKIFailureInfo.duplicateCertReq;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = 268435456;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* renamed from: o */
    public static final boolean m60182o(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final int m60181p(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* renamed from: q */
    public static final List m60180q(int[] iArr, int i) {
        return m60171z(iArr, AbstractC11719c.step(AbstractC11719c.until(0, i), 5));
    }

    /* renamed from: r */
    public static final int m60179r(ArrayList arrayList, int i, int i2) {
        int m60172y = m60172y(arrayList, i, i2);
        if (m60172y < 0) {
            return -(m60172y + 1);
        }
        return m60172y;
    }

    /* renamed from: s */
    public static final int m60178s(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: t */
    public static final List m60177t(int[] iArr, int i) {
        List m60171z = m60171z(iArr, AbstractC11719c.step(AbstractC11719c.until(1, i), 5));
        ArrayList arrayList = new ArrayList(m60171z.size());
        int size = m60171z.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(((Number) m60171z.get(i2)).intValue() & 67108863));
        }
        return arrayList;
    }

    /* renamed from: u */
    public static final int m60176u(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: v */
    public static final int m60175v(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m60192e(iArr[i2 + 1] >> 30);
    }

    /* renamed from: w */
    public static final int m60174w(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* renamed from: x */
    public static final List m60173x(int[] iArr, int i) {
        return m60171z(iArr, AbstractC11719c.step(AbstractC11719c.until(2, i), 5));
    }

    /* renamed from: y */
    public static final int m60172y(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location$runtime_release = ((Anchor) arrayList.get(i4)).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i2;
            }
            int compare = Intrinsics.compare(location$runtime_release, i);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: z */
    public static final List m60171z(int[] iArr, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[((Number) it.next()).intValue()]));
        }
        return arrayList;
    }
}
