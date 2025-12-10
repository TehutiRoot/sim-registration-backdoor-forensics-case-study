package com.google.firebase.appdistribution.gradle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.gradle.api.Project;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lorg/gradle/api/Project;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class AppDistributionPlugin$apply$2 extends Lambda implements Function1<Project, Unit> {
    final /* synthetic */ AppDistributionPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDistributionPlugin$apply$2(AppDistributionPlugin appDistributionPlugin) {
        super(1);
        this.this$0 = appDistributionPlugin;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Project project) {
        invoke2(project);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Project project) {
        boolean z;
        z = this.this$0.f54569a;
        if (!z) {
            throw new IllegalStateException("firebaseAppDistribution must only be used with Android application projects. Please apply the 'com.android.application' plugin.".toString());
        }
    }
}
