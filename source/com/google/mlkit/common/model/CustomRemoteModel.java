package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes4.dex */
public final class CustomRemoteModel extends RemoteModel {

    /* renamed from: f */
    public final RemoteModelSource f56882f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final RemoteModelSource f56883a;

        public Builder(@NonNull RemoteModelSource remoteModelSource) {
            Preconditions.checkNotNull(remoteModelSource);
            this.f56883a = remoteModelSource;
        }

        @NonNull
        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.f56883a, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CustomRemoteModel(com.google.mlkit.common.model.RemoteModelSource r3, com.google.mlkit.common.model.zza r4) {
        /*
            r2 = this;
            java.lang.String r4 = r3.zza()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Ld
            java.lang.String r4 = "no_model_name"
            goto L11
        Ld:
            java.lang.String r4 = r3.zza()
        L11:
            r0 = 0
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            r2.<init>(r4, r0, r1)
            r2.f56882f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.model.CustomRemoteModel.<init>(com.google.mlkit.common.model.RemoteModelSource, com.google.mlkit.common.model.zza):void");
    }

    @NonNull
    @KeepForSdk
    public RemoteModelSource getRemoteModelSource() {
        return this.f56882f;
    }
}
