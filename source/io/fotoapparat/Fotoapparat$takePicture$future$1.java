package io.fotoapparat;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.result.Photo;
import io.fotoapparat.routine.photo.TakePhotoRoutineKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class Fotoapparat$takePicture$future$1 extends FunctionReferenceImpl implements Function0<Photo> {
    public Fotoapparat$takePicture$future$1(Object obj) {
        super(0, obj, TakePhotoRoutineKt.class, "takePhoto", "takePhoto(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/result/Photo;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Photo invoke() {
        return TakePhotoRoutineKt.takePhoto((Device) this.receiver);
    }
}
