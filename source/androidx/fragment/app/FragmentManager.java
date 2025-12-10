package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public static final int POP_BACK_STACK_INCLUSIVE = 1;

    /* renamed from: S */
    public static boolean f35458S = false;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG = "FragmentManager";

    /* renamed from: D */
    public ActivityResultLauncher f35462D;

    /* renamed from: E */
    public ActivityResultLauncher f35463E;

    /* renamed from: F */
    public ActivityResultLauncher f35464F;

    /* renamed from: H */
    public boolean f35466H;

    /* renamed from: I */
    public boolean f35467I;

    /* renamed from: J */
    public boolean f35468J;

    /* renamed from: K */
    public boolean f35469K;

    /* renamed from: L */
    public boolean f35470L;

    /* renamed from: M */
    public ArrayList f35471M;

    /* renamed from: N */
    public ArrayList f35472N;

    /* renamed from: O */
    public ArrayList f35473O;

    /* renamed from: P */
    public C4629h f35474P;

    /* renamed from: Q */
    public FragmentStrictMode.Policy f35475Q;

    /* renamed from: b */
    public boolean f35478b;

    /* renamed from: d */
    public ArrayList f35480d;

    /* renamed from: e */
    public ArrayList f35481e;

    /* renamed from: g */
    public OnBackPressedDispatcher f35483g;

    /* renamed from: m */
    public ArrayList f35489m;

    /* renamed from: v */
    public FragmentHostCallback f35498v;

    /* renamed from: w */
    public FragmentContainer f35499w;

    /* renamed from: x */
    public Fragment f35500x;

    /* renamed from: y */
    public Fragment f35501y;

    /* renamed from: a */
    public final ArrayList f35477a = new ArrayList();

    /* renamed from: c */
    public final C4636k f35479c = new C4636k();

    /* renamed from: f */
    public final LayoutInflater$Factory2C4623e f35482f = new LayoutInflater$Factory2C4623e(this);

    /* renamed from: h */
    public final OnBackPressedCallback f35484h = new C4588b(false);

    /* renamed from: i */
    public final AtomicInteger f35485i = new AtomicInteger();

    /* renamed from: j */
    public final Map f35486j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f35487k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map f35488l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final C4625f f35490n = new C4625f(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList f35491o = new CopyOnWriteArrayList();

    /* renamed from: p */
    public final Consumer f35492p = new Consumer() { // from class: P40
        {
            FragmentManager.this = this;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.m54381e(FragmentManager.this, (Configuration) obj);
        }
    };

    /* renamed from: q */
    public final Consumer f35493q = new Consumer() { // from class: Q40
        {
            FragmentManager.this = this;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.m54393a(FragmentManager.this, (Integer) obj);
        }
    };

    /* renamed from: r */
    public final Consumer f35494r = new Consumer() { // from class: R40
        {
            FragmentManager.this = this;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.m54384d(FragmentManager.this, (MultiWindowModeChangedInfo) obj);
        }
    };

    /* renamed from: s */
    public final Consumer f35495s = new Consumer() { // from class: S40
        {
            FragmentManager.this = this;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.m54387c(FragmentManager.this, (PictureInPictureModeChangedInfo) obj);
        }
    };

    /* renamed from: t */
    public final MenuProvider f35496t = new C4589c();

    /* renamed from: u */
    public int f35497u = -1;

    /* renamed from: z */
    public FragmentFactory f35502z = null;

    /* renamed from: A */
    public FragmentFactory f35459A = new C4590d();

    /* renamed from: B */
    public AK1 f35460B = null;

    /* renamed from: C */
    public AK1 f35461C = new C4591e();

    /* renamed from: G */
    public ArrayDeque f35465G = new ArrayDeque();

    /* renamed from: R */
    public Runnable f35476R = new RunnableC4592f();

    /* loaded from: classes2.dex */
    public interface BackStackEntry {
        @Nullable
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Nullable
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    /* loaded from: classes2.dex */
    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    /* loaded from: classes2.dex */
    public interface OnBackStackChangedListener {
        @MainThread
        void onBackStackChangeCommitted(@NonNull Fragment fragment, boolean z);

        @MainThread
        void onBackStackChangeStarted(@NonNull Fragment fragment, boolean z);

        @MainThread
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes2.dex */
    public class C4587a implements ActivityResultCallback {
        public C4587a() {
            FragmentManager.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(Map map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            C4599m c4599m = (C4599m) FragmentManager.this.f35465G.pollFirst();
            if (c4599m == null) {
                Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                return;
            }
            String str = c4599m.f35519a;
            int i3 = c4599m.f35520b;
            Fragment m54191i = FragmentManager.this.f35479c.m54191i(str);
            if (m54191i == null) {
                Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m54191i.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes2.dex */
    public class C4588b extends OnBackPressedCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4588b(boolean z) {
            super(z);
            FragmentManager.this = r1;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            FragmentManager.this.m54329x0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes2.dex */
    public class C4589c implements MenuProvider {
        public C4589c() {
            FragmentManager.this = r1;
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m54441C(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void onMenuClosed(Menu menu) {
            FragmentManager.this.m54425K(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(MenuItem menuItem) {
            return FragmentManager.this.m54427J(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(Menu menu) {
            FragmentManager.this.m54417O(menu);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes2.dex */
    public class C4590d extends FragmentFactory {
        public C4590d() {
            FragmentManager.this = r1;
        }

        @Override // androidx.fragment.app.FragmentFactory
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.getHost().instantiate(FragmentManager.this.getHost().m54448b(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes2.dex */
    public class C4591e implements AK1 {
        public C4591e() {
            FragmentManager.this = r1;
        }

        @Override // p000.AK1
        /* renamed from: a */
        public SpecialEffectsController mo54323a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes2.dex */
    public class RunnableC4592f implements Runnable {
        public RunnableC4592f() {
            FragmentManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m54395Z(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes2.dex */
    public class C4593g implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ String f35509a;

        /* renamed from: b */
        public final /* synthetic */ FragmentResultListener f35510b;

        /* renamed from: c */
        public final /* synthetic */ Lifecycle f35511c;

        public C4593g(String str, FragmentResultListener fragmentResultListener, Lifecycle lifecycle) {
            FragmentManager.this = r1;
            this.f35509a = str;
            this.f35510b = fragmentResultListener;
            this.f35511c = lifecycle;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.f35487k.get(this.f35509a)) != null) {
                this.f35510b.onFragmentResult(this.f35509a, bundle);
                FragmentManager.this.clearFragmentResult(this.f35509a);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f35511c.removeObserver(this);
                FragmentManager.this.f35488l.remove(this.f35509a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes2.dex */
    public class C4594h implements FragmentOnAttachListener {

        /* renamed from: a */
        public final /* synthetic */ Fragment f35513a;

        public C4594h(Fragment fragment) {
            FragmentManager.this = r1;
            this.f35513a = fragment;
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
            this.f35513a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes2.dex */
    public class C4595i implements ActivityResultCallback {
        public C4595i() {
            FragmentManager.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            C4599m c4599m = (C4599m) FragmentManager.this.f35465G.pollLast();
            if (c4599m == null) {
                Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                return;
            }
            String str = c4599m.f35519a;
            int i = c4599m.f35520b;
            Fragment m54191i = FragmentManager.this.f35479c.m54191i(str);
            if (m54191i == null) {
                Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m54191i.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes2.dex */
    public class C4596j implements ActivityResultCallback {
        public C4596j() {
            FragmentManager.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            C4599m c4599m = (C4599m) FragmentManager.this.f35465G.pollFirst();
            if (c4599m == null) {
                Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                return;
            }
            String str = c4599m.f35519a;
            int i = c4599m.f35520b;
            Fragment m54191i = FragmentManager.this.f35479c.m54191i(str);
            if (m54191i == null) {
                Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m54191i.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes2.dex */
    public class C4597k implements InterfaceC4602o {

        /* renamed from: a */
        public final String f35517a;

        public C4597k(String str) {
            FragmentManager.this = r1;
            this.f35517a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC4602o
        /* renamed from: a */
        public boolean mo54284a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.m54342r(arrayList, arrayList2, this.f35517a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes2.dex */
    public static class C4598l extends ActivityResultContract {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).build();
                }
            }
            intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes2.dex */
    public static class C4601n implements FragmentResultListener {

        /* renamed from: a */
        public final Lifecycle f35521a;

        /* renamed from: b */
        public final FragmentResultListener f35522b;

        /* renamed from: c */
        public final LifecycleEventObserver f35523c;

        public C4601n(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, LifecycleEventObserver lifecycleEventObserver) {
            this.f35521a = lifecycle;
            this.f35522b = fragmentResultListener;
            this.f35523c = lifecycleEventObserver;
        }

        /* renamed from: a */
        public boolean m54318a(Lifecycle.State state) {
            return this.f35521a.getCurrentState().isAtLeast(state);
        }

        /* renamed from: b */
        public void m54317b() {
            this.f35521a.removeObserver(this.f35523c);
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(String str, Bundle bundle) {
            this.f35522b.onFragmentResult(str, bundle);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes2.dex */
    public interface InterfaceC4602o {
        /* renamed from: a */
        boolean mo54284a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    /* loaded from: classes2.dex */
    public class C4603p implements InterfaceC4602o {

        /* renamed from: a */
        public final String f35524a;

        /* renamed from: b */
        public final int f35525b;

        /* renamed from: c */
        public final int f35526c;

        public C4603p(String str, int i, int i2) {
            FragmentManager.this = r1;
            this.f35524a = str;
            this.f35525b = i;
            this.f35526c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC4602o
        /* renamed from: a */
        public boolean mo54284a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f35501y;
            if (fragment != null && this.f35525b < 0 && this.f35524a == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
                return false;
            }
            return FragmentManager.this.m54404U0(arrayList, arrayList2, this.f35524a, this.f35525b, this.f35526c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    /* loaded from: classes2.dex */
    public class C4604q implements InterfaceC4602o {

        /* renamed from: a */
        public final String f35528a;

        public C4604q(String str) {
            FragmentManager.this = r1;
            this.f35528a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC4602o
        /* renamed from: a */
        public boolean mo54284a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.m54391a1(arrayList, arrayList2, this.f35528a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$r */
    /* loaded from: classes2.dex */
    public class C4605r implements InterfaceC4602o {

        /* renamed from: a */
        public final String f35530a;

        public C4605r(String str) {
            FragmentManager.this = r1;
            this.f35530a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC4602o
        /* renamed from: a */
        public boolean mo54284a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.m54370h1(arrayList, arrayList2, this.f35530a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m54393a(FragmentManager fragmentManager, Integer num) {
        fragmentManager.m54428I0(num);
    }

    /* renamed from: b */
    public static /* synthetic */ Bundle m54390b(FragmentManager fragmentManager) {
        return fragmentManager.m54432G0();
    }

    /* renamed from: b0 */
    public static void m54389b0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            C4615a c4615a = (C4615a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c4615a.m54282f(-1);
                c4615a.m54276l();
            } else {
                c4615a.m54282f(1);
                c4615a.m54277k();
            }
            i++;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m54387c(FragmentManager fragmentManager, PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        fragmentManager.m54424K0(pictureInPictureModeChangedInfo);
    }

    /* renamed from: d */
    public static /* synthetic */ void m54384d(FragmentManager fragmentManager, MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        fragmentManager.m54426J0(multiWindowModeChangedInfo);
    }

    /* renamed from: e */
    public static /* synthetic */ void m54381e(FragmentManager fragmentManager, Configuration configuration) {
        fragmentManager.m54430H0(configuration);
    }

    /* renamed from: e1 */
    public static int m54379e1(int i) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return 0;
                        }
                        return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
                    }
                    return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
                }
                return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
            }
            return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        return 8194;
    }

    @Deprecated
    public static void enableDebugLogging(boolean z) {
        f35458S = z;
    }

    @NonNull
    public static <F extends Fragment> F findFragment(@NonNull View view) {
        F f = (F) m54371h0(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: g0 */
    public static FragmentManager m54374g0(View view) {
        FragmentActivity fragmentActivity;
        Fragment m54371h0 = m54371h0(view);
        if (m54371h0 != null) {
            if (m54371h0.isAdded()) {
                return m54371h0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + m54371h0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: h0 */
    public static Fragment m54371h0(View view) {
        while (view != null) {
            Fragment m54333v0 = m54333v0(view);
            if (m54333v0 != null) {
                return m54333v0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isLoggingEnabled(int i) {
        if (!f35458S && !Log.isLoggable(TAG, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    public static Fragment m54333v0(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: A */
    public boolean m54445A(MenuItem menuItem) {
        if (this.f35497u < 1) {
            return false;
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A0 */
    public final boolean m54444A0(Fragment fragment) {
        if ((fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m54351o()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public void m54443B() {
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        m54409S(1);
    }

    /* renamed from: B0 */
    public final boolean m54442B0() {
        Fragment fragment = this.f35500x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.f35500x.getParentFragmentManager().m54442B0()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m54441C(Menu menu, MenuInflater menuInflater) {
        if (this.f35497u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null && m54438D0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f35481e != null) {
            for (int i = 0; i < this.f35481e.size(); i++) {
                Fragment fragment2 = (Fragment) this.f35481e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f35481e = arrayList;
        return z;
    }

    /* renamed from: C0 */
    public boolean m54440C0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: D */
    public void m54439D() {
        this.f35469K = true;
        m54395Z(true);
        m54401W();
        m54340s();
        m54409S(-1);
        FragmentHostCallback fragmentHostCallback = this.f35498v;
        if (fragmentHostCallback instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) fragmentHostCallback).removeOnTrimMemoryListener(this.f35493q);
        }
        FragmentHostCallback fragmentHostCallback2 = this.f35498v;
        if (fragmentHostCallback2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) fragmentHostCallback2).removeOnConfigurationChangedListener(this.f35492p);
        }
        FragmentHostCallback fragmentHostCallback3 = this.f35498v;
        if (fragmentHostCallback3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) fragmentHostCallback3).removeOnMultiWindowModeChangedListener(this.f35494r);
        }
        FragmentHostCallback fragmentHostCallback4 = this.f35498v;
        if (fragmentHostCallback4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) fragmentHostCallback4).removeOnPictureInPictureModeChangedListener(this.f35495s);
        }
        FragmentHostCallback fragmentHostCallback5 = this.f35498v;
        if ((fragmentHostCallback5 instanceof MenuHost) && this.f35500x == null) {
            ((MenuHost) fragmentHostCallback5).removeMenuProvider(this.f35496t);
        }
        this.f35498v = null;
        this.f35499w = null;
        this.f35500x = null;
        if (this.f35483g != null) {
            this.f35484h.remove();
            this.f35483g = null;
        }
        ActivityResultLauncher activityResultLauncher = this.f35462D;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.f35463E.unregister();
            this.f35464F.unregister();
        }
    }

    /* renamed from: D0 */
    public boolean m54438D0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: E */
    public void m54437E() {
        m54409S(1);
    }

    /* renamed from: E0 */
    public boolean m54436E0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && m54436E0(fragmentManager.f35500x)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void m54435F(boolean z) {
        if (z && (this.f35498v instanceof OnTrimMemoryProvider)) {
            m54346p1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m54435F(true);
                }
            }
        }
    }

    /* renamed from: F0 */
    public boolean m54434F0(int i) {
        if (this.f35497u >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public void m54433G(boolean z, boolean z2) {
        if (z2 && (this.f35498v instanceof OnMultiWindowModeChangedProvider)) {
            m54346p1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m54433G(z, true);
                }
            }
        }
    }

    /* renamed from: H */
    public void m54431H(Fragment fragment) {
        Iterator it = this.f35491o.iterator();
        while (it.hasNext()) {
            ((FragmentOnAttachListener) it.next()).onAttachFragment(this, fragment);
        }
    }

    /* renamed from: H0 */
    public final /* synthetic */ void m54430H0(Configuration configuration) {
        if (m54442B0()) {
            m54326z(configuration, false);
        }
    }

    /* renamed from: I */
    public void m54429I() {
        for (Fragment fragment : this.f35479c.m54187m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m54429I();
            }
        }
    }

    /* renamed from: I0 */
    public final /* synthetic */ void m54428I0(Integer num) {
        if (m54442B0() && num.intValue() == 80) {
            m54435F(false);
        }
    }

    /* renamed from: J */
    public boolean m54427J(MenuItem menuItem) {
        if (this.f35497u < 1) {
            return false;
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public final /* synthetic */ void m54426J0(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        if (m54442B0()) {
            m54433G(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
        }
    }

    /* renamed from: K */
    public void m54425K(Menu menu) {
        if (this.f35497u < 1) {
            return;
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: K0 */
    public final /* synthetic */ void m54424K0(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        if (m54442B0()) {
            m54419N(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
        }
    }

    /* renamed from: L */
    public final void m54423L(Fragment fragment) {
        if (fragment != null && fragment.equals(m54383d0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: L0 */
    public void m54422L0(Fragment fragment, String[] strArr, int i) {
        if (this.f35464F != null) {
            this.f35465G.addLast(new C4599m(fragment.mWho, i));
            this.f35464F.launch(strArr);
            return;
        }
        this.f35498v.onRequestPermissionsFromFragment(fragment, strArr, i);
    }

    /* renamed from: M */
    public void m54421M() {
        m54409S(5);
    }

    /* renamed from: M0 */
    public void m54420M0(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.f35462D != null) {
            this.f35465G.addLast(new C4599m(fragment.mWho, i));
            if (bundle != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            this.f35462D.launch(intent);
            return;
        }
        this.f35498v.onStartActivityFromFragment(fragment, intent, i, bundle);
    }

    /* renamed from: N */
    public void m54419N(boolean z, boolean z2) {
        if (z2 && (this.f35498v instanceof OnPictureInPictureModeChangedProvider)) {
            m54346p1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m54419N(z, true);
                }
            }
        }
    }

    /* renamed from: N0 */
    public void m54418N0(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f35463E != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(bundle);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest build = new IntentSenderRequest.Builder(intentSender).setFillInIntent(intent2).setFlags(i3, i2).build();
            this.f35465G.addLast(new C4599m(fragment.mWho, i));
            if (isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.f35463E.launch(build);
            return;
        }
        this.f35498v.onStartIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: O */
    public boolean m54417O(Menu menu) {
        boolean z = false;
        if (this.f35497u < 1) {
            return false;
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null && m54438D0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: O0 */
    public void m54416O0(int i, boolean z) {
        FragmentHostCallback fragmentHostCallback;
        if (this.f35498v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.f35497u) {
            return;
        }
        this.f35497u = i;
        this.f35479c.m54179u();
        m54349o1();
        if (this.f35466H && (fragmentHostCallback = this.f35498v) != null && this.f35497u == 7) {
            fragmentHostCallback.onSupportInvalidateOptionsMenu();
            this.f35466H = false;
        }
    }

    /* renamed from: P */
    public void m54415P() {
        m54343q1();
        m54423L(this.f35501y);
    }

    /* renamed from: P0 */
    public void m54414P0() {
        if (this.f35498v == null) {
            return;
        }
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: Q */
    public void m54413Q() {
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        m54409S(7);
    }

    /* renamed from: Q0 */
    public void m54412Q0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C4633j c4633j : this.f35479c.m54188l()) {
            Fragment m54214k = c4633j.m54214k();
            if (m54214k.mContainerId == fragmentContainerView.getId() && (view = m54214k.mView) != null && view.getParent() == null) {
                m54214k.mContainer = fragmentContainerView;
                c4633j.m54223b();
            }
        }
    }

    /* renamed from: R */
    public void m54411R() {
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        m54409S(5);
    }

    /* renamed from: R0 */
    public void m54410R0(C4633j c4633j) {
        Fragment m54214k = c4633j.m54214k();
        if (m54214k.mDeferStart) {
            if (this.f35478b) {
                this.f35470L = true;
                return;
            }
            m54214k.mDeferStart = false;
            c4633j.m54212m();
        }
    }

    /* renamed from: S */
    public final void m54409S(int i) {
        try {
            this.f35478b = true;
            this.f35479c.m54196d(i);
            m54416O0(i, false);
            for (SpecialEffectsController specialEffectsController : m54338t()) {
                specialEffectsController.forceCompleteAllOperations();
            }
            this.f35478b = false;
            m54395Z(true);
        } catch (Throwable th2) {
            this.f35478b = false;
            throw th2;
        }
    }

    /* renamed from: S0 */
    public void m54408S0(int i, int i2, boolean z) {
        if (i >= 0) {
            m54399X(new C4603p(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: T */
    public void m54407T() {
        this.f35468J = true;
        this.f35474P.m54229o(true);
        m54409S(4);
    }

    /* renamed from: T0 */
    public final boolean m54406T0(String str, int i, int i2) {
        m54395Z(false);
        m54397Y(true);
        Fragment fragment = this.f35501y;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean m54404U0 = m54404U0(this.f35471M, this.f35472N, str, i, i2);
        if (m54404U0) {
            this.f35478b = true;
            try {
                m54400W0(this.f35471M, this.f35472N);
            } finally {
                m54345q();
            }
        }
        m54343q1();
        m54403V();
        this.f35479c.m54198b();
        return m54404U0;
    }

    /* renamed from: U */
    public void m54405U() {
        m54409S(2);
    }

    /* renamed from: U0 */
    public boolean m54404U0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int m54380e0 = m54380e0(str, i, z);
        if (m54380e0 < 0) {
            return false;
        }
        for (int size = this.f35480d.size() - 1; size >= m54380e0; size--) {
            arrayList.add((C4615a) this.f35480d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: V */
    public final void m54403V() {
        if (this.f35470L) {
            this.f35470L = false;
            m54349o1();
        }
    }

    /* renamed from: V0 */
    public void m54402V0(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f35479c.m54178v(fragment);
            if (m54444A0(fragment)) {
                this.f35466H = true;
            }
            fragment.mRemoving = true;
            m54355m1(fragment);
        }
    }

    /* renamed from: W */
    public final void m54401W() {
        for (SpecialEffectsController specialEffectsController : m54338t()) {
            specialEffectsController.forceCompleteAllOperations();
        }
    }

    /* renamed from: W0 */
    public final void m54400W0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C4615a) arrayList.get(i)).f35578r) {
                    if (i2 != i) {
                        m54386c0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C4615a) arrayList.get(i2)).f35578r) {
                            i2++;
                        }
                    }
                    m54386c0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m54386c0(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: X */
    public void m54399X(InterfaceC4602o interfaceC4602o, boolean z) {
        if (!z) {
            if (this.f35498v == null) {
                if (this.f35469K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m54348p();
        }
        synchronized (this.f35477a) {
            try {
                if (this.f35498v == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f35477a.add(interfaceC4602o);
                m54367i1();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X0 */
    public void m54398X0(Fragment fragment) {
        this.f35474P.m54231m(fragment);
    }

    /* renamed from: Y */
    public final void m54397Y(boolean z) {
        if (!this.f35478b) {
            if (this.f35498v == null) {
                if (this.f35469K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f35498v.getHandler().getLooper()) {
                if (!z) {
                    m54348p();
                }
                if (this.f35471M == null) {
                    this.f35471M = new ArrayList();
                    this.f35472N = new ArrayList();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: Y0 */
    public final void m54396Y0() {
        if (this.f35489m != null) {
            for (int i = 0; i < this.f35489m.size(); i++) {
                ((OnBackStackChangedListener) this.f35489m.get(i)).onBackStackChanged();
            }
        }
    }

    /* renamed from: Z */
    public boolean m54395Z(boolean z) {
        m54397Y(z);
        boolean z2 = false;
        while (m54362k0(this.f35471M, this.f35472N)) {
            z2 = true;
            this.f35478b = true;
            try {
                m54400W0(this.f35471M, this.f35472N);
            } finally {
                m54345q();
            }
        }
        m54343q1();
        m54403V();
        this.f35479c.m54198b();
        return z2;
    }

    /* renamed from: Z0 */
    public void m54394Z0(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (this.f35498v instanceof ViewModelStoreOwner) {
            m54346p1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f35474P.m54230n(fragmentManagerNonConfig);
        m54385c1(parcelable);
    }

    /* renamed from: a0 */
    public void m54392a0(InterfaceC4602o interfaceC4602o, boolean z) {
        if (z && (this.f35498v == null || this.f35469K)) {
            return;
        }
        m54397Y(z);
        if (interfaceC4602o.mo54284a(this.f35471M, this.f35472N)) {
            this.f35478b = true;
            try {
                m54400W0(this.f35471M, this.f35472N);
            } finally {
                m54345q();
            }
        }
        m54343q1();
        m54403V();
        this.f35479c.m54198b();
    }

    /* renamed from: a1 */
    public boolean m54391a1(ArrayList arrayList, ArrayList arrayList2, String str) {
        C4618c c4618c = (C4618c) this.f35486j.remove(str);
        if (c4618c == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4615a c4615a = (C4615a) it.next();
            if (c4615a.f35624w) {
                Iterator it2 = c4615a.f35563c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.C4610a) it2.next()).f35581b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        while (true) {
            boolean z = false;
            for (C4615a c4615a2 : c4618c.m54267a(this, hashMap)) {
                if (c4615a2.mo54284a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public void addFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.f35491o.add(fragmentOnAttachListener);
    }

    public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        if (this.f35489m == null) {
            this.f35489m = new ArrayList();
        }
        this.f35489m.add(onBackStackChangedListener);
    }

    /* renamed from: b1 */
    public void m54388b1(Parcelable parcelable) {
        if (this.f35498v instanceof SavedStateRegistryOwner) {
            m54346p1(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        m54385c1(parcelable);
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new C4615a(this);
    }

    /* renamed from: c0 */
    public final void m54386c0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        boolean z = ((C4615a) arrayList.get(i)).f35578r;
        ArrayList arrayList4 = this.f35473O;
        if (arrayList4 == null) {
            this.f35473O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f35473O.addAll(this.f35479c.m54184p());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C4615a c4615a = (C4615a) arrayList.get(i3);
            if (!((Boolean) arrayList2.get(i3)).booleanValue()) {
                primaryNavigationFragment = c4615a.m54275m(this.f35473O, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = c4615a.m54273o(this.f35473O, primaryNavigationFragment);
            }
            if (!z2 && !c4615a.f35569i) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.f35473O.clear();
        if (!z && this.f35497u >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator it = ((C4615a) arrayList.get(i4)).f35563c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.C4610a) it.next()).f35581b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f35479c.m54181s(m54334v(fragment));
                    }
                }
            }
        }
        m54389b0(arrayList, arrayList2, i, i2);
        boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z2 && (arrayList3 = this.f35489m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m54365j0((C4615a) it2.next()));
            }
            Iterator it3 = this.f35489m.iterator();
            while (it3.hasNext()) {
                OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it3.next();
                for (Fragment fragment2 : linkedHashSet) {
                    onBackStackChangedListener.onBackStackChangeStarted(fragment2, booleanValue);
                }
            }
            Iterator it4 = this.f35489m.iterator();
            while (it4.hasNext()) {
                OnBackStackChangedListener onBackStackChangedListener2 = (OnBackStackChangedListener) it4.next();
                for (Fragment fragment3 : linkedHashSet) {
                    onBackStackChangedListener2.onBackStackChangeCommitted(fragment3, booleanValue);
                }
            }
        }
        for (int i5 = i; i5 < i2; i5++) {
            C4615a c4615a2 = (C4615a) arrayList.get(i5);
            if (booleanValue) {
                for (int size = c4615a2.f35563c.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = ((FragmentTransaction.C4610a) c4615a2.f35563c.get(size)).f35581b;
                    if (fragment4 != null) {
                        m54334v(fragment4).m54212m();
                    }
                }
            } else {
                Iterator it5 = c4615a2.f35563c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment5 = ((FragmentTransaction.C4610a) it5.next()).f35581b;
                    if (fragment5 != null) {
                        m54334v(fragment5).m54212m();
                    }
                }
            }
        }
        m54416O0(this.f35497u, true);
        for (SpecialEffectsController specialEffectsController : m54336u(arrayList, i, i2)) {
            specialEffectsController.updateOperationDirection(booleanValue);
            specialEffectsController.markPostponedState();
            specialEffectsController.executePendingOperations();
        }
        while (i < i2) {
            C4615a c4615a3 = (C4615a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && c4615a3.f35623v >= 0) {
                c4615a3.f35623v = -1;
            }
            c4615a3.m54274n();
            i++;
        }
        if (z2) {
            m54396Y0();
        }
    }

    /* renamed from: c1 */
    public void m54385c1(Parcelable parcelable) {
        C4633j c4633j;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f35498v.m54448b().getClassLoader());
                this.f35487k.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f35498v.m54448b().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f35479c.m54175y(hashMap);
        C4627g c4627g = (C4627g) bundle3.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (c4627g == null) {
            return;
        }
        this.f35479c.m54177w();
        Iterator it = c4627g.f35655a.iterator();
        while (it.hasNext()) {
            Bundle m54200C = this.f35479c.m54200C((String) it.next(), null);
            if (m54200C != null) {
                Fragment m54238f = this.f35474P.m54238f(((C4631i) m54200C.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).f35672b);
                if (m54238f != null) {
                    if (isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(m54238f);
                    }
                    c4633j = new C4633j(this.f35490n, this.f35479c, m54238f, m54200C);
                } else {
                    c4633j = new C4633j(this.f35490n, this.f35479c, this.f35498v.m54448b().getClassLoader(), getFragmentFactory(), m54200C);
                }
                Fragment m54214k = c4633j.m54214k();
                m54214k.mSavedFragmentState = m54200C;
                m54214k.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(m54214k.mWho);
                    sb2.append("): ");
                    sb2.append(m54214k);
                }
                c4633j.m54210o(this.f35498v.m54448b().getClassLoader());
                this.f35479c.m54181s(c4633j);
                c4633j.m54205t(this.f35497u);
            }
        }
        for (Fragment fragment : this.f35474P.m54235i()) {
            if (!this.f35479c.m54197c(fragment.mWho)) {
                if (isLoggingEnabled(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(c4627g.f35655a);
                }
                this.f35474P.m54231m(fragment);
                fragment.mFragmentManager = this;
                C4633j c4633j2 = new C4633j(this.f35490n, this.f35479c, fragment);
                c4633j2.m54205t(1);
                c4633j2.m54212m();
                fragment.mRemoving = true;
                c4633j2.m54212m();
            }
        }
        this.f35479c.m54176x(c4627g.f35656b);
        if (c4627g.f35657c != null) {
            this.f35480d = new ArrayList(c4627g.f35657c.length);
            int i = 0;
            while (true) {
                C4616b[] c4616bArr = c4627g.f35657c;
                if (i >= c4616bArr.length) {
                    break;
                }
                C4615a m54271b = c4616bArr[i].m54271b(this);
                if (isLoggingEnabled(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i);
                    sb4.append(" (index ");
                    sb4.append(m54271b.f35623v);
                    sb4.append("): ");
                    sb4.append(m54271b);
                    PrintWriter printWriter = new PrintWriter(new C19230bl0(TAG));
                    m54271b.m54278j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f35480d.add(m54271b);
                i++;
            }
        } else {
            this.f35480d = null;
        }
        this.f35485i.set(c4627g.f35658d);
        String str3 = c4627g.f35659e;
        if (str3 != null) {
            Fragment m54383d0 = m54383d0(str3);
            this.f35501y = m54383d0;
            m54423L(m54383d0);
        }
        ArrayList arrayList = c4627g.f35660f;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f35486j.put((String) arrayList.get(i2), (C4618c) c4627g.f35661g.get(i2));
            }
        }
        this.f35465G = new ArrayDeque(c4627g.f35662h);
    }

    public void clearBackStack(@NonNull String str) {
        m54399X(new C4597k(str), false);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@NonNull String str) {
        this.f35487k.remove(str);
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing fragment result with key ");
            sb.append(str);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@NonNull String str) {
        C4601n c4601n = (C4601n) this.f35488l.remove(str);
        if (c4601n != null) {
            c4601n.m54317b();
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
        }
    }

    /* renamed from: d0 */
    public Fragment m54383d0(String str) {
        return this.f35479c.m54194f(str);
    }

    /* renamed from: d1 */
    public FragmentManagerNonConfig m54382d1() {
        if (this.f35498v instanceof ViewModelStoreOwner) {
            m54346p1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f35474P.m54234j();
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f35479c.m54195e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f35481e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f35481e.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.f35480d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C4615a c4615a = (C4615a) this.f35480d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c4615a.toString());
                c4615a.m54279i(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f35485i.get());
        synchronized (this.f35477a) {
            try {
                int size3 = this.f35477a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i3 = 0; i3 < size3; i3++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println((InterfaceC4602o) this.f35477a.get(i3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f35498v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f35499w);
        if (this.f35500x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f35500x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f35497u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f35467I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f35468J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f35469K);
        if (this.f35466H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f35466H);
        }
    }

    /* renamed from: e0 */
    public final int m54380e0(String str, int i, boolean z) {
        ArrayList arrayList = this.f35480d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f35480d.size() - 1;
        }
        int size = this.f35480d.size() - 1;
        while (size >= 0) {
            C4615a c4615a = (C4615a) this.f35480d.get(size);
            if ((str != null && str.equals(c4615a.getName())) || (i >= 0 && i == c4615a.f35623v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z) {
            while (size > 0) {
                C4615a c4615a2 = (C4615a) this.f35480d.get(size - 1);
                if ((str != null && str.equals(c4615a2.getName())) || (i >= 0 && i == c4615a2.f35623v)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.f35480d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    @MainThread
    public boolean executePendingTransactions() {
        boolean m54395Z = m54395Z(true);
        m54368i0();
        return m54395Z;
    }

    /* renamed from: f0 */
    public Fragment m54377f0(String str) {
        return this.f35479c.m54191i(str);
    }

    /* renamed from: f1 */
    public Parcelable m54376f1() {
        if (this.f35498v instanceof SavedStateRegistryOwner) {
            m54346p1(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle m54432G0 = m54432G0();
        if (m54432G0.isEmpty()) {
            return null;
        }
        return m54432G0;
    }

    @Nullable
    public Fragment findFragmentById(@IdRes int i) {
        return this.f35479c.m54193g(i);
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        return this.f35479c.m54192h(str);
    }

    /* renamed from: g1 */
    public Bundle m54432G0() {
        C4616b[] c4616bArr;
        int size;
        Bundle bundle = new Bundle();
        m54368i0();
        m54401W();
        m54395Z(true);
        this.f35467I = true;
        this.f35474P.m54229o(true);
        ArrayList m54174z = this.f35479c.m54174z();
        HashMap m54186n = this.f35479c.m54186n();
        if (m54186n.isEmpty()) {
            isLoggingEnabled(2);
        } else {
            ArrayList m54202A = this.f35479c.m54202A();
            ArrayList arrayList = this.f35480d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                c4616bArr = new C4616b[size];
                for (int i = 0; i < size; i++) {
                    c4616bArr[i] = new C4616b((C4615a) this.f35480d.get(i));
                    if (isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f35480d.get(i));
                    }
                }
            } else {
                c4616bArr = null;
            }
            C4627g c4627g = new C4627g();
            c4627g.f35655a = m54174z;
            c4627g.f35656b = m54202A;
            c4627g.f35657c = c4616bArr;
            c4627g.f35658d = this.f35485i.get();
            Fragment fragment = this.f35501y;
            if (fragment != null) {
                c4627g.f35659e = fragment.mWho;
            }
            c4627g.f35660f.addAll(this.f35486j.keySet());
            c4627g.f35661g.addAll(this.f35486j.values());
            c4627g.f35662h = new ArrayList(this.f35465G);
            bundle.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, c4627g);
            for (String str : this.f35487k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f35487k.get(str));
            }
            for (String str2 : m54186n.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m54186n.get(str2));
            }
        }
        return bundle;
    }

    @NonNull
    public BackStackEntry getBackStackEntryAt(int i) {
        return (BackStackEntry) this.f35480d.get(i);
    }

    public int getBackStackEntryCount() {
        ArrayList arrayList = this.f35480d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Nullable
    public Fragment getFragment(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m54383d0 = m54383d0(string);
        if (m54383d0 == null) {
            m54346p1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m54383d0;
    }

    @NonNull
    public FragmentFactory getFragmentFactory() {
        FragmentFactory fragmentFactory = this.f35502z;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.f35500x;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.f35459A;
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.f35479c.m54184p();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FragmentHostCallback<?> getHost() {
        return this.f35498v;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.f35501y;
    }

    @Nullable
    public FragmentStrictMode.Policy getStrictModePolicy() {
        return this.f35475Q;
    }

    /* renamed from: h1 */
    public boolean m54370h1(ArrayList arrayList, ArrayList arrayList2, String str) {
        String str2;
        String str3;
        int i;
        int m54380e0 = m54380e0(str, -1, true);
        if (m54380e0 < 0) {
            return false;
        }
        for (int i2 = m54380e0; i2 < this.f35480d.size(); i2++) {
            C4615a c4615a = (C4615a) this.f35480d.get(i2);
            if (!c4615a.f35578r) {
                m54346p1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c4615a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = m54380e0; i3 < this.f35480d.size(); i3++) {
            C4615a c4615a2 = (C4615a) this.f35480d.get(i3);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = c4615a2.f35563c.iterator();
            while (it.hasNext()) {
                FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) it.next();
                Fragment fragment = c4610a.f35581b;
                if (fragment != null) {
                    if (!c4610a.f35582c || (i = c4610a.f35580a) == 1 || i == 2 || i == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i4 = c4610a.f35580a;
                    if (i4 == 1 || i4 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb.append(str3);
                sb.append(" in ");
                sb.append(c4615a2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                m54346p1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb2.append(str2);
                sb2.append("fragment ");
                sb2.append(fragment2);
                m54346p1(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.m54356m0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f35480d.size() - m54380e0);
        for (int i5 = m54380e0; i5 < this.f35480d.size(); i5++) {
            arrayList4.add(null);
        }
        C4618c c4618c = new C4618c(arrayList3, arrayList4);
        for (int size = this.f35480d.size() - 1; size >= m54380e0; size--) {
            C4615a c4615a3 = (C4615a) this.f35480d.remove(size);
            C4615a c4615a4 = new C4615a(c4615a3);
            c4615a4.m54281g();
            arrayList4.set(size - m54380e0, new C4616b(c4615a4));
            c4615a3.f35624w = true;
            arrayList.add(c4615a3);
            arrayList2.add(Boolean.TRUE);
        }
        this.f35486j.put(str, c4618c);
        return true;
    }

    /* renamed from: i */
    public void m54369i(C4615a c4615a) {
        if (this.f35480d == null) {
            this.f35480d = new ArrayList();
        }
        this.f35480d.add(c4615a);
    }

    /* renamed from: i0 */
    public final void m54368i0() {
        for (SpecialEffectsController specialEffectsController : m54338t()) {
            specialEffectsController.forcePostponedExecutePendingOperations();
        }
    }

    /* renamed from: i1 */
    public void m54367i1() {
        synchronized (this.f35477a) {
            try {
                if (this.f35477a.size() == 1) {
                    this.f35498v.getHandler().removeCallbacks(this.f35476R);
                    this.f35498v.getHandler().post(this.f35476R);
                    m54343q1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isDestroyed() {
        return this.f35469K;
    }

    public boolean isStateSaved() {
        if (!this.f35467I && !this.f35468J) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C4633j m54366j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        C4633j m54334v = m54334v(fragment);
        fragment.mFragmentManager = this;
        this.f35479c.m54181s(m54334v);
        if (!fragment.mDetached) {
            this.f35479c.m54199a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m54444A0(fragment)) {
                this.f35466H = true;
            }
        }
        return m54334v;
    }

    /* renamed from: j0 */
    public final Set m54365j0(C4615a c4615a) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c4615a.f35563c.size(); i++) {
            Fragment fragment = ((FragmentTransaction.C4610a) c4615a.f35563c.get(i)).f35581b;
            if (fragment != null && c4615a.f35569i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    /* renamed from: j1 */
    public void m54364j1(Fragment fragment, boolean z) {
        ViewGroup m54347p0 = m54347p0(fragment);
        if (m54347p0 != null && (m54347p0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) m54347p0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: k */
    public void m54363k(Fragment fragment) {
        this.f35474P.m54242b(fragment);
    }

    /* renamed from: k0 */
    public final boolean m54362k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f35477a) {
            if (this.f35477a.isEmpty()) {
                return false;
            }
            int size = this.f35477a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= ((InterfaceC4602o) this.f35477a.get(i)).mo54284a(arrayList, arrayList2);
            }
            this.f35477a.clear();
            this.f35498v.getHandler().removeCallbacks(this.f35476R);
            return z;
        }
    }

    /* renamed from: k1 */
    public void m54361k1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(m54383d0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: l */
    public int m54360l() {
        return this.f35485i.getAndIncrement();
    }

    /* renamed from: l0 */
    public int m54359l0() {
        return this.f35479c.m54189k();
    }

    /* renamed from: l1 */
    public void m54358l1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m54383d0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f35501y;
        this.f35501y = fragment;
        m54423L(fragment2);
        m54423L(this.f35501y);
    }

    /* renamed from: m */
    public void m54357m(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        String str;
        if (this.f35498v == null) {
            this.f35498v = fragmentHostCallback;
            this.f35499w = fragmentContainer;
            this.f35500x = fragment;
            if (fragment != null) {
                addFragmentOnAttachListener(new C4594h(fragment));
            } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
                addFragmentOnAttachListener((FragmentOnAttachListener) fragmentHostCallback);
            }
            if (this.f35500x != null) {
                m54343q1();
            }
            if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                this.f35483g = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.addCallback(lifecycleOwner, this.f35484h);
            }
            if (fragment != null) {
                this.f35474P = fragment.mFragmentManager.m54353n0(fragment);
            } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
                this.f35474P = C4629h.m54236h(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
            } else {
                this.f35474P = new C4629h(false);
            }
            this.f35474P.m54229o(isStateSaved());
            this.f35479c.m54201B(this.f35474P);
            FragmentHostCallback fragmentHostCallback2 = this.f35498v;
            if ((fragmentHostCallback2 instanceof SavedStateRegistryOwner) && fragment == null) {
                SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) fragmentHostCallback2).getSavedStateRegistry();
                savedStateRegistry.registerSavedStateProvider("android:support:fragments", new SavedStateRegistry.SavedStateProvider() { // from class: T40
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle saveState() {
                        return FragmentManager.m54390b(FragmentManager.this);
                    }
                });
                Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
                if (consumeRestoredStateForKey != null) {
                    m54385c1(consumeRestoredStateForKey);
                }
            }
            FragmentHostCallback fragmentHostCallback3 = this.f35498v;
            if (fragmentHostCallback3 instanceof ActivityResultRegistryOwner) {
                ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) fragmentHostCallback3).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f35462D = activityResultRegistry.register(str2 + "StartActivityForResult", new ActivityResultContracts.StartActivityForResult(), new C4595i());
                this.f35463E = activityResultRegistry.register(str2 + "StartIntentSenderForResult", new C4598l(), new C4596j());
                this.f35464F = activityResultRegistry.register(str2 + "RequestPermissions", new ActivityResultContracts.RequestMultiplePermissions(), new C4587a());
            }
            FragmentHostCallback fragmentHostCallback4 = this.f35498v;
            if (fragmentHostCallback4 instanceof OnConfigurationChangedProvider) {
                ((OnConfigurationChangedProvider) fragmentHostCallback4).addOnConfigurationChangedListener(this.f35492p);
            }
            FragmentHostCallback fragmentHostCallback5 = this.f35498v;
            if (fragmentHostCallback5 instanceof OnTrimMemoryProvider) {
                ((OnTrimMemoryProvider) fragmentHostCallback5).addOnTrimMemoryListener(this.f35493q);
            }
            FragmentHostCallback fragmentHostCallback6 = this.f35498v;
            if (fragmentHostCallback6 instanceof OnMultiWindowModeChangedProvider) {
                ((OnMultiWindowModeChangedProvider) fragmentHostCallback6).addOnMultiWindowModeChangedListener(this.f35494r);
            }
            FragmentHostCallback fragmentHostCallback7 = this.f35498v;
            if (fragmentHostCallback7 instanceof OnPictureInPictureModeChangedProvider) {
                ((OnPictureInPictureModeChangedProvider) fragmentHostCallback7).addOnPictureInPictureModeChangedListener(this.f35495s);
            }
            FragmentHostCallback fragmentHostCallback8 = this.f35498v;
            if ((fragmentHostCallback8 instanceof MenuHost) && fragment == null) {
                ((MenuHost) fragmentHostCallback8).addMenuProvider(this.f35496t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: m0 */
    public List m54356m0() {
        return this.f35479c.m54187m();
    }

    /* renamed from: m1 */
    public final void m54355m1(Fragment fragment) {
        ViewGroup m54347p0 = m54347p0(fragment);
        if (m54347p0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (m54347p0.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                m54347p0.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) m54347p0.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: n */
    public void m54354n(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f35479c.m54199a(fragment);
                if (isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                }
                if (m54444A0(fragment)) {
                    this.f35466H = true;
                }
            }
        }
    }

    /* renamed from: n0 */
    public final C4629h m54353n0(Fragment fragment) {
        return this.f35474P.m54237g(fragment);
    }

    /* renamed from: n1 */
    public void m54352n1(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: o */
    public boolean m54351o() {
        boolean z = false;
        for (Fragment fragment : this.f35479c.m54187m()) {
            if (fragment != null) {
                z = m54444A0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public FragmentContainer m54350o0() {
        return this.f35499w;
    }

    /* renamed from: o1 */
    public final void m54349o1() {
        for (C4633j c4633j : this.f35479c.m54188l()) {
            m54410R0(c4633j);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    /* renamed from: p */
    public final void m54348p() {
        if (!isStateSaved()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* renamed from: p0 */
    public final ViewGroup m54347p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f35499w.onHasView()) {
            View onFindViewById = this.f35499w.onFindViewById(fragment.mContainerId);
            if (onFindViewById instanceof ViewGroup) {
                return (ViewGroup) onFindViewById;
            }
        }
        return null;
    }

    /* renamed from: p1 */
    public final void m54346p1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C19230bl0(TAG));
        FragmentHostCallback fragmentHostCallback = this.f35498v;
        try {
            if (fragmentHostCallback != null) {
                fragmentHostCallback.onDump("  ", null, printWriter, new String[0]);
            } else {
                dump("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw runtimeException;
    }

    public void popBackStack() {
        m54399X(new C4603p(null, -1, 0), false);
    }

    @MainThread
    public boolean popBackStackImmediate() {
        return m54406T0(null, -1, 0);
    }

    public void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m54346p1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: q */
    public final void m54345q() {
        this.f35478b = false;
        this.f35472N.clear();
        this.f35471M.clear();
    }

    /* renamed from: q0 */
    public C4636k m54344q0() {
        return this.f35479c;
    }

    /* renamed from: q1 */
    public final void m54343q1() {
        synchronized (this.f35477a) {
            try {
                boolean z = true;
                if (!this.f35477a.isEmpty()) {
                    this.f35484h.setEnabled(true);
                } else {
                    this.f35484h.setEnabled((getBackStackEntryCount() <= 0 || !m54436E0(this.f35500x)) ? false : false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public boolean m54342r(ArrayList arrayList, ArrayList arrayList2, String str) {
        if (!m54391a1(arrayList, arrayList2, str)) {
            return false;
        }
        return m54404U0(arrayList, arrayList2, str, -1, 1);
    }

    /* renamed from: r0 */
    public LayoutInflater.Factory2 m54341r0() {
        return this.f35482f;
    }

    public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.f35490n.m54246o(fragmentLifecycleCallbacks, z);
    }

    public void removeFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.f35491o.remove(fragmentOnAttachListener);
    }

    public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList arrayList = this.f35489m;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    public void restoreBackStack(@NonNull String str) {
        m54399X(new C4604q(str), false);
    }

    /* renamed from: s */
    public final void m54340s() {
        boolean z;
        FragmentHostCallback fragmentHostCallback = this.f35498v;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z = this.f35479c.m54183q().m54232l();
        } else if (fragmentHostCallback.m54448b() instanceof Activity) {
            z = !((Activity) this.f35498v.m54448b()).isChangingConfigurations();
        } else {
            z = true;
        }
        if (z) {
            for (C4618c c4618c : this.f35486j.values()) {
                for (String str : c4618c.f35639a) {
                    this.f35479c.m54183q().m54240d(str);
                }
            }
        }
    }

    /* renamed from: s0 */
    public C4625f m54339s0() {
        return this.f35490n;
    }

    public void saveBackStack(@NonNull String str) {
        m54399X(new C4605r(str), false);
    }

    @Nullable
    public Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment fragment) {
        C4633j m54185o = this.f35479c.m54185o(fragment.mWho);
        if (m54185o == null || !m54185o.m54214k().equals(fragment)) {
            m54346p1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m54185o.m54208q();
    }

    public void setFragmentFactory(@NonNull FragmentFactory fragmentFactory) {
        this.f35502z = fragmentFactory;
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@NonNull String str, @NonNull Bundle bundle) {
        C4601n c4601n = (C4601n) this.f35488l.get(str);
        if (c4601n != null && c4601n.m54318a(Lifecycle.State.STARTED)) {
            c4601n.onFragmentResult(str, bundle);
        } else {
            this.f35487k.put(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting fragment result with key ");
            sb.append(str);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    @SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentResultListener fragmentResultListener) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C4593g c4593g = new C4593g(str, fragmentResultListener, lifecycle);
        C4601n c4601n = (C4601n) this.f35488l.put(str, new C4601n(lifecycle, fragmentResultListener, c4593g));
        if (c4601n != null) {
            c4601n.m54317b();
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting FragmentResultListener with key ");
            sb.append(str);
            sb.append(" lifecycleOwner ");
            sb.append(lifecycle);
            sb.append(" and listener ");
            sb.append(fragmentResultListener);
        }
        lifecycle.addObserver(c4593g);
    }

    public void setStrictModePolicy(@Nullable FragmentStrictMode.Policy policy) {
        this.f35475Q = policy;
    }

    /* renamed from: t */
    public final Set m54338t() {
        HashSet hashSet = new HashSet();
        for (C4633j c4633j : this.f35479c.m54188l()) {
            ViewGroup viewGroup = c4633j.m54214k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, m54335u0()));
            }
        }
        return hashSet;
    }

    /* renamed from: t0 */
    public Fragment m54337t0() {
        return this.f35500x;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f35500x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f35500x)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.f35498v;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f35498v)));
                sb.append("}");
            } else {
                sb.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final Set m54336u(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C4615a) arrayList.get(i)).f35563c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.C4610a) it.next()).f35581b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: u0 */
    public AK1 m54335u0() {
        AK1 ak1 = this.f35460B;
        if (ak1 != null) {
            return ak1;
        }
        Fragment fragment = this.f35500x;
        if (fragment != null) {
            return fragment.mFragmentManager.m54335u0();
        }
        return this.f35461C;
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f35490n.m54245p(fragmentLifecycleCallbacks);
    }

    /* renamed from: v */
    public C4633j m54334v(Fragment fragment) {
        C4633j m54185o = this.f35479c.m54185o(fragment.mWho);
        if (m54185o != null) {
            return m54185o;
        }
        C4633j c4633j = new C4633j(this.f35490n, this.f35479c, fragment);
        c4633j.m54210o(this.f35498v.m54448b().getClassLoader());
        c4633j.m54205t(this.f35497u);
        return c4633j;
    }

    /* renamed from: w */
    public void m54332w(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                }
                this.f35479c.m54178v(fragment);
                if (m54444A0(fragment)) {
                    this.f35466H = true;
                }
                m54355m1(fragment);
            }
        }
    }

    /* renamed from: w0 */
    public ViewModelStore m54331w0(Fragment fragment) {
        return this.f35474P.m54233k(fragment);
    }

    /* renamed from: x */
    public void m54330x() {
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        m54409S(4);
    }

    /* renamed from: x0 */
    public void m54329x0() {
        m54395Z(true);
        if (this.f35484h.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.f35483g.onBackPressed();
        }
    }

    /* renamed from: y */
    public void m54328y() {
        this.f35467I = false;
        this.f35468J = false;
        this.f35474P.m54229o(false);
        m54409S(0);
    }

    /* renamed from: y0 */
    public void m54327y0(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m54355m1(fragment);
        }
    }

    /* renamed from: z */
    public void m54326z(Configuration configuration, boolean z) {
        if (z && (this.f35498v instanceof OnConfigurationChangedProvider)) {
            m54346p1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f35479c.m54184p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.m54326z(configuration, true);
                }
            }
        }
    }

    /* renamed from: z0 */
    public void m54325z0(Fragment fragment) {
        if (fragment.mAdded && m54444A0(fragment)) {
            this.f35466H = true;
        }
    }

    public void popBackStack(@Nullable String str, int i) {
        m54399X(new C4603p(str, -1, i), false);
    }

    @MainThread
    public boolean popBackStackImmediate(@Nullable String str, int i) {
        return m54406T0(str, -1, i);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes2.dex */
    public static class C4599m implements Parcelable {
        public static final Parcelable.Creator<C4599m> CREATOR = new C4600a();

        /* renamed from: a */
        public String f35519a;

        /* renamed from: b */
        public int f35520b;

        /* renamed from: androidx.fragment.app.FragmentManager$m$a */
        /* loaded from: classes2.dex */
        public class C4600a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4599m createFromParcel(Parcel parcel) {
                return new C4599m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4599m[] newArray(int i) {
                return new C4599m[i];
            }
        }

        public C4599m(String str, int i) {
            this.f35519a = str;
            this.f35520b = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f35519a);
            parcel.writeInt(this.f35520b);
        }

        public C4599m(Parcel parcel) {
            this.f35519a = parcel.readString();
            this.f35520b = parcel.readInt();
        }
    }

    public void popBackStack(int i, int i2) {
        m54408S0(i, i2, false);
    }

    public boolean popBackStackImmediate(int i, int i2) {
        if (i >= 0) {
            return m54406T0(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }
}
