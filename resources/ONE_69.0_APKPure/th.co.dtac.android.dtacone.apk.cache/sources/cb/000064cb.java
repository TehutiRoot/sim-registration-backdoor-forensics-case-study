package androidx.compose.p003ui.text.caches;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.pattern.parser.Parser;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010\u001e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00028\u00012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b&\u0010%J\u001d\u0010'\u001a\u00028\u00012\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b+\u0010\"J%\u0010-\u001a\u00020\u00102\u0016\u0010,\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000¢\u0006\u0004\b-\u0010\tJ\u001f\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b.\u0010\"J\u0017\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u001fJ\u001d\u0010/\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b1\u0010%J\u001f\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b2\u0010\"J%\u00102\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u0001¢\u0006\u0004\b2\u00105J\u001a\u00107\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b7\u0010\u0017J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u000fJ\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010H\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u000f\"\u0004\bG\u0010\u0007R\u0017\u0010I\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\bJ\u0010\u0012\u001a\u0004\bI\u0010\u000f¨\u0006K"}, m29142d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", Action.KEY_ATTRIBUTE, "hash", "indexOf", "(Ljava/lang/Object;I)I", "indexOfNull", "()I", "", "clear", "()V", "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", "value", "indexOfValue$ui_text_release", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "array", "putAll", "putIfAbsent", ProductAction.ACTION_REMOVE, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", Parser.REPLACE_CONVERTER_WORD, "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "hashes", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[Ljava/lang/Object;", "keyValues", OperatorName.CURVE_TO, "I", "get_size", "set_size", "_size", "size", "size$annotations", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.caches.SimpleArrayMap */
/* loaded from: classes2.dex */
public final class SimpleArrayMap<K, V> {

    /* renamed from: a */
    public int[] f31309a;

    /* renamed from: b */
    public Object[] f31310b;

    /* renamed from: c */
    public int f31311c;

    @JvmOverloads
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    public final void clear() {
        if (this.f31311c > 0) {
            this.f31309a = ContainerHelpersKt.EMPTY_INTS;
            this.f31310b = ContainerHelpersKt.EMPTY_OBJECTS;
            this.f31311c = 0;
        }
        if (this.f31311c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(K k) {
        if (indexOfKey(k) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(V v) {
        if (indexOfValue$ui_text_release(v) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int i) {
        int i2 = this.f31311c;
        int[] iArr = this.f31309a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f31309a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f31310b, i << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f31310b = copyOf2;
        }
        if (this.f31311c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this.f31311c;
                if (i != simpleArrayMap.f31311c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f31311c != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.f31311c;
                for (int i4 = 0; i4 < i3; i4++) {
                    K keyAt2 = keyAt(i4);
                    V valueAt2 = valueAt(i4);
                    Object obj3 = ((Map) obj).get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(valueAt2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Nullable
    public final V get(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.f31310b[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.f31310b[(indexOfKey << 1) + 1];
        }
        return v;
    }

    public final int get_size() {
        return this.f31311c;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f31309a;
        Object[] objArr = this.f31310b;
        int i2 = this.f31311c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final int indexOf(@NotNull Object key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i2 = this.f31311c;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.f31309a, i2, i);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (Intrinsics.areEqual(key, this.f31310b[binarySearchInternal << 1])) {
            return binarySearchInternal;
        }
        int i3 = binarySearchInternal + 1;
        while (i3 < i2 && this.f31309a[i3] == i) {
            if (Intrinsics.areEqual(key, this.f31310b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearchInternal - 1; i4 >= 0 && this.f31309a[i4] == i; i4--) {
            if (Intrinsics.areEqual(key, this.f31310b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int indexOfKey(@Nullable Object obj) {
        if (obj == null) {
            return indexOfNull();
        }
        return indexOf(obj, obj.hashCode());
    }

    public final int indexOfNull() {
        int i = this.f31311c;
        if (i == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.f31309a, i, 0);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (this.f31310b[binarySearchInternal << 1] == null) {
            return binarySearchInternal;
        }
        int i2 = binarySearchInternal + 1;
        while (i2 < i && this.f31309a[i2] == 0) {
            if (this.f31310b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearchInternal - 1; i3 >= 0 && this.f31309a[i3] == 0; i3--) {
            if (this.f31310b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int indexOfValue$ui_text_release(V v) {
        int i = this.f31311c << 1;
        Object[] objArr = this.f31310b;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.areEqual(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.f31311c <= 0) {
            return true;
        }
        return false;
    }

    public final K keyAt(int i) {
        return (K) this.f31310b[i << 1];
    }

    @Nullable
    public final V put(K k, V v) {
        int hashCode;
        int indexOf;
        int i = this.f31311c;
        if (k == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            indexOf = indexOf(k, hashCode);
        }
        if (indexOf >= 0) {
            int i2 = (indexOf << 1) + 1;
            Object[] objArr = this.f31310b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~indexOf;
        int[] iArr = this.f31309a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f31309a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f31310b, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f31310b = copyOf2;
            if (i != this.f31311c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f31309a;
            int i5 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f31310b;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.f31311c << 1);
        }
        int i6 = this.f31311c;
        if (i == i6) {
            int[] iArr3 = this.f31309a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f31310b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.f31311c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(@NotNull SimpleArrayMap<? extends K, ? extends V> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i = array.f31311c;
        ensureCapacity(this.f31311c + i);
        if (this.f31311c == 0) {
            if (i > 0) {
                ArraysKt___ArraysJvmKt.copyInto(array.f31309a, this.f31309a, 0, 0, i);
                ArraysKt___ArraysJvmKt.copyInto(array.f31310b, this.f31310b, 0, 0, i << 1);
                this.f31311c = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(array.keyAt(i2), array.valueAt(i2));
        }
    }

    @Nullable
    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    @Nullable
    public final V remove(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    @Nullable
    public final V removeAt(int i) {
        Object[] objArr = this.f31310b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f31311c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f31309a;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] iArr2 = new int[i5];
                this.f31309a = iArr2;
                this.f31310b = new Object[i5 << 1];
                if (i > 0) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.f31310b, 0, 0, i2);
                }
                if (i < i4) {
                    int i6 = i + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, this.f31309a, i, i6, i3);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.f31310b, i2, i6 << 1, i3 << 1);
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i, i7, i3);
                    Object[] objArr2 = this.f31310b;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i2, i7 << 1, i3 << 1);
                }
                Object[] objArr3 = this.f31310b;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i3 == this.f31311c) {
                this.f31311c = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    @Nullable
    public final V replace(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public final V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f31310b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final void set_size(int i) {
        this.f31311c = i;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f31311c;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f31311c * 28);
        sb.append('{');
        int i = this.f31311c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }

    public final V valueAt(int i) {
        return (V) this.f31310b[(i << 1) + 1];
    }

    @JvmOverloads
    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f31309a = ContainerHelpersKt.EMPTY_INTS;
            this.f31310b = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.f31309a = new int[i];
            this.f31310b = new Object[i << 1];
        }
        this.f31311c = 0;
    }

    public final boolean remove(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !Intrinsics.areEqual(v, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || valueAt(indexOfKey) != v) {
            return false;
        }
        setValueAt(indexOfKey, v2);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(@Nullable SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}