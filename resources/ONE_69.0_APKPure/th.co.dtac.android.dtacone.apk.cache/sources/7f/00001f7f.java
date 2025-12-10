package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Quirks {

    /* renamed from: a */
    public final List f11253a;

    public Quirks(@NonNull List<Quirk> list) {
        this.f11253a = new ArrayList(list);
    }

    public boolean contains(@NonNull Class<? extends Quirk> cls) {
        for (Quirk quirk : this.f11253a) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public <T extends Quirk> T get(@NonNull Class<T> cls) {
        for (T t : this.f11253a) {
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public <T extends Quirk> List<T> getAll(@NonNull Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.f11253a) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}