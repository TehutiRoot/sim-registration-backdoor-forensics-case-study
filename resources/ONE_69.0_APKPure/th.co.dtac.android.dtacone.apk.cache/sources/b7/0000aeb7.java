package com.google.firebase.appdistribution.gradle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "releaseTestName", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes4.dex */
public final class TestLookup$pollForReleaseTests$1 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ ApiService $apiService;
    final /* synthetic */ TestLookup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestLookup$pollForReleaseTests$1(TestLookup testLookup, ApiService apiService) {
        super(1);
        this.this$0 = testLookup;
        this.$apiService = apiService;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull String releaseTestName) {
        boolean m39248b;
        Intrinsics.checkNotNullParameter(releaseTestName, "releaseTestName");
        m39248b = this.this$0.m39248b(this.$apiService, releaseTestName);
        return Boolean.valueOf(m39248b);
    }
}