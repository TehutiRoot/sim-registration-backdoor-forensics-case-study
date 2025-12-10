package com.google.firebase.appdistribution.gradle;

import com.android.build.gradle.internal.dsl.ProductFlavor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "flavor", "Lcom/android/build/gradle/internal/dsl/ProductFlavor;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class AppDistributionPlugin$setUp$2 extends Lambda implements Function1<ProductFlavor, Unit> {
    public static final AppDistributionPlugin$setUp$2 INSTANCE = new AppDistributionPlugin$setUp$2();

    public AppDistributionPlugin$setUp$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductFlavor productFlavor) {
        invoke2(productFlavor);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ProductFlavor productFlavor) {
        AbstractC1398Tc.m66190b(productFlavor).add(AppDistributionPlugin.EXTENSION_NAME, AppDistributionExtension.class);
    }
}
