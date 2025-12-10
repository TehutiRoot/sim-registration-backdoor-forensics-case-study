package com.google.firebase.crashlytics.internal.metadata;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class RolloutAssignmentList {

    /* renamed from: a */
    public final List f54929a = new ArrayList();

    /* renamed from: b */
    public final int f54930b;

    public RolloutAssignmentList(int i) {
        this.f54930b = i;
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        List<RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rolloutAssignmentList.size(); i++) {
            arrayList.add(rolloutAssignmentList.get(i).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<RolloutAssignment> getRolloutAssignmentList() {
        return Collections.unmodifiableList(new ArrayList(this.f54929a));
    }

    @CanIgnoreReturnValue
    public synchronized boolean updateRolloutAssignmentList(List<RolloutAssignment> list) {
        this.f54929a.clear();
        if (list.size() > this.f54930b) {
            Logger logger = Logger.getLogger();
            logger.m39124w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f54930b);
            return this.f54929a.addAll(list.subList(0, this.f54930b));
        }
        return this.f54929a.addAll(list);
    }
}