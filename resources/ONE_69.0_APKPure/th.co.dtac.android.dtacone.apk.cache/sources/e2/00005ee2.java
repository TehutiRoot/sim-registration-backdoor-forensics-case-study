package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010'0&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, m29142d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "T", "<init>", "()V", "value", "", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "isValid$runtime_release", "()Z", "isValid", "", "hash", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;I)I", "midIndex", "valueHash", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILjava/lang/Object;I)I", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "size", "", "[I", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Landroidx/compose/runtime/WeakReference;", OperatorName.CURVE_TO, "[Landroidx/compose/runtime/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/WeakReference;)V", "values", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SnapshotWeakSet<T> {

    /* renamed from: a */
    public int f28873a;

    /* renamed from: b */
    public int[] f28874b = new int[16];

    /* renamed from: c */
    public WeakReference[] f28875c = new WeakReference[16];

    /* renamed from: a */
    public final int m59826a(Object obj, int i) {
        T t;
        int i2 = this.f28873a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f28874b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 > i) {
                i2 = i4 - 1;
            } else {
                WeakReference weakReference = this.f28875c[i4];
                if (weakReference != null) {
                    t = weakReference.get();
                } else {
                    t = null;
                }
                if (obj == t) {
                    return i4;
                }
                return m59825b(i4, obj, i);
            }
        }
        return -(i3 + 1);
    }

    public final boolean add(@NotNull T value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        int i2 = this.f28873a;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        if (i2 > 0) {
            i = m59826a(value, identityHashCode);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        WeakReference[] weakReferenceArr = this.f28875c;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            WeakReference[] weakReferenceArr2 = new WeakReference[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(weakReferenceArr, weakReferenceArr2, i5, i3, i2);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f28875c, weakReferenceArr2, 0, 0, i3, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto(this.f28874b, iArr, i5, i3, i2);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f28874b, iArr, 0, 0, i3, 6, (Object) null);
            this.f28875c = weakReferenceArr2;
            this.f28874b = iArr;
        } else {
            int i6 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(weakReferenceArr, weakReferenceArr, i6, i3, i2);
            int[] iArr2 = this.f28874b;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i6, i3, i2);
        }
        this.f28875c[i3] = new WeakReference(value);
        this.f28874b[i3] = identityHashCode;
        this.f28873a++;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        return -(r4 + 1);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m59825b(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f28874b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.WeakReference[] r2 = r3.f28875c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f28873a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f28874b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.WeakReference[] r2 = r3.f28875c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f28873a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.m59825b(int, java.lang.Object, int):int");
    }

    @NotNull
    public final int[] getHashes$runtime_release() {
        return this.f28874b;
    }

    public final int getSize$runtime_release() {
        return this.f28873a;
    }

    @NotNull
    public final WeakReference<T>[] getValues$runtime_release() {
        return this.f28875c;
    }

    public final boolean isValid$runtime_release() {
        WeakReference weakReference;
        int i = this.f28873a;
        WeakReference[] weakReferenceArr = this.f28875c;
        int[] iArr = this.f28874b;
        int length = weakReferenceArr.length;
        if (i > length) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i4 < i2 || (weakReference = weakReferenceArr[i3]) == null) {
                return false;
            }
            T t = weakReference.get();
            if (t != null && i4 != ActualJvm_jvmKt.identityHashCode(t)) {
                return false;
            }
            i3++;
            i2 = i4;
        }
        while (i < length) {
            if (iArr[i] != 0 || weakReferenceArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final void removeIf(@NotNull Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size$runtime_release = getSize$runtime_release();
        int i = 0;
        int i2 = 0;
        while (true) {
            T t = null;
            if (i >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i];
            if (weakReference != null) {
                t = weakReference.get();
            }
            if (t != null && !block.invoke(t).booleanValue()) {
                if (i2 != i) {
                    getValues$runtime_release()[i2] = weakReference;
                    getHashes$runtime_release()[i2] = getHashes$runtime_release()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size$runtime_release; i3++) {
            getValues$runtime_release()[i3] = null;
            getHashes$runtime_release()[i3] = 0;
        }
        if (i2 != size$runtime_release) {
            setSize$runtime_release(i2);
        }
    }

    public final void setHashes$runtime_release(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f28874b = iArr;
    }

    public final void setSize$runtime_release(int i) {
        this.f28873a = i;
    }

    public final void setValues$runtime_release(@NotNull WeakReference<T>[] weakReferenceArr) {
        Intrinsics.checkNotNullParameter(weakReferenceArr, "<set-?>");
        this.f28875c = weakReferenceArr;
    }
}