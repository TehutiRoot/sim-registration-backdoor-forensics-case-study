package androidx.compose.runtime.snapshots;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006#"}, m29142d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", "default", "lowestOrDefault", "(I)I", "value", ProductAction.ACTION_ADD, "handle", "", ProductAction.ACTION_REMOVE, "(I)V", "validate", "validateHandle", "(II)V", FirebaseAnalytics.Param.INDEX, "e", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.FILL_NON_ZERO, "atLeast", "()I", OperatorName.CURVE_TO, "<set-?>", "I", "getSize", "size", "", "[I", "values", "handles", "firstFreeHandle", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SnapshotDoubleIndexHeap {

    /* renamed from: a */
    public int f28818a;

    /* renamed from: b */
    public int[] f28819b = new int[16];

    /* renamed from: c */
    public int[] f28820c = new int[16];

    /* renamed from: d */
    public int[] f28821d;

    /* renamed from: e */
    public int f28822e;

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f28821d = iArr;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i);
    }

    /* renamed from: a */
    public final int m59878a() {
        int length = this.f28821d.length;
        if (this.f28822e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.f28821d, iArr, 0, 0, 0, 14, (Object) null);
            this.f28821d = iArr;
        }
        int i4 = this.f28822e;
        this.f28822e = this.f28821d[i4];
        return i4;
    }

    public final int add(int i) {
        m59877b(this.f28818a + 1);
        int i2 = this.f28818a;
        this.f28818a = i2 + 1;
        int m59878a = m59878a();
        this.f28819b[i2] = i;
        this.f28820c[i2] = m59878a;
        this.f28821d[m59878a] = i2;
        m59874e(i2);
        return m59878a;
    }

    /* renamed from: b */
    public final void m59877b(int i) {
        int[] iArr = this.f28819b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(this.f28820c, iArr3, 0, 0, 0, 14, (Object) null);
        this.f28819b = iArr2;
        this.f28820c = iArr3;
    }

    /* renamed from: c */
    public final void m59876c(int i) {
        this.f28821d[i] = this.f28822e;
        this.f28822e = i;
    }

    /* renamed from: d */
    public final void m59875d(int i) {
        int i2;
        int[] iArr = this.f28819b;
        int i3 = this.f28818a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 < this.f28818a && (i2 = iArr[i4]) < iArr[i5]) {
                if (i2 < iArr[i]) {
                    m59873f(i4, i);
                    i = i4;
                } else {
                    return;
                }
            } else if (iArr[i5] < iArr[i]) {
                m59873f(i5, i);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void m59874e(int i) {
        int[] iArr = this.f28819b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                m59873f(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void m59873f(int i, int i2) {
        int[] iArr = this.f28819b;
        int[] iArr2 = this.f28820c;
        int[] iArr3 = this.f28821d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public final int getSize() {
        return this.f28818a;
    }

    public final int lowestOrDefault(int i) {
        if (this.f28818a > 0) {
            return this.f28819b[0];
        }
        return i;
    }

    public final void remove(int i) {
        int i2 = this.f28821d[i];
        m59873f(i2, this.f28818a - 1);
        this.f28818a--;
        m59874e(i2);
        m59875d(i2);
        m59876c(i);
    }

    public final void validate() {
        int i = this.f28818a;
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            int[] iArr = this.f28819b;
            if (iArr[(i3 >> 1) - 1] <= iArr[i2]) {
                i2 = i3;
            } else {
                throw new IllegalStateException(("Index " + i2 + " is out of place").toString());
            }
        }
    }

    public final void validateHandle(int i, int i2) {
        int i3 = this.f28821d[i];
        if (this.f28820c[i3] == i) {
            if (this.f28819b[i3] == i2) {
                return;
            }
            throw new IllegalStateException(("Value for handle " + i + " was " + this.f28819b[i3] + " but was supposed to be " + i2).toString());
        }
        throw new IllegalStateException(("Index for handle " + i + " is corrupted").toString());
    }
}