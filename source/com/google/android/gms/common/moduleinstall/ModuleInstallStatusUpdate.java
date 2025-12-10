package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
/* loaded from: classes3.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    /* renamed from: a */
    public final int f45215a;

    /* renamed from: b */
    public final int f45216b;

    /* renamed from: c */
    public final Long f45217c;

    /* renamed from: d */
    public final Long f45218d;

    /* renamed from: e */
    public final int f45219e;

    /* renamed from: f */
    public final ProgressInfo f45220f;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* loaded from: classes3.dex */
    public static class ProgressInfo {

        /* renamed from: a */
        public final long f45221a;

        /* renamed from: b */
        public final long f45222b;

        public ProgressInfo(long j, long j2) {
            Preconditions.checkNotZero(j2);
            this.f45221a = j;
            this.f45222b = j2;
        }

        public long getBytesDownloaded() {
            return this.f45221a;
        }

        public long getTotalBytesToDownload() {
            return this.f45222b;
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) @InstallState int i2, @Nullable @SafeParcelable.Param(m48388id = 3) Long l, @Nullable @SafeParcelable.Param(m48388id = 4) Long l2, @SafeParcelable.Param(m48388id = 5) int i3) {
        ProgressInfo progressInfo;
        this.f45215a = i;
        this.f45216b = i2;
        this.f45217c = l;
        this.f45218d = l2;
        this.f45219e = i3;
        if (l != null && l2 != null && l2.longValue() != 0) {
            progressInfo = new ProgressInfo(l.longValue(), l2.longValue());
        } else {
            progressInfo = null;
        }
        this.f45220f = progressInfo;
    }

    public int getErrorCode() {
        return this.f45219e;
    }

    @InstallState
    public int getInstallState() {
        return this.f45216b;
    }

    @Nullable
    public ProgressInfo getProgressInfo() {
        return this.f45220f;
    }

    public int getSessionId() {
        return this.f45215a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        SafeParcelWriter.writeLongObject(parcel, 3, this.f45217c, false);
        SafeParcelWriter.writeLongObject(parcel, 4, this.f45218d, false);
        SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
