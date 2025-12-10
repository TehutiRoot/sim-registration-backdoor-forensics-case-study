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

/* renamed from: EM1 */
/* loaded from: classes.dex */
public class EM1 implements UseCaseConfig.Builder {

    /* renamed from: a */
    public final MutableOptionsBundle f1281a;

    public EM1() {
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
        return new StreamSharingConfig(OptionsBundle.from(this.f1281a));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: c */
    public EM1 setCameraSelector(CameraSelector cameraSelector) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: d */
    public EM1 setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: e */
    public EM1 setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
        getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: f */
    public EM1 setDefaultCaptureConfig(CaptureConfig captureConfig) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: g */
    public EM1 setDefaultSessionConfig(SessionConfig sessionConfig) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public MutableConfig getMutableConfig() {
        return this.f1281a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: h */
    public EM1 setHighResolutionDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: i */
    public EM1 setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: j */
    public EM1 setSurfaceOccupancyPriority(int i) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    /* renamed from: k */
    public EM1 setTargetClass(Class cls) {
        getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
        if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
            setTargetName(cls.getCanonicalName() + HelpFormatter.DEFAULT_OPT_PREFIX + UUID.randomUUID());
        }
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    /* renamed from: l */
    public EM1 setTargetName(String str) {
        getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
        return this;
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
    /* renamed from: m */
    public EM1 setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    /* renamed from: n */
    public EM1 setZslDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    public EM1(MutableOptionsBundle mutableOptionsBundle) {
        this.f1281a = mutableOptionsBundle;
        Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
        if (cls != null && !cls.equals(StreamSharing.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        setTargetClass(StreamSharing.class);
    }
}
