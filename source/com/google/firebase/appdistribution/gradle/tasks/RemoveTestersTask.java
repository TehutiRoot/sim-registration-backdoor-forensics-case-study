package com.google.firebase.appdistribution.gradle.tasks;

import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.FirebaseAppDistribution;
import kotlin.Metadata;
import org.gradle.api.tasks.TaskAction;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/tasks/RemoveTestersTask;", "Lcom/google/firebase/appdistribution/gradle/tasks/TesterManagementTask;", "()V", "removeTesters", "", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public abstract class RemoveTestersTask extends TesterManagementTask {
    @TaskAction
    public final void removeTesters() {
        try {
            FirebaseAppDistribution.removeTesters(getOptions());
        } catch (AppDistributionException e) {
            processException(e);
        }
    }
}
