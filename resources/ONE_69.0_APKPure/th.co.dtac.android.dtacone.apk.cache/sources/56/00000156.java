package p000;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import java.util.UUID;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: BN1 */
/* loaded from: classes.dex */
public class BN1 implements UseCaseConfig.Builder {

    /* renamed from: a */
    public final MutableOptionsBundle f388a;

    public BN1() {
        this(MutableOptionsBundle.create());
    }

    @Override // androidx.camera.core.ExtendableBuilder
    /* renamed from: a */
    public StreamSharing build() {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: b */
    public StreamSharingConfig getUseCaseConfig() {
        return new StreamSharingConfig(OptionsBundle.from(this.f388a));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: c */
    public BN1 setCameraSelector(CameraSelector cameraSelector) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: d */
    public BN1 setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: e */
    public BN1 setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
        getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: f */
    public BN1 setDefaultCaptureConfig(CaptureConfig captureConfig) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: g */
    public BN1 setDefaultSessionConfig(SessionConfig sessionConfig) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public MutableConfig getMutableConfig() {
        return this.f388a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: h */
    public BN1 setHighResolutionDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: i */
    public BN1 setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: j */
    public BN1 setSurfaceOccupancyPriority(int i) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    /* renamed from: k */
    public BN1 setTargetClass(Class cls) {
        getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
        if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
            setTargetName(cls.getCanonicalName() + HelpFormatter.DEFAULT_OPT_PREFIX + UUID.randomUUID());
        }
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    /* renamed from: l */
    public BN1 setTargetName(String str) {
        getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
        return this;
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
    /* renamed from: m */
    public BN1 setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: n */
    public BN1 setZslDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    public BN1(MutableOptionsBundle mutableOptionsBundle) {
        this.f388a = mutableOptionsBundle;
        Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
        if (cls != null && !cls.equals(StreamSharing.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        setTargetClass(StreamSharing.class);
    }
}