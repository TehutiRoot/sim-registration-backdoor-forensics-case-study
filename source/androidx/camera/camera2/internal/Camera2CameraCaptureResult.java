package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Camera2CameraCaptureResult implements CameraCaptureResult {

    /* renamed from: a */
    public final TagBundle f10259a;

    /* renamed from: b */
    public final CaptureResult f10260b;

    public Camera2CameraCaptureResult(@NonNull TagBundle tagBundle, @NonNull CaptureResult captureResult) {
        this.f10259a = tagBundle;
        this.f10260b = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeState getAeState() {
        Integer num = (Integer) this.f10260b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                Logger.m63228e("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return CameraCaptureMetaData.AeState.UNKNOWN;
                            }
                        } else {
                            return CameraCaptureMetaData.AeState.FLASH_REQUIRED;
                        }
                    } else {
                        return CameraCaptureMetaData.AeState.LOCKED;
                    }
                } else {
                    return CameraCaptureMetaData.AeState.CONVERGED;
                }
            }
            return CameraCaptureMetaData.AeState.SEARCHING;
        }
        return CameraCaptureMetaData.AeState.INACTIVE;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfMode getAfMode() {
        Integer num = (Integer) this.f10260b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1 && intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    if (intValue != 5) {
                        Logger.m63228e("C2CameraCaptureResult", "Undefined af mode: " + num);
                        return CameraCaptureMetaData.AfMode.UNKNOWN;
                    }
                } else {
                    return CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
                }
            } else {
                return CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
        }
        return CameraCaptureMetaData.AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfState getAfState() {
        Integer num = (Integer) this.f10260b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return CameraCaptureMetaData.AfState.INACTIVE;
            case 1:
            case 3:
                return CameraCaptureMetaData.AfState.SCANNING;
            case 2:
                return CameraCaptureMetaData.AfState.PASSIVE_FOCUSED;
            case 4:
                return CameraCaptureMetaData.AfState.LOCKED_FOCUSED;
            case 5:
                return CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED;
            default:
                Logger.m63228e("C2CameraCaptureResult", "Undefined af state: " + num);
                return CameraCaptureMetaData.AfState.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbState getAwbState() {
        Integer num = (Integer) this.f10260b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        Logger.m63228e("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return CameraCaptureMetaData.AwbState.UNKNOWN;
                    }
                    return CameraCaptureMetaData.AwbState.LOCKED;
                }
                return CameraCaptureMetaData.AwbState.CONVERGED;
            }
            return CameraCaptureMetaData.AwbState.METERING;
        }
        return CameraCaptureMetaData.AwbState.INACTIVE;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CaptureResult getCaptureResult() {
        return this.f10260b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.FlashState getFlashState() {
        Integer num = (Integer) this.f10260b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    Logger.m63228e("C2CameraCaptureResult", "Undefined flash state: " + num);
                    return CameraCaptureMetaData.FlashState.UNKNOWN;
                }
                return CameraCaptureMetaData.FlashState.FIRED;
            }
            return CameraCaptureMetaData.FlashState.READY;
        }
        return CameraCaptureMetaData.FlashState.NONE;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public TagBundle getTagBundle() {
        return this.f10259a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        Long l = (Long) this.f10260b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(@NonNull ExifData.Builder builder) {
        CaptureResult.Key key;
        AbstractC1404Ti.m66181b(this, builder);
        Rect rect = (Rect) this.f10260b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            builder.setImageWidth(rect.width()).setImageHeight(rect.height());
        }
        try {
            Integer num = (Integer) this.f10260b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Logger.m63223w("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) this.f10260b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            builder.setExposureTimeNanos(l.longValue());
        }
        Float f = (Float) this.f10260b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            builder.setLensFNumber(f.floatValue());
        }
        Integer num2 = (Integer) this.f10260b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                CaptureResult captureResult = this.f10260b;
                key = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
                Integer num3 = (Integer) captureResult.get(key);
                if (num3 != null) {
                    num2 = Integer.valueOf(num2.intValue() * ((int) (num3.intValue() / 100.0f)));
                }
            }
            builder.setIso(num2.intValue());
        }
        Float f2 = (Float) this.f10260b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            builder.setFocalLength(f2.floatValue());
        }
        Integer num4 = (Integer) this.f10260b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num4.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }

    public Camera2CameraCaptureResult(@NonNull CaptureResult captureResult) {
        this(TagBundle.emptyBundle(), captureResult);
    }
}
