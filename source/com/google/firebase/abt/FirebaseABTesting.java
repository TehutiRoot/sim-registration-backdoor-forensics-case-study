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
    public final Provider f54536a;

    /* renamed from: b */
    public final String f54537b;

    /* renamed from: c */
    public Integer f54538c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.f54536a = provider;
        this.f54537b = str;
    }

    /* renamed from: c */
    public static List m39294c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.m39304b((Map) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m39296a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ((AnalyticsConnector) this.f54536a.get()).setConditionalUserProperty(conditionalUserProperty);
    }

    /* renamed from: b */
    public final void m39295b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(m39292e());
        int m39289h = m39289h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= m39289h) {
                m39288i(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty m39300f = abtExperimentInfo.m39300f(this.f54537b);
            m39296a(m39300f);
            arrayDeque.offer(m39300f);
        }
    }

    /* renamed from: d */
    public final boolean m39293d(List list, AbtExperimentInfo abtExperimentInfo) {
        String m39303c = abtExperimentInfo.m39303c();
        String m39301e = abtExperimentInfo.m39301e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.m39303c().equals(m39303c) && abtExperimentInfo2.m39301e().equals(m39301e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final List m39292e() {
        return ((AnalyticsConnector) this.f54536a.get()).getConditionalUserProperties(this.f54537b, "");
    }

    /* renamed from: f */
    public final ArrayList m39291f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!m39293d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList m39290g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!m39293d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.m39300f(this.f54537b));
            }
        }
        return arrayList;
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        m39285l();
        List<AnalyticsConnector.ConditionalUserProperty> m39292e = m39292e();
        ArrayList arrayList = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : m39292e) {
            arrayList.add(AbtExperimentInfo.m39305a(conditionalUserProperty));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final int m39289h() {
        if (this.f54538c == null) {
            this.f54538c = Integer.valueOf(((AnalyticsConnector) this.f54536a.get()).getMaxUserProperties(this.f54537b));
        }
        return this.f54538c.intValue();
    }

    /* renamed from: i */
    public final void m39288i(String str) {
        ((AnalyticsConnector) this.f54536a.get()).clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: j */
    public final void m39287j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m39288i(((AnalyticsConnector.ConditionalUserProperty) it.next()).name);
        }
    }

    /* renamed from: k */
    public final void m39286k(List list) {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        m39287j(m39290g(allExperiments, list));
        m39295b(m39291f(list, allExperiments));
    }

    /* renamed from: l */
    public final void m39285l() {
        if (this.f54536a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        m39285l();
        m39287j(m39292e());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        m39285l();
        if (list != null) {
            m39286k(m39294c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        m39285l();
        AbtExperimentInfo.m39298h(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map m39299g = abtExperimentInfo.m39299g();
        m39299g.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.m39304b(m39299g));
        m39295b(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        m39285l();
        m39287j(m39290g(getAllExperiments(), list));
    }
}
