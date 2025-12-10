package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.p027bm.Languages;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J)\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR4\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R$\u0010+\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, m28850d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "<init>", "()V", Action.KEY_ATTRIBUTE, "", "get", "(Ljava/lang/Object;)I", "value", ProductAction.ACTION_ADD, "(Ljava/lang/Object;I)I", "", ProductAction.ACTION_REMOVE, "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "", "removeValueIf", "(Lkotlin/jvm/functions/Function2;)V", Languages.ANY, "(Lkotlin/jvm/functions/Function2;)Z", "block", "forEach", PDPageLabelRange.STYLE_LETTERS_LOWER, "midIndex", "valueHash", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILjava/lang/Object;I)I", "<set-?>", "I", "getSize", "()I", "size", "", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", UserMetadata.KEYDATA_FILENAME, "", OperatorName.CURVE_TO, "[I", "getValues", "()[I", "values", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IdentityArrayIntMap {

    /* renamed from: a */
    public int f28486a;

    /* renamed from: b */
    public Object[] f28487b = new Object[4];

    /* renamed from: c */
    public int[] f28488c = new int[4];

    public static final /* synthetic */ void access$setSize$p(IdentityArrayIntMap identityArrayIntMap, int i) {
        identityArrayIntMap.f28486a = i;
    }

    /* renamed from: a */
    public final int m60111a(Object obj) {
        int i = this.f28486a - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.f28487b;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return m60110b(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    public final int add(@NotNull Object key, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(key, "key");
        int[] iArr = this.f28488c;
        if (this.f28486a > 0) {
            i2 = m60111a(key);
            if (i2 >= 0) {
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        Object[] objArr = this.f28487b;
        int i5 = this.f28486a;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i6, i4, i5);
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, i6, i4, i5);
            ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i4, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, i4, 6, (Object) null);
            this.f28487b = objArr2;
            this.f28488c = iArr2;
        } else {
            int i7 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i7, i4, i5);
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i7, i4, i5);
        }
        this.f28487b[i4] = key;
        this.f28488c[i4] = i;
        this.f28486a++;
        return -1;
    }

    public final boolean any(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object obj = keys[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            if (predicate.invoke(obj, Integer.valueOf(values[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m60110b(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f28487b;
        int i3 = this.f28486a;
        for (int i4 = i - 1; -1 < i4; i4--) {
            Object obj3 = objArr[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i < i3) {
                obj2 = objArr[i];
                if (obj2 == obj) {
                    return i;
                }
            } else {
                return -(i3 + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i2);
        return -(i + 1);
    }

    public final void forEach(@NotNull Function2<Object, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object obj = keys[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, Integer.valueOf(values[i]));
        }
    }

    public final int get(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m60111a = m60111a(key);
        if (m60111a >= 0) {
            return this.f28488c[m60111a];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @NotNull
    public final Object[] getKeys() {
        return this.f28487b;
    }

    public final int getSize() {
        return this.f28486a;
    }

    @NotNull
    public final int[] getValues() {
        return this.f28488c;
    }

    public final boolean remove(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m60111a = m60111a(key);
        Object[] objArr = this.f28487b;
        int[] iArr = this.f28488c;
        int i = this.f28486a;
        if (m60111a >= 0) {
            int i2 = i - 1;
            if (m60111a < i2) {
                int i3 = m60111a + 1;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, m60111a, i3, i);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, m60111a, i3, i);
            }
            objArr[i2] = null;
            this.f28486a = i2;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = keys[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            int i3 = values[i2];
            if (!predicate.invoke(obj, Integer.valueOf(i3)).booleanValue()) {
                if (i != i2) {
                    keys[i] = obj;
                    values[i] = i3;
                }
                i++;
            }
        }
        for (int i4 = i; i4 < size; i4++) {
            keys[i4] = null;
        }
        this.f28486a = i;
    }
}
