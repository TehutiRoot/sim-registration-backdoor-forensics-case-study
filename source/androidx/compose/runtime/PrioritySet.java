package androidx.compose.runtime;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", "", CollectionUtils.LIST_TYPE, "<init>", "(Ljava/util/List;)V", "value", "", ProductAction.ACTION_ADD, "(I)V", "", "isEmpty", "()Z", "isNotEmpty", "peek", "()I", "takeMax", "validateHeap", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3471:1\n4548#2,5:3472\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3420#1:3472,5\n*E\n"})
/* loaded from: classes2.dex */
public final class PrioritySet {

    /* renamed from: a */
    public final List f28371a;

    public PrioritySet() {
        this(null, 1, null);
    }

    public final void add(int i) {
        List list;
        if (!this.f28371a.isEmpty()) {
            if (((Number) this.f28371a.get(0)).intValue() != i) {
                if (((Number) this.f28371a.get(list.size() - 1)).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f28371a.size();
        this.f28371a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) this.f28371a.get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            this.f28371a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.f28371a.set(size, Integer.valueOf(i));
    }

    public final boolean isEmpty() {
        return this.f28371a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.f28371a.isEmpty();
    }

    public final int peek() {
        return ((Number) CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f28371a)).intValue();
    }

    public final int takeMax() {
        boolean z;
        int intValue;
        if (this.f28371a.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = ((Number) this.f28371a.get(0)).intValue();
            while ((!this.f28371a.isEmpty()) && ((Number) this.f28371a.get(0)).intValue() == intValue2) {
                List list = this.f28371a;
                list.set(0, CollectionsKt___CollectionsKt.last((List<? extends Object>) list));
                List list2 = this.f28371a;
                list2.remove(list2.size() - 1);
                int size = this.f28371a.size();
                int size2 = this.f28371a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) this.f28371a.get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) this.f28371a.get(i3)).intValue();
                    if (i2 < size && (intValue = ((Number) this.f28371a.get(i2)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.f28371a.set(i, Integer.valueOf(intValue));
                            this.f28371a.set(i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        this.f28371a.set(i, Integer.valueOf(intValue4));
                        this.f28371a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.composeRuntimeError("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public final void validateHeap() {
        int size = this.f28371a.size();
        int i = size / 2;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = i3 * 2;
            if (((Number) this.f28371a.get(i2)).intValue() >= ((Number) this.f28371a.get(i4 - 1)).intValue()) {
                if (i4 < size && ((Number) this.f28371a.get(i2)).intValue() < ((Number) this.f28371a.get(i4)).intValue()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i2 = i3;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public PrioritySet(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f28371a = list;
    }

    public /* synthetic */ PrioritySet(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
