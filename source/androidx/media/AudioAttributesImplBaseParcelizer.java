package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f36019a = versionedParcel.readInt(audioAttributesImplBase.f36019a, 1);
        audioAttributesImplBase.f36020b = versionedParcel.readInt(audioAttributesImplBase.f36020b, 2);
        audioAttributesImplBase.f36021c = versionedParcel.readInt(audioAttributesImplBase.f36021c, 3);
        audioAttributesImplBase.f36022d = versionedParcel.readInt(audioAttributesImplBase.f36022d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.setSerializationFlags(false, false);
        versionedParcel.writeInt(audioAttributesImplBase.f36019a, 1);
        versionedParcel.writeInt(audioAttributesImplBase.f36020b, 2);
        versionedParcel.writeInt(audioAttributesImplBase.f36021c, 3);
        versionedParcel.writeInt(audioAttributesImplBase.f36022d, 4);
    }
}
