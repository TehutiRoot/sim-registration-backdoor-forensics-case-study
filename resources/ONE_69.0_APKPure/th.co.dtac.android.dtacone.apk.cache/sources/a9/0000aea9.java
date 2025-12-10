package com.google.firebase.appdistribution.gradle;

import com.android.build.api.dsl.ProductFlavor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionAware;
import org.gradle.nativeplatform.BuildType;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006¨\u0006\t"}, m29142d2 = {AppDistributionPlugin.EXTENSION_NAME, "", "Lcom/android/build/api/dsl/ProductFlavor;", "action", "Lkotlin/Function1;", "Lcom/google/firebase/appdistribution/gradle/AppDistributionExtension;", "Lkotlin/ExtensionFunctionType;", "Lorg/gradle/api/Project;", "Lorg/gradle/nativeplatform/BuildType;", "appdistribution-gradle"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionAwareKt {
    public static final void firebaseAppDistribution(@NotNull Project project, @NotNull Function1<? super AppDistributionExtension, Unit> action) {
        Intrinsics.checkNotNullParameter(project, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Object byType = ((ExtensionAware) project).getExtensions().getByType(AppDistributionExtension.class);
        Intrinsics.checkNotNullExpressionValue(byType, "this as ExtensionAware).…ionExtension::class.java)");
        action.invoke(byType);
    }

    public static final void firebaseAppDistribution(@NotNull BuildType buildType, @NotNull Function1<? super AppDistributionExtension, Unit> action) {
        Intrinsics.checkNotNullParameter(buildType, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Object byType = ((ExtensionAware) buildType).getExtensions().getByType(AppDistributionExtension.class);
        Intrinsics.checkNotNullExpressionValue(byType, "this as ExtensionAware).…ionExtension::class.java)");
        action.invoke(byType);
    }

    public static final void firebaseAppDistribution(@NotNull ProductFlavor productFlavor, @NotNull Function1<? super AppDistributionExtension, Unit> action) {
        Intrinsics.checkNotNullParameter(productFlavor, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Object byType = ((ExtensionAware) productFlavor).getExtensions().getByType(AppDistributionExtension.class);
        Intrinsics.checkNotNullExpressionValue(byType, "this as ExtensionAware).…ionExtension::class.java)");
        action.invoke(byType);
    }
}