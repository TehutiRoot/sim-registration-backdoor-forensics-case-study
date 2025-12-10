package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class PriorityMapping {

    /* renamed from: a */
    public static SparseArray f44253a = new SparseArray();

    /* renamed from: b */
    public static HashMap f44254b;

    static {
        HashMap hashMap = new HashMap();
        f44254b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f44254b.put(Priority.VERY_LOW, 1);
        f44254b.put(Priority.HIGHEST, 2);
        for (Priority priority : f44254b.keySet()) {
            f44253a.append(((Integer) f44254b.get(priority)).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = (Integer) f44254b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority valueOf(int i) {
        Priority priority = (Priority) f44253a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}