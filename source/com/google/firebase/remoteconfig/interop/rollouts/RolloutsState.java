package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
/* loaded from: classes4.dex */
public abstract class RolloutsState {
    @NonNull
    public static RolloutsState create(@NonNull Set<RolloutAssignment> set) {
        return new C1442U8(set);
    }

    @NonNull
    public abstract Set<RolloutAssignment> getRolloutAssignments();
}
