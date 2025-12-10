package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C2030a();

    /* renamed from: a */
    public final int f8821a;

    /* renamed from: b */
    public final Intent f8822b;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    /* loaded from: classes.dex */
    public class C2030a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, @Nullable Intent intent) {
        this.f8821a = i;
        this.f8822b = intent;
    }

    @NonNull
    public static String resultCodeToString(int i) {
        if (i != -1) {
            if (i != 0) {
                return String.valueOf(i);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Intent getData() {
        return this.f8822b;
    }

    public int getResultCode() {
        return this.f8821a;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + resultCodeToString(this.f8821a) + ", data=" + this.f8822b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f8821a);
        if (this.f8822b == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f8822b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f8821a = parcel.readInt();
        this.f8822b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}