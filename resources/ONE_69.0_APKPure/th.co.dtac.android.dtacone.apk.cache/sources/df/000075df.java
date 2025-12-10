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
    public final Lifecycle f38169a;

    /* renamed from: b */
    public final FragmentManager f38170b;

    /* renamed from: c */
    public final LongSparseArray f38171c;

    /* renamed from: d */
    public final LongSparseArray f38172d;

    /* renamed from: e */
    public final LongSparseArray f38173e;

    /* renamed from: f */
    public C5175g f38174f;

    /* renamed from: g */
    public C5174f f38175g;

    /* renamed from: h */
    public boolean f38176h;

    /* renamed from: i */
    public boolean f38177i;

    @RequiresOptIn(level = RequiresOptIn.Level.WARNING)
    /* loaded from: classes2.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    /* loaded from: classes2.dex */
    public static abstract class FragmentTransactionCallback {

        /* renamed from: a */
        public static final OnPostEventListener f38178a = new C5168a();

        /* loaded from: classes2.dex */
        public interface OnPostEventListener {
            void onPost();
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$a */
        /* loaded from: classes2.dex */
        public class C5168a implements OnPostEventListener {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        }

        @NonNull
        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
            return f38178a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreAdded(@NonNull Fragment fragment) {
            return f38178a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreRemoved(@NonNull Fragment fragment) {
            return f38178a;
        }

        @NonNull
        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(@NonNull Fragment fragment) {
            return f38178a;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    /* loaded from: classes2.dex */
    public class C5169a implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ FragmentViewHolder f38179a;

        public C5169a(FragmentViewHolder fragmentViewHolder) {
            this.f38179a = fragmentViewHolder;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (FragmentStateAdapter.this.m52392m()) {
                return;
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
            if (ViewCompat.isAttachedToWindow(this.f38179a.m52379c())) {
                FragmentStateAdapter.this.m52396i(this.f38179a);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    /* loaded from: classes2.dex */
    public class C5170b extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ Fragment f38181a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f38182b;

        public C5170b(Fragment fragment, FrameLayout frameLayout) {
            this.f38181a = fragment;
            this.f38182b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f38181a) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                FragmentStateAdapter.this.m52404a(view, this.f38182b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    /* loaded from: classes2.dex */
    public class RunnableC5171c implements Runnable {
        public RunnableC5171c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f38176h = false;
            fragmentStateAdapter.m52401d();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    /* loaded from: classes2.dex */
    public class C5172d implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ Handler f38185a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f38186b;

        public C5172d(Handler handler, Runnable runnable) {
            this.f38185a = handler;
            this.f38186b = runnable;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f38185a.removeCallbacks(this.f38186b);
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5173e extends RecyclerView.AdapterDataObserver {
        public AbstractC5173e() {
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

        public /* synthetic */ AbstractC5173e(C5169a c5169a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$f */
    /* loaded from: classes2.dex */
    public static class C5174f {

        /* renamed from: a */
        public List f38188a = new CopyOnWriteArrayList();

        /* renamed from: a */
        public List m52391a(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38188a) {
                arrayList.add(fragmentTransactionCallback.onFragmentMaxLifecyclePreUpdated(fragment, state));
            }
            return arrayList;
        }

        /* renamed from: b */
        public void m52390b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback.OnPostEventListener) it.next()).onPost();
            }
        }

        /* renamed from: c */
        public List m52389c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38188a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreAdded(fragment));
            }
            return arrayList;
        }

        /* renamed from: d */
        public List m52388d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38188a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreRemoved(fragment));
            }
            return arrayList;
        }

        /* renamed from: e */
        public List m52387e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.f38188a) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreSavedInstanceState(fragment));
            }
            return arrayList;
        }

        /* renamed from: f */
        public void m52386f(FragmentTransactionCallback fragmentTransactionCallback) {
            this.f38188a.add(fragmentTransactionCallback);
        }

        /* renamed from: g */
        public void m52385g(FragmentTransactionCallback fragmentTransactionCallback) {
            this.f38188a.remove(fragmentTransactionCallback);
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g */
    /* loaded from: classes2.dex */
    public class C5175g {

        /* renamed from: a */
        public ViewPager2.OnPageChangeCallback f38189a;

        /* renamed from: b */
        public RecyclerView.AdapterDataObserver f38190b;

        /* renamed from: c */
        public LifecycleEventObserver f38191c;

        /* renamed from: d */
        public ViewPager2 f38192d;

        /* renamed from: e */
        public long f38193e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$a */
        /* loaded from: classes2.dex */
        public class C5176a extends ViewPager2.OnPageChangeCallback {
            public C5176a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                C5175g.this.m52381d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                C5175g.this.m52381d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$b */
        /* loaded from: classes2.dex */
        public class C5177b extends AbstractC5173e {
            public C5177b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC5173e, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                C5175g.this.m52381d(true);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$g$c */
        /* loaded from: classes2.dex */
        public class C5178c implements LifecycleEventObserver {
            public C5178c() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C5175g.this.m52381d(false);
            }
        }

        public C5175g() {
        }

        /* renamed from: a */
        public final ViewPager2 m52384a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void m52383b(RecyclerView recyclerView) {
            this.f38192d = m52384a(recyclerView);
            C5176a c5176a = new C5176a();
            this.f38189a = c5176a;
            this.f38192d.registerOnPageChangeCallback(c5176a);
            C5177b c5177b = new C5177b();
            this.f38190b = c5177b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c5177b);
            C5178c c5178c = new C5178c();
            this.f38191c = c5178c;
            FragmentStateAdapter.this.f38169a.addObserver(c5178c);
        }

        /* renamed from: c */
        public void m52382c(RecyclerView recyclerView) {
            m52384a(recyclerView).unregisterOnPageChangeCallback(this.f38189a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f38190b);
            FragmentStateAdapter.this.f38169a.removeObserver(this.f38191c);
            this.f38192d = null;
        }

        /* renamed from: d */
        public void m52381d(boolean z) {
            int currentItem;
            Fragment fragment;
            boolean z2;
            if (FragmentStateAdapter.this.m52392m() || this.f38192d.getScrollState() != 0 || FragmentStateAdapter.this.f38171c.isEmpty() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f38192d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f38193e || z) && (fragment = (Fragment) FragmentStateAdapter.this.f38171c.get(itemId)) != null && fragment.isAdded()) {
                this.f38193e = itemId;
                FragmentTransaction beginTransaction = FragmentStateAdapter.this.f38170b.beginTransaction();
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i = 0; i < FragmentStateAdapter.this.f38171c.size(); i++) {
                    long keyAt = FragmentStateAdapter.this.f38171c.keyAt(i);
                    Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f38171c.valueAt(i);
                    if (fragment3.isAdded()) {
                        if (keyAt != this.f38193e) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            beginTransaction.setMaxLifecycle(fragment3, state);
                            arrayList.add(FragmentStateAdapter.this.f38175g.m52391a(fragment3, state));
                        } else {
                            fragment2 = fragment3;
                        }
                        if (keyAt == this.f38193e) {
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
                    arrayList.add(FragmentStateAdapter.this.f38175g.m52391a(fragment2, state2));
                }
                if (!beginTransaction.isEmpty()) {
                    beginTransaction.commitNow();
                    Collections.reverse(arrayList);
                    for (List list : arrayList) {
                        FragmentStateAdapter.this.f38175g.m52390b(list);
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    /* renamed from: b */
    public static String m52403b(String str, long j) {
        return str + j;
    }

    /* renamed from: f */
    public static boolean m52399f(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static long m52397h(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: a */
    public void m52404a(View view, FrameLayout frameLayout) {
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
    public final void m52402c(int i) {
        long itemId = getItemId(i);
        if (!this.f38171c.containsKey(itemId)) {
            Fragment createFragment = createFragment(i);
            createFragment.setInitialSavedState((Fragment.SavedState) this.f38172d.get(itemId));
            this.f38171c.put(itemId, createFragment);
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
    public void m52401d() {
        if (this.f38177i && !m52392m()) {
            ArraySet<Long> arraySet = new ArraySet();
            for (int i = 0; i < this.f38171c.size(); i++) {
                long keyAt = this.f38171c.keyAt(i);
                if (!containsItem(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.f38173e.remove(keyAt);
                }
            }
            if (!this.f38176h) {
                this.f38177i = false;
                for (int i2 = 0; i2 < this.f38171c.size(); i2++) {
                    long keyAt2 = this.f38171c.keyAt(i2);
                    if (!m52400e(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            for (Long l : arraySet) {
                m52395j(l.longValue());
            }
        }
    }

    /* renamed from: e */
    public final boolean m52400e(long j) {
        View view;
        if (this.f38173e.containsKey(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f38171c.get(j);
        if (fragment != null && (view = fragment.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Long m52398g(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f38173e.size(); i2++) {
            if (((Integer) this.f38173e.valueAt(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f38173e.keyAt(i2));
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
    public void m52396i(FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = (Fragment) this.f38171c.get(fragmentViewHolder.getItemId());
        if (fragment != null) {
            FrameLayout m52379c = fragmentViewHolder.m52379c();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragment.isAdded() && view == null) {
                m52393l(fragment, m52379c);
                return;
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != m52379c) {
                    m52404a(view, m52379c);
                    return;
                }
                return;
            } else if (fragment.isAdded()) {
                m52404a(view, m52379c);
                return;
            } else if (!m52392m()) {
                m52393l(fragment, m52379c);
                List m52389c = this.f38175g.m52389c(fragment);
                try {
                    fragment.setMenuVisibility(false);
                    FragmentTransaction beginTransaction = this.f38170b.beginTransaction();
                    beginTransaction.add(fragment, OperatorName.FILL_NON_ZERO + fragmentViewHolder.getItemId()).setMaxLifecycle(fragment, Lifecycle.State.STARTED).commitNow();
                    this.f38174f.m52381d(false);
                    return;
                } finally {
                    this.f38175g.m52390b(m52389c);
                }
            } else if (this.f38170b.isDestroyed()) {
                return;
            } else {
                this.f38169a.addObserver(new C5169a(fragmentViewHolder));
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: j */
    public final void m52395j(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f38171c.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.f38172d.remove(j);
        }
        if (!fragment.isAdded()) {
            this.f38171c.remove(j);
        } else if (m52392m()) {
            this.f38177i = true;
        } else {
            if (fragment.isAdded() && containsItem(j)) {
                List m52387e = this.f38175g.m52387e(fragment);
                Fragment.SavedState saveFragmentInstanceState = this.f38170b.saveFragmentInstanceState(fragment);
                this.f38175g.m52390b(m52387e);
                this.f38172d.put(j, saveFragmentInstanceState);
            }
            List m52388d = this.f38175g.m52388d(fragment);
            try {
                this.f38170b.beginTransaction().remove(fragment).commitNow();
                this.f38171c.remove(j);
            } finally {
                this.f38175g.m52390b(m52388d);
            }
        }
    }

    /* renamed from: k */
    public final void m52394k() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC5171c runnableC5171c = new RunnableC5171c();
        this.f38169a.addObserver(new C5172d(handler, runnableC5171c));
        handler.postDelayed(runnableC5171c, 10000L);
    }

    /* renamed from: l */
    public final void m52393l(Fragment fragment, FrameLayout frameLayout) {
        this.f38170b.registerFragmentLifecycleCallbacks(new C5170b(fragment, frameLayout), false);
    }

    /* renamed from: m */
    public boolean m52392m() {
        return this.f38170b.isStateSaved();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        boolean z;
        if (this.f38174f == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        C5175g c5175g = new C5175g();
        this.f38174f = c5175g;
        c5175g.m52383b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f38174f.m52382c(recyclerView);
        this.f38174f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public void registerFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentTransactionCallback) {
        this.f38175g.m52386f(fragmentTransactionCallback);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
        if (this.f38172d.isEmpty() && this.f38171c.isEmpty()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (m52399f(str, "f#")) {
                    this.f38171c.put(m52397h(str, "f#"), this.f38170b.getFragment(bundle, str));
                } else if (m52399f(str, "s#")) {
                    long m52397h = m52397h(str, "s#");
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (containsItem(m52397h)) {
                        this.f38172d.put(m52397h, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.f38171c.isEmpty()) {
                this.f38177i = true;
                this.f38176h = true;
                m52401d();
                m52394k();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.f38171c.size() + this.f38172d.size());
        for (int i = 0; i < this.f38171c.size(); i++) {
            long keyAt = this.f38171c.keyAt(i);
            Fragment fragment = (Fragment) this.f38171c.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f38170b.putFragment(bundle, m52403b("f#", keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f38172d.size(); i2++) {
            long keyAt2 = this.f38172d.keyAt(i2);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(m52403b("s#", keyAt2), (Parcelable) this.f38172d.get(keyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void unregisterFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentTransactionCallback) {
        this.f38175g.m52385g(fragmentTransactionCallback);
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id2 = fragmentViewHolder.m52379c().getId();
        Long m52398g = m52398g(id2);
        if (m52398g != null && m52398g.longValue() != itemId) {
            m52395j(m52398g.longValue());
            this.f38173e.remove(m52398g.longValue());
        }
        this.f38173e.put(itemId, Integer.valueOf(id2));
        m52402c(i);
        if (ViewCompat.isAttachedToWindow(fragmentViewHolder.m52379c())) {
            m52396i(fragmentViewHolder);
        }
        m52401d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return FragmentViewHolder.m52380b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        m52396i(fragmentViewHolder);
        m52401d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        Long m52398g = m52398g(fragmentViewHolder.m52379c().getId());
        if (m52398g != null) {
            m52395j(m52398g.longValue());
            this.f38173e.remove(m52398g.longValue());
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.f38171c = new LongSparseArray();
        this.f38172d = new LongSparseArray();
        this.f38173e = new LongSparseArray();
        this.f38175g = new C5174f();
        this.f38176h = false;
        this.f38177i = false;
        this.f38170b = fragmentManager;
        this.f38169a = lifecycle;
        super.setHasStableIds(true);
    }
}