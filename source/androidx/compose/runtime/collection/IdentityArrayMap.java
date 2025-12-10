package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u001c\u001a\u00020\u001226\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001f\u001a\u00020\u00122!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JK\u0010!\u001a\u00020\u001226\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'R4\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R4\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b.\u0010,R$\u00104\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, m28850d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", PDAnnotationText.NAME_KEY, "Value", "", "capacity", "<init>", "(I)V", "", "isEmpty", "()Z", "isNotEmpty", Action.KEY_ATTRIBUTE, "contains", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", ProductAction.ACTION_REMOVE, "clear", "()V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "block", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "removeValueIf", "(Lkotlin/jvm/functions/Function1;)V", "forEach", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)I", "midIndex", "keyHash", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILjava/lang/Object;I)I", "", "<set-?>", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", UserMetadata.KEYDATA_FILENAME, "getValues", "values", OperatorName.CURVE_TO, "I", "getSize", "()I", "size", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,219:1\n125#1,22:220\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n149#1:220,22\n*E\n"})
/* loaded from: classes2.dex */
public final class IdentityArrayMap<Key, Value> {

    /* renamed from: a */
    public Object[] f28489a;

    /* renamed from: b */
    public Object[] f28490b;

    /* renamed from: c */
    public int f28491c;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public static final /* synthetic */ void access$setSize$p(IdentityArrayMap identityArrayMap, int i) {
        identityArrayMap.f28491c = i;
    }

    /* renamed from: a */
    public final int m60109a(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.f28491c - 1;
        Object[] objArr = this.f28489a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return m60108b(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public final int m60108b(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.f28489a;
        int i3 = this.f28491c;
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

    public final void clear() {
        this.f28491c = 0;
        ArraysKt___ArraysJvmKt.fill$default(this.f28489a, (Object) null, 0, 0, 6, (Object) null);
        ArraysKt___ArraysJvmKt.fill$default(this.f28490b, (Object) null, 0, 0, 6, (Object) null);
    }

    public final boolean contains(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (m60109a(key) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEach(@NotNull Function2<? super Key, ? super Value, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object obj = getKeys()[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            block.invoke(obj, getValues()[i]);
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m60109a = m60109a(key);
        if (m60109a >= 0) {
            return (Value) this.f28490b[m60109a];
        }
        return null;
    }

    @NotNull
    public final Object[] getKeys() {
        return this.f28489a;
    }

    public final int getSize() {
        return this.f28491c;
    }

    @NotNull
    public final Object[] getValues() {
        return this.f28490b;
    }

    public final boolean isEmpty() {
        if (this.f28491c == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.f28491c > 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Value remove(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int m60109a = m60109a(key);
        if (m60109a < 0) {
            return null;
        }
        Object[] objArr = this.f28490b;
        Value value = (Value) objArr[m60109a];
        int i = this.f28491c;
        Object[] objArr2 = this.f28489a;
        int i2 = m60109a + 1;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, m60109a, i2, i);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, m60109a, i2, i);
        int i3 = i - 1;
        objArr2[i3] = null;
        objArr[i3] = null;
        this.f28491c = i3;
        return value;
    }

    public final void removeIf(@NotNull Function2<? super Key, ? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(obj, getValues()[i2]).booleanValue()) {
                if (i != i2) {
                    getKeys()[i] = obj;
                    getValues()[i] = getValues()[i2];
                }
                i++;
            }
        }
        if (getSize() > i) {
            int size2 = getSize();
            for (int i3 = i; i3 < size2; i3++) {
                getKeys()[i3] = null;
                getValues()[i3] = null;
            }
            this.f28491c = i;
        }
    }

    public final void removeValueIf(@NotNull Function1<? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(getValues()[i2]).booleanValue()) {
                if (i != i2) {
                    getKeys()[i] = obj;
                    getValues()[i] = getValues()[i2];
                }
                i++;
            }
        }
        if (getSize() > i) {
            int size2 = getSize();
            for (int i3 = i; i3 < size2; i3++) {
                getKeys()[i3] = null;
                getValues()[i3] = null;
            }
            this.f28491c = i;
        }
    }

    public final void set(@NotNull Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(key, "key");
        Object[] objArr3 = this.f28489a;
        Object[] objArr4 = this.f28490b;
        int i = this.f28491c;
        int m60109a = m60109a(key);
        if (m60109a >= 0) {
            objArr4[m60109a] = value;
            return;
        }
        int i2 = -(m60109a + 1);
        if (i == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i2 + 1;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, i3, i2, i);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(objArr3, objArr, 0, 0, i2, 6, (Object) null);
        }
        objArr[i2] = key;
        this.f28489a = objArr;
        if (z) {
            objArr2 = new Object[i * 2];
        } else {
            objArr2 = objArr4;
        }
        ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr2, i3, i2, i);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(objArr4, objArr2, 0, 0, i2, 6, (Object) null);
        }
        objArr2[i2] = value;
        this.f28490b = objArr2;
        this.f28491c++;
    }

    public IdentityArrayMap(int i) {
        this.f28489a = new Object[i];
        this.f28490b = new Object[i];
    }

    public /* synthetic */ IdentityArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
