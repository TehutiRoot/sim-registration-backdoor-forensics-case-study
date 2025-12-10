package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\b\u0010\u0011¨\u0006#"}, m29142d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "<init>", "(Ljava/lang/String;IIZ)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;IIZ)Lcom/google/firebase/sessions/ProcessDetails;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getProcessName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getPid", OperatorName.CURVE_TO, "getImportance", "d", "Z", "com.google.firebase-firebase-sessions"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ProcessDetails {

    /* renamed from: a */
    public final String f56548a;

    /* renamed from: b */
    public final int f56549b;

    /* renamed from: c */
    public final int f56550c;

    /* renamed from: d */
    public final boolean f56551d;

    public ProcessDetails(@NotNull String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f56548a = processName;
        this.f56549b = i;
        this.f56550c = i2;
        this.f56551d = z;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processDetails.f56548a;
        }
        if ((i3 & 2) != 0) {
            i = processDetails.f56549b;
        }
        if ((i3 & 4) != 0) {
            i2 = processDetails.f56550c;
        }
        if ((i3 & 8) != 0) {
            z = processDetails.f56551d;
        }
        return processDetails.copy(str, i, i2, z);
    }

    @NotNull
    public final String component1() {
        return this.f56548a;
    }

    public final int component2() {
        return this.f56549b;
    }

    public final int component3() {
        return this.f56550c;
    }

    public final boolean component4() {
        return this.f56551d;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new ProcessDetails(processName, i, i2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessDetails) {
            ProcessDetails processDetails = (ProcessDetails) obj;
            return Intrinsics.areEqual(this.f56548a, processDetails.f56548a) && this.f56549b == processDetails.f56549b && this.f56550c == processDetails.f56550c && this.f56551d == processDetails.f56551d;
        }
        return false;
    }

    public final int getImportance() {
        return this.f56550c;
    }

    public final int getPid() {
        return this.f56549b;
    }

    @NotNull
    public final String getProcessName() {
        return this.f56548a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f56548a.hashCode() * 31) + this.f56549b) * 31) + this.f56550c) * 31;
        boolean z = this.f56551d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isDefaultProcess() {
        return this.f56551d;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.f56548a + ", pid=" + this.f56549b + ", importance=" + this.f56550c + ", isDefaultProcess=" + this.f56551d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}