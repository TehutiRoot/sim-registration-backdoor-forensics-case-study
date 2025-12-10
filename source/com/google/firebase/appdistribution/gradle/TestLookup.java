package com.google.firebase.appdistribution.gradle;

import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.TestLookup;
import com.google.firebase.appdistribution.gradle.models.DeviceExecution;
import com.google.firebase.appdistribution.gradle.models.ReleaseTest;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMShowQrCodeFragment;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0019"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/TestLookup;", "", "Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;", "threadSleeper", "<init>", "(Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;)V", "Lcom/google/firebase/appdistribution/gradle/ApiService;", "apiService", "", "", "releaseTestNames", "", "pollForReleaseTests", "(Lcom/google/firebase/appdistribution/gradle/ApiService;Ljava/util/Collection;)V", "releaseTestName", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lcom/google/firebase/appdistribution/gradle/ApiService;Ljava/lang/String;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "Lorg/gradle/api/logging/Logger;", "logger", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTestLookup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestLookup.kt\ncom/google/firebase/appdistribution/gradle/TestLookup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1734#2,3:104\n*S KotlinDebug\n*F\n+ 1 TestLookup.kt\ncom/google/firebase/appdistribution/gradle/TestLookup\n*L\n60#1:104,3\n*E\n"})
/* loaded from: classes4.dex */
public final class TestLookup {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MAX_POLLING_RETRIES = 40;
    public static final long POLLING_INTERVAL_MS = 30000;

    /* renamed from: a */
    public final ThreadSleeper f54586a;

    /* renamed from: b */
    public final Logger f54587b;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/TestLookup$Companion;", "", "()V", "MAX_POLLING_RETRIES", "", "POLLING_INTERVAL_MS", "", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public TestLookup() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m39257a(Function1 function1, Object obj) {
        return m39255c(function1, obj);
    }

    /* renamed from: c */
    public static final boolean m39255c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b */
    public final boolean m39256b(ApiService apiService, String str) {
        List<DeviceExecution> list;
        String str2;
        try {
            ReleaseTest releaseTest = apiService.getReleaseTest(str);
            if (releaseTest != null) {
                list = releaseTest.getDeviceExecutions();
            } else {
                list = null;
            }
            if (list != null) {
                List<DeviceExecution> deviceExecutions = releaseTest.getDeviceExecutions();
                if (!(deviceExecutions instanceof Collection) || !deviceExecutions.isEmpty()) {
                    for (DeviceExecution deviceExecution : deviceExecutions) {
                        if (!Intrinsics.areEqual(deviceExecution.getState(), "PASSED")) {
                            if (releaseTest.getTestCase() != null) {
                                str2 = "test with test case ID " + NameUtils.INSTANCE.extractResourceId(releaseTest.getTestCase());
                            } else {
                                str2 = "test";
                            }
                            for (DeviceExecution deviceExecution2 : releaseTest.getDeviceExecutions()) {
                                String state = deviceExecution2.getState();
                                if (state != null) {
                                    switch (state.hashCode()) {
                                        case -1942051728:
                                            if (state.equals("PASSED")) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -604548089:
                                            if (state.equals(ESimChangeSIMShowQrCodeFragment.IN_PROGRESS)) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1158651348:
                                            if (state.equals("INCONCLUSIVE")) {
                                                throw new AppDistributionException(AppDistributionException.Reason.GET_TEST_FAILED, null, "Automated " + str2 + " inconclusive for " + deviceExecution2.getDevice() + ": " + deviceExecution2.getInconclusiveReason(), 2, null);
                                            }
                                            break;
                                        case 2066319421:
                                            if (state.equals(Constant.QueryTransactionStatus.FAILED)) {
                                                throw new AppDistributionException(AppDistributionException.Reason.GET_TEST_FAILED, null, "Automated " + str2 + " failed for " + deviceExecution2.getDevice() + ": " + deviceExecution2.getFailedReason(), 2, null);
                                            }
                                            break;
                                    }
                                }
                                throw new AppDistributionException(AppDistributionException.Reason.GET_TEST_FAILED, null, "Unsupported automated " + str2 + " state for " + deviceExecution2.getDevice() + ": " + deviceExecution2.getState(), 2, null);
                            }
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (IOException e) {
            throw new AppDistributionException(AppDistributionException.Reason.GET_TEST_RETRIEVAL_FAILURE, e, null, 4, null);
        } catch (InterruptedException e2) {
            throw new RuntimeException("There was an error while looking up the test results.", e2);
        }
    }

    public final void pollForReleaseTests(@NotNull ApiService apiService, @NotNull Collection<String> releaseTestNames) throws AppDistributionException {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(releaseTestNames, "releaseTestNames");
        Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(releaseTestNames);
        for (int i = 0; i < 41; i++) {
            this.f54586a.sleep(30000L);
            final TestLookup$pollForReleaseTests$1 testLookup$pollForReleaseTests$1 = new TestLookup$pollForReleaseTests$1(this, apiService);
            mutableSet.removeIf(new Predicate() { // from class: BR1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return TestLookup.m39257a(testLookup$pollForReleaseTests$1, obj);
                }
            });
            if (mutableSet.isEmpty()) {
                this.f54587b.info("Automated test(s) passed!");
                return;
            }
            this.f54587b.lifecycle("{} automated test(s) results are pending...", new Object[]{Integer.valueOf(mutableSet.size())});
        }
        throw new AppDistributionException(AppDistributionException.Reason.GET_TEST_TIMEOUT, null, null, 6, null);
    }

    public TestLookup(@NotNull ThreadSleeper threadSleeper) {
        Intrinsics.checkNotNullParameter(threadSleeper, "threadSleeper");
        this.f54586a = threadSleeper;
        this.f54587b = Logging.getLogger(TestLookup.class);
    }

    public /* synthetic */ TestLookup(ThreadSleeper threadSleeper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ThreadSleeper() : threadSleeper);
    }
}
