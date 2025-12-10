package androidx.core.p005os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: androidx.core.os.ParcelableCompat */
/* loaded from: classes2.dex */
public final class ParcelableCompat {

    /* renamed from: androidx.core.os.ParcelableCompat$a */
    /* loaded from: classes2.dex */
    public static class C4047a implements Parcelable.ClassLoaderCreator {

        /* renamed from: a */
        public final ParcelableCompatCreatorCallbacks f33956a;

        public C4047a(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks) {
            this.f33956a = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return this.f33956a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return this.f33956a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f33956a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new C4047a(parcelableCompatCreatorCallbacks);
    }
}
