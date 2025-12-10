package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f36107a = versionedParcel.readInt(audioAttributesImplBase.f36107a, 1);
        audioAttributesImplBase.f36108b = versionedParcel.readInt(audioAttributesImplBase.f36108b, 2);
        audioAttributesImplBase.f36109c = versionedParcel.readInt(audioAttributesImplBase.f36109c, 3);
        audioAttributesImplBase.f36110d = versionedParcel.readInt(audioAttributesImplBase.f36110d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeInt(audioAttributesImplBase.f36107a, 1);
        versionedParcel.writeInt(audioAttributesImplBase.f36108b, 2);
        versionedParcel.writeInt(audioAttributesImplBase.f36109c, 3);
        versionedParcel.writeInt(audioAttributesImplBase.f36110d, 4);
    }
}