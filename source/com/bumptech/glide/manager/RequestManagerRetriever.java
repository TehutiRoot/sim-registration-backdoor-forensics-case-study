package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class RequestManagerRetriever implements Handler.Callback {

    /* renamed from: f */
    public static final RequestManagerFactory f42474f = new C5898a();

    /* renamed from: a */
    public volatile RequestManager f42475a;

    /* renamed from: b */
    public final RequestManagerFactory f42476b;

    /* renamed from: c */
    public final ArrayMap f42477c = new ArrayMap();

    /* renamed from: d */
    public final Z40 f42478d;

    /* renamed from: e */
    public final C5900b f42479e;

    /* loaded from: classes3.dex */
    public interface RequestManagerFactory {
        @NonNull
        RequestManager build(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context);
    }

    /* renamed from: com.bumptech.glide.manager.RequestManagerRetriever$a */
    /* loaded from: classes3.dex */
    public class C5898a implements RequestManagerFactory {
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    }

    public RequestManagerRetriever(@Nullable RequestManagerFactory requestManagerFactory) {
        requestManagerFactory = requestManagerFactory == null ? f42474f : requestManagerFactory;
        this.f42476b = requestManagerFactory;
        this.f42479e = new C5900b(requestManagerFactory);
        this.f42478d = m50108b();
    }

    /* renamed from: a */
    public static void m50109a(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    /* renamed from: b */
    public static Z40 m50108b() {
        if (HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED && HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) {
            return new C22893x20();
        }
        return new C16809uJ();
    }

    /* renamed from: c */
    public static Activity m50107c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m50107c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    public static void m50106d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m50106d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    /* renamed from: g */
    public static boolean m50103g(Context context) {
        Activity m50107c = m50107c(context);
        if (m50107c != null && m50107c.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Fragment m50105e(View view, FragmentActivity fragmentActivity) {
        this.f42477c.clear();
        m50106d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f42477c);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (Fragment) this.f42477c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f42477c.clear();
        return fragment;
    }

    /* renamed from: f */
    public final RequestManager m50104f(Context context) {
        if (this.f42475a == null) {
            synchronized (this) {
                try {
                    if (this.f42475a == null) {
                        this.f42475a = this.f42476b.build(Glide.get(context.getApplicationContext()), new C11624k6(), new C13998tR(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f42475a;
    }

    @NonNull
    public RequestManager get(@NonNull Context context) {
        if (context != null) {
            if (Util.isOnMainThread() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return get((FragmentActivity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return get(contextWrapper.getBaseContext());
                    }
                }
            }
            return m50104f(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public RequestManager get(@NonNull FragmentActivity fragmentActivity) {
        if (Util.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        m50109a(fragmentActivity);
        this.f42478d.mo629a(fragmentActivity);
        boolean m50103g = m50103g(fragmentActivity);
        return this.f42479e.m50099b(fragmentActivity, Glide.get(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), m50103g);
    }

    @NonNull
    public RequestManager get(@NonNull Fragment fragment) {
        Preconditions.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Util.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f42478d.mo629a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f42479e.m50099b(context, Glide.get(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @NonNull
    @Deprecated
    public RequestManager get(@NonNull Activity activity) {
        return get(activity.getApplicationContext());
    }

    @NonNull
    public RequestManager get(@NonNull View view) {
        if (Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity m50107c = m50107c(view.getContext());
        if (m50107c == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (m50107c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) m50107c;
            Fragment m50105e = m50105e(view, fragmentActivity);
            return m50105e != null ? get(m50105e) : get(fragmentActivity);
        }
        return get(view.getContext().getApplicationContext());
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public RequestManager get(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
