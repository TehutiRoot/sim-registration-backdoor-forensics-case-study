package com.google.firebase.appdistribution.gradle;

import com.android.build.api.variant.ApplicationVariant;
import com.android.build.gradle.AppExtension;
import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import com.google.firebase.appdistribution.gradle.tasks.UploadDistributionTask;
import com.google.firebase.appdistribution.gradle.tasks.UploadDistributionTaskConfigurator;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "appVariant", "Lcom/android/build/api/variant/ApplicationVariant;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAppDistributionPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDistributionPlugin.kt\ncom/google/firebase/appdistribution/gradle/AppDistributionPlugin$setUp$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n230#2,2:126\n1557#2:128\n1628#2,3:129\n774#2:132\n865#2,2:133\n*S KotlinDebug\n*F\n+ 1 AppDistributionPlugin.kt\ncom/google/firebase/appdistribution/gradle/AppDistributionPlugin$setUp$3\n*L\n91#1:126,2\n96#1:128\n96#1:129,3\n99#1:132\n99#1:133,2\n*E\n"})
/* loaded from: classes4.dex */
public final class AppDistributionPlugin$setUp$3 extends Lambda implements Function1<ApplicationVariant, Unit> {
    final /* synthetic */ AppExtension $appExtension;
    final /* synthetic */ Project $project;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "task", "Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.google.firebase.appdistribution.gradle.AppDistributionPlugin$setUp$3$1 */
    /* loaded from: classes4.dex */
    public static final class C83391 extends Lambda implements Function1<UploadDistributionTask, Unit> {
        final /* synthetic */ ApplicationVariant $appVariant;
        final /* synthetic */ AppDistributionExtension $mergedExtension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C83391(ApplicationVariant applicationVariant, AppDistributionExtension appDistributionExtension) {
            super(1);
            this.$appVariant = applicationVariant;
            this.$mergedExtension = appDistributionExtension;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UploadDistributionTask uploadDistributionTask) {
            invoke2(uploadDistributionTask);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(UploadDistributionTask task) {
            Intrinsics.checkNotNullExpressionValue(task, "task");
            ApplicationVariant applicationVariant = this.$appVariant;
            AppDistributionExtension mergedExtension = this.$mergedExtension;
            Intrinsics.checkNotNullExpressionValue(mergedExtension, "mergedExtension");
            UploadDistributionTaskConfigurator.configure(task, applicationVariant, mergedExtension);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDistributionPlugin$setUp$3(Project project, AppExtension appExtension) {
        super(1);
        this.$project = project;
        this.$appExtension = appExtension;
    }

    private static final void invoke$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApplicationVariant applicationVariant) {
        invoke2(applicationVariant);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ApplicationVariant appVariant) {
        String m39265a;
        Intrinsics.checkNotNullParameter(appVariant, "appVariant");
        AppDistributionExtension appDistributionExtension = (AppDistributionExtension) this.$project.getProperties().get(AppDistributionPlugin.EXTENSION_NAME);
        if (appDistributionExtension == null) {
            appDistributionExtension = new AppDistributionExtension();
        }
        for (BuildType buildType : this.$appExtension.getBuildTypes()) {
            if (appVariant.getBuildType() != null && Intrinsics.areEqual(appVariant.getBuildType(), buildType.getName())) {
                List<Pair> productFlavors = appVariant.getProductFlavors();
                ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(productFlavors, 10));
                for (Pair pair : productFlavors) {
                    arrayList.add((String) pair.getSecond());
                }
                Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : this.$appExtension.getProductFlavors()) {
                    if (set.contains(((ProductFlavor) obj).getName())) {
                        arrayList2.add(obj);
                    }
                }
                AppDistributionExtension m39271a = appDistributionExtension.m39271a(buildType, arrayList2);
                TaskContainer tasks = this.$project.getTasks();
                m39265a = AppDistributionPlugin.Companion.m39265a(appVariant);
                tasks.register(m39265a, UploadDistributionTask.class, new C1870a6(new C83391(appVariant, m39271a)));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
