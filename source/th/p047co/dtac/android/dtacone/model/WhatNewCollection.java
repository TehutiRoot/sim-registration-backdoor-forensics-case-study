package th.p047co.dtac.android.dtacone.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.WhatNewCollection */
/* loaded from: classes8.dex */
public class WhatNewCollection {
    @SerializedName("android")

    /* renamed from: android  reason: collision with root package name */
    public Android f109516android;
    @SerializedName("ios")
    public IOS ios;

    /* renamed from: th.co.dtac.android.dtacone.model.WhatNewCollection$Android */
    /* loaded from: classes8.dex */
    public static class Android implements Parcelable {
        public static final Parcelable.Creator<Android> CREATOR = new C14233a();
        @SerializedName("bannerUrl")
        private String bannerUrl;
        @SerializedName("latestBuild")
        private int latestBuild;
        @SerializedName("minBuild")
        private int minBuild;

        /* renamed from: th.co.dtac.android.dtacone.model.WhatNewCollection$Android$a */
        /* loaded from: classes8.dex */
        public class C14233a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Android createFromParcel(Parcel parcel) {
                return new Android(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Android[] newArray(int i) {
                return new Android[i];
            }
        }

        public Android() {
        }

        public boolean alreadyVersion() {
            if (297 >= this.latestBuild) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getBannerUrl() {
            return this.bannerUrl;
        }

        public int getLatestBuild() {
            return this.latestBuild;
        }

        public int getMinBuild() {
            return this.minBuild;
        }

        public boolean isForceUpdate() {
            if (297 < this.minBuild) {
                return true;
            }
            return false;
        }

        public void setLatestBuild(int i) {
            this.latestBuild = i;
        }

        public void setMinBuild(int i) {
            this.minBuild = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.minBuild);
            parcel.writeString(this.bannerUrl);
            parcel.writeInt(this.latestBuild);
        }

        public Android(Parcel parcel) {
            this.minBuild = parcel.readInt();
            this.bannerUrl = parcel.readString();
            this.latestBuild = parcel.readInt();
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.model.WhatNewCollection$IOS */
    /* loaded from: classes8.dex */
    public static class IOS implements Parcelable {
        public static final Parcelable.Creator<IOS> CREATOR = new C14234a();
        @SerializedName("bannerUrl")
        private String bannerUrl;
        @SerializedName("latestBuild")
        private int latestBuild;
        @SerializedName("minBuild")
        private int minBuild;

        /* renamed from: th.co.dtac.android.dtacone.model.WhatNewCollection$IOS$a */
        /* loaded from: classes8.dex */
        public class C14234a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public IOS createFromParcel(Parcel parcel) {
                return new IOS(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public IOS[] newArray(int i) {
                return new IOS[i];
            }
        }

        public IOS() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getBannerUrl() {
            return this.bannerUrl;
        }

        public int getMinBuild() {
            return this.minBuild;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.minBuild);
            parcel.writeString(this.bannerUrl);
            parcel.writeInt(this.latestBuild);
        }

        public IOS(Parcel parcel) {
            this.minBuild = parcel.readInt();
            this.bannerUrl = parcel.readString();
            this.latestBuild = parcel.readInt();
        }
    }

    public Android getAndroid() {
        return this.f109516android;
    }

    public IOS getIos() {
        return this.ios;
    }
}
