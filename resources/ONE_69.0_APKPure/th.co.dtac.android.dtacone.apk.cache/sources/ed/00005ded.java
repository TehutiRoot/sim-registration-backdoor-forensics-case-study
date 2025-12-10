package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00012!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00100\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\tJ6\u0010\u0017\u001a\u00020\u00102!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'R$\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R4\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010.2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R@\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0.2\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R\"\u0010<\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, m29142d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "", "T", "<init>", "()V", "value", Action.SCOPE_ATTRIBUTE, "", ProductAction.ACTION_ADD, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "block", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "clear", ProductAction.ACTION_REMOVE, "predicate", "removeValueIf", "(Lkotlin/jvm/functions/Function1;)V", "removeScope", "(Ljava/lang/Object;)V", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/runtime/collection/IdentityArraySet;", "d", "(I)Landroidx/compose/runtime/collection/IdentityArraySet;", OperatorName.CURVE_TO, "(Ljava/lang/Object;)Landroidx/compose/runtime/collection/IdentityArraySet;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)I", "midIndex", "valueHash", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILjava/lang/Object;I)I", "", "<set-?>", "[I", "getValueOrder", "()[I", "valueOrder", "", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "values", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "scopeSets", "I", "getSize", "()I", "setSize", "(I)V", "size", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentityScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,331:1\n244#1,8:339\n252#1,17:366\n244#1,25:383\n108#2,7:332\n269#2,19:347\n*S KotlinDebug\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n*L\n228#1:339,8\n228#1:366,17\n238#1:383,25\n82#1:332,7\n229#1:347,19\n*E\n"})
/* loaded from: classes2.dex */
public final class IdentityScopeMap<T> {

    /* renamed from: a */
    public int[] f28584a;

    /* renamed from: b */
    public Object[] f28585b;

    /* renamed from: c */
    public IdentityArraySet[] f28586c;

    /* renamed from: d */
    public int f28587d;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f28584a = iArr;
        this.f28585b = new Object[50];
        this.f28586c = new IdentityArraySet[50];
    }

    public static final /* synthetic */ int access$find(IdentityScopeMap identityScopeMap, Object obj) {
        return identityScopeMap.m60054a(obj);
    }

    public static final /* synthetic */ IdentityArraySet access$scopeSetAt(IdentityScopeMap identityScopeMap, int i) {
        return identityScopeMap.m60051d(i);
    }

    /* renamed from: a */
    public final int m60054a(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.f28587d - 1;
        Object[] objArr = this.f28585b;
        int[] iArr = this.f28584a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = objArr[iArr[i3]];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return m60053b(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return m60052c(value).add(scope);
    }

    /* renamed from: b */
    public final int m60053b(int i, Object obj, int i2) {
        Object[] objArr = this.f28585b;
        int[] iArr = this.f28584a;
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = objArr[iArr[i3]];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f28587d;
        while (true) {
            if (i4 < i5) {
                Object obj3 = objArr[iArr[i4]];
                if (obj3 == obj) {
                    return i4;
                }
                if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = this.f28587d;
                break;
            }
        }
        return -(i4 + 1);
    }

    /* renamed from: c */
    public final IdentityArraySet m60052c(Object obj) {
        int i;
        int i2 = this.f28587d;
        int[] iArr = this.f28584a;
        Object[] objArr = this.f28585b;
        IdentityArraySet[] identityArraySetArr = this.f28586c;
        if (i2 > 0) {
            i = m60054a(obj);
            if (i >= 0) {
                return m60051d(i);
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        if (i2 < iArr.length) {
            int i4 = iArr[i2];
            objArr[i4] = obj;
            IdentityArraySet identityArraySet = identityArraySetArr[i4];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet();
                identityArraySetArr[i4] = identityArraySet;
            }
            if (i3 < i2) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i3 + 1, i3, i2);
            }
            iArr[i3] = i4;
            this.f28587d++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(identityArraySetArr, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        IdentityArraySet[] identityArraySetArr2 = (IdentityArraySet[]) copyOf;
        IdentityArraySet identityArraySet2 = new IdentityArraySet();
        identityArraySetArr2[i2] = identityArraySet2;
        Object[] copyOf2 = Arrays.copyOf(objArr, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        copyOf2[i2] = obj;
        int[] iArr2 = new int[length];
        for (int i5 = i2 + 1; i5 < length; i5++) {
            iArr2[i5] = i5;
        }
        if (i3 < i2) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, i3 + 1, i3, i2);
        }
        iArr2[i3] = i2;
        if (i3 > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, i3, 6, (Object) null);
        }
        this.f28586c = identityArraySetArr2;
        this.f28585b = copyOf2;
        this.f28584a = iArr2;
        this.f28587d++;
        return identityArraySet2;
    }

    public final void clear() {
        IdentityArraySet[] identityArraySetArr = this.f28586c;
        int[] iArr = this.f28584a;
        Object[] objArr = this.f28585b;
        int length = identityArraySetArr.length;
        for (int i = 0; i < length; i++) {
            IdentityArraySet identityArraySet = identityArraySetArr[i];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            iArr[i] = i;
            objArr[i] = null;
        }
        this.f28587d = 0;
    }

    public final boolean contains(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (m60054a(element) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final IdentityArraySet m60051d(int i) {
        IdentityArraySet identityArraySet = this.f28586c[this.f28584a[i]];
        Intrinsics.checkNotNull(identityArraySet);
        return identityArraySet;
    }

    public final void forEachScopeOf(@NotNull Object value, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(block, "block");
        int m60054a = m60054a(value);
        if (m60054a >= 0) {
            IdentityArraySet m60051d = m60051d(m60054a);
            Object[] values = m60051d.getValues();
            int size = m60051d.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                block.invoke(obj);
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.f28586c;
    }

    public final int getSize() {
        return this.f28587d;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.f28584a;
    }

    @NotNull
    public final Object[] getValues() {
        return this.f28585b;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i;
        IdentityArraySet identityArraySet;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        int m60054a = m60054a(value);
        int[] iArr = this.f28584a;
        IdentityArraySet[] identityArraySetArr = this.f28586c;
        Object[] objArr = this.f28585b;
        int i2 = this.f28587d;
        if (m60054a < 0 || (identityArraySet = identityArraySetArr[(i = iArr[m60054a])]) == null) {
            return false;
        }
        boolean remove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i3 = m60054a + 1;
            if (i3 < i2) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, m60054a, i3, i2);
            }
            int i4 = i2 - 1;
            iArr[i4] = i;
            objArr[i] = null;
            this.f28587d = i4;
        }
        return remove;
    }

    public final void removeScope(@NotNull T scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int[] valueOrder = getValueOrder();
        IdentityArraySet<T>[] scopeSets = getScopeSets();
        Object[] values = getValues();
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = valueOrder[i2];
            IdentityArraySet<T> identityArraySet = scopeSets[i3];
            Intrinsics.checkNotNull(identityArraySet);
            identityArraySet.remove(scope);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i4 = valueOrder[i];
                    valueOrder[i] = i3;
                    valueOrder[i2] = i4;
                }
                i++;
            }
        }
        int size2 = getSize();
        for (int i5 = i; i5 < size2; i5++) {
            values[valueOrder[i5]] = null;
        }
        setSize(i);
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] valueOrder = getValueOrder();
        IdentityArraySet<T>[] scopeSets = getScopeSets();
        Object[] values = getValues();
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = valueOrder[i2];
            IdentityArraySet<T> identityArraySet = scopeSets[i3];
            Intrinsics.checkNotNull(identityArraySet);
            Object[] values2 = identityArraySet.getValues();
            int size2 = identityArraySet.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = values2[i5];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!predicate.invoke(obj).booleanValue()) {
                    if (i4 != i5) {
                        values2[i4] = obj;
                    }
                    i4++;
                }
            }
            for (int i6 = i4; i6 < size2; i6++) {
                values2[i6] = null;
            }
            identityArraySet.f28580a = i4;
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i7 = valueOrder[i];
                    valueOrder[i] = i3;
                    valueOrder[i2] = i7;
                }
                i++;
            }
        }
        int size3 = getSize();
        for (int i8 = i; i8 < size3; i8++) {
            values[valueOrder[i8]] = null;
        }
        setSize(i);
    }

    public final void setSize(int i) {
        this.f28587d = i;
    }
}