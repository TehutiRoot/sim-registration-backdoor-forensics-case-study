package th.p047co.dtac.android.dtacone.app_one.util.p048enum;

import android.os.Parcel;
import android.os.Parcelable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", PDLayoutAttributeObject.LINE_HEIGHT_NORMAL, "PhoneOnlyOne", "Phone", "PhoneMultiple", "RtrCodeOnlyOne", "RtrCodeMultiple", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.enum.RegistrationType */
/* loaded from: classes7.dex */
public enum RegistrationType implements Parcelable {
    Normal,
    PhoneOnlyOne,
    Phone,
    PhoneMultiple,
    RtrCodeOnlyOne,
    RtrCodeMultiple;
    
    @NotNull
    public static final Parcelable.Creator<RegistrationType> CREATOR = new Parcelable.Creator<RegistrationType>() { // from class: th.co.dtac.android.dtacone.app_one.util.enum.RegistrationType.Creator
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RegistrationType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return RegistrationType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RegistrationType[] newArray(int i) {
            return new RegistrationType[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}