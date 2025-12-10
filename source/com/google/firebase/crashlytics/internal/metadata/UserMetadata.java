package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;
    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";

    /* renamed from: a */
    public final C21831qs0 f54919a;

    /* renamed from: b */
    public final CrashlyticsWorkers f54920b;

    /* renamed from: c */
    public String f54921c;

    /* renamed from: d */
    public final C8376a f54922d = new C8376a(false);

    /* renamed from: e */
    public final C8376a f54923e = new C8376a(true);

    /* renamed from: f */
    public final RolloutAssignmentList f54924f = new RolloutAssignmentList(128);

    /* renamed from: g */
    public final AtomicMarkableReference f54925g = new AtomicMarkableReference(null, false);

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.UserMetadata$a */
    /* loaded from: classes4.dex */
    public class C8376a {

        /* renamed from: a */
        public final AtomicMarkableReference f54926a;

        /* renamed from: b */
        public final AtomicReference f54927b = new AtomicReference(null);

        /* renamed from: c */
        public final boolean f54928c;

        public C8376a(boolean z) {
            int i;
            UserMetadata.this = r2;
            this.f54928c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.f54926a = new AtomicMarkableReference(new C18306Qh0(64, i), false);
        }

        /* renamed from: a */
        public static /* synthetic */ void m38909a(C8376a c8376a) {
            c8376a.m38907c();
        }

        /* renamed from: b */
        public Map m38908b() {
            return ((C18306Qh0) this.f54926a.getReference()).m66541a();
        }

        /* renamed from: c */
        public final /* synthetic */ void m38907c() {
            this.f54927b.set(null);
            m38905e();
        }

        /* renamed from: d */
        public final void m38906d() {
            Runnable runnable = new Runnable() { // from class: g02
                {
                    UserMetadata.C8376a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserMetadata.C8376a.m38909a(UserMetadata.C8376a.this);
                }
            };
            if (AbstractC17300An1.m69050a(this.f54927b, null, runnable)) {
                UserMetadata.this.f54920b.diskWrite.submit(runnable);
            }
        }

        /* renamed from: e */
        public final void m38905e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f54926a.isMarked()) {
                        map = ((C18306Qh0) this.f54926a.getReference()).m66541a();
                        AtomicMarkableReference atomicMarkableReference = this.f54926a;
                        atomicMarkableReference.set((C18306Qh0) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (map != null) {
                UserMetadata.this.f54919a.m23410r(UserMetadata.this.f54921c, map, this.f54928c);
            }
        }

        /* renamed from: f */
        public boolean m38904f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((C18306Qh0) this.f54926a.getReference()).m66538d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f54926a;
                    atomicMarkableReference.set((C18306Qh0) atomicMarkableReference.getReference(), true);
                    m38906d();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: g */
        public void m38903g(Map map) {
            synchronized (this) {
                ((C18306Qh0) this.f54926a.getReference()).m66537e(map);
                AtomicMarkableReference atomicMarkableReference = this.f54926a;
                atomicMarkableReference.set((C18306Qh0) atomicMarkableReference.getReference(), true);
            }
            m38906d();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.f54921c = str;
        this.f54919a = new C21831qs0(fileStore);
        this.f54920b = crashlyticsWorkers;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38918a(UserMetadata userMetadata) {
        userMetadata.m38910i();
    }

    /* renamed from: b */
    public static /* synthetic */ void m38917b(UserMetadata userMetadata, List list) {
        userMetadata.m38911h(list);
    }

    /* renamed from: c */
    public static /* synthetic */ void m38916c(UserMetadata userMetadata, String str, Map map, List list) {
        userMetadata.m38912g(str, map, list);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        C21831qs0 c21831qs0 = new C21831qs0(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((C18306Qh0) userMetadata.f54922d.f54926a.getReference()).m66537e(c21831qs0.m23419i(str, false));
        ((C18306Qh0) userMetadata.f54923e.f54926a.getReference()).m66537e(c21831qs0.m23419i(str, true));
        userMetadata.f54925g.set(c21831qs0.m23417k(str), false);
        userMetadata.f54924f.updateRolloutAssignmentList(c21831qs0.m23418j(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new C21831qs0(fileStore).m23417k(str);
    }

    /* renamed from: g */
    public final /* synthetic */ void m38912g(String str, Map map, List list) {
        if (getUserId() != null) {
            this.f54919a.m23408t(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.f54919a.m23411q(str, map);
        }
        if (!list.isEmpty()) {
            this.f54919a.m23409s(str, list);
        }
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f54922d.m38908b();
        }
        HashMap hashMap = new HashMap(this.f54922d.m38908b());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m66539c = C18306Qh0.m66539c(entry.getKey(), 1024);
            if (hashMap.size() < 64 || hashMap.containsKey(m66539c)) {
                hashMap.put(m66539c, C18306Qh0.m66539c(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger logger = Logger.getLogger();
            logger.m39132w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Map<String, String> getInternalKeys() {
        return this.f54923e.m38908b();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.f54924f.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return (String) this.f54925g.getReference();
    }

    /* renamed from: h */
    public final /* synthetic */ void m38911h(List list) {
        this.f54919a.m23409s(this.f54921c, list);
    }

    /* renamed from: i */
    public final void m38910i() {
        boolean z;
        String str;
        synchronized (this.f54925g) {
            try {
                z = false;
                if (this.f54925g.isMarked()) {
                    str = getUserId();
                    this.f54925g.set(str, false);
                    z = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            this.f54919a.m23408t(this.f54921c, str);
        }
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f54922d.m38904f(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f54922d.m38903g(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f54923e.m38904f(str, str2);
    }

    public void setNewSession(final String str) {
        synchronized (this.f54921c) {
            this.f54921c = str;
            final Map m38908b = this.f54922d.m38908b();
            final List<RolloutAssignment> rolloutAssignmentList = this.f54924f.getRolloutAssignmentList();
            this.f54920b.diskWrite.submit(new Runnable() { // from class: e02
                {
                    UserMetadata.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserMetadata.m38916c(UserMetadata.this, str, m38908b, rolloutAssignmentList);
                }
            });
        }
    }

    public void setUserId(String str) {
        String m66539c = C18306Qh0.m66539c(str, 1024);
        synchronized (this.f54925g) {
            try {
                if (CommonUtils.nullSafeEquals(m66539c, (String) this.f54925g.getReference())) {
                    return;
                }
                this.f54925g.set(m66539c, true);
                this.f54920b.diskWrite.submit(new Runnable() { // from class: f02
                    {
                        UserMetadata.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserMetadata.m38918a(UserMetadata.this);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.f54924f) {
            try {
                if (!this.f54924f.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<RolloutAssignment> rolloutAssignmentList = this.f54924f.getRolloutAssignmentList();
                this.f54920b.diskWrite.submit(new Runnable() { // from class: d02
                    {
                        UserMetadata.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserMetadata.m38917b(UserMetadata.this, rolloutAssignmentList);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.f54922d.m38908b();
    }
}
