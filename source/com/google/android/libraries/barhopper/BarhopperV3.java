package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: b */
    public static final String f48931b = "BarhopperV3";

    /* renamed from: a */
    public long f48932a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    /* renamed from: b */
    public static BarhopperProto$BarhopperResponse m45977b(byte[] bArr) {
        bArr.getClass();
        try {
            return BarhopperProto$BarhopperResponse.zzb(bArr, zzdo.zza());
        } catch (zzeo e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f48932a;
        if (j != 0) {
            closeNative(j);
            this.f48932a = 0L;
        }
    }

    public void create() {
        if (this.f48932a != 0) {
            Log.w(f48931b, "Native context already exists.");
            return;
        }
        long createNative = createNative();
        this.f48932a = createNative;
        if (createNative == 0) {
            throw new IllegalStateException("Failed to create native context.");
        }
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, int i3, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j = this.f48932a;
        if (j != 0) {
            return m45977b(recognizeStridedBufferNative(j, i, i2, i3, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public void create(@NonNull BarhopperV3Options barhopperV3Options) {
        if (this.f48932a == 0) {
            try {
                int zzE = barhopperV3Options.zzE();
                byte[] bArr = new byte[zzE];
                zzdj zzA = zzdj.zzA(bArr, 0, zzE);
                barhopperV3Options.zzaa(zzA);
                zzA.zzB();
                long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f48932a = createNativeWithClientOptions;
                if (createNativeWithClientOptions == 0) {
                    throw new IllegalArgumentException("Failed to create native context with client options.");
                }
                return;
            } catch (IOException e) {
                String name = barhopperV3Options.getClass().getName();
                throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
            }
        }
        Log.w(f48931b, "Native context already exists.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, int i3, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j = this.f48932a;
        if (j != 0) {
            return m45977b(recognizeStridedNative(j, i, i2, i3, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j = this.f48932a;
        if (j != 0) {
            return m45977b(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(int i, int i2, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j = this.f48932a;
        if (j != 0) {
            return m45977b(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @NonNull
    public BarhopperProto$BarhopperResponse recognize(@NonNull Bitmap bitmap, @NonNull RecognitionOptions recognitionOptions) {
        if (this.f48932a != 0) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
                bitmap = bitmap.copy(config2, bitmap.isMutable());
            }
            return m45977b(recognizeBitmapNative(this.f48932a, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }
}
