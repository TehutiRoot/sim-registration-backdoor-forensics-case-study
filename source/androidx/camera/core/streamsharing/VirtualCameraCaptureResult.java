package androidx.camera.core.streamsharing;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class VirtualCameraCaptureResult implements CameraCaptureResult {

    /* renamed from: a */
    public final CameraCaptureResult f11480a;

    /* renamed from: b */
    public final TagBundle f11481b;

    /* renamed from: c */
    public final long f11482c;

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, @Nullable CameraCaptureResult cameraCaptureResult) {
        this(cameraCaptureResult, tagBundle, -1L);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeState getAeState() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getAeState();
        }
        return CameraCaptureMetaData.AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfMode getAfMode() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getAfMode();
        }
        return CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfState getAfState() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getAfState();
        }
        return CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbState getAwbState() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getAwbState();
        }
        return CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public /* synthetic */ CaptureResult getCaptureResult() {
        return AbstractC1404Ti.m66182a(this);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.FlashState getFlashState() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getFlashState();
        }
        return CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public TagBundle getTagBundle() {
        return this.f11481b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = this.f11480a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j = this.f11482c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public /* synthetic */ void populateExifData(ExifData.Builder builder) {
        AbstractC1404Ti.m66181b(this, builder);
    }

    public VirtualCameraCaptureResult(@NonNull TagBundle tagBundle, long j) {
        this(null, tagBundle, j);
    }

    public VirtualCameraCaptureResult(CameraCaptureResult cameraCaptureResult, TagBundle tagBundle, long j) {
        this.f11480a = cameraCaptureResult;
        this.f11481b = tagBundle;
        this.f11482c = j;
    }
}
