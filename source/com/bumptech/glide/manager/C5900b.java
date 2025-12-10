package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.b */
/* loaded from: classes3.dex */
public final class C5900b {

    /* renamed from: a */
    public final Map f42486a = new HashMap();

    /* renamed from: b */
    public final RequestManagerRetriever.RequestManagerFactory f42487b;

    /* renamed from: com.bumptech.glide.manager.b$a */
    /* loaded from: classes3.dex */
    public class C5901a implements LifecycleListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.Lifecycle f42488a;

        public C5901a(androidx.lifecycle.Lifecycle lifecycle) {
            this.f42488a = lifecycle;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
            C5900b.this.f42486a.remove(this.f42488a);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStop() {
        }
    }

    /* renamed from: com.bumptech.glide.manager.b$b */
    /* loaded from: classes3.dex */
    public final class C5902b implements RequestManagerTreeNode {

        /* renamed from: a */
        public final FragmentManager f42490a;

        public C5902b(FragmentManager fragmentManager) {
            this.f42490a = fragmentManager;
        }

        /* renamed from: a */
        public final void m50098a(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = fragments.get(i);
                m50098a(fragment.getChildFragmentManager(), set);
                RequestManager m50100a = C5900b.this.m50100a(fragment.getLifecycle());
                if (m50100a != null) {
                    set.add(m50100a);
                }
            }
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set getDescendants() {
            HashSet hashSet = new HashSet();
            m50098a(this.f42490a, hashSet);
            return hashSet;
        }
    }

    public C5900b(RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.f42487b = requestManagerFactory;
    }

    /* renamed from: a */
    public RequestManager m50100a(androidx.lifecycle.Lifecycle lifecycle) {
        Util.assertMainThread();
        return (RequestManager) this.f42486a.get(lifecycle);
    }

    /* renamed from: b */
    public RequestManager m50099b(Context context, Glide glide, androidx.lifecycle.Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        Util.assertMainThread();
        RequestManager m50100a = m50100a(lifecycle);
        if (m50100a == null) {
            C18181Oi0 c18181Oi0 = new C18181Oi0(lifecycle);
            RequestManager build = this.f42487b.build(glide, c18181Oi0, new C5902b(fragmentManager), context);
            this.f42486a.put(lifecycle, build);
            c18181Oi0.addListener(new C5901a(lifecycle));
            if (z) {
                build.onStart();
            }
            return build;
        }
        return m50100a;
    }
}
