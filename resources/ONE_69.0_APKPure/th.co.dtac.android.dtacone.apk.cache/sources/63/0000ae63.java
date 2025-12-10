package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class FirebaseABTesting {

    /* renamed from: a */
    public final Provider f54548a;

    /* renamed from: b */
    public final String f54549b;

    /* renamed from: c */
    public Integer f54550c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.f54548a = provider;
        this.f54549b = str;
    }

    /* renamed from: c */
    public static List m39286c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.m39296b((Map) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m39288a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ((AnalyticsConnector) this.f54548a.get()).setConditionalUserProperty(conditionalUserProperty);
    }

    /* renamed from: b */
    public final void m39287b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(m39284e());
        int m39281h = m39281h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= m39281h) {
                m39280i(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty m39292f = abtExperimentInfo.m39292f(this.f54549b);
            m39288a(m39292f);
            arrayDeque.offer(m39292f);
        }
    }

    /* renamed from: d */
    public final boolean m39285d(List list, AbtExperimentInfo abtExperimentInfo) {
        String m39295c = abtExperimentInfo.m39295c();
        String m39293e = abtExperimentInfo.m39293e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.m39295c().equals(m39295c) && abtExperimentInfo2.m39293e().equals(m39293e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final List m39284e() {
        return ((AnalyticsConnector) this.f54548a.get()).getConditionalUserProperties(this.f54549b, "");
    }

    /* renamed from: f */
    public final ArrayList m39283f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!m39285d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList m39282g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!m39285d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.m39292f(this.f54549b));
            }
        }
        return arrayList;
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        m39277l();
        List<AnalyticsConnector.ConditionalUserProperty> m39284e = m39284e();
        ArrayList arrayList = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : m39284e) {
            arrayList.add(AbtExperimentInfo.m39297a(conditionalUserProperty));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final int m39281h() {
        if (this.f54550c == null) {
            this.f54550c = Integer.valueOf(((AnalyticsConnector) this.f54548a.get()).getMaxUserProperties(this.f54549b));
        }
        return this.f54550c.intValue();
    }

    /* renamed from: i */
    public final void m39280i(String str) {
        ((AnalyticsConnector) this.f54548a.get()).clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: j */
    public final void m39279j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m39280i(((AnalyticsConnector.ConditionalUserProperty) it.next()).name);
        }
    }

    /* renamed from: k */
    public final void m39278k(List list) {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        m39279j(m39282g(allExperiments, list));
        m39287b(m39283f(list, allExperiments));
    }

    /* renamed from: l */
    public final void m39277l() {
        if (this.f54548a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        m39277l();
        m39279j(m39284e());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        m39277l();
        if (list != null) {
            m39278k(m39286c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        m39277l();
        AbtExperimentInfo.m39290h(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map m39291g = abtExperimentInfo.m39291g();
        m39291g.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.m39296b(m39291g));
        m39287b(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        m39277l();
        m39279j(m39282g(getAllExperiments(), list));
    }
}