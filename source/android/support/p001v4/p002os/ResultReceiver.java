package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p001v4.p002os.IResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C2006a();

    /* renamed from: a */
    public final boolean f8632a;

    /* renamed from: b */
    public final Handler f8633b;

    /* renamed from: c */
    public IResultReceiver f8634c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    public class C2006a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    public class BinderC2007b extends IResultReceiver.Stub {
        public BinderC2007b() {
        }

        @Override // android.support.p001v4.p002os.IResultReceiver
        public void send(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f8633b;
            if (handler != null) {
                handler.post(new RunnableC2008c(i, bundle));
            } else {
                resultReceiver.onReceiveResult(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    public class RunnableC2008c implements Runnable {

        /* renamed from: a */
        public final int f8636a;

        /* renamed from: b */
        public final Bundle f8637b;

        public RunnableC2008c(int i, Bundle bundle) {
            this.f8636a = i;
            this.f8637b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.onReceiveResult(this.f8636a, this.f8637b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f8632a = true;
        this.f8633b = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.f8632a) {
            Handler handler = this.f8633b;
            if (handler != null) {
                handler.post(new RunnableC2008c(i, bundle));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.f8634c;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f8634c == null) {
                    this.f8634c = new BinderC2007b();
                }
                parcel.writeStrongBinder(this.f8634c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f8632a = false;
        this.f8633b = null;
        this.f8634c = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
