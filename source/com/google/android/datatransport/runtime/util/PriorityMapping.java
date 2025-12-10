package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class PriorityMapping {

    /* renamed from: a */
    public static SparseArray f44241a = new SparseArray();

    /* renamed from: b */
    public static HashMap f44242b;

    static {
        HashMap hashMap = new HashMap();
        f44242b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f44242b.put(Priority.VERY_LOW, 1);
        f44242b.put(Priority.HIGHEST, 2);
        for (Priority priority : f44242b.keySet()) {
            f44241a.append(((Integer) f44242b.get(priority)).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = (Integer) f44242b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority valueOf(int i) {
        Priority priority = (Priority) f44241a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
