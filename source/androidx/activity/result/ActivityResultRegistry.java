package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.random.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public final Map f8740a = new HashMap();

    /* renamed from: b */
    public final Map f8741b = new HashMap();

    /* renamed from: c */
    public final Map f8742c = new HashMap();

    /* renamed from: d */
    public ArrayList f8743d = new ArrayList();

    /* renamed from: e */
    public final transient Map f8744e = new HashMap();

    /* renamed from: f */
    public final Map f8745f = new HashMap();

    /* renamed from: g */
    public final Bundle f8746g = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    public class C2050a implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ String f8747a;

        /* renamed from: b */
        public final /* synthetic */ ActivityResultCallback f8748b;

        /* renamed from: c */
        public final /* synthetic */ ActivityResultContract f8749c;

        public C2050a(String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
            this.f8747a = str;
            this.f8748b = activityResultCallback;
            this.f8749c = activityResultContract;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (Lifecycle.Event.ON_START.equals(event)) {
                ActivityResultRegistry.this.f8744e.put(this.f8747a, new C2053d(this.f8748b, this.f8749c));
                if (ActivityResultRegistry.this.f8745f.containsKey(this.f8747a)) {
                    Object obj = ActivityResultRegistry.this.f8745f.get(this.f8747a);
                    ActivityResultRegistry.this.f8745f.remove(this.f8747a);
                    this.f8748b.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f8746g.getParcelable(this.f8747a);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f8746g.remove(this.f8747a);
                    this.f8748b.onActivityResult(this.f8749c.parseResult(activityResult.getResultCode(), activityResult.getData()));
                }
            } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                ActivityResultRegistry.this.f8744e.remove(this.f8747a);
            } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                ActivityResultRegistry.this.m64746e(this.f8747a);
            }
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C2051b extends ActivityResultLauncher {

        /* renamed from: a */
        public final /* synthetic */ String f8751a;

        /* renamed from: b */
        public final /* synthetic */ ActivityResultContract f8752b;

        public C2051b(String str, ActivityResultContract activityResultContract) {
            this.f8751a = str;
            this.f8752b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public ActivityResultContract getContract() {
            return this.f8752b;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void launch(Object obj, ActivityOptionsCompat activityOptionsCompat) {
            Integer num = (Integer) ActivityResultRegistry.this.f8741b.get(this.f8751a);
            if (num != null) {
                ActivityResultRegistry.this.f8743d.add(this.f8751a);
                try {
                    ActivityResultRegistry.this.onLaunch(num.intValue(), this.f8752b, obj, activityOptionsCompat);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f8743d.remove(this.f8751a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f8752b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void unregister() {
            ActivityResultRegistry.this.m64746e(this.f8751a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public class C2052c extends ActivityResultLauncher {

        /* renamed from: a */
        public final /* synthetic */ String f8754a;

        /* renamed from: b */
        public final /* synthetic */ ActivityResultContract f8755b;

        public C2052c(String str, ActivityResultContract activityResultContract) {
            this.f8754a = str;
            this.f8755b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public ActivityResultContract getContract() {
            return this.f8755b;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void launch(Object obj, ActivityOptionsCompat activityOptionsCompat) {
            Integer num = (Integer) ActivityResultRegistry.this.f8741b.get(this.f8754a);
            if (num != null) {
                ActivityResultRegistry.this.f8743d.add(this.f8754a);
                try {
                    ActivityResultRegistry.this.onLaunch(num.intValue(), this.f8755b, obj, activityOptionsCompat);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f8743d.remove(this.f8754a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f8755b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void unregister() {
            ActivityResultRegistry.this.m64746e(this.f8754a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C2053d {

        /* renamed from: a */
        public final ActivityResultCallback f8757a;

        /* renamed from: b */
        public final ActivityResultContract f8758b;

        public C2053d(ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
            this.f8757a = activityResultCallback;
            this.f8758b = activityResultContract;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$e */
    /* loaded from: classes.dex */
    public static class C2054e {

        /* renamed from: a */
        public final Lifecycle f8759a;

        /* renamed from: b */
        public final ArrayList f8760b = new ArrayList();

        public C2054e(Lifecycle lifecycle) {
            this.f8759a = lifecycle;
        }

        /* renamed from: a */
        public void m64745a(LifecycleEventObserver lifecycleEventObserver) {
            this.f8759a.addObserver(lifecycleEventObserver);
            this.f8760b.add(lifecycleEventObserver);
        }

        /* renamed from: b */
        public void m64744b() {
            Iterator it = this.f8760b.iterator();
            while (it.hasNext()) {
                this.f8759a.removeObserver((LifecycleEventObserver) it.next());
            }
            this.f8760b.clear();
        }
    }

    /* renamed from: a */
    public final void m64750a(int i, String str) {
        this.f8740a.put(Integer.valueOf(i), str);
        this.f8741b.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void m64749b(String str, int i, Intent intent, C2053d c2053d) {
        if (c2053d != null && c2053d.f8757a != null && this.f8743d.contains(str)) {
            c2053d.f8757a.onActivityResult(c2053d.f8758b.parseResult(i, intent));
            this.f8743d.remove(str);
            return;
        }
        this.f8745f.remove(str);
        this.f8746g.putParcelable(str, new ActivityResult(i, intent));
    }

    /* renamed from: c */
    public final int m64748c() {
        int nextInt = Random.Default.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.f8740a.containsKey(Integer.valueOf(i))) {
                nextInt = Random.Default.nextInt(2147418112);
            } else {
                return i;
            }
        }
    }

    /* renamed from: d */
    public final void m64747d(String str) {
        if (((Integer) this.f8741b.get(str)) != null) {
            return;
        }
        m64750a(m64748c(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i, int i2, @Nullable Intent intent) {
        String str = (String) this.f8740a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m64749b(str, i2, intent, (C2053d) this.f8744e.get(str));
        return true;
    }

    /* renamed from: e */
    public final void m64746e(String str) {
        Integer num;
        if (!this.f8743d.contains(str) && (num = (Integer) this.f8741b.remove(str)) != null) {
            this.f8740a.remove(num);
        }
        this.f8744e.remove(str);
        if (this.f8745f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8745f.get(str));
            this.f8745f.remove(str);
        }
        if (this.f8746g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8746g.getParcelable(str));
            this.f8746g.remove(str);
        }
        C2054e c2054e = (C2054e) this.f8742c.get(str);
        if (c2054e != null) {
            c2054e.m64744b();
            this.f8742c.remove(str);
        }
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i, @NonNull ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, @Nullable ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f8743d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f8746g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (this.f8741b.containsKey(str)) {
                    Integer num = (Integer) this.f8741b.remove(str);
                    if (!this.f8746g.containsKey(str)) {
                        this.f8740a.remove(num);
                    }
                }
                m64750a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f8741b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f8741b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f8743d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f8746g.clone());
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            m64747d(str);
            C2054e c2054e = (C2054e) this.f8742c.get(str);
            if (c2054e == null) {
                c2054e = new C2054e(lifecycle);
            }
            c2054e.m64745a(new C2050a(str, activityResultCallback, activityResultContract));
            this.f8742c.put(str, c2054e);
            return new C2051b(str, activityResultContract);
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
    }

    @MainThread
    public final <O> boolean dispatchResult(int i, @SuppressLint({"UnknownNullness"}) O o) {
        ActivityResultCallback activityResultCallback;
        String str = (String) this.f8740a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C2053d c2053d = (C2053d) this.f8744e.get(str);
        if (c2053d != null && (activityResultCallback = c2053d.f8757a) != null) {
            if (this.f8743d.remove(str)) {
                activityResultCallback.onActivityResult(o);
                return true;
            }
            return true;
        }
        this.f8746g.remove(str);
        this.f8745f.put(str, o);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull String str, @NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        m64747d(str);
        this.f8744e.put(str, new C2053d(activityResultCallback, activityResultContract));
        if (this.f8745f.containsKey(str)) {
            Object obj = this.f8745f.get(str);
            this.f8745f.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f8746g.getParcelable(str);
        if (activityResult != null) {
            this.f8746g.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new C2052c(str, activityResultContract);
    }
}
