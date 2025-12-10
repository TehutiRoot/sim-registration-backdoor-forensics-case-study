package com.google.firebase.appdistribution.gradle;

import com.android.build.gradle.internal.dsl.BuildType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "buildType", "Lcom/android/build/gradle/internal/dsl/BuildType;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class AppDistributionPlugin$setUp$1 extends Lambda implements Function1<BuildType, Unit> {
    public static final AppDistributionPlugin$setUp$1 INSTANCE = new AppDistributionPlugin$setUp$1();

    public AppDistributionPlugin$setUp$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuildType buildType) {
        invoke2(buildType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuildType buildType) {
        AbstractC1398Tc.m66191a(buildType).add(AppDistributionPlugin.EXTENSION_NAME, AppDistributionExtension.class);
    }
}
