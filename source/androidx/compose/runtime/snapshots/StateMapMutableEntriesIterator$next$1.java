package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(m28851d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u0003\u0010\f¨\u0006\u000e"}, m28850d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#2,4:361\n1#3:365\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n322#1:361,4\n322#1:365\n*E\n"})
/* loaded from: classes2.dex */
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<Object, Object>, KMutableMap.Entry {

    /* renamed from: a */
    public final Object f28788a;

    /* renamed from: b */
    public Object f28789b;

    /* renamed from: c */
    public final /* synthetic */ StateMapMutableEntriesIterator f28790c;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator stateMapMutableEntriesIterator) {
        this.f28790c = stateMapMutableEntriesIterator;
        Map.Entry m65857e = stateMapMutableEntriesIterator.m65857e();
        Intrinsics.checkNotNull(m65857e);
        this.f28788a = m65857e.getKey();
        Map.Entry m65857e2 = stateMapMutableEntriesIterator.m65857e();
        Intrinsics.checkNotNull(m65857e2);
        this.f28789b = m65857e2.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f28788a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f28789b;
    }

    @Override // java.util.Map.Entry
    public void setValue(Object obj) {
        this.f28789b = obj;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        StateMapMutableEntriesIterator stateMapMutableEntriesIterator = this.f28790c;
        if (stateMapMutableEntriesIterator.m65856f().getModification$runtime_release() == stateMapMutableEntriesIterator.f6628c) {
            Object value = getValue();
            stateMapMutableEntriesIterator.m65856f().put(getKey(), obj);
            setValue(obj);
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
