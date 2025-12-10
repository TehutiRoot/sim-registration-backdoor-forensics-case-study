package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6935c extends Fragment {
    protected final LinkedHashSet<OnSelectionChangedListener<Object>> onSelectionChangedListeners = new LinkedHashSet<>();

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    /* renamed from: l */
    public void m44805l() {
        this.onSelectionChangedListeners.clear();
    }
}
