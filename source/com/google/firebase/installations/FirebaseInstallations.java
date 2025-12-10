package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {

    /* renamed from: m */
    public static final Object f55494m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f55495n = new ThreadFactoryC8512a();

    /* renamed from: a */
    public final FirebaseApp f55496a;

    /* renamed from: b */
    public final FirebaseInstallationServiceClient f55497b;

    /* renamed from: c */
    public final PersistedInstallation f55498c;

    /* renamed from: d */
    public final Utils f55499d;

    /* renamed from: e */
    public final Lazy f55500e;

    /* renamed from: f */
    public final RandomFidGenerator f55501f;

    /* renamed from: g */
    public final Object f55502g;

    /* renamed from: h */
    public final ExecutorService f55503h;

    /* renamed from: i */
    public final Executor f55504i;

    /* renamed from: j */
    public String f55505j;

    /* renamed from: k */
    public Set f55506k;

    /* renamed from: l */
    public final List f55507l;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$a */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC8512a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f55508a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f55508a.getAndIncrement())));
        }
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$b */
    /* loaded from: classes4.dex */
    public class C8513b implements FidListenerHandle {

        /* renamed from: a */
        public final /* synthetic */ FidListener f55509a;

        public C8513b(FidListener fidListener) {
            FirebaseInstallations.this = r1;
            this.f55509a = fidListener;
        }

        @Override // com.google.firebase.installations.internal.FidListenerHandle
        public void unregister() {
            synchronized (FirebaseInstallations.this) {
                FirebaseInstallations.this.f55506k.remove(this.f55509a);
            }
        }
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$c */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8514c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55511a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f55512b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f55512b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55512b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55512b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f55511a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55511a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public FirebaseInstallations(final FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new PersistedInstallation(firebaseApp), Utils.getInstance(), new Lazy(new Provider() { // from class: p10
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                IidStore m38625y;
                m38625y = FirebaseInstallations.m38625y(FirebaseApp.this);
                return m38625y;
            }
        }), new RandomFidGenerator());
    }

    /* renamed from: a */
    public static /* synthetic */ Void m38649a(FirebaseInstallations firebaseInstallations) {
        return firebaseInstallations.m38640j();
    }

    /* renamed from: b */
    public static /* synthetic */ void m38648b(FirebaseInstallations firebaseInstallations, boolean z) {
        firebaseInstallations.m38626x(z);
    }

    /* renamed from: c */
    public static /* synthetic */ void m38647c(FirebaseInstallations firebaseInstallations, boolean z) {
        firebaseInstallations.m38628v(z);
    }

    /* renamed from: d */
    public static /* synthetic */ void m38646d(FirebaseInstallations firebaseInstallations) {
        firebaseInstallations.m38627w();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: y */
    public static /* synthetic */ IidStore m38625y(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    /* renamed from: A */
    public final String m38655A(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.f55496a.getName().equals("CHIME_ANDROID_SDK") && !this.f55496a.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.f55501f.createRandomFid();
        }
        String readIid = m38633q().readIid();
        if (TextUtils.isEmpty(readIid)) {
            return this.f55501f.createRandomFid();
        }
        return readIid;
    }

    /* renamed from: B */
    public final PersistedInstallationEntry m38654B(PersistedInstallationEntry persistedInstallationEntry) {
        String str;
        if (persistedInstallationEntry.getFirebaseInstallationId() != null && persistedInstallationEntry.getFirebaseInstallationId().length() == 11) {
            str = m38633q().readToken();
        } else {
            str = null;
        }
        InstallationResponse createFirebaseInstallation = this.f55497b.createFirebaseInstallation(m38636n(), persistedInstallationEntry.getFirebaseInstallationId(), m38630t(), m38635o(), str);
        int i = C8514c.f55511a[createFirebaseInstallation.getResponseCode().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return persistedInstallationEntry.withFisError("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        return persistedInstallationEntry.withRegisteredFid(createFirebaseInstallation.getFid(), createFirebaseInstallation.getRefreshToken(), this.f55499d.currentTimeInSecs(), createFirebaseInstallation.getAuthToken().getToken(), createFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
    }

    /* renamed from: C */
    public final void m38653C(Exception exc) {
        synchronized (this.f55502g) {
            try {
                Iterator it = this.f55507l.iterator();
                while (it.hasNext()) {
                    if (((UL1) it.next()).mo38618a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D */
    public final void m38652D(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f55502g) {
            try {
                Iterator it = this.f55507l.iterator();
                while (it.hasNext()) {
                    if (((UL1) it.next()).mo38617b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: E */
    public final synchronized void m38651E(String str) {
        this.f55505j = str;
    }

    /* renamed from: F */
    public final synchronized void m38650F(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.f55506k.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
            for (FidListener fidListener : this.f55506k) {
                fidListener.onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.f55503h, new Callable() { // from class: r10
            {
                FirebaseInstallations.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseInstallations.m38649a(FirebaseInstallations.this);
            }
        });
    }

    /* renamed from: g */
    public final Task m38643g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m38641i(new C8519b(this.f55499d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        m38624z();
        String m38634p = m38634p();
        if (m38634p != null) {
            return Tasks.forResult(m38634p);
        }
        Task<String> m38642h = m38642h();
        this.f55503h.execute(new Runnable() { // from class: q10
            {
                FirebaseInstallations.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.m38646d(FirebaseInstallations.this);
            }
        });
        return m38642h;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(final boolean z) {
        m38624z();
        Task<InstallationTokenResult> m38643g = m38643g();
        this.f55503h.execute(new Runnable() { // from class: s10
            {
                FirebaseInstallations.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.m38648b(FirebaseInstallations.this, z);
            }
        });
        return m38643g;
    }

    /* renamed from: h */
    public final Task m38642h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m38641i(new P50(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: i */
    public final void m38641i(UL1 ul1) {
        synchronized (this.f55502g) {
            this.f55507l.add(ul1);
        }
    }

    /* renamed from: j */
    public final Void m38640j() {
        m38651E(null);
        PersistedInstallationEntry m38632r = m38632r();
        if (m38632r.isRegistered()) {
            this.f55497b.deleteFirebaseInstallation(m38636n(), m38632r.getFirebaseInstallationId(), m38630t(), m38632r.getRefreshToken());
        }
        m38629u(m38632r.withNoGeneratedFid());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004c  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38628v(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r2.m38632r()
            boolean r1 = r0.isErrored()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.isUnregistered()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.Utils r3 = r2.f55499d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            boolean r3 = r3.isAuthTokenExpired(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.m38637m(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            goto L28
        L24:
            com.google.firebase.installations.local.PersistedInstallationEntry r3 = r2.m38654B(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
        L28:
            r2.m38629u(r3)
            r2.m38650F(r0, r3)
            boolean r0 = r3.isRegistered()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.getFirebaseInstallationId()
            r2.m38651E(r0)
        L3b:
            boolean r0 = r3.isErrored()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.m38653C(r3)
            goto L60
        L4c:
            boolean r0 = r3.isNotGenerated()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m38653C(r3)
            goto L60
        L5d:
            r2.m38652D(r3)
        L60:
            return
        L61:
            r2.m38653C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.m38628v(boolean):void");
    }

    /* renamed from: l */
    public final void m38626x(final boolean z) {
        PersistedInstallationEntry m38631s = m38631s();
        if (z) {
            m38631s = m38631s.withClearedAuthToken();
        }
        m38652D(m38631s);
        this.f55504i.execute(new Runnable() { // from class: t10
            {
                FirebaseInstallations.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.m38647c(FirebaseInstallations.this, z);
            }
        });
    }

    /* renamed from: m */
    public final PersistedInstallationEntry m38637m(PersistedInstallationEntry persistedInstallationEntry) {
        TokenResult generateAuthToken = this.f55497b.generateAuthToken(m38636n(), persistedInstallationEntry.getFirebaseInstallationId(), m38630t(), persistedInstallationEntry.getRefreshToken());
        int i = C8514c.f55512b[generateAuthToken.getResponseCode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m38651E(null);
                    return persistedInstallationEntry.withNoGeneratedFid();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
            }
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        return persistedInstallationEntry.withAuthToken(generateAuthToken.getToken(), generateAuthToken.getTokenExpirationTimestamp(), this.f55499d.currentTimeInSecs());
    }

    /* renamed from: n */
    public String m38636n() {
        return this.f55496a.getOptions().getApiKey();
    }

    /* renamed from: o */
    public String m38635o() {
        return this.f55496a.getOptions().getApplicationId();
    }

    /* renamed from: p */
    public final synchronized String m38634p() {
        return this.f55505j;
    }

    /* renamed from: q */
    public final IidStore m38633q() {
        return (IidStore) this.f55500e.get();
    }

    /* renamed from: r */
    public final PersistedInstallationEntry m38632r() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (f55494m) {
            try {
                C1138Pz m66698a = C1138Pz.m66698a(this.f55496a.getApplicationContext(), "generatefid.lock");
                readPersistedInstallationEntryValue = this.f55498c.readPersistedInstallationEntryValue();
                if (m66698a != null) {
                    m66698a.m66697b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readPersistedInstallationEntryValue;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public synchronized FidListenerHandle registerFidListener(@NonNull FidListener fidListener) {
        this.f55506k.add(fidListener);
        return new C8513b(fidListener);
    }

    /* renamed from: s */
    public final PersistedInstallationEntry m38631s() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (f55494m) {
            try {
                C1138Pz m66698a = C1138Pz.m66698a(this.f55496a.getApplicationContext(), "generatefid.lock");
                readPersistedInstallationEntryValue = this.f55498c.readPersistedInstallationEntryValue();
                if (readPersistedInstallationEntryValue.isNotGenerated()) {
                    readPersistedInstallationEntryValue = this.f55498c.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue.withUnregisteredFid(m38655A(readPersistedInstallationEntryValue)));
                }
                if (m66698a != null) {
                    m66698a.m66697b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readPersistedInstallationEntryValue;
    }

    /* renamed from: t */
    public String m38630t() {
        return this.f55496a.getOptions().getProjectId();
    }

    /* renamed from: u */
    public final void m38629u(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (f55494m) {
            try {
                C1138Pz m66698a = C1138Pz.m66698a(this.f55496a.getApplicationContext(), "generatefid.lock");
                this.f55498c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                if (m66698a != null) {
                    m66698a.m66697b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public final /* synthetic */ void m38627w() {
        m38626x(false);
    }

    /* renamed from: z */
    public final void m38624z() {
        Preconditions.checkNotEmpty(m38635o(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m38630t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m38636n(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.m38619b(m38635o()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.m38620a(m38636n()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy lazy, RandomFidGenerator randomFidGenerator) {
        this.f55502g = new Object();
        this.f55506k = new HashSet();
        this.f55507l = new ArrayList();
        this.f55496a = firebaseApp;
        this.f55497b = firebaseInstallationServiceClient;
        this.f55498c = persistedInstallation;
        this.f55499d = utils;
        this.f55500e = lazy;
        this.f55501f = randomFidGenerator;
        this.f55503h = executorService;
        this.f55504i = executor;
    }
}
