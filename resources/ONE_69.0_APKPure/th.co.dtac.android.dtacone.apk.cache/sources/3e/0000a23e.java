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
    public final Map f50082a = new HashMap();

    /* renamed from: b */
    public final Set f50083b = new HashSet();

    /* renamed from: c */
    public OnCheckedStateChangeListener f50084c;

    /* renamed from: d */
    public boolean f50085d;

    /* renamed from: e */
    public boolean f50086e;

    /* loaded from: classes4.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* renamed from: com.google.android.material.internal.CheckableGroup$a */
    /* loaded from: classes4.dex */
    public class C6959a implements MaterialCheckable.OnCheckedChangeListener {
        public C6959a() {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        /* renamed from: a */
        public void onCheckedChanged(MaterialCheckable materialCheckable, boolean z) {
            if (z) {
                if (!CheckableGroup.this.m44640e(materialCheckable)) {
                    return;
                }
            } else {
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (!checkableGroup.m44638g(materialCheckable, checkableGroup.f50086e)) {
                    return;
                }
            }
            CheckableGroup.this.m44639f();
        }
    }

    public void addCheckable(T t) {
        this.f50082a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m44640e(t);
        }
        t.setInternalOnCheckedChangeListener(new C6959a());
    }

    public void check(@IdRes int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f50082a.get(Integer.valueOf(i));
        if (materialCheckable != null && m44640e(materialCheckable)) {
            m44639f();
        }
    }

    public void clearCheck() {
        boolean z = !this.f50083b.isEmpty();
        for (MaterialCheckable materialCheckable : this.f50082a.values()) {
            m44638g(materialCheckable, false);
        }
        if (z) {
            m44639f();
        }
    }

    /* renamed from: e */
    public final boolean m44640e(MaterialCheckable materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.f50083b.contains(Integer.valueOf(id2))) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.f50082a.get(Integer.valueOf(getSingleCheckedId()));
        if (materialCheckable2 != null) {
            m44638g(materialCheckable2, false);
        }
        boolean add = this.f50083b.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* renamed from: f */
    public final void m44639f() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.f50084c;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* renamed from: g */
    public final boolean m44638g(MaterialCheckable materialCheckable, boolean z) {
        int id2 = materialCheckable.getId();
        if (!this.f50083b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z && this.f50083b.size() == 1 && this.f50083b.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.f50083b.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f50083b);
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
        if (this.f50085d && !this.f50083b.isEmpty()) {
            return ((Integer) this.f50083b.iterator().next()).intValue();
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.f50086e;
    }

    public boolean isSingleSelection() {
        return this.f50085d;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f50082a.remove(Integer.valueOf(t.getId()));
        this.f50083b.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f50084c = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f50086e = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f50085d != z) {
            this.f50085d = z;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.f50082a.get(Integer.valueOf(i));
        if (materialCheckable != null && m44638g(materialCheckable, this.f50086e)) {
            m44639f();
        }
    }
}