package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes4.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* renamed from: a */
    public final Map f50070a = new HashMap();

    /* renamed from: b */
    public final Set f50071b = new HashSet();

    /* renamed from: c */
    public OnCheckedStateChangeListener f50072c;

    /* renamed from: d */
    public boolean f50073d;

    /* renamed from: e */
    public boolean f50074e;

    /* loaded from: classes4.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* renamed from: com.google.android.material.internal.CheckableGroup$a */
    /* loaded from: classes4.dex */
    public class C6970a implements MaterialCheckable.OnCheckedChangeListener {
        public C6970a() {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        /* renamed from: a */
        public void onCheckedChanged(MaterialCheckable materialCheckable, boolean z) {
            if (z) {
                if (!CheckableGroup.this.m44653e(materialCheckable)) {
                    return;
                }
            } else {
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (!checkableGroup.m44651g(materialCheckable, checkableGroup.f50074e)) {
                    return;
                }
            }
            CheckableGroup.this.m44652f();
        }
    }

    public void addCheckable(T t) {
        this.f50070a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m44653e(t);
        }
        t.setInternalOnCheckedChangeListener(new C6970a());
    }

    public void check(@IdRes int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f50070a.get(Integer.valueOf(i));
        if (materialCheckable != null && m44653e(materialCheckable)) {
            m44652f();
        }
    }

    public void clearCheck() {
        boolean z = !this.f50071b.isEmpty();
        for (MaterialCheckable materialCheckable : this.f50070a.values()) {
            m44651g(materialCheckable, false);
        }
        if (z) {
            m44652f();
        }
    }

    /* renamed from: e */
    public final boolean m44653e(MaterialCheckable materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.f50071b.contains(Integer.valueOf(id2))) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.f50070a.get(Integer.valueOf(getSingleCheckedId()));
        if (materialCheckable2 != null) {
            m44651g(materialCheckable2, false);
        }
        boolean add = this.f50071b.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* renamed from: f */
    public final void m44652f() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.f50072c;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* renamed from: g */
    public final boolean m44651g(MaterialCheckable materialCheckable, boolean z) {
        int id2 = materialCheckable.getId();
        if (!this.f50071b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z && this.f50071b.size() == 1 && this.f50071b.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.f50071b.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f50071b);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (this.f50073d && !this.f50071b.isEmpty()) {
            return ((Integer) this.f50071b.iterator().next()).intValue();
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.f50074e;
    }

    public boolean isSingleSelection() {
        return this.f50073d;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f50070a.remove(Integer.valueOf(t.getId()));
        this.f50071b.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f50072c = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f50074e = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f50073d != z) {
            this.f50073d = z;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f50070a.get(Integer.valueOf(i));
        if (materialCheckable != null && m44651g(materialCheckable, this.f50074e)) {
            m44652f();
        }
    }
}
