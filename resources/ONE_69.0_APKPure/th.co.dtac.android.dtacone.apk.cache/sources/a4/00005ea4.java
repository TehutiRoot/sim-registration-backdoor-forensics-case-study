package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* renamed from: a */
    public final Function1 f28783a;

    /* renamed from: b */
    public final Map f28784b;

    /* renamed from: c */
    public final Map f28785c;

    public SaveableStateRegistryImpl(Map map, Function1 canBeSaved) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved");
        this.f28783a = canBeSaved;
        this.f28784b = (map == null || (linkedHashMap = AbstractC11663a.toMutableMap(map)) == null) ? new LinkedHashMap() : linkedHashMap;
        this.f28785c = new LinkedHashMap();
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m59886a(SaveableStateRegistryImpl saveableStateRegistryImpl) {
        return saveableStateRegistryImpl.f28785c;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ((Boolean) this.f28783a.invoke(value)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List list = (List) this.f28784b.remove(key);
        if (list != null && (!list.isEmpty())) {
            if (list.size() > 1) {
                this.f28784b.put(key, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map performSave() {
        Map mutableMap = AbstractC11663a.toMutableMap(this.f28784b);
        for (Map.Entry entry : this.f28785c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((Function0) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (canBeSaved(invoke)) {
                    mutableMap.put(str, CollectionsKt__CollectionsKt.arrayListOf(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = ((Function0) list.get(i)).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                mutableMap.put(str, arrayList);
            }
        }
        return mutableMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String key, final Function0 valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        if (!AbstractC19741eO1.isBlank(key)) {
            Map map = this.f28785c;
            Object obj = map.get(key);
            if (obj == null) {
                obj = new ArrayList();
                map.put(key, obj);
            }
            ((List) obj).add(valueProvider);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public void unregister() {
                    List list = (List) SaveableStateRegistryImpl.m59886a(SaveableStateRegistryImpl.this).remove(key);
                    if (list != null) {
                        list.remove(valueProvider);
                    }
                    if (list != null && (!list.isEmpty())) {
                        SaveableStateRegistryImpl.m59886a(SaveableStateRegistryImpl.this).put(key, list);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}