package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ti0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22317ti0 implements SubcomposeSlotReusePolicy {

    /* renamed from: a */
    public final LazyLayoutItemContentFactory f107160a;

    /* renamed from: b */
    public final Map f107161b;

    public C22317ti0(LazyLayoutItemContentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f107160a = factory;
        this.f107161b = new LinkedHashMap();
    }

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return Intrinsics.areEqual(this.f107160a.getContentType(obj), this.f107160a.getContentType(obj2));
    }

    @Override // androidx.compose.p003ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        int i;
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        this.f107161b.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object contentType = this.f107160a.getContentType(it.next());
            Integer num = (Integer) this.f107161b.get(contentType);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                this.f107161b.put(contentType, Integer.valueOf(i + 1));
            }
        }
    }
}
