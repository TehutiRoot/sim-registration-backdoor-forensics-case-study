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
public final class C5889b {

    /* renamed from: a */
    public final Map f42498a = new HashMap();

    /* renamed from: b */
    public final RequestManagerRetriever.RequestManagerFactory f42499b;

    /* renamed from: com.bumptech.glide.manager.b$a */
    /* loaded from: classes3.dex */
    public class C5890a implements LifecycleListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.Lifecycle f42500a;

        public C5890a(androidx.lifecycle.Lifecycle lifecycle) {
            this.f42500a = lifecycle;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
            C5889b.this.f42498a.remove(this.f42500a);
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
    public final class C5891b implements RequestManagerTreeNode {

        /* renamed from: a */
        public final FragmentManager f42502a;

        public C5891b(FragmentManager fragmentManager) {
            this.f42502a = fragmentManager;
        }

        /* renamed from: a */
        public final void m50095a(FragmentManager fragmentManager, Set set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = fragments.get(i);
                m50095a(fragment.getChildFragmentManager(), set);
                RequestManager m50097a = C5889b.this.m50097a(fragment.getLifecycle());
                if (m50097a != null) {
                    set.add(m50097a);
                }
            }
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set getDescendants() {
            HashSet hashSet = new HashSet();
            m50095a(this.f42502a, hashSet);
            return hashSet;
        }
    }

    public C5889b(RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.f42499b = requestManagerFactory;
    }

    /* renamed from: a */
    public RequestManager m50097a(androidx.lifecycle.Lifecycle lifecycle) {
        Util.assertMainThread();
        return (RequestManager) this.f42498a.get(lifecycle);
    }

    /* renamed from: b */
    public RequestManager m50096b(Context context, Glide glide, androidx.lifecycle.Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        Util.assertMainThread();
        RequestManager m50097a = m50097a(lifecycle);
        if (m50097a == null) {
            C18608Ui0 c18608Ui0 = new C18608Ui0(lifecycle);
            RequestManager build = this.f42499b.build(glide, c18608Ui0, new C5891b(fragmentManager), context);
            this.f42498a.put(lifecycle, build);
            c18608Ui0.addListener(new C5890a(lifecycle));
            if (z) {
                build.onStart();
            }
            return build;
        }
        return m50097a;
    }
}