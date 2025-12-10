package com.google.firebase.appdistribution.gradle;

import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.models.uploadstatus.UploadStatusResponse;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/ReleaseLookup;", "", "Lcom/google/firebase/appdistribution/gradle/ApiService;", "apiService", "Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;", "threadSleeper", "", "maxPollingRetries", "<init>", "(Lcom/google/firebase/appdistribution/gradle/ApiService;Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;I)V", "", "operationName", "Lcom/google/firebase/appdistribution/gradle/BinaryType;", "binaryType", "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "pollForRelease$appdistribution_gradle", "(Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/BinaryType;)Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "pollForRelease", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/ApiService;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/ThreadSleeper;", OperatorName.CURVE_TO, "I", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReleaseLookup {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ApiService f54582a;

    /* renamed from: b */
    public final ThreadSleeper f54583b;

    /* renamed from: c */
    public final int f54584c;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/ReleaseLookup$Companion;", "", "()V", "MAX_POLLING_RETRIES", "", "POLLING_INTERVAL", "", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ReleaseLookup(@NotNull ApiService apiService, @NotNull ThreadSleeper threadSleeper, int i) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(threadSleeper, "threadSleeper");
        this.f54582a = apiService;
        this.f54583b = threadSleeper;
        this.f54584c = i;
    }

    @NotNull
    public final UploadStatusResponse pollForRelease$appdistribution_gradle(@NotNull String operationName, @NotNull BinaryType binaryType) {
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(binaryType, "binaryType");
        int i = this.f54584c;
        for (int i2 = 0; i2 < i; i2++) {
            UploadStatusResponse uploadStatus = this.f54582a.getUploadStatus(operationName, binaryType);
            if (!uploadStatus.isDone()) {
                try {
                    this.f54583b.sleep(Long.valueOf((long) CoroutineLiveDataKt.DEFAULT_TIMEOUT));
                } catch (InterruptedException e) {
                    throw new RuntimeException("App Distribution ran into an error while looking up the release", e);
                }
            } else {
                return uploadStatus;
            }
        }
        AppDistributionException.Reason reason = AppDistributionException.Reason.GET_RELEASE_TIMEOUT;
        throw new AppDistributionException(reason, null, "It took longer than expected to process your " + binaryType + ", please try again", 2, null);
    }

    public /* synthetic */ ReleaseLookup(ApiService apiService, ThreadSleeper threadSleeper, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiService, (i2 & 2) != 0 ? new ThreadSleeper() : threadSleeper, (i2 & 4) != 0 ? 60 : i);
    }
}
