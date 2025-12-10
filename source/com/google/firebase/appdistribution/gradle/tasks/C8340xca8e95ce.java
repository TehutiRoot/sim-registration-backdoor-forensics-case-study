package com.google.firebase.appdistribution.gradle.tasks;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.gradle.api.Task;
import org.gradle.api.file.Directory;
import org.gradle.api.provider.Provider;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0017\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001¢\u0006\u0002\b\u00042\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "Lorg/gradle/api/provider/Provider;", "Lorg/gradle/api/file/Directory;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/Nullable;", "googleServicesTask", "Lorg/gradle/api/Task;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.google.firebase.appdistribution.gradle.tasks.UploadDistributionTaskConfigurator$configureGoogleServicesPluginPath$googleServicesOutputDirectory$1 */
/* loaded from: classes4.dex */
public final class C8340xca8e95ce extends Lambda implements Function1<Task, Provider<? extends Directory>> {
    final /* synthetic */ UploadDistributionTask $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8340xca8e95ce(UploadDistributionTask uploadDistributionTask) {
        super(1);
        this.$task = uploadDistributionTask;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Provider<? extends Directory> invoke(Task task) {
        Object property = task.property("intermediateDir");
        Intrinsics.checkNotNull(property, "null cannot be cast to non-null type java.io.File");
        return this.$task.getProject().getObjects().directoryProperty().fileValue((File) property);
    }
}
