package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {

    /* renamed from: a */
    public final Lifecycle f38081a;

    /* renamed from: b */
    public final FragmentManager f38082b;

    /* renamed from: c */
    public final LongSparseArray f38083c;

    /* renamed from: d */
    public final LongSparseArray f38084d;

    /* renamed from: e */
    public final LongSparseArray f38085e;

    /* renamed from: f */
    public C5193g f38086f;

    /* renamed from: g */
    public C5192f f38087g;

    /* renamed from: h */
    public boolean f38088h;

    /* renamed from: i */
    public boolean f38089i;

    @RequiresOptIn(level = RequiresOptIn.Level.WARNING)
    /* loaded from: classes2.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    /* loaded from: classes2.dex */
    public static abstract class FragmentTransactionCallback {

        /* renamed from: a */
        public static final OnPostEventListener f38090a = new C5186a();

        /* loaded from: classes2.dex */
        public interface OnPostEventListener {
            void onPost();
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$a */
        /* loaded from: classes2.dex */
        public class C5186a implements OnPostEventListener {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        }

        @NonNull
        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
            return f38090a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreAdded(@NonNull Fragment fragment) {
            return f38090a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreRemoved(@NonNull Fragment fragment) {
            return f38090a;
        }

        @NonNull
        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(@NonNull Fragment fragment) {
            return f38090a;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    /* loaded from: classes2.dex */
    public class C5187a implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ FragmentViewHolder f38091a;

        public C5187a(FragmentViewHolder fragmentViewHolder) {
            this.f38091a = fragmentViewHolder;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (FragmentStateAdapter.this.m52440m()) {
                return;
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
            if (ViewCompat.isAttachedToWindow(this.f38091a.m52427c())) {
                FragmentStateAdapter.this.m52444i(this.f38091a);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    /* loaded from: classes2.dex */
    public class C5188b extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ Fragment f38093a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f38094b;

        public C5188b(Fragment fragment, FrameLayout frameLayout) {
            this.f38093a = fragment;
            this.f38094b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f38093a) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                FragmentStateAdapter.this.m52452a(view, this.f38094b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    /* loaded from: classes2.dex */
    public class RunnableC5189c implements Runnable {
        public RunnableC5189c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f38088h = false;
            fragmentStateAdapter.m52449d();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    /* loaded from: classes2.dex */
    public class C5190d implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ Handler f38097a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f38098b;

        public C5190d(Handler handler, Runnable runnable) {
            this.f38097a = handler;
            this.f38098b = runnable;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f38097a.removeCallbacks(this.f38098b);
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5191e extends RecyclerView.AdapterDataObserver {
        public AbstractC5191e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC5191e(C5187a c5187a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$f */
    /* loaded from: classes2.dex */
    public static class C5192f {

        /* renamed from: a */
        public List f38100a = new CopyOnWriteArrayList();

        /* renamed from: a */
        public List m52439a(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38100a) {
                arrayList.add(fragmentTransactionCallback.onFragmentMaxLifecyclePreUpdated(fragment, state));
            }
            return arrayList;
        }

        /* renamed from: b */
        public void m52438b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback.OnPostEventListener) it.next()).onPost();
            }
        }

        /* renamed from: c */
        public List m52437c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38100a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreAdded(fragment));
            }
            return arrayList;
        }

        /* renamed from: d */
        public List m52436d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38100a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreRemoved(fragment));
            }
            return arrayList;
        }

        /* renamed from: e */
        public List m52435e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38100a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreSavedInstanceState(fragment));
            }
            return arrayList;
        }

        /* renamed from: f */
        public void m52434f(FragmentTransactionCallback fragmentTransactionCallback) {
            this.f38100a.add(fragmentTransactionCallback);
        }

        /* renamed from: g */
        public void m52433g(FragmentTransactionCallback fragmentTransactionCallback) {
            this.f38100a.remove(fragmentTransactionCallback);
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g */
    /* loaded from: classes2.dex */
    public class C5193g {

        /* renamed from: a */
        public ViewPager2.OnPageChangeCallback f38101a;

        /* renamed from: b */
        public RecyclerView.AdapterDataObserver f38102b;

        /* renamed from: c */
        public LifecycleEventObserver f38103c;

        /* renamed from: d */
        public ViewPager2 f38104d;

        /* renamed from: e */
        public long f38105e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$a */
        /* loaded from: classes2.dex */
        public class C5194a extends ViewPager2.OnPageChangeCallback {
            public C5194a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                C5193g.this.m52429d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                C5193g.this.m52429d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$b */
        /* loaded from: classes2.dex */
        public class C5195b extends AbstractC5191e {
            public C5195b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC5191e, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                C5193g.this.m52429d(true);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$c */
        /* loaded from: classes2.dex */
        public class C5196c implements LifecycleEventObserver {
            public C5196c() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C5193g.this.m52429d(false);
            }
        }

        public C5193g() {
        }

        /* renamed from: a */
        public final ViewPager2 m52432a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void m52431b(RecyclerView recyclerView) {
            this.f38104d = m52432a(recyclerView);
            C5194a c5194a = new C5194a();
            this.f38101a = c5194a;
            this.f38104d.registerOnPageChangeCallback(c5194a);
            C5195b c5195b = new C5195b();
            this.f38102b = c5195b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c5195b);
            C5196c c5196c = new C5196c();
            this.f38103c = c5196c;
            FragmentStateAdapter.this.f38081a.addObserver(c5196c);
        }

        /* renamed from: c */
        public void m52430c(RecyclerView recyclerView) {
            m52432a(recyclerView).unregisterOnPageChangeCallback(this.f38101a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f38102b);
            FragmentStateAdapter.this.f38081a.removeObserver(this.f38103c);
            this.f38104d = null;
        }

        /* renamed from: d */
        public void m52429d(boolean z) {
            int currentItem;
            Fragment fragment;
            boolean z2;
            if (FragmentStateAdapter.this.m52440m() || this.f38104d.getScrollState() != 0 || FragmentStateAdapter.this.f38083c.isEmpty() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f38104d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f38105e || z) && (fragment = (Fragment) FragmentStateAdapter.this.f38083c.get(itemId)) != null && fragment.isAdded()) {
                this.f38105e = itemId;
                FragmentTransaction beginTransaction = FragmentStateAdapter.this.f38082b.beginTransaction();
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i = 0; i < FragmentStateAdapter.this.f38083c.size(); i++) {
                    long keyAt = FragmentStateAdapter.this.f38083c.keyAt(i);
                    Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f38083c.valueAt(i);
                    if (fragment3.isAdded()) {
                        if (keyAt != this.f38105e) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            beginTransaction.setMaxLifecycle(fragment3, state);
                            arrayList.add(FragmentStateAdapter.this.f38087g.m52439a(fragment3, state));
                        } else {
                            fragment2 = fragment3;
                        }
                        if (keyAt == this.f38105e) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fragment3.setMenuVisibility(z2);
                    }
                }
                if (fragment2 != null) {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    beginTransaction.setMaxLifecycle(fragment2, state2);
                    arrayList.add(FragmentStateAdapter.this.f38087g.m52439a(fragment2, state2));
                }
                if (!beginTransaction.isEmpty()) {
                    beginTransaction.commitNow();
                    Collections.reverse(arrayList);
                    for (List list : arrayList) {
                        FragmentStateAdapter.this.f38087g.m52438b(list);
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    /* renamed from: b */
    public static String m52451b(String str, long j) {
        return str + j;
    }

    /* renamed from: f */
    public static boolean m52447f(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static long m52445h(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: a */
    public void m52452a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: c */
    public final void m52450c(int i) {
        long itemId = getItemId(i);
        if (!this.f38083c.containsKey(itemId)) {
            Fragment createFragment = createFragment(i);
            createFragment.setInitialSavedState((Fragment.SavedState) this.f38084d.get(itemId));
            this.f38083c.put(itemId, createFragment);
        }
    }

    public boolean containsItem(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    @NonNull
    public abstract Fragment createFragment(int i);

    /* renamed from: d */
    public void m52449d() {
        if (this.f38089i && !m52440m()) {
            ArraySet<Long> arraySet = new ArraySet();
            for (int i = 0; i < this.f38083c.size(); i++) {
                long keyAt = this.f38083c.keyAt(i);
                if (!containsItem(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.f38085e.remove(keyAt);
                }
            }
            if (!this.f38088h) {
                this.f38089i = false;
                for (int i2 = 0; i2 < this.f38083c.size(); i2++) {
                    long keyAt2 = this.f38083c.keyAt(i2);
                    if (!m52448e(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            for (Long l : arraySet) {
                m52443j(l.longValue());
            }
        }
    }

    /* renamed from: e */
    public final boolean m52448e(long j) {
        View view;
        if (this.f38085e.containsKey(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f38083c.get(j);
        if (fragment != null && (view = fragment.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Long m52446g(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f38085e.size(); i2++) {
            if (((Integer) this.f38085e.valueAt(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f38085e.keyAt(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* renamed from: i */
    public void m52444i(FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = (Fragment) this.f38083c.get(fragmentViewHolder.getItemId());
        if (fragment != null) {
            FrameLayout m52427c = fragmentViewHolder.m52427c();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragment.isAdded() && view == null) {
                m52441l(fragment, m52427c);
                return;
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != m52427c) {
                    m52452a(view, m52427c);
                    return;
                }
                return;
            } else if (fragment.isAdded()) {
                m52452a(view, m52427c);
                return;
            } else if (!m52440m()) {
                m52441l(fragment, m52427c);
                List m52437c = this.f38087g.m52437c(fragment);
                try {
                    fragment.setMenuVisibility(false);
                    FragmentTransaction beginTransaction = this.f38082b.beginTransaction();
                    beginTransaction.add(fragment, OperatorName.FILL_NON_ZERO + fragmentViewHolder.getItemId()).setMaxLifecycle(fragment, Lifecycle.State.STARTED).commitNow();
                    this.f38086f.m52429d(false);
                    return;
                } finally {
                    this.f38087g.m52438b(m52437c);
                }
            } else if (this.f38082b.isDestroyed()) {
                return;
            } else {
                this.f38081a.addObserver(new C5187a(fragmentViewHolder));
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: j */
    public final void m52443j(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f38083c.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.f38084d.remove(j);
        }
        if (!fragment.isAdded()) {
            this.f38083c.remove(j);
        } else if (m52440m()) {
            this.f38089i = true;
        } else {
            if (fragment.isAdded() && containsItem(j)) {
                List m52435e = this.f38087g.m52435e(fragment);
                Fragment.SavedState saveFragmentInstanceState = this.f38082b.saveFragmentInstanceState(fragment);
                this.f38087g.m52438b(m52435e);
                this.f38084d.put(j, saveFragmentInstanceState);
            }
            List m52436d = this.f38087g.m52436d(fragment);
            try {
                this.f38082b.beginTransaction().remove(fragment).commitNow();
                this.f38083c.remove(j);
            } finally {
                this.f38087g.m52438b(m52436d);
            }
        }
    }

    /* renamed from: k */
    public final void m52442k() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC5189c runnableC5189c = new RunnableC5189c();
        this.f38081a.addObserver(new C5190d(handler, runnableC5189c));
        handler.postDelayed(runnableC5189c, 10000L);
    }

    /* renamed from: l */
    public final void m52441l(Fragment fragment, FrameLayout frameLayout) {
        this.f38082b.registerFragmentLifecycleCallbacks(new C5188b(fragment, frameLayout), false);
    }

    /* renamed from: m */
    public boolean m52440m() {
        return this.f38082b.isStateSaved();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        boolean z;
        if (this.f38086f == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        C5193g c5193g = new C5193g();
        this.f38086f = c5193g;
        c5193g.m52431b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f38086f.m52430c(recyclerView);
        this.f38086f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public void registerFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentTransactionCallback) {
        this.f38087g.m52434f(fragmentTransactionCallback);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
        if (this.f38084d.isEmpty() && this.f38083c.isEmpty()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (m52447f(str, "f#")) {
                    this.f38083c.put(m52445h(str, "f#"), this.f38082b.getFragment(bundle, str));
                } else if (m52447f(str, "s#")) {
                    long m52445h = m52445h(str, "s#");
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (containsItem(m52445h)) {
                        this.f38084d.put(m52445h, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.f38083c.isEmpty()) {
                this.f38089i = true;
                this.f38088h = true;
                m52449d();
                m52442k();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.f38083c.size() + this.f38084d.size());
        for (int i = 0; i < this.f38083c.size(); i++) {
            long keyAt = this.f38083c.keyAt(i);
            Fragment fragment = (Fragment) this.f38083c.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f38082b.putFragment(bundle, m52451b("f#", keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f38084d.size(); i2++) {
            long keyAt2 = this.f38084d.keyAt(i2);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(m52451b("s#", keyAt2), (Parcelable) this.f38084d.get(keyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void unregisterFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentTransactionCallback) {
        this.f38087g.m52433g(fragmentTransactionCallback);
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id2 = fragmentViewHolder.m52427c().getId();
        Long m52446g = m52446g(id2);
        if (m52446g != null && m52446g.longValue() != itemId) {
            m52443j(m52446g.longValue());
            this.f38085e.remove(m52446g.longValue());
        }
        this.f38085e.put(itemId, Integer.valueOf(id2));
        m52450c(i);
        if (ViewCompat.isAttachedToWindow(fragmentViewHolder.m52427c())) {
            m52444i(fragmentViewHolder);
        }
        m52449d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return FragmentViewHolder.m52428b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        m52444i(fragmentViewHolder);
        m52449d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        Long m52446g = m52446g(fragmentViewHolder.m52427c().getId());
        if (m52446g != null) {
            m52443j(m52446g.longValue());
            this.f38085e.remove(m52446g.longValue());
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.f38083c = new LongSparseArray();
        this.f38084d = new LongSparseArray();
        this.f38085e = new LongSparseArray();
        this.f38087g = new C5192f();
        this.f38088h = false;
        this.f38089i = false;
        this.f38082b = fragmentManager;
        this.f38081a = lifecycle;
        super.setHasStableIds(true);
    }
}
